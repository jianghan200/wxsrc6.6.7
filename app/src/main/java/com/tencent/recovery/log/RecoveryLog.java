package com.tencent.recovery.log;

import java.util.ArrayList;
import java.util.List;

public class RecoveryLog
{
  private static RecoveryLogImpl edi = new RecoveryCacheLog();
  
  public static void a(RecoveryLogImpl paramRecoveryLogImpl)
  {
    if ((edi instanceof RecoveryCacheLog))
    {
      RecoveryCacheLog localRecoveryCacheLog = (RecoveryCacheLog)edi;
      int j = localRecoveryCacheLog.vhn.size();
      int i = 0;
      if (i < j)
      {
        RecoveryCacheLog.LogItem localLogItem = (RecoveryCacheLog.LogItem)localRecoveryCacheLog.vhn.get(i);
        switch (localLogItem.level)
        {
        }
        for (;;)
        {
          i += 1;
          break;
          paramRecoveryLogImpl.v(localLogItem.tag, localLogItem.vho, localLogItem.vhp);
          continue;
          paramRecoveryLogImpl.d(localLogItem.tag, localLogItem.vho, localLogItem.vhp);
          continue;
          paramRecoveryLogImpl.i(localLogItem.tag, localLogItem.vho, localLogItem.vhp);
          continue;
          paramRecoveryLogImpl.w(localLogItem.tag, localLogItem.vho, localLogItem.vhp);
          continue;
          if (localLogItem.vhq != null) {
            paramRecoveryLogImpl.printErrStackTrace(localLogItem.tag, localLogItem.vhq, localLogItem.vho, localLogItem.vhp);
          } else {
            paramRecoveryLogImpl.e(localLogItem.tag, localLogItem.vho, localLogItem.vhp);
          }
        }
      }
      localRecoveryCacheLog.vhn = new ArrayList();
    }
    edi = paramRecoveryLogImpl;
  }
  
  public static void cEW()
  {
    if ((edi instanceof RecoveryFileLog)) {
      ((RecoveryFileLog)edi).bC("", true);
    }
  }
  
  public static RecoveryLogImpl cEX()
  {
    return edi;
  }
  
  public static void e(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (edi != null) {
      edi.e(paramString1, paramString2, paramVarArgs);
    }
  }
  
  public static void i(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (edi != null) {
      edi.i(paramString1, paramString2, paramVarArgs);
    }
  }
  
  public static void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object... paramVarArgs)
  {
    if (edi != null) {
      edi.printErrStackTrace(paramString1, paramThrowable, paramString2, paramVarArgs);
    }
  }
  
  public static abstract interface RecoveryLogImpl
  {
    public abstract void d(String paramString1, String paramString2, Object... paramVarArgs);
    
    public abstract void e(String paramString1, String paramString2, Object... paramVarArgs);
    
    public abstract void i(String paramString1, String paramString2, Object... paramVarArgs);
    
    public abstract void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object... paramVarArgs);
    
    public abstract void v(String paramString1, String paramString2, Object... paramVarArgs);
    
    public abstract void w(String paramString1, String paramString2, Object... paramVarArgs);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/recovery/log/RecoveryLog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */