package com.tencent.mm.plugin.music.b.a;

import com.tencent.mm.sdk.platformtools.x;
import com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure;

public class a
{
  public static void biz()
  {
    x.i("MicroMsg.Audio.AudioPlayerUtils", "configQQMusicSdkConfig");
    AudioPlayerConfigure.setLog(new a.1());
    AudioPlayerConfigure.setSoLibraryLoader(new a.2());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/music/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */