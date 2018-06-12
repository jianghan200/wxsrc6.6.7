package com.tencent.mm.plugin.appbrand.widget.e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.tencent.mm.bp.a;
import com.tencent.mm.sdk.platformtools.ad;

public final class b
  extends Drawable
{
  public float Tl = 0.0F;
  final Paint cN = new Paint(1);
  private final RectF gMn = new RectF();
  private float gMo = a.fromDPToPix(ad.getContext(), 3);
  private final Path ks = new Path();
  
  public final void draw(Canvas paramCanvas)
  {
    float f5 = this.gMn.width();
    float f6 = this.gMn.height();
    float f1 = this.gMn.left;
    float f2 = this.gMn.top;
    float f3 = this.gMn.right;
    float f4 = this.gMn.bottom;
    f5 = Math.min(this.Tl, Math.min(f5, f6) * 0.5F);
    paramCanvas.drawRoundRect(new RectF(f1 + this.gMo, f2 + this.gMo, f3 - this.gMo, f4 - this.gMo), f5, f5, this.cN);
    paramCanvas.drawPath(this.ks, this.cN);
  }
  
  public final int getOpacity()
  {
    return -3;
  }
  
  public final void setAlpha(int paramInt)
  {
    this.cN.setAlpha(paramInt);
  }
  
  public final void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    this.gMn.set(paramInt1, paramInt2, paramInt3, paramInt4);
    float f = (paramInt1 + paramInt3) / 2.0F;
    this.ks.moveTo(f, paramInt4);
    this.ks.lineTo(f - this.gMo, paramInt4 - this.gMo);
    this.ks.lineTo(f + this.gMo, paramInt4 - this.gMo);
    this.ks.close();
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.cN.setColorFilter(paramColorFilter);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/e/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */