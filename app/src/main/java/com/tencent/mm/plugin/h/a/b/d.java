package com.tencent.mm.plugin.h.a.b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.UUID;
import junit.framework.Assert;

@TargetApi(18)
public final class d
{
  private int aeo = -1;
  BluetoothDevice fNN;
  private BluetoothAdapter heY;
  Context hfX;
  BluetoothGatt hfY;
  b hfZ;
  BluetoothGattCharacteristic hga;
  BluetoothGattCharacteristic hgb;
  a hgc;
  Runnable hgd;
  Runnable hge;
  Runnable hgf;
  d hgg = this;
  final LinkedList<byte[]> hgh = new LinkedList();
  volatile boolean hgi = false;
  int hgj;
  final BluetoothGattCallback hgk = new d.1(this);
  public ag mHandler;
  long mSessionId;
  private HandlerThread mThread;
  
  @TargetApi(18)
  public d(long paramLong, Context paramContext, b paramb)
  {
    this.hfZ = paramb;
    this.hfX = paramContext;
    this.heY = ((BluetoothManager)this.hfX.getSystemService("bluetooth")).getAdapter();
    this.mSessionId = paramLong;
    this.hgj = 3;
    this.fNN = this.heY.getRemoteDevice(com.tencent.mm.plugin.h.a.e.a.bZ(paramLong));
    this.hga = null;
    this.hgb = null;
    this.hgc = new a();
    this.mThread = e.Xs("BluetoothLESession_handlerThread");
    this.mThread.start();
    this.mHandler = new a(this.mThread.getLooper(), this);
    this.hgd = new Runnable()
    {
      public final void run()
      {
        x.e("MicroMsg.exdevice.BluetoothLESession", "Write data timeout");
        if (d.this.hfZ != null) {
          d.this.hfZ.hfE.j(d.this.mSessionId, false);
        }
        d.this.atR();
      }
    };
    this.hge = new d.3(this);
    this.hgf = new d.4(this);
  }
  
  final void atQ()
  {
    this.hgi = false;
    this.hgh.clear();
  }
  
  final void atR()
  {
    if (this.hgh.isEmpty())
    {
      this.hgi = false;
      return;
    }
    byte[] arrayOfByte = (byte[])this.hgh.pop();
    this.hgc.setData(arrayOfByte);
    arrayOfByte = this.hgc.atL();
    x.d("MicroMsg.exdevice.BluetoothLESession", "Out data dump = %s", new Object[] { com.tencent.mm.plugin.exdevice.j.b.aq(arrayOfByte) });
    this.hgb.setValue(arrayOfByte);
    this.mHandler.postDelayed(this.hgd, 5000L);
    if (!this.hfY.writeCharacteristic(this.hgb)) {
      x.e("MicroMsg.exdevice.BluetoothLESession", "mBluetoothGatt.writeCharacteristic Failed!!!");
    }
    this.hgi = true;
  }
  
  public final void close()
  {
    x.i("MicroMsg.exdevice.BluetoothLESession", "------close------");
    if (!this.mHandler.sendMessage(this.mHandler.obtainMessage(2))) {
      x.e("MicroMsg.exdevice.BluetoothLESession", "SendMessage Failed!!! MessageWhat = %d", new Object[] { Integer.valueOf(2) });
    }
    this.mThread.quitSafely();
  }
  
  public final boolean connect()
  {
    x.i("MicroMsg.exdevice.BluetoothLESession", "------connect------");
    return this.mHandler.sendMessage(this.mHandler.obtainMessage(0));
  }
  
  private static final class a
    extends ag
  {
    private final WeakReference<d> hgm;
    
    public a(Looper paramLooper, d paramd)
    {
      super();
      this.hgm = new WeakReference(paramd);
    }
    
    public final void handleMessage(Message paramMessage)
    {
      boolean bool2 = true;
      int i = 1;
      d locald = (d)this.hgm.get();
      if (locald == null) {
        x.e("MicroMsg.exdevice.BluetoothLESession", "null == BluetoothLESession");
      }
      label182:
      label206:
      label487:
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          do
                          {
                            do
                            {
                              do
                              {
                                do
                                {
                                  return;
                                  switch (paramMessage.what)
                                  {
                                  default: 
                                    return;
                                  case 0: 
                                    x.i("MicroMsg.exdevice.BluetoothLESession", "------connectImp------");
                                    if (1 == locald.hgj)
                                    {
                                      x.w("MicroMsg.exdevice.BluetoothLESession", "Remote device is connected !!!");
                                      return;
                                    }
                                    if (locald.hgj == 0)
                                    {
                                      x.w("MicroMsg.exdevice.BluetoothLESession", "Remote device is connecting !!!");
                                      return;
                                    }
                                    locald.atQ();
                                    if (locald.hfY == null) {
                                      break label206;
                                    }
                                    if (locald.hfY.connect()) {
                                      break label182;
                                    }
                                    x.e("MicroMsg.exdevice.BluetoothLESession", "mBluetoothGatt.connect() Failed!!!");
                                  }
                                } while (locald.hfZ == null);
                                locald.hfZ.hfE.i(locald.mSessionId, false);
                                return;
                                locald.hgj = 0;
                                locald.mHandler.postDelayed(locald.hgf, 10000L);
                                return;
                                locald.hfY = locald.fNN.connectGatt(locald.hfX, false, locald.hgk);
                                if (locald.hfY != null) {
                                  break;
                                }
                                x.e("MicroMsg.exdevice.BluetoothLESession", "mDevice.connectGatt Failed!!!");
                              } while (locald.hfZ == null);
                              locald.hfZ.hfE.i(locald.mSessionId, false);
                              return;
                              locald.hgj = 0;
                              locald.mHandler.postDelayed(locald.hgf, 10000L);
                              return;
                              i = paramMessage.arg1;
                              if (i == 2) {}
                              for (paramMessage = "Connected";; paramMessage = "Disconnected")
                              {
                                x.i("MicroMsg.exdevice.BluetoothLESession", "------onConnectionStateChangeImp------ aState = %s", new Object[] { paramMessage });
                                if (i != 2) {
                                  break label487;
                                }
                                x.i("MicroMsg.exdevice.BluetoothLESession", "PHY Connected is OK, mConnectState = %d", new Object[] { Integer.valueOf(locald.hgj) });
                                if (3 != locald.hgj) {
                                  break;
                                }
                                x.w("MicroMsg.exdevice.BluetoothLESession", "Close or disconnect is Called, Leave without discover Services");
                                locald.mHandler.removeCallbacks(locald.hgf);
                                return;
                              }
                              if (1 == locald.hgj)
                              {
                                x.w("MicroMsg.exdevice.BluetoothLESession", "Connected is done, Leave without discover Services");
                                locald.mHandler.removeCallbacks(locald.hgf);
                                return;
                              }
                              if (locald.hfY.discoverServices()) {
                                break;
                              }
                              x.e("MicroMsg.exdevice.BluetoothLESession", "discover Services start failed!!!");
                              locald.hgj = 2;
                              locald.mHandler.removeCallbacks(locald.hgf);
                            } while (locald.hfZ == null);
                            locald.hfZ.hfE.i(locald.mSessionId, false);
                            return;
                            x.i("MicroMsg.exdevice.BluetoothLESession", "start discoverServices...");
                            return;
                          } while (i != 0);
                          x.w("MicroMsg.exdevice.BluetoothLESession", "Disconnected from GATT server.");
                          locald.hgj = 2;
                          locald.mHandler.removeCallbacks(locald.hgf);
                        } while (locald.hfZ == null);
                        locald.hfZ.hfE.i(locald.mSessionId, false);
                        return;
                        localObject = (BluetoothGatt)paramMessage.obj;
                        j = paramMessage.arg1;
                        x.i("MicroMsg.exdevice.BluetoothLESession", "onServicesDiscoveredImp, status = %d", new Object[] { Integer.valueOf(j) });
                        if (3 == locald.hgj)
                        {
                          x.w("MicroMsg.exdevice.BluetoothLESession", "Close or disconnect is Called, Just Leave");
                          locald.mHandler.removeCallbacks(locald.hgf);
                          return;
                        }
                        if (1 == locald.hgj)
                        {
                          x.w("MicroMsg.exdevice.BluetoothLESession", "Connected is done, Just Leave");
                          locald.mHandler.removeCallbacks(locald.hgf);
                          return;
                        }
                        if (j == 0) {
                          break;
                        }
                        x.e("MicroMsg.exdevice.BluetoothLESession", "Discover services error");
                        locald.hgj = 2;
                        locald.mHandler.removeCallbacks(locald.hgf);
                      } while (locald.hfZ == null);
                      locald.hfZ.hfE.i(locald.mSessionId, false);
                      return;
                      paramMessage = ((BluetoothGatt)localObject).getService(UUID.fromString(h.hgN));
                      if (paramMessage != null) {
                        break;
                      }
                      x.e("MicroMsg.exdevice.BluetoothLESession", "Can't not find service(with UUID 0xfee7)");
                      locald.hgj = 2;
                      locald.mHandler.removeCallbacks(locald.hgf);
                    } while (locald.hfZ == null);
                    locald.hfZ.hfE.i(locald.mSessionId, false);
                    return;
                    locald.hga = paramMessage.getCharacteristic(UUID.fromString(h.hgP));
                    if (locald.hga != null) {
                      break;
                    }
                    x.e("MicroMsg.exdevice.BluetoothLESession", "Can't not find characteristic(with UUID 0xfec8)");
                    locald.hgj = 2;
                    locald.mHandler.removeCallbacks(locald.hgf);
                  } while (locald.hfZ == null);
                  locald.hfZ.hfE.i(locald.mSessionId, false);
                  return;
                  locald.hgb = paramMessage.getCharacteristic(UUID.fromString(h.hgO));
                  if (locald.hgb != null) {
                    break;
                  }
                  x.e("MicroMsg.exdevice.BluetoothLESession", "Can't not find characteristic(with UUID 0xfec7)");
                  locald.hgj = 2;
                  locald.mHandler.removeCallbacks(locald.hgf);
                } while (locald.hfZ == null);
                locald.hfZ.hfE.i(locald.mSessionId, false);
                return;
                int j = locald.hga.getProperties();
                x.i("MicroMsg.exdevice.BluetoothLESession", "mRecvCharacteristic.getProperties = %d", new Object[] { Integer.valueOf(j) });
                if ((j & 0x20) != 0) {
                  break;
                }
                x.e("MicroMsg.exdevice.BluetoothLESession", "Read characteristic can not be indicated");
                locald.hgj = 2;
                locald.mHandler.removeCallbacks(locald.hgf);
              } while (locald.hfZ == null);
              locald.hfZ.hfE.i(locald.mSessionId, false);
              return;
              x.i("MicroMsg.exdevice.BluetoothLESession", "Set read characteristic indicator");
              paramMessage = locald.hgg;
              localObject = locald.hga;
              if (!paramMessage.hfY.setCharacteristicNotification((BluetoothGattCharacteristic)localObject, true))
              {
                x.e("MicroMsg.exdevice.BluetoothLESession", "Unable to set indicator for read characteristic");
                i = 0;
              }
              while (i == 0)
              {
                x.e("MicroMsg.exdevice.BluetoothLESession", "mSelfSession.setCharacteristicNotification Failed!!!");
                locald.hgj = 2;
                locald.mHandler.removeCallbacks(locald.hgf);
                if (locald.hfZ == null) {
                  break;
                }
                locald.hfZ.hfE.i(locald.mSessionId, false);
                return;
                localObject = ((BluetoothGattCharacteristic)localObject).getDescriptor(UUID.fromString(h.hgM));
                if (localObject == null)
                {
                  x.e("MicroMsg.exdevice.BluetoothLESession", "Can not get configure descriptor");
                  i = 0;
                }
                else
                {
                  x.i("MicroMsg.exdevice.BluetoothLESession", "Configure descriptor permissions: " + ((BluetoothGattDescriptor)localObject).getPermissions());
                  if (!((BluetoothGattDescriptor)localObject).setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE))
                  {
                    x.e("MicroMsg.exdevice.BluetoothLESession", "Can not set configure descriptor value");
                    i = 0;
                  }
                  else if (!paramMessage.hfY.writeDescriptor((BluetoothGattDescriptor)localObject))
                  {
                    x.e("MicroMsg.exdevice.BluetoothLESession", "Can not write configure descriptor value");
                    i = 0;
                  }
                  else
                  {
                    paramMessage.mHandler.postDelayed(paramMessage.hge, 5000L);
                  }
                }
              }
              localObject = paramMessage.obj;
              i = paramMessage.arg1;
              x.i("MicroMsg.exdevice.BluetoothLESession", "------onDescriptorWriteImp------ status = %d", new Object[] { Integer.valueOf(i) });
              locald.mHandler.removeCallbacks(locald.hge);
              locald.mHandler.removeCallbacks(locald.hgf);
              if (3 == locald.hgj)
              {
                x.w("MicroMsg.exdevice.BluetoothLESession", "Close or disconnect is Called, Just Leave");
                return;
              }
              if (1 == locald.hgj)
              {
                x.w("MicroMsg.exdevice.BluetoothLESession", "Connected is done, Just Leave");
                return;
              }
              if (i == 0) {
                break;
              }
              x.e("MicroMsg.exdevice.BluetoothLESession", "Write configure descriptor error");
              locald.hgj = 2;
            } while (locald.hfZ == null);
            locald.hfZ.hfE.i(locald.mSessionId, false);
            return;
            locald.hgj = 1;
            if (locald.hfZ != null) {
              locald.hfZ.hfE.i(locald.mSessionId, true);
            }
            x.i("MicroMsg.exdevice.BluetoothLESession", "------BLE connect successfully------ mConnectState = %d", new Object[] { Integer.valueOf(locald.hgj) });
            return;
            x.i("MicroMsg.exdevice.BluetoothLESession", "------disconnectImp------");
            if (3 == locald.hgj)
            {
              x.w("MicroMsg.exdevice.BluetoothLESession", "diconnect or close is called aready, just leave");
              return;
            }
            locald.atQ();
            if (locald.hfY == null)
            {
              x.e("MicroMsg.exdevice.BluetoothLESession", "disconnect:BluetoothGatt not found");
              return;
            }
            locald.hgj = 3;
            locald.mHandler.removeCallbacks(locald.hgf);
            locald.mHandler.removeCallbacks(locald.hge);
            locald.hfY.disconnect();
            return;
            paramMessage = (byte[])paramMessage.obj;
            x.i("MicroMsg.exdevice.BluetoothLESession", "------writeDataAsync------ length = %d", new Object[] { Integer.valueOf(paramMessage.length) });
            if (1 == locald.hgj) {
              break;
            }
            x.e("MicroMsg.exdevice.BluetoothLESession", "Not ready for write data, connectstate = %d", new Object[] { Integer.valueOf(locald.hgj) });
          } while (locald.hfZ == null);
          locald.hfZ.hfE.j(locald.mSessionId, false);
          return;
          if ((locald.hfY == null) || (locald.hgb == null)) {
            break;
          }
          bool1 = true;
          Assert.assertTrue(bool1);
          locald.hgh.add(paramMessage);
        } while (locald.hgi);
        if (1 == locald.hgh.size()) {}
        for (boolean bool1 = bool2;; bool1 = false)
        {
          Assert.assertTrue(bool1);
          locald.atR();
          return;
          bool1 = false;
          break;
        }
        i = paramMessage.arg1;
        x.i("MicroMsg.exdevice.BluetoothLESession", "------onDataWriteCallbackImp------ status = %d", new Object[] { Integer.valueOf(i) });
        locald.mHandler.removeCallbacks(locald.hgd);
        if (i != 0)
        {
          x.e("MicroMsg.exdevice.BluetoothLESession", "write data error: " + i);
          if (locald.hfZ != null) {
            locald.hfZ.hfE.j(locald.mSessionId, false);
          }
          locald.atR();
          return;
        }
        paramMessage = locald.hgc.atL();
        x.d("MicroMsg.exdevice.BluetoothLESession", "Out data dump = %s", new Object[] { com.tencent.mm.plugin.exdevice.j.b.aq(paramMessage) });
        if (paramMessage == null)
        {
          x.i("MicroMsg.exdevice.BluetoothLESession", "write data complete");
          if (locald.hfZ != null) {
            locald.hfZ.hfE.j(locald.mSessionId, true);
          }
          locald.atR();
          return;
        }
        x.i("MicroMsg.exdevice.BluetoothLESession", "write next chunk...");
        locald.hgb.setValue(paramMessage);
        locald.hfY.writeCharacteristic(locald.hgb);
        locald.mHandler.postDelayed(locald.hgd, 5000L);
        return;
        paramMessage = (byte[])paramMessage.obj;
        x.i("MicroMsg.exdevice.BluetoothLESession", "------onDataReceiveImp------");
        if (bi.bC(paramMessage))
        {
          x.e("MicroMsg.exdevice.BluetoothLESession", "Receive data is null or nil");
          return;
        }
        Object localObject = com.tencent.mm.plugin.exdevice.j.b.O(paramMessage, paramMessage.length);
        x.i("MicroMsg.exdevice.BluetoothLESession", "data length = %d", new Object[] { Integer.valueOf(paramMessage.length) });
        x.d("MicroMsg.exdevice.BluetoothLESession", "data dump = %s", new Object[] { localObject });
      } while (locald.hfZ == null);
      locald.hfZ.hfE.b(locald.mSessionId, paramMessage);
      return;
      x.i("MicroMsg.exdevice.BluetoothLESession", "------closeImp------");
      if (3 == locald.hgj)
      {
        x.w("MicroMsg.exdevice.BluetoothLESession", "Close aready, Just leave");
        return;
      }
      locald.atQ();
      if (locald.hfY == null)
      {
        x.w("MicroMsg.exdevice.BluetoothLESession", "close:BluetoothGatt not found");
        return;
      }
      locald.hgj = 3;
      locald.hfY.disconnect();
      locald.hfY.close();
      locald.hfY = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/h/a/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */