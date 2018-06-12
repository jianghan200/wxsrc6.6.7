package com.tencent.mm.compatible.util;

import android.os.SystemClock;

public final class g
{
  public static String Ab()
  {
    return new Throwable().getStackTrace()[1].toString();
  }
  
  public static String Ac()
  {
    StackTraceElement localStackTraceElement = new Throwable().getStackTrace()[1];
    int i = localStackTraceElement.getMethodName().lastIndexOf('.');
    return localStackTraceElement.getMethodName().substring(i + 1) + "(" + localStackTraceElement.getFileName() + ":" + localStackTraceElement.getLineNumber() + ")";
  }
  
  public static int getLine()
  {
    return new Throwable().getStackTrace()[1].getLineNumber();
  }
  
  public static final class a
  {
    public long dgA = SystemClock.elapsedRealtime();
    
    public final long Ad()
    {
      return SystemClock.elapsedRealtime() - this.dgA;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/compatible/util/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */