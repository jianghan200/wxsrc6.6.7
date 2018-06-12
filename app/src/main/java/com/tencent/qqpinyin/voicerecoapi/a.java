package com.tencent.qqpinyin.voicerecoapi;

public final class a
{
  public static int MAX_FRAME_SIZE = 2000;
  private byte[] vgH = null;
  public byte[] vgI = null;
  private int vgJ = 0;
  public int vgK = 0;
  public TRSpeexNative vgL = new TRSpeexNative();
  
  public final byte[] W(byte[] paramArrayOfByte, int paramInt)
  {
    if (this.vgJ == 0) {
      throw new b(-102);
    }
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      throw new b(-104);
    }
    paramInt = this.vgL.nativeTRSpeexEncode(this.vgJ, paramArrayOfByte, 0, paramInt, this.vgH);
    if (paramInt < 0) {
      throw new b(paramInt);
    }
    if (paramInt == 0) {
      return null;
    }
    paramArrayOfByte = new byte[paramInt];
    System.arraycopy(this.vgH, 0, paramArrayOfByte, 0, paramInt);
    return paramArrayOfByte;
  }
  
  public final int cEM()
  {
    int i;
    if (this.vgJ != 0) {
      i = -103;
    }
    int j;
    do
    {
      return i;
      j = this.vgL.nativeTRSpeexInit();
      i = j;
    } while (j == -1);
    this.vgJ = j;
    this.vgH = new byte[MAX_FRAME_SIZE * 10];
    return 0;
  }
  
  public final int cEN()
  {
    if (this.vgJ == 0) {
      return -102;
    }
    this.vgH = null;
    int i = this.vgL.nativeTRSpeexRelease(this.vgJ);
    this.vgJ = 0;
    return i;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/qqpinyin/voicerecoapi/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */