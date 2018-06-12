package com.tencent.mm.sdk.platformtools;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.Iterator;
import java.util.List;

public final class ad
{
  private static String byT;
  private static Context context = null;
  private static volatile Resources mResources = null;
  private static String processName;
  public static boolean sGA;
  private static ActivityManager sGB = null;
  private static String sGx = "com.tencent.mm";
  private static String sGy;
  private static boolean sGz;
  
  static
  {
    byT = "com.tencent.mm";
    sGy = "com.tencent.mm.ui.LauncherUI";
    processName = byT;
    sGz = false;
    sGA = false;
  }
  
  private static boolean Wo(String paramString)
  {
    if ((context == null) || (byT == null)) {
      return false;
    }
    if (sGB == null) {
      sGB = (ActivityManager)context.getSystemService("activity");
    }
    try
    {
      Iterator localIterator = sGB.getRunningAppProcesses().iterator();
      while (localIterator.hasNext())
      {
        boolean bool = ((ActivityManager.RunningAppProcessInfo)localIterator.next()).processName.equals(paramString);
        if (bool) {
          return true;
        }
      }
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.MMApplicationContext", "isMMProcessExist Exception: " + paramString.toString());
      return false;
    }
    catch (Error paramString)
    {
      x.e("MicroMsg.MMApplicationContext", "isMMProcessExist Error: " + paramString.toString());
      return false;
    }
    return false;
  }
  
  public static void a(Resources paramResources)
  {
    mResources = paramResources;
  }
  
  public static void bZ(String paramString)
  {
    processName = paramString;
  }
  
  public static boolean chV()
  {
    return sGz;
  }
  
  public static String chW()
  {
    return sGy;
  }
  
  public static String chX()
  {
    return sGx;
  }
  
  public static String chY()
  {
    return byT + "_preferences";
  }
  
  public static SharedPreferences chZ()
  {
    if (context != null) {
      return context.getSharedPreferences(chY(), 0);
    }
    return null;
  }
  
  public static SharedPreferences cia()
  {
    if (context != null) {
      return context.getSharedPreferences(byT + "_preferences_tools", 0);
    }
    return null;
  }
  
  public static String cib()
  {
    return byT + "_tmp_preferences";
  }
  
  public static boolean cic()
  {
    String str2 = processName;
    String str1;
    if (str2 != null)
    {
      str1 = str2;
      if (str2.length() != 0) {}
    }
    else
    {
      str1 = byT;
    }
    return byT.equals(str1);
  }
  
  public static boolean cid()
  {
    String str2 = processName;
    String str1;
    if (str2 != null)
    {
      str1 = str2;
      if (str2.length() != 0) {}
    }
    else
    {
      str1 = byT;
    }
    return "com.tencent.mm:push".equalsIgnoreCase(str1);
  }
  
  public static boolean cie()
  {
    String str2 = processName;
    String str1;
    if (str2 != null)
    {
      str1 = str2;
      if (str2.length() != 0) {}
    }
    else
    {
      str1 = byT;
    }
    return "com.tencent.mm:tools".equalsIgnoreCase(str1);
  }
  
  public static boolean cif()
  {
    String str2 = processName;
    String str1;
    if (str2 != null)
    {
      str1 = str2;
      if (str2.length() != 0) {}
    }
    else
    {
      str1 = byT;
    }
    return "com.tencent.mm:exdevice".equalsIgnoreCase(str1);
  }
  
  public static boolean cig()
  {
    return Wo(byT);
  }
  
  public static Context getContext()
  {
    return context;
  }
  
  public static String getPackageName()
  {
    return byT;
  }
  
  public static String getProcessName()
  {
    return processName;
  }
  
  public static Resources getResources()
  {
    return mResources;
  }
  
  public static void le(boolean paramBoolean)
  {
    sGz = paramBoolean;
  }
  
  public static void setContext(Context paramContext)
  {
    context = paramContext;
    byT = paramContext.getPackageName();
    x.d("MicroMsg.MMApplicationContext", "setup application context for package: " + byT);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */