package com.tencent.mm.plugin.account.security.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.rl;
import com.tencent.mm.protocal.c.rm;
import com.tencent.mm.sdk.platformtools.bi;

public final class a
  extends l
  implements k
{
  private String byN;
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public a(String paramString)
  {
    this.byN = paramString;
    b.a locala = new b.a();
    locala.dIG = new rl();
    locala.dIH = new rm();
    locala.uri = "/cgi-bin/micromsg-bin/delsafedevice";
    locala.dIF = 362;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((rl)this.diG.dID.dIL).rvq = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    if (bi.oW(this.byN))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneDelSafeDevice", "null device id");
      return -1;
    }
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneDelSafeDevice", "NetSceneDelSafeDevice, errType= " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (rm)this.diG.dIE.dIL;
      g.Ei().DT().set(64, Integer.valueOf(paramq.raE));
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneDelSafeDevice", "NetSceneDelSafeDevice, get safedevice state = " + paramq.raE);
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 362;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/security/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */