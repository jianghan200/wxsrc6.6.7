package com.tencent.tinker.loader;

public class TinkerRuntimeException
  extends RuntimeException
{
  public TinkerRuntimeException(String paramString)
  {
    super("Tinker Exception:" + paramString);
  }
  
  public TinkerRuntimeException(String paramString, Throwable paramThrowable)
  {
    super("Tinker Exception:" + paramString, paramThrowable);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tinker/loader/TinkerRuntimeException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */