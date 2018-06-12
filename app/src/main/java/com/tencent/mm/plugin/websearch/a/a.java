package com.tencent.mm.plugin.websearch.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.websearch.api.p;
import com.tencent.mm.protocal.c.bjn;
import com.tencent.mm.protocal.c.bjo;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends l
  implements k
{
  public b diG;
  private com.tencent.mm.ab.e diJ;
  
  public a(String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIF = 1944;
    ((b.a)localObject).uri = "/cgi-bin/mmsearch-bin/searchlocalpage";
    ((b.a)localObject).dIG = new bjn();
    ((b.a)localObject).dIH = new bjo();
    this.diG = ((b.a)localObject).KT();
    localObject = (bjn)this.diG.dID.dIL;
    ((bjn)localObject).sjx = paramString;
    ((bjn)localObject).otY = 25;
    ((bjn)localObject).iwP = w.fD(ad.getContext());
    ((bjn)localObject).rUI = p.JU();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.FTS.NetSceneWebSearchLocalPage", "netId %d | errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return this.diG.dIF;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/websearch/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */