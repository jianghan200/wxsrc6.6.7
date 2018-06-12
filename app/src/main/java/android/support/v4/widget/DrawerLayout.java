package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.support.v4.view.a.b;
import android.support.v4.view.a.b.a;
import android.support.v4.view.af;
import android.support.v4.view.f;
import android.support.v4.view.o;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

public class DrawerLayout
  extends ViewGroup
  implements h
{
  private static final int[] vV;
  static final c zI;
  private static final boolean zd;
  private static final boolean ze;
  List<f> bX;
  private boolean eJ;
  private Drawable eK;
  private boolean mInLayout;
  private float vm;
  private float vn;
  private boolean wF = true;
  CharSequence zA;
  CharSequence zB;
  private Object zC;
  private Drawable zD = null;
  private Drawable zE = null;
  private Drawable zF = null;
  private Drawable zG = null;
  private final ArrayList<View> zH;
  private final b zf = new b();
  private float zg;
  private int zh;
  private int zi = -1728053248;
  private float zj;
  private Paint zk = new Paint();
  final u zl;
  final u zm;
  private final g zn;
  private final g zo;
  int zp;
  private int zq = 3;
  private int zr = 3;
  private int zt = 3;
  private int zu = 3;
  private boolean zv;
  boolean zw;
  @Deprecated
  private f zx;
  private Drawable zy;
  private Drawable zz;
  
  static
  {
    boolean bool2 = true;
    vV = new int[] { 16842931 };
    if (Build.VERSION.SDK_INT >= 19)
    {
      bool1 = true;
      zd = bool1;
      if (Build.VERSION.SDK_INT < 21) {
        break label65;
      }
    }
    label65:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      ze = bool1;
      if (Build.VERSION.SDK_INT < 21) {
        break label70;
      }
      zI = new d();
      return;
      bool1 = false;
      break;
    }
    label70:
    zI = new e();
  }
  
  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setDescendantFocusability(262144);
    float f1 = getResources().getDisplayMetrics().density;
    this.zh = ((int)(64.0F * f1 + 0.5F));
    float f2 = 400.0F * f1;
    this.zn = new g(3);
    this.zo = new g(5);
    this.zl = u.a(this, 1.0F, this.zn);
    this.zl.CG = 1;
    this.zl.CE = f2;
    this.zn.zT = this.zl;
    this.zm = u.a(this, 1.0F, this.zo);
    this.zm.CG = 2;
    this.zm.CE = f2;
    this.zo.zT = this.zm;
    setFocusableInTouchMode(true);
    z.i(this, 1);
    z.a(this, new a());
    af.d(this);
    if (z.Z(this))
    {
      zI.aA(this);
      this.eK = zI.P(paramContext);
    }
    this.zg = (f1 * 10.0F);
    this.zH = new ArrayList();
  }
  
  static float at(View paramView)
  {
    return LayoutParams.a((LayoutParams)paramView.getLayoutParams());
  }
  
  private static boolean av(View paramView)
  {
    return ((LayoutParams)paramView.getLayoutParams()).gravity == 0;
  }
  
  static boolean aw(View paramView)
  {
    int i = f.getAbsoluteGravity(((LayoutParams)paramView.getLayoutParams()).gravity, z.I(paramView));
    if ((i & 0x3) != 0) {
      return true;
    }
    return (i & 0x5) != 0;
  }
  
  private void ax(View paramView)
  {
    if (!aw(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    }
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    if (this.wF)
    {
      LayoutParams.a(localLayoutParams, 1.0F);
      LayoutParams.a(localLayoutParams, 1);
      c(paramView, true);
    }
    for (;;)
    {
      invalidate();
      return;
      LayoutParams.b(localLayoutParams, 2);
      if (m(paramView, 3)) {
        this.zl.d(paramView, 0, paramView.getTop());
      } else {
        this.zm.d(paramView, getWidth() - paramView.getWidth(), paramView.getTop());
      }
    }
  }
  
  private static boolean c(Drawable paramDrawable, int paramInt)
  {
    if ((paramDrawable == null) || (!android.support.v4.b.a.a.c(paramDrawable))) {
      return false;
    }
    android.support.v4.b.a.a.b(paramDrawable, paramInt);
    return true;
  }
  
  private View cB()
  {
    int j = getChildCount();
    int i = 0;
    while (i < j)
    {
      View localView = getChildAt(i);
      if ((LayoutParams.b((LayoutParams)localView.getLayoutParams()) & 0x1) == 1) {
        return localView;
      }
      i += 1;
    }
    return null;
  }
  
  private View cC()
  {
    int k = getChildCount();
    int i = 0;
    while (i < k)
    {
      View localView = getChildAt(i);
      if (aw(localView))
      {
        if (!aw(localView)) {
          throw new IllegalArgumentException("View " + localView + " is not a drawer");
        }
        if (LayoutParams.a((LayoutParams)localView.getLayoutParams()) > 0.0F) {}
        for (int j = 1; j != 0; j = 0) {
          return localView;
        }
      }
      i += 1;
    }
    return null;
  }
  
  private void s(int paramInt1, int paramInt2)
  {
    int i = f.getAbsoluteGravity(paramInt2, z.I(this));
    Object localObject;
    switch (paramInt2)
    {
    default: 
      if (paramInt1 != 0)
      {
        if (i == 3)
        {
          localObject = this.zl;
          label67:
          ((u)localObject).cancel();
        }
      }
      else {
        switch (paramInt1)
        {
        }
      }
      break;
    }
    do
    {
      do
      {
        return;
        this.zq = paramInt1;
        break;
        this.zr = paramInt1;
        break;
        this.zt = paramInt1;
        break;
        this.zu = paramInt1;
        break;
        localObject = this.zm;
        break label67;
        localObject = as(i);
      } while (localObject == null);
      ax((View)localObject);
      return;
      localObject = as(i);
    } while (localObject == null);
    ay((View)localObject);
  }
  
  private void z(boolean paramBoolean)
  {
    int m = getChildCount();
    int j = 0;
    int i = 0;
    if (j < m)
    {
      View localView = getChildAt(j);
      LayoutParams localLayoutParams = (LayoutParams)localView.getLayoutParams();
      boolean bool = i;
      int k;
      if (aw(localView)) {
        if (paramBoolean)
        {
          bool = i;
          if (!LayoutParams.c(localLayoutParams)) {}
        }
        else
        {
          k = localView.getWidth();
          if (!m(localView, 3)) {
            break label116;
          }
          i |= this.zl.d(localView, -k, localView.getTop());
        }
      }
      for (;;)
      {
        LayoutParams.a(localLayoutParams, false);
        k = i;
        j += 1;
        i = k;
        break;
        label116:
        i |= this.zm.d(localView, getWidth(), localView.getTop());
      }
    }
    this.zn.cA();
    this.zo.cA();
    if (i != 0) {
      invalidate();
    }
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    if (getDescendantFocusability() == 393216) {
      return;
    }
    int m = getChildCount();
    int j = 0;
    int i = 0;
    View localView;
    if (j < m)
    {
      localView = getChildAt(j);
      int k;
      if (aw(localView))
      {
        if (!aw(localView)) {
          throw new IllegalArgumentException("View " + localView + " is not a drawer");
        }
        if ((LayoutParams.b((LayoutParams)localView.getLayoutParams()) & 0x1) == 1)
        {
          k = 1;
          label106:
          if (k == 0) {
            break label147;
          }
          localView.addFocusables(paramArrayList, paramInt1, paramInt2);
          i = 1;
        }
      }
      label147:
      for (;;)
      {
        j += 1;
        break;
        k = 0;
        break label106;
        this.zH.add(localView);
      }
    }
    if (i == 0)
    {
      j = this.zH.size();
      i = 0;
      while (i < j)
      {
        localView = (View)this.zH.get(i);
        if (localView.getVisibility() == 0) {
          localView.addFocusables(paramArrayList, paramInt1, paramInt2);
        }
        i += 1;
      }
    }
    this.zH.clear();
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    if ((cB() != null) || (aw(paramView))) {
      z.i(paramView, 4);
    }
    for (;;)
    {
      if (!zd) {
        z.a(paramView, this.zf);
      }
      return;
      z.i(paramView, 1);
    }
  }
  
  public final int as(View paramView)
  {
    if (!aw(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a drawer");
    }
    int i = ((LayoutParams)paramView.getLayoutParams()).gravity;
    int j = z.I(this);
    switch (i)
    {
    }
    for (;;)
    {
      return 0;
      if (this.zq != 3) {
        return this.zq;
      }
      if (j == 0) {}
      for (i = this.zt; i != 3; i = this.zu) {
        return i;
      }
      if (this.zr != 3) {
        return this.zr;
      }
      if (j == 0) {}
      for (i = this.zu; i != 3; i = this.zt) {
        return i;
      }
      if (this.zt != 3) {
        return this.zt;
      }
      if (j == 0) {}
      for (i = this.zq; i != 3; i = this.zr) {
        return i;
      }
      if (this.zu != 3) {
        return this.zu;
      }
      if (j == 0) {}
      for (i = this.zr; i != 3; i = this.zq) {
        return i;
      }
    }
  }
  
  final View as(int paramInt)
  {
    int i = f.getAbsoluteGravity(paramInt, z.I(this));
    int j = getChildCount();
    paramInt = 0;
    while (paramInt < j)
    {
      View localView = getChildAt(paramInt);
      if ((au(localView) & 0x7) == (i & 0x7)) {
        return localView;
      }
      paramInt += 1;
    }
    return null;
  }
  
  final int au(View paramView)
  {
    return f.getAbsoluteGravity(((LayoutParams)paramView.getLayoutParams()).gravity, z.I(this));
  }
  
  public final void ay(View paramView)
  {
    if (!aw(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    }
    LayoutParams localLayoutParams = (LayoutParams)paramView.getLayoutParams();
    if (this.wF)
    {
      LayoutParams.a(localLayoutParams, 0.0F);
      LayoutParams.a(localLayoutParams, 0);
    }
    for (;;)
    {
      invalidate();
      return;
      LayoutParams.b(localLayoutParams, 4);
      if (m(paramView, 3)) {
        this.zl.d(paramView, -paramView.getWidth(), paramView.getTop());
      } else {
        this.zm.d(paramView, getWidth(), paramView.getTop());
      }
    }
  }
  
  final void c(View paramView, boolean paramBoolean)
  {
    int j = getChildCount();
    int i = 0;
    if (i < j)
    {
      View localView = getChildAt(i);
      if (((!paramBoolean) && (!aw(localView))) || ((paramBoolean) && (localView == paramView))) {
        z.i(localView, 1);
      }
      for (;;)
      {
        i += 1;
        break;
        z.i(localView, 4);
      }
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof LayoutParams)) && (super.checkLayoutParams(paramLayoutParams));
  }
  
  public void computeScroll()
  {
    int j = getChildCount();
    float f = 0.0F;
    int i = 0;
    while (i < j)
    {
      f = Math.max(f, LayoutParams.a((LayoutParams)getChildAt(i).getLayoutParams()));
      i += 1;
    }
    this.zj = f;
    if ((this.zl.cX() | this.zm.cX())) {
      z.E(this);
    }
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    int i2 = getHeight();
    boolean bool1 = av(paramView);
    int i = 0;
    int n = 0;
    int j = getWidth();
    int i3 = paramCanvas.save();
    int k = j;
    int m;
    View localView;
    int i1;
    if (bool1)
    {
      int i4 = getChildCount();
      m = 0;
      i = n;
      if (m < i4)
      {
        localView = getChildAt(m);
        n = i;
        i1 = j;
        if (localView != paramView)
        {
          n = i;
          i1 = j;
          if (localView.getVisibility() == 0)
          {
            Drawable localDrawable = localView.getBackground();
            if (localDrawable == null) {
              break label227;
            }
            if (localDrawable.getOpacity() != -1) {
              break label221;
            }
            k = 1;
            label121:
            n = i;
            i1 = j;
            if (k != 0)
            {
              n = i;
              i1 = j;
              if (aw(localView))
              {
                n = i;
                i1 = j;
                if (localView.getHeight() >= i2)
                {
                  if (!m(localView, 3)) {
                    break label233;
                  }
                  k = localView.getRight();
                  if (k <= i) {
                    break label598;
                  }
                  i = k;
                }
              }
            }
          }
        }
      }
    }
    label221:
    label227:
    label233:
    label598:
    for (;;)
    {
      i1 = j;
      n = i;
      for (;;)
      {
        m += 1;
        i = n;
        j = i1;
        break;
        k = 0;
        break label121;
        k = 0;
        break label121;
        k = localView.getLeft();
        n = i;
        i1 = j;
        if (k < j)
        {
          i1 = k;
          n = i;
        }
      }
      paramCanvas.clipRect(i, 0, j, getHeight());
      k = j;
      boolean bool2 = super.drawChild(paramCanvas, paramView, paramLong);
      paramCanvas.restoreToCount(i3);
      if ((this.zj > 0.0F) && (bool1))
      {
        j = (int)(((this.zi & 0xFF000000) >>> 24) * this.zj);
        m = this.zi;
        this.zk.setColor(j << 24 | m & 0xFFFFFF);
        paramCanvas.drawRect(i, 0.0F, k, getHeight(), this.zk);
      }
      do
      {
        return bool2;
        if ((this.zy != null) && (m(paramView, 3)))
        {
          i = this.zy.getIntrinsicWidth();
          j = paramView.getRight();
          k = this.zl.CF;
          f = Math.max(0.0F, Math.min(j / k, 1.0F));
          this.zy.setBounds(j, paramView.getTop(), i + j, paramView.getBottom());
          this.zy.setAlpha((int)(255.0F * f));
          this.zy.draw(paramCanvas);
          return bool2;
        }
      } while ((this.zz == null) || (!m(paramView, 5)));
      i = this.zz.getIntrinsicWidth();
      j = paramView.getLeft();
      k = getWidth();
      m = this.zm.CF;
      float f = Math.max(0.0F, Math.min((k - j) / m, 1.0F));
      this.zz.setBounds(j - i, paramView.getTop(), j, paramView.getBottom());
      this.zz.setAlpha((int)(255.0F * f));
      this.zz.draw(paramCanvas);
      return bool2;
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
    if ((paramLayoutParams instanceof LayoutParams)) {
      return new LayoutParams((LayoutParams)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new LayoutParams(paramLayoutParams);
  }
  
  public float getDrawerElevation()
  {
    if (ze) {
      return this.zg;
    }
    return 0.0F;
  }
  
  public Drawable getStatusBarBackgroundDrawable()
  {
    return this.eK;
  }
  
  final void i(View paramView, float paramFloat)
  {
    paramView = (LayoutParams)paramView.getLayoutParams();
    if (paramFloat == LayoutParams.a(paramView)) {}
    for (;;)
    {
      return;
      LayoutParams.a(paramView, paramFloat);
      if (this.bX != null)
      {
        int i = this.bX.size() - 1;
        while (i >= 0)
        {
          ((f)this.bX.get(i)).z(paramFloat);
          i -= 1;
        }
      }
    }
  }
  
  public final void k(Object paramObject, boolean paramBoolean)
  {
    this.zC = paramObject;
    this.eJ = paramBoolean;
    if ((!paramBoolean) && (getBackground() == null)) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      setWillNotDraw(paramBoolean);
      requestLayout();
      return;
    }
  }
  
  final boolean m(View paramView, int paramInt)
  {
    return (au(paramView) & paramInt) == paramInt;
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
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.eJ) && (this.eK != null))
    {
      int i = zI.I(this.zC);
      if (i > 0)
      {
        this.eK.setBounds(0, 0, getWidth(), i);
        this.eK.draw(paramCanvas);
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    int i = o.d(paramMotionEvent);
    boolean bool2 = this.zl.j(paramMotionEvent);
    boolean bool3 = this.zm.j(paramMotionEvent);
    label63:
    int j;
    label85:
    label113:
    float f1;
    float f2;
    switch (i)
    {
    default: 
      i = 0;
      if ((!(bool3 | bool2)) && (i == 0))
      {
        j = getChildCount();
        i = 0;
        if (i >= j) {
          break label373;
        }
        if (!LayoutParams.c((LayoutParams)getChildAt(i).getLayoutParams())) {
          break;
        }
        i = 1;
        if ((i == 0) && (!this.zw)) {}
      }
      else
      {
        bool1 = true;
      }
      return bool1;
    case 0: 
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      this.vm = f1;
      this.vn = f2;
      if (this.zj > 0.0F)
      {
        paramMotionEvent = this.zl.x((int)f1, (int)f2);
        if ((paramMotionEvent == null) || (!av(paramMotionEvent))) {}
      }
      break;
    }
    for (i = 1;; i = 0)
    {
      this.zv = false;
      this.zw = false;
      break label63;
      paramMotionEvent = this.zl;
      int k = paramMotionEvent.Cv.length;
      j = 0;
      label214:
      if (j < k) {
        if (paramMotionEvent.aA(j))
        {
          f1 = paramMotionEvent.Cx[j] - paramMotionEvent.Cv[j];
          f2 = paramMotionEvent.Cy[j] - paramMotionEvent.Cw[j];
          if (f1 * f1 + f2 * f2 > paramMotionEvent.fW * paramMotionEvent.fW)
          {
            i = 1;
            label286:
            if (i == 0) {
              break label331;
            }
          }
        }
      }
      for (i = 1; i != 0; i = 0)
      {
        this.zn.cA();
        this.zo.cA();
        i = 0;
        break label63;
        i = 0;
        break label286;
        i = 0;
        break label286;
        label331:
        j += 1;
        break label214;
      }
      z(true);
      this.zv = false;
      this.zw = false;
      break;
      i += 1;
      break label85;
      label373:
      i = 0;
      break label113;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      if (cC() != null) {}
      for (int i = 1; i != 0; i = 0)
      {
        android.support.v4.view.g.b(paramKeyEvent);
        return true;
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = false;
    if (paramInt == 4)
    {
      paramKeyEvent = cC();
      if ((paramKeyEvent != null) && (as(paramKeyEvent) == 0)) {
        z(false);
      }
      if (paramKeyEvent != null) {
        bool = true;
      }
      return bool;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mInLayout = true;
    int m = paramInt3 - paramInt1;
    int n = getChildCount();
    paramInt3 = 0;
    while (paramInt3 < n)
    {
      View localView = getChildAt(paramInt3);
      LayoutParams localLayoutParams;
      if (localView.getVisibility() != 8)
      {
        localLayoutParams = (LayoutParams)localView.getLayoutParams();
        if (av(localView)) {
          localView.layout(localLayoutParams.leftMargin, localLayoutParams.topMargin, localLayoutParams.leftMargin + localView.getMeasuredWidth(), localLayoutParams.topMargin + localView.getMeasuredHeight());
        }
      }
      else
      {
        paramInt3 += 1;
        continue;
      }
      int i1 = localView.getMeasuredWidth();
      int i2 = localView.getMeasuredHeight();
      int i;
      float f;
      label163:
      int j;
      if (m(localView, 3))
      {
        paramInt1 = -i1;
        i = (int)(i1 * LayoutParams.a(localLayoutParams)) + paramInt1;
        f = (i1 + i) / i1;
        if (f == LayoutParams.a(localLayoutParams)) {
          break label310;
        }
        j = 1;
        label177:
        switch (localLayoutParams.gravity & 0x70)
        {
        default: 
          localView.layout(i, localLayoutParams.topMargin, i1 + i, i2 + localLayoutParams.topMargin);
          label237:
          if (j != 0) {
            i(localView, f);
          }
          if (LayoutParams.a(localLayoutParams) <= 0.0F) {
            break;
          }
        }
      }
      for (paramInt1 = 0; localView.getVisibility() != paramInt1; paramInt1 = 4)
      {
        localView.setVisibility(paramInt1);
        break;
        i = m - (int)(i1 * LayoutParams.a(localLayoutParams));
        f = (m - i) / i1;
        break label163;
        label310:
        j = 0;
        break label177;
        paramInt1 = paramInt4 - paramInt2;
        localView.layout(i, paramInt1 - localLayoutParams.bottomMargin - localView.getMeasuredHeight(), i1 + i, paramInt1 - localLayoutParams.bottomMargin);
        break label237;
        int i3 = paramInt4 - paramInt2;
        int k = (i3 - i2) / 2;
        if (k < localLayoutParams.topMargin) {
          paramInt1 = localLayoutParams.topMargin;
        }
        for (;;)
        {
          localView.layout(i, paramInt1, i1 + i, i2 + paramInt1);
          break;
          paramInt1 = k;
          if (k + i2 > i3 - localLayoutParams.bottomMargin) {
            paramInt1 = i3 - localLayoutParams.bottomMargin - i2;
          }
        }
      }
    }
    this.mInLayout = false;
    this.wF = false;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int n = View.MeasureSpec.getMode(paramInt2);
    int k = View.MeasureSpec.getSize(paramInt1);
    int m = View.MeasureSpec.getSize(paramInt2);
    int j;
    int i;
    if (i1 == 1073741824)
    {
      j = k;
      if (n == 1073741824) {}
    }
    else if (isInEditMode())
    {
      i = k;
      if (i1 != Integer.MIN_VALUE)
      {
        i = k;
        if (i1 == 0) {
          i = 300;
        }
      }
      j = i;
      if (n == Integer.MIN_VALUE) {
        break label614;
      }
      j = i;
      if (n != 0) {
        break label614;
      }
      k = 300;
    }
    for (m = i;; m = j)
    {
      setMeasuredDimension(m, k);
      label146:
      Object localObject1;
      int i2;
      int i3;
      Object localObject2;
      if ((this.zC != null) && (z.Z(this)))
      {
        n = 1;
        int i4 = z.I(this);
        i = 0;
        j = 0;
        int i5 = getChildCount();
        i1 = 0;
        if (i1 >= i5) {
          break label613;
        }
        localObject1 = getChildAt(i1);
        i2 = j;
        i3 = i;
        if (((View)localObject1).getVisibility() != 8)
        {
          localObject2 = (LayoutParams)((View)localObject1).getLayoutParams();
          if (n != 0)
          {
            i2 = f.getAbsoluteGravity(((LayoutParams)localObject2).gravity, i4);
            if (!z.Z((View)localObject1)) {
              break label322;
            }
            zI.a((View)localObject1, this.zC, i2);
          }
        }
      }
      for (;;)
      {
        if (!av((View)localObject1)) {
          break label341;
        }
        ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(m - ((LayoutParams)localObject2).leftMargin - ((LayoutParams)localObject2).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(k - ((LayoutParams)localObject2).topMargin - ((LayoutParams)localObject2).bottomMargin, 1073741824));
        i3 = i;
        i2 = j;
        i1 += 1;
        j = i2;
        i = i3;
        break label146;
        throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        n = 0;
        break;
        label322:
        zI.a((ViewGroup.MarginLayoutParams)localObject2, this.zC, i2);
      }
      label341:
      if (aw((View)localObject1))
      {
        if ((ze) && (z.W((View)localObject1) != this.zg)) {
          z.g((View)localObject1, this.zg);
        }
        i3 = au((View)localObject1) & 0x7;
        if (i3 == 3)
        {
          i2 = 1;
          if (((i2 == 0) || (i == 0)) && ((i2 != 0) || (j == 0))) {
            break label497;
          }
          localObject2 = new StringBuilder("Child drawer has absolute gravity ");
          if ((i3 & 0x3) != 3) {
            break label471;
          }
          localObject1 = "LEFT";
        }
        for (;;)
        {
          throw new IllegalStateException((String)localObject1 + " but this DrawerLayout already has a drawer view along that edge");
          i2 = 0;
          break;
          label471:
          if ((i3 & 0x5) == 5) {
            localObject1 = "RIGHT";
          } else {
            localObject1 = Integer.toHexString(i3);
          }
        }
        label497:
        if (i2 != 0) {
          i = 1;
        }
        for (;;)
        {
          ((View)localObject1).measure(getChildMeasureSpec(paramInt1, this.zh + ((LayoutParams)localObject2).leftMargin + ((LayoutParams)localObject2).rightMargin, ((LayoutParams)localObject2).width), getChildMeasureSpec(paramInt2, ((LayoutParams)localObject2).topMargin + ((LayoutParams)localObject2).bottomMargin, ((LayoutParams)localObject2).height));
          i2 = j;
          i3 = i;
          break;
          j = 1;
        }
      }
      throw new IllegalStateException("Child " + localObject1 + " at index " + i1 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
      label613:
      return;
      label614:
      k = m;
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState)) {
      super.onRestoreInstanceState(paramParcelable);
    }
    do
    {
      return;
      paramParcelable = (SavedState)paramParcelable;
      super.onRestoreInstanceState(paramParcelable.getSuperState());
      if (paramParcelable.zN != 0)
      {
        View localView = as(paramParcelable.zN);
        if (localView != null) {
          ax(localView);
        }
      }
      if (paramParcelable.zO != 3) {
        s(paramParcelable.zO, 3);
      }
      if (paramParcelable.zP != 3) {
        s(paramParcelable.zP, 5);
      }
      if (paramParcelable.zQ != 3) {
        s(paramParcelable.zQ, 8388611);
      }
    } while (paramParcelable.zR == 3);
    s(paramParcelable.zR, 8388613);
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    Drawable localDrawable;
    if (!ze)
    {
      paramInt = z.I(this);
      if (paramInt != 0) {
        break label77;
      }
      if (this.zD == null) {
        break label101;
      }
      c(this.zD, paramInt);
      localDrawable = this.zD;
      this.zy = localDrawable;
      paramInt = z.I(this);
      if (paramInt != 0) {
        break label109;
      }
      if (this.zE == null) {
        break label133;
      }
      c(this.zE, paramInt);
      localDrawable = this.zE;
    }
    for (;;)
    {
      this.zz = localDrawable;
      return;
      label77:
      if (this.zE != null)
      {
        c(this.zE, paramInt);
        localDrawable = this.zE;
        break;
      }
      label101:
      localDrawable = this.zF;
      break;
      label109:
      if (this.zD != null)
      {
        c(this.zD, paramInt);
        localDrawable = this.zD;
      }
      else
      {
        label133:
        localDrawable = this.zG;
      }
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    SavedState localSavedState = new SavedState(super.onSaveInstanceState());
    int m = getChildCount();
    int i = 0;
    for (;;)
    {
      LayoutParams localLayoutParams;
      int j;
      if (i < m)
      {
        localLayoutParams = (LayoutParams)getChildAt(i).getLayoutParams();
        if (LayoutParams.b(localLayoutParams) != 1) {
          break label119;
        }
        j = 1;
        if (LayoutParams.b(localLayoutParams) != 2) {
          break label124;
        }
      }
      label119:
      label124:
      for (int k = 1;; k = 0)
      {
        if ((j == 0) && (k == 0)) {
          break label129;
        }
        localSavedState.zN = localLayoutParams.gravity;
        localSavedState.zO = this.zq;
        localSavedState.zP = this.zr;
        localSavedState.zQ = this.zt;
        localSavedState.zR = this.zu;
        return localSavedState;
        j = 0;
        break;
      }
      label129:
      i += 1;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.zl.k(paramMotionEvent);
    this.zm.k(paramMotionEvent);
    float f1;
    float f2;
    boolean bool;
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    case 2: 
    default: 
      return true;
    case 0: 
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      this.vm = f1;
      this.vn = f2;
      this.zv = false;
      this.zw = false;
      return true;
    case 1: 
      f2 = paramMotionEvent.getX();
      f1 = paramMotionEvent.getY();
      paramMotionEvent = this.zl.x((int)f2, (int)f1);
      if ((paramMotionEvent != null) && (av(paramMotionEvent)))
      {
        f2 -= this.vm;
        f1 -= this.vn;
        int i = this.zl.fW;
        if (f2 * f2 + f1 * f1 < i * i)
        {
          paramMotionEvent = cB();
          if (paramMotionEvent != null) {
            if (as(paramMotionEvent) == 2) {
              bool = true;
            }
          }
        }
      }
      break;
    }
    for (;;)
    {
      z(bool);
      this.zv = false;
      return true;
      bool = false;
      continue;
      z(true);
      this.zv = false;
      this.zw = false;
      return true;
      bool = true;
    }
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    this.zv = paramBoolean;
    if (paramBoolean) {
      z(true);
    }
  }
  
  public void requestLayout()
  {
    if (!this.mInLayout) {
      super.requestLayout();
    }
  }
  
  public void setDrawerElevation(float paramFloat)
  {
    this.zg = paramFloat;
    int i = 0;
    while (i < getChildCount())
    {
      View localView = getChildAt(i);
      if (aw(localView)) {
        z.g(localView, this.zg);
      }
      i += 1;
    }
  }
  
  @Deprecated
  public void setDrawerListener(f paramf)
  {
    if (this.zx != null)
    {
      f localf = this.zx;
      if ((localf != null) && (this.bX != null)) {
        this.bX.remove(localf);
      }
    }
    if ((paramf != null) && (paramf != null))
    {
      if (this.bX == null) {
        this.bX = new ArrayList();
      }
      this.bX.add(paramf);
    }
    this.zx = paramf;
  }
  
  public void setDrawerLockMode(int paramInt)
  {
    s(paramInt, 3);
    s(paramInt, 5);
  }
  
  public void setScrimColor(int paramInt)
  {
    this.zi = paramInt;
    invalidate();
  }
  
  public void setStatusBarBackground(int paramInt)
  {
    if (paramInt != 0) {}
    for (Drawable localDrawable = android.support.v4.content.a.f(getContext(), paramInt);; localDrawable = null)
    {
      this.eK = localDrawable;
      invalidate();
      return;
    }
  }
  
  public void setStatusBarBackground(Drawable paramDrawable)
  {
    this.eK = paramDrawable;
    invalidate();
  }
  
  public void setStatusBarBackgroundColor(int paramInt)
  {
    this.eK = new ColorDrawable(paramInt);
    invalidate();
  }
  
  public static class LayoutParams
    extends ViewGroup.MarginLayoutParams
  {
    public int gravity = 0;
    private float zK;
    private boolean zL;
    private int zM;
    
    public LayoutParams()
    {
      super(-1);
    }
    
    public LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
    {
      super(paramAttributeSet);
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, DrawerLayout.cl());
      this.gravity = paramContext.getInt(0, 0);
      paramContext.recycle();
    }
    
    public LayoutParams(LayoutParams paramLayoutParams)
    {
      super();
      this.gravity = paramLayoutParams.gravity;
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
  
  protected static class SavedState
    extends View.BaseSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator() {};
    int zN = 0;
    int zO;
    int zP;
    int zQ;
    int zR;
    
    public SavedState(Parcel paramParcel)
    {
      super();
      this.zN = paramParcel.readInt();
      this.zO = paramParcel.readInt();
      this.zP = paramParcel.readInt();
      this.zQ = paramParcel.readInt();
      this.zR = paramParcel.readInt();
    }
    
    public SavedState(Parcelable paramParcelable)
    {
      super();
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      super.writeToParcel(paramParcel, paramInt);
      paramParcel.writeInt(this.zN);
      paramParcel.writeInt(this.zO);
      paramParcel.writeInt(this.zP);
      paramParcel.writeInt(this.zQ);
      paramParcel.writeInt(this.zR);
    }
  }
  
  final class a
    extends android.support.v4.view.a
  {
    private final Rect ea = new Rect();
    
    a() {}
    
    public final void a(View paramView, b paramb)
    {
      if (DrawerLayout.cD()) {
        super.a(paramView, paramb);
      }
      for (;;)
      {
        paramb.setClassName(DrawerLayout.class.getName());
        paramb.setFocusable(false);
        paramb.setFocused(false);
        paramb.a(b.a.xt);
        paramb.a(b.a.xu);
        return;
        Object localObject1 = b.a(paramb);
        super.a(paramView, (b)localObject1);
        paramb.setSource(paramView);
        Object localObject2 = z.J(paramView);
        if ((localObject2 instanceof View)) {
          paramb.setParent((View)localObject2);
        }
        localObject2 = this.ea;
        ((b)localObject1).getBoundsInParent((Rect)localObject2);
        paramb.setBoundsInParent((Rect)localObject2);
        ((b)localObject1).getBoundsInScreen((Rect)localObject2);
        paramb.setBoundsInScreen((Rect)localObject2);
        paramb.setVisibleToUser(((b)localObject1).isVisibleToUser());
        paramb.setPackageName(((b)localObject1).getPackageName());
        paramb.setClassName(((b)localObject1).getClassName());
        paramb.setContentDescription(((b)localObject1).getContentDescription());
        paramb.setEnabled(((b)localObject1).isEnabled());
        paramb.setClickable(((b)localObject1).isClickable());
        paramb.setFocusable(((b)localObject1).isFocusable());
        paramb.setFocused(((b)localObject1).isFocused());
        paramb.setAccessibilityFocused(((b)localObject1).isAccessibilityFocused());
        paramb.setSelected(((b)localObject1).isSelected());
        paramb.setLongClickable(((b)localObject1).isLongClickable());
        paramb.addAction(((b)localObject1).getActions());
        ((b)localObject1).recycle();
        paramView = (ViewGroup)paramView;
        int j = paramView.getChildCount();
        int i = 0;
        while (i < j)
        {
          localObject1 = paramView.getChildAt(i);
          if (DrawerLayout.az((View)localObject1)) {
            paramb.addChild((View)localObject1);
          }
          i += 1;
        }
      }
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      if (paramAccessibilityEvent.getEventType() == 32)
      {
        paramAccessibilityEvent = paramAccessibilityEvent.getText();
        paramView = DrawerLayout.a(DrawerLayout.this);
        int i;
        if (paramView != null)
        {
          i = DrawerLayout.this.au(paramView);
          paramView = DrawerLayout.this;
          i = f.getAbsoluteGravity(i, z.I(paramView));
          if (i != 3) {
            break label73;
          }
          paramView = paramView.zA;
        }
        for (;;)
        {
          if (paramView != null) {
            paramAccessibilityEvent.add(paramView);
          }
          return true;
          label73:
          if (i == 5) {
            paramView = paramView.zB;
          } else {
            paramView = null;
          }
        }
      }
      return super.dispatchPopulateAccessibilityEvent(paramView, paramAccessibilityEvent);
    }
    
    public final void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      super.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
      paramAccessibilityEvent.setClassName(DrawerLayout.class.getName());
    }
    
    public final boolean onRequestSendAccessibilityEvent(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
    {
      if ((DrawerLayout.cD()) || (DrawerLayout.az(paramView))) {
        return super.onRequestSendAccessibilityEvent(paramViewGroup, paramView, paramAccessibilityEvent);
      }
      return false;
    }
  }
  
  final class b
    extends android.support.v4.view.a
  {
    b() {}
    
    public final void a(View paramView, b paramb)
    {
      super.a(paramView, paramb);
      if (!DrawerLayout.az(paramView)) {
        paramb.setParent(null);
      }
    }
  }
  
  static abstract interface c
  {
    public abstract int I(Object paramObject);
    
    public abstract Drawable P(Context paramContext);
    
    public abstract void a(View paramView, Object paramObject, int paramInt);
    
    public abstract void a(ViewGroup.MarginLayoutParams paramMarginLayoutParams, Object paramObject, int paramInt);
    
    public abstract void aA(View paramView);
  }
  
  static final class d
    implements DrawerLayout.c
  {
    public final int I(Object paramObject)
    {
      return g.I(paramObject);
    }
    
    public final Drawable P(Context paramContext)
    {
      return g.P(paramContext);
    }
    
    public final void a(View paramView, Object paramObject, int paramInt)
    {
      g.a(paramView, paramObject, paramInt);
    }
    
    public final void a(ViewGroup.MarginLayoutParams paramMarginLayoutParams, Object paramObject, int paramInt)
    {
      g.a(paramMarginLayoutParams, paramObject, paramInt);
    }
    
    public final void aA(View paramView)
    {
      g.aA(paramView);
    }
  }
  
  static final class e
    implements DrawerLayout.c
  {
    public final int I(Object paramObject)
    {
      return 0;
    }
    
    public final Drawable P(Context paramContext)
    {
      return null;
    }
    
    public final void a(View paramView, Object paramObject, int paramInt) {}
    
    public final void a(ViewGroup.MarginLayoutParams paramMarginLayoutParams, Object paramObject, int paramInt) {}
    
    public final void aA(View paramView) {}
  }
  
  public static abstract interface f
  {
    public abstract void cE();
    
    public abstract void cF();
    
    public abstract void z(float paramFloat);
  }
  
  private final class g
    extends u.a
  {
    final int zS;
    u zT;
    private final Runnable zU = new Runnable()
    {
      public final void run()
      {
        int k = 0;
        Object localObject2 = DrawerLayout.g.this;
        int m = ((DrawerLayout.g)localObject2).zT.CF;
        int i;
        Object localObject1;
        int j;
        if (((DrawerLayout.g)localObject2).zS == 3)
        {
          i = 1;
          if (i == 0) {
            break label227;
          }
          localObject1 = ((DrawerLayout.g)localObject2).zJ.as(3);
          if (localObject1 == null) {
            break label222;
          }
          j = -((View)localObject1).getWidth();
          label56:
          j += m;
        }
        for (;;)
        {
          label61:
          if ((localObject1 != null) && (((i != 0) && (((View)localObject1).getLeft() < j)) || ((i == 0) && (((View)localObject1).getLeft() > j) && (((DrawerLayout.g)localObject2).zJ.as((View)localObject1) == 0))))
          {
            DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)((View)localObject1).getLayoutParams();
            ((DrawerLayout.g)localObject2).zT.d((View)localObject1, j, ((View)localObject1).getTop());
            DrawerLayout.LayoutParams.a(localLayoutParams, true);
            ((DrawerLayout.g)localObject2).zJ.invalidate();
            ((DrawerLayout.g)localObject2).cG();
            localObject1 = ((DrawerLayout.g)localObject2).zJ;
            if (!((DrawerLayout)localObject1).zw)
            {
              long l = SystemClock.uptimeMillis();
              localObject2 = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
              j = ((DrawerLayout)localObject1).getChildCount();
              i = k;
              for (;;)
              {
                if (i < j)
                {
                  ((DrawerLayout)localObject1).getChildAt(i).dispatchTouchEvent((MotionEvent)localObject2);
                  i += 1;
                  continue;
                  i = 0;
                  break;
                  label222:
                  j = 0;
                  break label56;
                  label227:
                  localObject1 = ((DrawerLayout.g)localObject2).zJ.as(5);
                  j = ((DrawerLayout.g)localObject2).zJ.getWidth() - m;
                  break label61;
                }
              }
              ((MotionEvent)localObject2).recycle();
              ((DrawerLayout)localObject1).zw = true;
            }
          }
        }
      }
    };
    
    public g(int paramInt)
    {
      this.zS = paramInt;
    }
    
    public final void a(View paramView, float paramFloat1, float paramFloat2)
    {
      paramFloat2 = DrawerLayout.at(paramView);
      int k = paramView.getWidth();
      int i;
      if (DrawerLayout.this.m(paramView, 3)) {
        if ((paramFloat1 > 0.0F) || ((paramFloat1 == 0.0F) && (paramFloat2 > 0.5F))) {
          i = 0;
        }
      }
      for (;;)
      {
        this.zT.w(i, paramView.getTop());
        DrawerLayout.this.invalidate();
        return;
        i = -k;
        continue;
        int j = DrawerLayout.this.getWidth();
        if (paramFloat1 >= 0.0F)
        {
          i = j;
          if (paramFloat1 == 0.0F)
          {
            i = j;
            if (paramFloat2 <= 0.5F) {}
          }
        }
        else
        {
          i = j - k;
        }
      }
    }
    
    public final void a(View paramView, int paramInt1, int paramInt2)
    {
      paramInt2 = paramView.getWidth();
      float f;
      if (DrawerLayout.this.m(paramView, 3))
      {
        f = (paramInt2 + paramInt1) / paramInt2;
        DrawerLayout.this.i(paramView, f);
        if (f != 0.0F) {
          break label76;
        }
      }
      label76:
      for (paramInt1 = 4;; paramInt1 = 0)
      {
        paramView.setVisibility(paramInt1);
        DrawerLayout.this.invalidate();
        return;
        f = (DrawerLayout.this.getWidth() - paramInt1) / paramInt2;
        break;
      }
    }
    
    public final boolean b(View paramView, int paramInt)
    {
      return (DrawerLayout.aw(paramView)) && (DrawerLayout.this.m(paramView, this.zS)) && (DrawerLayout.this.as(paramView) == 0);
    }
    
    public final int c(View paramView, int paramInt)
    {
      return paramView.getTop();
    }
    
    public final void cA()
    {
      DrawerLayout.this.removeCallbacks(this.zU);
    }
    
    final void cG()
    {
      int i = 3;
      if (this.zS == 3) {
        i = 5;
      }
      View localView = DrawerLayout.this.as(i);
      if (localView != null) {
        DrawerLayout.this.ay(localView);
      }
    }
    
    public final void cH()
    {
      DrawerLayout.this.postDelayed(this.zU, 160L);
    }
    
    public final int d(View paramView, int paramInt)
    {
      if (DrawerLayout.this.m(paramView, 3)) {
        return Math.max(-paramView.getWidth(), Math.min(paramInt, 0));
      }
      int i = DrawerLayout.this.getWidth();
      return Math.max(i - paramView.getWidth(), Math.min(paramInt, i));
    }
    
    public final void f(View paramView, int paramInt)
    {
      DrawerLayout.LayoutParams.a((DrawerLayout.LayoutParams)paramView.getLayoutParams(), false);
      cG();
    }
    
    public final int s(View paramView)
    {
      if (DrawerLayout.aw(paramView)) {
        return paramView.getWidth();
      }
      return 0;
    }
    
    public final void t(int paramInt)
    {
      DrawerLayout localDrawerLayout = DrawerLayout.this;
      View localView = this.zT.CI;
      int i = localDrawerLayout.zl.Cu;
      int j = localDrawerLayout.zm.Cu;
      if ((i == 1) || (j == 1)) {
        i = 1;
      }
      DrawerLayout.LayoutParams localLayoutParams;
      while ((localView != null) && (paramInt == 0))
      {
        localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
        if (DrawerLayout.LayoutParams.a(localLayoutParams) != 0.0F) {
          break label267;
        }
        localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
        if ((DrawerLayout.LayoutParams.b(localLayoutParams) & 0x1) == 1)
        {
          DrawerLayout.LayoutParams.a(localLayoutParams, 0);
          if (localDrawerLayout.bX != null)
          {
            paramInt = localDrawerLayout.bX.size() - 1;
            for (;;)
            {
              if (paramInt >= 0)
              {
                ((DrawerLayout.f)localDrawerLayout.bX.get(paramInt)).cF();
                paramInt -= 1;
                continue;
                if ((i == 2) || (j == 2))
                {
                  i = 2;
                  break;
                }
                i = 0;
                break;
              }
            }
          }
          localDrawerLayout.c(localView, false);
          if (localDrawerLayout.hasWindowFocus())
          {
            localView = localDrawerLayout.getRootView();
            if (localView != null) {
              localView.sendAccessibilityEvent(32);
            }
          }
        }
      }
      while (i != localDrawerLayout.zp)
      {
        localDrawerLayout.zp = i;
        if (localDrawerLayout.bX == null) {
          break;
        }
        paramInt = localDrawerLayout.bX.size() - 1;
        while (paramInt >= 0)
        {
          localDrawerLayout.bX.get(paramInt);
          paramInt -= 1;
        }
        label267:
        if (DrawerLayout.LayoutParams.a(localLayoutParams) == 1.0F)
        {
          localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
          if ((DrawerLayout.LayoutParams.b(localLayoutParams) & 0x1) == 0)
          {
            DrawerLayout.LayoutParams.a(localLayoutParams, 1);
            if (localDrawerLayout.bX != null)
            {
              paramInt = localDrawerLayout.bX.size() - 1;
              while (paramInt >= 0)
              {
                ((DrawerLayout.f)localDrawerLayout.bX.get(paramInt)).cE();
                paramInt -= 1;
              }
            }
            localDrawerLayout.c(localView, true);
            if (localDrawerLayout.hasWindowFocus()) {
              localDrawerLayout.sendAccessibilityEvent(32);
            }
            localView.requestFocus();
          }
        }
      }
    }
    
    public final void t(int paramInt1, int paramInt2)
    {
      if ((paramInt1 & 0x1) == 1) {}
      for (View localView = DrawerLayout.this.as(3);; localView = DrawerLayout.this.as(5))
      {
        if ((localView != null) && (DrawerLayout.this.as(localView) == 0)) {
          this.zT.n(localView, paramInt2);
        }
        return;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/widget/DrawerLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */