package com.tencent.mm.plugin.exdevice.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.h.c;
import com.tencent.mm.plugin.exdevice.service.f.a;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.protocal.c.alx;
import com.tencent.mm.protocal.c.aly;
import com.tencent.mm.protocal.c.hc;
import com.tencent.mm.protocal.c.hd;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public final class l
  extends com.tencent.mm.ab.l
  implements k
{
  private com.tencent.mm.ab.b diG = null;
  private com.tencent.mm.ab.e diJ = null;
  
  public l(String paramString, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new hc();
    ((b.a)localObject).dIH = new hd();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/bindharddevice";
    ((b.a)localObject).dIF = 536;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (hc)this.diG.dID.dIL;
    ((hc)localObject).rgQ = bi.oV(paramString);
    ((hc)localObject).rhj = bi.f(Integer.valueOf(paramInt));
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.exdevice.NetSceneBindHardDevice", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramArrayOfByte = aGX();
      x.i("MicroMsg.exdevice.NetSceneBindHardDevice", "hardDevice : DeviceIdServer = %s, DeviceType = %s", new Object[] { paramArrayOfByte.rhk.hbO, paramArrayOfByte.rhk.reT });
      String str1 = paramArrayOfByte.rhl.reA;
      String str2 = paramArrayOfByte.rhl.rOv;
      String str3 = paramArrayOfByte.rhl.rgL;
      String str4 = paramArrayOfByte.rhl.rOw;
      paramInt1 = paramArrayOfByte.rhl.rOx;
      if (paramArrayOfByte.rbZ != 0) {
        break label450;
      }
      paramq = "sync";
      x.i("MicroMsg.exdevice.NetSceneBindHardDevice", "hardDeviceAttr : AuthKey = %s, BrandName = %s, Mac = %s, connProto = %s, ConnStrategy = %s, bindFlag = %s", new Object[] { str1, str2, str3, str4, Integer.valueOf(paramInt1), paramq });
      if (ad.aHe().cA(paramArrayOfByte.rhl.rOv, paramArrayOfByte.rhk.hbO) == null) {
        break label458;
      }
      boolean bool = ad.aHe().cB(paramArrayOfByte.rhk.hbO, paramArrayOfByte.rhl.rOv);
      x.i("MicroMsg.exdevice.NetSceneBindHardDevice", "delete local deviceinfo : %s, ret : %b", new Object[] { paramArrayOfByte.rhl.rOv, Boolean.valueOf(bool) });
      if (!bool) {
        break label499;
      }
      paramInt1 = 1;
    }
    for (;;)
    {
      label282:
      paramq = new com.tencent.mm.plugin.exdevice.h.b();
      f.a(paramq, paramArrayOfByte.rhk, paramArrayOfByte.rhl);
      paramq.field_url = "";
      paramArrayOfByte = u.aHF().cN(paramq.field_mac);
      long l;
      if ((paramArrayOfByte != null) && (paramArrayOfByte.bLv == 2))
      {
        x.i("MicroMsg.exdevice.NetSceneBindHardDevice", "before do bind netscene, stop the channel now");
        ad.aHl();
        d.cB(paramq.field_mac);
        paramArrayOfByte = u.aHF();
        l = paramq.field_mac;
        if (paramArrayOfByte.iyJ.containsKey(Long.valueOf(l)))
        {
          paramArrayOfByte.iyJ.remove(Long.valueOf(l));
          x.i("MicroMsg.exdevice.ExdeviceInfoManager", "remove the device from map : %d", new Object[] { Long.valueOf(l) });
        }
      }
      else
      {
        label422:
        if (paramInt1 == 0) {
          break label487;
        }
        ad.aHe().b(paramq);
      }
      for (;;)
      {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
        label450:
        paramq = "async";
        break;
        label458:
        paramInt1 = 1;
        break label282;
        x.i("MicroMsg.exdevice.ExdeviceInfoManager", "device id not contains in the map : %d", new Object[] { Long.valueOf(l) });
        break label422;
        label487:
        ad.aHe().e(paramq);
      }
      label499:
      paramInt1 = 0;
    }
  }
  
  public final hd aGX()
  {
    if ((this.diG != null) && (this.diG.dIE.dIL != null)) {
      return (hd)this.diG.dIE.dIL;
    }
    return null;
  }
  
  public final int getType()
  {
    return 536;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/exdevice/model/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */