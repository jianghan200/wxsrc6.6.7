package com.tencent.mm.plugin.bottle.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import com.tencent.mm.R.g;

public class MoonImageView
  extends ImageView
{
  ImageView hkz;
  private final int[] hlM = { 0, R.g.bottle_moon_1, R.g.bottle_moon_2, R.g.bottle_moon_3, R.g.bottle_moon_4, R.g.bottle_moon_5, R.g.bottle_moon_6, R.g.bottle_moon_7 };
  private final double[] hlN = { 0.0D, 20.0D, 35.0D, 50.0D, 60.0D, 50.0D, 35.0D, 20.0D };
  
  public MoonImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public MoonImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private int getDayIdx()
  {
    int i = 2;
    f localf = new f();
    if (localf.day <= 2) {
      i = 0;
    }
    do
    {
      return i;
      if (localf.day <= 6) {
        return 1;
      }
    } while (localf.day <= 10);
    if (localf.day <= 14) {
      return 3;
    }
    if (localf.day <= 17) {
      return 4;
    }
    if (localf.day <= 21) {
      return 5;
    }
    if (localf.day <= 26) {
      return 6;
    }
    return 7;
  }
  
  public void setVisibility(int paramInt)
  {
    int j = 170;
    int k = getDayIdx();
    setBackgroundResource(this.hlM[k]);
    Object localObject = this.hkz;
    int i = j;
    switch (k)
    {
    default: 
      i = j;
    }
    for (;;)
    {
      ((ImageView)localObject).setAlpha(i);
      if (k > 0)
      {
        i = getContext().getResources().getDisplayMetrics().heightPixels / 8;
        double d = this.hlN[k] * 3.141592653589793D / 180.0D;
        j = (int)((1.0D - Math.cos(d)) * i);
        k = (int)((1.0D - Math.sin(d)) * i);
        localObject = (ViewGroup.MarginLayoutParams)getLayoutParams();
        ((ViewGroup.MarginLayoutParams)localObject).setMargins(j + i, k + i, ((ViewGroup.MarginLayoutParams)localObject).rightMargin, ((ViewGroup.MarginLayoutParams)localObject).bottomMargin);
        setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      this.hkz.setVisibility(paramInt);
      super.setVisibility(paramInt);
      return;
      i = 255;
      continue;
      i = 127;
      continue;
      i = 85;
      continue;
      i = 0;
      continue;
      i = 85;
      continue;
      i = 127;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/bottle/ui/MoonImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */