package com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal;

import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import java.util.List;

public final class c
{
  public static WifiManager bgP;
  
  public static int addNetwork(WifiConfiguration paramWifiConfiguration)
  {
    try
    {
      int i = bgP.addNetwork(paramWifiConfiguration);
      return i;
    }
    catch (Throwable paramWifiConfiguration)
    {
      paramWifiConfiguration.toString();
    }
    return d.gdP;
  }
  
  public static boolean disableNetwork(int paramInt)
  {
    try
    {
      boolean bool = bgP.disableNetwork(paramInt);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.toString();
    }
    return false;
  }
  
  public static List<WifiConfiguration> getConfiguredNetworks()
  {
    try
    {
      List localList = bgP.getConfiguredNetworks();
      return localList;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.toString();
    }
    return null;
  }
  
  public static WifiInfo getConnectionInfo()
  {
    try
    {
      WifiInfo localWifiInfo = bgP.getConnectionInfo();
      return localWifiInfo;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.toString();
    }
    return null;
  }
  
  public static List<ScanResult> getScanResults()
  {
    try
    {
      List localList = bgP.getScanResults();
      return localList;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.toString();
    }
    return null;
  }
  
  public static boolean isWifiEnabled()
  {
    try
    {
      boolean bool = bgP.isWifiEnabled();
      return bool;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.toString();
    }
    return false;
  }
  
  public static boolean lb(int paramInt)
  {
    try
    {
      boolean bool = bgP.enableNetwork(paramInt, true);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.toString();
    }
    return false;
  }
  
  public static boolean removeNetwork(int paramInt)
  {
    try
    {
      boolean bool = bgP.removeNetwork(paramInt);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.toString();
    }
    return false;
  }
  
  public static boolean saveConfiguration()
  {
    try
    {
      boolean bool = bgP.saveConfiguration();
      return bool;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.toString();
    }
    return false;
  }
  
  public static boolean startScan()
  {
    try
    {
      boolean bool = bgP.startScan();
      return bool;
    }
    catch (Throwable localThrowable)
    {
      localThrowable.toString();
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/wifi/wifisdk/internal/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */