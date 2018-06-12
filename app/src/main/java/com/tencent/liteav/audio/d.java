package com.tencent.liteav.audio;

import com.tencent.liteav.basic.f.a;

public abstract interface d
{
  public abstract void onPlayAudioInfoChanged(a parama1, a parama2);
  
  public abstract void onPlayError(int paramInt, String paramString);
  
  public abstract void onPlayJitterStateNotify(int paramInt);
  
  public abstract void onPlayPcmData(byte[] paramArrayOfByte, long paramLong);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/liteav/audio/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */