package android.support.v7.view;

import android.support.v4.view.ai;
import android.support.v4.view.ai.g;
import android.support.v4.view.am;
import android.support.v4.view.an;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public final class h
{
  am Hf;
  boolean Hg;
  private final an Hh = new an()
  {
    private boolean Hi = false;
    private int Hj = 0;
    
    public final void p(View paramAnonymousView)
    {
      if (this.Hi) {}
      do
      {
        return;
        this.Hi = true;
      } while (h.this.Hf == null);
      h.this.Hf.p(null);
    }
    
    public final void q(View paramAnonymousView)
    {
      int i = this.Hj + 1;
      this.Hj = i;
      if (i == h.this.jC.size())
      {
        if (h.this.Hf != null) {
          h.this.Hf.q(null);
        }
        this.Hj = 0;
        this.Hi = false;
        h.this.Hg = false;
      }
    }
  };
  final ArrayList<ai> jC = new ArrayList();
  private long mDuration = -1L;
  private Interpolator mInterpolator;
  
  public final h a(ai paramai1, ai paramai2)
  {
    this.jC.add(paramai1);
    paramai1 = (View)paramai1.xd.get();
    if (paramai1 != null) {}
    for (long l = ai.xh.aq(paramai1);; l = 0L)
    {
      paramai2.i(l);
      this.jC.add(paramai2);
      return this;
    }
  }
  
  public final h b(am paramam)
  {
    if (!this.Hg) {
      this.Hf = paramam;
    }
    return this;
  }
  
  public final void cancel()
  {
    if (!this.Hg) {
      return;
    }
    Iterator localIterator = this.jC.iterator();
    while (localIterator.hasNext()) {
      ((ai)localIterator.next()).cancel();
    }
    this.Hg = false;
  }
  
  public final h d(Interpolator paramInterpolator)
  {
    if (!this.Hg) {
      this.mInterpolator = paramInterpolator;
    }
    return this;
  }
  
  public final h dx()
  {
    if (!this.Hg) {
      this.mDuration = 250L;
    }
    return this;
  }
  
  public final h g(ai paramai)
  {
    if (!this.Hg) {
      this.jC.add(paramai);
    }
    return this;
  }
  
  public final void start()
  {
    if (this.Hg) {
      return;
    }
    Iterator localIterator = this.jC.iterator();
    while (localIterator.hasNext())
    {
      ai localai = (ai)localIterator.next();
      if (this.mDuration >= 0L) {
        localai.h(this.mDuration);
      }
      if (this.mInterpolator != null) {
        localai.c(this.mInterpolator);
      }
      if (this.Hf != null) {
        localai.a(this.Hh);
      }
      localai.start();
    }
    this.Hg = true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v7/view/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */