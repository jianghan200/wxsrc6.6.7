package com.tencent.mm.plugin.account.bind.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.buh;
import com.tencent.mm.protocal.c.bui;

public final class c
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  
  public c()
  {
    b.a locala = new b.a();
    locala.dIG = new buh();
    locala.dIH = new bui();
    locala.uri = "/cgi-bin/micromsg-bin/unbindlinkedincontact";
    locala.dIF = 550;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((buh)this.diG.dID.dIL).rfe = 1;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneUnBindLinkedinContact", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      g.Ei().DT().set(286722, "");
      g.Ei().DT().set(286721, "");
      g.Ei().DT().set(286723, "");
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 550;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/bind/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */