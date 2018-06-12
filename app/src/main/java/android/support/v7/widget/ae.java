package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

final class ae
  extends Drawable
{
  float Tl;
  private final RectF Tm;
  private final Rect Tn;
  float To;
  boolean Tp = false;
  boolean Tq = true;
  final Paint cN;
  private PorterDuffColorFilter jM;
  private ColorStateList kI;
  private PorterDuff.Mode kJ;
  
  public ae(int paramInt, float paramFloat)
  {
    this.Tl = paramFloat;
    this.cN = new Paint(5);
    this.cN.setColor(paramInt);
    this.Tm = new RectF();
    this.Tn = new Rect();
  }
  
  private PorterDuffColorFilter b(ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    if ((paramColorStateList == null) || (paramMode == null)) {
      return null;
    }
    return new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    Paint localPaint = this.cN;
    if ((this.jM != null) && (localPaint.getColorFilter() == null)) {
      localPaint.setColorFilter(this.jM);
    }
    for (int i = 1;; i = 0)
    {
      paramCanvas.drawRoundRect(this.Tm, this.Tl, this.Tl, localPaint);
      if (i != 0) {
        localPaint.setColorFilter(null);
      }
      return;
    }
  }
  
  public final int getOpacity()
  {
    return -3;
  }
  
  public final void getOutline(Outline paramOutline)
  {
    paramOutline.setRoundRect(this.Tn, this.Tl);
  }
  
  final void h(Rect paramRect)
  {
    Rect localRect = paramRect;
    if (paramRect == null) {
      localRect = getBounds();
    }
    this.Tm.set(localRect.left, localRect.top, localRect.right, localRect.bottom);
    this.Tn.set(localRect);
    if (this.Tp)
    {
      float f1 = af.c(this.To, this.Tl, this.Tq);
      float f2 = af.d(this.To, this.Tl, this.Tq);
      this.Tn.inset((int)Math.ceil(f2), (int)Math.ceil(f1));
      this.Tm.set(this.Tn);
    }
  }
  
  public final boolean isStateful()
  {
    return ((this.kI != null) && (this.kI.isStateful())) || (super.isStateful());
  }
  
  protected final void onBoundsChange(Rect paramRect)
  {
    super.onBoundsChange(paramRect);
    h(paramRect);
  }
  
  protected final boolean onStateChange(int[] paramArrayOfInt)
  {
    if ((this.kI != null) && (this.kJ != null))
    {
      this.jM = b(this.kI, this.kJ);
      return true;
    }
    return false;
  }
  
  public final void setAlpha(int paramInt)
  {
    this.cN.setAlpha(paramInt);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    this.cN.setColorFilter(paramColorFilter);
  }
  
  public final void setTintList(ColorStateList paramColorStateList)
  {
    this.kI = paramColorStateList;
    this.jM = b(this.kI, this.kJ);
    invalidateSelf();
  }
  
  public final void setTintMode(PorterDuff.Mode paramMode)
  {
    this.kJ = paramMode;
    this.jM = b(this.kI, this.kJ);
    invalidateSelf();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/android/support/v7/widget/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */