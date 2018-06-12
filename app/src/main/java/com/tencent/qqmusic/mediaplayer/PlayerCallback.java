package com.tencent.qqmusic.mediaplayer;

abstract interface PlayerCallback
{
  public abstract void playThreadStart(CorePlayer paramCorePlayer);
  
  public abstract void playerEnded(CorePlayer paramCorePlayer);
  
  public abstract void playerException(CorePlayer paramCorePlayer, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract void playerPaused(CorePlayer paramCorePlayer);
  
  public abstract void playerPrepared(CorePlayer paramCorePlayer);
  
  public abstract void playerSeeked(CorePlayer paramCorePlayer);
  
  public abstract void playerStarted(CorePlayer paramCorePlayer);
  
  public abstract void playerStopped(CorePlayer paramCorePlayer);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/PlayerCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */