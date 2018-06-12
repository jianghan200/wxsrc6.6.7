package com.tencent.mm.plugin.aa.a.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.protocal.c.p;
import com.tencent.mm.protocal.c.q;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends com.tencent.mm.ab.a<q>
{
  public a(String paramString1, long paramLong, int paramInt, String paramString2, String paramString3, String paramString4)
  {
    p localp = new p();
    localp.qYc = paramString1;
    localp.qYv = paramLong;
    localp.scene = paramInt;
    localp.qYd = paramString2;
    localp.qYx = paramString3;
    localp.myq = paramString4;
    paramString1 = new b.a();
    paramString1.dIG = localp;
    paramString1.dIH = new q();
    paramString1.dIF = 1344;
    paramString1.uri = "/cgi-bin/mmpay-bin/newaapaysucc";
    paramString1.dII = 0;
    paramString1.dIJ = 0;
    this.diG = paramString1.KT();
    x.i("MicroMsg.CgiAAPaySucc", "CgiAAPaySucc, bill_no: %s, pay_amount: %s, scene: %s, groupid: %s, out_trade_no: %s, trans_id: %s", new Object[] { localp.qYc, Long.valueOf(localp.qYv), Integer.valueOf(localp.scene), localp.qYd, localp.qYx, localp.myq });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/aa/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */