package com.tencent.mm.plugin.websearch.api;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.cfl;
import com.tencent.mm.protocal.c.cfm;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;

public final class l
  extends com.tencent.mm.ab.l
  implements k
{
  private b dZf;
  private com.tencent.mm.ab.e diJ;
  cfl pLk = new cfl();
  cfm pLl;
  
  public l(int paramInt)
  {
    b.a locala = new b.a();
    locala.dIF = 1948;
    locala.uri = "/cgi-bin/mmsearch-bin/websearchconfig";
    locala.dIG = new cfl();
    locala.dIH = new cfm();
    this.dZf = locala.KT();
    this.pLk = ((cfl)this.dZf.dID.dIL);
    this.pLk.rUH = p.zP(0);
    this.pLk.iwP = w.fD(ad.getContext());
    this.pLk.rEx = p.bjC();
    this.pLk.rUI = p.JU();
    this.pLk.otY = paramInt;
    this.pLk.rll = 0L;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dZf, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.WebSearch.NetSceneWebSearchConfig", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.pLl = ((cfm)this.dZf.dIE.dIL);
    if (this.pLl != null) {
      x.v("MicroMsg.WebSearch.NetSceneWebSearchConfig", "return data\n%s", new Object[] { this.pLl.rjK });
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1948;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/websearch/api/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */