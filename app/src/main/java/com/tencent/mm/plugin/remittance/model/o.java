package com.tencent.mm.plugin.remittance.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.lq;
import com.tencent.mm.protocal.c.lr;
import com.tencent.mm.sdk.platformtools.x;

public final class o
  extends l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  private b eAN;
  private lq mxt;
  public lr mxu;
  
  public o(String paramString1, String paramString2, int paramInt1, String paramString3, String paramString4, int paramInt2, int paramInt3, String paramString5, String paramString6)
  {
    b.a locala = new b.a();
    locala.dIG = new lq();
    locala.dIH = new lr();
    locala.dIF = 2773;
    locala.uri = "/cgi-bin/mmpay-bin/f2fsucpage";
    locala.dII = 0;
    locala.dIJ = 0;
    this.eAN = locala.KT();
    this.mxt = ((lq)this.eAN.dID.dIL);
    this.mxt.rcD = paramString1;
    this.mxt.rcE = paramString2;
    this.mxt.amount = paramInt1;
    this.mxt.myf = paramString3;
    this.mxt.mye = paramString4;
    this.mxt.bVU = paramInt2;
    this.mxt.mwQ = paramInt3;
    this.mxt.rpL = paramString5;
    this.mxt.rpM = paramString6;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.eAN, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneF2fSuccPage", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.mxu = ((lr)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneF2fSuccPage", "ret_code: %s, ret_msg: %s", new Object[] { Integer.valueOf(this.mxu.hUm), this.mxu.hUn });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 2773;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/remittance/model/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */