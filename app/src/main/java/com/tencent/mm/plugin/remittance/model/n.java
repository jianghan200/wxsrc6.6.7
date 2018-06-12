package com.tencent.mm.plugin.remittance.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.md;
import com.tencent.mm.protocal.c.me;
import com.tencent.mm.sdk.platformtools.x;

public final class n
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  private md mxs;
  
  public n(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    b.a locala = new b.a();
    locala.dIG = new md();
    locala.dIH = new me();
    locala.dIF = 1273;
    locala.uri = "/cgi-bin/mmpay-bin/f2fpaycheck";
    locala.dII = 0;
    locala.dIJ = 0;
    this.eAN = locala.KT();
    this.mxs = ((md)this.eAN.dID.dIL);
    this.mxs.rcD = paramString1;
    this.mxs.rcE = paramString2;
    this.mxs.rqo = paramString3;
    this.mxs.rqp = paramString4;
    this.mxs.amount = paramInt;
    x.d("MicroMsg.NetSceneF2fPayCheck", "NetSceneF2fPayCheck, f2fId: %s, transId: %s, extendStr: %s, amount: %s", new Object[] { paramString1, paramString2, paramString3, Integer.valueOf(paramInt) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneF2fPayCheck", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1273;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */