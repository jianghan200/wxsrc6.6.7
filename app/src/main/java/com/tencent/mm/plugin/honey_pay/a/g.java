package com.tencent.mm.plugin.honey_pay.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aff;
import com.tencent.mm.protocal.c.afg;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.h;

public final class g
  extends h
{
  private final String TAG = "MicroMsg.NetSceneMCreditLineTokenSign";
  public afg kjG;
  
  public g(String paramString, long paramLong)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aff();
    ((b.a)localObject).dIH = new afg();
    ((b.a)localObject).dIF = 2815;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/gmcreditlinetoken";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (aff)this.diG.dID.dIL;
    ((aff)localObject).rIw = paramString;
    ((aff)localObject).ruW = paramLong;
    x.i("MicroMsg.NetSceneMCreditLineTokenSign", "card_no: %s, credit_line: %s", new Object[] { paramString, Long.valueOf(paramLong) });
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneMCreditLineTokenSign", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.kjG = ((afg)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneMCreditLineTokenSign", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.kjG.hwV), this.kjG.hwW });
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (afg)((b)paramq).dIE.dIL;
    this.uXe = paramq.hwV;
    this.uXf = paramq.hwW;
  }
  
  public final int getType()
  {
    return 2815;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/honey_pay/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */