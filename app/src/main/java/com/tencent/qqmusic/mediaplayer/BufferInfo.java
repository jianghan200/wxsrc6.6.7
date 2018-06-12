package com.tencent.qqmusic.mediaplayer;

public class BufferInfo
{
  public int bufferSize;
  public byte[] byteBuffer;
  public short[] shortBuffer;
  public byte[] tempByteBuffer;
  public short[] tempShortBuffer;
  
  public static BufferInfo byteToShortBuffer(BufferInfo paramBufferInfo)
  {
    if ((paramBufferInfo == null) || (paramBufferInfo.byteBuffer == null) || (paramBufferInfo.byteBuffer.length == 0)) {}
    for (;;)
    {
      return paramBufferInfo;
      int j = Math.min(paramBufferInfo.bufferSize, paramBufferInfo.byteBuffer.length);
      if (paramBufferInfo.shortBuffer == null) {
        paramBufferInfo.shortBuffer = new short[j / 2];
      }
      int i = 0;
      while (i < j / 2)
      {
        int k = (short)(paramBufferInfo.byteBuffer[(i * 2)] & 0xFF);
        int m = (short)((short)(paramBufferInfo.byteBuffer[(i * 2 + 1)] & 0xFF) << 8);
        paramBufferInfo.shortBuffer[i] = ((short)(k | m));
        i += 1;
      }
    }
  }
  
  public static BufferInfo shortToByteBuffer(BufferInfo paramBufferInfo)
  {
    if ((paramBufferInfo == null) || (paramBufferInfo.shortBuffer == null) || (paramBufferInfo.shortBuffer.length == 0)) {}
    for (;;)
    {
      return paramBufferInfo;
      int k = Math.min(paramBufferInfo.bufferSize, paramBufferInfo.shortBuffer.length);
      if (paramBufferInfo.byteBuffer == null) {
        paramBufferInfo.byteBuffer = new byte[k * 2];
      }
      int i = 0;
      int m;
      for (int j = 0; i < k; j = m + 1)
      {
        byte[] arrayOfByte = paramBufferInfo.byteBuffer;
        m = j + 1;
        arrayOfByte[j] = ((byte)paramBufferInfo.shortBuffer[i]);
        paramBufferInfo.byteBuffer[m] = ((byte)(paramBufferInfo.shortBuffer[i] >> 8));
        i += 1;
      }
    }
  }
  
  public void appendShort(short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    if ((paramArrayOfShort != null) && (paramInt1 >= 0) && (paramInt2 > 0) && (paramInt1 + paramInt2 <= paramArrayOfShort.length))
    {
      setShortBufferCapacity(this.bufferSize + paramInt2);
      System.arraycopy(paramArrayOfShort, paramInt1, this.shortBuffer, this.bufferSize, paramInt2);
    }
  }
  
  public BufferInfo copy(BufferInfo paramBufferInfo)
  {
    paramBufferInfo.bufferSize = this.bufferSize;
    paramBufferInfo.byteBuffer = this.byteBuffer;
    paramBufferInfo.shortBuffer = this.shortBuffer;
    paramBufferInfo.tempByteBuffer = this.tempByteBuffer;
    paramBufferInfo.tempShortBuffer = this.tempShortBuffer;
    return paramBufferInfo;
  }
  
  public void fillShort(byte[] paramArrayOfByte, int paramInt)
  {
    if ((paramArrayOfByte == null) || (paramInt <= 0) || (paramInt > paramArrayOfByte.length)) {}
    for (;;)
    {
      return;
      this.bufferSize = (paramInt / 2);
      if ((this.shortBuffer == null) || (this.shortBuffer.length < this.bufferSize)) {
        this.shortBuffer = new short[this.bufferSize];
      }
      paramInt = 0;
      while (paramInt < this.bufferSize)
      {
        int i = (short)(paramArrayOfByte[(paramInt * 2)] & 0xFF);
        int j = (short)((short)(paramArrayOfByte[(paramInt * 2 + 1)] & 0xFF) << 8);
        this.shortBuffer[paramInt] = ((short)(i | j));
        paramInt += 1;
      }
    }
  }
  
  public void setShortBufferCapacity(int paramInt)
  {
    if ((this.shortBuffer == null) || (this.shortBuffer.length < paramInt)) {
      this.shortBuffer = new short[paramInt];
    }
  }
  
  public void setTempByteBufferCapacity(int paramInt)
  {
    if ((this.tempByteBuffer == null) || (this.tempByteBuffer.length < paramInt)) {
      this.tempByteBuffer = new byte[paramInt];
    }
  }
  
  public void setTempShortBufferCapacity(int paramInt)
  {
    if ((this.tempShortBuffer == null) || (this.tempShortBuffer.length < paramInt)) {
      this.tempShortBuffer = new short[paramInt];
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/BufferInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */