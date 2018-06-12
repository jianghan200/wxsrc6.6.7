package com.tencent.mm.plugin.honey_pay.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.honey_pay.model.c;
import com.tencent.mm.protocal.c.bdh;
import com.tencent.mm.protocal.c.bdi;
import com.tencent.mm.protocal.c.ke;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.h;

public final class l
  extends h
{
  private final String TAG = "MicroMsg.NetSceneQryHoneyPayerDetail";
  public bdi kjM;
  
  public l(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new bdh();
    locala.dIH = new bdi();
    locala.dIF = 2876;
    locala.uri = "/cgi-bin/mmpay-bin/qryhppayerdetail";
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((bdh)this.diG.dID.dIL).rIw = paramString;
    x.i("MicroMsg.NetSceneQryHoneyPayerDetail", "card no: %s", new Object[] { paramString });
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneQryHoneyPayerDetail", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.kjM = ((bdi)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneQryHoneyPayerDetail", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.kjM.hwV), this.kjM.hwW });
    if (this.kjM.rIx != null) {
      c.R(this.kjM.rIx.bXu, this.kjM.rIx.rlP, this.kjM.rIx.rlQ);
    }
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (bdi)((b)paramq).dIE.dIL;
    this.uXe = paramq.hwV;
    this.uXf = paramq.hwW;
  }
  
  public final int getType()
  {
    return 2876;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/honey_pay/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */