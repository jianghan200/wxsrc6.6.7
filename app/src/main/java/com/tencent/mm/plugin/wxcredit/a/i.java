package com.tencent.mm.plugin.wxcredit.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bgf;
import com.tencent.mm.protocal.c.bgg;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.m;

public final class i
  extends m
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public i(String paramString1, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bgf();
    ((b.a)localObject).dIH = new bgg();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/removevirtualbankcard";
    ((b.a)localObject).dIF = 600;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bgf)this.diG.dID.dIL;
    ((bgf)localObject).sho = paramString1;
    ((bgf)localObject).shn = bi.getInt(paramString2, 0);
    ((bgf)localObject).rmQ = com.tencent.mm.plugin.wallet_core.model.i.bOL();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.d("MicroMsg.NetSceneRemoveVirtualBankCard", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.diJ.a(paramInt1, paramInt2, paramString, this);
  }
  
  public final int getType()
  {
    return 600;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wxcredit/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */