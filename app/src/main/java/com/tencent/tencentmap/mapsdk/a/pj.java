package com.tencent.tencentmap.mapsdk.a;

public final class pj
{
  public final ox a;
  public final ox b;
  public final ox c;
  public final ox d;
  public final oy e;
  
  public pj(ox paramox1, ox paramox2, ox paramox3, ox paramox4, oy paramoy)
  {
    this.a = paramox1;
    this.b = paramox2;
    this.c = paramox3;
    this.d = paramox4;
    this.e = paramoy;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof pj)) {
        return false;
      }
      paramObject = (pj)paramObject;
    } while ((this.a.equals(((pj)paramObject).a)) && (this.b.equals(((pj)paramObject).b)) && (this.c.equals(((pj)paramObject).c)) && (this.d.equals(((pj)paramObject).d)) && (this.e.equals(((pj)paramObject).e)));
    return false;
  }
  
  public final String toString()
  {
    return "nearLeft" + this.a + "nearRight" + this.b + "farLeft" + this.c + "farRight" + this.d + "latLngBounds" + this.e;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/pj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */