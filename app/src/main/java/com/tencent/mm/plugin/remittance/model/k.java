package com.tencent.mm.plugin.remittance.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ch;
import com.tencent.mm.protocal.c.jl;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.sdk.platformtools.x;

public final class k
  extends l
  implements com.tencent.mm.network.k
{
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  public jm mxn;
  
  public k(ch paramch, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new jl();
    ((b.a)localObject).dIH = new jm();
    ((b.a)localObject).dIF = 2702;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/busif2funlockfavor";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.eAN = ((b.a)localObject).KT();
    localObject = (jl)this.eAN.dID.dIL;
    ((jl)localObject).rkA = paramch;
    ((jl)localObject).rkN = paramString;
    x.i("MicroMsg.NetSceneBusiF2fUnlockFavor", "NetSceneBusiF2fUnlockFavor, f2fId: %s, transId: %s, amount: %s", new Object[] { paramch.rcD, paramch.rcE, Integer.valueOf(paramch.rcI) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneBusiF2fUnlockFavor", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.mxn = ((jm)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneBusiF2fUnlockFavor", "ret_code: %s, ret_msg: %s", new Object[] { Integer.valueOf(this.mxn.hwV), this.mxn.hwW });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 2702;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */