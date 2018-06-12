package com.tencent.tencentmap.mapsdk.a;

import android.view.animation.Interpolator;

public class kj
  extends kk
{
  private float e;
  private float f;
  
  protected void a(float paramFloat, Interpolator paramInterpolator)
  {
    float f1 = this.f;
    float f2 = this.e;
    paramFloat = paramInterpolator.getInterpolation(paramFloat);
    float f3 = this.e;
    if (this.d != null) {
      this.d.a((f1 - f2) * paramFloat + f3);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/kj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */