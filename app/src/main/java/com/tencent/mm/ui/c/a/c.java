package com.tencent.mm.ui.c.a;

import android.view.animation.DecelerateInterpolator;

public final class c
  extends DecelerateInterpolator
{
  public final float getInterpolation(float paramFloat)
  {
    if (paramFloat <= 0.5D) {
      return super.getInterpolation(2.0F * paramFloat);
    }
    return 1.0F;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/c/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */