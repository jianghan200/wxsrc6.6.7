package com.tencent.mm.plugin.account.security.a;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ahl;
import com.tencent.mm.protocal.c.ahm;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends l
  implements k
{
  private com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public ahm eOo;
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    b.a locala = new b.a();
    locala.dIG = new ahl();
    locala.dIH = new ahm();
    locala.uri = "/cgi-bin/micromsg-bin/getsafetyinfo";
    locala.dIF = 850;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    if ((paramInt2 != 0) || (paramInt3 != 0)) {
      x.e("MicroMsg.NetSceneGetSafetyInfo", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    }
    this.eOo = ((ahm)((com.tencent.mm.ab.b)paramq).dIE.dIL);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 850;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/security/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */