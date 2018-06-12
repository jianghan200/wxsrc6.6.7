package com.tencent.qqmusic.mediaplayer.seektable;

public abstract interface Parsable
{
  public abstract long available();
  
  public abstract void readBytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public abstract int readInt();
  
  public abstract int[] readIntArray(int paramInt);
  
  public abstract void readIntArrayInterleaved(int paramInt, int[]... paramVarArgs);
  
  public abstract long readLong();
  
  public abstract long[] readLongArray(int paramInt);
  
  public abstract void readLongArrayInterleaved(int paramInt, long[]... paramVarArgs);
  
  public abstract String readString(int paramInt);
  
  public abstract long skip(long paramLong);
  
  public abstract long tell();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/seektable/Parsable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */