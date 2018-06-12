package com.tencent.mm.plugin.websearch.api;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bgx;
import com.tencent.mm.protocal.c.bgy;
import com.tencent.mm.sdk.platformtools.x;

public final class n
  extends l
  implements k
{
  private b dZf;
  private com.tencent.mm.ab.e diJ;
  private String pLo;
  private int scene;
  
  public n(bgx parambgx)
  {
    b.a locala = new b.a();
    locala.dIF = 1134;
    locala.uri = "/cgi-bin/mmsearch-bin/searchreport";
    locala.dIG = parambgx;
    locala.dIH = new bgy();
    this.dZf = locala.KT();
    this.scene = parambgx.otY;
    this.pLo = parambgx.shQ;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.i("MicroMsg.FTS.NetSceneWebSearchReport", "doScene %d", new Object[] { Integer.valueOf(this.scene) });
    ad.Ad(5);
    ad.r(this.scene, 4, this.pLo);
    this.diJ = parame1;
    return a(parame, this.dZf, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.FTS.NetSceneWebSearchReport", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      ad.Ad(7);
      return;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
    ad.Ad(6);
    ad.a(this.scene, 5, paramInt2, paramInt3, this.pLo);
  }
  
  public final int getType()
  {
    return 1134;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/websearch/api/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */