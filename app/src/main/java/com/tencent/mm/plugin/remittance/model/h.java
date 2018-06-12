package com.tencent.mm.plugin.remittance.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ch;
import com.tencent.mm.protocal.c.jf;
import com.tencent.mm.protocal.c.jg;
import com.tencent.mm.sdk.platformtools.x;

public final class h
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  public jg mxi;
  
  public h(ch paramch, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new jf();
    ((b.a)localObject).dIH = new jg();
    ((b.a)localObject).dIF = 1241;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/busif2fpaycheck";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.eAN = ((b.a)localObject).KT();
    localObject = (jf)this.eAN.dID.dIL;
    ((jf)localObject).rkA = paramch;
    ((jf)localObject).rkB = paramString;
    x.i("MicroMsg.NetSceneBusiF2fPayCheck", "NetSceneBusiF2fPayCheck, f2fId: %s, transId: %s, amount: %s req: %s", new Object[] { paramch.rcD, paramch.rcE, Integer.valueOf(paramch.rcI), a.a(paramch) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneBusiF2fPayCheck", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.mxi = ((jg)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneBusiF2fPayCheck", "ret_code: %s, ret_msg: %s", new Object[] { Integer.valueOf(this.mxi.hwV), this.mxi.hwW });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1241;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */