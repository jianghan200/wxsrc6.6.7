package android.support.v4.view.b;

import android.view.animation.Interpolator;

abstract class d
  implements Interpolator
{
  private final float[] ya;
  private final float yb;
  
  public d(float[] paramArrayOfFloat)
  {
    this.ya = paramArrayOfFloat;
    this.yb = (1.0F / (this.ya.length - 1));
  }
  
  public float getInterpolation(float paramFloat)
  {
    if (paramFloat >= 1.0F) {
      return 1.0F;
    }
    if (paramFloat <= 0.0F) {
      return 0.0F;
    }
    int i = Math.min((int)((this.ya.length - 1) * paramFloat), this.ya.length - 2);
    paramFloat = (paramFloat - i * this.yb) / this.yb;
    float f = this.ya[i];
    return (this.ya[(i + 1)] - this.ya[i]) * paramFloat + f;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/android/support/v4/view/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */