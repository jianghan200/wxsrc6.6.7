package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.c.aye;
import com.tencent.mm.protocal.c.ayf;
import com.tencent.mm.sdk.platformtools.x;

public final class q
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  private aye oZA;
  public ayf oZB;
  
  public q(String paramString1, String paramString2)
  {
    b.a locala = new b.a();
    locala.dIG = new aye();
    locala.dIH = new ayf();
    locala.dIF = 2996;
    locala.uri = "/cgi-bin/mmpay-bin/openlqbaccount";
    locala.dII = 0;
    locala.dIJ = 0;
    this.eAN = locala.KT();
    this.oZA = ((aye)this.eAN.dID.dIL);
    this.oZA.rhb = paramString1;
    this.oZA.saZ = paramString2;
    x.i("MicroMsg.NetSceneOpenLqbAccount", "NetSceneOpenLqbAccount, eCardType: %s, extraData: %s", new Object[] { paramString1, paramString2 });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneOpenLqbAccount", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.oZB = ((ayf)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneOpenLqbAccount", "onGYNetEnd, retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.oZB.hwV), this.oZB.hwW });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 2996;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a/a/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */