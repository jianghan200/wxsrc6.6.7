package com.tencent.tencentmap.mapsdk.a;

public class im
  implements hg
{
  private hv a = null;
  private il b = null;
  private jg c = null;
  
  public im(hv paramhv, jg paramjg)
  {
    this.a = paramhv;
    this.c = paramjg;
  }
  
  public void a()
  {
    if (this.b != null) {
      synchronized (this.b)
      {
        this.b.notify();
        return;
      }
    }
  }
  
  public void b()
  {
    if (this.a == null) {
      return;
    }
    this.a.a().a(this);
    if (this.b == null) {
      this.b = new il(this.a, this.c);
    }
    try
    {
      this.b.start();
      return;
    }
    catch (Exception localException) {}
  }
  
  public void c()
  {
    if (this.b != null) {
      this.b.a();
    }
  }
  
  public void d()
  {
    if (this.b != null)
    {
      this.b.b();
      a();
    }
  }
  
  public void e()
  {
    if (this.a == null) {}
    do
    {
      return;
      this.a.a().b(this);
    } while (this.b == null);
    this.b.c();
    this.b = null;
  }
  
  public void f()
  {
    e();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/im.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */