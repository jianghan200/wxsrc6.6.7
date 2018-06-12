package com.tencent.mm.plugin.exdevice.model;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.plugin.exdevice.service.j.a;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.protocal.c.alx;
import com.tencent.mm.protocal.c.gj;
import com.tencent.mm.protocal.c.gk;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class aa
  extends j.a
  implements e
{
  static Object dMd = new Object();
  private static final byte[] ivK = { -2, 1, 1 };
  private static aa ivL;
  static LinkedList<String> ivP = new LinkedList();
  private static HashMap<String, gk> ivQ = new HashMap(32);
  final al eVk = new al(new al.a()
  {
    public final boolean vD()
    {
      x.i("MicroMsg.exdevice.ScanDeviceLogic", "Restart scanning...");
      ad.aHl().a(0, aa.this);
      return true;
    }
  }, true);
  boolean iuY = false;
  volatile String ius;
  a ivM;
  HashMap<String, byte[]> ivN = new HashMap();
  LinkedList<l> ivO = new LinkedList();
  
  private void a(gk paramgk)
  {
    if (paramgk == null)
    {
      x.e("MicroMsg.exdevice.ScanDeviceLogic", "item null..");
      return;
    }
    if (bi.oW(paramgk.rgL))
    {
      x.e("MicroMsg.exdevice.ScanDeviceLogic", "invalid mac(null or nil)");
      return;
    }
    if (paramgk.rfn != 0)
    {
      x.e("MicroMsg.exdevice.ScanDeviceLogic", "device(%s) is invalid", new Object[] { paramgk.rgL });
      return;
    }
    if ((paramgk.rgS == null) || (bi.oW(paramgk.rgS.hbO)))
    {
      x.e("MicroMsg.exdevice.ScanDeviceLogic", "invalid device id(mac=%s)", new Object[] { paramgk.rgL });
      return;
    }
    if ((bi.oW(paramgk.rgS.reT)) || (!paramgk.rgS.reT.equals(this.ius)))
    {
      x.e("MicroMsg.exdevice.ScanDeviceLogic", "device type (%s) is not equal to brand name (%s)", new Object[] { paramgk.hbP, this.ius });
      return;
    }
    byte[] arrayOfByte = (byte[])this.ivN.get(paramgk.rgL);
    String str1 = paramgk.rgL;
    String str2 = paramgk.rgS.reT;
    String str3 = paramgk.rgS.hbO;
    String str4 = paramgk.hbP;
    int i;
    if (arrayOfByte == null)
    {
      i = 0;
      x.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, BatchSearch find mac=%s, deviceType=%s, deviceId=%s, %s, %s", new Object[] { str1, str2, str3, str4, Integer.valueOf(i) });
      if (this.ivM == null) {
        break label281;
      }
      if (arrayOfByte == null) {
        break label289;
      }
    }
    label281:
    label289:
    for (arrayOfByte = ap(arrayOfByte);; arrayOfByte = null)
    {
      this.ivM.a(paramgk.rgS.hbO, arrayOfByte, false);
      return;
      i = arrayOfByte.length;
      break;
      x.e("MicroMsg.exdevice.ScanDeviceLogic", "mCallback null");
      return;
    }
  }
  
  public static aa aHb()
  {
    if (ivL != null) {
      return ivL;
    }
    aa localaa = new aa();
    ivL = localaa;
    return localaa;
  }
  
  private static byte[] ap(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte1 = null;
    int i = 0;
    int j = 0;
    byte[] arrayOfByte2 = arrayOfByte1;
    for (;;)
    {
      int k;
      try
      {
        if (i < paramArrayOfByte.length - 2)
        {
          int m = i + 1;
          k = paramArrayOfByte[i];
          arrayOfByte2 = arrayOfByte1;
          if (k != 0)
          {
            i = m + 1;
            switch (paramArrayOfByte[m])
            {
            case -1: 
              x.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, Manufacturer Specific Data size = %s", new Object[] { Integer.valueOf(k) });
              arrayOfByte1 = new byte[k - 1];
              if (k > 1)
              {
                if ((j >= 32) || (j >= arrayOfByte1.length)) {
                  break label198;
                }
                m = j + 1;
                int n = i + 1;
                arrayOfByte1[j] = paramArrayOfByte[i];
                i = n;
                j = m;
                break label210;
              }
              x.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, Manufacturer Specific Data %s" + b.aq(arrayOfByte1));
            }
          }
        }
      }
      catch (Exception paramArrayOfByte)
      {
        x.printErrStackTrace("MicroMsg.exdevice.ScanDeviceLogic", paramArrayOfByte, "", new Object[0]);
        x.e("MicroMsg.exdevice.ScanDeviceLogic", "EX in parseBroadcastPacket %s", new Object[] { paramArrayOfByte.getMessage() });
        arrayOfByte2 = null;
      }
      return arrayOfByte2;
      label198:
      break label210;
      i += k - 1;
      break;
      label210:
      k -= 1;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String arg3, l paraml)
  {
    Object localObject;
    if (paraml == null)
    {
      localObject = "";
      x.i("MicroMsg.exdevice.ScanDeviceLogic", "onSceneEnd, %s, errType=%d, errCode=%d, errMsg=%s", new Object[] { localObject, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), ??? });
      this.ivO.remove(paraml);
      if ((paramInt1 == 0) && (paramInt2 == 0) && (paraml != null)) {
        break label87;
      }
      x.e("MicroMsg.exdevice.ScanDeviceLogic", "do scene failed!!!");
    }
    label87:
    while (542 != paraml.getType())
    {
      return;
      localObject = Integer.valueOf(paraml.getType());
      break;
    }
    paraml = ((k)paraml).aGW().rgP.iterator();
    for (;;)
    {
      if (paraml.hasNext())
      {
        localObject = (gk)paraml.next();
        if (!bi.oW(((gk)localObject).rgL)) {
          break label157;
        }
        x.e("MicroMsg.exdevice.ScanDeviceLogic", "invalid mac(null or nil)");
        continue;
      }
      break;
      label157:
      String str = this.ius + "_" + ((gk)localObject).rgL;
      synchronized (dMd)
      {
        if (ivP.contains(str)) {
          ivP.remove(str);
        }
        if (!ivQ.containsKey(str))
        {
          x.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, put into cache, %s", new Object[] { str });
          ivQ.put(str, localObject);
        }
        a((gk)localObject);
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString1, String paramString2, String arg5, int paramInt3, byte[] paramArrayOfByte)
  {
    if (this.ivN.containsKey(paramString2)) {
      return;
    }
    if (paramString2 == null)
    {
      x.w("MicroMsg.exdevice.ScanDeviceLogic", "deviceMac is null");
      return;
    }
    paramString1 = paramString2.replaceAll(":", "");
    ??? = ivK;
    if ((bi.bC(paramArrayOfByte)) || (bi.bC(???)) || (???.length > paramArrayOfByte.length))
    {
      paramInt1 = -1;
      if (paramInt1 == -1) {
        break label261;
      }
      if (paramInt1 + 9 > paramArrayOfByte.length) {
        break label248;
      }
      ??? = new byte[paramInt1 + 9];
      System.arraycopy(paramArrayOfByte, 0, ???, 0, ???.length);
      x.i("MicroMsg.exdevice.ScanDeviceLogic", "hakon, scanFound mac:%s, realAd:%s", new Object[] { paramString1, b.aq(???) });
      this.ivN.put(paramString1, ???);
    }
    for (;;)
    {
      paramString1 = this.ius + "_" + paramString2;
      if (ivQ.containsKey(paramString1)) {
        break label351;
      }
      synchronized (dMd)
      {
        if (!ivP.contains(paramString1)) {
          break label274;
        }
        x.d("MicroMsg.exdevice.ScanDeviceLogic", "hakon, already doing");
        return;
      }
      paramInt2 = 0;
      for (;;)
      {
        if (paramInt2 >= paramArrayOfByte.length) {
          break label243;
        }
        paramInt1 = paramInt2;
        if (b.a(paramArrayOfByte, paramInt2, ???)) {
          break;
        }
        paramInt2 += 1;
      }
      label243:
      paramInt1 = -1;
      break;
      label248:
      this.ivN.put(paramString1, null);
      continue;
      label261:
      this.ivN.put(paramString1, null);
    }
    label274:
    ivP.add(paramString1);
    ??? = this.ius;
    paramString2 = new k(new String[] { paramString2 }, ???);
    if (au.DF().a(paramString2, 0))
    {
      this.ivO.add(paramString2);
      return;
    }
    ivP.remove(paramString1);
    x.e("MicroMsg.exdevice.ScanDeviceLogic", "MMCore.getNetSceneQueue().doScene failed!!!");
    return;
    label351:
    x.d("MicroMsg.exdevice.ScanDeviceLogic", "hakon, hit cache %s, %s", new Object[] { this.ius, paramString2 });
    a((gk)ivQ.get(paramString1));
  }
  
  public final void pa(int paramInt)
  {
    x.i("MicroMsg.exdevice.ScanDeviceLogic", "stopScanDevice %s, stopTimer", new Object[] { Integer.valueOf(paramInt) });
    this.eVk.SO();
    if (this.iuY)
    {
      ??? = ad.aHl();
      x.i("MicroMsg.exdevice.ExdeviceConnectManager", "stopScanLogic, bluetooth version = %d", new Object[] { Integer.valueOf(paramInt) });
      if (this == null) {
        x.e("MicroMsg.exdevice.ExdeviceConnectManager", "null == aCallback");
      }
      for (;;)
      {
        this.iuY = false;
        this.ius = null;
        this.ivN.clear();
        au.DF().b(542, this);
        ??? = this.ivO.iterator();
        while (((Iterator)???).hasNext())
        {
          l locall = (l)((Iterator)???).next();
          if (locall != null) {
            au.DF().c(locall);
          }
        }
        if (((d)???).itd == null) {
          x.i("MicroMsg.exdevice.ExdeviceConnectManager", "exdevice process is dead, just leave");
        } else if (u.aHG().isY == null) {
          x.e("MicroMsg.exdevice.ExdeviceConnectManager", "dispatcher is null.");
        } else if (!u.aHG().isY.c(paramInt, ((d)???).itj)) {
          x.e("MicroMsg.exdevice.ExdeviceConnectManager", "stopScan failed!!!");
        }
      }
      this.ivO.clear();
      if (this.ivM != null) {
        this.ivM.a(null, null, true);
      }
      this.ivM = null;
    }
    synchronized (dMd)
    {
      ivP.clear();
      return;
      x.i("MicroMsg.exdevice.ScanDeviceLogic", "stopScanDevice has been stoped");
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(String paramString, byte[] paramArrayOfByte, boolean paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/exdevice/model/aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */