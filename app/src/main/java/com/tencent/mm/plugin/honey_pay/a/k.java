package com.tencent.mm.plugin.honey_pay.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bdf;
import com.tencent.mm.protocal.c.bdg;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.h;

public final class k
  extends h
{
  private final String TAG = "MicroMsg.NetSceneQryHoneyPayCardDetail";
  public bdg kjL;
  
  public k(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new bdf();
    locala.dIH = new bdg();
    locala.dIF = 2851;
    locala.uri = "/cgi-bin/mmpay-bin/qryhpcarddetail";
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((bdf)this.diG.dID.dIL).rIw = paramString;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneQryHoneyPayCardDetail", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.kjL = ((bdg)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneQryHoneyPayCardDetail", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.kjL.hwV), this.kjL.hwW });
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (bdg)((b)paramq).dIE.dIL;
    this.uXe = paramq.hwV;
    this.uXf = paramq.hwW;
  }
  
  public final int getType()
  {
    return 2851;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/honey_pay/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */