package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import com.tencent.qqmusic.mediaplayer.seektable.Parsable;

public abstract interface IMpeg4Box
{
  public abstract long getSize();
  
  public abstract String getType();
  
  public abstract void parse(Parsable paramParsable, Box paramBox);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/seektable/mpeg4/boxes/IMpeg4Box.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */