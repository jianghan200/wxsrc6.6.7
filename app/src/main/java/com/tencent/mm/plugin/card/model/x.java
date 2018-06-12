package com.tencent.mm.plugin.card.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.abd;
import com.tencent.mm.protocal.c.abe;

public final class x
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  private String hxf = "";
  
  public x()
  {
    b.a locala = new b.a();
    locala.dIG = new abd();
    locala.dIH = new abe();
    locala.uri = "/cgi-bin/micromsg-bin/getcardconfiginfo";
    locala.dIF = 692;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetCardConfigInfo", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      this.hxf = ((abe)this.diG.dIE.dIL).hwU;
      g.Ei().DT().set(282885, this.hxf);
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 692;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/card/model/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */