package com.tencent.recovery.crash;

import com.tencent.recovery.Recovery;
import com.tencent.recovery.log.RecoveryLog;

public class JNICrashHandler
{
  private static final String TAG = "Recovery.JNICrashHandler";
  
  private static void onCrash()
  {
    RecoveryLog.i("Recovery.JNICrashHandler", "onCrash", new Object[0]);
    Recovery.cEP();
  }
  
  public static native void testSignal(int paramInt);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/recovery/crash/JNICrashHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */