package com.tencent.mm.plugin.honey_pay.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.i;
import com.tencent.mm.protocal.c.acm;
import com.tencent.mm.protocal.c.acn;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.h;

public final class d
  extends h
{
  private final String TAG = "MicroMsg.NetSceneGetCreateTokenSign";
  public acn kjD;
  
  public d(String paramString, long paramLong)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new acm();
    ((b.a)localObject).dIH = new acn();
    ((b.a)localObject).dIF = 2630;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/createhpcardtoken";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (acm)this.diG.dID.dIL;
    ((acm)localObject).rsa = paramString;
    ((acm)localObject).ruW = paramLong;
    ((acm)localObject).rHf = i.bOM();
    x.i("MicroMsg.NetSceneGetCreateTokenSign", "take_message: %s, credit_line: %s", new Object[] { paramString, Long.valueOf(paramLong) });
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneGetCreateTokenSign", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.kjD = ((acn)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneGetCreateTokenSign", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.kjD.hwV), this.kjD.hwW });
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (acn)((b)paramq).dIE.dIL;
    this.uXe = paramq.hwV;
    this.uXf = paramq.hwW;
  }
  
  public final int getType()
  {
    return 2630;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/honey_pay/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */