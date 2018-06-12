package android.support.design.widget;

import android.animation.ValueAnimator;
import android.view.animation.Interpolator;

final class w
  extends u.e
{
  final ValueAnimator iY = new ValueAnimator();
  
  public final void a(u.e.a parama)
  {
    this.iY.addListener(new w.2(this, parama));
  }
  
  public final void a(u.e.b paramb)
  {
    this.iY.addUpdateListener(new w.1(this, paramb));
  }
  
  public final int aQ()
  {
    return ((Integer)this.iY.getAnimatedValue()).intValue();
  }
  
  public final float aR()
  {
    return ((Float)this.iY.getAnimatedValue()).floatValue();
  }
  
  public final void cancel()
  {
    this.iY.cancel();
  }
  
  public final float getAnimatedFraction()
  {
    return this.iY.getAnimatedFraction();
  }
  
  public final long getDuration()
  {
    return this.iY.getDuration();
  }
  
  public final void i(int paramInt1, int paramInt2)
  {
    this.iY.setIntValues(new int[] { paramInt1, paramInt2 });
  }
  
  public final boolean isRunning()
  {
    return this.iY.isRunning();
  }
  
  public final void p(float paramFloat1, float paramFloat2)
  {
    this.iY.setFloatValues(new float[] { paramFloat1, paramFloat2 });
  }
  
  public final void setDuration(int paramInt)
  {
    this.iY.setDuration(paramInt);
  }
  
  public final void setInterpolator(Interpolator paramInterpolator)
  {
    this.iY.setInterpolator(paramInterpolator);
  }
  
  public final void start()
  {
    this.iY.start();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/android/support/design/widget/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */