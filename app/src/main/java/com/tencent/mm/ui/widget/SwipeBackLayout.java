package com.tencent.mm.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.o;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.support.v4.widget.q;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.b;
import com.tencent.mm.ui.base.b.a;
import com.tencent.mm.ui.mogic.a;
import com.tencent.mm.ui.mogic.a.a;
import com.tencent.mm.ui.tools.i;
import com.tencent.mm.ui.tools.i.a;
import com.tencent.mm.w.a.d;
import com.tencent.mm.w.a.f;

public class SwipeBackLayout
  extends FrameLayout
{
  public View FU;
  private Rect ea = new Rect();
  private boolean mEnable = true;
  private boolean mInLayout;
  private float uHW = 0.3F;
  private int uHX;
  private int uHY;
  public a uHZ;
  private float uIa;
  public Drawable uIb = getResources().getDrawable(a.f.shadow_left);
  private boolean uIc = true;
  private boolean uId = false;
  public boolean uIe = false;
  public boolean uIf = false;
  public boolean uIg = false;
  private boolean uIh = false;
  private b uIi;
  private boolean uIj;
  public a uIk = null;
  private float zj;
  
  public SwipeBackLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public SwipeBackLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public SwipeBackLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet);
    setFocusable(true);
    setDescendantFocusability(262144);
    init();
  }
  
  public final boolean cAF()
  {
    if (!this.uIg) {
      return false;
    }
    if (Float.compare(this.FU.getLeft(), 0.01F) <= 0)
    {
      this.uIg = false;
      return false;
    }
    return true;
  }
  
  public final boolean ceH()
  {
    cAF();
    return this.uIg;
  }
  
  public void computeScroll()
  {
    this.zj = Math.max(0.0F, 1.0F - this.uIa);
    a locala = this.uHZ;
    if (locala.Cu == 2)
    {
      boolean bool2 = locala.fT.computeScrollOffset();
      i = locala.fT.getCurrX();
      int j = locala.fT.getCurrY();
      int k = i - locala.CI.getLeft();
      int m = j - locala.CI.getTop();
      if (k != 0) {
        locala.CI.offsetLeftAndRight(k);
      }
      if (m != 0) {
        locala.CI.offsetTopAndBottom(m);
      }
      if ((k != 0) || (m != 0)) {
        locala.uuI.fd(i, j);
      }
      boolean bool1 = bool2;
      if (bool2)
      {
        bool1 = bool2;
        if (i == locala.fT.getFinalX())
        {
          bool1 = bool2;
          if (j == locala.fT.getFinalY())
          {
            locala.fT.abortAnimation();
            bool1 = locala.fT.isFinished();
          }
        }
      }
      if (!bool1) {
        locala.CK.post(locala.CL);
      }
    }
    if (locala.Cu == 2) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        z.E(this);
      }
      return;
    }
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    if (!this.mEnable) {
      bool = super.dispatchTouchEvent(paramMotionEvent);
    }
    float f1;
    float f2;
    int k;
    int m;
    int n;
    for (;;)
    {
      return bool;
      if (this.uIi != null) {
        this.uIi.G(paramMotionEvent);
      }
      if (paramMotionEvent.getAction() == 0) {
        this.uIj = false;
      }
      if (this.uIj) {
        return super.dispatchTouchEvent(paramMotionEvent);
      }
      if (cAF()) {
        return super.dispatchTouchEvent(paramMotionEvent);
      }
      try
      {
        if (this.uHZ.Cu != 1) {
          break label940;
        }
        locala = this.uHZ;
        j = o.d(paramMotionEvent);
        i = o.e(paramMotionEvent);
        if (j == 0) {
          locala.cancel();
        }
        if (locala.cE == null) {
          locala.cE = VelocityTracker.obtain();
        }
        locala.cE.addMovement(paramMotionEvent);
        switch (j)
        {
        case 0: 
          f1 = paramMotionEvent.getX();
          f2 = paramMotionEvent.getY();
          i = o.c(paramMotionEvent, 0);
          paramMotionEvent = locala.x((int)f1, (int)f2);
          locala.a(f1, f2, i);
          locala.o(paramMotionEvent, i);
          i = locala.Cz[i];
          if ((locala.CG & i) != 0) {
            return true;
          }
          break;
        case 5: 
          j = o.c(paramMotionEvent, i);
          f1 = o.d(paramMotionEvent, i);
          f2 = o.e(paramMotionEvent, i);
          locala.a(f1, f2, j);
          if (locala.Cu == 0)
          {
            locala.o(locala.x((int)f1, (int)f2), j);
            return true;
          }
          break;
        }
      }
      catch (NullPointerException paramMotionEvent)
      {
        x.printErrStackTrace("MicroMsg.SwipeBackLayout", paramMotionEvent, "got an NullPointerException", new Object[0]);
        return false;
        i = (int)f1;
        k = (int)f2;
        paramMotionEvent = locala.CI;
        if ((paramMotionEvent != null) && (i >= paramMotionEvent.getLeft()) && (i < paramMotionEvent.getRight()) && (k >= paramMotionEvent.getTop()) && (k < paramMotionEvent.getBottom()))
        {
          i = 1;
          if (i == 0) {
            continue;
          }
          locala.o(locala.CI, j);
          return true;
        }
      }
      catch (IllegalArgumentException paramMotionEvent)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.SwipeBackLayout", paramMotionEvent, "got an IllegalArgumentException", new Object[0]);
          return false;
          i = 0;
        }
        if (locala.Cu == 1)
        {
          i = o.b(paramMotionEvent, locala.cF);
          f1 = o.d(paramMotionEvent, i);
          f2 = o.e(paramMotionEvent, i);
          m = (int)(f1 - locala.Cx[locala.cF]);
          n = (int)(f2 - locala.Cy[locala.cF]);
          k = locala.CI.getLeft() + m;
          j = locala.CI.getTop() + n;
          int i2 = locala.CI.getLeft();
          int i1 = locala.CI.getTop();
          i = k;
          if (m != 0)
          {
            i = locala.uuI.d(locala.CI, k);
            locala.CI.offsetLeftAndRight(i - i2);
          }
          if (n == 0) {
            break label1419;
          }
          locala.CI.offsetTopAndBottom(0 - i1);
          j = 0;
          break label1419;
          locala.uuI.fd(i, j);
          locala.i(paramMotionEvent);
          return true;
        }
      }
      catch (ArrayIndexOutOfBoundsException paramMotionEvent)
      {
        label613:
        x.printErrStackTrace("MicroMsg.SwipeBackLayout", paramMotionEvent, "got an ArrayIndexOutOfBoundsException", new Object[0]);
        return false;
      }
    }
    int j = o.f(paramMotionEvent);
    int i = 0;
    label647:
    float f3;
    View localView;
    if (i < j)
    {
      k = o.c(paramMotionEvent, i);
      f1 = o.d(paramMotionEvent, i);
      f2 = o.e(paramMotionEvent, i);
      f3 = f1 - locala.Cv[k];
      locala.b(f3, f2 - locala.Cw[k], k);
      if (locala.Cu != 1)
      {
        localView = locala.x((int)f1, (int)f2);
        if ((!locala.l(localView, f3)) || (!locala.o(localView, k))) {
          break label1432;
        }
      }
    }
    locala.i(paramMotionEvent);
    return true;
    j = o.c(paramMotionEvent, i);
    if ((locala.Cu == 1) && (j == locala.cF))
    {
      k = o.f(paramMotionEvent);
      i = 0;
      label798:
      if (i >= k) {
        break label1411;
      }
      m = o.c(paramMotionEvent, i);
      if (m == locala.cF) {
        break label1441;
      }
      f1 = o.d(paramMotionEvent, i);
      f2 = o.e(paramMotionEvent, i);
      if ((locala.x((int)f1, (int)f2) != locala.CI) || (!locala.o(locala.CI, m))) {
        break label1441;
      }
      i = locala.cF;
      label876:
      if (i == -1) {
        locala.cY();
      }
    }
    locala.az(j);
    return true;
    if (locala.Cu == 1) {
      locala.cY();
    }
    locala.cancel();
    return true;
    if (locala.Cu == 1) {
      locala.t(0.0F, 0.0F);
    }
    locala.cancel();
    return true;
    label940:
    a locala = this.uHZ;
    j = o.d(paramMotionEvent);
    i = o.e(paramMotionEvent);
    if (j == 0) {
      locala.cancel();
    }
    if (locala.cE == null) {
      locala.cE = VelocityTracker.obtain();
    }
    locala.cE.addMovement(paramMotionEvent);
    switch (j)
    {
    case 4: 
      label1036:
      if (locala.Cu != 1) {
        break;
      }
    }
    for (i = 1;; i = 0)
    {
      if (i != 0)
      {
        x.i("changelcai", "shouldInterceptTouchEvent %s", new Object[] { paramMotionEvent });
        paramMotionEvent.setAction(3);
        super.dispatchTouchEvent(paramMotionEvent);
        return true;
        f1 = paramMotionEvent.getX();
        f2 = paramMotionEvent.getY();
        i = o.c(paramMotionEvent, 0);
        locala.a(f1, f2, i);
        localView = locala.x((int)f1, (int)f2);
        if ((localView == locala.CI) && (locala.Cu == 2)) {
          locala.o(localView, i);
        }
        if ((locala.Cz[i] & locala.CG) == 0) {
          break label1036;
        }
        break label1036;
        j = o.c(paramMotionEvent, i);
        f1 = o.d(paramMotionEvent, i);
        f2 = o.e(paramMotionEvent, i);
        locala.a(f1, f2, j);
        if ((locala.Cu == 0) || (locala.Cu != 2)) {
          break label1036;
        }
        localView = locala.x((int)f1, (int)f2);
        if (localView != locala.CI) {
          break label1036;
        }
        locala.o(localView, j);
        break label1036;
        j = o.f(paramMotionEvent);
        i = 0;
      }
      for (;;)
      {
        if (i < j)
        {
          k = o.c(paramMotionEvent, i);
          f1 = o.d(paramMotionEvent, i);
          f2 = o.e(paramMotionEvent, i);
          f3 = f1 - locala.Cv[k];
          locala.b(f3, f2 - locala.Cw[k], k);
          if (locala.Cu != 1)
          {
            localView = locala.x((int)f1, (int)f2);
            if ((localView == null) || (!locala.l(localView, f3)) || (!locala.o(localView, k))) {
              break label1453;
            }
          }
        }
        locala.i(paramMotionEvent);
        break label1036;
        locala.az(o.c(paramMotionEvent, i));
        break label1036;
        locala.cancel();
        break label1036;
        super.dispatchTouchEvent(paramMotionEvent);
        return true;
        label1411:
        i = -1;
        break label876;
        return true;
        label1419:
        if (m != 0) {
          break;
        }
        if (n == 0) {
          break label613;
        }
        break;
        label1432:
        i += 1;
        break label647;
        label1441:
        i += 1;
        break label798;
        break label1036;
        label1453:
        i += 1;
      }
    }
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    if (paramView == this.FU) {}
    for (int i = 1;; i = 0)
    {
      boolean bool = super.drawChild(paramCanvas, paramView, paramLong);
      if ((Float.compare(this.zj, 0.0F) > 0) && (i != 0) && (this.uHZ.Cu != 0))
      {
        Rect localRect = this.ea;
        paramView.getHitRect(localRect);
        this.uIb.setBounds(localRect.left - this.uIb.getIntrinsicWidth(), localRect.top, localRect.left, localRect.bottom);
        this.uIb.setAlpha((int)(this.zj * 255.0F));
        this.uIb.draw(paramCanvas);
      }
      return bool;
    }
  }
  
  public View getTargetContentView()
  {
    return this.FU;
  }
  
  public final void init()
  {
    this.uHZ = a.a(this, new c((byte)0));
    this.uHZ.CG = 1;
    float f = getResources().getDisplayMetrics().density;
    this.uHZ.CE = (100.0F * f);
    this.uHZ.CD = (f * 300.0F);
    this.uHX = 0;
    this.uHY = 0;
  }
  
  public final void mC(boolean paramBoolean)
  {
    x.i("MicroMsg.SwipeBackLayout", "ashutest::markTranslucent %B", new Object[] { Boolean.valueOf(paramBoolean) });
    this.uIe = paramBoolean;
  }
  
  public void onFinishInflate()
  {
    this.FU = this;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mInLayout = true;
    if (this.FU != null) {
      this.FU.layout(this.uHX, this.uHY, this.uHX + this.FU.getMeasuredWidth(), this.uHY + this.FU.getMeasuredHeight());
    }
    this.mInLayout = false;
  }
  
  public void requestLayout()
  {
    if (!this.mInLayout) {
      super.requestLayout();
    }
  }
  
  public void setContentView(View paramView)
  {
    this.FU = paramView;
  }
  
  public void setEnableGesture(boolean paramBoolean)
  {
    this.mEnable = paramBoolean;
  }
  
  public void setNeedRequestActivityTranslucent(boolean paramBoolean)
  {
    this.uIc = paramBoolean;
    if (this.uIc) {
      this.uId = false;
    }
  }
  
  public void setOnceDisEnableGesture(boolean paramBoolean)
  {
    x.i("MicroMsg.SwipeBackLayout", "[setOnceDisEnableGesture] enable:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    this.uIj = paramBoolean;
  }
  
  public void setSwipeBackListener(b paramb)
  {
    this.uIi = paramb;
  }
  
  public void setSwipeGestureDelegate(a parama)
  {
    this.uIk = parama;
  }
  
  public static abstract interface a
  {
    public abstract void onCancel();
    
    public abstract void onDrag();
    
    public abstract void onSwipeBack();
  }
  
  public static abstract interface b
  {
    public abstract void G(MotionEvent paramMotionEvent);
    
    public abstract void aw(float paramFloat);
    
    public abstract boolean ke(boolean paramBoolean);
  }
  
  private final class c
    extends a.a
    implements b.a
  {
    int uIl = 0;
    int uIm = 0;
    int uIn = 0;
    
    private c() {}
    
    public final boolean Gc(int paramInt)
    {
      a locala = SwipeBackLayout.a(SwipeBackLayout.this);
      if ((locala.CC & 1 << paramInt) != 0) {}
      for (int i = 1; (i != 0) && ((locala.Cz[paramInt] & 0x1) != 0); i = 0) {
        return true;
      }
      return false;
    }
    
    public final void a(View paramView, float paramFloat1, float paramFloat2)
    {
      boolean bool = false;
      int i = paramView.getWidth();
      this.uIm = 0;
      this.uIn = 0;
      if ((paramFloat1 > 0.0F) || ((paramFloat1 == 0.0F) && (SwipeBackLayout.f(SwipeBackLayout.this) > SwipeBackLayout.i(SwipeBackLayout.this)))) {}
      for (i = i + SwipeBackLayout.d(SwipeBackLayout.this).getIntrinsicWidth() + 10;; i = 0)
      {
        this.uIm = i;
        x.i("MicroMsg.SwipeBackLayout", "ashutest::onViewReleased, xvel:%f yvel:%f, releaseLeft:%d, releaseTop:%d, translucent %B", new Object[] { Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Integer.valueOf(this.uIm), Integer.valueOf(this.uIn), Boolean.valueOf(SwipeBackLayout.b(SwipeBackLayout.this)) });
        SwipeBackLayout.b(SwipeBackLayout.this, true);
        if (SwipeBackLayout.e(SwipeBackLayout.this) == null) {
          break;
        }
        paramView = SwipeBackLayout.e(SwipeBackLayout.this);
        if (this.uIm != 0) {
          bool = true;
        }
        if (!paramView.ke(bool)) {
          break;
        }
        x.i("MicroMsg.SwipeBackLayout", "intercepted by mSwipeBackListener.onViewReleased");
        return;
      }
      if (SwipeBackLayout.b(SwipeBackLayout.this))
      {
        paramView = SwipeBackLayout.a(SwipeBackLayout.this);
        i = this.uIm;
        int j = this.uIn;
        if (!paramView.CJ) {
          throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        paramView.g(i, j, (int)y.a(paramView.cE, paramView.cF), (int)y.b(paramView.cE, paramView.cF));
        SwipeBackLayout.this.invalidate();
        return;
      }
      SwipeBackLayout.c(SwipeBackLayout.this, true);
    }
    
    public final int czp()
    {
      return 1;
    }
    
    public final int d(View paramView, int paramInt)
    {
      if (SwipeBackLayout.b(SwipeBackLayout.this))
      {
        paramInt = Math.max(this.uIl, paramInt);
        this.uIl = 0;
        return Math.min(paramView.getWidth(), Math.max(paramInt, 0));
      }
      this.uIl = Math.max(this.uIl, paramInt);
      return 0;
    }
    
    public final void fd(int paramInt1, int paramInt2)
    {
      if (!SwipeBackLayout.b(SwipeBackLayout.this)) {}
      for (;;)
      {
        return;
        SwipeBackLayout.a(SwipeBackLayout.this, Math.abs(paramInt1 / (SwipeBackLayout.c(SwipeBackLayout.this).getWidth() + SwipeBackLayout.d(SwipeBackLayout.this).getIntrinsicWidth())));
        SwipeBackLayout.a(SwipeBackLayout.this, paramInt1);
        SwipeBackLayout.b(SwipeBackLayout.this, paramInt2);
        SwipeBackLayout.this.invalidate();
        if (SwipeBackLayout.e(SwipeBackLayout.this) != null) {
          SwipeBackLayout.e(SwipeBackLayout.this).aw(SwipeBackLayout.f(SwipeBackLayout.this));
        }
        if ((Float.compare(SwipeBackLayout.f(SwipeBackLayout.this), 1.0F) >= 0) && (!SwipeBackLayout.g(SwipeBackLayout.this)))
        {
          SwipeBackLayout.a(SwipeBackLayout.this, true);
          ah.A(new Runnable()
          {
            public final void run()
            {
              if (SwipeBackLayout.h(SwipeBackLayout.this) != null)
              {
                SwipeBackLayout.h(SwipeBackLayout.this).onSwipeBack();
                x.d("MicroMsg.SwipeBackLayout", "ashutest:: on popOut");
              }
              SwipeBackLayout.b(SwipeBackLayout.this, false);
            }
          });
        }
        while (SwipeBackLayout.a(SwipeBackLayout.this).Cu == 1)
        {
          g.aD(SwipeBackLayout.f(SwipeBackLayout.this));
          return;
          if (Float.compare(SwipeBackLayout.f(SwipeBackLayout.this), 0.01F) <= 0) {
            SwipeBackLayout.b(SwipeBackLayout.this, false);
          }
        }
      }
    }
    
    public final void kh(final boolean paramBoolean)
    {
      ah.A(new Runnable()
      {
        public final void run()
        {
          x.i("MicroMsg.SwipeBackLayout", "on Complete, result %B, releaseLeft %d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(SwipeBackLayout.c.this.uIm) });
          SwipeBackLayout.d(SwipeBackLayout.this, paramBoolean);
          if (paramBoolean) {
            if (SwipeBackLayout.c.this.uIm > 0)
            {
              g.aD(0.0F);
              SwipeBackLayout.this.mC(paramBoolean);
              if ((paramBoolean) && (SwipeBackLayout.k(SwipeBackLayout.this)))
              {
                if (SwipeBackLayout.c.this.uIm != 0) {
                  break label174;
                }
                i.a(SwipeBackLayout.c(SwipeBackLayout.this), 200L, 0.0F, new i.a()
                {
                  public final void bWQ()
                  {
                    onAnimationEnd();
                  }
                  
                  public final void onAnimationEnd()
                  {
                    SwipeBackLayout.b(SwipeBackLayout.this, false);
                  }
                });
              }
            }
          }
          for (;;)
          {
            SwipeBackLayout.c(SwipeBackLayout.this, false);
            return;
            g.aD(1.0F);
            break;
            SwipeBackLayout.b(SwipeBackLayout.this, false);
            break;
            label174:
            i.a(SwipeBackLayout.c(SwipeBackLayout.this), 200L, SwipeBackLayout.c.this.uIm, new i.a()
            {
              public final void bWQ()
              {
                onAnimationEnd();
              }
              
              public final void onAnimationEnd()
              {
                SwipeBackLayout.a(SwipeBackLayout.this, true);
                ah.A(new Runnable()
                {
                  public final void run()
                  {
                    if (SwipeBackLayout.h(SwipeBackLayout.this) != null)
                    {
                      SwipeBackLayout.h(SwipeBackLayout.this).onSwipeBack();
                      x.d("MicroMsg.SwipeBackLayout", "ashutest:: on onSwipeBack");
                    }
                    g.aD(1.0F);
                    SwipeBackLayout.b(SwipeBackLayout.this, false);
                  }
                });
              }
            });
            g.A(true, SwipeBackLayout.c.this.uIm);
          }
        }
      });
    }
    
    public final void t(int paramInt)
    {
      x.i("MicroMsg.SwipeBackLayout", "ashutest::onViewDragStateChanged state %d, requestedTranslucent %B fastRelease %B", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(SwipeBackLayout.j(SwipeBackLayout.this)), Boolean.valueOf(SwipeBackLayout.k(SwipeBackLayout.this)) });
      if (1 == paramInt)
      {
        x.i("MicroMsg.SwipeBackLayout", "ashutest:: on drag");
        if ((SwipeBackLayout.this.getContext() instanceof Activity)) {
          ((Activity)SwipeBackLayout.this.getContext()).getWindow().getDecorView().setBackgroundResource(a.d.transparent);
        }
        if (SwipeBackLayout.h(SwipeBackLayout.this) != null) {
          SwipeBackLayout.h(SwipeBackLayout.this).onDrag();
        }
        SwipeBackLayout.a(SwipeBackLayout.this, false);
        if (SwipeBackLayout.b(SwipeBackLayout.this)) {
          g.aD(0.0F);
        }
      }
      if ((paramInt == 0) && (!SwipeBackLayout.k(SwipeBackLayout.this)))
      {
        x.i("MicroMsg.SwipeBackLayout", "ashutest:: on cancel");
        if (SwipeBackLayout.h(SwipeBackLayout.this) != null) {
          SwipeBackLayout.h(SwipeBackLayout.this).onCancel();
        }
        g.aD(1.0F);
      }
      if ((1 == paramInt) && (SwipeBackLayout.l(SwipeBackLayout.this)) && ((SwipeBackLayout.this.getContext() instanceof Activity)) && (!SwipeBackLayout.b(SwipeBackLayout.this)) && (!SwipeBackLayout.j(SwipeBackLayout.this)))
      {
        x.i("MicroMsg.SwipeBackLayout", "ashutest:: match dragging");
        SwipeBackLayout.d(SwipeBackLayout.this, true);
        b.a((Activity)SwipeBackLayout.this.getContext(), this);
      }
      if (2 == paramInt)
      {
        x.i("MicroMsg.SwipeBackLayout", "ashutest:: notify settle, mReleasedLeft %d", new Object[] { Integer.valueOf(this.uIm) });
        if (this.uIm <= 0) {
          break label308;
        }
      }
      label308:
      for (boolean bool = true;; bool = false)
      {
        g.A(bool, this.uIm);
        return;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/widget/SwipeBackLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */