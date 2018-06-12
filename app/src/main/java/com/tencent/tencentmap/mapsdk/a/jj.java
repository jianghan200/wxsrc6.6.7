package com.tencent.tencentmap.mapsdk.a;

public class jj<E>
{
  private int a;
  private volatile Object[] b;
  private volatile int c;
  private volatile int d;
  
  public jj(int paramInt)
  {
    this.a = paramInt;
    this.b = new Object[paramInt];
    this.d = 0;
    this.c = 0;
  }
  
  private void e()
  {
    this.d = 0;
    this.c = 0;
  }
  
  public E a()
  {
    if (d()) {
      return null;
    }
    this.c %= this.a;
    Object localObject = this.b[this.c];
    this.b[this.c] = null;
    this.c += 1;
    return (E)localObject;
  }
  
  public boolean a(E paramE)
  {
    if (c()) {
      return false;
    }
    this.d %= this.a;
    Object[] arrayOfObject = this.b;
    int i = this.d;
    this.d = (i + 1);
    arrayOfObject[i] = paramE;
    return true;
  }
  
  public void b()
  {
    e();
    int i = 0;
    while (i < this.b.length)
    {
      this.b[i] = null;
      i += 1;
    }
  }
  
  public boolean c()
  {
    return (this.d + 1) % this.a == this.c;
  }
  
  public boolean d()
  {
    return this.d == this.c;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/jj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */