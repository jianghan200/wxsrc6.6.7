package com.tencent.mm.plugin.card.sharecard.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ahw;
import com.tencent.mm.protocal.c.ahx;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public String hwU;
  
  public c(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new ahw();
    locala.dIH = new ahx();
    locala.uri = "/cgi-bin/micromsg-bin/getsharecard";
    locala.dIF = 904;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((ahw)this.diG.dID.dIL).cac = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetShareCard", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(904), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (ahx)this.diG.dIE.dIL;
      x.v("MicroMsg.NetSceneGetShareCard", "json:" + paramq.hwU);
      this.hwU = paramq.hwU;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 904;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */