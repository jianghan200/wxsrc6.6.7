package com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import java.util.BitSet;

public final class d
{
  public static int gdP = -1;
  
  public static int a(ScanResult paramScanResult)
  {
    if ((paramScanResult == null) || (paramScanResult.capabilities == null)) {
      return -1;
    }
    if (paramScanResult.capabilities.contains("WEP")) {
      return 1;
    }
    if (paramScanResult.capabilities.contains("PSK")) {
      return 2;
    }
    if (paramScanResult.capabilities.contains("EAP")) {
      return 3;
    }
    return 0;
  }
  
  public static int c(WifiConfiguration paramWifiConfiguration)
  {
    if (paramWifiConfiguration.allowedKeyManagement.get(1)) {
      return 2;
    }
    if ((paramWifiConfiguration.allowedKeyManagement.get(2)) || (paramWifiConfiguration.allowedKeyManagement.get(3))) {
      return 3;
    }
    if (paramWifiConfiguration.wepKeys[0] != null) {
      return 1;
    }
    return 0;
  }
  
  public static String uj(String paramString)
  {
    String str;
    if (paramString == null) {
      str = "";
    }
    int i;
    do
    {
      do
      {
        do
        {
          return str;
          i = paramString.length();
          str = paramString;
        } while (i <= 1);
        str = paramString;
      } while (paramString.charAt(0) != '"');
      str = paramString;
    } while (paramString.charAt(i - 1) != '"');
    return paramString.substring(1, i - 1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/wifi/wifisdk/internal/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */