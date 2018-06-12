package c.t.m.g;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.util.Base64;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class ej
{
  public static boolean a = false;
  private static long b = 0L;
  private static boolean c = false;
  
  public static int a(WifiManager paramWifiManager)
  {
    int i = 4;
    if (paramWifiManager != null) {}
    try
    {
      i = paramWifiManager.getWifiState();
      return i;
    }
    catch (Throwable paramWifiManager) {}
    return 4;
  }
  
  public static String a(List<ScanResult> paramList)
  {
    if ((paramList == null) || (paramList.size() == 0)) {
      return "";
    }
    StringBuilder localStringBuilder1 = new StringBuilder();
    paramList = paramList.iterator();
    int i = 0;
    for (;;)
    {
      ScanResult localScanResult;
      if (paramList.hasNext())
      {
        localScanResult = (ScanResult)paramList.next();
        if ((localScanResult.SSID == null) || (localScanResult.SSID.length() == 0)) {}
      }
      else
      {
        try
        {
          StringBuilder localStringBuilder2 = new StringBuilder();
          localStringBuilder2.append('|');
          localStringBuilder2.append(localScanResult.BSSID).append(',');
          localStringBuilder2.append(Base64.encodeToString(localScanResult.SSID.getBytes("UTF-8"), 2)).append(',');
          localStringBuilder2.append(localScanResult.frequency).append(',');
          localStringBuilder2.append(Base64.encodeToString(localScanResult.capabilities.getBytes("UTF-8"), 2));
          localStringBuilder1.append(localStringBuilder2);
          i += 1;
        }
        catch (Throwable localThrowable) {}
        localStringBuilder1.insert(0, "1|" + i);
        return localStringBuilder1.toString();
      }
    }
  }
  
  public static boolean a(ct paramct)
  {
    boolean bool2 = false;
    try
    {
      paramct = paramct.f;
      boolean bool1 = bool2;
      if (paramct != null)
      {
        boolean bool3 = paramct.isWifiEnabled();
        bool1 = bool2;
        if (bool3) {
          bool1 = true;
        }
      }
      return bool1;
    }
    catch (Throwable paramct) {}
    return false;
  }
  
  public static boolean b(WifiManager paramWifiManager)
  {
    boolean bool2 = false;
    boolean bool1 = false;
    if (paramWifiManager != null) {}
    for (bool1 = bool2;; bool1 = bool2)
    {
      try
      {
        if (System.currentTimeMillis() - b <= 3000L) {
          break label55;
        }
        bool1 = bool2;
        bool2 = paramWifiManager.startScan();
        bool1 = bool2;
        c = bool2;
        bool1 = bool2;
        b = System.currentTimeMillis();
        bool1 = bool2;
      }
      catch (Exception paramWifiManager)
      {
        for (;;)
        {
          label55:
          a = true;
        }
      }
      finally {}
      return bool1;
      bool1 = bool2;
      bool2 = c;
    }
  }
  
  @SuppressLint({"NewApi"})
  public static boolean b(ct paramct)
  {
    boolean bool2 = false;
    boolean bool3 = false;
    WifiManager localWifiManager = paramct.f;
    if (localWifiManager != null)
    {
      boolean bool1 = bool3;
      try
      {
        if (Build.VERSION.SDK_INT >= 23)
        {
          bool1 = bool3;
          if (Settings.Secure.getInt(paramct.a.getContentResolver(), "location_mode") == 0) {
            return false;
          }
        }
        bool1 = bool3;
        bool3 = localWifiManager.isWifiEnabled();
        bool2 = bool3;
        if (!bool3)
        {
          bool1 = bool3;
          bool2 = bool3;
          if (Build.VERSION.SDK_INT >= 18)
          {
            bool1 = bool3;
            bool2 = localWifiManager.isScanAlwaysAvailable();
            return bool2;
          }
        }
      }
      catch (Throwable paramct)
      {
        bool2 = bool1;
        if ((paramct instanceof SecurityException))
        {
          a = true;
          bool2 = bool1;
        }
      }
    }
    return bool2;
  }
  
  public static String c(ct paramct)
  {
    Object localObject = paramct.a;
    if (localObject == null) {
      return "{}";
    }
    try
    {
      paramct = (WifiManager)((Context)localObject).getSystemService("wifi");
      localObject = (ConnectivityManager)((Context)localObject).getSystemService("connectivity");
      if ((paramct != null) && (localObject != null))
      {
        paramct = paramct.getConnectionInfo();
        localObject = ((ConnectivityManager)localObject).getNetworkInfo(1);
        if ((paramct != null) && (localObject != null) && (((NetworkInfo)localObject).isConnected()))
        {
          localObject = paramct.getBSSID();
          if ((localObject == null) || (((String)localObject).equals("000000000000")) || (((String)localObject).equals("00-00-00-00-00-00")) || (((String)localObject).equals("00:00:00:00:00:00"))) {
            break label225;
          }
          int i = paramct.getRssi();
          if ((i < -100) || (i > -20)) {
            break label228;
          }
          paramct = paramct.getSSID().replace("\"", "").replace("|", "");
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("{");
          localStringBuilder.append("\"mac\":\"");
          localStringBuilder.append((String)localObject);
          localStringBuilder.append("\",\"rssi\":");
          localStringBuilder.append(i);
          localStringBuilder.append(",\"ssid\":\"");
          localStringBuilder.append(paramct);
          localStringBuilder.append("\"}");
          paramct = localStringBuilder.toString();
          return paramct;
        }
        return "{}";
      }
    }
    catch (Exception paramct)
    {
      return "{}";
    }
    return "{}";
    label225:
    return "{}";
    label228:
    return "{}";
  }
  
  public static List<ScanResult> c(WifiManager paramWifiManager)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    if (paramWifiManager != null) {
      localObject1 = localObject2;
    }
    try
    {
      paramWifiManager = paramWifiManager.getScanResults();
      localObject1 = paramWifiManager;
      a = false;
      localObject1 = paramWifiManager;
    }
    catch (Exception paramWifiManager)
    {
      for (;;)
      {
        a = true;
      }
    }
    paramWifiManager = (WifiManager)localObject1;
    if (localObject1 == null) {
      paramWifiManager = Collections.emptyList();
    }
    return paramWifiManager;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/c/t/m/g/ej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */