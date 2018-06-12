package com.tencent.tencentmap.mapsdk.a;

public class hi
{
  public static final hi g = new hi(1, null);
  public static final hi h = new hi(2, null, true);
  public static final hi i = new hi(104, null);
  public int a;
  public double[] b;
  public long c = -1L;
  public boolean d = false;
  public boolean e;
  public Runnable f;
  private hj j;
  
  public hi() {}
  
  public hi(int paramInt, double[] paramArrayOfDouble)
  {
    this(paramInt, paramArrayOfDouble, false);
  }
  
  public hi(int paramInt, double[] paramArrayOfDouble, boolean paramBoolean)
  {
    this.a = paramInt;
    this.b = paramArrayOfDouble;
    this.e = paramBoolean;
  }
  
  public hi(Runnable paramRunnable)
  {
    this.a = 6;
    this.f = paramRunnable;
  }
  
  protected boolean a()
  {
    return true;
  }
  
  boolean a(hk.a parama)
  {
    if (this.j != null) {
      this.j.a();
    }
    boolean bool = a();
    parama.a(this);
    return bool;
  }
  
  public void b()
  {
    if (this.j != null) {
      this.j.b();
    }
  }
  
  public void c()
  {
    if (this.j != null) {
      this.j.c();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/hi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */