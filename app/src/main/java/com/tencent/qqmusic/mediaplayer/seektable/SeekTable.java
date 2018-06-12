package com.tencent.qqmusic.mediaplayer.seektable;

import java.io.InputStream;

public abstract interface SeekTable
{
  public abstract void parse(InputStream paramInputStream);
  
  public abstract long seek(long paramLong);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/seektable/SeekTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */