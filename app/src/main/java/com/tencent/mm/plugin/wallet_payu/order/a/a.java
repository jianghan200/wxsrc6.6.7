package com.tencent.mm.plugin.wallet_payu.order.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bac;
import com.tencent.mm.protocal.c.bad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.m;

public final class a
  extends m
{
  public b diG;
  private com.tencent.mm.ab.e diJ;
  
  public a(int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bac();
    ((b.a)localObject).dIH = new bad();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payubatchuserroll";
    ((b.a)localObject).dIF = 1519;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bac)this.diG.dID.dIL;
    ((bac)localObject).jSb = 10;
    ((bac)localObject).rjC = paramInt;
    x.d("MicroMsg.NetScenePayUPayQueryUserRoll", "limit:10,offset:" + paramInt);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final int bRl()
  {
    return ((bad)this.diG.dIE.dIL).scN;
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.w("MicroMsg.NetScenePayUPayQueryUserRoll", "errType = " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString);
    this.diJ.a(paramInt1, paramInt2, paramString, this);
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      x.d("MicroMsg.NetScenePayUPayQueryUserRoll", "rr" + ((bad)((b)paramq).dIE.dIL).scN);
    }
  }
  
  public final int getType()
  {
    return 1519;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/order/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */