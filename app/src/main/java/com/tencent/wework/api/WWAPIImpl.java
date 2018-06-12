package com.tencent.wework.api;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import com.tencent.wework.api.model.BaseMessage;
import com.tencent.wework.api.utils.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

public final class WWAPIImpl
  implements IWWAPI
{
  private static final String[] vzD = { "com.tencent.wework", "com.tencent.weworklocal" };
  private Context context;
  private Map<String, Object> nmm = new HashMap();
  private String vzE;
  private BroadcastReceiver vzF = new WWAPIImpl.1(this);
  
  public WWAPIImpl(Context paramContext)
  {
    this.context = paramContext;
  }
  
  private String adt(String paramString)
  {
    try
    {
      String str = bU(this.context.getPackageManager().getPackageInfo(paramString, 64).signatures[0].toByteArray());
      return str;
    }
    catch (Throwable localThrowable)
    {
      Log.w("WWAPIImpl", "getSignature failed, pkg: " + paramString, localThrowable);
    }
    return "";
  }
  
  private int adu(String paramString)
  {
    try
    {
      PackageInfo localPackageInfo = this.context.getPackageManager().getPackageInfo(paramString, 128);
      if (localPackageInfo == null) {
        return 0;
      }
      int i = localPackageInfo.versionCode;
      return i;
    }
    catch (Throwable localThrowable)
    {
      Log.w("WWAPIImpl", "getVersioncode failed, pkg: " + paramString, localThrowable);
    }
    return 0;
  }
  
  private static String bU(byte[] paramArrayOfByte)
  {
    try
    {
      Object localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).reset();
      ((MessageDigest)localObject).update(paramArrayOfByte);
      paramArrayOfByte = ((MessageDigest)localObject).digest();
      localObject = new StringBuilder(paramArrayOfByte.length * 2);
      int j = paramArrayOfByte.length;
      int i = 0;
      while (i < j)
      {
        int k = paramArrayOfByte[i];
        ((StringBuilder)localObject).append(Integer.toHexString((k & 0xF0) >>> 4));
        ((StringBuilder)localObject).append(Integer.toHexString(k & 0xF));
        i += 1;
      }
      paramArrayOfByte = ((StringBuilder)localObject).toString().toUpperCase();
      return paramArrayOfByte;
    }
    catch (NoSuchAlgorithmException paramArrayOfByte) {}
    return "";
  }
  
  public final boolean a(BaseMessage paramBaseMessage)
  {
    boolean bool2 = false;
    String[] arrayOfString = vzD;
    int j = arrayOfString.length;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      String str;
      Object localObject;
      if (i < j)
      {
        str = arrayOfString[i];
        localObject = adt(str);
        Log.d("WWAPIImpl", "isValidSignature, pkg: " + str + ", signature: " + (String)localObject);
        if ("011A40266C8C75D181DDD8E4DDC50075".equals(localObject))
        {
          localObject = new Intent("com.tencent.wework.apihost");
          ((Intent)localObject).setClassName(str, "com.tencent.wework.apihost.WWAPIActivity");
          ((Intent)localObject).addFlags(411041792);
        }
      }
      else
      {
        try
        {
          paramBaseMessage.setContext(this.context);
          ((Intent)localObject).putExtras(BaseMessage.b(paramBaseMessage));
          ((Intent)localObject).putExtra("PendingIntent", PendingIntent.getBroadcast(this.context, 0, new Intent(this.context, this.vzF.getClass()), 134217728));
          this.context.startActivity((Intent)localObject);
          Log.i("WWAPIImpl", "sendMessage, start WWAPIActivity, pkg: " + str);
          bool1 = true;
          return bool1;
        }
        catch (Throwable localThrowable)
        {
          Log.w("WWAPIImpl", "sendMessage failed, pkg: " + str, localThrowable);
        }
      }
      i += 1;
    }
  }
  
  public final boolean cIf()
  {
    boolean bool = false;
    String[] arrayOfString = vzD;
    int k = arrayOfString.length;
    int i = 0;
    int j;
    if (i < k)
    {
      String str = arrayOfString[i];
      j = adu(str);
      if (j != 0) {
        Log.i("WWAPIImpl", "getWWAppSupportAPI, pkg: " + str + ", versioncode: " + j);
      }
    }
    for (i = j;; i = 0)
    {
      if (i >= 100) {
        bool = true;
      }
      return bool;
      i += 1;
      break;
    }
  }
  
  public final String cIg()
  {
    String[] arrayOfString = vzD;
    int j = arrayOfString.length;
    int i = 0;
    while (i < j)
    {
      Object localObject1 = arrayOfString[i];
      try
      {
        Object localObject2 = this.context.getPackageManager();
        localObject2 = ((PackageManager)localObject2).getApplicationLabel(((PackageManager)localObject2).getApplicationInfo((String)localObject1, 0)).toString();
        localObject1 = localObject2;
        if (TextUtils.isEmpty((CharSequence)localObject2)) {
          localObject1 = "企业微信";
        }
        return (String)localObject1;
      }
      catch (Throwable localThrowable)
      {
        Log.w("WWAPIImpl", "getWWAppName failed", localThrowable);
        i += 1;
      }
    }
    return "企业微信";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/wework/api/WWAPIImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */