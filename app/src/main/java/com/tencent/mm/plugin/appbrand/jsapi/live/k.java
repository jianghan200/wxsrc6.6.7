package com.tencent.mm.plugin.appbrand.jsapi.live;

import com.tencent.rtmp.TXLiveBase;

public final class k
{
  private static boolean fRU;
  
  public static void aje()
  {
    if (fRU) {
      return;
    }
    TXLiveBase.setLogLevel(1);
    TXLiveBase.setConsoleEnabled(false);
    TXLiveBase.setListener(new k.1());
    fRU = true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/live/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */