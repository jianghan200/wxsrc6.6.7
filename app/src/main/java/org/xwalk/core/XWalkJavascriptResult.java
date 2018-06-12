package org.xwalk.core;

public abstract interface XWalkJavascriptResult
{
  public abstract void cancel();
  
  public abstract void confirm();
  
  public abstract void confirmWithResult(String paramString);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/org/xwalk/core/XWalkJavascriptResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */