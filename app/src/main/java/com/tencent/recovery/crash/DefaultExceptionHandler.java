package com.tencent.recovery.crash;

public class DefaultExceptionHandler
  extends RecoveryExceptionHandler
{
  private Thread.UncaughtExceptionHandler vhm;
  
  public DefaultExceptionHandler(Thread.UncaughtExceptionHandler paramUncaughtExceptionHandler)
  {
    this.vhm = paramUncaughtExceptionHandler;
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    super.uncaughtException(paramThread, paramThrowable);
    if (this.vhm != null) {
      this.vhm.uncaughtException(paramThread, paramThrowable);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/recovery/crash/DefaultExceptionHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */