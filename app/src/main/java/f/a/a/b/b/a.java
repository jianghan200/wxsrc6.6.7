package f.a.a.b.b;

import java.io.UnsupportedEncodingException;

public final class a
{
  private final byte[] buffer;
  private final int limit;
  private int position;
  
  public a(byte[] paramArrayOfByte, int paramInt)
  {
    this.buffer = paramArrayOfByte;
    this.position = 0;
    this.limit = (paramInt + 0);
  }
  
  public static int ec(int paramInt)
  {
    return ee(f.a.a.b.a.aJ(paramInt, 0));
  }
  
  public static int ee(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0) {
      return 1;
    }
    if ((paramInt & 0xC000) == 0) {
      return 2;
    }
    if ((0xFFE00000 & paramInt) == 0) {
      return 3;
    }
    if ((0xF0000000 & paramInt) == 0) {
      return 4;
    }
    return 5;
  }
  
  public static int h(int paramInt, String paramString)
  {
    if (paramString == null) {
      return 0;
    }
    try
    {
      paramString = paramString.getBytes("UTF-8");
      paramInt = ec(paramInt);
      int i = ee(paramString.length);
      int j = paramString.length;
      return j + (paramInt + i);
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new IllegalStateException("UTF-8 not supported.");
    }
  }
  
  public final void aI(int paramInt1, int paramInt2)
  {
    ed(f.a.a.b.a.aJ(paramInt1, paramInt2));
  }
  
  public final void ag(long paramLong)
  {
    for (;;)
    {
      if ((0xFFFFFFFFFFFFFF80 & paramLong) == 0L)
      {
        eb((int)paramLong);
        return;
      }
      eb((int)paramLong & 0x7F | 0x80);
      paramLong >>>= 7;
    }
  }
  
  public final void eb(int paramInt)
  {
    int i = (byte)paramInt;
    byte[] arrayOfByte = this.buffer;
    paramInt = this.position;
    this.position = (paramInt + 1);
    arrayOfByte[paramInt] = i;
  }
  
  public final void ed(int paramInt)
  {
    for (;;)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        eb(paramInt);
        return;
      }
      eb(paramInt & 0x7F | 0x80);
      paramInt >>>= 7;
    }
  }
  
  public final void p(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    int j;
    int i;
    do
    {
      do
      {
        return;
        j = paramArrayOfByte.length;
      } while (paramArrayOfByte == null);
      if (this.limit - this.position >= j)
      {
        System.arraycopy(paramArrayOfByte, 0, this.buffer, this.position, j);
        this.position = (j + this.position);
        return;
      }
      i = this.limit - this.position;
      System.arraycopy(paramArrayOfByte, 0, this.buffer, this.position, i);
      j -= i;
      this.position = this.limit;
    } while (j > this.limit);
    System.arraycopy(paramArrayOfByte, i + 0, this.buffer, 0, j);
    this.position = j;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/f/a/a/b/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */