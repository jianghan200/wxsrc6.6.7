package com.google.android.exoplayer2.c;

public final class a
  implements j
{
  private final long aet;
  public final long[] aiA;
  public final int[] aiy;
  public final long[] aiz;
  public final int length;
  public final long[] offsets;
  
  public a(int[] paramArrayOfInt, long[] paramArrayOfLong1, long[] paramArrayOfLong2, long[] paramArrayOfLong3)
  {
    this.aiy = paramArrayOfInt;
    this.offsets = paramArrayOfLong1;
    this.aiz = paramArrayOfLong2;
    this.aiA = paramArrayOfLong3;
    this.length = paramArrayOfInt.length;
    if (this.length > 0)
    {
      this.aet = (paramArrayOfLong2[(this.length - 1)] + paramArrayOfLong3[(this.length - 1)]);
      return;
    }
    this.aet = 0L;
  }
  
  public final boolean jR()
  {
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/exoplayer2/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */