package com.tencent.mm.plugin.exdevice.jni;

import com.tencent.mm.plugin.exdevice.model.j;
import com.tencent.mm.plugin.exdevice.service.a;
import com.tencent.mm.plugin.exdevice.service.b;
import com.tencent.mm.sdk.platformtools.x;

public final class C2JavaExDevice
{
  private static final String TAG = "MicroMsg.exdevice.C2JavaExDevice";
  
  public static void C2Java_onStateChange(long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    a.b(paramLong, paramInt1, paramInt2, paramInt3);
  }
  
  public static void C2Java_onTaskEnd(long paramLong, int paramInt1, int paramInt2, String paramString, byte[] paramArrayOfByte)
  {
    a.c(paramLong, paramInt1, paramInt2, paramString);
  }
  
  public static boolean connect(long paramLong)
  {
    return b.connect(paramLong);
  }
  
  public static void createSession(long paramLong1, long paramLong2)
  {
    b.createSession(paramLong1, paramLong2);
  }
  
  public static void destroySession(long paramLong)
  {
    b.destroySession(paramLong);
  }
  
  public static void onAirKissCallback(int paramInt1, int paramInt2)
  {
    x.v("MicroMsg.exdevice.C2JavaExDevice", "onAirKissCallback(errType : %d, errCode : %d)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    j.aGV().f(0, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  public static void onDeviceRequest(long paramLong, short paramShort1, short paramShort2, byte[] paramArrayOfByte, int paramInt)
  {
    a.onDeviceRequest(paramLong, paramShort1, paramShort2, paramArrayOfByte, paramInt);
  }
  
  public static void onReceiveWCLanDeviceDiscPackage(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    for (int i = 0;; i = paramArrayOfByte.length)
    {
      x.i("MicroMsg.exdevice.C2JavaExDevice", "onReceiveWCLanDeviceDiscPackage, dataLen(%d).", new Object[] { Integer.valueOf(i) });
      j.aGV().f(10, new Object[] { paramArrayOfByte });
      return;
    }
  }
  
  public static void onReceiveWCLanDeviceProfile(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    for (int i = 0;; i = paramArrayOfByte.length)
    {
      x.i("MicroMsg.exdevice.C2JavaExDevice", "onReceiveWCLanDeviceProfile, data(%d).", new Object[] { Integer.valueOf(i) });
      j.aGV().f(14, new Object[] { paramArrayOfByte });
      return;
    }
  }
  
  public static void onWCLanDeviceConnectStateNotify(String paramString, int paramInt)
  {
    x.i("MicroMsg.exdevice.C2JavaExDevice", "onWCLanDeviceConnectStateNotify, devclassinfo(%s), stateCode(%d).", new Object[] { paramString, Integer.valueOf(paramInt) });
    j.aGV().f(13, new Object[] { paramString, Integer.valueOf(paramInt) });
  }
  
  public static void onWCLanDeviceUdpError(int paramInt)
  {
    x.i("MicroMsg.exdevice.C2JavaExDevice", "onWCLanDeviceUdpError, errCode(%d).", new Object[] { Integer.valueOf(paramInt) });
    j.aGV().f(11, new Object[] { Integer.valueOf(paramInt) });
  }
  
  public static void onWCLanFileTransferUpdate(int paramInt, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    for (int i = 0;; i = paramArrayOfByte.length)
    {
      x.i("MicroMsg.exdevice.C2JavaExDevice", "onWCLanFileTransferUpdate, cmdId(%d), data(%d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
      j.aGV().f(15, new Object[] { Integer.valueOf(paramInt), paramArrayOfByte });
      return;
    }
  }
  
  public static void onWCLanReceiveNotify(String paramString, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    for (int i = 0;; i = paramArrayOfByte.length)
    {
      x.i("MicroMsg.exdevice.C2JavaExDevice", "onWCLanReceiveNotify, devclassinfo(%s), data(%d).", new Object[] { paramString, Integer.valueOf(i) });
      j.aGV().f(16, new Object[] { paramString, paramArrayOfByte });
      return;
    }
  }
  
  public static void onWCLanReceiveResponse(int paramInt, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {}
    for (int i = 0;; i = paramArrayOfByte.length)
    {
      x.i("MicroMsg.exdevice.C2JavaExDevice", "onWCLanReceiveResponse, cmdId(%d), data(%d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
      j.aGV().f(12, new Object[] { Integer.valueOf(paramInt), paramArrayOfByte });
      return;
    }
  }
  
  public static boolean sendData(long paramLong, byte[] paramArrayOfByte)
  {
    return b.sendData(paramLong, paramArrayOfByte);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/exdevice/jni/C2JavaExDevice.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */