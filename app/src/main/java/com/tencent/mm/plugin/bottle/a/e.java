package com.tencent.mm.plugin.bottle.a;

import com.tencent.mm.a.g;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.modelvoice.u;
import com.tencent.mm.network.k;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.protocal.c.axk;
import com.tencent.mm.protocal.c.axl;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.qa;
import com.tencent.mm.protocal.c.qb;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;

public final class e
  extends l
  implements k
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private String fileName = "";
  private String hjV = "";
  private int hjW = 0;
  private com.tencent.mm.modelvoice.a hjX = null;
  private int msgType = 0;
  
  public e(String paramString, int paramInt)
  {
    b.a locala = new b.a();
    locala.dIG = new axk();
    locala.dIH = new axl();
    locala.uri = "/cgi-bin/micromsg-bin/openbottle";
    locala.dIF = 156;
    locala.dII = 55;
    locala.dIJ = 1000000055;
    this.diG = locala.KT();
    this.hjV = paramString;
    this.msgType = paramInt;
  }
  
  private int aug()
  {
    axk localaxk = (axk)this.diG.dID.dIL;
    axl localaxl = (axl)this.diG.dIE.dIL;
    a locala = new a();
    locala.msgType = localaxk.jQd;
    locala.hjO = 0;
    locala.hjQ = 2;
    locala.hjP = c.wU(localaxk.say);
    locala.hjS = bi.VF();
    locala.hjN = g.u(localaxk.say.getBytes());
    if (this.msgType == 3)
    {
      locala.content = this.fileName;
      locala.hjR = localaxl.rvX;
    }
    for (;;)
    {
      i.auk().a(locala);
      return 0;
      locala.content = new String(localaxl.saC.ruy.siK.lR);
    }
  }
  
  protected final int Cc()
  {
    return 10;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = (axk)this.diG.dID.dIL;
    parame1.jQd = this.msgType;
    parame1.say = this.hjV;
    if (parame1.saz == null) {
      parame1.saz = new qb();
    }
    if (parame1.saA == null) {
      parame1.saA = new qb();
    }
    if (this.msgType == 1)
    {
      parame1.saz.rdW = 0;
      parame1.saz.rux = 0;
    }
    while (this.msgType == 3) {
      return a(parame, this.diG, this);
    }
    x.e("MicroMsg.NetSceneOpenBottle", "doScene Error Msg type" + this.msgType);
    return -1;
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    paramq = (axk)((com.tencent.mm.ab.b)paramq).dID.dIL;
    if (paramq.jQd == 1) {
      return l.b.dJm;
    }
    if (paramq.jQd != 3) {
      return l.b.dJn;
    }
    if (paramq.saz == null)
    {
      x.d("MicroMsg.NetSceneOpenBottle", "ERR: securityVerificationChecked errtype: rImpl.getBigContentInfo() == null");
      return l.b.dJn;
    }
    if ((paramq.saz.rux == 0) && (paramq.saz.rdW == 0)) {
      return l.b.dJm;
    }
    if (paramq.saz.rux <= paramq.saz.rdW) {
      return l.b.dJn;
    }
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneOpenBottle", "onGYNetEnd errtype:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      x.d("MicroMsg.NetSceneOpenBottle", "ERR: onGYNetEnd errtype:" + paramInt2 + " errCode:" + paramInt3);
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
    do
    {
      return;
      paramq = (axk)this.diG.dID.dIL;
      paramArrayOfByte = (axl)this.diG.dIE.dIL;
      if (this.msgType == 1)
      {
        aug();
        localbd = new bd();
        localbd.ep(paramq.say);
        localbd.setContent(ab.b(paramArrayOfByte.saC.ruy));
        localbd.ay(bi.VF());
        localbd.eX(0);
        localbd.setStatus(3);
        localbd.setType(c.ni(paramq.jQd));
        au.HU();
        com.tencent.mm.model.c.FT().T(localbd);
        x.d("MicroMsg.NetSceneOpenBottle", "onGYNetEnd :" + localbd.field_content);
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
      }
      if (bi.oW(this.fileName))
      {
        this.fileName = u.ov(this.hjV);
        this.hjX = new com.tencent.mm.modelvoice.a(com.tencent.mm.modelvoice.q.getFullPath(this.fileName));
        this.hjW = 0;
      }
      if (paramArrayOfByte.saC.rux < paramArrayOfByte.saC.rdW + paramArrayOfByte.saC.ruy.siI)
      {
        x.e("MicroMsg.NetSceneOpenBottle", "onGYNetEnd tot:" + paramArrayOfByte.saC.rux + " start:" + paramArrayOfByte.saC.rdW + " len:" + paramArrayOfByte.saC.ruy.siI);
        this.diJ.a(3, -1, paramString, this);
        return;
      }
      if (paramArrayOfByte.saC.rdW != this.hjW)
      {
        x.e("MicroMsg.NetSceneOpenBottle", "onGYNetEnd start:" + paramArrayOfByte.saC.rdW + " off:" + this.hjW);
        this.diJ.a(3, -1, paramString, this);
        return;
      }
      paramInt1 = this.hjX.write(paramArrayOfByte.saC.ruy.siK.lR, paramArrayOfByte.saC.ruy.siI, paramArrayOfByte.saC.rdW);
      if (paramInt1 != paramArrayOfByte.saC.ruy.siI + paramArrayOfByte.saC.rdW)
      {
        x.e("MicroMsg.NetSceneOpenBottle", "onGYNetEnd start:" + paramArrayOfByte.saC.rdW + " len:" + paramArrayOfByte.saC.ruy.siI + " writeRet:" + paramInt1);
        this.diJ.a(3, -1, paramString, this);
        return;
      }
      this.hjW = paramInt1;
      if (paramArrayOfByte.saC.rux <= this.hjW) {
        break;
      }
    } while (a(this.dIX, this.diJ) != -1);
    this.diJ.a(3, -1, "doScene failed", this);
    return;
    aug();
    bd localbd = new bd();
    localbd.ep(paramq.say);
    localbd.setContent(n.b("bottle", paramArrayOfByte.rvX, false));
    localbd.eq(this.fileName);
    localbd.ay(bi.VF());
    localbd.eX(0);
    localbd.setStatus(3);
    localbd.setType(c.ni(paramq.jQd));
    au.HU();
    com.tencent.mm.model.c.FT().T(localbd);
    x.d("MicroMsg.NetSceneOpenBottle", "voice :" + paramArrayOfByte.rvX + " file:" + this.fileName);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 156;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/bottle/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */