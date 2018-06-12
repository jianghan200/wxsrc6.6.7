package com.tencent.mm.pluginsdk.model.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.Bundle;
import com.tencent.mm.a.g;
import com.tencent.mm.plugin.ac.a.a;
import com.tencent.mm.plugin.ac.a.a.a;
import com.tencent.mm.plugin.comm.a.h;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class p
{
  public static String B(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() == 0))
    {
      x.e("MicroMsg.AppUtil", "buildRedirectUrl fail, invalid arguments");
      return null;
    }
    int i = paramString1.indexOf("#");
    String str1;
    if (i >= 0)
    {
      str1 = paramString1.substring(i);
      paramString1 = paramString1.substring(0, i);
    }
    for (;;)
    {
      i = paramString1.indexOf("?");
      String str3 = "";
      String str2 = paramString1;
      if (i >= 0)
      {
        str3 = paramString1.substring(i + 1);
        str2 = paramString1.substring(0, i);
      }
      x.v("MicroMsg.AppUtil", "buildRedirectUrl, sharpStr = %s, paramStr = %s, srcUrl = %s", new Object[] { str1, str3, str2 });
      LinkedHashMap localLinkedHashMap = new LinkedHashMap();
      if (!bi.oW(str3))
      {
        String[] arrayOfString = str3.split("&");
        if ((arrayOfString != null) && (arrayOfString.length > 0))
        {
          int j = arrayOfString.length;
          i = 0;
          if (i < j)
          {
            String str4 = arrayOfString[i];
            if (!bi.oW(str4))
            {
              int k = str4.indexOf("=");
              x.v("MicroMsg.AppUtil", "buildRedirectUrl, equalIdx = %d", new Object[] { Integer.valueOf(k) });
              if (k < 0) {
                break label241;
              }
              paramString1 = str4.substring(0, k + 1);
              str3 = str4.substring(k + 1);
            }
            for (;;)
            {
              localLinkedHashMap.put(paramString1, str3);
              i += 1;
              break;
              label241:
              str3 = "";
              paramString1 = str4;
            }
          }
        }
      }
      paramString1 = paramString2;
      if (paramString2 == null) {
        paramString1 = "";
      }
      localLinkedHashMap.put("from=", paramString1);
      x.v("MicroMsg.AppUtil", "buildRedirectUrl, pMap size = %d", new Object[] { Integer.valueOf(localLinkedHashMap.size()) });
      paramString1 = new StringBuilder();
      paramString2 = localLinkedHashMap.keySet().iterator();
      while (paramString2.hasNext())
      {
        str3 = (String)paramString2.next();
        if (paramString1.length() > 0) {
          paramString1.append("&");
        }
        paramString1.append(str3);
        paramString1.append((String)localLinkedHashMap.get(str3));
      }
      paramString1 = paramString1.toString();
      paramString2 = str2 + "?" + paramString1;
      paramString1 = paramString2;
      if (!bi.oW(str1)) {
        paramString1 = paramString2 + str1;
      }
      x.v("MicroMsg.AppUtil", "buildRedirectUrl, ret url = %s", new Object[] { paramString1 });
      return paramString1;
      str1 = "";
    }
  }
  
  public static String Ta(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      x.e("MicroMsg.AppUtil", "getDbSignature, svrSign is null");
      return null;
    }
    return Tb(paramString);
  }
  
  public static String Tb(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(paramString.toLowerCase());
    localStringBuffer.append("mMHc ItnStR");
    return g.u(localStringBuffer.toString().getBytes());
  }
  
  public static void Tc(String paramString)
  {
    if (bi.oW(paramString)) {
      x.e("MicroMsg.AppUtil", "appid is null");
    }
    SharedPreferences localSharedPreferences;
    do
    {
      return;
      localSharedPreferences = ad.chZ();
    } while (localSharedPreferences == null);
    String str = localSharedPreferences.getString("key_app_ids_registion_while_not_login", "");
    if (str.contains(paramString))
    {
      x.i("MicroMsg.AppUtil", "this app has been saved : %s in %s", new Object[] { paramString, str });
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append("|");
    localStringBuilder.append(str);
    paramString = localStringBuilder.toString();
    localSharedPreferences.edit().putString("key_app_ids_registion_while_not_login", paramString).commit();
  }
  
  public static void ae(Bundle paramBundle)
  {
    paramBundle.putString("wx_token_key", "com.tencent.mm.openapi.token");
  }
  
  public static void af(Bundle paramBundle)
  {
    paramBundle.putString("platformId", "wechat");
  }
  
  public static boolean b(Context paramContext, f paramf)
  {
    x.i("MicroMsg.AppUtil", "check the signature of the Application.");
    if (paramContext == null)
    {
      x.e("MicroMsg.AppUtil", "context is null.");
      return true;
    }
    if (paramf == null)
    {
      x.e("MicroMsg.AppUtil", "appInfo is null.");
      return true;
    }
    if (bi.oW(paramf.field_packageName))
    {
      x.e("MicroMsg.AppUtil", "packageName is null.");
      return true;
    }
    if (bi.oW(paramf.field_signature))
    {
      x.e("MicroMsg.AppUtil", "app.field_signature is null. app.field_packageName is %s", new Object[] { paramf.field_packageName });
      return true;
    }
    paramContext = bh(paramContext, paramf.field_packageName);
    if ((paramContext == null) || (paramContext.length == 0))
    {
      x.e("MicroMsg.AppUtil", "apk signatures is null");
      return false;
    }
    int j = paramContext.length;
    int i = 0;
    while (i < j)
    {
      String str = Tb(g.u(paramContext[i].toByteArray()));
      if (paramf.field_signature.equals(str))
      {
        x.i("MicroMsg.AppUtil", "app_name : %s ,signature : %s", new Object[] { paramf.field_appName, paramf.field_signature });
        return true;
      }
      i += 1;
    }
    x.w("MicroMsg.AppUtil", "signature is diff.(app_name:%s)", new Object[] { paramf.field_appName });
    return false;
  }
  
  public static String bg(Context paramContext, String paramString)
  {
    paramContext = bh(paramContext, paramString);
    if ((paramContext == null) || (paramContext.length == 0))
    {
      x.e("MicroMsg.AppUtil", "signs is null");
      return null;
    }
    return Tb(g.u(paramContext[0].toByteArray()));
  }
  
  public static Signature[] bh(Context paramContext, String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      x.e("MicroMsg.AppUtil", "getSignature, packageName is null");
      return null;
    }
    paramContext = paramContext.getPackageManager();
    try
    {
      paramContext = paramContext.getPackageInfo(paramString, 64);
      if (paramContext == null)
      {
        x.e("MicroMsg.AppUtil", "info is null, packageName = " + paramString);
        return null;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      x.e("MicroMsg.AppUtil", "NameNotFoundException");
      return null;
    }
    return paramContext.signatures;
  }
  
  public static boolean c(Context paramContext, f paramf, String paramString)
  {
    a locala = a.a.bmm();
    if ((paramString == null) || (paramString.length() == 0))
    {
      x.e("MicroMsg.AppUtil", "isAppValid, packageName is null");
      locala.c(paramf);
      return false;
    }
    if (paramf == null)
    {
      x.i("MicroMsg.AppUtil", "app does not exist");
      return true;
    }
    if ((paramf.field_packageName == null) || (paramf.field_packageName.length() == 0))
    {
      x.e("MicroMsg.AppUtil", "isAppValid fail, local packageName is null");
      locala.c(paramf);
      return false;
    }
    if ((paramf.field_signature == null) || (paramf.field_signature.length() == 0))
    {
      x.e("MicroMsg.AppUtil", "isAppValid fail, local signature is null");
      locala.c(paramf);
      return false;
    }
    paramContext = bh(paramContext, paramString);
    if ((paramContext == null) || (paramContext.length == 0))
    {
      x.e("MicroMsg.AppUtil", "isAppValid, apk signatures is null");
      locala.c(paramf);
      return false;
    }
    if (!paramf.field_packageName.equals(paramString))
    {
      x.e("MicroMsg.AppUtil", "isAppValid, packageName is diff, src:%s,local:%s", new Object[] { paramf.field_packageName, paramString });
      locala.c(paramf);
      return false;
    }
    x.i("MicroMsg.AppUtil", "server signatures:%s", new Object[] { paramf.field_signature });
    int j = paramContext.length;
    int i = 0;
    while (i < j)
    {
      paramString = Tb(g.u(paramContext[i].toByteArray()));
      x.i("MicroMsg.AppUtil", "local signatures:%s", new Object[] { paramString });
      if ((paramf.field_signature != null) && (paramf.field_signature.equals(paramString)))
      {
        locala.d(paramf);
        return true;
      }
      i += 1;
    }
    x.w("MicroMsg.AppUtil", "isAppValid, signature is diff");
    locala.c(paramf);
    return false;
  }
  
  public static void cbS()
  {
    aq.qBc = null;
    aq.qBd = -1L;
  }
  
  public static void g(Bundle paramBundle, String paramString)
  {
    paramBundle.putString("platformId", "wechat");
    if (!bi.oW(paramString)) {
      paramBundle.putString("launchParam", paramString);
    }
  }
  
  public static PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      x.e("MicroMsg.AppUtil", "getPackageInfo, packageName is null");
      return null;
    }
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      x.w("MicroMsg.AppUtil", "app not installed, packageName = " + paramString);
    }
    return null;
  }
  
  public static String h(Context paramContext, String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() == 0) || (paramString2 == null) || (paramString2.length() == 0))
    {
      x.e("MicroMsg.AppUtil", "buildSourceUrl fail, invalid arguments");
      return null;
    }
    String str2 = w.d(paramContext.getSharedPreferences(ad.chY(), 0));
    String str1;
    if ((str2 == null) || (str2.length() == 0)) {
      str1 = "zh_CN";
    }
    for (;;)
    {
      return paramContext.getString(a.h.openapi_source_url, new Object[] { paramString1, Integer.valueOf(d.qVN), str1, d.DEVICE_TYPE, paramString2 });
      str1 = str2;
      if (str2.equals("en")) {
        str1 = "en_US";
      }
    }
  }
  
  public static boolean r(Context paramContext, String paramString)
  {
    return getPackageInfo(paramContext, paramString) != null;
  }
  
  public static String y(Context paramContext, String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() == 0) || (paramString2.length() == 0))
    {
      x.e("MicroMsg.AppUtil", "buildUnistallUrl fail, invalid arguments");
      return null;
    }
    String str2 = w.d(paramContext.getSharedPreferences(ad.chY(), 0));
    String str1;
    if ((str2 == null) || (str2.length() == 0)) {
      str1 = "zh_CN";
    }
    for (;;)
    {
      return paramContext.getString(a.h.openapi_uninstall_url, new Object[] { paramString1, Integer.valueOf(d.qVN), str1, d.DEVICE_TYPE, paramString2, Integer.valueOf(0) });
      str1 = str2;
      if (str2.equals("en")) {
        str1 = "en_US";
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */