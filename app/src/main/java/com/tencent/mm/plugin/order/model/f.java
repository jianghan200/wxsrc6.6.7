package com.tencent.mm.plugin.order.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.i;
import com.tencent.mm.protocal.c.ub;
import com.tencent.mm.protocal.c.uc;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.m;

public final class f
  extends m
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public f(String paramString1, String paramString2, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new ub();
    ((b.a)localObject).dIH = new uc();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/evaluateorder";
    ((b.a)localObject).dIF = 583;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (ub)this.diG.dID.dIL;
    ((ub)localObject).rxM = paramString1;
    ((ub)localObject).jQb = paramString2;
    ((ub)localObject).mEc = paramInt;
    ((ub)localObject).rmQ = i.bOL();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.d("MicroMsg.NetSceneEvaluateOrder", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.diJ.a(paramInt1, paramInt2, paramString, this);
  }
  
  public final int getType()
  {
    return 583;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/order/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */