package com.tencent.mm.plugin.card.sharecard.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.protocal.c.rn;
import com.tencent.mm.protocal.c.ro;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends l
  implements com.tencent.mm.network.k
{
  private String cac = "";
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public int hwV;
  
  public a(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new rn();
    locala.dIH = new ro();
    locala.uri = "/cgi-bin/mmbiz-bin/card/delsharecard";
    locala.dIF = 1163;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((rn)this.diG.dID.dIL).cac = paramString;
    this.cac = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneDelShareCard", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(1163), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (ro)this.diG.dIE.dIL;
      x.i("MicroMsg.NetSceneDelShareCard", "ret_code:" + paramq.hwV);
      this.hwV = paramq.hwV;
      if (this.hwV == 0) {
        am.axq().xB(this.cac);
      }
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1163;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */