package com.google.a.a;

public final class g
{
  public static final String[] EMPTY_STRING_ARRAY = new String[0];
  public static final int[] bfQ = new int[0];
  public static final long[] bfR = new long[0];
  public static final float[] bfS = new float[0];
  public static final double[] bfT = new double[0];
  public static final boolean[] bfU = new boolean[0];
  public static final byte[][] bfV = new byte[0][];
  public static final byte[] bfW = new byte[0];
  
  public static boolean a(a parama, int paramInt)
  {
    return parama.dU(paramInt);
  }
  
  static int aJ(int paramInt1, int paramInt2)
  {
    return paramInt1 << 3 | paramInt2;
  }
  
  public static final int b(a parama, int paramInt)
  {
    int i = 1;
    int j = parama.getPosition();
    parama.dU(paramInt);
    while (parama.rX() == paramInt)
    {
      parama.dU(paramInt);
      i += 1;
    }
    parama.dX(j);
    return i;
  }
  
  static int ef(int paramInt)
  {
    return paramInt & 0x7;
  }
  
  public static int eg(int paramInt)
  {
    return paramInt >>> 3;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/google/a/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */