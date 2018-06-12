package com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c;

import android.bluetooth.BluetoothDevice;
import android.os.ParcelUuid;
import android.util.Base64;
import android.util.SparseArray;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.scan.ScanResultCompat;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.scan.f;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
{
  public int bMF;
  public String byN;
  private JSONObject fMp;
  public SparseArray<byte[]> fMq;
  public List<ParcelUuid> fMr;
  public String fMs;
  public Map<ParcelUuid, byte[]> fMt;
  public String name;
  
  public d(ScanResultCompat paramScanResultCompat)
  {
    this.name = bi.oV(paramScanResultCompat.getDevice().getName());
    this.byN = bi.oV(paramScanResultCompat.getDevice().getAddress());
    this.bMF = paramScanResultCompat.fNP;
    this.fMq = paramScanResultCompat.fNO.fNJ;
    this.fMr = paramScanResultCompat.fNO.fNI;
    this.fMs = bi.oV(paramScanResultCompat.fNO.fNv);
    this.fMt = paramScanResultCompat.fNO.fNK;
  }
  
  public d(String paramString1, String paramString2)
  {
    this.name = paramString1;
    this.byN = paramString2;
  }
  
  public final JSONObject ahS()
  {
    if (this.fMp == null)
    {
      this.fMp = new JSONObject();
      this.fMp.put("deviceId", this.byN);
      this.fMp.put("name", this.name);
      this.fMp.put("RSSI", this.bMF);
      Object localObject1 = new byte[0];
      Object localObject3 = new StringBuilder();
      Object localObject2 = localObject1;
      if (this.fMq != null)
      {
        localObject2 = localObject1;
        if (this.fMq.size() >= 0)
        {
          int k = 0;
          while (k < this.fMq.size())
          {
            int m = this.fMq.keyAt(0);
            int i = (byte)(m & 0xFF);
            int j = (byte)(m >> 8 & 0xFF);
            byte[] arrayOfByte = (byte[])this.fMq.valueAt(k);
            localObject2 = new byte[localObject1.length + 2 + arrayOfByte.length];
            System.arraycopy(localObject1, 0, localObject2, 0, localObject1.length);
            m = localObject1.length;
            System.arraycopy(new byte[] { i, j }, 0, localObject2, m, 2);
            System.arraycopy(arrayOfByte, 0, localObject2, localObject1.length + 2, arrayOfByte.length);
            k += 1;
            localObject1 = localObject2;
          }
          localObject2 = localObject1;
        }
      }
      ((StringBuilder)localObject3).append(new String(Base64.encode((byte[])localObject2, 2)));
      this.fMp.put("advertisData", localObject3);
      localObject1 = new JSONArray();
      if (this.fMr != null)
      {
        localObject2 = this.fMr.iterator();
        while (((Iterator)localObject2).hasNext()) {
          ((JSONArray)localObject1).put(((ParcelUuid)((Iterator)localObject2).next()).getUuid().toString().toUpperCase());
        }
      }
      this.fMp.put("advertisServiceUUIDs", localObject1);
      this.fMp.put("localName", this.fMs);
      localObject1 = new JSONObject();
      if ((this.fMt != null) && (this.fMt.size() > 0))
      {
        localObject2 = this.fMt.keySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (ParcelUuid)((Iterator)localObject2).next();
          ((JSONObject)localObject1).put(((ParcelUuid)localObject3).getUuid().toString().toUpperCase(), new String(Base64.encode((byte[])this.fMt.get(localObject3), 2)));
        }
      }
      this.fMp.put("serviceData", localObject1);
    }
    return this.fMp;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/ble/sdk/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */