package com.tencent.mm.plugin.wallet_payu.order.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.azz;
import com.tencent.mm.protocal.c.baj;
import com.tencent.mm.protocal.c.bak;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.m;

public final class c
  extends m
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public azz pEY = null;
  
  public c(String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new baj();
    ((b.a)localObject).dIH = new bak();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payuqueryuserroll";
    ((b.a)localObject).dIF = 1520;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (baj)this.diG.dID.dIL;
    if (!bi.oW(paramString)) {
      ((baj)localObject).lOE = paramString;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.w("MicroMsg.NetScenePayUQueryUserRoll", "errType = " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString);
    this.diJ.a(paramInt1, paramInt2, paramString, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = (bak)((b)paramq).dIE.dIL;
      this.pEY = paramString.scQ;
      if (paramString.scQ != null) {
        x.d("MicroMsg.NetScenePayUQueryUserRoll", "rr" + paramString.scQ.lOE);
      }
    }
    else
    {
      return;
    }
    x.e("MicroMsg.NetScenePayUQueryUserRoll", "hy: user roll is null!!!");
  }
  
  public final int getType()
  {
    return 1520;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/order/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */