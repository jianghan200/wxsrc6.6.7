package com.tencent.mm.plugin.aa.a.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.n;
import com.tencent.mm.protocal.c.o;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.d;

public final class i
  extends l
  implements k, d
{
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  private n eAW;
  public o eAX;
  
  public i(String paramString1, long paramLong, int paramInt, String paramString2)
  {
    b.a locala = new b.a();
    locala.dIG = new n();
    locala.dIH = new o();
    locala.dIF = 1629;
    locala.uri = "/cgi-bin/mmpay-bin/newaapay";
    locala.dII = 0;
    locala.dIJ = 0;
    this.eAN = locala.KT();
    this.eAW = ((n)this.eAN.dID.dIL);
    this.eAW.qYc = paramString1;
    this.eAW.qYv = paramLong;
    this.eAW.scene = paramInt;
    this.eAW.qYd = paramString2;
    x.i("MicroMsg.NetSceneAAPay", "NetSceneAAPay, bill_no: %s, pay_amount: %s, scene: %s, groupid: %s", new Object[] { this.eAW.qYc, Long.valueOf(this.eAW.qYv), Integer.valueOf(this.eAW.scene), this.eAW.qYd });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneAAPay", "onGYNetEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.eAX = ((o)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneAAPay", "retcode: %s, retmsg: %s, paymsgid:%s", new Object[] { Integer.valueOf(this.eAX.hUm), this.eAX.hUn, this.eAX.bXu });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1629;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/aa/a/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */