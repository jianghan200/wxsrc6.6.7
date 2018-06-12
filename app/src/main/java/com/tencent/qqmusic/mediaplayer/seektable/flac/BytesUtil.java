package com.tencent.qqmusic.mediaplayer.seektable.flac;

public class BytesUtil
{
  public static int from(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length > 4) {
      throw new RuntimeException("bytes can't be greater than 32 bit!");
    }
    if (paramArrayOfByte.length == 3) {
      return (paramArrayOfByte[0] & 0xFF) << 16 | (paramArrayOfByte[1] & 0xFF) << 8 | paramArrayOfByte[2] & 0xFF;
    }
    if (paramArrayOfByte.length == 2) {
      return (paramArrayOfByte[0] & 0xFF) << 8 | paramArrayOfByte[1] & 0xF;
    }
    if (paramArrayOfByte.length == 1) {
      return paramArrayOfByte[0] & 0xFF;
    }
    throw new RuntimeException("bytes must be greater than 8 bit!");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/seektable/flac/BytesUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */