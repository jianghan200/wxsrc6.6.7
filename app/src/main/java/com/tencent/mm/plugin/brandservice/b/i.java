package com.tencent.mm.plugin.brandservice.b;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bjl;
import com.tencent.mm.protocal.c.bjm;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class i
  extends l
  implements k
{
  private String bHt;
  private com.tencent.mm.ab.e diJ;
  private com.tencent.mm.ab.b hnO;
  private long hnQ;
  public bjm hnR;
  private int scene;
  
  public i(String paramString, long paramLong, int paramInt)
  {
    this.bHt = paramString;
    this.hnQ = paramLong;
    this.scene = paramInt;
    x.i("MicroMsg.NetSceneSearchHomePageNew", "Constructors: keyword (%s) , businessType (%d), scene (%d)", new Object[] { paramString, Long.valueOf(paramLong), Integer.valueOf(paramInt) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.i("MicroMsg.NetSceneSearchHomePageNew", "doScene");
    this.diJ = parame1;
    if (!bi.oW(this.bHt))
    {
      parame1 = new b.a();
      parame1.dIF = 1070;
      parame1.uri = "/cgi-bin/mmbiz-bin/bizsearch/homepage";
      parame1.dIG = new bjl();
      parame1.dIH = new bjm();
      parame1.dII = 0;
      parame1.dIJ = 0;
      this.hnO = parame1.KT();
      parame1 = (bjl)this.hnO.dID.dIL;
      parame1.rHk = this.bHt;
      parame1.rUI = b.JU();
      parame1.rll = this.hnQ;
      parame1.sjq = this.scene;
      x.i("MicroMsg.NetSceneSearchHomePageNew", "businessTypeList is %d", new Object[] { Long.valueOf(this.hnQ) });
      return a(parame, this.hnO, this);
    }
    x.e("MicroMsg.NetSceneSearchHomePageNew", "keyword is unavailable");
    return -1;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneSearchHomePageNew", "netId (%d) , errType (%d) , errCode (%d) , errMsg (%s)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0) && (this.hnO != null)) {
      this.hnR = ((bjm)this.hnO.dIE.dIL);
    }
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1070;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/brandservice/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */