package com.tencent.recovery;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import com.tencent.recovery.handler.RecoveryMessageHandler;
import com.tencent.recovery.log.RecoveryLog;
import com.tencent.recovery.option.OptionFactory;
import com.tencent.recovery.option.ProcessOptions;
import com.tencent.recovery.util.Util;

public class Recovery
{
  private static Application application;
  private static Context context;
  private static RecoveryMessageHandler vgZ;
  private static long vha;
  private static String vhb;
  private static boolean vhc = false;
  private static boolean vhd = false;
  private static int vhe = 0;
  private static Application.ActivityLifecycleCallbacks vhf = new Application.ActivityLifecycleCallbacks()
  {
    public final void onActivityCreated(Activity paramAnonymousActivity, Bundle paramAnonymousBundle)
    {
      if (Recovery.yT()) {}
      while (Recovery.cES().hasMessages(3)) {
        return;
      }
      Recovery.cES().removeCallbacksAndMessages(null);
      paramAnonymousActivity = Util.hm(Recovery.cET());
      paramAnonymousBundle = Recovery.cET().getSharedPreferences(Recovery.ew(), 0).edit();
      paramAnonymousBundle.putInt("KeyComponentOnCreateForeground", 1);
      paramAnonymousBundle.putInt("KeyComponentOnCreateExceptionType", 4096);
      paramAnonymousBundle.apply();
      paramAnonymousBundle = OptionFactory.dA(paramAnonymousActivity, 1);
      Recovery.cES().sendEmptyMessageDelayed(3, paramAnonymousBundle.dkb);
      RecoveryLog.i("Recovery", "%s markActivityOnCreated %s", new Object[] { paramAnonymousActivity, Long.valueOf(System.currentTimeMillis() - Recovery.arO()) });
    }
    
    public final void onActivityDestroyed(Activity paramAnonymousActivity) {}
    
    public final void onActivityPaused(Activity paramAnonymousActivity) {}
    
    public final void onActivityResumed(Activity paramAnonymousActivity) {}
    
    public final void onActivitySaveInstanceState(Activity paramAnonymousActivity, Bundle paramAnonymousBundle) {}
    
    public final void onActivityStarted(Activity paramAnonymousActivity)
    {
      Recovery.cEU();
    }
    
    public final void onActivityStopped(Activity paramAnonymousActivity)
    {
      Recovery.cEV();
      if (Recovery.ux() == 0)
      {
        RecoveryLog.i("Recovery", "%s onActivityStopped: activityForegroundCount is 0", new Object[] { Util.hm(Recovery.cET()) });
        Recovery.Hj(16);
      }
    }
  };
  
  public static void Hj(int paramInt)
  {
    if (context == null) {}
    while (vhd) {
      return;
    }
    cER();
    Object localObject = Util.hm(context);
    SharedPreferences localSharedPreferences = context.getSharedPreferences(vhb, 0);
    RecoveryLog.i("Recovery", "%s Recovery.normal %s %d", new Object[] { localObject, Integer.toHexString(paramInt), Long.valueOf(System.currentTimeMillis() - vha) });
    vgZ.removeCallbacksAndMessages(null);
    localObject = localSharedPreferences.edit();
    ((SharedPreferences.Editor)localObject).remove("KeyComponentOnCreateExceptionType");
    ((SharedPreferences.Editor)localObject).putInt("KeyComponentOnCreateNormalType", paramInt);
    ((SharedPreferences.Editor)localObject).apply();
    destroy();
  }
  
  public static void cEO()
  {
    if (vhd) {}
    while (vhc) {
      return;
    }
    vhc = true;
    Object localObject = Util.hm(context);
    int i = RecoveryLogic.bG(context, (String)localObject);
    RecoveryLog.i("Recovery", "%s markApplicationOnCreateNormal %d", new Object[] { localObject, Long.valueOf(System.currentTimeMillis() - vha) });
    SharedPreferences.Editor localEditor = context.getSharedPreferences(vhb, 0).edit();
    localEditor.remove("KeyAppOnCreateExceptionType");
    localEditor.putInt("KeyAppOnCreateNormalType", 256);
    if (RecoveryLogic.bG(context, (String)localObject) == 16)
    {
      localEditor.putInt("KeyComponentOnCreateForeground", i);
      localEditor.putInt("KeyComponentOnCreateExceptionType", 4096);
      localObject = OptionFactory.dA((String)localObject, i);
      vgZ.sendEmptyMessageDelayed(2, ((ProcessOptions)localObject).dkb);
    }
    localEditor.apply();
  }
  
  public static void cEP()
  {
    if (context == null) {}
    while (vhd) {
      return;
    }
    cER();
    RecoveryLog.i("Recovery", "%s Recovery.crash %d", new Object[] { Util.hm(context), Long.valueOf(System.currentTimeMillis() - vha) });
    SharedPreferences.Editor localEditor = context.getSharedPreferences(vhb, 0).edit();
    if (vhc) {
      localEditor.putInt("KeyComponentOnCreateExceptionType", 65536);
    }
    for (;;)
    {
      localEditor.apply();
      destroy();
      return;
      localEditor.putInt("KeyAppOnCreateExceptionType", 65536);
    }
  }
  
  public static void cEQ()
  {
    if (context == null) {}
    while (vhd) {
      return;
    }
    cER();
    RecoveryLog.i("Recovery", "%s Recovery.anr %d", new Object[] { Util.hm(context), Long.valueOf(System.currentTimeMillis() - vha) });
    SharedPreferences.Editor localEditor = context.getSharedPreferences(vhb, 0).edit();
    if (vhc) {
      localEditor.putInt("KeyComponentOnCreateExceptionType", 1048576);
    }
    for (;;)
    {
      localEditor.apply();
      destroy();
      return;
      localEditor.putInt("KeyAppOnCreateExceptionType", 1048576);
    }
  }
  
  private static void cER()
  {
    if (context == null) {}
    while (vhd) {
      return;
    }
    RecoveryLog.i("Recovery", "%s markFinalStatus", new Object[] { Util.hm(context) });
    vhd = true;
  }
  
  private static void destroy()
  {
    if (application != null) {
      application.unregisterActivityLifecycleCallbacks(vhf);
    }
  }
  
  public static Context getContext()
  {
    return context;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/recovery/Recovery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */