package com.tencent.mm.modelappbrand;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.g.a.hx;
import com.tencent.mm.g.a.hx.a;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.cde;
import com.tencent.mm.protocal.c.cdf;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;

public final class p
  extends com.tencent.mm.plugin.websearch.api.b
  implements k
{
  private com.tencent.mm.ab.b dFA;
  private cdf dFD;
  private com.tencent.mm.ab.e doG;
  
  public p(String paramString, int paramInt1, int paramInt2)
  {
    this.fur = paramString;
    this.fdx = paramInt1;
    this.pKL = paramInt2;
    if (!bi.oW(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneWeAppSuggest", "Constructors: query = %s", new Object[] { paramString });
      Object localObject = new b.a();
      ((b.a)localObject).dIF = 1173;
      ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/weappsearchsuggestion";
      ((b.a)localObject).dIG = new cde();
      ((b.a)localObject).dIH = new cdf();
      this.dFA = ((b.a)localObject).KT();
      localObject = (cde)this.dFA.dID.dIL;
      ((cde)localObject).bWm = paramString;
      paramString = new hx();
      a.sFg.m(paramString);
      ((cde)localObject).syH = paramString.bRs.bRt;
      au.HU();
      paramString = c.DT().get(aa.a.sVB, null);
      if ((paramString != null) && ((paramString instanceof String))) {
        ((cde)localObject).syS = ((String)paramString);
      }
      ((cde)localObject).syL = b.dFw;
      ((cde)localObject).syM = b.dFx;
      return;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneWeAppSuggest", "keyword is unavailable");
  }
  
  public final String JS()
  {
    if (this.dFD != null) {
      return this.dFD.rjK;
    }
    return "";
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.doG = parame1;
    return a(parame, this.dFA, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneWeAppSuggest", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.doG.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    this.dFD = ((cdf)this.dFA.dIE.dIL);
    if (this.dFD != null) {
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.NetSceneWeAppSuggest", "return data\n%s", new Object[] { this.dFD.rjK });
    }
    this.doG.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1173;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/modelappbrand/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */