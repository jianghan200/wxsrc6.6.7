package com.tencent.tencentmap.mapsdk.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.view.View;

public final class tb
  extends View
{
  private sl a;
  private Bitmap b;
  private Paint c = new Paint();
  private int d = 0;
  private int e = 10;
  private int f = 10;
  private final float g;
  
  public tb(sl paramsl)
  {
    super(sl.a());
    this.a = paramsl;
    this.g = (80.0F * paramsl.f().b());
    this.c.setAntiAlias(true);
    this.c.setColor(-16777216);
    this.c.setStyle(Paint.Style.STROKE);
  }
  
  public final void a()
  {
    if (this.b != null) {
      this.b.recycle();
    }
  }
  
  public final void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public final void a(Bitmap paramBitmap)
  {
    if (paramBitmap != null)
    {
      Bitmap localBitmap = sz.a(paramBitmap, (float)(this.a.f().b() * 0.6D));
      if (localBitmap == null) {
        return;
      }
      paramBitmap = localBitmap;
      if (localBitmap.getWidth() < this.g) {
        paramBitmap = sz.a(localBitmap, this.g / localBitmap.getWidth());
      }
      this.b = paramBitmap;
      setVisibility(0);
      invalidate();
      return;
    }
    setVisibility(0);
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    if (this.b == null) {
      return;
    }
    int i = this.b.getWidth() + 3;
    int j = this.b.getHeight() + 3;
    switch (this.d)
    {
    default: 
      this.e = ((this.a.c().getWidth() - i) / 2);
      this.f = 10;
      if (this.a.f().c() != tc.a.b) {
        break;
      }
    }
    for (this.f -= 2;; this.f -= 8)
    {
      new StringBuilder("left:").append(this.e).append(", top:").append(this.f);
      paramCanvas.drawBitmap(this.b, this.e - 5, this.f, this.c);
      return;
      this.e = 10;
      this.f = (this.a.c().getHeight() - j);
      break;
      this.e = (this.a.c().getWidth() - i);
      this.f = (this.a.c().getHeight() - j);
      break;
      this.e = (this.a.c().getWidth() - i);
      this.f = 10;
      break;
      this.e = 10;
      this.f = 10;
      break;
      this.e = ((this.a.c().getWidth() - i) / 2);
      this.f = (this.a.c().getHeight() - j);
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/tb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */