package com.google.android.gms.c;

public final class bh
{
  public static final int[] bal = new int[0];
  public static final long[] bam = new long[0];
  public static final float[] ban = new float[0];
  public static final double[] bao = new double[0];
  public static final boolean[] bap = new boolean[0];
  public static final String[] baq = new String[0];
  public static final byte[][] bar = new byte[0][];
  public static final byte[] bas = new byte[0];
  
  static int aC(int paramInt1, int paramInt2)
  {
    return paramInt1 << 3 | paramInt2;
  }
  
  public static final int b(aw paramaw, int paramInt)
  {
    int i = 1;
    int j = paramaw.getPosition();
    paramaw.dA(paramInt);
    while (paramaw.qw() == paramInt)
    {
      paramaw.dA(paramInt);
      i += 1;
    }
    paramaw.dD(j);
    return i;
  }
  
  static int dO(int paramInt)
  {
    return paramInt & 0x7;
  }
  
  public static int dP(int paramInt)
  {
    return paramInt >>> 3;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/c/bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */