package com.google.android.exoplayer2.f.a;

import com.google.android.exoplayer2.c.k;
import com.google.android.exoplayer2.i.j;

public final class g
{
  public static void a(long paramLong, j paramj, k[] paramArrayOfk)
  {
    while (paramj.me() > 1)
    {
      int i = e(paramj);
      int j = e(paramj);
      if ((j == -1) || (j > paramj.me()))
      {
        paramj.setPosition(paramj.limit);
      }
      else
      {
        if ((i != 4) || (j < 8)) {
          i = 0;
        }
        for (;;)
        {
          if (i != 0)
          {
            paramj.da(8);
            int k = paramj.readUnsignedByte() & 0x1F;
            paramj.da(1);
            int m = k * 3;
            int n = paramj.position;
            int i1 = paramArrayOfk.length;
            i = 0;
            for (;;)
            {
              if (i < i1)
              {
                k localk = paramArrayOfk[i];
                paramj.setPosition(n);
                localk.a(paramj, m);
                localk.a(paramLong, 1, m, 0, null);
                i += 1;
                continue;
                i = paramj.position;
                k = paramj.readUnsignedByte();
                m = paramj.readUnsignedShort();
                n = paramj.readInt();
                i1 = paramj.readUnsignedByte();
                paramj.setPosition(i);
                if ((k == 181) && (m == 49) && (n == 1195456820) && (i1 == 3))
                {
                  i = 1;
                  break;
                }
                i = 0;
                break;
              }
            }
            paramj.da(j - (k * 3 + 10));
            break;
          }
        }
        paramj.da(j);
      }
    }
  }
  
  private static int e(j paramj)
  {
    int i = 0;
    int k;
    int j;
    do
    {
      if (paramj.me() == 0) {
        return -1;
      }
      k = paramj.readUnsignedByte();
      j = i + k;
      i = j;
    } while (k == 255);
    return j;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/google/android/exoplayer2/f/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */