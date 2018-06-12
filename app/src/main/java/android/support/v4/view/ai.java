package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class ai
{
  public static final g xh = new a();
  public WeakReference<View> xd;
  private Runnable xe = null;
  private Runnable xf = null;
  private int xg = -1;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      xh = new f();
      return;
    }
    if (i >= 19)
    {
      xh = new e();
      return;
    }
    if (i >= 18)
    {
      xh = new c();
      return;
    }
    if (i >= 16)
    {
      xh = new d();
      return;
    }
    if (i >= 14)
    {
      xh = new b();
      return;
    }
  }
  
  ai(View paramView)
  {
    this.xd = new WeakReference(paramView);
  }
  
  public final ai a(am paramam)
  {
    View localView = (View)this.xd.get();
    if (localView != null) {
      xh.a(this, localView, paramam);
    }
    return this;
  }
  
  public final ai a(ao paramao)
  {
    View localView = (View)this.xd.get();
    if (localView != null) {
      xh.a(localView, paramao);
    }
    return this;
  }
  
  public final ai c(Interpolator paramInterpolator)
  {
    View localView = (View)this.xd.get();
    if (localView != null) {
      xh.a(localView, paramInterpolator);
    }
    return this;
  }
  
  public final void cancel()
  {
    View localView = (View)this.xd.get();
    if (localView != null) {
      xh.a(this, localView);
    }
  }
  
  public final ai h(long paramLong)
  {
    View localView = (View)this.xd.get();
    if (localView != null) {
      xh.a(localView, paramLong);
    }
    return this;
  }
  
  public final ai i(long paramLong)
  {
    View localView = (View)this.xd.get();
    if (localView != null) {
      xh.b(localView, paramLong);
    }
    return this;
  }
  
  public final void start()
  {
    View localView = (View)this.xd.get();
    if (localView != null) {
      xh.b(this, localView);
    }
  }
  
  public final ai t(float paramFloat)
  {
    View localView = (View)this.xd.get();
    if (localView != null) {
      xh.a(this, localView, paramFloat);
    }
    return this;
  }
  
  public final ai u(float paramFloat)
  {
    View localView = (View)this.xd.get();
    if (localView != null) {
      xh.b(this, localView, paramFloat);
    }
    return this;
  }
  
  public final ai v(float paramFloat)
  {
    View localView = (View)this.xd.get();
    if (localView != null) {
      xh.c(this, localView, paramFloat);
    }
    return this;
  }
  
  public final ai w(float paramFloat)
  {
    View localView = (View)this.xd.get();
    if (localView != null) {
      xh.d(this, localView, paramFloat);
    }
    return this;
  }
  
  public final ai x(float paramFloat)
  {
    View localView = (View)this.xd.get();
    if (localView != null) {
      xh.e(this, localView, paramFloat);
    }
    return this;
  }
  
  static class a
    implements ai.g
  {
    WeakHashMap<View, Runnable> xi = null;
    
    private void d(ai paramai, View paramView)
    {
      Runnable localRunnable = null;
      if (this.xi != null) {
        localRunnable = (Runnable)this.xi.get(paramView);
      }
      Object localObject = localRunnable;
      if (localRunnable == null)
      {
        localObject = new a(paramai, paramView, (byte)0);
        if (this.xi == null) {
          this.xi = new WeakHashMap();
        }
        this.xi.put(paramView, localObject);
      }
      paramView.removeCallbacks((Runnable)localObject);
      paramView.post((Runnable)localObject);
    }
    
    public void a(ai paramai, View paramView)
    {
      d(paramai, paramView);
    }
    
    public void a(ai paramai, View paramView, float paramFloat)
    {
      d(paramai, paramView);
    }
    
    public void a(ai paramai, View paramView, am paramam)
    {
      paramView.setTag(2113929216, paramam);
    }
    
    public void a(View paramView, long paramLong) {}
    
    public void a(View paramView, ao paramao) {}
    
    public void a(View paramView, Interpolator paramInterpolator) {}
    
    public long aq(View paramView)
    {
      return 0L;
    }
    
    public void b(ai paramai, View paramView)
    {
      if (this.xi != null)
      {
        Runnable localRunnable = (Runnable)this.xi.get(paramView);
        if (localRunnable != null) {
          paramView.removeCallbacks(localRunnable);
        }
      }
      c(paramai, paramView);
    }
    
    public void b(ai paramai, View paramView, float paramFloat)
    {
      d(paramai, paramView);
    }
    
    public void b(View paramView, long paramLong) {}
    
    final void c(ai paramai, View paramView)
    {
      Object localObject = paramView.getTag(2113929216);
      if ((localObject instanceof am)) {}
      for (localObject = (am)localObject;; localObject = null)
      {
        Runnable localRunnable1 = ai.c(paramai);
        Runnable localRunnable2 = ai.d(paramai);
        ai.b(paramai);
        ai.a(paramai);
        if (localRunnable1 != null) {
          localRunnable1.run();
        }
        if (localObject != null)
        {
          ((am)localObject).p(paramView);
          ((am)localObject).q(paramView);
        }
        if (localRunnable2 != null) {
          localRunnable2.run();
        }
        if (this.xi != null) {
          this.xi.remove(paramView);
        }
        return;
      }
    }
    
    public void c(ai paramai, View paramView, float paramFloat)
    {
      d(paramai, paramView);
    }
    
    public void d(ai paramai, View paramView, float paramFloat)
    {
      d(paramai, paramView);
    }
    
    public void e(ai paramai, View paramView, float paramFloat)
    {
      d(paramai, paramView);
    }
    
    final class a
      implements Runnable
    {
      WeakReference<View> cB;
      ai xj;
      
      private a(ai paramai, View paramView)
      {
        this.cB = new WeakReference(paramView);
        this.xj = paramai;
      }
      
      public final void run()
      {
        View localView = (View)this.cB.get();
        if (localView != null) {
          ai.a.this.c(this.xj, localView);
        }
      }
    }
  }
  
  static class b
    extends ai.a
  {
    WeakHashMap<View, Integer> xl = null;
    
    public final void a(ai paramai, View paramView)
    {
      paramView.animate().cancel();
    }
    
    public final void a(ai paramai, View paramView, float paramFloat)
    {
      paramView.animate().alpha(paramFloat);
    }
    
    public void a(ai paramai, View paramView, am paramam)
    {
      paramView.setTag(2113929216, paramam);
      paramai = new a(paramai);
      paramView.animate().setListener(new aj.1(paramai, paramView));
    }
    
    public final void a(View paramView, long paramLong)
    {
      paramView.animate().setDuration(paramLong);
    }
    
    public final void a(View paramView, Interpolator paramInterpolator)
    {
      paramView.animate().setInterpolator(paramInterpolator);
    }
    
    public final long aq(View paramView)
    {
      return paramView.animate().getDuration();
    }
    
    public final void b(ai paramai, View paramView)
    {
      paramView.animate().start();
    }
    
    public final void b(ai paramai, View paramView, float paramFloat)
    {
      paramView.animate().translationX(paramFloat);
    }
    
    public final void b(View paramView, long paramLong)
    {
      paramView.animate().setStartDelay(paramLong);
    }
    
    public final void c(ai paramai, View paramView, float paramFloat)
    {
      paramView.animate().translationY(paramFloat);
    }
    
    public final void d(ai paramai, View paramView, float paramFloat)
    {
      paramView.animate().scaleX(paramFloat);
    }
    
    public final void e(ai paramai, View paramView, float paramFloat)
    {
      paramView.animate().scaleY(paramFloat);
    }
    
    static final class a
      implements am
    {
      ai xj;
      boolean xm;
      
      a(ai paramai)
      {
        this.xj = paramai;
      }
      
      public final void ar(View paramView)
      {
        Object localObject = paramView.getTag(2113929216);
        if ((localObject instanceof am)) {}
        for (localObject = (am)localObject;; localObject = null)
        {
          if (localObject != null) {
            ((am)localObject).ar(paramView);
          }
          return;
        }
      }
      
      public final void p(View paramView)
      {
        this.xm = false;
        if (ai.f(this.xj) >= 0) {
          z.a(paramView, 2, null);
        }
        if (ai.c(this.xj) != null)
        {
          localObject = ai.c(this.xj);
          ai.b(this.xj);
          ((Runnable)localObject).run();
        }
        Object localObject = paramView.getTag(2113929216);
        if ((localObject instanceof am)) {}
        for (localObject = (am)localObject;; localObject = null)
        {
          if (localObject != null) {
            ((am)localObject).p(paramView);
          }
          return;
        }
      }
      
      public final void q(View paramView)
      {
        if (ai.f(this.xj) >= 0)
        {
          z.a(paramView, ai.f(this.xj), null);
          ai.e(this.xj);
        }
        if ((Build.VERSION.SDK_INT >= 16) || (!this.xm))
        {
          if (ai.d(this.xj) != null)
          {
            localObject = ai.d(this.xj);
            ai.a(this.xj);
            ((Runnable)localObject).run();
          }
          localObject = paramView.getTag(2113929216);
          if (!(localObject instanceof am)) {
            break label113;
          }
        }
        label113:
        for (Object localObject = (am)localObject;; localObject = null)
        {
          if (localObject != null) {
            ((am)localObject).q(paramView);
          }
          this.xm = true;
          return;
        }
      }
    }
  }
  
  static class c
    extends ai.d
  {}
  
  static class d
    extends ai.b
  {
    public final void a(ai paramai, View paramView, am paramam)
    {
      if (paramam != null)
      {
        paramView.animate().setListener(new ak.1(paramam, paramView));
        return;
      }
      paramView.animate().setListener(null);
    }
  }
  
  static class e
    extends ai.c
  {
    public final void a(View paramView, ao paramao)
    {
      al.1 local1 = null;
      if (paramao != null) {
        local1 = new al.1(paramao, paramView);
      }
      paramView.animate().setUpdateListener(local1);
    }
  }
  
  static final class f
    extends ai.e
  {}
  
  public static abstract interface g
  {
    public abstract void a(ai paramai, View paramView);
    
    public abstract void a(ai paramai, View paramView, float paramFloat);
    
    public abstract void a(ai paramai, View paramView, am paramam);
    
    public abstract void a(View paramView, long paramLong);
    
    public abstract void a(View paramView, ao paramao);
    
    public abstract void a(View paramView, Interpolator paramInterpolator);
    
    public abstract long aq(View paramView);
    
    public abstract void b(ai paramai, View paramView);
    
    public abstract void b(ai paramai, View paramView, float paramFloat);
    
    public abstract void b(View paramView, long paramLong);
    
    public abstract void c(ai paramai, View paramView, float paramFloat);
    
    public abstract void d(ai paramai, View paramView, float paramFloat);
    
    public abstract void e(ai paramai, View paramView, float paramFloat);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/view/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */