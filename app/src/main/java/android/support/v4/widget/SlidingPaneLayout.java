package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.view.a;
import android.support.v4.view.a.b;
import android.support.v4.view.a.b.e;
import android.support.v4.view.o;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class SlidingPaneLayout
  extends ViewGroup
{
  static final e Bu = new f();
  private int Bf = -858993460;
  private int Bg;
  private Drawable Bh;
  private Drawable Bi;
  private final int Bj;
  private boolean Bk;
  private View Bl;
  private float Bm;
  private float Bn;
  private int Bo;
  private int Bp;
  private d Bq;
  private final u Br;
  private boolean Bs;
  private final ArrayList<b> Bt = new ArrayList();
  private final Rect ea = new Rect();
  private float vm;
  private float vn;
  private boolean wF = true;
  private boolean wt;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 17)
    {
      Bu = new h();
      return;
    }
    if (i >= 16)
    {
      Bu = new g();
      return;
    }
  }
  
  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SlidingPaneLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    float f = paramContext.getResources().getDisplayMetrics().density;
    this.Bj = ((int)(32.0F * f + 0.5F));
    ViewConfiguration.get(paramContext);
    setWillNotDraw(false);
    z.a(this, new a());
    z.i(this, 1);
    this.Br = u.a(this, 0.5F, new c((byte)0));
    this.Br.CE = (f * 400.0F);
  }
  
  private boolean F(float paramFloat)
  {
    if (!this.Bk) {
      return false;
    }
    boolean bool = cT();
    LayoutParams localLayoutParams = (LayoutParams)this.Bl.getLayoutParams();
    int j;
    int k;
    if (bool)
    {
      i = getPaddingRight();
      j = localLayoutParams.rightMargin;
      k = this.Bl.getWidth();
    }
    for (int i = (int)(getWidth() - (j + i + this.Bo * paramFloat + k)); this.Br.d(this.Bl, i, this.Bl.getTop()); i = (int)(localLayoutParams.leftMargin + i + this.Bo * paramFloat))
    {
      cR();
      z.E(this);
      return true;
      i = getPaddingLeft();
    }
    return false;
  }
  
  private void G(float paramFloat)
  {
    boolean bool = cT();
    Object localObject = (LayoutParams)this.Bl.getLayoutParams();
    int i;
    label43:
    int j;
    if (((LayoutParams)localObject).By) {
      if (bool)
      {
        i = ((LayoutParams)localObject).rightMargin;
        if (i > 0) {
          break label177;
        }
        i = 1;
        int n = getChildCount();
        j = 0;
        label52:
        if (j >= n) {
          return;
        }
        localObject = getChildAt(j);
        if (localObject != this.Bl)
        {
          int k = (int)((1.0F - this.Bn) * this.Bp);
          this.Bn = paramFloat;
          int m = k - (int)((1.0F - paramFloat) * this.Bp);
          k = m;
          if (bool) {
            k = -m;
          }
          ((View)localObject).offsetLeftAndRight(k);
          if (i != 0) {
            if (!bool) {
              break label182;
            }
          }
        }
      }
    }
    label177:
    label182:
    for (float f = this.Bn - 1.0F;; f = 1.0F - this.Bn)
    {
      a((View)localObject, f, this.Bg);
      j += 1;
      break label52;
      i = ((LayoutParams)localObject).leftMargin;
      break;
      i = 0;
      break label43;
    }
  }
  
  private void a(View paramView, float paramFloat, int paramInt)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    if ((paramFloat > 0.0F) && (paramInt != 0))
    {
      i = (int)(((0xFF000000 & paramInt) >>> 24) * paramFloat);
      if (localLayoutParams.Bz == null) {
        localLayoutParams.Bz = new Paint();
      }
      localLayoutParams.Bz.setColorFilter(new PorterDuffColorFilter(i << 24 | 0xFFFFFF & paramInt, PorterDuff.Mode.SRC_OVER));
      if (z.H(paramView) != 2) {
        z.a(paramView, 2, localLayoutParams.Bz);
      }
      aE(paramView);
    }
    while (z.H(paramView) == 0)
    {
      int i;
      return;
    }
    if (localLayoutParams.Bz != null) {
      localLayoutParams.Bz.setColorFilter(null);
    }
    paramView = new b(paramView);
    this.Bt.add(paramView);
    z.a(this, paramView);
  }
  
  private void aE(View paramView)
  {
    Bu.b(this, paramView);
  }
  
  private boolean cS()
  {
    boolean bool = false;
    if ((this.wF) || (F(0.0F)))
    {
      this.Bs = false;
      bool = true;
    }
    return bool;
  }
  
  private boolean cT()
  {
    return z.I(this) == 1;
  }
  
  final void aD(View paramView)
  {
    boolean bool = cT();
    int i;
    int j;
    label31:
    int k;
    label63:
    int i1;
    int n;
    int m;
    label92:
    int i2;
    label101:
    Object localObject;
    if (bool)
    {
      i = getWidth() - getPaddingRight();
      if (!bool) {
        break label244;
      }
      j = getPaddingLeft();
      int i4 = getPaddingTop();
      int i5 = getHeight();
      int i6 = getPaddingBottom();
      if (paramView == null) {
        break label303;
      }
      if (!z.K(paramView)) {
        break label257;
      }
      k = 1;
      if (k == 0) {
        break label303;
      }
      i1 = paramView.getLeft();
      n = paramView.getRight();
      m = paramView.getTop();
      k = paramView.getBottom();
      int i7 = getChildCount();
      i2 = 0;
      if (i2 >= i7) {
        return;
      }
      localObject = getChildAt(i2);
      if (localObject == paramView) {
        return;
      }
      if (!bool) {
        break label318;
      }
      i3 = j;
      label130:
      int i8 = Math.max(i3, ((View)localObject).getLeft());
      int i9 = Math.max(i4, ((View)localObject).getTop());
      if (!bool) {
        break label324;
      }
      i3 = i;
      label162:
      i3 = Math.min(i3, ((View)localObject).getRight());
      int i10 = Math.min(i5 - i6, ((View)localObject).getBottom());
      if ((i8 < i1) || (i9 < m) || (i3 > n) || (i10 > k)) {
        break label330;
      }
    }
    label244:
    label257:
    label303:
    label318:
    label324:
    label330:
    for (int i3 = 4;; i3 = 0)
    {
      ((View)localObject).setVisibility(i3);
      i2 += 1;
      break label101;
      i = getPaddingLeft();
      break;
      j = getWidth() - getPaddingRight();
      break label31;
      if (Build.VERSION.SDK_INT < 18)
      {
        localObject = paramView.getBackground();
        if (localObject != null)
        {
          if (((Drawable)localObject).getOpacity() == -1)
          {
            k = 1;
            break label63;
          }
          k = 0;
          break label63;
        }
      }
      k = 0;
      break label63;
      k = 0;
      m = 0;
      n = 0;
      i1 = 0;
      break label92;
      i3 = i;
      break label130;
      i3 = j;
      break label162;
    }
  }
  
  final boolean aF(View paramView)
  {
    if (paramView == null) {
      return false;
    }
    paramView = (LayoutParams)paramView.getLayoutParams();
    return (this.Bk) && (paramView.By) && (this.Bm > 0.0F);
  }
  
  final void cR()
  {
    int j = getChildCount();
    int i = 0;
    while (i < j)
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() == 4) {
        localView.setVisibility(0);
      }
      i += 1;
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof LayoutParams)) && (super.checkLayoutParams(paramLayoutParams));
  }
  
  public void computeScroll()
  {
    if (this.Br.cX())
    {
      if (!this.Bk) {
        this.Br.abort();
      }
    }
    else {
      return;
    }
    z.E(this);
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    Drawable localDrawable;
    if (cT())
    {
      localDrawable = this.Bi;
      if (getChildCount() <= 1) {
        break label53;
      }
    }
    label53:
    for (View localView = getChildAt(1);; localView = null)
    {
      if ((localView != null) && (localDrawable != null)) {
        break label59;
      }
      return;
      localDrawable = this.Bh;
      break;
    }
    label59:
    int k = localView.getTop();
    int m = localView.getBottom();
    int n = localDrawable.getIntrinsicWidth();
    int j;
    int i;
    if (cT())
    {
      j = localView.getRight();
      i = j + n;
    }
    for (;;)
    {
      localDrawable.setBounds(j, k, i, m);
      localDrawable.draw(paramCanvas);
      return;
      i = localView.getLeft();
      j = i - n;
    }
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    int i = paramCanvas.save(2);
    if ((this.Bk) && (!localLayoutParams.Bx) && (this.Bl != null))
    {
      paramCanvas.getClipBounds(this.ea);
      if (!cT()) {
        break label168;
      }
      this.ea.left = Math.max(this.ea.left, this.Bl.getRight());
    }
    boolean bool;
    for (;;)
    {
      paramCanvas.clipRect(this.ea);
      if (Build.VERSION.SDK_INT >= 11) {
        break label216;
      }
      if ((!localLayoutParams.By) || (this.Bm <= 0.0F)) {
        break label228;
      }
      if (!paramView.isDrawingCacheEnabled()) {
        paramView.setDrawingCacheEnabled(true);
      }
      Bitmap localBitmap = paramView.getDrawingCache();
      if (localBitmap == null) {
        break;
      }
      paramCanvas.drawBitmap(localBitmap, paramView.getLeft(), paramView.getTop(), localLayoutParams.Bz);
      bool = false;
      paramCanvas.restoreToCount(i);
      return bool;
      label168:
      this.ea.right = Math.min(this.ea.right, this.Bl.getLeft());
    }
    new StringBuilder("drawChild: child view ").append(paramView).append(" returned null drawing cache");
    for (;;)
    {
      label216:
      bool = super.drawChild(paramCanvas, paramView, paramLong);
      break;
      label228:
      if (paramView.isDrawingCacheEnabled()) {
        paramView.setDrawingCacheEnabled(false);
      }
    }
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new LayoutParams();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new LayoutParams(paramLayoutParams);
  }
  
  public int getCoveredFadeColor()
  {
    return this.Bg;
  }
  
  public int getParallaxDistance()
  {
    return this.Bp;
  }
  
  public int getSliderFadeColor()
  {
    return this.Bf;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.wF = true;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.wF = true;
    int j = this.Bt.size();
    int i = 0;
    while (i < j)
    {
      ((b)this.Bt.get(i)).run();
      i += 1;
    }
    this.Bt.clear();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    int i = o.d(paramMotionEvent);
    if ((!this.Bk) && (i == 0) && (getChildCount() > 1))
    {
      View localView = getChildAt(1);
      if (localView != null) {
        if (u.e(localView, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) {
          break label104;
        }
      }
    }
    label104:
    for (boolean bool1 = true;; bool1 = false)
    {
      this.Bs = bool1;
      if ((this.Bk) && ((!this.wt) || (i == 0))) {
        break;
      }
      this.Br.cancel();
      bool1 = super.onInterceptTouchEvent(paramMotionEvent);
      return bool1;
    }
    if ((i == 3) || (i == 1))
    {
      this.Br.cancel();
      return false;
    }
    switch (i)
    {
    }
    label160:
    float f1;
    float f2;
    do
    {
      for (i = 0;; i = 1)
      {
        if (!this.Br.j(paramMotionEvent))
        {
          bool1 = bool2;
          if (i == 0) {
            break;
          }
        }
        return true;
        this.wt = false;
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        this.vm = f1;
        this.vn = f2;
        if ((!u.e(this.Bl, (int)f1, (int)f2)) || (!aF(this.Bl))) {
          break label160;
        }
      }
      f2 = paramMotionEvent.getX();
      f1 = paramMotionEvent.getY();
      f2 = Math.abs(f2 - this.vm);
      f1 = Math.abs(f1 - this.vn);
    } while ((f2 <= this.Br.fW) || (f1 <= f2));
    this.Br.cancel();
    this.wt = true;
    return false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = cT();
    label35:
    label46:
    int m;
    float f;
    label82:
    int i;
    label99:
    LayoutParams localLayoutParams;
    int i1;
    int j;
    if (bool)
    {
      this.Br.CG = 2;
      int k = paramInt3 - paramInt1;
      if (!bool) {
        break label358;
      }
      paramInt1 = getPaddingRight();
      if (!bool) {
        break label366;
      }
      paramInt3 = getPaddingLeft();
      int n = getPaddingTop();
      m = getChildCount();
      if (this.wF)
      {
        if ((!this.Bk) || (!this.Bs)) {
          break label375;
        }
        f = 1.0F;
        this.Bm = f;
      }
      paramInt4 = 0;
      i = paramInt1;
      paramInt2 = paramInt1;
      paramInt1 = i;
      if (paramInt4 >= m) {
        break label448;
      }
      View localView = getChildAt(paramInt4);
      if (localView.getVisibility() == 8) {
        break label557;
      }
      localLayoutParams = (LayoutParams)localView.getLayoutParams();
      i1 = localView.getMeasuredWidth();
      j = 0;
      if (!localLayoutParams.Bx) {
        break label396;
      }
      i = localLayoutParams.leftMargin;
      int i2 = localLayoutParams.rightMargin;
      i2 = Math.min(paramInt1, k - paramInt3 - this.Bj) - paramInt2 - (i + i2);
      this.Bo = i2;
      if (!bool) {
        break label381;
      }
      i = localLayoutParams.rightMargin;
      label208:
      if (paramInt2 + i + i2 + i1 / 2 <= k - paramInt3) {
        break label391;
      }
      paramBoolean = true;
      label230:
      localLayoutParams.By = paramBoolean;
      i2 = (int)(i2 * this.Bm);
      paramInt2 += i + i2;
      this.Bm = (i2 / this.Bo);
      i = j;
      if (!bool) {
        break label432;
      }
      j = k - paramInt2 + i;
      i = j - i1;
      label293:
      localView.layout(i, n, j, localView.getMeasuredHeight() + n);
      i = localView.getWidth() + paramInt1;
      paramInt1 = paramInt2;
      paramInt2 = i;
    }
    for (;;)
    {
      i = paramInt4 + 1;
      paramInt4 = paramInt1;
      paramInt1 = paramInt2;
      paramInt2 = paramInt4;
      paramInt4 = i;
      break label99;
      this.Br.CG = 1;
      break;
      label358:
      paramInt1 = getPaddingLeft();
      break label35;
      label366:
      paramInt3 = getPaddingRight();
      break label46;
      label375:
      f = 0.0F;
      break label82;
      label381:
      i = localLayoutParams.leftMargin;
      break label208;
      label391:
      paramBoolean = false;
      break label230;
      label396:
      if ((this.Bk) && (this.Bp != 0)) {}
      for (paramInt2 = (int)((1.0F - this.Bm) * this.Bp);; paramInt2 = 0)
      {
        i = paramInt2;
        paramInt2 = paramInt1;
        break;
        label432:
        i = paramInt2 - i;
        j = i + i1;
        break label293;
        label448:
        if (this.wF)
        {
          if (!this.Bk) {
            break label523;
          }
          if (this.Bp != 0) {
            G(this.Bm);
          }
          if (((LayoutParams)this.Bl.getLayoutParams()).By) {
            a(this.Bl, this.Bm, this.Bf);
          }
        }
        for (;;)
        {
          aD(this.Bl);
          this.wF = false;
          return;
          label523:
          paramInt1 = 0;
          while (paramInt1 < m)
          {
            a(getChildAt(paramInt1), 0.0F, this.Bf);
            paramInt1 += 1;
          }
        }
      }
      label557:
      i = paramInt2;
      paramInt2 = paramInt1;
      paramInt1 = i;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int k = View.MeasureSpec.getMode(paramInt1);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    int i = View.MeasureSpec.getMode(paramInt2);
    int j = View.MeasureSpec.getSize(paramInt2);
    if (k != 1073741824) {
      if (isInEditMode())
      {
        if ((k == Integer.MIN_VALUE) || (k != 0)) {
          break label1030;
        }
        paramInt2 = i;
        i = 300;
        paramInt1 = j;
      }
    }
    for (;;)
    {
      k = 0;
      switch (paramInt2)
      {
      default: 
        j = -1;
        paramInt1 = k;
      }
      float f;
      boolean bool1;
      int i2;
      int i3;
      int i1;
      int m;
      View localView;
      LayoutParams localLayoutParams;
      for (;;)
      {
        f = 0.0F;
        bool1 = false;
        i2 = i - getPaddingLeft() - getPaddingRight();
        i3 = getChildCount();
        this.Bl = null;
        i1 = 0;
        m = i2;
        k = paramInt1;
        paramInt1 = m;
        for (;;)
        {
          if (i1 >= i3) {
            break label553;
          }
          localView = getChildAt(i1);
          localLayoutParams = (LayoutParams)localView.getLayoutParams();
          if (localView.getVisibility() != 8) {
            break;
          }
          localLayoutParams.By = false;
          i1 += 1;
        }
        throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        if (i != 0) {
          break label1030;
        }
        if (isInEditMode())
        {
          if (i != 0) {
            break label1030;
          }
          j = 300;
          paramInt2 = Integer.MIN_VALUE;
          i = paramInt1;
          paramInt1 = j;
          break;
        }
        throw new IllegalStateException("Height must not be UNSPECIFIED");
        paramInt1 = paramInt1 - getPaddingTop() - getPaddingBottom();
        j = paramInt1;
        continue;
        j = paramInt1 - getPaddingTop() - getPaddingBottom();
        paramInt1 = k;
      }
      if (localLayoutParams.weight > 0.0F)
      {
        f = localLayoutParams.weight + f;
        if (localLayoutParams.width == 0) {}
      }
      for (;;)
      {
        m = localLayoutParams.leftMargin + localLayoutParams.rightMargin;
        label347:
        int n;
        label367:
        int i4;
        if (localLayoutParams.width == -2)
        {
          m = View.MeasureSpec.makeMeasureSpec(i2 - m, Integer.MIN_VALUE);
          if (localLayoutParams.height != -2) {
            break label509;
          }
          n = View.MeasureSpec.makeMeasureSpec(j, Integer.MIN_VALUE);
          localView.measure(m, n);
          n = localView.getMeasuredWidth();
          i4 = localView.getMeasuredHeight();
          m = k;
          if (paramInt2 == Integer.MIN_VALUE)
          {
            m = k;
            if (i4 > k) {
              m = Math.min(i4, j);
            }
          }
          paramInt1 -= n;
          if (paramInt1 >= 0) {
            break label547;
          }
        }
        label509:
        label547:
        for (boolean bool2 = true;; bool2 = false)
        {
          localLayoutParams.Bx = bool2;
          if (localLayoutParams.Bx) {
            this.Bl = localView;
          }
          bool1 = bool2 | bool1;
          k = m;
          break;
          if (localLayoutParams.width == -1)
          {
            m = View.MeasureSpec.makeMeasureSpec(i2 - m, 1073741824);
            break label347;
          }
          m = View.MeasureSpec.makeMeasureSpec(localLayoutParams.width, 1073741824);
          break label347;
          if (localLayoutParams.height == -1)
          {
            n = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
            break label367;
          }
          n = View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824);
          break label367;
        }
        label553:
        if ((bool1) || (f > 0.0F))
        {
          i1 = i2 - this.Bj;
          m = 0;
          if (m < i3)
          {
            localView = getChildAt(m);
            if (localView.getVisibility() != 8)
            {
              localLayoutParams = (LayoutParams)localView.getLayoutParams();
              if (localView.getVisibility() != 8)
              {
                if ((localLayoutParams.width != 0) || (localLayoutParams.weight <= 0.0F)) {
                  break label733;
                }
                paramInt2 = 1;
                label641:
                if (paramInt2 == 0) {
                  break label738;
                }
                n = 0;
                label648:
                if ((!bool1) || (localView == this.Bl)) {
                  break label799;
                }
                if ((localLayoutParams.width < 0) && ((n > i1) || (localLayoutParams.weight > 0.0F)))
                {
                  if (paramInt2 == 0) {
                    break label784;
                  }
                  if (localLayoutParams.height != -2) {
                    break label748;
                  }
                  paramInt2 = View.MeasureSpec.makeMeasureSpec(j, Integer.MIN_VALUE);
                  label710:
                  localView.measure(View.MeasureSpec.makeMeasureSpec(i1, 1073741824), paramInt2);
                }
              }
            }
            for (;;)
            {
              m += 1;
              break;
              label733:
              paramInt2 = 0;
              break label641;
              label738:
              n = localView.getMeasuredWidth();
              break label648;
              label748:
              if (localLayoutParams.height == -1)
              {
                paramInt2 = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
                break label710;
              }
              paramInt2 = View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824);
              break label710;
              label784:
              paramInt2 = View.MeasureSpec.makeMeasureSpec(localView.getMeasuredHeight(), 1073741824);
              break label710;
              label799:
              if (localLayoutParams.weight > 0.0F)
              {
                if (localLayoutParams.width == 0) {
                  if (localLayoutParams.height == -2) {
                    paramInt2 = View.MeasureSpec.makeMeasureSpec(j, Integer.MIN_VALUE);
                  }
                }
                for (;;)
                {
                  if (!bool1) {
                    break label940;
                  }
                  i4 = localLayoutParams.leftMargin;
                  i4 = i2 - (localLayoutParams.rightMargin + i4);
                  int i5 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                  if (n == i4) {
                    break;
                  }
                  localView.measure(i5, paramInt2);
                  break;
                  if (localLayoutParams.height == -1)
                  {
                    paramInt2 = View.MeasureSpec.makeMeasureSpec(j, 1073741824);
                  }
                  else
                  {
                    paramInt2 = View.MeasureSpec.makeMeasureSpec(localLayoutParams.height, 1073741824);
                    continue;
                    paramInt2 = View.MeasureSpec.makeMeasureSpec(localView.getMeasuredHeight(), 1073741824);
                  }
                }
                label940:
                i4 = Math.max(0, paramInt1);
                localView.measure(View.MeasureSpec.makeMeasureSpec((int)(localLayoutParams.weight * i4 / f) + n, 1073741824), paramInt2);
              }
            }
          }
        }
        setMeasuredDimension(i, getPaddingTop() + k + getPaddingBottom());
        this.Bk = bool1;
        if ((this.Br.Cu != 0) && (!bool1)) {
          this.Br.abort();
        }
        return;
        break;
      }
      label1030:
      paramInt2 = i;
      i = paramInt1;
      paramInt1 = j;
    }
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
    if (paramParcelable.BA) {
      if ((this.wF) || (F(1.0F))) {
        this.Bs = true;
      }
    }
    for (;;)
    {
      this.Bs = paramParcelable.BA;
      return;
      cS();
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    boolean bool;
    if (this.Bk) {
      if ((!this.Bk) || (this.Bm == 1.0F)) {
        bool = true;
      }
    }
    for (;;)
    {
      localSavedState.BA = bool;
      return localSavedState;
      bool = false;
      continue;
      bool = this.Bs;
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3) {
      this.wF = true;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!this.Bk) {
      return super.onTouchEvent(paramMotionEvent);
    }
    this.Br.k(paramMotionEvent);
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    }
    for (;;)
    {
      return true;
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      this.vm = f1;
      this.vn = f2;
      continue;
      if (aF(this.Bl))
      {
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        float f3 = f1 - this.vm;
        float f4 = f2 - this.vn;
        int i = this.Br.fW;
        if ((f3 * f3 + f4 * f4 < i * i) && (u.e(this.Bl, (int)f1, (int)f2))) {
          cS();
        }
      }
    }
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    super.requestChildFocus(paramView1, paramView2);
    if ((!isInTouchMode()) && (!this.Bk)) {
      if (paramView1 != this.Bl) {
        break label36;
      }
    }
    label36:
    for (boolean bool = true;; bool = false)
    {
      this.Bs = bool;
      return;
    }
  }
  
  public void setCoveredFadeColor(int paramInt)
  {
    this.Bg = paramInt;
  }
  
  public void setPanelSlideListener(d paramd)
  {
    this.Bq = paramd;
  }
  
  public void setParallaxDistance(int paramInt)
  {
    this.Bp = paramInt;
    requestLayout();
  }
  
  @Deprecated
  public void setShadowDrawable(Drawable paramDrawable)
  {
    setShadowDrawableLeft(paramDrawable);
  }
  
  public void setShadowDrawableLeft(Drawable paramDrawable)
  {
    this.Bh = paramDrawable;
  }
  
  public void setShadowDrawableRight(Drawable paramDrawable)
  {
    this.Bi = paramDrawable;
  }
  
  @Deprecated
  public void setShadowResource(int paramInt)
  {
    setShadowDrawable(getResources().getDrawable(paramInt));
  }
  
  public void setShadowResourceLeft(int paramInt)
  {
    setShadowDrawableLeft(getResources().getDrawable(paramInt));
  }
  
  public void setShadowResourceRight(int paramInt)
  {
    setShadowDrawableRight(getResources().getDrawable(paramInt));
  }
  
  public void setSliderFadeColor(int paramInt)
  {
    this.Bf = paramInt;
  }
  
  public static class LayoutParams
    extends ViewGroup.MarginLayoutParams
  {
    private static final int[] vA = { 16843137 };
    boolean Bx;
    boolean By;
    Paint Bz;
    public float weight = 0.0F;
    
    public LayoutParams()
    {
      super(-1);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, vA);
      this.weight = paramContext.getFloat(0, 0.0F);
      paramContext.recycle();
    }
    
    public LayoutParams(ViewGroup.LayoutParams paramLayoutParams)
    {
      super();
    }
    
    public LayoutParams(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
    {
      super();
    }
  }
  
  static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator() {};
    boolean BA;
    
    private SavedState(Parcel paramParcel)
    {
      super();
      if (paramParcel.readInt() != 0) {}
      for (boolean bool = true;; bool = false)
      {
        this.BA = bool;
        return;
      }
    }
    
    SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      if (this.BA) {}
      for (paramInt = 1;; paramInt = 0)
      {
        paramParcel.writeInt(paramInt);
        return;
      }
    }
  }
  
  final class a
    extends a
  {
    private final Rect ea = new Rect();
    
    a() {}
    
    private boolean aG(View paramView)
    {
      return SlidingPaneLayout.this.aF(paramView);
    }
    
    public final void a(View paramView, b paramb)
    {
      b localb = b.a(paramb);
      super.a(paramView, localb);
      Rect localRect = this.ea;
      localb.getBoundsInParent(localRect);
      paramb.setBoundsInParent(localRect);
      localb.getBoundsInScreen(localRect);
      paramb.setBoundsInScreen(localRect);
      paramb.setVisibleToUser(localb.isVisibleToUser());
      paramb.setPackageName(localb.getPackageName());
      paramb.setClassName(localb.getClassName());
      paramb.setContentDescription(localb.getContentDescription());
      paramb.setEnabled(localb.isEnabled());
      paramb.setClickable(localb.isClickable());
      paramb.setFocusable(localb.isFocusable());
      paramb.setFocused(localb.isFocused());
      paramb.setAccessibilityFocused(localb.isAccessibilityFocused());
      paramb.setSelected(localb.isSelected());
      paramb.setLongClickable(localb.isLongClickable());
      paramb.addAction(localb.getActions());
      int i = b.xr.D(localb.xs);
      b.xr.c(paramb.xs, i);
      localb.recycle();
      paramb.setClassName(SlidingPaneLayout.class.getName());
      paramb.setSource(paramView);
      paramView = z.J(paramView);
      if ((paramView instanceof View)) {
        paramb.setParent((View)paramView);
      }
      int j = SlidingPaneLayout.this.getChildCount();
      i = 0;
      while (i < j)
      {
        paramView = SlidingPaneLayout.this.getChildAt(i);
        if ((!aG(paramView)) && (paramView.getVisibility() == 0))
        {
          z.i(paramView, 1);
          paramb.addChild(paramView);
        }
        i += 1;
      }
    }
    
    public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
    }
    
    public final boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      if (!aG(paramView)) {
        return super.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
      }
      return false;
    }
  }
  
  private final class b
    implements Runnable
  {
    final View Bw;
    
    b(View paramView)
    {
      this.Bw = paramView;
    }
    
    public final void run()
    {
      if (this.Bw.getParent() == SlidingPaneLayout.this)
      {
        z.a(this.Bw, 0, null);
        SlidingPaneLayout.a(SlidingPaneLayout.this, this.Bw);
      }
      SlidingPaneLayout.g(SlidingPaneLayout.this).remove(this);
    }
  }
  
  private final class c
    extends u.a
  {
    private c() {}
    
    public final void a(View paramView, float paramFloat1, float paramFloat2)
    {
      SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
      int i;
      int j;
      if (SlidingPaneLayout.e(SlidingPaneLayout.this))
      {
        i = SlidingPaneLayout.this.getPaddingRight();
        j = localLayoutParams.rightMargin + i;
        if (paramFloat1 >= 0.0F)
        {
          i = j;
          if (paramFloat1 == 0.0F)
          {
            i = j;
            if (SlidingPaneLayout.c(SlidingPaneLayout.this) <= 0.5F) {}
          }
        }
        else
        {
          i = j + SlidingPaneLayout.f(SlidingPaneLayout.this);
        }
        j = SlidingPaneLayout.d(SlidingPaneLayout.this).getWidth();
        i = SlidingPaneLayout.this.getWidth() - i - j;
      }
      for (;;)
      {
        SlidingPaneLayout.b(SlidingPaneLayout.this).w(i, paramView.getTop());
        SlidingPaneLayout.this.invalidate();
        return;
        i = SlidingPaneLayout.this.getPaddingLeft();
        j = localLayoutParams.leftMargin + i;
        if (paramFloat1 <= 0.0F)
        {
          i = j;
          if (paramFloat1 == 0.0F)
          {
            i = j;
            if (SlidingPaneLayout.c(SlidingPaneLayout.this) <= 0.5F) {}
          }
        }
        else
        {
          i = j + SlidingPaneLayout.f(SlidingPaneLayout.this);
        }
      }
    }
    
    public final void a(View paramView, int paramInt1, int paramInt2)
    {
      SlidingPaneLayout.a(SlidingPaneLayout.this, paramInt1);
      SlidingPaneLayout.this.invalidate();
    }
    
    public final boolean b(View paramView, int paramInt)
    {
      if (SlidingPaneLayout.a(SlidingPaneLayout.this)) {
        return false;
      }
      return ((SlidingPaneLayout.LayoutParams)paramView.getLayoutParams()).Bx;
    }
    
    public final int c(View paramView, int paramInt)
    {
      return paramView.getTop();
    }
    
    public final int d(View paramView, int paramInt)
    {
      paramView = (SlidingPaneLayout.LayoutParams)SlidingPaneLayout.d(SlidingPaneLayout.this).getLayoutParams();
      if (SlidingPaneLayout.e(SlidingPaneLayout.this))
      {
        i = SlidingPaneLayout.this.getWidth();
        j = SlidingPaneLayout.this.getPaddingRight();
        i -= paramView.rightMargin + j + SlidingPaneLayout.d(SlidingPaneLayout.this).getWidth();
        j = SlidingPaneLayout.f(SlidingPaneLayout.this);
        return Math.max(Math.min(paramInt, i), i - j);
      }
      int i = SlidingPaneLayout.this.getPaddingLeft();
      i = paramView.leftMargin + i;
      int j = SlidingPaneLayout.f(SlidingPaneLayout.this);
      return Math.min(Math.max(paramInt, i), j + i);
    }
    
    public final void f(View paramView, int paramInt)
    {
      SlidingPaneLayout.this.cR();
    }
    
    public final int s(View paramView)
    {
      return SlidingPaneLayout.f(SlidingPaneLayout.this);
    }
    
    public final void t(int paramInt)
    {
      if (SlidingPaneLayout.b(SlidingPaneLayout.this).Cu == 0)
      {
        if (SlidingPaneLayout.c(SlidingPaneLayout.this) == 0.0F)
        {
          SlidingPaneLayout.this.aD(SlidingPaneLayout.d(SlidingPaneLayout.this));
          localSlidingPaneLayout = SlidingPaneLayout.this;
          SlidingPaneLayout.d(SlidingPaneLayout.this);
          localSlidingPaneLayout.sendAccessibilityEvent(32);
          SlidingPaneLayout.a(SlidingPaneLayout.this, false);
        }
      }
      else {
        return;
      }
      SlidingPaneLayout localSlidingPaneLayout = SlidingPaneLayout.this;
      SlidingPaneLayout.d(SlidingPaneLayout.this);
      localSlidingPaneLayout.sendAccessibilityEvent(32);
      SlidingPaneLayout.a(SlidingPaneLayout.this, true);
    }
    
    public final void t(int paramInt1, int paramInt2)
    {
      SlidingPaneLayout.b(SlidingPaneLayout.this).n(SlidingPaneLayout.d(SlidingPaneLayout.this), paramInt2);
    }
  }
  
  public static abstract interface d {}
  
  static abstract interface e
  {
    public abstract void b(SlidingPaneLayout paramSlidingPaneLayout, View paramView);
  }
  
  static class f
    implements SlidingPaneLayout.e
  {
    public void b(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
    {
      z.b(paramSlidingPaneLayout, paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom());
    }
  }
  
  static final class g
    extends SlidingPaneLayout.f
  {
    private Method BB;
    private Field BC;
    
    g()
    {
      try
      {
        this.BB = View.class.getDeclaredMethod("getDisplayList", null);
        try
        {
          this.BC = View.class.getDeclaredField("mRecreateDisplayList");
          this.BC.setAccessible(true);
          return;
        }
        catch (NoSuchFieldException localNoSuchFieldException) {}
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        for (;;) {}
      }
    }
    
    public final void b(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
    {
      if ((this.BB != null) && (this.BC != null)) {}
      try
      {
        this.BC.setBoolean(paramView, true);
        this.BB.invoke(paramView, null);
        super.b(paramSlidingPaneLayout, paramView);
        return;
        paramView.invalidate();
        return;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  static final class h
    extends SlidingPaneLayout.f
  {
    public final void b(SlidingPaneLayout paramSlidingPaneLayout, View paramView)
    {
      z.a(paramView, ((SlidingPaneLayout.LayoutParams)paramView.getLayoutParams()).Bz);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/widget/SlidingPaneLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */