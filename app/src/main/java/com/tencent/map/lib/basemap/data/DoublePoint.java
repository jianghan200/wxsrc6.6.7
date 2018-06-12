package com.tencent.map.lib.basemap.data;

public class DoublePoint
{
  public double x;
  public double y;
  
  public DoublePoint() {}
  
  public DoublePoint(double paramDouble1, double paramDouble2)
  {
    this.x = paramDouble1;
    this.y = paramDouble2;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof DoublePoint))
    {
      paramObject = (DoublePoint)paramObject;
      bool1 = bool2;
      if (this.x == ((DoublePoint)paramObject).x)
      {
        bool1 = bool2;
        if (this.y == ((DoublePoint)paramObject).y) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public void set(double paramDouble1, double paramDouble2)
  {
    this.x = paramDouble1;
    this.y = paramDouble2;
  }
  
  public String toString()
  {
    return this.x + "," + this.y;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/map/lib/basemap/data/DoublePoint.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */