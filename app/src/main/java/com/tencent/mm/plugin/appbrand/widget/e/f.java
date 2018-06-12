package com.tencent.mm.plugin.appbrand.widget.e;

public final class f
{
  public final double x;
  public final double y;
  
  public f(double paramDouble1, double paramDouble2)
  {
    this.x = paramDouble1;
    this.y = paramDouble2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof f)) {
      return false;
    }
    return (this.x == ((f)paramObject).x) && (this.y == ((f)paramObject).y);
  }
  
  public final String toString()
  {
    return "Point{x=" + this.x + ", y=" + this.y + '}';
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/e/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */