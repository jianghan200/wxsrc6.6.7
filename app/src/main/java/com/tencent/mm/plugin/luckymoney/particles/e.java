package com.tencent.mm.plugin.luckymoney.particles;

import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.view.animation.Interpolator;

public final class e
{
  private static final Paint kSJ;
  private static Interpolator kSK;
  
  static
  {
    Paint localPaint = new Paint();
    kSJ = localPaint;
    localPaint.setStyle(Paint.Style.FILL);
  }
  
  public static Interpolator bbf()
  {
    if (kSK == null) {
      kSK = new e.1();
    }
    return kSK;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/particles/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */