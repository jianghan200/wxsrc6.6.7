package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.afd;
import com.tencent.mm.protocal.c.afe;
import com.tencent.mm.sdk.platformtools.x;

public final class i
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  private boolean pjf;
  private afd pjj;
  public afe pjk;
  
  public i(String paramString, boolean paramBoolean)
  {
    this.pjf = paramBoolean;
    b.a locala = new b.a();
    locala.dIG = new afd();
    locala.dIH = new afe();
    if (paramBoolean) {
      locala.dIF = 2803;
    }
    for (locala.uri = "/cgi-bin/mmpay-bin/mktgetf2flottery";; locala.uri = "/cgi-bin/mmpay-bin/mktgetlottery")
    {
      locala.dII = 0;
      locala.dIJ = 0;
      this.eAN = locala.KT();
      this.pjj = ((afd)this.eAN.dID.dIL);
      this.pjj.rJm = paramString;
      x.i("MicroMsg.NetSceneMktGetLottery", "NetSceneMktGetLottery, getLotteryParams: %s, isF2f: %s", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
      return;
      locala.dIF = 2508;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneMktGetLottery", "onGYNetEnd, netId: %s, errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.pjk = ((afe)((b)paramq).dIE.dIL);
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    if (this.pjf) {
      return 2803;
    }
    return 2508;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */