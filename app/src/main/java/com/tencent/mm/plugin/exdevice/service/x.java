package com.tencent.mm.plugin.exdevice.service;

import android.os.RemoteException;

public final class x
  implements m
{
  private h iyT;
  
  public x(h paramh)
  {
    this.iyT = paramh;
  }
  
  public final long a(p paramp)
  {
    try
    {
      long l = this.iyT.a(paramp);
      return l;
    }
    catch (RemoteException paramp)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "startTask failed!!! %s", new Object[] { paramp.getMessage() });
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramp, "", new Object[0]);
    }
    return -1L;
  }
  
  public final boolean a(long paramLong, int paramInt, k paramk)
  {
    u.aHF().cQ(paramLong);
    try
    {
      boolean bool = this.iyT.a(paramLong, paramInt, paramk);
      return bool;
    }
    catch (RemoteException paramk)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "startChannel failed!!! %s", new Object[] { paramk.getMessage() });
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramk, "", new Object[0]);
    }
    return false;
  }
  
  public final boolean a(long paramLong, k paramk)
  {
    try
    {
      boolean bool = this.iyT.b(paramLong, 0, paramk);
      return bool;
    }
    catch (RemoteException paramk)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramk, "", new Object[0]);
    }
    return false;
  }
  
  public final boolean a(i parami)
  {
    try
    {
      boolean bool = this.iyT.a(parami);
      return bool;
    }
    catch (RemoteException parami)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "registOnDeviceRequest failed!!! %s", new Object[] { parami.getMessage() });
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", parami, "", new Object[0]);
    }
    return false;
  }
  
  public final boolean a(j paramj)
  {
    try
    {
      boolean bool = this.iyT.d(0, paramj);
      return bool;
    }
    catch (RemoteException paramj)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramj, "", new Object[0]);
    }
    return false;
  }
  
  public final boolean a(s params)
  {
    try
    {
      boolean bool = this.iyT.a(params);
      return bool;
    }
    catch (RemoteException params)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", params, "", new Object[0]);
    }
    return false;
  }
  
  public final boolean a(String paramString, boolean paramBoolean, q paramq)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.exdevice.RDeviceTaskDispatcher", "ranging, uuid = %s, op = %s", new Object[] { paramString, String.valueOf(paramBoolean) });
    try
    {
      paramBoolean = this.iyT.a(paramString, paramBoolean, paramq);
      return paramBoolean;
    }
    catch (RemoteException paramString)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "mDispatcher.ranging failed!!!(%s)", new Object[] { paramString.getMessage() });
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramString, "", new Object[0]);
    }
    return false;
  }
  
  public final long[] aHt()
  {
    try
    {
      long[] arrayOfLong = this.iyT.aHt();
      return arrayOfLong;
    }
    catch (RemoteException localRemoteException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "getDeviceList failed!!! %s", new Object[] { localRemoteException.getMessage() });
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", localRemoteException, "", new Object[0]);
    }
    return null;
  }
  
  public final boolean b(int paramInt, j paramj)
  {
    try
    {
      boolean bool = this.iyT.b(paramInt, paramj);
      return bool;
    }
    catch (RemoteException paramj)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "scan failed!!! %s", new Object[] { paramj.getMessage() });
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramj, "", new Object[0]);
    }
    return false;
  }
  
  public final boolean b(long paramLong, byte[] paramArrayOfByte, t paramt)
  {
    try
    {
      boolean bool = this.iyT.b(paramLong, paramArrayOfByte, paramt);
      return bool;
    }
    catch (RemoteException paramArrayOfByte)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramArrayOfByte, "", new Object[0]);
    }
    return false;
  }
  
  public final boolean b(j paramj)
  {
    try
    {
      boolean bool = this.iyT.e(0, paramj);
      return bool;
    }
    catch (RemoteException paramj)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramj, "", new Object[0]);
    }
    return false;
  }
  
  public final boolean b(n paramn)
  {
    try
    {
      this.iyT.a(paramn);
      return true;
    }
    catch (RemoteException paramn)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "mDispatcher.registExDeviceInvokerHandler failed!!, %s", new Object[] { paramn.getMessage() });
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramn, "", new Object[0]);
    }
    return false;
  }
  
  public final boolean c(int paramInt, j paramj)
  {
    try
    {
      boolean bool = this.iyT.c(paramInt, paramj);
      return bool;
    }
    catch (RemoteException paramj)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "stopScan failed!!! %s", new Object[] { paramj.getMessage() });
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramj, "", new Object[0]);
    }
    return false;
  }
  
  public final boolean cT(long paramLong)
  {
    u.aHF().cQ(paramLong);
    try
    {
      boolean bool = this.iyT.cT(paramLong);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.exdevice.RDeviceTaskDispatcher", "stopChannel failed!!! %s", new Object[] { localRemoteException.getMessage() });
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", localRemoteException, "", new Object[0]);
    }
    return false;
  }
  
  public final boolean cW(long paramLong)
  {
    try
    {
      boolean bool = this.iyT.cW(paramLong);
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", localRemoteException, "", new Object[0]);
    }
    return false;
  }
  
  public final void setChannelSessionKey(long paramLong, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.exdevice.RDeviceTaskDispatcher", "------setChannelSessionKey------ deviceId = %d", new Object[] { Long.valueOf(paramLong) });
    try
    {
      this.iyT.setChannelSessionKey(paramLong, paramArrayOfByte);
      return;
    }
    catch (RemoteException paramArrayOfByte)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.exdevice.RDeviceTaskDispatcher", paramArrayOfByte, "", new Object[0]);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/exdevice/service/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */