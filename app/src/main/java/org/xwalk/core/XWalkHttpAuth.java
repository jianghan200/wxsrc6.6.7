package org.xwalk.core;

public abstract interface XWalkHttpAuth
{
  public abstract void cancel();
  
  public abstract boolean isFirstAttempt();
  
  public abstract void proceed(String paramString1, String paramString2);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/org/xwalk/core/XWalkHttpAuth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */