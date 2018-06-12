package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.design.a.h;
import android.support.design.a.i;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class ScrimInsetsFrameLayout
  extends FrameLayout
{
  private Drawable bH;
  private Rect bI;
  private Rect bJ = new Rect();
  
  public ScrimInsetsFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ScrimInsetsFrameLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.i.ScrimInsetsFrameLayout, paramInt, a.h.Widget_Design_ScrimInsetsFrameLayout);
    this.bH = paramContext.getDrawable(a.i.ScrimInsetsFrameLayout_insetForeground);
    paramContext.recycle();
    setWillNotDraw(true);
    z.b(this, new ScrimInsetsFrameLayout.1(this));
  }
  
  public void c(Rect paramRect) {}
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int i = getWidth();
    int j = getHeight();
    if ((this.bI != null) && (this.bH != null))
    {
      int k = paramCanvas.save();
      paramCanvas.translate(getScrollX(), getScrollY());
      this.bJ.set(0, 0, i, this.bI.top);
      this.bH.setBounds(this.bJ);
      this.bH.draw(paramCanvas);
      this.bJ.set(0, j - this.bI.bottom, i, j);
      this.bH.setBounds(this.bJ);
      this.bH.draw(paramCanvas);
      this.bJ.set(0, this.bI.top, this.bI.left, j - this.bI.bottom);
      this.bH.setBounds(this.bJ);
      this.bH.draw(paramCanvas);
      this.bJ.set(i - this.bI.right, this.bI.top, i, j - this.bI.bottom);
      this.bH.setBounds(this.bJ);
      this.bH.draw(paramCanvas);
      paramCanvas.restoreToCount(k);
    }
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    if (this.bH != null) {
      this.bH.setCallback(this);
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.bH != null) {
      this.bH.setCallback(null);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/android/support/design/internal/ScrimInsetsFrameLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */