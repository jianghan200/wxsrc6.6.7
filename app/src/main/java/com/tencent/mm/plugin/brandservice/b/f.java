package com.tencent.mm.plugin.brandservice.b;

import com.tencent.mm.aa.j;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.alk;
import com.tencent.mm.protocal.c.all;
import com.tencent.mm.protocal.c.bfp;
import com.tencent.mm.protocal.c.bfq;
import com.tencent.mm.protocal.c.bju;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.vfs.d;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;

public final class f
  extends l
  implements com.tencent.mm.network.k
{
  private static long hnN = 0L;
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public static boolean auN()
  {
    return System.currentTimeMillis() - hnN > 3600000L;
  }
  
  public static LinkedList<bfp> auO()
  {
    try
    {
      Object localObject = d.dv(g.Ei().dqp + "search_biz_recommend", Integer.MAX_VALUE);
      if (localObject != null)
      {
        bfq localbfq = new bfq();
        localbfq.aG((byte[])localObject);
        x.d("MicroMsg.BrandService.NetSceneGroupRecommendBiz", "GroupCount2: %d", new Object[] { Integer.valueOf(localbfq.rYP) });
        localObject = localbfq.sgQ;
        return (LinkedList<bfp>)localObject;
      }
    }
    catch (Exception localException)
    {
      x.d("MicroMsg.BrandService.NetSceneGroupRecommendBiz", localException.getMessage());
      x.printErrStackTrace("MicroMsg.BrandService.NetSceneGroupRecommendBiz", localException, "", new Object[0]);
    }
    return new LinkedList();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    hnN = System.currentTimeMillis();
    this.diJ = parame1;
    parame1 = new b.a();
    parame1.dIG = new alk();
    parame1.dIH = new all();
    parame1.uri = "/cgi-bin/micromsg-bin/grouprecommendbiz";
    parame1.dIF = 456;
    parame1.dII = 0;
    parame1.dIJ = 0;
    this.diG = parame1.KT();
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.BrandService.NetSceneGroupRecommendBiz", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (all)this.diG.dIE.dIL;
      if (paramq.rNY.rYP <= 0) {
        break label317;
      }
      x.d("MicroMsg.BrandService.NetSceneGroupRecommendBiz", "GroupCount, %d", new Object[] { Integer.valueOf(paramq.rNY.rYP) });
      try
      {
        paramArrayOfByte = paramq.rNY.toByteArray();
        d.b(g.Ei().dqp + "search_biz_recommend", paramArrayOfByte, paramArrayOfByte.length);
        paramq = paramq.rNY.sgQ.iterator();
        while (paramq.hasNext())
        {
          paramArrayOfByte = ((bfp)paramq.next()).sgP.iterator();
          while (paramArrayOfByte.hasNext())
          {
            bju localbju = (bju)paramArrayOfByte.next();
            j localj = new j();
            localj.username = ab.a(localbju.rvi);
            localj.dHR = localbju.rqZ;
            localj.dHQ = localbju.rra;
            localj.bWA = -1;
            localj.csA = 3;
            localj.by(true);
            com.tencent.mm.aa.q.KH().a(localj);
          }
        }
        this.diJ.a(paramInt2, paramInt3, paramString, this);
      }
      catch (IOException paramq)
      {
        x.d("MicroMsg.BrandService.NetSceneGroupRecommendBiz", paramq.getMessage());
        x.printErrStackTrace("MicroMsg.BrandService.NetSceneGroupRecommendBiz", paramq, "", new Object[0]);
      }
    }
    for (;;)
    {
      return;
      label317:
      d.deleteFile(g.Ei().dqp + "search_biz_recommend");
    }
  }
  
  public final int getType()
  {
    return 456;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/brandservice/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */