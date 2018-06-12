package com.tencent.mm.plugin.exdevice.i;

import com.tencent.mm.a.g;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.c.bw;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.model.r;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends ae
  implements com.tencent.mm.ab.e
{
  private m isY;
  private d izx;
  private com.tencent.mm.plugin.exdevice.b.b izy = null;
  private a izz;
  private int mErrorCode;
  
  public e(int paramInt1, long paramLong, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    this.izy = new com.tencent.mm.plugin.exdevice.b.b(paramLong, paramInt2, paramInt3, paramArrayOfByte);
    this.mErrorCode = paramInt1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    au.DF().b(541, this);
    x.i("MicroMsg.exdevice.MMAuthTaskExcuter", "onscen end, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    paraml = (r)paraml;
    com.tencent.mm.plugin.exdevice.h.b localb = ad.aHe().Ak(this.izy.hjj);
    if (localb == null)
    {
      x.e("MicroMsg.exdevice.MMAuthTaskExcuter", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceId Failed!!!");
      return;
    }
    long l = localb.cCO;
    if (System.currentTimeMillis() / 1000L < l)
    {
      x.e("MicroMsg.exdevice.MMAuthTaskExcuter", "device has been blocked");
      this.izy.b(-5, "", new byte[0]);
      this.izz = new a(this.izy, this.izx);
      x.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(this.izz.b(this.isY)) });
      return;
    }
    this.izy.b(paramInt2, paramString, paraml.aGY());
    this.izz = new a(this.izy, this.izx);
    x.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(this.izz.b(this.isY)) });
  }
  
  public final boolean a(m paramm, d paramd)
  {
    boolean bool;
    if ((-5 == this.mErrorCode) || (-3 == this.mErrorCode) || (-4 == this.mErrorCode))
    {
      x.e("MicroMsg.exdevice.MMAuthTaskExcuter", "Error Code = %d, reply errorcode to device and close channel", new Object[] { Integer.valueOf(this.mErrorCode) });
      this.izy.b(-1, "", new byte[0]);
      this.izz = new a(this.izy, paramd);
      bool = this.izz.b(paramm);
      x.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
    com.tencent.mm.plugin.exdevice.h.b localb = ad.aHe().Ak(this.izy.hjj);
    if (localb == null)
    {
      x.e("MicroMsg.exdevice.MMAuthTaskExcuter", "get device info failed : %d", new Object[] { Long.valueOf(this.izy.hjj) });
      return false;
    }
    com.tencent.mm.plugin.exdevice.e.a locala = (com.tencent.mm.plugin.exdevice.e.a)this.izy.aGD();
    if (locala == null)
    {
      x.e("MicroMsg.exdevice.MMAuthTaskExcuter", "Auth Request parse failed!!!, Tell device before stop this task");
      this.izy.b(-4, "", new byte[0]);
      this.izz = new a(this.izy, paramd);
      bool = this.izz.b(paramm);
      x.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
    byte[] arrayOfByte1;
    long l;
    label375:
    byte[] arrayOfByte2;
    if (locala.iwL == 2)
    {
      if (locala.iwN != null)
      {
        arrayOfByte1 = locala.iwN.lR;
        if (!bi.bC(arrayOfByte1)) {
          break label375;
        }
      }
      for (l = -1L; l != this.izy.hjj; l = com.tencent.mm.plugin.exdevice.j.b.ar(tmp383_381))
      {
        x.e("MicroMsg.exdevice.MMAuthTaskExcuter", "Auth Request parse fail!!!, Invalid MacAddress");
        this.izy.b(-1, "", new byte[0]);
        this.izz = new a(this.izy, paramd);
        bool = this.izz.b(paramm);
        x.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(bool) });
        return bool;
        arrayOfByte2 = new byte[8];
        byte[] tmp383_381 = arrayOfByte2;
        tmp383_381[0] = 0;
        byte[] tmp388_383 = tmp383_381;
        tmp388_383[1] = 0;
        byte[] tmp393_388 = tmp388_383;
        tmp393_388[2] = 0;
        byte[] tmp398_393 = tmp393_388;
        tmp398_393[3] = 0;
        byte[] tmp403_398 = tmp398_393;
        tmp403_398[4] = 0;
        byte[] tmp408_403 = tmp403_398;
        tmp408_403[5] = 0;
        byte[] tmp413_408 = tmp408_403;
        tmp413_408[6] = 0;
        byte[] tmp419_413 = tmp413_408;
        tmp419_413[7] = 0;
        tmp419_413;
        System.arraycopy(arrayOfByte1, 0, tmp383_381, 2, 6);
      }
    }
    if ((locala.iwL == 1) || (locala.iwL == 1))
    {
      if ((locala.iwI == null) || (!com.tencent.mm.plugin.exdevice.j.b.a(locala.iwI.lR, 0, g.v((localb.field_deviceType + localb.field_deviceID).getBytes()))))
      {
        x.e("MicroMsg.exdevice.MMAuthTaskExcuter", "Auth Request parse fail!!!, Invalid Md5DeviceTypeAndDeviceId");
        this.izy.b(-1, "", new byte[0]);
        this.izz = new a(this.izy, paramd);
        bool = this.izz.b(paramm);
        x.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(bool) });
        return bool;
      }
    }
    else
    {
      x.e("MicroMsg.exdevice.MMAuthTaskExcuter", "Auth Request parse fail!!!, Invalid AuthMethod");
      this.izy.b(-8, "", new byte[0]);
      this.izz = new a(this.izy, paramd);
      bool = this.izz.b(paramm);
      x.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
    if (localb != null)
    {
      l = localb.cCO;
      if (System.currentTimeMillis() / 1000L < l)
      {
        x.e("MicroMsg.exdevice.MMAuthTaskExcuter", "device has been blocked");
        this.izy.b(-5, "", new byte[0]);
        this.izz = new a(this.izy, paramd);
        bool = this.izz.b(paramm);
        x.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(bool) });
        return bool;
      }
      l = localb.cCP;
      int i = localb.cCN;
      if ((i + l > 0L) && (l + i < System.currentTimeMillis() / 1000L))
      {
        arrayOfByte1 = u.aHF().m(this.izy.hjj, 1);
        tmp383_381 = u.aHF().m(this.izy.hjj, 2);
        if (arrayOfByte1 == null)
        {
          i = -1;
          if (tmp383_381 != null) {
            break label1019;
          }
        }
        label1019:
        for (int j = -1;; j = tmp383_381.length)
        {
          x.i("MicroMsg.exdevice.MMAuthTaskExcuter", "has not reach time out, just set back sessionkey, get auth buf from local, auth buf length = %d, session key buf lenght = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          if ((arrayOfByte1 == null) || (tmp383_381 == null)) {
            break label1027;
          }
          u.aHF().cP(localb.field_mac);
          if (2 == u.aHF().cM(localb.field_mac))
          {
            ad.aHp();
            com.tencent.mm.plugin.exdevice.model.e.e(localb.field_brandName, localb.field_url, 2, localb.field_deviceID);
          }
          this.izy.b(0, "", u.aHF().m(this.izy.hjj, 1));
          this.izz = new a(this.izy, this.izx);
          paramm.setChannelSessionKey(localb.field_mac, tmp383_381);
          bool = this.izz.b(paramm);
          x.i("MicroMsg.exdevice.MMAuthTaskExcuter", "auth start task : %b", new Object[] { Boolean.valueOf(bool) });
          return bool;
          i = arrayOfByte1.length;
          break;
        }
        label1027:
        x.i("MicroMsg.exdevice.MMAuthTaskExcuter", "has not reach time out, but local authbuf is null, do auth from server");
      }
    }
    x.i("MicroMsg.exdevice.MMAuthTaskExcuter", "now do really auth from server");
    this.isY = paramm;
    this.izx = paramd;
    paramd = null;
    paramm = paramd;
    if (locala != null)
    {
      paramm = paramd;
      if (locala.iwM != null) {
        paramm = locala.iwM.toByteArray();
      }
    }
    au.DF().a(541, this);
    paramm = new r(localb.field_brandName, localb.field_deviceType, localb.field_deviceID, locala.iwK, paramm);
    au.DF().a(paramm, 0);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/exdevice/i/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */