package com.tencent.mm.plugin.product.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bnx;
import com.tencent.mm.protocal.c.brm;
import com.tencent.mm.protocal.c.brn;
import com.tencent.mm.sdk.platformtools.x;

public final class k
  extends l
  implements com.tencent.mm.network.k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public String lRk;
  
  public k(bnx parambnx)
  {
    b.a locala = new b.a();
    locala.dIG = new brm();
    locala.dIH = new brn();
    locala.uri = "/cgi-bin/micromsg-bin/submitmallfreeorder";
    locala.dIF = 557;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((brm)this.diG.dID.dIL).spz = parambnx;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    paramq = (brn)((b)paramq).dIE.dIL;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      x.d("MicroMsg.NetSceneMallSubmitMallFreeOrder", "resp.PrepareId " + paramq.spA);
      this.lRk = paramq.spA;
    }
    x.d("MicroMsg.NetSceneMallSubmitMallFreeOrder", "errCode " + paramInt3 + ", errMsg " + paramString);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 557;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/product/b/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */