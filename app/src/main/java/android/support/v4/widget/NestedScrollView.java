package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.a.b;
import android.support.v4.view.a.f;
import android.support.v4.view.a.f.c;
import android.support.v4.view.o;
import android.support.v4.view.p;
import android.support.v4.view.r;
import android.support.v4.view.s;
import android.support.v4.view.w;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.List;

public class NestedScrollView
  extends FrameLayout
  implements p, r, w
{
  private static final a AP = new a();
  private static final int[] AQ = { 16843130 };
  private long AD;
  private i AE;
  private i AF;
  private boolean AG = true;
  private boolean AH = false;
  private View AI = null;
  private boolean AJ;
  private boolean AK = true;
  private final int[] AL = new int[2];
  private final int[] AM = new int[2];
  private int AN;
  private SavedState AO;
  private final s AR;
  private final android.support.v4.view.q AS;
  private float AT;
  private b AU;
  private final Rect bJ = new Rect();
  private VelocityTracker cE;
  private int cF = -1;
  private q fT = q.a(getContext(), null);
  private boolean fU = false;
  private int fV;
  private int fW;
  private int wy;
  private int wz;
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NestedScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setFocusable(true);
    setDescendantFocusability(262144);
    setWillNotDraw(false);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    this.fW = localViewConfiguration.getScaledTouchSlop();
    this.wy = localViewConfiguration.getScaledMinimumFlingVelocity();
    this.wz = localViewConfiguration.getScaledMaximumFlingVelocity();
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, AQ, paramInt, 0);
    setFillViewport(paramContext.getBoolean(0, false));
    paramContext.recycle();
    this.AR = new s(this);
    this.AS = new android.support.v4.view.q(this);
    setNestedScrollingEnabled(true);
    z.a(this, AP);
  }
  
  private static boolean a(View paramView1, View paramView2)
  {
    if (paramView1 == paramView2) {
      return true;
    }
    paramView1 = paramView1.getParent();
    return ((paramView1 instanceof ViewGroup)) && (a((View)paramView1, paramView2));
  }
  
  private boolean aB(View paramView)
  {
    boolean bool = false;
    if (!c(paramView, 0, getHeight())) {
      bool = true;
    }
    return bool;
  }
  
  private void aC(View paramView)
  {
    paramView.getDrawingRect(this.bJ);
    offsetDescendantRectToMyCoords(paramView, this.bJ);
    int i = computeScrollDeltaToGetChildRectOnScreen(this.bJ);
    if (i != 0) {
      scrollBy(0, i);
    }
  }
  
  private boolean arrowScroll(int paramInt)
  {
    View localView2 = findFocus();
    View localView1 = localView2;
    if (localView2 == this) {
      localView1 = null;
    }
    localView2 = FocusFinder.getInstance().findNextFocus(this, localView1, paramInt);
    int j = getMaxScrollAmount();
    if ((localView2 != null) && (c(localView2, j, getHeight())))
    {
      localView2.getDrawingRect(this.bJ);
      offsetDescendantRectToMyCoords(localView2, this.bJ);
      aw(computeScrollDeltaToGetChildRectOnScreen(this.bJ));
      localView2.requestFocus(paramInt);
      if ((localView1 != null) && (localView1.isFocused()) && (aB(localView1)))
      {
        paramInt = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(paramInt);
      }
      return true;
    }
    int i;
    if ((paramInt == 33) && (getScrollY() < j)) {
      i = getScrollY();
    }
    while (i == 0)
    {
      return false;
      i = j;
      if (paramInt == 130)
      {
        i = j;
        if (getChildCount() > 0)
        {
          int k = getChildAt(0).getBottom();
          int m = getScrollY() + getHeight() - getPaddingBottom();
          i = j;
          if (k - m < j) {
            i = k - m;
          }
        }
      }
    }
    if (paramInt == 130) {}
    for (;;)
    {
      aw(i);
      break;
      i = -i;
    }
  }
  
  private void aw(int paramInt)
  {
    if (paramInt != 0)
    {
      if (this.AK) {
        smoothScrollBy(0, paramInt);
      }
    }
    else {
      return;
    }
    scrollBy(0, paramInt);
  }
  
  private void ay(int paramInt)
  {
    int i = getScrollY();
    if (((i > 0) || (paramInt > 0)) && ((i < getScrollRange()) || (paramInt < 0))) {}
    for (boolean bool = true;; bool = false)
    {
      if (!dispatchNestedPreFling(0.0F, paramInt))
      {
        dispatchNestedFling(0.0F, paramInt, bool);
        if (bool) {
          fling(paramInt);
        }
      }
      return;
    }
  }
  
  private boolean c(View paramView, int paramInt1, int paramInt2)
  {
    paramView.getDrawingRect(this.bJ);
    offsetDescendantRectToMyCoords(paramView, this.bJ);
    return (this.bJ.bottom + paramInt1 >= getScrollY()) && (this.bJ.top - paramInt1 <= getScrollY() + paramInt2);
  }
  
  private void cN()
  {
    if (this.cE == null) {
      this.cE = VelocityTracker.obtain();
    }
  }
  
  private void cO()
  {
    if (this.cE != null)
    {
      this.cE.recycle();
      this.cE = null;
    }
  }
  
  private void cP()
  {
    this.fU = false;
    cO();
    stopNestedScroll();
    if (this.AE != null)
    {
      this.AE.cI();
      this.AF.cI();
    }
  }
  
  private void cQ()
  {
    if (z.B(this) != 2)
    {
      if (this.AE == null)
      {
        Context localContext = getContext();
        this.AE = new i(localContext);
        this.AF = new i(localContext);
      }
      return;
    }
    this.AE = null;
    this.AF = null;
  }
  
  private static int clamp(int paramInt1, int paramInt2, int paramInt3)
  {
    int i;
    if ((paramInt2 >= paramInt3) || (paramInt1 < 0)) {
      i = 0;
    }
    do
    {
      return i;
      i = paramInt1;
    } while (paramInt2 + paramInt1 <= paramInt3);
    return paramInt3 - paramInt2;
  }
  
  private int computeScrollDeltaToGetChildRectOnScreen(Rect paramRect)
  {
    if (getChildCount() == 0) {
      return 0;
    }
    int m = getHeight();
    int i = getScrollY();
    int k = i + m;
    int n = getVerticalFadingEdgeLength();
    int j = i;
    if (paramRect.top > 0) {
      j = i + n;
    }
    i = k;
    if (paramRect.bottom < getChildAt(0).getHeight()) {
      i = k - n;
    }
    if ((paramRect.bottom > i) && (paramRect.top > j)) {
      if (paramRect.height() > m)
      {
        j = paramRect.top - j + 0;
        i = Math.min(j, getChildAt(0).getBottom() - i);
      }
    }
    for (;;)
    {
      return i;
      j = paramRect.bottom - i + 0;
      break;
      if ((paramRect.top < j) && (paramRect.bottom < i))
      {
        if (paramRect.height() > m) {}
        for (i = 0 - (i - paramRect.bottom);; i = 0 - (j - paramRect.top))
        {
          i = Math.max(i, -getScrollY());
          break;
        }
      }
      i = 0;
    }
  }
  
  private boolean d(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    boolean bool3 = false;
    z.B(this);
    computeHorizontalScrollRange();
    computeHorizontalScrollExtent();
    computeVerticalScrollRange();
    computeVerticalScrollExtent();
    paramInt1 = paramInt3 + paramInt1;
    paramInt2 = paramInt4 + paramInt2;
    paramInt3 = paramInt5 + 0;
    boolean bool1;
    if (paramInt1 > 0)
    {
      bool1 = true;
      paramInt1 = 0;
    }
    for (;;)
    {
      boolean bool2;
      if (paramInt2 > paramInt3)
      {
        bool2 = true;
        paramInt2 = paramInt3;
      }
      for (;;)
      {
        if (bool2) {
          this.fT.i(paramInt1, paramInt2, getScrollRange());
        }
        onOverScrolled(paramInt1, paramInt2, bool1, bool2);
        if (!bool1)
        {
          bool1 = bool3;
          if (!bool2) {}
        }
        else
        {
          bool1 = true;
        }
        return bool1;
        if (paramInt1 >= 0) {
          break label140;
        }
        bool1 = true;
        paramInt1 = 0;
        break;
        if (paramInt2 < 0)
        {
          bool2 = true;
          paramInt2 = 0;
        }
        else
        {
          bool2 = false;
        }
      }
      label140:
      bool1 = false;
    }
  }
  
  private boolean fullScroll(int paramInt)
  {
    if (paramInt == 130) {}
    for (int i = 1;; i = 0)
    {
      int j = getHeight();
      this.bJ.top = 0;
      this.bJ.bottom = j;
      if (i != 0)
      {
        i = getChildCount();
        if (i > 0)
        {
          View localView = getChildAt(i - 1);
          this.bJ.bottom = (localView.getBottom() + getPaddingBottom());
          this.bJ.top = (this.bJ.bottom - j);
        }
      }
      return h(paramInt, this.bJ.top, this.bJ.bottom);
    }
  }
  
  private int getScrollRange()
  {
    int i = 0;
    if (getChildCount() > 0) {
      i = Math.max(0, getChildAt(0).getHeight() - (getHeight() - getPaddingBottom() - getPaddingTop()));
    }
    return i;
  }
  
  private float getVerticalScrollFactorCompat()
  {
    if (this.AT == 0.0F)
    {
      TypedValue localTypedValue = new TypedValue();
      Context localContext = getContext();
      if (!localContext.getTheme().resolveAttribute(16842829, localTypedValue, true)) {
        throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
      }
      this.AT = localTypedValue.getDimension(localContext.getResources().getDisplayMetrics());
    }
    return this.AT;
  }
  
  private void h(MotionEvent paramMotionEvent)
  {
    int i = (paramMotionEvent.getAction() & 0xFF00) >> 8;
    if (o.c(paramMotionEvent, i) == this.cF) {
      if (i != 0) {
        break label64;
      }
    }
    label64:
    for (i = 1;; i = 0)
    {
      this.fV = ((int)o.e(paramMotionEvent, i));
      this.cF = o.c(paramMotionEvent, i);
      if (this.cE != null) {
        this.cE.clear();
      }
      return;
    }
  }
  
  private boolean h(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = getHeight();
    int i1 = getScrollY();
    int i2 = i1 + i;
    int k;
    Object localObject1;
    int m;
    label53:
    Object localObject2;
    int n;
    int i4;
    int j;
    if (paramInt1 == 33)
    {
      k = 1;
      ArrayList localArrayList = getFocusables(2);
      localObject1 = null;
      i = 0;
      int i3 = localArrayList.size();
      m = 0;
      if (m >= i3) {
        break label237;
      }
      localObject2 = (View)localArrayList.get(m);
      n = ((View)localObject2).getTop();
      i4 = ((View)localObject2).getBottom();
      if ((paramInt2 >= i4) || (n >= paramInt3)) {
        break label312;
      }
      if ((paramInt2 >= n) || (i4 >= paramInt3)) {
        break label143;
      }
      j = 1;
      label115:
      if (localObject1 != null) {
        break label149;
      }
      i = j;
      localObject1 = localObject2;
    }
    label143:
    label149:
    label210:
    label237:
    label312:
    for (;;)
    {
      m += 1;
      break label53;
      k = 0;
      break;
      j = 0;
      break label115;
      if (((k != 0) && (n < ((View)localObject1).getTop())) || ((k == 0) && (i4 > ((View)localObject1).getBottom()))) {}
      for (n = 1;; n = 0)
      {
        if (i == 0) {
          break label210;
        }
        if ((j == 0) || (n == 0)) {
          break label312;
        }
        localObject1 = localObject2;
        break;
      }
      if (j != 0)
      {
        i = 1;
        localObject1 = localObject2;
      }
      else if (n != 0)
      {
        localObject1 = localObject2;
        continue;
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = this;
        }
        boolean bool;
        if ((paramInt2 >= i1) && (paramInt3 <= i2))
        {
          bool = false;
          if (localObject2 != findFocus()) {
            ((View)localObject2).requestFocus(paramInt1);
          }
          return bool;
        }
        if (k != 0) {
          paramInt2 -= i1;
        }
        for (;;)
        {
          aw(paramInt2);
          bool = true;
          break;
          paramInt2 = paramInt3 - i2;
        }
      }
    }
  }
  
  private void smoothScrollBy(int paramInt1, int paramInt2)
  {
    if (getChildCount() == 0) {
      return;
    }
    if (AnimationUtils.currentAnimationTimeMillis() - this.AD > 250L)
    {
      paramInt1 = getHeight();
      int i = getPaddingBottom();
      int j = getPaddingTop();
      i = Math.max(0, getChildAt(0).getHeight() - (paramInt1 - i - j));
      paramInt1 = getScrollY();
      paramInt2 = Math.max(0, Math.min(paramInt1 + paramInt2, i));
      q localq = this.fT;
      i = getScrollX();
      localq.Be.a(localq.Bd, i, paramInt1, paramInt2 - paramInt1);
      z.E(this);
    }
    for (;;)
    {
      this.AD = AnimationUtils.currentAnimationTimeMillis();
      return;
      if (!this.fT.isFinished()) {
        this.fT.abortAnimation();
      }
      scrollBy(paramInt1, paramInt2);
    }
  }
  
  public void addView(View paramView)
  {
    if (getChildCount() > 0) {
      throw new IllegalStateException("ScrollView can host only one direct child");
    }
    super.addView(paramView);
  }
  
  public void addView(View paramView, int paramInt)
  {
    if (getChildCount() > 0) {
      throw new IllegalStateException("ScrollView can host only one direct child");
    }
    super.addView(paramView, paramInt);
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (getChildCount() > 0) {
      throw new IllegalStateException("ScrollView can host only one direct child");
    }
    super.addView(paramView, paramInt, paramLayoutParams);
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (getChildCount() > 0) {
      throw new IllegalStateException("ScrollView can host only one direct child");
    }
    super.addView(paramView, paramLayoutParams);
  }
  
  public final void ax(int paramInt)
  {
    smoothScrollBy(0 - getScrollX(), paramInt - getScrollY());
  }
  
  public int computeHorizontalScrollExtent()
  {
    return super.computeHorizontalScrollExtent();
  }
  
  public int computeHorizontalScrollOffset()
  {
    return super.computeHorizontalScrollOffset();
  }
  
  public int computeHorizontalScrollRange()
  {
    return super.computeHorizontalScrollRange();
  }
  
  public void computeScroll()
  {
    int k;
    int n;
    int i1;
    int i;
    if (this.fT.computeScrollOffset())
    {
      int j = getScrollX();
      k = getScrollY();
      int m = this.fT.getCurrX();
      n = this.fT.getCurrY();
      if ((j != m) || (k != n))
      {
        i1 = getScrollRange();
        i = z.B(this);
        if ((i != 0) && ((i != 1) || (i1 <= 0))) {
          break label128;
        }
        i = 1;
        d(m - j, n - k, j, k, i1);
        if (i != 0)
        {
          cQ();
          if ((n > 0) || (k <= 0)) {
            break label133;
          }
          this.AE.at((int)this.fT.getCurrVelocity());
        }
      }
    }
    label128:
    label133:
    while ((n < i1) || (k >= i1))
    {
      return;
      i = 0;
      break;
    }
    this.AF.at((int)this.fT.getCurrVelocity());
  }
  
  public int computeVerticalScrollExtent()
  {
    return super.computeVerticalScrollExtent();
  }
  
  public int computeVerticalScrollOffset()
  {
    return Math.max(0, super.computeVerticalScrollOffset());
  }
  
  public int computeVerticalScrollRange()
  {
    int j = getChildCount();
    int i = getHeight() - getPaddingBottom() - getPaddingTop();
    if (j == 0) {}
    int k;
    int m;
    do
    {
      return i;
      j = getChildAt(0).getBottom();
      k = getScrollY();
      m = Math.max(0, j - i);
      if (k < 0) {
        return j - k;
      }
      i = j;
    } while (k <= m);
    return j + (k - m);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    return (super.dispatchKeyEvent(paramKeyEvent)) || (executeKeyEvent(paramKeyEvent));
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return this.AS.dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return this.AS.dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return this.AS.dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return this.AS.dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if (this.AE != null)
    {
      int i = getScrollY();
      int j;
      int k;
      int m;
      if (!this.AE.isFinished())
      {
        j = paramCanvas.save();
        k = getWidth();
        m = getPaddingLeft();
        int n = getPaddingRight();
        paramCanvas.translate(getPaddingLeft(), Math.min(0, i));
        this.AE.setSize(k - m - n, getHeight());
        if (this.AE.draw(paramCanvas)) {
          z.E(this);
        }
        paramCanvas.restoreToCount(j);
      }
      if (!this.AF.isFinished())
      {
        j = paramCanvas.save();
        k = getWidth() - getPaddingLeft() - getPaddingRight();
        m = getHeight();
        paramCanvas.translate(-k + getPaddingLeft(), Math.max(getScrollRange(), i) + m);
        paramCanvas.rotate(180.0F, k, 0.0F);
        this.AF.setSize(k, m);
        if (this.AF.draw(paramCanvas)) {
          z.E(this);
        }
        paramCanvas.restoreToCount(j);
      }
    }
  }
  
  public final boolean executeKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool2 = false;
    this.bJ.setEmpty();
    View localView = getChildAt(0);
    int i;
    boolean bool1;
    if (localView != null)
    {
      i = localView.getHeight();
      if (getHeight() < i + getPaddingTop() + getPaddingBottom())
      {
        i = 1;
        if (i != 0) {
          break label151;
        }
        bool1 = bool2;
        if (isFocused())
        {
          bool1 = bool2;
          if (paramKeyEvent.getKeyCode() != 4)
          {
            localView = findFocus();
            paramKeyEvent = localView;
            if (localView == this) {
              paramKeyEvent = null;
            }
            paramKeyEvent = FocusFinder.getInstance().findNextFocus(this, paramKeyEvent, 130);
            bool1 = bool2;
            if (paramKeyEvent != null)
            {
              bool1 = bool2;
              if (paramKeyEvent != this)
              {
                bool1 = bool2;
                if (paramKeyEvent.requestFocus(130)) {
                  bool1 = true;
                }
              }
            }
          }
        }
      }
    }
    label151:
    do
    {
      return bool1;
      i = 0;
      break;
      i = 0;
      break;
      bool1 = bool2;
    } while (paramKeyEvent.getAction() != 0);
    switch (paramKeyEvent.getKeyCode())
    {
    default: 
      return false;
    case 19: 
      if (!paramKeyEvent.isAltPressed()) {
        return arrowScroll(33);
      }
      return fullScroll(33);
    case 20: 
      if (!paramKeyEvent.isAltPressed()) {
        return arrowScroll(130);
      }
      return fullScroll(130);
    }
    int j;
    label265:
    int k;
    if (paramKeyEvent.isShiftPressed())
    {
      i = 33;
      if (i != 130) {
        break label383;
      }
      j = 1;
      k = getHeight();
      if (j == 0) {
        break label388;
      }
      this.bJ.top = (getScrollY() + k);
      j = getChildCount();
      if (j > 0)
      {
        paramKeyEvent = getChildAt(j - 1);
        if (this.bJ.top + k > paramKeyEvent.getBottom()) {
          this.bJ.top = (paramKeyEvent.getBottom() - k);
        }
      }
    }
    for (;;)
    {
      this.bJ.bottom = (k + this.bJ.top);
      h(i, this.bJ.top, this.bJ.bottom);
      return false;
      i = 130;
      break;
      label383:
      j = 0;
      break label265;
      label388:
      this.bJ.top = (getScrollY() - k);
      if (this.bJ.top < 0) {
        this.bJ.top = 0;
      }
    }
  }
  
  public void fling(int paramInt)
  {
    if (getChildCount() > 0)
    {
      int k = getHeight() - getPaddingBottom() - getPaddingTop();
      int m = getChildAt(0).getHeight();
      q localq = this.fT;
      int i = getScrollX();
      int j = getScrollY();
      m = Math.max(0, m - k);
      k /= 2;
      localq.Be.b(localq.Bd, i, j, paramInt, m, k);
      z.E(this);
    }
  }
  
  protected float getBottomFadingEdgeStrength()
  {
    if (getChildCount() == 0) {
      return 0.0F;
    }
    int i = getVerticalFadingEdgeLength();
    int j = getHeight();
    int k = getPaddingBottom();
    j = getChildAt(0).getBottom() - getScrollY() - (j - k);
    if (j < i) {
      return j / i;
    }
    return 1.0F;
  }
  
  public int getMaxScrollAmount()
  {
    return (int)(0.5F * getHeight());
  }
  
  public int getNestedScrollAxes()
  {
    return this.AR.uX;
  }
  
  protected float getTopFadingEdgeStrength()
  {
    if (getChildCount() == 0) {
      return 0.0F;
    }
    int i = getVerticalFadingEdgeLength();
    int j = getScrollY();
    if (j < i) {
      return j / i;
    }
    return 1.0F;
  }
  
  public boolean hasNestedScrollingParent()
  {
    return this.AS.hasNestedScrollingParent();
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return this.AS.uU;
  }
  
  protected void measureChild(View paramView, int paramInt1, int paramInt2)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    paramView.measure(getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight(), localLayoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
  }
  
  protected void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    paramInt1 = getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight() + localMarginLayoutParams.leftMargin + localMarginLayoutParams.rightMargin + paramInt2, localMarginLayoutParams.width);
    paramInt2 = localMarginLayoutParams.topMargin;
    paramView.measure(paramInt1, View.MeasureSpec.makeMeasureSpec(localMarginLayoutParams.bottomMargin + paramInt2, 0));
  }
  
  public void onAttachedToWindow()
  {
    this.AH = false;
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if ((o.g(paramMotionEvent) & 0x2) != 0) {
      switch (paramMotionEvent.getAction())
      {
      }
    }
    for (;;)
    {
      return false;
      if (!this.fU)
      {
        float f = o.f(paramMotionEvent, 9);
        if (f != 0.0F)
        {
          int i = (int)(f * getVerticalScrollFactorCompat());
          int j = getScrollRange();
          int m = getScrollY();
          int k = m - i;
          if (k < 0) {
            i = 0;
          }
          while (i != m)
          {
            super.scrollTo(getScrollX(), i);
            return true;
            i = j;
            if (k <= j) {
              i = k;
            }
          }
        }
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    int i = paramMotionEvent.getAction();
    if ((i == 2) && (this.fU)) {
      return true;
    }
    switch (i & 0xFF)
    {
    }
    for (;;)
    {
      return this.fU;
      i = this.cF;
      if (i != -1)
      {
        int j = o.b(paramMotionEvent, i);
        if (j == -1)
        {
          new StringBuilder("Invalid pointerId=").append(i).append(" in onInterceptTouchEvent");
        }
        else
        {
          i = (int)o.e(paramMotionEvent, j);
          if ((Math.abs(i - this.fV) > this.fW) && ((getNestedScrollAxes() & 0x2) == 0))
          {
            this.fU = true;
            this.fV = i;
            cN();
            this.cE.addMovement(paramMotionEvent);
            this.AN = 0;
            paramMotionEvent = getParent();
            if (paramMotionEvent != null)
            {
              paramMotionEvent.requestDisallowInterceptTouchEvent(true);
              continue;
              j = (int)paramMotionEvent.getY();
              i = (int)paramMotionEvent.getX();
              if (getChildCount() > 0)
              {
                int k = getScrollY();
                View localView = getChildAt(0);
                if ((j >= localView.getTop() - k) && (j < localView.getBottom() - k) && (i >= localView.getLeft()) && (i < localView.getRight())) {
                  i = 1;
                }
              }
              for (;;)
              {
                if (i != 0) {
                  break label298;
                }
                this.fU = false;
                cO();
                break;
                i = 0;
                continue;
                i = 0;
              }
              label298:
              this.fV = j;
              this.cF = o.c(paramMotionEvent, 0);
              if (this.cE == null)
              {
                this.cE = VelocityTracker.obtain();
                label326:
                this.cE.addMovement(paramMotionEvent);
                this.fT.computeScrollOffset();
                if (this.fT.isFinished()) {
                  break label377;
                }
              }
              for (;;)
              {
                this.fU = bool;
                startNestedScroll(2);
                break;
                this.cE.clear();
                break label326;
                label377:
                bool = false;
              }
              this.fU = false;
              this.cF = -1;
              cO();
              if (this.fT.i(getScrollX(), getScrollY(), getScrollRange())) {
                z.E(this);
              }
              stopNestedScroll();
              continue;
              h(paramMotionEvent);
            }
          }
        }
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    this.AG = false;
    if ((this.AI != null) && (a(this.AI, this))) {
      aC(this.AI);
    }
    this.AI = null;
    if (!this.AH)
    {
      if (this.AO != null)
      {
        scrollTo(getScrollX(), this.AO.AV);
        this.AO = null;
      }
      if (getChildCount() <= 0) {
        break label153;
      }
      paramInt1 = getChildAt(0).getMeasuredHeight();
      paramInt1 = Math.max(0, paramInt1 - (paramInt4 - paramInt2 - getPaddingBottom() - getPaddingTop()));
      if (getScrollY() <= paramInt1) {
        break label158;
      }
      scrollTo(getScrollX(), paramInt1);
    }
    for (;;)
    {
      scrollTo(getScrollX(), getScrollY());
      this.AH = true;
      return;
      label153:
      paramInt1 = 0;
      break;
      label158:
      if (getScrollY() < 0) {
        scrollTo(getScrollX(), 0);
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if (!this.AJ) {}
    View localView;
    do
    {
      do
      {
        return;
      } while ((View.MeasureSpec.getMode(paramInt2) == 0) || (getChildCount() <= 0));
      localView = getChildAt(0);
      paramInt2 = getMeasuredHeight();
    } while (localView.getMeasuredHeight() >= paramInt2);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
    localView.measure(getChildMeasureSpec(paramInt1, getPaddingLeft() + getPaddingRight(), localLayoutParams.width), View.MeasureSpec.makeMeasureSpec(paramInt2 - getPaddingTop() - getPaddingBottom(), 1073741824));
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      ay((int)paramFloat2);
      return true;
    }
    return false;
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2)
  {
    return dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    dispatchNestedPreScroll(paramInt1, paramInt2, paramArrayOfInt, null);
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 = getScrollY();
    scrollBy(0, paramInt4);
    paramInt1 = getScrollY() - paramInt1;
    dispatchNestedScroll(0, paramInt1, 0, paramInt4 - paramInt1, null);
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt)
  {
    this.AR.uX = paramInt;
    startNestedScroll(2);
  }
  
  protected void onOverScrolled(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    super.scrollTo(paramInt1, paramInt2);
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int i;
    View localView;
    if (paramInt == 2)
    {
      i = 130;
      if (paramRect != null) {
        break label44;
      }
      localView = FocusFinder.getInstance().findNextFocus(this, null, i);
      label24:
      if (localView != null) {
        break label58;
      }
    }
    label44:
    label58:
    while (aB(localView))
    {
      return false;
      i = paramInt;
      if (paramInt != 1) {
        break;
      }
      i = 33;
      break;
      localView = FocusFinder.getInstance().findNextFocusFromRect(this, paramRect, i);
      break label24;
    }
    return localView.requestFocus(i, paramRect);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    this.AO = paramParcelable;
    requestLayout();
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    localSavedState.AV = getScrollY();
    return localSavedState;
  }
  
  public void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.AU != null) {
      this.AU.b(this);
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    View localView = findFocus();
    if ((localView == null) || (this == localView)) {}
    while (!c(localView, 0, paramInt4)) {
      return;
    }
    localView.getDrawingRect(this.bJ);
    offsetDescendantRectToMyCoords(localView, this.bJ);
    aw(computeScrollDeltaToGetChildRectOnScreen(this.bJ));
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt)
  {
    return (paramInt & 0x2) != 0;
  }
  
  public void onStopNestedScroll(View paramView)
  {
    this.AR.uX = 0;
    stopNestedScroll();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    cN();
    MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
    int i = o.d(paramMotionEvent);
    if (i == 0) {
      this.AN = 0;
    }
    localMotionEvent.offsetLocation(0.0F, this.AN);
    int k;
    int m;
    int j;
    switch (i)
    {
    case 4: 
    default: 
    case 0: 
    case 2: 
      ViewParent localViewParent;
      for (;;)
      {
        if (this.cE != null) {
          this.cE.addMovement(localMotionEvent);
        }
        localMotionEvent.recycle();
        return true;
        if (getChildCount() == 0) {
          return false;
        }
        if (!this.fT.isFinished()) {}
        for (boolean bool = true;; bool = false)
        {
          this.fU = bool;
          if (bool)
          {
            localViewParent = getParent();
            if (localViewParent != null) {
              localViewParent.requestDisallowInterceptTouchEvent(true);
            }
          }
          if (!this.fT.isFinished()) {
            this.fT.abortAnimation();
          }
          this.fV = ((int)paramMotionEvent.getY());
          this.cF = o.c(paramMotionEvent, 0);
          startNestedScroll(2);
          break;
        }
        k = o.b(paramMotionEvent, this.cF);
        if (k != -1) {
          break;
        }
        new StringBuilder("Invalid pointerId=").append(this.cF).append(" in onTouchEvent");
      }
      m = (int)o.e(paramMotionEvent, k);
      j = this.fV - m;
      i = j;
      if (dispatchNestedPreScroll(0, j, this.AM, this.AL))
      {
        i = j - this.AM[1];
        localMotionEvent.offsetLocation(0.0F, this.AL[1]);
        this.AN += this.AL[1];
      }
      if ((!this.fU) && (Math.abs(i) > this.fW))
      {
        localViewParent = getParent();
        if (localViewParent != null) {
          localViewParent.requestDisallowInterceptTouchEvent(true);
        }
        this.fU = true;
        if (i > 0) {
          i -= this.fW;
        }
      }
      break;
    }
    label374:
    while (this.fU)
    {
      this.fV = (m - this.AL[1]);
      int n = getScrollY();
      m = getScrollRange();
      j = z.B(this);
      if ((j == 0) || ((j == 1) && (m > 0))) {}
      for (j = 1;; j = 0)
      {
        if ((d(0, i, 0, getScrollY(), m)) && (!hasNestedScrollingParent())) {
          this.cE.clear();
        }
        int i1 = getScrollY() - n;
        if (!dispatchNestedScroll(0, i1, 0, i - i1, this.AL)) {
          break label546;
        }
        this.fV -= this.AL[1];
        localMotionEvent.offsetLocation(0.0F, this.AL[1]);
        this.AN += this.AL[1];
        break;
        i += this.fW;
        break label374;
      }
      label546:
      if (j == 0) {
        break;
      }
      cQ();
      j = n + i;
      if (j < 0)
      {
        this.AE.s(i / getHeight(), o.d(paramMotionEvent, k) / getWidth());
        if (!this.AF.isFinished()) {
          this.AF.cI();
        }
      }
      while ((this.AE != null) && ((!this.AE.isFinished()) || (!this.AF.isFinished())))
      {
        z.E(this);
        break;
        if (j > m)
        {
          this.AF.s(i / getHeight(), 1.0F - o.d(paramMotionEvent, k) / getWidth());
          if (!this.AE.isFinished()) {
            this.AE.cI();
          }
        }
      }
      if (this.fU)
      {
        paramMotionEvent = this.cE;
        paramMotionEvent.computeCurrentVelocity(1000, this.wz);
        i = (int)y.b(paramMotionEvent, this.cF);
        if (Math.abs(i) <= this.wy) {
          break label763;
        }
        ay(-i);
      }
      for (;;)
      {
        this.cF = -1;
        cP();
        break;
        label763:
        if (this.fT.i(getScrollX(), getScrollY(), getScrollRange())) {
          z.E(this);
        }
      }
      if ((this.fU) && (getChildCount() > 0) && (this.fT.i(getScrollX(), getScrollY(), getScrollRange()))) {
        z.E(this);
      }
      this.cF = -1;
      cP();
      break;
      i = o.e(paramMotionEvent);
      this.fV = ((int)o.e(paramMotionEvent, i));
      this.cF = o.c(paramMotionEvent, i);
      break;
      h(paramMotionEvent);
      this.fV = ((int)o.e(paramMotionEvent, o.b(paramMotionEvent, this.cF)));
      break;
    }
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    if (!this.AG) {
      aC(paramView2);
    }
    for (;;)
    {
      super.requestChildFocus(paramView1, paramView2);
      return;
      this.AI = paramView2;
    }
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    paramRect.offset(paramView.getLeft() - paramView.getScrollX(), paramView.getTop() - paramView.getScrollY());
    int i = computeScrollDeltaToGetChildRectOnScreen(paramRect);
    if (i != 0) {}
    for (boolean bool = true;; bool = false)
    {
      if (bool)
      {
        if (!paramBoolean) {
          break;
        }
        scrollBy(0, i);
      }
      return bool;
    }
    smoothScrollBy(0, i);
    return bool;
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    if (paramBoolean) {
      cO();
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout()
  {
    this.AG = true;
    super.requestLayout();
  }
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    if (getChildCount() > 0)
    {
      View localView = getChildAt(0);
      paramInt1 = clamp(paramInt1, getWidth() - getPaddingRight() - getPaddingLeft(), localView.getWidth());
      paramInt2 = clamp(paramInt2, getHeight() - getPaddingBottom() - getPaddingTop(), localView.getHeight());
      if ((paramInt1 != getScrollX()) || (paramInt2 != getScrollY())) {
        super.scrollTo(paramInt1, paramInt2);
      }
    }
  }
  
  public void setFillViewport(boolean paramBoolean)
  {
    if (paramBoolean != this.AJ)
    {
      this.AJ = paramBoolean;
      requestLayout();
    }
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    this.AS.setNestedScrollingEnabled(paramBoolean);
  }
  
  public void setOnScrollChangeListener(b paramb)
  {
    this.AU = paramb;
  }
  
  public void setSmoothScrollingEnabled(boolean paramBoolean)
  {
    this.AK = paramBoolean;
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return true;
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return this.AS.startNestedScroll(paramInt);
  }
  
  public void stopNestedScroll()
  {
    this.AS.stopNestedScroll();
  }
  
  static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator() {};
    public int AV;
    
    public SavedState(Parcel paramParcel)
    {
      super();
      this.AV = paramParcel.readInt();
    }
    
    SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public String toString()
    {
      return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.AV + "}";
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.AV);
    }
  }
  
  static final class a
    extends android.support.v4.view.a
  {
    public final void a(View paramView, b paramb)
    {
      super.a(paramView, paramb);
      paramView = (NestedScrollView)paramView;
      paramb.setClassName(ScrollView.class.getName());
      if (paramView.isEnabled())
      {
        int i = NestedScrollView.a(paramView);
        if (i > 0)
        {
          paramb.setScrollable(true);
          if (paramView.getScrollY() > 0) {
            paramb.addAction(8192);
          }
          if (paramView.getScrollY() < i) {
            paramb.addAction(4096);
          }
        }
      }
    }
    
    public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramView = (NestedScrollView)paramView;
      paramAccessibilityEvent.setClassName(ScrollView.class.getName());
      paramAccessibilityEvent = android.support.v4.view.a.a.a(paramAccessibilityEvent);
      if (NestedScrollView.a(paramView) > 0) {}
      for (boolean bool = true;; bool = false)
      {
        paramAccessibilityEvent.setScrollable(bool);
        int i = paramView.getScrollX();
        f.xX.f(paramAccessibilityEvent.xY, i);
        i = paramView.getScrollY();
        f.xX.g(paramAccessibilityEvent.xY, i);
        i = paramView.getScrollX();
        f.xX.i(paramAccessibilityEvent.xY, i);
        i = NestedScrollView.a(paramView);
        f.xX.j(paramAccessibilityEvent.xY, i);
        return;
      }
    }
    
    public final boolean performAccessibilityAction(View paramView, int paramInt, Bundle paramBundle)
    {
      if (super.performAccessibilityAction(paramView, paramInt, paramBundle)) {
        return true;
      }
      paramView = (NestedScrollView)paramView;
      if (!paramView.isEnabled()) {
        return false;
      }
      switch (paramInt)
      {
      default: 
        return false;
      case 4096: 
        paramInt = Math.min(paramView.getHeight() - paramView.getPaddingBottom() - paramView.getPaddingTop() + paramView.getScrollY(), NestedScrollView.a(paramView));
        if (paramInt != paramView.getScrollY())
        {
          paramView.ax(paramInt);
          return true;
        }
        return false;
      }
      paramInt = paramView.getHeight();
      int i = paramView.getPaddingBottom();
      int j = paramView.getPaddingTop();
      paramInt = Math.max(paramView.getScrollY() - (paramInt - i - j), 0);
      if (paramInt != paramView.getScrollY())
      {
        paramView.ax(paramInt);
        return true;
      }
      return false;
    }
  }
  
  public static abstract interface b
  {
    public abstract void b(NestedScrollView paramNestedScrollView);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/widget/NestedScrollView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */