package com.d.a.a;

import android.net.wifi.WifiManager;
import android.os.Handler;

final class ac
  extends e
{
  private final WifiManager bnh;
  
  ac(WifiManager paramWifiManager, Handler paramHandler)
  {
    super(paramHandler);
    this.bnh = paramWifiManager;
  }
  
  final void sv()
  {
    this.bnh.startScan();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/d/a/a/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */