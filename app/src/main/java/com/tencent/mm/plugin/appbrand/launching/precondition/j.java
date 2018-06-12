package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.content.Context;
import android.os.Handler;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class j
{
  static int ghG = 112;
  private static Object ghH;
  private static Handler ghI;
  
  private static Handler bm(Object paramObject)
  {
    if (ghI != null) {
      return ghI;
    }
    Field localField = paramObject.getClass().getDeclaredField("mH");
    localField.setAccessible(true);
    paramObject = (Handler)localField.get(paramObject);
    ghI = (Handler)paramObject;
    return (Handler)paramObject;
  }
  
  public static void cF(Context paramContext)
  {
    try
    {
      paramContext = bm(cG(paramContext));
      Field localField = paramContext.getClass().getDeclaredField("NEW_INTENT");
      localField.setAccessible(true);
      ghG = ((Integer)localField.get(paramContext)).intValue();
      return;
    }
    catch (Exception paramContext)
    {
      x.printErrStackTrace("MicroMsg.AppBrand.PreconditionActivityThreadHack", paramContext, "hack constants in ActivityThread$H", new Object[0]);
    }
  }
  
  private static Object cG(Context paramContext)
  {
    if (ghH != null) {
      return ghH;
    }
    Object localObject = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
    ((Method)localObject).setAccessible(true);
    localObject = ((Method)localObject).invoke(null, new Object[0]);
    if (localObject != null)
    {
      ghH = localObject;
      return localObject;
    }
    localObject = paramContext.getClass().getField("mLoadedApk");
    ((Field)localObject).setAccessible(true);
    paramContext = ((Field)localObject).get(paramContext);
    localObject = paramContext.getClass().getDeclaredField("mActivityThread");
    ((Field)localObject).setAccessible(true);
    paramContext = ((Field)localObject).get(paramContext);
    ghH = paramContext;
    return paramContext;
  }
  
  static boolean le(int paramInt)
  {
    try
    {
      Handler localHandler = bm(cG(ad.getContext()));
      if (localHandler == null) {
        return false;
      }
    }
    catch (Exception localException)
    {
      Object localObject;
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.AppBrand.PreconditionActivityThreadHack", localException, "hasPendingMessageInQueue, hack mH", new Object[0]);
        localObject = null;
      }
      return ((Handler)localObject).hasMessages(paramInt);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/precondition/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */