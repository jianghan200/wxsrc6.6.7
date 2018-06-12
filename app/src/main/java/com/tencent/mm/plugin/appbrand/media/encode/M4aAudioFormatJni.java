package com.tencent.mm.plugin.appbrand.media.encode;

public class M4aAudioFormatJni
{
  public static native void closeM4aFile();
  
  public static native int createM4aFile(String paramString, int paramInt1, int paramInt2, int paramInt3);
  
  public static native int writeAudioBuff(byte[] paramArrayOfByte, int paramInt);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/media/encode/M4aAudioFormatJni.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */