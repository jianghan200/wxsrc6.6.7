package com.tencent.mm.plugin.music.c.a;

import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPConnection;
import com.tencent.qqmusic.mediaplayer.network.IMediaHTTPService;
import com.tencent.qqmusic.mediaplayer.util.Logger;

public final class b
  implements IMediaHTTPService
{
  public final IMediaHTTPConnection makeHTTPConnection()
  {
    Logger.i("MicroMsg.MMMediaHTTPService", "makeHTTPConnection");
    return new a();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/music/c/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */