package com.tencent.qqmusic.mediaplayer.seektable.mpeg4.boxes;

import com.tencent.qqmusic.mediaplayer.seektable.Parsable;

public abstract class FullBox
  extends Box
{
  int flags;
  int version;
  
  public int getFlags()
  {
    return this.flags;
  }
  
  public int getVersion()
  {
    return this.version;
  }
  
  public void parse(Parsable paramParsable, Box paramBox)
  {
    super.parse(paramParsable, paramBox);
    paramBox = new byte[4];
    paramParsable.readBytes(paramBox, 0, 4);
    this.version = (paramBox[0] & 0xFF);
    int i = paramBox[1];
    int j = paramBox[2];
    this.flags = (paramBox[3] & 0xFF | (i & 0xFF) << 16 | (j & 0xFF) << 8);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/seektable/mpeg4/boxes/FullBox.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */