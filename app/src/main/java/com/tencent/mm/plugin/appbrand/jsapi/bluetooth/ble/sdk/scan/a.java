package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.scan;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Handler;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.d;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.i;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.j;
import com.tencent.mm.sdk.platformtools.ad;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a
{
  public Context context;
  public BroadcastReceiver fKZ;
  public e fMN;
  public ScanSettingsCompat fMO;
  public Map<String, d> fMP;
  public AtomicBoolean fMQ = new AtomicBoolean(false);
  public AtomicBoolean fMR = new AtomicBoolean(false);
  public List<d> fMS;
  Runnable fMT = new a.1(this);
  i fMU;
  final Handler mHandler = new Handler();
  
  public a(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public final void a(com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.b paramb, List<ScanFilterCompat> paramList, i parami)
  {
    BluetoothAdapter localBluetoothAdapter;
    for (;;)
    {
      try
      {
        if (!this.fMR.get())
        {
          paramb.a(j.fMF);
          return;
        }
        if (this.fMQ.get())
        {
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.w("MicroMsg.Ble.BleScanWorker", "already scan", new Object[0]);
          paramb.a(j.fMv);
          continue;
        }
        localBluetoothAdapter = com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.aiA();
      }
      finally {}
      if ((localBluetoothAdapter != null) && (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.aiB())) {
        break;
      }
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.e("MicroMsg.Ble.BleScanWorker", "BluetoothAdapter is null, err", new Object[0]);
      paramb.a(j.fMy);
    }
    label128:
    boolean bool1;
    Object localObject;
    boolean bool2;
    if (Build.VERSION.SDK_INT >= 23)
    {
      if (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.tu("android.permission.ACCESS_COARSE_LOCATION")) {
        break label401;
      }
      if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.tu("android.permission.ACCESS_FINE_LOCATION")) {
        break label423;
      }
      break label401;
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.BleScanWorker", "checkLocationPermission :%b", new Object[] { Boolean.valueOf(bool1) });
      localObject = (LocationManager)ad.getContext().getSystemService("location");
      if (localObject == null) {
        break label392;
      }
      bool2 = ((LocationManager)localObject).isProviderEnabled("gps");
      bool1 = ((LocationManager)localObject).isProviderEnabled("network");
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.BleHelper", "isGPSEnable " + bool2 + ", isNetworkEnable:" + bool1, new Object[0]);
      break label407;
    }
    for (;;)
    {
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.BleScanWorker", "checkGpsEnable:%b", new Object[] { Boolean.valueOf(bool1) });
      this.fMQ.set(true);
      localObject = paramList;
      if (paramList != null)
      {
        localObject = paramList;
        if (paramList.size() == 0)
        {
          com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.w("MicroMsg.Ble.BleScanWorker", "scanFilterCompats size:%d", new Object[] { Integer.valueOf(paramList.size()) });
          localObject = null;
        }
      }
      bool1 = b.a(localBluetoothAdapter, (List)localObject, this.fMO, this.fMN);
      com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.a.i("MicroMsg.Ble.BleScanWorker", "startBleScan isOk:%b", new Object[] { Boolean.valueOf(bool1) });
      if (bool1)
      {
        this.fMU = parami;
        if (com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.fLt.djl > 0) {
          this.mHandler.postDelayed(this.fMT, com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.fLt.djl);
        }
        paramb.a(j.fMv);
        break;
      }
      paramb.a(j.fMF);
      break;
      label392:
      bool1 = false;
      bool2 = false;
      break label407;
      label401:
      bool1 = true;
      break label128;
      label407:
      if ((bool2) && (bool1))
      {
        bool1 = true;
        continue;
        label423:
        bool1 = false;
        break label128;
      }
      bool1 = false;
    }
  }
  
  /* Error */
  public final j aiw()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 41	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/scan/a:fMR	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   6: invokevirtual 62	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   9: ifne +11 -> 20
    //   12: getstatic 224	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/c/j:fMx	Lcom/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/c/j;
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: areturn
    //   20: aload_0
    //   21: getfield 39	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/scan/a:fMQ	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   24: invokevirtual 62	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   27: ifne +21 -> 48
    //   30: ldc 75
    //   32: ldc -30
    //   34: iconst_0
    //   35: anewarray 4	java/lang/Object
    //   38: invokestatic 83	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/d/a:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   41: getstatic 86	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/c/j:fMv	Lcom/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/c/j;
    //   44: astore_1
    //   45: goto -29 -> 16
    //   48: invokestatic 92	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/d/b:aiA	()Landroid/bluetooth/BluetoothAdapter;
    //   51: astore_1
    //   52: aload_1
    //   53: ifnull +9 -> 62
    //   56: invokestatic 95	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/d/b:aiB	()Z
    //   59: ifne +21 -> 80
    //   62: ldc 75
    //   64: ldc 97
    //   66: iconst_0
    //   67: anewarray 4	java/lang/Object
    //   70: invokestatic 100	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/d/a:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   73: getstatic 103	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/c/j:fMy	Lcom/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/c/j;
    //   76: astore_1
    //   77: goto -61 -> 16
    //   80: aload_0
    //   81: getfield 39	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/scan/a:fMQ	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   84: iconst_0
    //   85: invokevirtual 178	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   88: aload_1
    //   89: aload_0
    //   90: getfield 195	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/scan/a:fMN	Lcom/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/scan/e;
    //   93: invokestatic 229	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/scan/b:a	(Landroid/bluetooth/BluetoothAdapter;Lcom/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/scan/e;)Z
    //   96: pop
    //   97: getstatic 86	com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/c/j:fMv	Lcom/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/c/j;
    //   100: astore_1
    //   101: goto -85 -> 16
    //   104: astore_1
    //   105: aload_0
    //   106: monitorexit
    //   107: aload_1
    //   108: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	this	a
    //   15	86	1	localObject1	Object
    //   104	4	1	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	16	104	finally
    //   20	45	104	finally
    //   48	52	104	finally
    //   56	62	104	finally
    //   62	77	104	finally
    //   80	101	104	finally
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/scan/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */