package com.tencent.qqmusic.mediaplayer.network;

import java.net.URL;
import java.util.Map;

public abstract interface IMediaHTTPConnection
{
  public abstract boolean connect(URL paramURL, Map<String, String> paramMap);
  
  public abstract void disconnect();
  
  public abstract String getMIMEType();
  
  public abstract long getSize();
  
  public abstract String getUri();
  
  public abstract int readAt(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/qqmusic/mediaplayer/network/IMediaHTTPConnection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */