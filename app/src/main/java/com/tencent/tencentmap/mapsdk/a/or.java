package com.tencent.tencentmap.mapsdk.a;

public final class or
{
  public ox a;
  public final float b;
  public final float c;
  public final float d;
  
  or(int paramInt, ox paramox, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.a = paramox;
    this.b = paramFloat1;
    this.c = paramFloat2;
    this.d = paramFloat3;
  }
  
  public or(ox paramox, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this(1, paramox, paramFloat1, paramFloat2, paramFloat3);
  }
  
  public static a a()
  {
    return new a();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof or)) {
        return false;
      }
      paramObject = (or)paramObject;
    } while ((this.a.equals(((or)paramObject).a)) && (Float.floatToIntBits(this.b) == Float.floatToIntBits(((or)paramObject).b)) && (Float.floatToIntBits(this.c) == Float.floatToIntBits(((or)paramObject).c)) && (Float.floatToIntBits(this.d) == Float.floatToIntBits(((or)paramObject).d)));
    return false;
  }
  
  public final String toString()
  {
    return "latlng:" + this.a.a + "," + this.a.b + ",zoom:" + this.b + ",tilt=" + this.c + ",bearing:" + this.d;
  }
  
  public static final class a
  {
    private ox a;
    private float b;
    private float c = Float.MIN_VALUE;
    private float d = Float.MIN_VALUE;
    
    public final a a(float paramFloat)
    {
      this.b = paramFloat;
      return this;
    }
    
    public final a a(ox paramox)
    {
      this.a = paramox;
      return this;
    }
    
    public final or a()
    {
      return new or(this.a, this.b, this.c, this.d);
    }
    
    public final a b(float paramFloat)
    {
      this.c = paramFloat;
      return this;
    }
    
    public final a c(float paramFloat)
    {
      this.d = paramFloat;
      return this;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/or.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */