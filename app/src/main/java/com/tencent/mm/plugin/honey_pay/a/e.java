package com.tencent.mm.plugin.honey_pay.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.honey_pay.model.c;
import com.tencent.mm.plugin.wallet_core.model.i;
import com.tencent.mm.protocal.c.aej;
import com.tencent.mm.protocal.c.aek;
import com.tencent.mm.protocal.c.ke;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.h;

public final class e
  extends h
{
  private final String TAG = "MicroMsg.NetSceneGetHoneyPayCard";
  public aek kjE;
  
  public e(String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aej();
    ((b.a)localObject).dIH = new aek();
    ((b.a)localObject).dIF = 1983;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/gethpcard";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (aej)this.diG.dID.dIL;
    ((aej)localObject).rIw = paramString;
    ((aej)localObject).rHf = i.bOM();
    x.i("MicroMsg.NetSceneGetHoneyPayCard", "card no: %s", new Object[] { paramString });
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneGetHoneyPayCard", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.kjE = ((aek)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneGetHoneyPayCard", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.kjE.hwV), this.kjE.hwW });
    if (this.kjE.rIx != null) {
      c.R(this.kjE.rIx.bXu, this.kjE.rIx.rlP, this.kjE.rIx.rlQ);
    }
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (aek)((b)paramq).dIE.dIL;
    this.uXe = paramq.hwV;
    this.uXf = paramq.hwW;
  }
  
  public final int getType()
  {
    return 1983;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/honey_pay/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */