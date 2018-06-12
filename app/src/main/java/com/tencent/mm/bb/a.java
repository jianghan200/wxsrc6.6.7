package com.tencent.mm.bb;

import android.content.Context;
import com.tencent.mm.R.l;

public final class a
{
  public static float bD(long paramLong)
  {
    float f1 = 1.0F;
    float f2 = (float)paramLong / 1000.0F;
    if (f2 < 1.0F) {}
    for (;;)
    {
      return Math.round(f1 * 10.0F) / 10.0F;
      f1 = f2;
    }
  }
  
  public static CharSequence v(Context paramContext, int paramInt)
  {
    if (paramInt <= 0) {
      return paramContext.getString(R.l.favorite_second_format, new Object[] { Integer.valueOf(0), Integer.valueOf(0) });
    }
    int i = paramInt / 60;
    return paramContext.getString(R.l.favorite_second_format, new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt % 60) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/bb/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */