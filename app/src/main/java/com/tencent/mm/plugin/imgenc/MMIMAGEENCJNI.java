package com.tencent.mm.plugin.imgenc;

public class MMIMAGEENCJNI
{
  public static final String TAG = "MMIMAGEENCJNI";
  
  public static native long free(long paramLong);
  
  public static native long open(long paramLong);
  
  public static native long open(String paramString);
  
  public static native byte[] readByte(long paramLong, byte[] paramArrayOfByte);
  
  public static native long seek(long paramLong1, long paramLong2, int paramInt);
  
  public static native long transFor(long paramLong1, byte[] paramArrayOfByte, long paramLong2, long paramLong3);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/imgenc/MMIMAGEENCJNI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */