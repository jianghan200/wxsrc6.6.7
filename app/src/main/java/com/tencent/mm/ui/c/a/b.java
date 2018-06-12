package com.tencent.mm.ui.c.a;

import android.view.animation.CycleInterpolator;

public final class b
  extends CycleInterpolator
{
  public b()
  {
    super(0.5F);
  }
  
  public final float getInterpolation(float paramFloat)
  {
    return (float)(1.0D - Math.pow(2.0F * paramFloat - 1.0F, 2.0D));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/c/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */