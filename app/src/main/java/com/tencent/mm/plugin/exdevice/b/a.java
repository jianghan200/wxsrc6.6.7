package com.tencent.mm.plugin.exdevice.b;

import android.os.Message;
import com.tencent.mm.plugin.exdevice.i.e;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.model.c;
import com.tencent.mm.plugin.exdevice.service.i.a;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends i.a
{
  private static a isx = null;
  
  public static a aGy()
  {
    if (isx == null)
    {
      a locala = new a();
      isx = locala;
      return locala;
    }
    return isx;
  }
  
  public final void a(int paramInt1, long paramLong, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null)
    {
      i = -1;
      x.i("MicroMsg.exdevice.DeviceRequestManager", "------onDeviceRequest------ errorCode = %d, deviceId = %d, seq = %d, cmdId = %d, datalength = %d", new Object[] { Integer.valueOf(paramInt1), Long.valueOf(paramLong), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(i) });
      if (paramInt1 != 0) {
        break label98;
      }
    }
    String str;
    label98:
    for (int i = 1;; i = 0)
    {
      com.tencent.mm.plugin.exdevice.g.a.l(paramLong, i);
      str = b.aq(paramArrayOfByte);
      if (str != null) {
        break label104;
      }
      x.e("MicroMsg.exdevice.DeviceRequestManager", "dataIn is null!!! Just leave without process data");
      return;
      i = paramArrayOfByte.length;
      break;
    }
    label104:
    x.d("MicroMsg.exdevice.DeviceRequestManager", "data dump = %s", new Object[] { str });
    new a(paramInt1, paramLong, paramInt2, paramInt3, paramArrayOfByte).aGz();
  }
  
  private static final class a
    implements Runnable
  {
    private long hjj = -1L;
    private int isA;
    private byte[] isB = null;
    private int isy = -1;
    private int isz = -1;
    
    public a(int paramInt1, long paramLong, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
    {
      this.hjj = paramLong;
      this.isy = paramInt2;
      this.isz = paramInt3;
      this.isB = paramArrayOfByte;
      this.isA = paramInt1;
    }
    
    public final void aGz()
    {
      if ((this.hjj == -1L) || (this.isy == -1) || (this.isz == -1))
      {
        x.e("MicroMsg.RequestProcessThread", "invalid arguments, do nothing");
        return;
      }
      switch (this.isz)
      {
      default: 
        x.e("MicroMsg.RequestProcessThread", "unknown cmdId = %d, do nothing", new Object[] { Integer.valueOf(this.isz) });
        return;
      case 10001: 
        localObject = new e(this.isA, this.hjj, this.isy, this.isz, this.isB);
        u.aHG().a((ae)localObject);
        return;
      case 10002: 
        localObject = k.aGF();
        int i = this.isA;
        f localf = new f(this.hjj, this.isy, this.isz, this.isB);
        ((k)localObject).mHandler.obtainMessage(1, i, 0, localf).sendToTarget();
        return;
      }
      Object localObject = new com.tencent.mm.plugin.exdevice.i.f(this.isA, this.hjj, this.isy, this.isz, this.isB);
      u.aHG().a((ae)localObject);
    }
    
    public final void run()
    {
      aGz();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/exdevice/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */