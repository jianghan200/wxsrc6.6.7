package com.tencent.mm.plugin.appbrand.widget.g;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.Drawable;
import com.tencent.mm.ui.widget.a;

public final class b
  extends a
{
  public b(Drawable paramDrawable)
  {
    super(paramDrawable);
  }
  
  public final void draw(Canvas paramCanvas, CharSequence paramCharSequence, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, Paint paramPaint)
  {
    paramCanvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
    super.draw(paramCanvas, paramCharSequence, paramInt1, paramInt2, paramFloat, paramInt3, paramInt4, paramInt5, paramPaint);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */