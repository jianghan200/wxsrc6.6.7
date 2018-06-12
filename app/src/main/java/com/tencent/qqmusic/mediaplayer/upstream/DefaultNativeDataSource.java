package com.tencent.qqmusic.mediaplayer.upstream;

import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;

public class DefaultNativeDataSource
  implements INativeDataSource
{
  private final AudioFormat.AudioType audioType;
  private final long nativeInstance;
  
  public DefaultNativeDataSource(long paramLong, AudioFormat.AudioType paramAudioType)
  {
    this.nativeInstance = paramLong;
    this.audioType = paramAudioType;
  }
  
  public AudioFormat.AudioType getAudioType()
  {
    return this.audioType;
  }
  
  public long getNativeInstance()
  {
    return this.nativeInstance;
  }
  
  public String toString()
  {
    return "DefaultNativeDataSource";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/upstream/DefaultNativeDataSource.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */