package com.tencent.mm.plugin.exdevice.service;

import com.tencent.mm.g.a.dm;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.plugin.exdevice.model.d;
import com.tencent.mm.plugin.exdevice.model.d.4;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends q.a
{
  private static e iyH = new e();
  
  public static e aHw()
  {
    return iyH;
  }
  
  public final void a(double paramDouble1, int paramInt1, int paramInt2, byte[] paramArrayOfByte, double paramDouble2, int paramInt3, String paramString)
  {
    x.d("MicroMsg.exdevice.ExdeviceIBeaconManager", "onRangdingCallback, distance = %f, major = %d, minor = %d, uuid = %s, rssi = %f,aMac = %s,txPower = %d", new Object[] { Double.valueOf(paramDouble1), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), b.aq(paramArrayOfByte), Double.valueOf(paramDouble2), paramString, Integer.valueOf(paramInt3) });
    dm localdm = new dm();
    String str = b.aq(paramArrayOfByte);
    paramArrayOfByte = str;
    if (str.length() >= 32) {
      paramArrayOfByte = str.substring(0, 8) + "-" + str.substring(8, 12) + "-" + str.substring(12, 16) + "-" + str.substring(16, 20) + "-" + str.substring(20);
    }
    localdm.bLn.bLl = paramArrayOfByte;
    localdm.bLn.bLq = paramDouble1;
    localdm.bLn.bLo = paramInt1;
    localdm.bLn.bLp = paramInt2;
    localdm.bLn.bLr = paramDouble2;
    localdm.bLn.bLs = paramString;
    localdm.bLn.bLt = paramInt3;
    a.sFg.m(localdm);
  }
  
  public final boolean an(String paramString, boolean paramBoolean)
  {
    x.i("MicroMsg.exdevice.ExdeviceIBeaconManager", "ranging, uuid = %s, op = %s", new Object[] { paramString, String.valueOf(paramBoolean) });
    if (paramString == null)
    {
      x.e("MicroMsg.exdevice.ExdeviceIBeaconManager", "uuid is null");
      return false;
    }
    if (u.aHG().isY == null)
    {
      x.e("MicroMsg.exdevice.ExdeviceIBeaconManager", "MMExDeviceCore.getTaskQueue().getDispatcher() is null !!!now retry invoke doTaskAfterServiceStarted!");
      d locald = com.tencent.mm.plugin.exdevice.model.ad.aHl();
      paramString = new e.1(this, paramString, paramBoolean);
      x.d("MicroMsg.exdevice.ExdeviceConnectManager", "doTaskAfterServiceStarted");
      if (locald.itd == null)
      {
        locald.itd = new c();
        locald.itd.iyE = new d.4(locald, paramString);
        locald.itd.dd(com.tencent.mm.sdk.platformtools.ad.getContext());
        return false;
      }
      locald.itd.x(paramString);
      return false;
    }
    return u.aHG().isY.a(paramString, paramBoolean, this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/exdevice/service/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */