package com.tencent.mm.plugin.brandservice.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.l.b;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.bhy;
import com.tencent.mm.protocal.c.bjs;
import com.tencent.mm.protocal.c.bjt;
import com.tencent.mm.protocal.c.bju;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class j
  extends l
  implements com.tencent.mm.network.k
{
  private int bNI = 0;
  private b diG;
  private com.tencent.mm.ab.e diJ;
  private String hnS;
  private int hnT;
  private bhy hnU = new bhy().bq(new byte[0]);
  public LinkedList<bju> hnV;
  
  public j(String paramString)
  {
    this.hnS = paramString;
    this.hnT = 0;
  }
  
  protected final int Cc()
  {
    return 50;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = new b.a();
    parame1.dIG = new bjs();
    parame1.dIH = new bjt();
    parame1.uri = "/cgi-bin/micromsg-bin/searchorrecommendbiz";
    parame1.dIF = 455;
    parame1.dII = 0;
    parame1.dIJ = 0;
    this.diG = parame1.KT();
    parame1 = (bjs)this.diG.dID.dIL;
    parame1.rQz = ab.oT(this.hnS);
    parame1.qZc = this.bNI;
    parame1.sjF = this.hnT;
    parame1.rcT = this.hnU;
    x.d("MicroMsg.BrandService.NetSceneSearchOrRecommendBiz", "doScene:" + this.hnS + "  :" + this.bNI + "  entryFlag:" + this.hnT);
    return a(parame, this.diG, this);
  }
  
  protected final int a(com.tencent.mm.network.q paramq)
  {
    return l.b.dJm;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.BrandService.NetSceneSearchOrRecommendBiz", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bjt)this.diG.dIE.dIL;
      this.hnU = paramq.sjl;
      this.hnV = paramq.sjH;
      paramq = this.hnV.iterator();
    }
    while (paramq.hasNext())
    {
      paramArrayOfByte = (bju)paramq.next();
      com.tencent.mm.aa.j localj = new com.tencent.mm.aa.j();
      localj.username = ab.a(paramArrayOfByte.rvi);
      localj.dHR = paramArrayOfByte.rqZ;
      localj.dHQ = paramArrayOfByte.rra;
      localj.bWA = -1;
      localj.csA = 3;
      localj.by(true);
      com.tencent.mm.aa.q.KH().a(localj);
      continue;
      this.hnV = null;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 455;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/brandservice/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */