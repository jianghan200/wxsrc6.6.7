package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;

public class PagerTabStrip
  extends PagerTitleStrip
{
  private final Rect bJ = new Rect();
  private int fW;
  private int va = this.vD;
  private int vb;
  private int vc;
  private int vd;
  private int ve;
  private int vf;
  private final Paint vg = new Paint();
  private int vh = 255;
  private boolean vi = false;
  private boolean vj = false;
  private int vk;
  private boolean vl;
  private float vm;
  private float vn;
  
  public PagerTabStrip(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.vg.setColor(this.va);
    float f = paramContext.getResources().getDisplayMetrics().density;
    this.vb = ((int)(3.0F * f + 0.5F));
    this.vc = ((int)(6.0F * f + 0.5F));
    this.vd = ((int)(64.0F * f));
    this.vf = ((int)(16.0F * f + 0.5F));
    this.vk = ((int)(1.0F * f + 0.5F));
    this.ve = ((int)(f * 32.0F + 0.5F));
    this.fW = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
    setTextSpacing(getTextSpacing());
    setWillNotDraw(false);
    this.vq.setFocusable(true);
    this.vq.setOnClickListener(new PagerTabStrip.1(this));
    this.vs.setFocusable(true);
    this.vs.setOnClickListener(new PagerTabStrip.2(this));
    if (getBackground() == null) {
      this.vi = true;
    }
  }
  
  final void a(int paramInt, float paramFloat, boolean paramBoolean)
  {
    Rect localRect = this.bJ;
    int i = getHeight();
    int j = this.vr.getLeft();
    int k = this.vf;
    int m = this.vr.getRight();
    int n = this.vf;
    int i1 = i - this.vb;
    localRect.set(j - k, i1, m + n, i);
    super.a(paramInt, paramFloat, paramBoolean);
    this.vh = ((int)(Math.abs(paramFloat - 0.5F) * 2.0F * 255.0F));
    localRect.union(this.vr.getLeft() - this.vf, i1, this.vr.getRight() + this.vf, i);
    invalidate(localRect);
  }
  
  public boolean getDrawFullUnderline()
  {
    return this.vi;
  }
  
  int getMinHeight()
  {
    return Math.max(super.getMinHeight(), this.ve);
  }
  
  public int getTabIndicatorColor()
  {
    return this.va;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = getHeight();
    int j = this.vr.getLeft();
    int k = this.vf;
    int m = this.vr.getRight();
    int n = this.vf;
    int i1 = this.vb;
    this.vg.setColor(this.vh << 24 | this.va & 0xFFFFFF);
    paramCanvas.drawRect(j - k, i - i1, m + n, i, this.vg);
    if (this.vi)
    {
      this.vg.setColor(0xFF000000 | this.va & 0xFFFFFF);
      paramCanvas.drawRect(getPaddingLeft(), i - this.vk, getWidth() - getPaddingRight(), i, this.vg);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    if ((i != 0) && (this.vl)) {
      return false;
    }
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    switch (i)
    {
    }
    for (;;)
    {
      return true;
      this.vm = f1;
      this.vn = f2;
      this.vl = false;
      continue;
      if ((Math.abs(f1 - this.vm) > this.fW) || (Math.abs(f2 - this.vn) > this.fW))
      {
        this.vl = true;
        continue;
        if (f1 < this.vr.getLeft() - this.vf) {
          this.vp.setCurrentItem(this.vp.getCurrentItem() - 1);
        } else if (f1 > this.vr.getRight() + this.vf) {
          this.vp.setCurrentItem(this.vp.getCurrentItem() + 1);
        }
      }
    }
  }
  
  public void setBackgroundColor(int paramInt)
  {
    super.setBackgroundColor(paramInt);
    if (!this.vj) {
      if ((0xFF000000 & paramInt) != 0) {
        break label27;
      }
    }
    label27:
    for (boolean bool = true;; bool = false)
    {
      this.vi = bool;
      return;
    }
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    if (!this.vj) {
      if (paramDrawable != null) {
        break label24;
      }
    }
    label24:
    for (boolean bool = true;; bool = false)
    {
      this.vi = bool;
      return;
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    if (!this.vj) {
      if (paramInt != 0) {
        break label24;
      }
    }
    label24:
    for (boolean bool = true;; bool = false)
    {
      this.vi = bool;
      return;
    }
  }
  
  public void setDrawFullUnderline(boolean paramBoolean)
  {
    this.vi = paramBoolean;
    this.vj = true;
    invalidate();
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt4;
    if (paramInt4 < this.vc) {
      i = this.vc;
    }
    super.setPadding(paramInt1, paramInt2, paramInt3, i);
  }
  
  public void setTabIndicatorColor(int paramInt)
  {
    this.va = paramInt;
    this.vg.setColor(this.va);
    invalidate();
  }
  
  public void setTabIndicatorColorResource(int paramInt)
  {
    setTabIndicatorColor(getContext().getResources().getColor(paramInt));
  }
  
  public void setTextSpacing(int paramInt)
  {
    int i = paramInt;
    if (paramInt < this.vd) {
      i = this.vd;
    }
    super.setTextSpacing(i);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/android/support/v4/view/PagerTabStrip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */