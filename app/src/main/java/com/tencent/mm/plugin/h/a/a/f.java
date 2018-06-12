package com.tencent.mm.plugin.h.a.a;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothAdapter.LeScanCallback;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.HandlerThread;
import com.tencent.mm.plugin.exdevice.service.r;
import com.tencent.mm.plugin.exdevice.service.v;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@TargetApi(18)
public final class f
  implements BluetoothAdapter.LeScanCallback, r, b
{
  private static boolean heV = false;
  public static boolean heX = false;
  private final b heQ;
  private final d heT;
  private final HashSet<UUID> heU;
  private boolean heW = false;
  private BluetoothAdapter heY;
  private boolean heZ = true;
  private int hfa = 0;
  private String hfb = "";
  private e hfc = null;
  private Map<String, Long> hfd = new ConcurrentHashMap();
  private final al hfe = new al(v.aHH().egm.lnJ.getLooper(), new f.1(this), true);
  private final al hff = new al(v.aHH().egm.lnJ.getLooper(), new f.2(this), true);
  private final al hfg = new al(v.aHH().egm.lnJ.getLooper(), new f.3(this), true);
  private final al hfh = new al(v.aHH().egm.lnJ.getLooper(), new f.4(this), true);
  private final al hfi = new al(v.aHH().egm.lnJ.getLooper(), new f.5(this), true);
  public final ag mHandler;
  
  public f(b paramb)
  {
    if (paramb == null) {
      throw new NullPointerException("aCallback is null");
    }
    this.heU = new HashSet();
    this.heT = new d(this);
    this.heQ = paramb;
    this.mHandler = new ag(v.aHH().egm.lnJ.getLooper());
    this.heY = ((BluetoothManager)ad.getContext().getSystemService("bluetooth")).getAdapter();
  }
  
  private void atI()
  {
    this.hfd.clear();
    heV = false;
    if (!this.hfh.ciq()) {
      this.hfh.SO();
    }
    if (!this.hfg.ciq()) {
      this.hfg.SO();
    }
    if (!this.hff.ciq()) {
      this.hff.SO();
    }
    if (!this.hfe.ciq()) {
      this.hfe.SO();
    }
    if (!this.hfi.ciq()) {
      this.hfi.SO();
    }
    if ((this.heW) && (this.heY != null))
    {
      this.heY.stopLeScan(this);
      this.heW = false;
    }
  }
  
  private void atJ()
  {
    for (;;)
    {
      try
      {
        if (this.hfh.ciq()) {
          this.hfh.J(2000L, 2000L);
        }
        if ((heX) && (this.hfg.ciq())) {
          this.hfg.J(10000L, 10000L);
        }
        if (this.hfi.ciq())
        {
          if (!heX) {
            this.hfi.J(120000L, 120000L);
          }
        }
        else
        {
          if (heV) {
            break label267;
          }
          this.heZ = true;
          Object localObject1 = Boolean.valueOf(this.heY.startLeScan(this));
          if ((((Boolean)localObject1).booleanValue()) || (heV)) {
            break;
          }
          int i = 0;
          if ((((Boolean)localObject1).booleanValue()) || (i >= 3) || (heV)) {
            break label267;
          }
          int j = i + 1;
          this.heY.stopLeScan(this);
          x.e("MicroMsg.exdevice.IBeaconServer", "start IBEACON BLE scan failed,retry no " + j + " time");
          Boolean localBoolean = Boolean.valueOf(this.heY.startLeScan(this));
          i = j;
          localObject1 = localBoolean;
          if (!localBoolean.booleanValue()) {
            continue;
          }
          heV = true;
          this.heW = true;
          x.i("MicroMsg.exdevice.IBeaconServer", "[shakezb]start ibeacon range successful");
          i = j;
          localObject1 = localBoolean;
          continue;
        }
        this.hfi.J(1800000L, 1800000L);
      }
      finally {}
    }
    this.heW = true;
    heV = true;
    x.i("MicroMsg.exdevice.IBeaconServer", "[shakezb]start ibeacon range successful");
    label267:
  }
  
  public final void a(double paramDouble, c paramc)
  {
    x.d("MicroMsg.exdevice.IBeaconServer", "[shakezb]onRangingCallback, distance = %f", new Object[] { Double.valueOf(paramDouble) });
    String str2 = com.tencent.mm.plugin.exdevice.j.b.aq(paramc.heO.heS.hft);
    String str1 = str2;
    if (str2.length() >= 32) {
      str1 = str2.substring(0, 8) + "-" + str2.substring(8, 12) + "-" + str2.substring(12, 16) + "-" + str2.substring(16, 20) + "-" + str2.substring(20);
    }
    str2 = str1 + paramc.heO.heS.hfu + paramc.heO.heS.hfv;
    if (!this.hfd.containsKey(str2))
    {
      this.hfd.put(str2, Long.valueOf(System.currentTimeMillis()));
      this.heQ.a(paramDouble, paramc);
      int i = paramc.heO.heS.hfv;
      x.i("MicroMsg.exdevice.IBeaconServer", "[shakezb]onRangingCallback,uuid = " + str1 + ",major = " + paramc.heO.heS.hfu + ",minor = " + (i & 0xFFFF));
    }
    long l1;
    long l2;
    do
    {
      return;
      l1 = ((Long)this.hfd.get(str2)).longValue();
      l2 = System.currentTimeMillis();
    } while (l2 - l1 <= 500L);
    this.hfd.put(str2, Long.valueOf(l2));
    this.heQ.a(paramDouble, paramc);
  }
  
  public final void a(String paramString1, String paramString2, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.exdevice.IBeaconServer", "onScanFound, device mac = %s, device name = %s, bluetooth version = %d, rssi = %d, advertisment = %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), com.tencent.mm.plugin.exdevice.j.b.aq(paramArrayOfByte) });
    if (paramInt1 != 0) {
      return;
    }
    paramString2 = new e();
    if (!paramString2.ab(paramArrayOfByte))
    {
      x.d("MicroMsg.exdevice.IBeaconServer", "protocal.ParseFromByte Failed!!!");
      return;
    }
    paramArrayOfByte = com.tencent.mm.plugin.exdevice.j.b.as(paramString2.heS.hft);
    if (paramArrayOfByte == null)
    {
      x.e("MicroMsg.exdevice.IBeaconServer", "parse UUID from byte array failed!!!");
      return;
    }
    if (!this.heU.contains(paramArrayOfByte))
    {
      x.d("MicroMsg.exdevice.IBeaconServer", "this IBeacon UUID is not in the set");
      return;
    }
    if (this.heZ) {
      this.hfb = paramString1;
    }
    this.mHandler.post(new f.8(this, paramInt2, paramString1, paramString2));
  }
  
  public final void na(int paramInt)
  {
    if (paramInt != 0) {
      return;
    }
    atI();
  }
  
  public final void onLeScan(BluetoothDevice paramBluetoothDevice, int paramInt, byte[] paramArrayOfByte)
  {
    e locale = new e();
    if (!locale.ab(paramArrayOfByte))
    {
      x.d("MicroMsg.exdevice.IBeaconServer", "protocal.ParseFromByte Failed!!!");
      return;
    }
    paramArrayOfByte = com.tencent.mm.plugin.exdevice.j.b.as(locale.heS.hft);
    if (paramArrayOfByte == null)
    {
      x.e("MicroMsg.exdevice.IBeaconServer", "parse UUID from byte array failed!!!");
      return;
    }
    if (!this.heU.contains(paramArrayOfByte))
    {
      x.d("MicroMsg.exdevice.IBeaconServer", "this IBeacon UUID is not in the set");
      return;
    }
    if (this.heZ)
    {
      this.hfa = paramInt;
      this.hfc = locale;
      if (this.hfe.ciq()) {
        this.hfe.J(2000L, 2000L);
      }
      this.heZ = false;
    }
    this.mHandler.post(new f.9(this, paramInt, paramBluetoothDevice, locale));
  }
  
  public final void wT(String paramString)
  {
    x.e("MicroMsg.exdevice.IBeaconServer", "------onScanError------ error code = %s, error msg = %s", new Object[] { Integer.valueOf(-1), paramString });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/h/a/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */