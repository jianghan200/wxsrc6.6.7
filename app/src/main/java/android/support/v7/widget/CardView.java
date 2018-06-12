package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v7.b.a.a;
import android.support.v7.b.a.c;
import android.support.v7.b.a.d;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class CardView
  extends FrameLayout
  implements o
{
  private static final int[] Nq = { 16842801 };
  private static final q Nr;
  private boolean Ns;
  private int Nt;
  private int Nu;
  private final Rect Nv = new Rect();
  private final Rect Nw = new Rect();
  private boolean fk;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 21) {
      Nr = new n();
    }
    for (;;)
    {
      Nr.eN();
      return;
      if (Build.VERSION.SDK_INT >= 17) {
        Nr = new r();
      } else {
        Nr = new p();
      }
    }
  }
  
  public CardView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet, 0);
  }
  
  public CardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext, paramAttributeSet, paramInt);
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, a.d.CardView, paramInt, a.c.CardView);
    if (paramAttributeSet.hasValue(a.d.CardView_cardBackgroundColor)) {
      paramInt = paramAttributeSet.getColor(a.d.CardView_cardBackgroundColor, 0);
    }
    for (;;)
    {
      float f4 = paramAttributeSet.getDimension(a.d.CardView_cardCornerRadius, 0.0F);
      float f2 = paramAttributeSet.getDimension(a.d.CardView_cardElevation, 0.0F);
      float f3 = paramAttributeSet.getDimension(a.d.CardView_cardMaxElevation, 0.0F);
      this.fk = paramAttributeSet.getBoolean(a.d.CardView_cardUseCompatPadding, false);
      this.Ns = paramAttributeSet.getBoolean(a.d.CardView_cardPreventCornerOverlap, true);
      int i = paramAttributeSet.getDimensionPixelSize(a.d.CardView_contentPadding, 0);
      this.Nv.left = paramAttributeSet.getDimensionPixelSize(a.d.CardView_contentPaddingLeft, i);
      this.Nv.top = paramAttributeSet.getDimensionPixelSize(a.d.CardView_contentPaddingTop, i);
      this.Nv.right = paramAttributeSet.getDimensionPixelSize(a.d.CardView_contentPaddingRight, i);
      this.Nv.bottom = paramAttributeSet.getDimensionPixelSize(a.d.CardView_contentPaddingBottom, i);
      float f1 = f3;
      if (f2 > f3) {
        f1 = f2;
      }
      this.Nt = paramAttributeSet.getDimensionPixelSize(a.d.CardView_android_minWidth, 0);
      this.Nu = paramAttributeSet.getDimensionPixelSize(a.d.CardView_android_minHeight, 0);
      paramAttributeSet.recycle();
      Nr.a(this, paramContext, paramInt, f4, f2, f1);
      return;
      Object localObject = getContext().obtainStyledAttributes(Nq);
      paramInt = ((TypedArray)localObject).getColor(0, 0);
      ((TypedArray)localObject).recycle();
      localObject = new float[3];
      Color.colorToHSV(paramInt, (float[])localObject);
      if (localObject[2] > 0.5F) {
        paramInt = getResources().getColor(a.a.cardview_light_background);
      } else {
        paramInt = getResources().getColor(a.a.cardview_dark_background);
      }
    }
  }
  
  public final void E(int paramInt1, int paramInt2)
  {
    if (paramInt1 > this.Nt) {
      super.setMinimumWidth(paramInt1);
    }
    if (paramInt2 > this.Nu) {
      super.setMinimumHeight(paramInt2);
    }
  }
  
  public final void d(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.Nw.set(paramInt1, paramInt2, paramInt3, paramInt4);
    super.setPadding(this.Nv.left + paramInt1, this.Nv.top + paramInt2, this.Nv.right + paramInt3, this.Nv.bottom + paramInt4);
  }
  
  public float getCardElevation()
  {
    return Nr.e(this);
  }
  
  public int getContentPaddingBottom()
  {
    return this.Nv.bottom;
  }
  
  public int getContentPaddingLeft()
  {
    return this.Nv.left;
  }
  
  public int getContentPaddingRight()
  {
    return this.Nv.right;
  }
  
  public int getContentPaddingTop()
  {
    return this.Nv.top;
  }
  
  public float getMaxCardElevation()
  {
    return Nr.a(this);
  }
  
  public boolean getPreventCornerOverlap()
  {
    return this.Ns;
  }
  
  public float getRadius()
  {
    return Nr.d(this);
  }
  
  public boolean getUseCompatPadding()
  {
    return this.fk;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (!(Nr instanceof n))
    {
      int i = View.MeasureSpec.getMode(paramInt1);
      switch (i)
      {
      default: 
        i = View.MeasureSpec.getMode(paramInt2);
        switch (i)
        {
        }
        break;
      }
      for (;;)
      {
        super.onMeasure(paramInt1, paramInt2);
        return;
        paramInt1 = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(Nr.b(this)), View.MeasureSpec.getSize(paramInt1)), i);
        break;
        paramInt2 = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(Nr.c(this)), View.MeasureSpec.getSize(paramInt2)), i);
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setCardBackgroundColor(int paramInt)
  {
    Nr.a(this, paramInt);
  }
  
  public void setCardElevation(float paramFloat)
  {
    Nr.c(this, paramFloat);
  }
  
  public void setMaxCardElevation(float paramFloat)
  {
    Nr.b(this, paramFloat);
  }
  
  public void setMinimumHeight(int paramInt)
  {
    this.Nu = paramInt;
    super.setMinimumHeight(paramInt);
  }
  
  public void setMinimumWidth(int paramInt)
  {
    this.Nt = paramInt;
    super.setMinimumWidth(paramInt);
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPaddingRelative(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPreventCornerOverlap(boolean paramBoolean)
  {
    if (paramBoolean == this.Ns) {
      return;
    }
    this.Ns = paramBoolean;
    Nr.g(this);
  }
  
  public void setRadius(float paramFloat)
  {
    Nr.a(this, paramFloat);
  }
  
  public void setUseCompatPadding(boolean paramBoolean)
  {
    if (this.fk == paramBoolean) {
      return;
    }
    this.fk = paramBoolean;
    Nr.f(this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/android/support/v7/widget/CardView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */