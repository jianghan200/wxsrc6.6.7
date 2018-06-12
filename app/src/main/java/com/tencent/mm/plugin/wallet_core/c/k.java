package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bdq;
import com.tencent.mm.protocal.c.bdr;
import com.tencent.mm.sdk.platformtools.x;

public final class k
  extends l
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  public String oqH;
  private bdq pjn;
  public bdr pjo;
  
  public k(String paramString1, String paramString2)
  {
    b.a locala = new b.a();
    locala.dIG = new bdq();
    locala.dIH = new bdr();
    locala.dIF = 2710;
    locala.uri = "/cgi-bin/mmpay-bin/mktqueryawardstatus";
    locala.dII = 0;
    locala.dIJ = 0;
    this.eAN = locala.KT();
    this.pjn = ((bdq)this.eAN.dID.dIL);
    this.pjn.pwq = paramString1;
    this.oqH = paramString2;
    x.i("MicroMsg.NetSceneMtkQueryAwardStatus", "NetSceneMtkQueryAwardStatus, query_award_status_params: %s, activityId: %s", new Object[] { paramString1, paramString2 });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneMtkQueryAwardStatus", "onGYNetEnd, netId: %s, errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.pjo = ((bdr)((b)paramq).dIE.dIL);
    if ((paramInt2 == 0) || (paramInt3 == 0)) {
      x.i("MicroMsg.NetSceneMtkQueryAwardStatus", "ret_code: %s, ret_msg: %s", new Object[] { Integer.valueOf(this.pjo.hwV), this.pjo.hwW });
    }
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 2710;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */