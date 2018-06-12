package com.tencent.mm.plugin.exdevice.service;

import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.mm.plugin.h.a.d.c;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import junit.framework.Assert;

public final class b
  implements c
{
  private static b iyt = null;
  private com.tencent.mm.plugin.h.a.d.b iyp = null;
  private final Vector<r> iyq = new Vector();
  private final HashMap<Long, Integer> iyr = new HashMap();
  private final HashMap<Long, Integer> iys = new HashMap();
  private CountDownLatch iyu;
  private ag mHandler = new ag(v.aHH().egm.lnJ.getLooper());
  
  public b()
  {
    long l1 = Thread.currentThread().getId();
    long l2 = Looper.getMainLooper().getThread().getId();
    x.i("MicroMsg.exdevice.BluetoothSDKAdapter", "now thread id : %d, main thread is : %d", new Object[] { Long.valueOf(l1), Long.valueOf(l2) });
    if ((Build.VERSION.SDK_INT == 14) || (Build.VERSION.SDK_INT == 15))
    {
      if (l1 == l2)
      {
        x.i("MicroMsg.exdevice.BluetoothSDKAdapter", "it is main thread now, init the bluetoothadapter directly");
        this.iyp = new com.tencent.mm.plugin.h.a.d.b(ad.getContext(), this, v.aHH().egm);
        return;
      }
      new ag(Looper.getMainLooper()).postAtFrontOfQueueV2(new b.1(this));
      this.iyu = new CountDownLatch(1);
    }
    try
    {
      this.iyu.await();
      x.i("MicroMsg.exdevice.BluetoothSDKAdapter", "now has init the sdk adapter");
      return;
      this.iyp = new com.tencent.mm.plugin.h.a.d.b(ad.getContext(), this, v.aHH().egm);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public static boolean a(int paramInt, r paramr, int... paramVarArgs)
  {
    boolean bool1;
    if (paramr == null)
    {
      x.e("MicroMsg.exdevice.BluetoothSDKAdapter", "Error parameter: null == aCallback");
      bool1 = false;
    }
    boolean bool2;
    do
    {
      return bool1;
      b localb = aHu();
      bool2 = localb.mHandler.post(new b.2(localb, paramInt, paramr, paramVarArgs));
      bool1 = bool2;
    } while (bool2);
    x.e("MicroMsg.exdevice.BluetoothSDKAdapter", "scan: instance.mHandler.post failed!!!");
    return bool2;
  }
  
  private static b aHu()
  {
    if (iyt != null) {
      return iyt;
    }
    b localb = new b();
    iyt = localb;
    return localb;
  }
  
  public static boolean connect(long paramLong)
  {
    x.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---connect--- aSessionId = %d", new Object[] { Long.valueOf(paramLong) });
    b localb = aHu();
    boolean bool = localb.mHandler.post(new b.6(localb, paramLong));
    if (!bool) {
      x.e("MicroMsg.exdevice.BluetoothSDKAdapter", "connect: instance.mHandler.post failed!!!");
    }
    return bool;
  }
  
  public static void createSession(long paramLong1, long paramLong2)
  {
    x.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---createSession--- aDeviceId = %d, aChannelId = %d", new Object[] { Long.valueOf(paramLong1), Long.valueOf(paramLong2) });
    b localb = aHu();
    if (!localb.mHandler.post(new b.4(localb, paramLong1, paramLong2))) {
      x.e("MicroMsg.exdevice.BluetoothSDKAdapter", "createSession: instance.mHandler.post failed!!!");
    }
  }
  
  public static void destroySession(long paramLong)
  {
    x.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---destroySession--- aSessionId = %d", new Object[] { Long.valueOf(paramLong) });
    b localb = aHu();
    if (!localb.mHandler.post(new b.7(localb, paramLong))) {
      x.e("MicroMsg.exdevice.BluetoothSDKAdapter", "destroySession: instance.mHandler.post failed!!!");
    }
  }
  
  public static boolean pb(int paramInt)
  {
    x.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---stopScan--- aBluetoothVersion = %d", new Object[] { Integer.valueOf(paramInt) });
    b localb = aHu();
    boolean bool = localb.mHandler.post(new b.3(localb, paramInt));
    if (!bool) {
      x.e("MicroMsg.exdevice.BluetoothSDKAdapter", "stopScan: instance.mHandler.post failed!!!");
    }
    return bool;
  }
  
  public static boolean sendData(long paramLong, byte[] paramArrayOfByte)
  {
    int i = 0;
    if (paramArrayOfByte == null) {}
    for (;;)
    {
      x.i("MicroMsg.exdevice.BluetoothSDKAdapter", "----sendData---- aSessionId = %d, datalength = %d", new Object[] { Long.valueOf(paramLong), Integer.valueOf(i) });
      Assert.assertNotNull(paramArrayOfByte);
      b localb = aHu();
      boolean bool = localb.mHandler.post(new b.5(localb, paramLong, paramArrayOfByte));
      if (!bool) {
        x.e("MicroMsg.exdevice.BluetoothSDKAdapter", "sendData: instance.mHandler.post failed!!!");
      }
      return bool;
      i = paramArrayOfByte.length;
    }
  }
  
  public final void a(String paramString1, String paramString2, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    int i;
    if (paramArrayOfByte == null)
    {
      i = -1;
      x.d("MicroMsg.exdevice.BluetoothSDKAdapter", "---onScanFound--- deviceMac = %s, deviceName = %s, BTversion = %d, rssi = %d, advertisment length = %d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(i) });
      if (!this.iyq.isEmpty()) {
        break label78;
      }
      x.w("MicroMsg.exdevice.BluetoothSDKAdapter", "mScanCallbackList is empty");
    }
    for (;;)
    {
      return;
      i = paramArrayOfByte.length;
      break;
      label78:
      Iterator localIterator = this.iyq.iterator();
      while (localIterator.hasNext()) {
        ((r)localIterator.next()).a(paramString1, paramString2, paramInt1, paramInt2, paramArrayOfByte);
      }
    }
  }
  
  public final void b(long paramLong1, long paramLong2, long paramLong3)
  {
    x.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onSessionCreate--- aSessionId = " + paramLong1 + " aDeviceID = " + paramLong2);
    Assert.assertTrue(this.iyr.containsKey(Long.valueOf(paramLong2)));
    if (!this.iys.containsKey(Long.valueOf(paramLong1))) {
      this.iys.put(Long.valueOf(paramLong1), this.iyr.get(Long.valueOf(paramLong2)));
    }
    Java2CExDevice.onBluetoothSessionCreated(paramLong2, paramLong3, paramLong1);
  }
  
  public final void b(long paramLong, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onRecv--- sessionId = " + paramLong);
    Java2CExDevice.onBluetoothRecvData(paramLong, paramArrayOfByte);
  }
  
  public final void bY(long paramLong)
  {
    Java2CExDevice.onBluetoothError(paramLong, 0);
  }
  
  public final void i(long paramLong, boolean paramBoolean)
  {
    x.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onConnected--- sessionId = " + paramLong + "Connected = " + paramBoolean);
    if (paramBoolean)
    {
      Java2CExDevice.onBluetoothConnected(paramLong);
      return;
    }
    Java2CExDevice.onBluetoothDisconnected(paramLong);
  }
  
  public final void j(long paramLong, boolean paramBoolean)
  {
    x.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onSend--- sessionId = " + paramLong + "success = " + paramBoolean);
    if (paramBoolean)
    {
      Java2CExDevice.onBluetoothSendDataCompleted(paramLong);
      return;
    }
    Java2CExDevice.onBluetoothError(paramLong, 0);
  }
  
  public final void na(int paramInt)
  {
    x.i("MicroMsg.exdevice.BluetoothSDKAdapter", "---onScanFinished--- aBluetoothVersion =%d", new Object[] { Integer.valueOf(paramInt) });
    if (this.iyq.isEmpty())
    {
      x.w("MicroMsg.exdevice.BluetoothSDKAdapter", "mScanCallbackList is empty");
      return;
    }
    Iterator localIterator = this.iyq.iterator();
    while (localIterator.hasNext())
    {
      r localr = (r)localIterator.next();
      if (localr != null) {
        localr.na(paramInt);
      }
    }
    this.iyq.clear();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/exdevice/service/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */