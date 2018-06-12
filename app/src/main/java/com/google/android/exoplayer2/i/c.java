package com.google.android.exoplayer2.i;

import android.util.Pair;

public final class c
{
  private static final byte[] aBV = { 0, 0, 0, 1 };
  private static final int[] aBW = { 96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350 };
  private static final int[] aBX = { 0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1 };
  
  private static int c(i parami)
  {
    int j = parami.cY(5);
    int i = j;
    if (j == 31) {
      i = parami.cY(6) + 32;
    }
    return i;
  }
  
  private static int d(i parami)
  {
    int i = parami.cY(4);
    if (i == 15) {
      return parami.cY(24);
    }
    if (i < 13) {}
    for (boolean bool = true;; bool = false)
    {
      a.ao(bool);
      return aBW[i];
    }
  }
  
  public static Pair<Integer, Integer> i(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = new i(paramArrayOfByte);
    int m = c(paramArrayOfByte);
    int i = d(paramArrayOfByte);
    int k = paramArrayOfByte.cY(4);
    if (m != 5)
    {
      j = k;
      if (m != 29) {}
    }
    else
    {
      m = d(paramArrayOfByte);
      j = k;
      i = m;
      if (c(paramArrayOfByte) == 22)
      {
        j = paramArrayOfByte.cY(4);
        i = m;
      }
    }
    int j = aBX[j];
    if (j != -1) {}
    for (boolean bool = true;; bool = false)
    {
      a.ao(bool);
      return Pair.create(Integer.valueOf(i), Integer.valueOf(j));
    }
  }
  
  public static byte[] i(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[aBV.length + paramInt2];
    System.arraycopy(aBV, 0, arrayOfByte, 0, aBV.length);
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, aBV.length, paramInt2);
    return arrayOfByte;
  }
  
  public static byte[] t(int paramInt1, int paramInt2, int paramInt3)
  {
    return new byte[] { (byte)(paramInt1 << 3 & 0xF8 | paramInt2 >> 1 & 0x7), (byte)(paramInt2 << 7 & 0x80 | paramInt3 << 3 & 0x78) };
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/exoplayer2/i/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */