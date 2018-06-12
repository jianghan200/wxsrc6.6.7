package com.tencent.tencentmap.mapsdk.a;

public final class cp
  extends cx
  implements Cloneable
{
  public String a = "";
  public String b = "";
  public String c = "";
  public boolean d = true;
  public long e = 0L;
  public long f = 0L;
  public String g = "";
  public long h = 0L;
  private int i = 0;
  
  public final void a(cv paramcv)
  {
    this.a = paramcv.a(0, true);
    this.b = paramcv.a(1, true);
    this.c = paramcv.a(2, true);
    if (paramcv.a((byte)0, 3, true) != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.d = bool;
      this.e = paramcv.a(this.e, 4, true);
      this.f = paramcv.a(this.f, 5, true);
      this.g = paramcv.a(6, true);
      this.h = paramcv.a(this.h, 7, true);
      this.i = paramcv.a(this.i, 8, false);
      return;
    }
  }
  
  public final void a(cw paramcw)
  {
    paramcw.a(this.a, 0);
    paramcw.a(this.b, 1);
    paramcw.a(this.c, 2);
    paramcw.a(this.d);
    paramcw.a(this.e, 4);
    paramcw.a(this.f, 5);
    paramcw.a(this.g, 6);
    paramcw.a(this.h, 7);
    paramcw.a(this.i, 8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/cp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */