package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Process;
import android.telephony.TelephonyManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class t
{
  public static String a = "TencentMapSDK";
  private static String b;
  private static String c;
  private static String d;
  private static String e;
  private static String f;
  private static String g;
  private static String h;
  
  public static String a()
  {
    return b;
  }
  
  private static String a(String paramString)
  {
    if (paramString == null) {
      return "";
    }
    return paramString.replace("&", "").replace("#", "").replace("?", "");
  }
  
  public static void a(Context paramContext)
  {
    String str;
    if (b == null)
    {
      str = b(paramContext);
      b = str;
      b = a(str);
    }
    if (c == null)
    {
      str = c(paramContext);
      c = str;
      c = a(str);
    }
    if (d == null)
    {
      str = Build.MODEL;
      d = str;
      d = a(str);
    }
    if (e == null) {
      e = Build.VERSION.RELEASE;
    }
    if (f == null)
    {
      str = d(paramContext);
      f = str;
      f = a(str);
    }
    if (g == null)
    {
      str = paramContext.getPackageName();
      g = str;
      g = a(str);
    }
    if (h == null)
    {
      paramContext = e(paramContext);
      h = paramContext;
      h = a(paramContext);
    }
  }
  
  public static String b()
  {
    return c;
  }
  
  private static String b(Context paramContext)
  {
    Object localObject;
    if (Build.VERSION.SDK_INT < 21)
    {
      localObject = "armeabi-v7a";
      return (String)localObject;
    }
    if ((Build.VERSION.SDK_INT >= 21) && (Build.VERSION.SDK_INT < 23)) {
      for (paramContext = paramContext.getClassLoader();; paramContext = Build.SUPPORTED_32_BIT_ABIS[0])
      {
        try
        {
          paramContext = ClassLoader.class.getDeclaredMethod("findLibrary", new Class[] { String.class }).invoke(paramContext, new Object[] { "art" });
          if (paramContext == null) {
            break label129;
          }
          if (!((String)paramContext).contains("lib64")) {
            continue;
          }
          paramContext = Build.SUPPORTED_64_BIT_ABIS[0];
        }
        catch (NoSuchMethodException paramContext)
        {
          for (;;)
          {
            paramContext = "";
          }
        }
        catch (IllegalAccessException paramContext)
        {
          for (;;)
          {
            paramContext = "";
          }
        }
        catch (InvocationTargetException paramContext)
        {
          for (;;)
          {
            paramContext = "";
          }
        }
        catch (NullPointerException paramContext)
        {
          for (;;)
          {
            paramContext = "";
          }
        }
        localObject = paramContext;
        if (paramContext != null) {
          break;
        }
        return Build.SUPPORTED_ABIS[0];
      }
    }
    label129:
    if (Build.VERSION.SDK_INT >= 23)
    {
      if (Process.is64Bit()) {
        return Build.SUPPORTED_64_BIT_ABIS[0];
      }
      return Build.SUPPORTED_32_BIT_ABIS[0];
    }
    return "";
  }
  
  public static String c()
  {
    return d;
  }
  
  private static String c(Context paramContext)
  {
    if (paramContext == null) {
      return "";
    }
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    if (localTelephonyManager == null) {
      return "";
    }
    if (Build.VERSION.SDK_INT > 22)
    {
      if (paramContext.checkSelfPermission("android.permission.READ_PHONE_STATE") != 0) {
        return "no permission";
      }
      return localTelephonyManager.getDeviceId();
    }
    return localTelephonyManager.getDeviceId();
  }
  
  public static String d()
  {
    return e;
  }
  
  private static String d(Context paramContext)
  {
    if (paramContext == null) {
      return "";
    }
    PackageManager localPackageManager = paramContext.getPackageManager();
    Object localObject = null;
    try
    {
      paramContext = localPackageManager.getApplicationInfo(paramContext.getPackageName(), 128);
      return paramContext.loadLabel(localPackageManager).toString();
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        paramContext = (Context)localObject;
      }
    }
  }
  
  public static String e()
  {
    return f;
  }
  
  private static String e(Context paramContext)
  {
    if (paramContext == null) {
      return "";
    }
    String str = paramContext.getPackageName();
    Object localObject = null;
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationInfo(str, 128);
      if (paramContext == null) {
        return "";
      }
      if (paramContext.metaData == null) {
        return "";
      }
      return paramContext.metaData.getString(a);
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        paramContext = (Context)localObject;
      }
    }
  }
  
  public static String f()
  {
    return g;
  }
  
  public static String g()
  {
    return h;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */