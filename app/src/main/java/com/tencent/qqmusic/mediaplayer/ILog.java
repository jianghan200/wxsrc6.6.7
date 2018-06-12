package com.tencent.qqmusic.mediaplayer;

public abstract interface ILog
{
  public abstract void d(String paramString1, String paramString2);
  
  public abstract void e(String paramString1, String paramString2);
  
  public abstract void e(String paramString1, String paramString2, Throwable paramThrowable);
  
  public abstract void e(String paramString1, String paramString2, Object... paramVarArgs);
  
  public abstract void e(String paramString, Throwable paramThrowable);
  
  public abstract void i(String paramString1, String paramString2);
  
  public abstract void i(String paramString1, String paramString2, Throwable paramThrowable);
  
  public abstract void w(String paramString1, String paramString2);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/ILog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */