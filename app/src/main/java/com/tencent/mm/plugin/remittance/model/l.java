package com.tencent.mm.plugin.remittance.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.btd;
import com.tencent.mm.protocal.c.ch;
import com.tencent.mm.protocal.c.jn;
import com.tencent.mm.protocal.c.jo;
import com.tencent.mm.sdk.platformtools.x;

public final class l
  extends com.tencent.mm.ab.l
  implements k, com.tencent.mm.wallet_core.c.d, com.tencent.mm.wallet_core.d.d
{
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  public boolean iMC = false;
  public jo mxo;
  public boolean mxp = false;
  private jn mxq;
  
  public l(btd parambtd, ch paramch, String paramString1, int paramInt, String paramString2)
  {
    b.a locala = new b.a();
    locala.dIG = new jn();
    locala.dIH = new jo();
    locala.dIF = 2682;
    locala.uri = "/cgi-bin/mmpay-bin/busif2fzerocallback";
    locala.dII = 0;
    locala.dIJ = 0;
    this.eAN = locala.KT();
    this.mxq = ((jn)this.eAN.dID.dIL);
    this.mxq.rkA = paramch;
    this.mxq.rkR = parambtd;
    this.mxq.rkS = paramString1;
    this.mxq.rld = paramInt;
    this.mxq.token = paramString2;
    x.i("MicroMsg.NetSceneBusiF2fZeroCallback", "NetSceneBusiF2fZeroCallback, token %s AfterPlaceOrderCommReq %s zero_pay_extend: %s", new Object[] { paramString2, a.a(paramch), paramString1 });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneBusiF2fZeroCallback", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.mxo = ((jo)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneBusiF2fZeroCallback", "ret_code: %s, ret_msg: %s", new Object[] { Integer.valueOf(this.mxo.hwV), this.mxo.hwW });
    if (this.diJ != null) {
      if (this.mxo.rle != 1) {
        break label124;
      }
    }
    label124:
    for (boolean bool = true;; bool = false)
    {
      this.iMC = bool;
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
  }
  
  public final boolean bre()
  {
    return this.mxp;
  }
  
  public final int getType()
  {
    return 2682;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */