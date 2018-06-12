package com.tencent.recovery.log;

import android.os.Process;
import android.util.Log;
import com.tencent.recovery.storage.MMappedFileStorage;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RecoveryFileLog
  implements RecoveryLog.RecoveryLogImpl
{
  private MMappedFileStorage vhs;
  private SimpleDateFormat vht;
  private boolean vhu;
  
  private String au(String paramString1, String paramString2, String paramString3)
  {
    String str = this.vht.format(new Date());
    return String.format("%s​%s​[%d][%d][%s]: %s​​", new Object[] { paramString1, paramString2, Integer.valueOf(Process.myPid()), Long.valueOf(Thread.currentThread().getId()), str, paramString3 });
  }
  
  public final void bC(String paramString, boolean paramBoolean)
  {
    try
    {
      this.vhs.f(paramString.getBytes(), paramBoolean);
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final void d(String paramString1, String paramString2, Object... paramVarArgs)
  {
    bC(au("D", paramString1, String.format(paramString2, paramVarArgs)), false);
    if (this.vhu) {
      String.format(paramString2, paramVarArgs);
    }
  }
  
  public final void e(String paramString1, String paramString2, Object... paramVarArgs)
  {
    bC(au("E", paramString1, String.format(paramString2, paramVarArgs)), false);
    if (this.vhu) {
      String.format(paramString2, paramVarArgs);
    }
  }
  
  public final void i(String paramString1, String paramString2, Object... paramVarArgs)
  {
    bC(au("I", paramString1, String.format(paramString2, paramVarArgs)), false);
    if (this.vhu) {
      String.format(paramString2, paramVarArgs);
    }
  }
  
  public final void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object... paramVarArgs)
  {
    String str = String.format(paramString2, paramVarArgs);
    bC(au("E", paramString1, str + "  " + Log.getStackTraceString(paramThrowable)), false);
    if (this.vhu) {
      String.format(paramString2, paramVarArgs);
    }
  }
  
  public final void v(String paramString1, String paramString2, Object... paramVarArgs)
  {
    bC(au("V", paramString1, String.format(paramString2, paramVarArgs)), false);
    if (this.vhu) {
      String.format(paramString2, paramVarArgs);
    }
  }
  
  public final void w(String paramString1, String paramString2, Object... paramVarArgs)
  {
    bC(au("W", paramString1, String.format(paramString2, paramVarArgs)), false);
    if (this.vhu) {
      String.format(paramString2, paramVarArgs);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/recovery/log/RecoveryFileLog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */