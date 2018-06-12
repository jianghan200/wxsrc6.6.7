package com.qq.wx.voice.vad;

public class MMVoipVadNative
{
  public native int AddData(long paramLong, short[] paramArrayOfShort, int paramInt);
  
  public native long Init(int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4);
  
  public native int Release(long paramLong);
  
  public native int Reset(long paramLong);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/qq/wx/voice/vad/MMVoipVadNative.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */