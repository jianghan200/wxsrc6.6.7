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
import com.tencent.mm.plugin.websearch.api.j;
import com.tencent.mm.protocal.c.aqs;
import com.tencent.mm.protocal.c.cdc;
import com.tencent.mm.protocal.c.cdd;

public final class o
  extends com.tencent.mm.plugin.websearch.api.a
  implements k
{
  private final com.tencent.mm.ab.b dFA;
  private cdd dFB;
  private j dFC;
  private com.tencent.mm.ab.e doG;
  
  public o(j paramj)
  {
    this.dFC = paramj;
    this.pKL = paramj.bWo;
    this.pKM = paramj.bHt;
    this.tH = paramj.offset;
    this.fdx = paramj.scene;
    this.pKN = paramj.pLg;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new cdc();
    ((b.a)localObject).dIH = new cdd();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/wxaapp/weappsearch";
    ((b.a)localObject).dIF = 1162;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.dFA = ((b.a)localObject).KT();
    localObject = (cdc)this.dFA.dID.dIL;
    aqs localaqs = JU();
    ((cdc)localObject).hcE = paramj.iPZ;
    ((cdc)localObject).rHk = paramj.bHt;
    ((cdc)localObject).rjC = paramj.offset;
    ((cdc)localObject).rlo = paramj.iow;
    ((cdc)localObject).syI = paramj.pKV;
    hx localhx = new hx();
    com.tencent.mm.sdk.b.a.sFg.m(localhx);
    ((cdc)localObject).syH = localhx.bRs.bRt;
    if (localaqs != null)
    {
      ((cdc)localObject).syJ = localaqs.rmr;
      ((cdc)localObject).syK = localaqs.rms;
    }
    ((cdc)localObject).syL = b.dFw;
    ((cdc)localObject).syO = paramj.pKR;
    ((cdc)localObject).syP = paramj.pKW;
    ((cdc)localObject).syQ = paramj.pKX;
    ((cdc)localObject).syM = b.dFx;
    ((cdc)localObject).sdX = paramj.jru;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneWeAppSearch", "NetSceneWeAppSearch oreh SessionID : %s, KeywordID : %s, LocationX : %s, LocationY : %s", new Object[] { ((cdc)localObject).syL, ((cdc)localObject).syM, Double.valueOf(((cdc)localObject).syJ), Double.valueOf(((cdc)localObject).syK) });
  }
  
  private static aqs JU()
  {
    try
    {
      au.HU();
      Object localObject = (String)c.DT().get(67591, null);
      if (localObject != null)
      {
        aqs localaqs = new aqs();
        localObject = ((String)localObject).split(",");
        localaqs.ryV = Integer.valueOf(localObject[0]).intValue();
        localaqs.ryY = Integer.valueOf(localObject[1]).intValue();
        localaqs.rms = (Integer.valueOf(localObject[2]).intValue() / 1000000.0F);
        localaqs.rmr = (Integer.valueOf(localObject[3]).intValue() / 1000000.0F);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneWeAppSearch", "lbs location is not null, %f, %f", new Object[] { Float.valueOf(localaqs.rms), Float.valueOf(localaqs.rmr) });
        return localaqs;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneWeAppSearch", "lbs location is null, lbsContent is null!");
      return null;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneWeAppSearch", "lbs location is null, reason %s", new Object[] { localException.getMessage() });
    }
    return null;
  }
  
  public final String JS()
  {
    if (this.dFB != null) {
      return this.dFB.rjK;
    }
    return "";
  }
  
  public final int JT()
  {
    if (this.dFB != null) {
      return this.dFB.syR;
    }
    return 0;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneWeAppSearch", "doScene");
    this.doG = parame1;
    return a(parame, this.dFA, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneWeAppSearch", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.dFB = ((cdd)this.dFA.dIE.dIL);
    if (this.dFB != null) {
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.NetSceneWeAppSearch", "return data\n%s", new Object[] { this.dFB.rjK });
    }
    if (this.doG != null) {
      this.doG.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1162;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/modelappbrand/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */