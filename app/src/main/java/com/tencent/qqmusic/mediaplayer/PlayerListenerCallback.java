package com.tencent.qqmusic.mediaplayer;

public abstract interface PlayerListenerCallback
{
  public abstract void onBufferingUpdate(BaseMediaPlayer paramBaseMediaPlayer, int paramInt);
  
  public abstract void onCompletion(BaseMediaPlayer paramBaseMediaPlayer);
  
  public abstract void onError(BaseMediaPlayer paramBaseMediaPlayer, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void onPrepared(BaseMediaPlayer paramBaseMediaPlayer);
  
  public abstract void onSeekComplete(BaseMediaPlayer paramBaseMediaPlayer);
  
  public abstract void onStarted(BaseMediaPlayer paramBaseMediaPlayer);
  
  public abstract void onStateChanged(int paramInt);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/PlayerListenerCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */