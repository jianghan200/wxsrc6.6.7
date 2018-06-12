package com.tencent.mm.plugin.music.c;

import com.tencent.mm.z.d;
import com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import com.tencent.qqmusic.mediaplayer.util.Logger;

public final class a
  implements IDataSource
{
  public d dGy;
  
  public a(d paramd)
  {
    this.dGy = paramd;
  }
  
  public final void close()
  {
    Logger.i("MicroMsg.Audio.InputStreamDataSource", "close");
    if (this.dGy != null) {
      this.dGy.close();
    }
  }
  
  public final AudioFormat.AudioType getAudioType()
  {
    if (this.dGy == null)
    {
      Logger.e("MicroMsg.Audio.InputStreamDataSource", "[getAudioType] unsupport");
      return AudioFormat.AudioType.UNSUPPORT;
    }
    Logger.i("MicroMsg.Audio.InputStreamDataSource", "getAudioType:" + this.dGy.Kn());
    switch (this.dGy.Kn())
    {
    default: 
      Logger.e("MicroMsg.Audio.InputStreamDataSource", "[getAudioType] unsupport");
      return AudioFormat.AudioType.UNSUPPORT;
    case 0: 
      return AudioFormat.AudioType.UNSUPPORT;
    case 1: 
      return AudioFormat.AudioType.AAC;
    case 2: 
      return AudioFormat.AudioType.MP3;
    case 3: 
      return AudioFormat.AudioType.WAV;
    }
    return AudioFormat.AudioType.OGG;
  }
  
  public final long getSize()
  {
    if (this.dGy != null) {
      return this.dGy.getSize();
    }
    return 0L;
  }
  
  public final void open()
  {
    Logger.i("MicroMsg.Audio.InputStreamDataSource", "open");
    if (this.dGy != null) {
      this.dGy.open();
    }
  }
  
  public final int readAt(long paramLong, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.dGy == null)
    {
      Logger.e("MicroMsg.Audio.InputStreamDataSource", "[readAt]audioDataSource is null");
      return -1;
    }
    return this.dGy.readAt(paramLong, paramArrayOfByte, paramInt1, paramInt2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/music/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */