package com.tencent.mm.plugin.walletlock.gesture.a;

import java.lang.reflect.Array;

public final class f
{
  private static f[][] pGY = (f[][])Array.newInstance(f.class, new int[] { 3, 3 });
  public int pGW = 0;
  public int pGX = 0;
  
  static
  {
    int i = 0;
    while (i < 3)
    {
      int j = 0;
      while (j < 3)
      {
        pGY[i][j] = new f(i, j);
        j += 1;
      }
      i += 1;
    }
  }
  
  private f(int paramInt1, int paramInt2)
  {
    this.pGW = paramInt1;
    this.pGX = paramInt2;
  }
  
  public static f eb(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt1 > 2)) {
      try
      {
        throw new IllegalArgumentException("row id should be in range [0..2]");
      }
      finally {}
    }
    if ((paramInt2 < 0) || (paramInt2 > 2)) {
      throw new IllegalArgumentException("col id should be in range [0..2]");
    }
    f localf = pGY[paramInt1][paramInt2];
    return localf;
  }
  
  public final String toString()
  {
    return String.format("{row: %d, col: %d}", new Object[] { Integer.valueOf(this.pGW), Integer.valueOf(this.pGX) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/walletlock/gesture/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */