package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.a.a.f;
import android.support.v7.a.a.k;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class ActionBarContainer
  extends FrameLayout
{
  Drawable HS;
  private View JA;
  private View JB;
  Drawable JC;
  Drawable JD;
  boolean JE;
  boolean JF;
  private boolean Jy;
  private View Jz;
  private int mHeight;
  
  public ActionBarContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject;
    boolean bool;
    if (Build.VERSION.SDK_INT >= 21)
    {
      localObject = new c(this);
      setBackgroundDrawable((Drawable)localObject);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a.k.ActionBar);
      this.HS = paramContext.getDrawable(a.k.ActionBar_background);
      this.JC = paramContext.getDrawable(a.k.ActionBar_backgroundStacked);
      this.mHeight = paramContext.getDimensionPixelSize(a.k.ActionBar_height, -1);
      if (getId() == a.f.split_action_bar)
      {
        this.JE = true;
        this.JD = paramContext.getDrawable(a.k.ActionBar_backgroundSplit);
      }
      paramContext.recycle();
      if (!this.JE) {
        break label143;
      }
      if (this.JD != null) {
        break label138;
      }
      bool = true;
    }
    for (;;)
    {
      setWillNotDraw(bool);
      return;
      localObject = new b(this);
      break;
      label138:
      bool = false;
      continue;
      label143:
      if ((this.HS == null) && (this.JC == null)) {
        bool = true;
      } else {
        bool = false;
      }
    }
  }
  
  private static boolean aK(View paramView)
  {
    return (paramView == null) || (paramView.getVisibility() == 8) || (paramView.getMeasuredHeight() == 0);
  }
  
  private static int aL(View paramView)
  {
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)paramView.getLayoutParams();
    int i = paramView.getMeasuredHeight();
    int j = localLayoutParams.topMargin;
    return localLayoutParams.bottomMargin + (i + j);
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    if ((this.HS != null) && (this.HS.isStateful())) {
      this.HS.setState(getDrawableState());
    }
    if ((this.JC != null) && (this.JC.isStateful())) {
      this.JC.setState(getDrawableState());
    }
    if ((this.JD != null) && (this.JD.isStateful())) {
      this.JD.setState(getDrawableState());
    }
  }
  
  public View getTabContainer()
  {
    return this.Jz;
  }
  
  public void jumpDrawablesToCurrentState()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      super.jumpDrawablesToCurrentState();
      if (this.HS != null) {
        this.HS.jumpToCurrentState();
      }
      if (this.JC != null) {
        this.JC.jumpToCurrentState();
      }
      if (this.JD != null) {
        this.JD.jumpToCurrentState();
      }
    }
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    this.JA = findViewById(a.f.action_bar);
    this.JB = findViewById(a.f.action_context_bar);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return (this.Jy) || (super.onInterceptTouchEvent(paramMotionEvent));
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 1;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    View localView = this.Jz;
    if ((localView != null) && (localView.getVisibility() != 8))
    {
      paramBoolean = true;
      if ((localView != null) && (localView.getVisibility() != 8))
      {
        paramInt2 = getMeasuredHeight();
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
        localView.layout(paramInt1, paramInt2 - localView.getMeasuredHeight() - localLayoutParams.bottomMargin, paramInt3, paramInt2 - localLayoutParams.bottomMargin);
      }
      if (!this.JE) {
        break label143;
      }
      if (this.JD == null) {
        break label323;
      }
      this.JD.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
      paramInt1 = i;
    }
    for (;;)
    {
      if (paramInt1 != 0) {
        invalidate();
      }
      return;
      paramBoolean = false;
      break;
      label143:
      if (this.HS != null) {
        if (this.JA.getVisibility() == 0) {
          this.HS.setBounds(this.JA.getLeft(), this.JA.getTop(), this.JA.getRight(), this.JA.getBottom());
        }
      }
      label195:
      for (paramInt1 = 1;; paramInt1 = 0)
      {
        this.JF = paramBoolean;
        if ((paramBoolean) && (this.JC != null))
        {
          this.JC.setBounds(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
          paramInt1 = i;
          break;
          if ((this.JB != null) && (this.JB.getVisibility() == 0))
          {
            this.HS.setBounds(this.JB.getLeft(), this.JB.getTop(), this.JB.getRight(), this.JB.getBottom());
            break label195;
          }
          this.HS.setBounds(0, 0, 0, 0);
          break label195;
        }
        break;
      }
      label323:
      paramInt1 = 0;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (this.JA == null)
    {
      i = paramInt2;
      if (View.MeasureSpec.getMode(paramInt2) == Integer.MIN_VALUE)
      {
        i = paramInt2;
        if (this.mHeight >= 0) {
          i = View.MeasureSpec.makeMeasureSpec(Math.min(this.mHeight, View.MeasureSpec.getSize(paramInt2)), Integer.MIN_VALUE);
        }
      }
    }
    super.onMeasure(paramInt1, i);
    if (this.JA == null) {}
    do
    {
      return;
      paramInt2 = View.MeasureSpec.getMode(i);
    } while ((this.Jz == null) || (this.Jz.getVisibility() == 8) || (paramInt2 == 1073741824));
    if (!aK(this.JA))
    {
      paramInt1 = aL(this.JA);
      if (paramInt2 != Integer.MIN_VALUE) {
        break label167;
      }
    }
    label167:
    for (paramInt2 = View.MeasureSpec.getSize(i);; paramInt2 = Integer.MAX_VALUE)
    {
      setMeasuredDimension(getMeasuredWidth(), Math.min(paramInt1 + aL(this.Jz), paramInt2));
      return;
      if (!aK(this.JB))
      {
        paramInt1 = aL(this.JB);
        break;
      }
      paramInt1 = 0;
      break;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    super.onTouchEvent(paramMotionEvent);
    return true;
  }
  
  public void setPrimaryBackground(Drawable paramDrawable)
  {
    boolean bool = true;
    if (this.HS != null)
    {
      this.HS.setCallback(null);
      unscheduleDrawable(this.HS);
    }
    this.HS = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if (this.JA != null) {
        this.HS.setBounds(this.JA.getLeft(), this.JA.getTop(), this.JA.getRight(), this.JA.getBottom());
      }
    }
    if (this.JE) {
      if (this.JD != null) {}
    }
    for (;;)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
      bool = false;
      continue;
      if ((this.HS != null) || (this.JC != null)) {
        bool = false;
      }
    }
  }
  
  public void setSplitBackground(Drawable paramDrawable)
  {
    boolean bool = true;
    if (this.JD != null)
    {
      this.JD.setCallback(null);
      unscheduleDrawable(this.JD);
    }
    this.JD = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if ((this.JE) && (this.JD != null)) {
        this.JD.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
      }
    }
    if (this.JE) {
      if (this.JD != null) {}
    }
    for (;;)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
      bool = false;
      continue;
      if ((this.HS != null) || (this.JC != null)) {
        bool = false;
      }
    }
  }
  
  public void setStackedBackground(Drawable paramDrawable)
  {
    boolean bool = true;
    if (this.JC != null)
    {
      this.JC.setCallback(null);
      unscheduleDrawable(this.JC);
    }
    this.JC = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      if ((this.JF) && (this.JC != null)) {
        this.JC.setBounds(this.Jz.getLeft(), this.Jz.getTop(), this.Jz.getRight(), this.Jz.getBottom());
      }
    }
    if (this.JE) {
      if (this.JD != null) {}
    }
    for (;;)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
      bool = false;
      continue;
      if ((this.HS != null) || (this.JC != null)) {
        bool = false;
      }
    }
  }
  
  public void setTabContainer(ai paramai)
  {
    if (this.Jz != null) {
      removeView(this.Jz);
    }
    this.Jz = paramai;
    if (paramai != null)
    {
      addView(paramai);
      ViewGroup.LayoutParams localLayoutParams = paramai.getLayoutParams();
      localLayoutParams.width = -1;
      localLayoutParams.height = -2;
      paramai.setAllowCollapse(false);
    }
  }
  
  public void setTransitioning(boolean paramBoolean)
  {
    this.Jy = paramBoolean;
    if (paramBoolean) {}
    for (int i = 393216;; i = 262144)
    {
      setDescendantFocusability(i);
      return;
    }
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      if (this.HS != null) {
        this.HS.setVisible(bool, false);
      }
      if (this.JC != null) {
        this.JC.setVisible(bool, false);
      }
      if (this.JD != null) {
        this.JD.setVisible(bool, false);
      }
      return;
    }
  }
  
  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return ((paramDrawable == this.HS) && (!this.JE)) || ((paramDrawable == this.JC) && (this.JF)) || ((paramDrawable == this.JD) && (this.JE)) || (super.verifyDrawable(paramDrawable));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/widget/ActionBarContainer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */