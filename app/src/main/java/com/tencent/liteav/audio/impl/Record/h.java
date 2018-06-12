package com.tencent.liteav.audio.impl.Record;

public abstract interface h
{
  public abstract void onAudioRecordError(int paramInt, String paramString);
  
  public abstract void onAudioRecordPCM(byte[] paramArrayOfByte, int paramInt, long paramLong);
  
  public abstract void onAudioRecordStart();
  
  public abstract void onAudioRecordStop();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/liteav/audio/impl/Record/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */