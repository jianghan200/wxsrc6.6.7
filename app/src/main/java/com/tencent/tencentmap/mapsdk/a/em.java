package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

public final class em
{
  private static Context a = null;
  private static String b = "";
  private static String c = "null";
  private static int d = 0;
  private static String e = "";
  private static String f = "";
  private static String g = "1.5.6.1223-M-HC-B";
  
  public static Context a()
  {
    return a;
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    a = paramContext.getApplicationContext();
    b = paramString1;
    e = paramString3;
    f = paramString2;
    g = "1.5.6.1223-M-HC-B";
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0);
      c = paramContext.versionName;
      d = paramContext.versionCode;
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static String b()
  {
    return b;
  }
  
  public static String c()
  {
    return c;
  }
  
  public static int d()
  {
    return d;
  }
  
  public static String e()
  {
    return e;
  }
  
  public static String f()
  {
    return g;
  }
  
  public static String g()
  {
    return f;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/em.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */