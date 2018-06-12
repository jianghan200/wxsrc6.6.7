package com.tencent.b.a.a;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import java.lang.reflect.Method;

public class p
{
  private static volatile p bvN = null;
  private boolean bvO = false;
  private Context context = null;
  
  private p(Context paramContext)
  {
    this.context = paramContext.getApplicationContext();
    this.bvO = s.o(this.context, "android.permission.WRITE_SETTINGS");
    if (Build.VERSION.SDK_INT >= 23) {}
    try
    {
      paramContext = Settings.System.class.getDeclaredMethod("canWrite", new Class[] { Context.class });
      paramContext.setAccessible(true);
      this.bvO = ((Boolean)paramContext.invoke(null, new Object[] { this.context })).booleanValue();
      return;
    }
    catch (Exception paramContext) {}
  }
  
  public static p aG(Context paramContext)
  {
    if (bvN == null) {}
    try
    {
      if (bvN == null) {
        bvN = new p(paramContext);
      }
      return bvN;
    }
    finally {}
  }
  
  public final boolean u(String paramString1, String paramString2)
  {
    if (this.bvO) {
      try
      {
        boolean bool = Settings.System.putString(this.context.getContentResolver(), paramString1, paramString2);
        return bool;
      }
      catch (Exception paramString1) {}
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/b/a/a/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */