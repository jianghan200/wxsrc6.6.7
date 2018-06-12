package android.support.design.widget;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

final class v
  extends u.e
{
  private static final Handler gA = new Handler(Looper.getMainLooper());
  private final int[] iS = new int[2];
  private final float[] iT = new float[2];
  private u.e.a iU;
  private u.e.b iV;
  private float iW;
  private int mDuration = 200;
  private Interpolator mInterpolator;
  private boolean mIsRunning;
  private final Runnable mRunnable = new v.1(this);
  private long mStartTime;
  
  public final void a(u.e.a parama)
  {
    this.iU = parama;
  }
  
  public final void a(u.e.b paramb)
  {
    this.iV = paramb;
  }
  
  public final int aQ()
  {
    return a.a(this.iS[0], this.iS[1], this.iW);
  }
  
  public final float aR()
  {
    return a.b(this.iT[0], this.iT[1], this.iW);
  }
  
  public final void cancel()
  {
    this.mIsRunning = false;
    gA.removeCallbacks(this.mRunnable);
  }
  
  public final float getAnimatedFraction()
  {
    return this.iW;
  }
  
  public final long getDuration()
  {
    return this.mDuration;
  }
  
  public final void i(int paramInt1, int paramInt2)
  {
    this.iS[0] = paramInt1;
    this.iS[1] = paramInt2;
  }
  
  public final boolean isRunning()
  {
    return this.mIsRunning;
  }
  
  public final void p(float paramFloat1, float paramFloat2)
  {
    this.iT[0] = paramFloat1;
    this.iT[1] = paramFloat2;
  }
  
  public final void setDuration(int paramInt)
  {
    this.mDuration = paramInt;
  }
  
  public final void setInterpolator(Interpolator paramInterpolator)
  {
    this.mInterpolator = paramInterpolator;
  }
  
  public final void start()
  {
    if (this.mIsRunning) {
      return;
    }
    if (this.mInterpolator == null) {
      this.mInterpolator = new AccelerateDecelerateInterpolator();
    }
    this.mStartTime = SystemClock.uptimeMillis();
    this.mIsRunning = true;
    gA.postDelayed(this.mRunnable, 10L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/android/support/design/widget/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */