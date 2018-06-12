package com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk;

import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.text.TextUtils;
import com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.WiFiConnector.2;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

public final class d
{
  private static boolean gdC = false;
  private static WeakReference<com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.a> gdD = null;
  private static b gdE = null;
  private static a gdF;
  private static Context mContext;
  
  public static void F(String paramString1, String paramString2, String paramString3)
  {
    String str = null;
    if (gdD != null)
    {
      locala = (com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.a)gdD.get();
      if ((locala != null) && (!locala.akx())) {
        locala.ui("duplicated request");
      }
    }
    com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.a locala = new com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.a(gdF, mContext);
    new StringBuilder("ssid:").append(paramString1).append(" bssid:").append(paramString2).append(" psw:").append(paramString3);
    locala.gdv = paramString1;
    locala.gdw = paramString2;
    if (TextUtils.isEmpty(paramString3))
    {
      i = 0;
      if ((paramString1 != null) && (paramString1.length() > 0)) {
        break label359;
      }
      paramString2 = null;
      List localList = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.getConfiguredNetworks();
      paramString3 = str;
      if (localList != null) {
        paramString3 = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.b.a(paramString1, i, localList);
      }
      if (paramString2 == null) {
        break label520;
      }
      str = paramString2;
      if (paramString3 != null)
      {
        if (!com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.b.aF(paramString1, i)) {
          break label531;
        }
        com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.saveConfiguration();
      }
    }
    label359:
    label520:
    label531:
    for (int i = 1;; i = 0)
    {
      str = paramString2;
      if (i == 0)
      {
        paramString2.networkId = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.b.b(paramString2);
        str = paramString2;
        if (paramString2.networkId == com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.gdP) {
          str = paramString3;
        }
      }
      if (str.networkId == com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.gdP) {
        str.networkId = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.b.b(str);
      }
      if ((str.networkId != com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.gdP) && (locala.a(str)))
      {
        locala.kZ(1);
        locala.gdJ = str;
        if (!locala.gdr)
        {
          paramString1 = new IntentFilter();
          paramString1.addAction("android.net.wifi.supplicant.STATE_CHANGE");
          paramString1.addAction("android.net.wifi.STATE_CHANGE");
          paramString1.addAction("android.net.conn.CONNECTIVITY_CHANGE");
          paramString1.setPriority(Integer.MAX_VALUE);
          locala.gds = new WiFiConnector.2(locala);
          locala.gdG.registerReceiver(locala.gds, paramString1);
          locala.gdr = true;
        }
        locala.mHandler.sendEmptyMessageDelayed(1, 13000L);
      }
      for (;;)
      {
        gdD = new WeakReference(locala);
        return;
        i = 2;
        break;
        paramString2 = new WifiConfiguration();
        paramString2.allowedAuthAlgorithms.clear();
        paramString2.allowedGroupCiphers.clear();
        paramString2.allowedKeyManagement.clear();
        paramString2.allowedPairwiseCiphers.clear();
        paramString2.allowedProtocols.clear();
        paramString2.SSID = ("\"" + paramString1 + "\"");
        paramString2.hiddenSSID = true;
        switch (i)
        {
        default: 
          paramString2.allowedKeyManagement.set(0);
        }
        for (;;)
        {
          paramString2.status = 2;
          break;
          if (paramString3.length() != 0) {
            if (paramString3.matches("[0-9A-Fa-f]{64}")) {
              paramString2.preSharedKey = paramString3;
            } else {
              paramString2.preSharedKey = ("\"" + paramString3 + '"');
            }
          }
        }
        locala.g(false, "fail to connect wifi:invalid network id");
      }
    }
  }
  
  public static void a(a parama)
  {
    gdF = parama;
  }
  
  public static b akv()
  {
    WifiInfo localWifiInfo = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.getConnectionInfo();
    String str3 = "";
    String str4 = "";
    String str2 = str4;
    String str1 = str3;
    if (localWifiInfo != null)
    {
      str2 = str4;
      str1 = str3;
      if (!TextUtils.isEmpty(localWifiInfo.getSSID()))
      {
        str1 = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.uj(localWifiInfo.getSSID());
        str2 = bi.aG(localWifiInfo.getBSSID(), "");
      }
    }
    if ((gdE != null) && (gdE.gdv.compareTo(str1) == 0) && (gdE.gdw.compareTo(str2) == 0)) {
      return gdE;
    }
    if (localWifiInfo != null)
    {
      akw();
      return gdE;
    }
    return null;
  }
  
  public static c akw()
  {
    c localc = new c();
    gdE = null;
    Object localObject2;
    Object localObject1;
    String str;
    if ((gdC) && (com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.isWifiEnabled()))
    {
      com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.startScan();
      localObject2 = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.getScanResults();
      localc.gdB = new ArrayList();
      localc.fHW = "ok";
      if (localObject2 != null)
      {
        x.d("MicroMsg.WiFiManagerWrapper", "[getWifiList] ScanResult:%s, size:%d", new Object[] { localObject2, Integer.valueOf(((List)localObject2).size()) });
        localObject1 = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.getConnectionInfo();
        x.d("MicroMsg.WiFiManagerWrapper", "[getWifiList] currentWiFiInfo:%s", new Object[] { localObject1 });
        if ((localObject1 == null) || (TextUtils.isEmpty(((WifiInfo)localObject1).getSSID()))) {
          break label406;
        }
        str = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.uj(((WifiInfo)localObject1).getSSID());
        localObject1 = bi.aG(((WifiInfo)localObject1).getBSSID(), "");
      }
    }
    for (;;)
    {
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        ScanResult localScanResult = (ScanResult)((Iterator)localObject2).next();
        if (localScanResult != null)
        {
          int j = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.a(localScanResult);
          if ((j == 0) || (j == 2))
          {
            b localb = new b();
            localb.gdv = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.d.uj(localScanResult.SSID);
            localb.gdw = bi.aG(localScanResult.BSSID, "");
            int i = localScanResult.level;
            label246:
            boolean bool;
            if (i <= -100)
            {
              i = 0;
              localb.gdx = i;
              if (j != 2) {
                break label356;
              }
              bool = true;
              label259:
              localb.gdy = bool;
              if ((str == null) || (localObject1 == null) || (localb.gdv.compareTo(str) != 0) || (localb.gdw.compareTo((String)localObject1) != 0)) {
                break label361;
              }
            }
            label356:
            label361:
            for (i = 1;; i = 0)
            {
              if (i != 0) {
                gdE = localb;
              }
              localc.gdB.add(localb);
              break;
              if (i >= -55)
              {
                i = 99;
                break label246;
              }
              i = (int)((i + 100) * 99.0F / 45.0F);
              break label246;
              bool = false;
              break label259;
            }
            x.e("MicroMsg.WiFiManagerWrapper", "wifiList is null");
          }
        }
      }
      return localc;
      if (gdC)
      {
        localc.fHW = "wifi is disable";
        return localc;
      }
      localc.fHW = "sdk not init";
      return localc;
      label406:
      localObject1 = null;
      str = null;
    }
  }
  
  public static void cC(Context paramContext)
  {
    if ((!gdC) && (paramContext != null))
    {
      mContext = paramContext;
      paramContext = (WifiManager)paramContext.getSystemService("wifi");
      if (paramContext != null)
      {
        com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c.bgP = paramContext;
        gdC = true;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/wifi/wifisdk/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */