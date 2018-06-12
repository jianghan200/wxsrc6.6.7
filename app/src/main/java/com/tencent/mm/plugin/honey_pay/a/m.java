package com.tencent.mm.plugin.honey_pay.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.honey_pay.model.c;
import com.tencent.mm.protocal.c.bdj;
import com.tencent.mm.protocal.c.bdk;
import com.tencent.mm.protocal.c.ke;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.h;

public final class m
  extends h
{
  private final String TAG = "MicroMsg.NetSceneQryHoneyUserDetail";
  public bdk kjN;
  
  public m(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new bdj();
    locala.dIH = new bdk();
    locala.dIF = 2613;
    locala.uri = "/cgi-bin/mmpay-bin/qryhpusererdetail";
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((bdj)this.diG.dID.dIL).rIw = paramString;
    x.i("MicroMsg.NetSceneQryHoneyUserDetail", "card no: %s", new Object[] { paramString });
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneQryHoneyUserDetail", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.kjN = ((bdk)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneQryHoneyUserDetail", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.kjN.hwV), this.kjN.hwW });
    if (this.kjN.rIx != null) {
      c.R(this.kjN.rIx.bXu, this.kjN.rIx.rlP, this.kjN.rIx.rlQ);
    }
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (bdk)((b)paramq).dIE.dIL;
    this.uXe = paramq.hwV;
    this.uXf = paramq.hwW;
  }
  
  public final int getType()
  {
    return 2613;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/honey_pay/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */