package android.support.v4.view;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public final class z
{
  static final m vI = new a();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23)
    {
      vI = new l();
      return;
    }
    if (i >= 21)
    {
      vI = new k();
      return;
    }
    if (i >= 19)
    {
      vI = new j();
      return;
    }
    if (i >= 17)
    {
      vI = new h();
      return;
    }
    if (i >= 16)
    {
      vI = new g();
      return;
    }
    if (i >= 15)
    {
      vI = new e();
      return;
    }
    if (i >= 14)
    {
      vI = new f();
      return;
    }
    if (i >= 11)
    {
      vI = new d();
      return;
    }
    if (i >= 9)
    {
      vI = new c();
      return;
    }
    if (i >= 7)
    {
      vI = new b();
      return;
    }
  }
  
  public static int B(View paramView)
  {
    return vI.B(paramView);
  }
  
  public static boolean C(View paramView)
  {
    return vI.C(paramView);
  }
  
  public static boolean D(View paramView)
  {
    return vI.D(paramView);
  }
  
  public static void E(View paramView)
  {
    vI.E(paramView);
  }
  
  public static int F(View paramView)
  {
    return vI.F(paramView);
  }
  
  public static float G(View paramView)
  {
    return vI.G(paramView);
  }
  
  public static int H(View paramView)
  {
    return vI.H(paramView);
  }
  
  public static int I(View paramView)
  {
    return vI.I(paramView);
  }
  
  public static ViewParent J(View paramView)
  {
    return vI.J(paramView);
  }
  
  public static boolean K(View paramView)
  {
    return vI.K(paramView);
  }
  
  public static int L(View paramView)
  {
    return vI.L(paramView);
  }
  
  public static int M(View paramView)
  {
    return vI.M(paramView);
  }
  
  public static void N(View paramView)
  {
    vI.N(paramView);
  }
  
  public static int O(View paramView)
  {
    return vI.O(paramView);
  }
  
  public static int P(View paramView)
  {
    return vI.P(paramView);
  }
  
  public static float Q(View paramView)
  {
    return vI.Q(paramView);
  }
  
  public static float R(View paramView)
  {
    return vI.R(paramView);
  }
  
  public static int S(View paramView)
  {
    return vI.S(paramView);
  }
  
  public static int T(View paramView)
  {
    return vI.T(paramView);
  }
  
  public static ai U(View paramView)
  {
    return vI.U(paramView);
  }
  
  public static float V(View paramView)
  {
    return vI.V(paramView);
  }
  
  public static float W(View paramView)
  {
    return vI.W(paramView);
  }
  
  public static int X(View paramView)
  {
    return vI.X(paramView);
  }
  
  public static void Y(View paramView)
  {
    vI.Y(paramView);
  }
  
  public static boolean Z(View paramView)
  {
    return vI.Z(paramView);
  }
  
  public static ap a(View paramView, ap paramap)
  {
    return vI.a(paramView, paramap);
  }
  
  public static void a(View paramView, int paramInt, Paint paramPaint)
  {
    vI.a(paramView, paramInt, paramPaint);
  }
  
  public static void a(View paramView, ColorStateList paramColorStateList)
  {
    vI.a(paramView, paramColorStateList);
  }
  
  public static void a(View paramView, Paint paramPaint)
  {
    vI.a(paramView, paramPaint);
  }
  
  public static void a(View paramView, PorterDuff.Mode paramMode)
  {
    vI.a(paramView, paramMode);
  }
  
  public static void a(View paramView, a parama)
  {
    vI.a(paramView, parama);
  }
  
  public static void a(View paramView, Runnable paramRunnable)
  {
    vI.a(paramView, paramRunnable);
  }
  
  public static void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    vI.a(paramView, paramRunnable, paramLong);
  }
  
  public static void a(View paramView, boolean paramBoolean)
  {
    vI.a(paramView, paramBoolean);
  }
  
  public static void aa(View paramView)
  {
    vI.aa(paramView);
  }
  
  public static void ab(View paramView)
  {
    vI.ab(paramView);
  }
  
  public static boolean ac(View paramView)
  {
    return vI.ac(paramView);
  }
  
  public static boolean ad(View paramView)
  {
    return vI.ad(paramView);
  }
  
  public static ColorStateList ae(View paramView)
  {
    return vI.ae(paramView);
  }
  
  public static PorterDuff.Mode af(View paramView)
  {
    return vI.af(paramView);
  }
  
  public static boolean ag(View paramView)
  {
    return vI.ag(paramView);
  }
  
  public static void ah(View paramView)
  {
    vI.ah(paramView);
  }
  
  public static boolean ai(View paramView)
  {
    return vI.ai(paramView);
  }
  
  public static float aj(View paramView)
  {
    return vI.aj(paramView);
  }
  
  public static boolean ak(View paramView)
  {
    return vI.ak(paramView);
  }
  
  public static boolean al(View paramView)
  {
    return vI.al(paramView);
  }
  
  public static ap b(View paramView, ap paramap)
  {
    return vI.b(paramView, paramap);
  }
  
  public static void b(View paramView, float paramFloat)
  {
    vI.b(paramView, paramFloat);
  }
  
  public static void b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    vI.b(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void b(View paramView, t paramt)
  {
    vI.b(paramView, paramt);
  }
  
  public static void b(View paramView, boolean paramBoolean)
  {
    vI.b(paramView, paramBoolean);
  }
  
  public static void c(View paramView, float paramFloat)
  {
    vI.c(paramView, paramFloat);
  }
  
  public static void c(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    vI.c(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void c(ViewGroup paramViewGroup)
  {
    vI.c(paramViewGroup);
  }
  
  public static int combineMeasuredStates(int paramInt1, int paramInt2)
  {
    return vI.combineMeasuredStates(paramInt1, paramInt2);
  }
  
  public static void d(View paramView, float paramFloat)
  {
    vI.d(paramView, paramFloat);
  }
  
  public static void e(View paramView, float paramFloat)
  {
    vI.e(paramView, paramFloat);
  }
  
  public static void f(View paramView, float paramFloat)
  {
    vI.f(paramView, paramFloat);
  }
  
  public static void g(View paramView, float paramFloat)
  {
    vI.g(paramView, paramFloat);
  }
  
  public static boolean g(View paramView, int paramInt)
  {
    return vI.g(paramView, paramInt);
  }
  
  public static boolean h(View paramView, int paramInt)
  {
    return vI.h(paramView, paramInt);
  }
  
  public static void i(View paramView, int paramInt)
  {
    vI.i(paramView, paramInt);
  }
  
  public static void j(View paramView, int paramInt)
  {
    vI.j(paramView, paramInt);
  }
  
  public static void k(View paramView, int paramInt)
  {
    vI.k(paramView, paramInt);
  }
  
  public static void l(View paramView, int paramInt)
  {
    vI.l(paramView, paramInt);
  }
  
  public static int resolveSizeAndState(int paramInt1, int paramInt2, int paramInt3)
  {
    return vI.resolveSizeAndState(paramInt1, paramInt2, paramInt3);
  }
  
  static class a
    implements z.m
  {
    WeakHashMap<View, ai> vJ = null;
    
    public int B(View paramView)
    {
      return 2;
    }
    
    public boolean C(View paramView)
    {
      return false;
    }
    
    public boolean D(View paramView)
    {
      return false;
    }
    
    public void E(View paramView)
    {
      paramView.invalidate();
    }
    
    public int F(View paramView)
    {
      return 0;
    }
    
    public float G(View paramView)
    {
      return 1.0F;
    }
    
    public int H(View paramView)
    {
      return 0;
    }
    
    public int I(View paramView)
    {
      return 0;
    }
    
    public ViewParent J(View paramView)
    {
      return paramView.getParent();
    }
    
    public boolean K(View paramView)
    {
      boolean bool2 = false;
      paramView = paramView.getBackground();
      boolean bool1 = bool2;
      if (paramView != null)
      {
        bool1 = bool2;
        if (paramView.getOpacity() == -1) {
          bool1 = true;
        }
      }
      return bool1;
    }
    
    public int L(View paramView)
    {
      return paramView.getMeasuredWidth();
    }
    
    public int M(View paramView)
    {
      return 0;
    }
    
    public void N(View paramView) {}
    
    public int O(View paramView)
    {
      return paramView.getPaddingLeft();
    }
    
    public int P(View paramView)
    {
      return paramView.getPaddingRight();
    }
    
    public float Q(View paramView)
    {
      return 0.0F;
    }
    
    public float R(View paramView)
    {
      return 0.0F;
    }
    
    public int S(View paramView)
    {
      return aa.S(paramView);
    }
    
    public int T(View paramView)
    {
      return aa.T(paramView);
    }
    
    public ai U(View paramView)
    {
      return new ai(paramView);
    }
    
    public float V(View paramView)
    {
      return 0.0F;
    }
    
    public float W(View paramView)
    {
      return 0.0F;
    }
    
    public int X(View paramView)
    {
      return 0;
    }
    
    public void Y(View paramView) {}
    
    public boolean Z(View paramView)
    {
      return false;
    }
    
    public ap a(View paramView, ap paramap)
    {
      return paramap;
    }
    
    public void a(View paramView, int paramInt, Paint paramPaint) {}
    
    public void a(View paramView, ColorStateList paramColorStateList)
    {
      if ((paramView instanceof x)) {
        ((x)paramView).setSupportBackgroundTintList(paramColorStateList);
      }
    }
    
    public void a(View paramView, Paint paramPaint) {}
    
    public void a(View paramView, PorterDuff.Mode paramMode)
    {
      if ((paramView instanceof x)) {
        ((x)paramView).setSupportBackgroundTintMode(paramMode);
      }
    }
    
    public void a(View paramView, a parama) {}
    
    public void a(View paramView, Runnable paramRunnable)
    {
      paramView.postDelayed(paramRunnable, cc());
    }
    
    public void a(View paramView, Runnable paramRunnable, long paramLong)
    {
      paramView.postDelayed(paramRunnable, cc() + paramLong);
    }
    
    public void a(View paramView, boolean paramBoolean) {}
    
    public void aa(View paramView) {}
    
    public void ab(View paramView) {}
    
    public boolean ac(View paramView)
    {
      return true;
    }
    
    public boolean ad(View paramView)
    {
      return false;
    }
    
    public ColorStateList ae(View paramView)
    {
      if ((paramView instanceof x)) {
        return ((x)paramView).getSupportBackgroundTintList();
      }
      return null;
    }
    
    public PorterDuff.Mode af(View paramView)
    {
      if ((paramView instanceof x)) {
        return ((x)paramView).getSupportBackgroundTintMode();
      }
      return null;
    }
    
    public boolean ag(View paramView)
    {
      if ((paramView instanceof p)) {
        return ((p)paramView).isNestedScrollingEnabled();
      }
      return false;
    }
    
    public void ah(View paramView)
    {
      if ((paramView instanceof p)) {
        ((p)paramView).stopNestedScroll();
      }
    }
    
    public boolean ai(View paramView)
    {
      return (paramView.getWidth() > 0) && (paramView.getHeight() > 0);
    }
    
    public float aj(View paramView)
    {
      return am(paramView) + W(paramView);
    }
    
    public boolean ak(View paramView)
    {
      return paramView.getWindowToken() != null;
    }
    
    public boolean al(View paramView)
    {
      return false;
    }
    
    public float am(View paramView)
    {
      return 0.0F;
    }
    
    public ap b(View paramView, ap paramap)
    {
      return paramap;
    }
    
    public void b(View paramView, float paramFloat) {}
    
    public void b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramView.invalidate(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    public void b(View paramView, t paramt) {}
    
    public void b(View paramView, boolean paramBoolean) {}
    
    public void c(View paramView, float paramFloat) {}
    
    public void c(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramView.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    public void c(ViewGroup paramViewGroup) {}
    
    long cc()
    {
      return 10L;
    }
    
    public int combineMeasuredStates(int paramInt1, int paramInt2)
    {
      return paramInt1 | paramInt2;
    }
    
    public void d(View paramView, float paramFloat) {}
    
    public void e(View paramView, float paramFloat) {}
    
    public void f(View paramView, float paramFloat) {}
    
    public void g(View paramView, float paramFloat) {}
    
    public boolean g(View paramView, int paramInt)
    {
      if ((paramView instanceof w))
      {
        paramView = (w)paramView;
        int i = paramView.computeHorizontalScrollOffset();
        int j = paramView.computeHorizontalScrollRange() - paramView.computeHorizontalScrollExtent();
        if (j != 0) {
          if (paramInt < 0) {
            if (i > 0) {
              paramInt = 1;
            }
          }
        }
        while (paramInt != 0)
        {
          return true;
          paramInt = 0;
          continue;
          if (i < j - 1) {
            paramInt = 1;
          } else {
            paramInt = 0;
          }
        }
      }
      return false;
    }
    
    public boolean h(View paramView, int paramInt)
    {
      if ((paramView instanceof w))
      {
        paramView = (w)paramView;
        int i = paramView.computeVerticalScrollOffset();
        int j = paramView.computeVerticalScrollRange() - paramView.computeVerticalScrollExtent();
        if (j != 0) {
          if (paramInt < 0) {
            if (i > 0) {
              paramInt = 1;
            }
          }
        }
        while (paramInt != 0)
        {
          return true;
          paramInt = 0;
          continue;
          if (i < j - 1) {
            paramInt = 1;
          } else {
            paramInt = 0;
          }
        }
      }
      return false;
    }
    
    public void i(View paramView, int paramInt) {}
    
    public void j(View paramView, int paramInt)
    {
      int i = paramView.getTop();
      paramView.offsetTopAndBottom(paramInt);
      if (paramInt != 0)
      {
        ViewParent localViewParent = paramView.getParent();
        if ((localViewParent instanceof View))
        {
          paramInt = Math.abs(paramInt);
          ((View)localViewParent).invalidate(paramView.getLeft(), i - paramInt, paramView.getRight(), i + paramView.getHeight() + paramInt);
        }
      }
      else
      {
        return;
      }
      paramView.invalidate();
    }
    
    public void k(View paramView, int paramInt)
    {
      int i = paramView.getLeft();
      paramView.offsetLeftAndRight(paramInt);
      if (paramInt != 0)
      {
        ViewParent localViewParent = paramView.getParent();
        if ((localViewParent instanceof View))
        {
          paramInt = Math.abs(paramInt);
          ((View)localViewParent).invalidate(i - paramInt, paramView.getTop(), i + paramView.getWidth() + paramInt, paramView.getBottom());
        }
      }
      else
      {
        return;
      }
      paramView.invalidate();
    }
    
    public void l(View paramView, int paramInt) {}
    
    public int resolveSizeAndState(int paramInt1, int paramInt2, int paramInt3)
    {
      return View.resolveSize(paramInt1, paramInt2);
    }
  }
  
  static class b
    extends z.a
  {
    public final boolean K(View paramView)
    {
      return paramView.isOpaque();
    }
    
    public final void c(ViewGroup paramViewGroup)
    {
      if (ab.vQ == null) {}
      try
      {
        ab.vQ = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[] { Boolean.TYPE });
        ab.vQ.setAccessible(true);
        try
        {
          ab.vQ.invoke(paramViewGroup, new Object[] { Boolean.valueOf(true) });
          return;
        }
        catch (InvocationTargetException paramViewGroup) {}catch (IllegalArgumentException paramViewGroup) {}catch (IllegalAccessException paramViewGroup) {}
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        for (;;) {}
      }
    }
  }
  
  static class c
    extends z.b
  {
    public final int B(View paramView)
    {
      return paramView.getOverScrollMode();
    }
  }
  
  static class d
    extends z.c
  {
    public final float G(View paramView)
    {
      return paramView.getAlpha();
    }
    
    public final int H(View paramView)
    {
      return paramView.getLayerType();
    }
    
    public final int L(View paramView)
    {
      return paramView.getMeasuredWidthAndState();
    }
    
    public final int M(View paramView)
    {
      return paramView.getMeasuredState();
    }
    
    public final float Q(View paramView)
    {
      return paramView.getTranslationX();
    }
    
    public final float R(View paramView)
    {
      return paramView.getTranslationY();
    }
    
    public final float V(View paramView)
    {
      return paramView.getScaleX();
    }
    
    public final void a(View paramView, int paramInt, Paint paramPaint)
    {
      paramView.setLayerType(paramInt, paramPaint);
    }
    
    public void a(View paramView, Paint paramPaint)
    {
      paramView.setLayerType(paramView.getLayerType(), paramPaint);
      paramView.invalidate();
    }
    
    public final void aa(View paramView)
    {
      paramView.jumpDrawablesToCurrentState();
    }
    
    public final void ab(View paramView)
    {
      paramView.setSaveFromParentEnabled(false);
    }
    
    public final void b(View paramView, float paramFloat)
    {
      paramView.setTranslationX(paramFloat);
    }
    
    public final void b(View paramView, boolean paramBoolean)
    {
      paramView.setActivated(paramBoolean);
    }
    
    public final void c(View paramView, float paramFloat)
    {
      paramView.setTranslationY(paramFloat);
    }
    
    final long cc()
    {
      return ValueAnimator.getFrameDelay();
    }
    
    public final int combineMeasuredStates(int paramInt1, int paramInt2)
    {
      return View.combineMeasuredStates(paramInt1, paramInt2);
    }
    
    public final void d(View paramView, float paramFloat)
    {
      paramView.setAlpha(paramFloat);
    }
    
    public final void e(View paramView, float paramFloat)
    {
      paramView.setScaleX(paramFloat);
    }
    
    public final void f(View paramView, float paramFloat)
    {
      paramView.setScaleY(paramFloat);
    }
    
    public void j(View paramView, int paramInt)
    {
      ac.j(paramView, paramInt);
    }
    
    public void k(View paramView, int paramInt)
    {
      ac.k(paramView, paramInt);
    }
    
    public final int resolveSizeAndState(int paramInt1, int paramInt2, int paramInt3)
    {
      return View.resolveSizeAndState(paramInt1, paramInt2, paramInt3);
    }
  }
  
  static class e
    extends z.f
  {
    public final boolean al(View paramView)
    {
      return paramView.hasOnClickListeners();
    }
  }
  
  static class f
    extends z.d
  {
    static Field vK;
    static boolean vL = false;
    
    public final boolean C(View paramView)
    {
      if (vL) {}
      for (;;)
      {
        return false;
        if (vK == null) {}
        try
        {
          Field localField = View.class.getDeclaredField("mAccessibilityDelegate");
          vK = localField;
          localField.setAccessible(true);
        }
        catch (Throwable paramView)
        {
          try
          {
            paramView = vK.get(paramView);
            if (paramView == null) {
              continue;
            }
            return true;
          }
          catch (Throwable paramView)
          {
            vL = true;
          }
          paramView = paramView;
          vL = true;
          return false;
        }
      }
      return false;
    }
    
    public final ai U(View paramView)
    {
      if (this.vJ == null) {
        this.vJ = new WeakHashMap();
      }
      ai localai2 = (ai)this.vJ.get(paramView);
      ai localai1 = localai2;
      if (localai2 == null)
      {
        localai1 = new ai(paramView);
        this.vJ.put(paramView, localai1);
      }
      return localai1;
    }
    
    public final void a(View paramView, a parama)
    {
      if (parama == null) {}
      for (parama = null;; parama = parama.tX)
      {
        paramView.setAccessibilityDelegate((View.AccessibilityDelegate)parama);
        return;
      }
    }
    
    public final void a(View paramView, boolean paramBoolean)
    {
      paramView.setFitsSystemWindows(paramBoolean);
    }
    
    public final boolean g(View paramView, int paramInt)
    {
      return paramView.canScrollHorizontally(paramInt);
    }
    
    public final boolean h(View paramView, int paramInt)
    {
      return paramView.canScrollVertically(paramInt);
    }
  }
  
  static class g
    extends z.e
  {
    public final boolean D(View paramView)
    {
      return paramView.hasTransientState();
    }
    
    public final void E(View paramView)
    {
      paramView.postInvalidateOnAnimation();
    }
    
    public final int F(View paramView)
    {
      return paramView.getImportantForAccessibility();
    }
    
    public final ViewParent J(View paramView)
    {
      return paramView.getParentForAccessibility();
    }
    
    public final int S(View paramView)
    {
      return paramView.getMinimumWidth();
    }
    
    public final int T(View paramView)
    {
      return paramView.getMinimumHeight();
    }
    
    public void Y(View paramView)
    {
      paramView.requestFitSystemWindows();
    }
    
    public final boolean Z(View paramView)
    {
      return paramView.getFitsSystemWindows();
    }
    
    public final void a(View paramView, Runnable paramRunnable)
    {
      paramView.postOnAnimation(paramRunnable);
    }
    
    public final void a(View paramView, Runnable paramRunnable, long paramLong)
    {
      paramView.postOnAnimationDelayed(paramRunnable, paramLong);
    }
    
    public final boolean ac(View paramView)
    {
      return paramView.hasOverlappingRendering();
    }
    
    public final void b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramView.postInvalidate(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    
    public void i(View paramView, int paramInt)
    {
      int i = paramInt;
      if (paramInt == 4) {
        i = 2;
      }
      paramView.setImportantForAccessibility(i);
    }
  }
  
  static class h
    extends z.g
  {
    public final int I(View paramView)
    {
      return paramView.getLayoutDirection();
    }
    
    public final int O(View paramView)
    {
      return paramView.getPaddingStart();
    }
    
    public final int P(View paramView)
    {
      return paramView.getPaddingEnd();
    }
    
    public final int X(View paramView)
    {
      return paramView.getWindowSystemUiVisibility();
    }
    
    public final void a(View paramView, Paint paramPaint)
    {
      paramView.setLayerPaint(paramPaint);
    }
    
    public final boolean ad(View paramView)
    {
      return paramView.isPaddingRelative();
    }
    
    public final void c(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      paramView.setPaddingRelative(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  static class i
    extends z.h
  {}
  
  static class j
    extends z.i
  {
    public final void N(View paramView)
    {
      paramView.setAccessibilityLiveRegion(1);
    }
    
    public final boolean ai(View paramView)
    {
      return paramView.isLaidOut();
    }
    
    public final boolean ak(View paramView)
    {
      return paramView.isAttachedToWindow();
    }
    
    public final void i(View paramView, int paramInt)
    {
      paramView.setImportantForAccessibility(paramInt);
    }
  }
  
  static class k
    extends z.j
  {
    public final float W(View paramView)
    {
      return paramView.getElevation();
    }
    
    public final void Y(View paramView)
    {
      paramView.requestApplyInsets();
    }
    
    public final ap a(View paramView, ap paramap)
    {
      Object localObject = paramap;
      if ((paramap instanceof aq))
      {
        WindowInsets localWindowInsets = ((aq)paramap).xp;
        paramView = paramView.onApplyWindowInsets(localWindowInsets);
        localObject = paramap;
        if (paramView != localWindowInsets) {
          localObject = new aq(paramView);
        }
      }
      return (ap)localObject;
    }
    
    public final void a(View paramView, ColorStateList paramColorStateList)
    {
      paramView.setBackgroundTintList(paramColorStateList);
      if (Build.VERSION.SDK_INT == 21)
      {
        paramColorStateList = paramView.getBackground();
        if ((paramView.getBackgroundTintList() == null) || (paramView.getBackgroundTintMode() == null)) {
          break label64;
        }
      }
      label64:
      for (int i = 1;; i = 0)
      {
        if ((paramColorStateList != null) && (i != 0))
        {
          if (paramColorStateList.isStateful()) {
            paramColorStateList.setState(paramView.getDrawableState());
          }
          paramView.setBackground(paramColorStateList);
        }
        return;
      }
    }
    
    public final void a(View paramView, PorterDuff.Mode paramMode)
    {
      paramView.setBackgroundTintMode(paramMode);
      if (Build.VERSION.SDK_INT == 21)
      {
        paramMode = paramView.getBackground();
        if ((paramView.getBackgroundTintList() == null) || (paramView.getBackgroundTintMode() == null)) {
          break label64;
        }
      }
      label64:
      for (int i = 1;; i = 0)
      {
        if ((paramMode != null) && (i != 0))
        {
          if (paramMode.isStateful()) {
            paramMode.setState(paramView.getDrawableState());
          }
          paramView.setBackground(paramMode);
        }
        return;
      }
    }
    
    public final ColorStateList ae(View paramView)
    {
      return paramView.getBackgroundTintList();
    }
    
    public final PorterDuff.Mode af(View paramView)
    {
      return paramView.getBackgroundTintMode();
    }
    
    public final boolean ag(View paramView)
    {
      return paramView.isNestedScrollingEnabled();
    }
    
    public final void ah(View paramView)
    {
      paramView.stopNestedScroll();
    }
    
    public final float aj(View paramView)
    {
      return paramView.getZ();
    }
    
    public final float am(View paramView)
    {
      return paramView.getTranslationZ();
    }
    
    public final ap b(View paramView, ap paramap)
    {
      Object localObject = paramap;
      if ((paramap instanceof aq))
      {
        WindowInsets localWindowInsets = ((aq)paramap).xp;
        paramView = paramView.dispatchApplyWindowInsets(localWindowInsets);
        localObject = paramap;
        if (paramView != localWindowInsets) {
          localObject = new aq(paramView);
        }
      }
      return (ap)localObject;
    }
    
    public final void b(View paramView, t paramt)
    {
      if (paramt == null)
      {
        paramView.setOnApplyWindowInsetsListener(null);
        return;
      }
      paramView.setOnApplyWindowInsetsListener(new ad.1(paramt));
    }
    
    public final void g(View paramView, float paramFloat)
    {
      paramView.setElevation(paramFloat);
    }
    
    public void j(View paramView, int paramInt)
    {
      Rect localRect = ad.cd();
      ViewParent localViewParent = paramView.getParent();
      int i;
      if ((localViewParent instanceof View))
      {
        View localView = (View)localViewParent;
        localRect.set(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
        if (!localRect.intersects(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom())) {
          i = 1;
        }
      }
      for (;;)
      {
        ac.j(paramView, paramInt);
        if ((i != 0) && (localRect.intersect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()))) {
          ((View)localViewParent).invalidate(localRect);
        }
        return;
        i = 0;
        continue;
        i = 0;
      }
    }
    
    public void k(View paramView, int paramInt)
    {
      Rect localRect = ad.cd();
      ViewParent localViewParent = paramView.getParent();
      int i;
      if ((localViewParent instanceof View))
      {
        View localView = (View)localViewParent;
        localRect.set(localView.getLeft(), localView.getTop(), localView.getRight(), localView.getBottom());
        if (!localRect.intersects(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom())) {
          i = 1;
        }
      }
      for (;;)
      {
        ac.k(paramView, paramInt);
        if ((i != 0) && (localRect.intersect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom()))) {
          ((View)localViewParent).invalidate(localRect);
        }
        return;
        i = 0;
        continue;
        i = 0;
      }
    }
  }
  
  static final class l
    extends z.k
  {
    public final void j(View paramView, int paramInt)
    {
      paramView.offsetTopAndBottom(paramInt);
    }
    
    public final void k(View paramView, int paramInt)
    {
      paramView.offsetLeftAndRight(paramInt);
    }
    
    public final void l(View paramView, int paramInt)
    {
      paramView.setScrollIndicators(paramInt, 3);
    }
  }
  
  static abstract interface m
  {
    public abstract int B(View paramView);
    
    public abstract boolean C(View paramView);
    
    public abstract boolean D(View paramView);
    
    public abstract void E(View paramView);
    
    public abstract int F(View paramView);
    
    public abstract float G(View paramView);
    
    public abstract int H(View paramView);
    
    public abstract int I(View paramView);
    
    public abstract ViewParent J(View paramView);
    
    public abstract boolean K(View paramView);
    
    public abstract int L(View paramView);
    
    public abstract int M(View paramView);
    
    public abstract void N(View paramView);
    
    public abstract int O(View paramView);
    
    public abstract int P(View paramView);
    
    public abstract float Q(View paramView);
    
    public abstract float R(View paramView);
    
    public abstract int S(View paramView);
    
    public abstract int T(View paramView);
    
    public abstract ai U(View paramView);
    
    public abstract float V(View paramView);
    
    public abstract float W(View paramView);
    
    public abstract int X(View paramView);
    
    public abstract void Y(View paramView);
    
    public abstract boolean Z(View paramView);
    
    public abstract ap a(View paramView, ap paramap);
    
    public abstract void a(View paramView, int paramInt, Paint paramPaint);
    
    public abstract void a(View paramView, ColorStateList paramColorStateList);
    
    public abstract void a(View paramView, Paint paramPaint);
    
    public abstract void a(View paramView, PorterDuff.Mode paramMode);
    
    public abstract void a(View paramView, a parama);
    
    public abstract void a(View paramView, Runnable paramRunnable);
    
    public abstract void a(View paramView, Runnable paramRunnable, long paramLong);
    
    public abstract void a(View paramView, boolean paramBoolean);
    
    public abstract void aa(View paramView);
    
    public abstract void ab(View paramView);
    
    public abstract boolean ac(View paramView);
    
    public abstract boolean ad(View paramView);
    
    public abstract ColorStateList ae(View paramView);
    
    public abstract PorterDuff.Mode af(View paramView);
    
    public abstract boolean ag(View paramView);
    
    public abstract void ah(View paramView);
    
    public abstract boolean ai(View paramView);
    
    public abstract float aj(View paramView);
    
    public abstract boolean ak(View paramView);
    
    public abstract boolean al(View paramView);
    
    public abstract ap b(View paramView, ap paramap);
    
    public abstract void b(View paramView, float paramFloat);
    
    public abstract void b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
    
    public abstract void b(View paramView, t paramt);
    
    public abstract void b(View paramView, boolean paramBoolean);
    
    public abstract void c(View paramView, float paramFloat);
    
    public abstract void c(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
    
    public abstract void c(ViewGroup paramViewGroup);
    
    public abstract int combineMeasuredStates(int paramInt1, int paramInt2);
    
    public abstract void d(View paramView, float paramFloat);
    
    public abstract void e(View paramView, float paramFloat);
    
    public abstract void f(View paramView, float paramFloat);
    
    public abstract void g(View paramView, float paramFloat);
    
    public abstract boolean g(View paramView, int paramInt);
    
    public abstract boolean h(View paramView, int paramInt);
    
    public abstract void i(View paramView, int paramInt);
    
    public abstract void j(View paramView, int paramInt);
    
    public abstract void k(View paramView, int paramInt);
    
    public abstract void l(View paramView, int paramInt);
    
    public abstract int resolveSizeAndState(int paramInt1, int paramInt2, int paramInt3);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/view/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */