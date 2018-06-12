package com.tencent.liteav.beauty.b;

public class a
{
  private boolean a = false;
  
  public void a()
  {
    try
    {
      this.a = true;
      notify();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void b()
  {
    try
    {
      while (!this.a) {
        wait();
      }
      this.a = false;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/liteav/beauty/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */