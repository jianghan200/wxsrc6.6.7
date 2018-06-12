package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.zp;
import com.tencent.mm.protocal.c.zq;
import com.tencent.mm.sdk.platformtools.x;

public final class h
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  private zp pjg;
  public zq pjh;
  public long pji;
  
  public h(String paramString, long paramLong)
  {
    b.a locala = new b.a();
    locala.dIG = new zp();
    locala.dIH = new zq();
    locala.uri = "/cgi-bin/mmpay-bin/mktgetaward";
    locala.dIF = 2948;
    locala.dII = 0;
    locala.dIJ = 0;
    this.eAN = locala.KT();
    this.pjg = ((zp)this.eAN.dID.dIL);
    this.pjg.rFv = paramString;
    this.pji = paramLong;
    x.i("MicroMsg.NetSceneMktGetAward", "NetSceneMktGetAward, get_award_params: %s, activityId: %s", new Object[] { paramString, Long.valueOf(paramLong) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneMktGetAward", "onGYNetEnd, netId: %s, errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.pjh = ((zq)((b)paramq).dIE.dIL);
    if ((paramInt2 == 0) || (paramInt3 == 0)) {
      x.i("MicroMsg.NetSceneMktGetAward", "ret_code: %s, ret_msg: %s, result_code: %s, alert_wording: %s, btn_wording: %s", new Object[] { Integer.valueOf(this.pjh.hwV), this.pjh.hwW, Integer.valueOf(this.pjh.rFw), this.pjh.rFx, this.pjh.rFy });
    }
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 2948;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */