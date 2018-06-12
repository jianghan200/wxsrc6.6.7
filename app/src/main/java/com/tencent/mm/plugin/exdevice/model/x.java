package com.tencent.mm.plugin.exdevice.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.protocal.c.alx;
import com.tencent.mm.protocal.c.bul;
import com.tencent.mm.protocal.c.bum;

public final class x
  extends l
  implements k
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public alx ivH;
  
  public x(alx paramalx, int paramInt)
  {
    this.ivH = paramalx;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bul();
    ((b.a)localObject).dIH = new bum();
    ((b.a)localObject).dIF = 537;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/unbindharddevice";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bul)this.diG.dID.dIL;
    ((bul)localObject).rhk = paramalx;
    ((bul)localObject).rbZ = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.exdevice.NetSceneUnBindHardDevice", "onGYNetEnd netId = %d, errType= %d, errCode = %d , errMsg =%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = i.ivn;
    i.cH(0L);
    paramq = ad.aHe().Al(this.ivH.hbO);
    if (paramq != null)
    {
      if ((u.aHG().isY != null) && (!u.aHG().isY.cT(paramq.field_mac))) {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "stopChannel Failed!!!");
      }
      if (!ad.aHe().cB(this.ivH.hbO, this.ivH.reT)) {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "deleteByDeviceId Failed!!!");
      }
      if ((paramInt2 != 0) || (paramInt3 != 0)) {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "scene.getType() = %s", new Object[] { Integer.valueOf(537) });
      }
      if ((this.diG == null) || (this.diG.dIE.dIL == null)) {
        break label245;
      }
    }
    label245:
    for (paramq = (bum)this.diG.dIE.dIL;; paramq = null)
    {
      if (paramq == null) {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "UnbindHardDevice resp or req is null");
      }
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.exdevice.NetSceneUnBindHardDevice", "getByDeviceIdServer Failed!!! DeviceIDServer = %s", new Object[] { this.ivH.hbO });
      break;
    }
  }
  
  public final int getType()
  {
    return 537;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/exdevice/model/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */