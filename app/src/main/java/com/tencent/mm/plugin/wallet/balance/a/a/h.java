package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.mm.ab.a;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.protocal.c.bfs;
import com.tencent.mm.protocal.c.bft;
import com.tencent.mm.wallet_core.c.d;

public final class h
  extends a<bft>
  implements d
{
  public h(int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bfs();
    ((b.a)localObject).dIH = new bft();
    ((b.a)localObject).dIF = 1338;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/redeemfund";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    localObject = ((b.a)localObject).KT();
    bfs localbfs = (bfs)((b)localObject).dID.dIL;
    localbfs.sdC = paramInt1;
    localbfs.rtJ = paramString1;
    localbfs.sdF = paramString2;
    localbfs.rtK = paramInt2;
    this.diG = ((b)localObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */