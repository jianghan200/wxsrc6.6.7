package com.tencent.mm.plugin.product.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bnx;
import com.tencent.mm.protocal.c.bro;
import com.tencent.mm.protocal.c.brp;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.m;

public final class l
  extends m
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public String lRk;
  
  public l(bnx parambnx, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bro();
    ((b.a)localObject).dIH = new brp();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/submitmallorder";
    ((b.a)localObject).dIF = 556;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bro)this.diG.dID.dIL;
    ((bro)localObject).spz = parambnx;
    ((bro)localObject).spB = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    paramq = (brp)((b)paramq).dIE.dIL;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      x.d("MicroMsg.NetSceneMallSubmitMallOrder", "resp.ReqKey " + paramq.spA);
      this.lRk = paramq.spA;
    }
    x.d("MicroMsg.NetSceneMallSubmitMallOrder", "errCode " + paramInt2 + ", errMsg " + paramString);
    this.diJ.a(paramInt1, paramInt2, paramString, this);
  }
  
  public final int getType()
  {
    return 556;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/product/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */