package com.tencent.qqmusic.mediaplayer;

public abstract interface PlayerState
{
  public static final int END = 8;
  public static final int ERROR = 9;
  public static final int IDLE = 0;
  public static final int INITIALIZED = 1;
  public static final int PAUSED = 5;
  public static final int PLAYBACKCOMPLETED = 7;
  public static final int PREPARED = 2;
  public static final int PREPARING = 3;
  public static final int STARTED = 4;
  public static final int STOPPED = 6;
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/PlayerState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */