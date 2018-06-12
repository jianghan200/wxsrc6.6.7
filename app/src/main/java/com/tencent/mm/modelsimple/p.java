package com.tencent.mm.modelsimple;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.arl;
import com.tencent.mm.protocal.c.arm;
import com.tencent.mm.sdk.platformtools.x;

public final class p
  extends l
  implements k
{
  public final b diG;
  private com.tencent.mm.ab.e diJ;
  
  public p()
  {
    b.a locala = new b.a();
    locala.dIG = new arl();
    locala.dIH = new arm();
    locala.uri = "/cgi-bin/micromsg-bin/logout";
    locala.dIF = 282;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((arl)this.diG.dID.dIL).otY = 0;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.d("MicroMsg.NetSceneLogout", "doScene");
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0)) {
      x.d("MicroMsg.NetSceneLogout", "logout Error. ");
    }
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 282;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/modelsimple/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */