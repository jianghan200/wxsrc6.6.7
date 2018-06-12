package com.tencent.mm.plugin.aa.a.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.m;
import com.tencent.mm.sdk.platformtools.x;

public final class h
  extends com.tencent.mm.ab.l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  private com.tencent.mm.protocal.c.l eAU;
  public m eAV;
  
  public h()
  {
    b.a locala = new b.a();
    locala.dIG = new com.tencent.mm.protocal.c.l();
    locala.dIH = new m();
    locala.dIF = 1698;
    locala.uri = "/cgi-bin/mmpay-bin/newaaoperation";
    locala.dII = 0;
    locala.dIJ = 0;
    this.eAN = locala.KT();
    this.eAU = ((com.tencent.mm.protocal.c.l)this.eAN.dID.dIL);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneAAOperation", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.eAV = ((m)((b)paramq).dIE.dIL);
    if ((paramInt2 == 0) && (paramInt3 == 0)) {
      x.i("MicroMsg.NetSceneAAOperation", "retCode: %s, retMsg: %s, max_payer_num: %s, max_receiver_num: %s, max_total_num: %s, max_total_amount: %s, max_per_amount: %s, notice: %s, notice_url: %s", new Object[] { Integer.valueOf(this.eAV.hUm), this.eAV.hUn, Integer.valueOf(this.eAV.qYq), Integer.valueOf(this.eAV.qYr), Integer.valueOf(this.eAV.qYs), Long.valueOf(this.eAV.qYt), Long.valueOf(this.eAV.qYu), this.eAV.hUy, this.eAV.hUz });
    }
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1698;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/aa/a/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */