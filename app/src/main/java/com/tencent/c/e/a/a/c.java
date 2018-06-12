package com.tencent.c.e.a.a;

public abstract class c
  implements Runnable
{
  public abstract void cFm();
  
  public abstract void cFn();
  
  public void run()
  {
    try
    {
      cFm();
      return;
    }
    catch (Throwable localThrowable)
    {
      cFn();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/c/e/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */