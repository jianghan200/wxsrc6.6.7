package com.tencent.qqmusic.mediaplayer.network;

import com.tencent.qqmusic.mediaplayer.util.Logger;

public class DefaultMediaHTTPService
  implements IMediaHTTPService
{
  private static final String TAG = "DefaultMediaHTTPService";
  
  public IMediaHTTPConnection makeHTTPConnection()
  {
    Logger.d("DefaultMediaHTTPService", "makeHTTPConnection");
    return new DefaultMediaHTTPConnection();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/network/DefaultMediaHTTPService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */