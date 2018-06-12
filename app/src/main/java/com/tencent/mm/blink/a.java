package com.tencent.mm.blink;

import com.tencent.mm.kernel.j;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;

public final class a
{
  public static final int[] cVN = { 0, 1, 2 };
  public static final int[] cVO = { 3, 13, 23 };
  public static final int[] cVP = { 4, 14, 24 };
  public static final int[] cVQ = { 5, 15, 25 };
  public static final int[] cVR = { 6, 16, 26 };
  public static final int[] cVS = { 7, 17, 27 };
  public static final int[] cVT = { 8, 18, 28 };
  public static final int[] cVU = { 9, 19, 29 };
  public static final int[] cVV = { 63, 69, 75 };
  public static final int[] cVW = { 64, 70, 76 };
  public static final int[] cVX = { 65, 71, 77 };
  public static final int[] cVY = { 66, 72, 78 };
  private static final ArrayList<long[]> cVZ = new ArrayList();
  private static long cWa = 0L;
  private static boolean cWb = false;
  private static long cWc = 0L;
  private static long cWd = 0L;
  private static byte cWe = 0;
  
  private static void a(int[] paramArrayOfInt, long paramLong)
  {
    x.i("MicroMsg.BlinkStartup", "%s %s", new Object[] { Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(paramLong) });
    i(paramArrayOfInt[0], paramLong);
    if (com.tencent.mm.f.a.lY)
    {
      i(paramArrayOfInt[1], paramLong);
      return;
    }
    i(paramArrayOfInt[2], paramLong);
  }
  
  public static void aB(long paramLong)
  {
    j.aB(paramLong);
  }
  
  public static void aC(long paramLong)
  {
    if (System.currentTimeMillis() - paramLong > 200L)
    {
      fl(512);
      cWb = false;
    }
  }
  
  public static void aD(long paramLong)
  {
    cWc = paramLong;
    cWd = paramLong;
  }
  
  private static void aE(long paramLong)
  {
    if (paramLong > 10000L) {
      xe();
    }
  }
  
  public static void cR(String paramString)
  {
    if ((fl(512)) && (ad.chW().equals(paramString)))
    {
      cWb = true;
      x.i("MicroMsg.BlinkStartup", "report this time");
    }
  }
  
  public static void ey(String paramString)
  {
    j.ey(paramString);
  }
  
  private static boolean fl(int paramInt)
  {
    if ((cWe & paramInt) == 0)
    {
      cWe = (byte)(cWe | paramInt);
      x.i("MicroMsg.BlinkStartup", "checkAndMark bit 0x%x", new Object[] { Integer.valueOf(paramInt) });
      return true;
    }
    return false;
  }
  
  public static void fm(int paramInt)
  {
    if (cWd == 0L) {
      x.e("MicroMsg.BlinkStartup", "sLastPhaseTimestamp is 0");
    }
    long l;
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                return;
                l = System.currentTimeMillis() - cWd;
                switch (paramInt)
                {
                default: 
                  return;
                }
              } while (!fl(1));
              a(cVO, l);
              cWd = System.currentTimeMillis();
              return;
            } while (!fl(2));
            a(cVP, l);
            cWd = System.currentTimeMillis();
            return;
          } while (!fl(4));
          a(cVQ, l);
          cWd = System.currentTimeMillis();
          return;
        } while (!fl(8));
        a(cVR, l);
        cWd = System.currentTimeMillis();
        return;
      } while (!fl(16));
      aE(l);
      a(cVS, l);
      cWd = System.currentTimeMillis();
      return;
    } while (!fl(32));
    aE(l);
    a(cVT, l);
    cWd = System.currentTimeMillis();
  }
  
  public static void i(long paramLong1, long paramLong2)
  {
    cVZ.add(new long[] { 709L, paramLong1, paramLong2 });
  }
  
  public static void i(String paramString, long paramLong)
  {
    j.i(paramString, paramLong);
  }
  
  public static void j(long paramLong1, long paramLong2)
  {
    cVZ.add(new long[] { 783L, paramLong1, paramLong2 });
  }
  
  public static void vh()
  {
    fl(512);
  }
  
  public static void xc()
  {
    cWa = System.currentTimeMillis();
  }
  
  public static void xd()
  {
    if (fl(1024))
    {
      j(1L, System.currentTimeMillis() - cWa);
      j(2L, 1L);
    }
  }
  
  public static void xe()
  {
    fl(512);
    cWb = false;
  }
  
  public static boolean xf()
  {
    if (!cWb) {
      return false;
    }
    return fl(256);
  }
  
  public static void xg()
  {
    long l = System.currentTimeMillis() - cWc;
    a(cVU, l);
    if (l <= 3000L) {
      a(cVV, 1L);
    }
    for (;;)
    {
      a(cVN, 1L);
      return;
      if ((l > 3000L) && (l <= 6000L)) {
        a(cVW, 1L);
      } else if ((l > 6000L) && (l <= 10000L)) {
        a(cVX, 1L);
      } else {
        a(cVY, 1L);
      }
    }
  }
  
  public static ArrayList<long[]> xh()
  {
    return cVZ;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/blink/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */