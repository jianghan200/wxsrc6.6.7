package com.tencent.mm.plugin.exdevice.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.exdevice.h.c;
import com.tencent.mm.protocal.c.alx;
import com.tencent.mm.protocal.c.hk;
import com.tencent.mm.protocal.c.hl;
import com.tencent.mm.sdk.platformtools.x;

public final class m
  extends l
  implements k
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private long ivA;
  private String ivB;
  private long ivC;
  private String ivz;
  
  public m(long paramLong1, String paramString1, String paramString2, long paramLong2)
  {
    this.ivA = paramLong1;
    this.ivB = paramString1;
    this.ivz = paramString2;
    this.ivC = paramLong2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = new b.a();
    parame1.dIG = new hk();
    parame1.dIH = new hl();
    parame1.uri = "/cgi-bin/mmoc-bin/hardware/bindunauthdevice";
    parame1.dIF = 1262;
    parame1.dII = 0;
    parame1.dIJ = 0;
    this.diG = parame1.KT();
    parame1 = (hk)this.diG.dID.dIL;
    parame1.mac = com.tencent.mm.plugin.exdevice.j.b.cZ(this.ivA);
    parame1.rif = this.ivB;
    parame1.rie = this.ivz;
    parame1.rig = this.ivC;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneBindUnauthDevice", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    hl localhl;
    alx localalx;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      localhl = (hl)this.diG.dIE.dIL;
      localalx = localhl.rhk;
      paramArrayOfByte = null;
      paramq = null;
      if (localalx != null)
      {
        paramArrayOfByte = localalx.hbO;
        paramq = localalx.reT;
      }
      x.d("MicroMsg.NetSceneBindUnauthDevice", "unauth bind deviceId = %s, deviceType = %s", new Object[] { paramArrayOfByte, paramq });
      if (ad.aHe().cA(paramq, paramArrayOfByte) == null) {
        break label279;
      }
      boolean bool = ad.aHe().cB(paramArrayOfByte, paramq);
      x.i("MicroMsg.NetSceneBindUnauthDevice", "delete local deviceinfo : %s, ret : %b", new Object[] { paramq, Boolean.valueOf(bool) });
      if (!bool) {
        break label296;
      }
      paramInt1 = 1;
    }
    for (;;)
    {
      paramq = new com.tencent.mm.plugin.exdevice.h.b();
      paramq.field_connProto = this.ivz;
      paramq.field_connStrategy = 1;
      paramq.field_closeStrategy = 1;
      paramq.field_url = "";
      f.a(paramq, localalx, localhl.rhl);
      if (paramq.field_mac == 0L)
      {
        x.d("MicroMsg.NetSceneBindUnauthDevice", "onSceneEnd, mac of hardDeviceAttr is 0 so set a local mac.");
        paramq.field_mac = this.ivA;
      }
      if (paramInt1 != 0) {
        ad.aHe().b(paramq);
      }
      for (;;)
      {
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
        label279:
        paramInt1 = 1;
        break;
        ad.aHe().e(paramq);
      }
      label296:
      paramInt1 = 0;
    }
  }
  
  public final int getType()
  {
    return 1262;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/exdevice/model/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */