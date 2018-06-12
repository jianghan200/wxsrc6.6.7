package com.tencent.mm.plugin.order.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.i;
import com.tencent.mm.protocal.c.azf;
import com.tencent.mm.protocal.c.azg;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.m;

public final class g
  extends m
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public g(String paramString1, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new azf();
    ((b.a)localObject).dIH = new azg();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/paydeluserroll";
    ((b.a)localObject).dIF = 389;
    ((b.a)localObject).dII = 187;
    ((b.a)localObject).dIJ = 1000000187;
    this.diG = ((b.a)localObject).KT();
    localObject = (azf)this.diG.dID.dIL;
    ((azf)localObject).sbW = 1;
    if (!bi.oW(paramString1)) {
      ((azf)localObject).lOE = paramString1;
    }
    if (!bi.oW(paramString2)) {
      ((azf)localObject).lOX = paramString2;
    }
    ((azf)localObject).rmQ = i.bOL();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final int bmw()
  {
    return ((azf)this.diG.dID.dIL).sbW;
  }
  
  public final String bmx()
  {
    return ((azf)this.diG.dID.dIL).lOE;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.d("MicroMsg.NetScenePayDelUserRoll", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.diJ.a(paramInt1, paramInt2, paramString, this);
  }
  
  public final int getType()
  {
    return 389;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/order/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */