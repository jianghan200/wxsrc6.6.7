package com.tencent.mm.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;

public final class an
{
  public static boolean Ec(int paramInt)
  {
    return 1.0D - (0.299D * Color.red(paramInt) + 0.587D * Color.green(paramInt) + 0.114D * Color.blue(paramInt)) / 255.0D >= 0.3D;
  }
  
  public static Drawable ao(Context paramContext, int paramInt)
  {
    paramContext = paramContext.getResources().getDrawable(paramInt);
    paramContext.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
    return paramContext;
  }
  
  private static int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt5 == 0) {
      return 0;
    }
    return (paramInt1 * 255 * paramInt2 + paramInt3 * paramInt4 * (255 - paramInt2)) / (paramInt5 * 255);
  }
  
  public static int eN(int paramInt1, int paramInt2)
  {
    if ((paramInt2 < 0) || (paramInt2 > 100))
    {
      ao.v("alpha must be between 0 and 100", new Object[0]);
      return paramInt1;
    }
    return 0xFFFFFF & paramInt1 | (int)(paramInt2 * 0.01D * 255.0D) << 24;
  }
  
  public static int n(int paramInt1, int paramInt2)
  {
    int i = Color.alpha(paramInt2);
    int j = Color.alpha(paramInt1);
    int k = 255 - (255 - i) * (255 - j) / 255;
    return Color.argb(k, b(Color.red(paramInt1), j, Color.red(paramInt2), i, k), b(Color.green(paramInt1), j, Color.green(paramInt2), i, k), b(Color.blue(paramInt1), j, Color.blue(paramInt2), i, k));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */