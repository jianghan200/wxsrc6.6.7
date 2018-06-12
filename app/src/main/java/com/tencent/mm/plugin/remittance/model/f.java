package com.tencent.mm.plugin.remittance.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ja;
import com.tencent.mm.protocal.c.jb;
import com.tencent.mm.sdk.platformtools.x;

public final class f
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private com.tencent.mm.ab.b eAN;
  public jb mwZ;
  
  public f(String paramString1, String paramString2, String paramString3, int paramInt, com.tencent.mm.bk.b paramb, String paramString4)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new ja();
    ((b.a)localObject).dIH = new jb();
    ((b.a)localObject).dIF = 1680;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/busif2factqry";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.eAN = ((b.a)localObject).KT();
    localObject = (ja)this.eAN.dID.dIL;
    ((ja)localObject).myl = paramString3;
    ((ja)localObject).rcD = paramString1;
    ((ja)localObject).rcE = paramString2;
    ((ja)localObject).rcI = paramInt;
    ((ja)localObject).rkr = paramb;
    ((ja)localObject).rcF = paramString4;
    x.i("MicroMsg.NetSceneBusiF2fActQry", "NetSceneBusiF2fPayCheck, f2fId: %s, transId: %s, amount: %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneBusiF2fActQry", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.mwZ = ((jb)((com.tencent.mm.ab.b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneBusiF2fActQry", "ret_code: %s, ret_msg: %s", new Object[] { Integer.valueOf(this.mwZ.hwV), this.mwZ.hwW });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1680;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */