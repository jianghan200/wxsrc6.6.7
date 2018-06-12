package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap;

public final class qq
  implements Cloneable
{
  int a = 0;
  int b = 0;
  Bitmap c;
  
  public qq(Bitmap paramBitmap)
  {
    if (paramBitmap != null)
    {
      this.a = paramBitmap.getWidth();
      this.b = paramBitmap.getHeight();
      this.c = paramBitmap;
    }
  }
  
  private qq(Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramBitmap;
  }
  
  public final qq a()
  {
    return new qq(Bitmap.createBitmap(this.c), this.a, this.b);
  }
  
  public final Bitmap b()
  {
    return this.c;
  }
  
  public final int c()
  {
    return this.a;
  }
  
  public final int d()
  {
    return this.b;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/qq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */