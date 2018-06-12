package com.tencent.recovery.log;

import java.util.ArrayList;
import java.util.List;

public class RecoveryCacheLog
  implements RecoveryLog.RecoveryLogImpl
{
  List<LogItem> vhn = new ArrayList(100);
  
  public final void d(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (this.vhn.size() < 100)
    {
      LogItem localLogItem = new LogItem((byte)0);
      localLogItem.level = 2;
      localLogItem.tag = paramString1;
      localLogItem.vho = paramString2;
      localLogItem.vhp = paramVarArgs;
      this.vhn.add(localLogItem);
    }
    String.format(paramString2, paramVarArgs);
  }
  
  public final void e(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (this.vhn.size() < 100)
    {
      LogItem localLogItem = new LogItem((byte)0);
      localLogItem.level = 5;
      localLogItem.tag = paramString1;
      localLogItem.vho = paramString2;
      localLogItem.vhp = paramVarArgs;
      this.vhn.add(localLogItem);
    }
    String.format(paramString2, paramVarArgs);
  }
  
  public final void i(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (this.vhn.size() < 100)
    {
      LogItem localLogItem = new LogItem((byte)0);
      localLogItem.level = 3;
      localLogItem.tag = paramString1;
      localLogItem.vho = paramString2;
      localLogItem.vhp = paramVarArgs;
      this.vhn.add(localLogItem);
    }
    String.format(paramString2, paramVarArgs);
  }
  
  public final void printErrStackTrace(String paramString1, Throwable paramThrowable, String paramString2, Object... paramVarArgs)
  {
    if (this.vhn.size() < 100)
    {
      LogItem localLogItem = new LogItem((byte)0);
      localLogItem.level = 5;
      localLogItem.tag = paramString1;
      localLogItem.vho = paramString2;
      localLogItem.vhp = paramVarArgs;
      localLogItem.vhq = paramThrowable;
      this.vhn.add(localLogItem);
    }
    String.format(paramString2, paramVarArgs);
  }
  
  public final void v(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (this.vhn.size() < 100)
    {
      LogItem localLogItem = new LogItem((byte)0);
      localLogItem.level = 1;
      localLogItem.tag = paramString1;
      localLogItem.vho = paramString2;
      localLogItem.vhp = paramVarArgs;
      this.vhn.add(localLogItem);
    }
    String.format(paramString2, paramVarArgs);
  }
  
  public final void w(String paramString1, String paramString2, Object... paramVarArgs)
  {
    if (this.vhn.size() < 100)
    {
      LogItem localLogItem = new LogItem((byte)0);
      localLogItem.level = 4;
      localLogItem.tag = paramString1;
      localLogItem.vho = paramString2;
      localLogItem.vhp = paramVarArgs;
      this.vhn.add(localLogItem);
    }
    String.format(paramString2, paramVarArgs);
  }
  
  private class LogItem
  {
    int level;
    String tag;
    String vho;
    Object[] vhp;
    Throwable vhq;
    
    private LogItem() {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/recovery/log/RecoveryCacheLog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */