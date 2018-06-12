package com.tencent.mm.plugin.appbrand.media.encode;

import com.tencent.mm.compatible.util.k;

public class Mp3EncodeJni
{
  static
  {
    k.b("mp3lame", Mp3EncodeJni.class.getClassLoader());
  }
  
  public static native void close();
  
  public static native int encode(short[] paramArrayOfShort1, short[] paramArrayOfShort2, int paramInt, byte[] paramArrayOfByte);
  
  public static native int encodeBufferInterleaved(short[] paramArrayOfShort, int paramInt, byte[] paramArrayOfByte);
  
  public static native int flush(byte[] paramArrayOfByte);
  
  public static native int getVersion();
  
  public static native int init(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  public static native void setMode(int paramInt);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/media/encode/Mp3EncodeJni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */