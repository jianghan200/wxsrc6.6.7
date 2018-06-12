package android.support.v4.view.b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

final class f
  implements Interpolator
{
  private final float[] yc;
  private final float[] yd;
  
  public f(Path paramPath)
  {
    paramPath = new PathMeasure(paramPath, false);
    float f = paramPath.getLength();
    int j = (int)(f / 0.002F) + 1;
    this.yc = new float[j];
    this.yd = new float[j];
    float[] arrayOfFloat = new float[2];
    int i = 0;
    while (i < j)
    {
      paramPath.getPosTan(i * f / (j - 1), arrayOfFloat, null);
      this.yc[i] = arrayOfFloat[0];
      this.yd[i] = arrayOfFloat[1];
      i += 1;
    }
  }
  
  public final float getInterpolation(float paramFloat)
  {
    if (paramFloat <= 0.0F) {
      return 0.0F;
    }
    if (paramFloat >= 1.0F) {
      return 1.0F;
    }
    int j = this.yc.length - 1;
    int i = 0;
    while (j - i > 1)
    {
      int k = (i + j) / 2;
      if (paramFloat < this.yc[k]) {
        j = k;
      } else {
        i = k;
      }
    }
    float f = this.yc[j] - this.yc[i];
    if (f == 0.0F) {
      return this.yd[i];
    }
    paramFloat = (paramFloat - this.yc[i]) / f;
    f = this.yd[i];
    return paramFloat * (this.yd[j] - f) + f;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/android/support/v4/view/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */