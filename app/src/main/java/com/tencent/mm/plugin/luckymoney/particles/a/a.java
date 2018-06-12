package com.tencent.mm.plugin.luckymoney.particles.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

public final class a
  extends b
{
  private final Bitmap bitmap;
  private final float kSL;
  private final float kSM;
  
  public a(Bitmap paramBitmap)
  {
    this.bitmap = paramBitmap;
    this.kSL = (paramBitmap.getWidth() / 2.0F);
    this.kSM = (paramBitmap.getHeight() / 2.0F);
  }
  
  protected final void a(Canvas paramCanvas, Matrix paramMatrix, Paint paramPaint, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    paramMatrix.preTranslate(paramFloat1, paramFloat2);
    paramMatrix.preRotate(paramFloat3, this.kSL, this.kSM);
    paramCanvas.drawBitmap(this.bitmap, paramMatrix, paramPaint);
  }
  
  public final int getHeight()
  {
    return this.bitmap.getHeight();
  }
  
  public final int getWidth()
  {
    return this.bitmap.getWidth();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/particles/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */