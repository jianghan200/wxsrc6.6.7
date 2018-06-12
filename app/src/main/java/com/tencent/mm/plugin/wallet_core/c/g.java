package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ss;
import com.tencent.mm.protocal.c.st;
import com.tencent.mm.sdk.platformtools.x;

public final class g
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  private ss pjd;
  public st pje;
  private boolean pjf;
  
  public g(String paramString, int paramInt, boolean paramBoolean)
  {
    this.pjf = paramBoolean;
    b.a locala = new b.a();
    locala.dIG = new ss();
    locala.dIH = new st();
    if (paramBoolean) {
      locala.dIF = 1859;
    }
    for (locala.uri = "/cgi-bin/mmpay-bin/mktdrawf2flottery";; locala.uri = "/cgi-bin/mmpay-bin/mktdrawlottery")
    {
      locala.dII = 0;
      locala.dIJ = 0;
      this.eAN = locala.KT();
      this.pjd = ((ss)this.eAN.dID.dIL);
      this.pjd.rvZ = paramString;
      this.pjd.rwa = paramInt;
      x.i("MicroMsg.NetSceneMktDrawLottery", "NetSceneMktDrawLottery, drawLotteryParams: %s, drawLotteryType: %s, isF2f: %s", new Object[] { paramString, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
      return;
      locala.dIF = 2547;
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneMktDrawLottery", "onGYNetEnd netId: %s, errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.pje = ((st)((b)paramq).dIE.dIL);
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    if (this.pjf) {
      return 1859;
    }
    return 2547;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */