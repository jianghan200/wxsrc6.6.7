package com.tencent.mm.plugin.brandservice.b;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bjb;
import com.tencent.mm.protocal.c.bjc;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class h
  extends l
  implements k
{
  private String bHt;
  private com.tencent.mm.ab.e diJ;
  private String fuu;
  private com.tencent.mm.ab.b hnO;
  private bjc hnP;
  private long hnQ;
  private int offset;
  private int scene;
  
  public h(String paramString1, long paramLong, int paramInt1, int paramInt2, String paramString2)
  {
    this.bHt = paramString1;
    this.hnQ = paramLong;
    this.offset = paramInt1;
    this.scene = paramInt2;
    this.fuu = paramString2;
    x.i("MicroMsg.NetSceneSearchDetailPageNew", "Constructors: keyword = (%s) , LSB exist () , businessType is (%d) , offset is (%d) , scene is (%d), searchId(%s).", new Object[] { paramString1, Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString2 });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    if (!bi.oW(this.bHt))
    {
      parame1 = new b.a();
      parame1.dIF = 1071;
      parame1.uri = "/cgi-bin/mmbiz-bin/bizsearch/detailpage";
      parame1.dIG = new bjb();
      parame1.dIH = new bjc();
      parame1.dII = 0;
      parame1.dIJ = 0;
      this.hnO = parame1.KT();
      parame1 = (bjb)this.hnO.dID.dIL;
      parame1.rUI = b.JU();
      parame1.rHk = this.bHt;
      parame1.rll = this.hnQ;
      parame1.rjC = this.offset;
      parame1.sjq = this.scene;
      parame1.rlo = this.fuu;
      return a(parame, this.hnO, this);
    }
    x.e("MicroMsg.NetSceneSearchDetailPageNew", "keyword is unavailable.");
    return -1;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneSearchDetailPageNew", "netId (%d) , errType (%d) , errCode (%d) , errMsg (%s)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0) && (this.hnO != null)) {
      this.hnP = ((bjc)this.hnO.dIE.dIL);
    }
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final ju auP()
  {
    if (this.hnP == null) {
      return null;
    }
    return this.hnP.sjs;
  }
  
  public final int getType()
  {
    return 1071;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/brandservice/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */