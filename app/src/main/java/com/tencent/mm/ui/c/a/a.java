package com.tencent.mm.ui.c.a;

import android.view.animation.BounceInterpolator;

public final class a
  extends BounceInterpolator
{
  public final float getInterpolation(float paramFloat)
  {
    if (paramFloat < 0.36363636363636365D) {
      return (float)(paramFloat * 7.5625D * paramFloat);
    }
    if (paramFloat < 0.7272727272727273D)
    {
      paramFloat = (float)(paramFloat - 0.5454545454545454D);
      d = paramFloat;
      return (float)(paramFloat * (d * 7.5625D) + 0.75D);
    }
    paramFloat = (float)(paramFloat - 0.8181818181818182D);
    double d = paramFloat;
    return (float)(paramFloat * (d * 7.5625D) + 0.9375D);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/c/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */