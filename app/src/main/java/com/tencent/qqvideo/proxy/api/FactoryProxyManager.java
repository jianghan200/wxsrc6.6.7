package com.tencent.qqvideo.proxy.api;

import com.tencent.qqvideo.proxy.common.PlayManagerImp;

public class FactoryProxyManager
{
  private static IPlayManager playManager = null;
  
  public static IPlayManager getPlayManager()
  {
    try
    {
      if (playManager == null) {
        playManager = new PlayManagerImp();
      }
      IPlayManager localIPlayManager = playManager;
      return localIPlayManager;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/qqvideo/proxy/api/FactoryProxyManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */