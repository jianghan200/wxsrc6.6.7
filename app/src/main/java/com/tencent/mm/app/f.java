package com.tencent.mm.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public final class f
{
  public static int aV(Context paramContext)
  {
    if (paramContext == null) {
      return 0;
    }
    try
    {
      int i = paramContext.getSharedPreferences("crash_status_file", 4).getInt("channel", -1);
      return i;
    }
    catch (Throwable paramContext) {}
    return 0;
  }
  
  public static int aW(Context paramContext)
  {
    if (paramContext == null) {
      return 0;
    }
    try
    {
      int i = paramContext.getSharedPreferences("crash_status_file", 4).getInt("googleplaysizelimit", 3072);
      return i;
    }
    catch (Throwable paramContext) {}
    return 0;
  }
  
  public static void g(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      Object localObject = paramContext.getSharedPreferences("crash_status_file", 4);
      paramContext = ((SharedPreferences)localObject).getString("crashlist", "");
      localObject = ((SharedPreferences)localObject).edit();
      ((SharedPreferences.Editor)localObject).putString("crashlist", paramContext + ";" + paramString1 + "," + paramString2);
      ((SharedPreferences.Editor)localObject).commit();
      return;
    }
    catch (Throwable paramContext) {}
  }
  
  public static abstract interface a
  {
    public abstract void et(int paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/app/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */