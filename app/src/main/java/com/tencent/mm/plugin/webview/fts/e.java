package com.tencent.mm.plugin.webview.fts;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.websearch.api.p;
import com.tencent.mm.protocal.c.aqs;
import com.tencent.mm.protocal.c.cda;
import com.tencent.mm.protocal.c.cdb;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends l
  implements k
{
  public int bWo = -1;
  b diG;
  private com.tencent.mm.ab.e diJ;
  
  public e()
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new cda();
    ((b.a)localObject).dIH = new cdb();
    ((b.a)localObject).uri = "/cgi-bin/mmux-bin/wxaapp/weappsearchguide";
    ((b.a)localObject).dIF = 1866;
    this.diG = ((b.a)localObject).KT();
    localObject = p.JU();
    cda localcda = (cda)this.diG.dID.dIL;
    if (localObject != null)
    {
      localcda.syE = ((aqs)localObject).rms;
      localcda.syF = ((aqs)localObject).rmr;
    }
    localcda.syG = p.bjC();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneWeAppSearchGuide", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return this.diG.dIF;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webview/fts/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */