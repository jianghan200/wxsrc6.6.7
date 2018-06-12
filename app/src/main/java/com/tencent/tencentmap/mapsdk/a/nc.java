package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap;

public class nc
{
  private final int a;
  private final int b;
  private final int c;
  private final String d;
  private boolean e = false;
  private Bitmap f = null;
  private volatile boolean g = false;
  
  public nc(int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramString;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public void a(Bitmap paramBitmap)
  {
    this.f = paramBitmap;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public int c()
  {
    return this.c;
  }
  
  public String d()
  {
    return this.d;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if (!(paramObject instanceof nc)) {
        return false;
      }
      paramObject = (nc)paramObject;
    } while ((this.a == ((nc)paramObject).a) && (this.b == ((nc)paramObject).b) && (this.c == ((nc)paramObject).c));
    return false;
  }
  
  public int hashCode()
  {
    return this.a * 7 + this.b * 11 + this.c * 13;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(24);
    localStringBuilder.append(this.a);
    localStringBuilder.append("-");
    localStringBuilder.append(this.b);
    localStringBuilder.append("-");
    localStringBuilder.append(this.c);
    localStringBuilder.append("-");
    localStringBuilder.append(this.d);
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/nc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */