package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.c;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.g;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.h;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.j;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.a;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.scan.BleScanWorker.3;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.scan.ScanSettingsCompat.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a
{
  public static BroadcastReceiver fKZ;
  public static boolean fLa;
  public static a.a fLb = new a.1();
  private static Map<String, b> map = new ConcurrentHashMap();
  
  public static j a(String paramString, b.a parama, h paramh, g paramg)
  {
    x.i("MicroMsg.Ble.BleManager", "open appId:%s", new Object[] { paramString });
    if ((!d.fS(18)) && (ad.getContext().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le"))) {}
    for (int i = 1; i == 0; i = 0)
    {
      x.e("MicroMsg.Ble.BleManager", "api version is below 18");
      return j.fMG;
    }
    b localb;
    Object localObject1;
    Object localObject2;
    if (!map.containsKey(paramString))
    {
      x.w("MicroMsg.Ble.BleManager", "already open appId:%s", new Object[] { paramString });
      localb = new b(paramString);
      localb.fLc = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.b(ad.getContext());
      localObject1 = localb.fLc;
      localObject2 = ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.b)localObject1).fLH;
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.BleConnectMgr", "init", new Object[0]);
      if (((c)localObject2).fLQ == null) {
        ((c)localObject2).fLQ = new ConcurrentHashMap();
      }
      ((c)localObject2).fLQ.clear();
      localObject1 = ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.b)localObject1).fLI;
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.BleScanWorker", "init", new Object[0]);
      ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.scan.a)localObject1).fMR.set(true);
      ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.scan.a)localObject1).fMP = new HashMap();
      ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.scan.a)localObject1).fMS = new ArrayList();
      ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.scan.a)localObject1).fMN = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.scan.a.2((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.scan.a)localObject1);
      if (!"middle".equals("low")) {
        break label427;
      }
      ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.scan.a)localObject1).fMO = new ScanSettingsCompat.a().kD(0).aiy();
    }
    for (;;)
    {
      if (((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.scan.a)localObject1).fKZ == null)
      {
        x.i("MicroMsg.Ble.BleScanWorker", "bluetoothStateListener init");
        ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.scan.a)localObject1).fKZ = new BleScanWorker.3((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.scan.a)localObject1);
        localObject2 = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
        ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.scan.a)localObject1).context.registerReceiver(((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.scan.a)localObject1).fKZ, (IntentFilter)localObject2);
      }
      localb.fLd = parama;
      if (localb.fLc != null)
      {
        parama = localb.fLc;
        if (parama.fLH != null) {
          parama.fLH.fLR = paramh;
        }
      }
      if (localb.fLc != null)
      {
        parama = localb.fLc;
        if (parama.fLH != null) {
          parama.fLH.fLS = paramg;
        }
      }
      map.put(paramString, localb);
      e.a(paramString, localb);
      aip();
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.fNU = fLb;
      if (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.aiB()) {
        break;
      }
      x.e("MicroMsg.Ble.BleManager", "bluetooth not enable, err");
      return j.fMy;
      label427:
      if ("middle".equals("middle")) {
        ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.scan.a)localObject1).fMO = new ScanSettingsCompat.a().kD(1).aiy();
      } else if ("middle".equals("high")) {
        ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.scan.a)localObject1).fMO = new ScanSettingsCompat.a().kD(2).aiy();
      } else {
        ((com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.scan.a)localObject1).fMO = new ScanSettingsCompat.a().kD(0).aiy();
      }
    }
    return j.fMv;
  }
  
  private static void aip()
  {
    try
    {
      if (fKZ == null)
      {
        x.i("MicroMsg.Ble.BleManager", "bluetoothStateListener init");
        fKZ = new a.2();
        IntentFilter localIntentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
        ad.getContext().registerReceiver(fKZ, localIntentFilter);
        fLa = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.aiB();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private static void aiq()
  {
    try
    {
      if (fKZ != null)
      {
        x.i("MicroMsg.Ble.BleManager", "bluetoothStateListener uninit");
        ad.getContext().unregisterReceiver(fKZ);
        fKZ = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static b tr(String paramString)
  {
    return (b)map.get(paramString);
  }
  
  public static j ts(String paramString)
  {
    x.i("MicroMsg.Ble.BleManager", "close appId:%s", new Object[] { paramString });
    if (!map.containsKey(paramString)) {
      return j.fMv;
    }
    b localb = (b)map.remove(paramString);
    e.b(paramString, localb);
    localb.uninit();
    if (map.size() == 0) {
      aiq();
    }
    return j.fMv;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */