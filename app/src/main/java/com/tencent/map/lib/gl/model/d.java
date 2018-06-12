package com.tencent.map.lib.gl.model;

public class d
{
  private float a;
  private float b;
  private float c;
  
  public d(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.a = paramFloat1;
    this.b = paramFloat2;
    this.c = paramFloat3;
    c();
  }
  
  private void c()
  {
    double d = b();
    if (d == 0.0D) {
      return;
    }
    this.a = ((float)(this.a / d));
    this.b = ((float)(this.b / d));
    this.c = ((float)(this.c / d));
  }
  
  public float[] a()
  {
    return new float[] { this.a, this.b, this.c };
  }
  
  public double b()
  {
    return Math.sqrt(this.a * this.a + this.b * this.b + this.c * this.c);
  }
  
  public String toString()
  {
    return this.a + "," + this.b + "," + this.c;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/map/lib/gl/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */