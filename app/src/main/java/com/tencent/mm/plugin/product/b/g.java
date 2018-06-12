package com.tencent.mm.plugin.product.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aet;
import com.tencent.mm.protocal.c.aeu;
import com.tencent.mm.protocal.c.cf;
import com.tencent.mm.protocal.c.um;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class g
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public LinkedList<um> lQY;
  public String lRg;
  
  public g(String paramString1, String paramString2, cf paramcf)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aet();
    ((b.a)localObject).dIH = new aeu();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getlastestexpressinfo";
    ((b.a)localObject).dIF = 578;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (aet)this.diG.dID.dIL;
    this.lRg = paramString1;
    ((aet)localObject).rlw = paramString1;
    x.d("MicroMsg.NetSceneMallGetLastestExpressInfo", "pid " + paramString1);
    ((aet)localObject).rmM = paramString2;
    ((aet)localObject).rII = paramcf;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    paramArrayOfByte = (aeu)((b)paramq).dIE.dIL;
    if ((paramInt2 == 0) && (paramInt3 == 0) && (paramArrayOfByte.rmN == 0))
    {
      x.d("MicroMsg.NetSceneMallGetLastestExpressInfo", "resp.ExpressCount " + paramArrayOfByte.rIK);
      this.lQY = paramArrayOfByte.rIJ;
    }
    paramInt1 = paramInt3;
    paramq = paramString;
    if (paramInt3 == 0)
    {
      paramInt1 = paramInt3;
      paramq = paramString;
      if (paramArrayOfByte.rmN != 0)
      {
        paramInt1 = paramArrayOfByte.rmN;
        paramq = paramArrayOfByte.rmO;
      }
    }
    x.d("MicroMsg.NetSceneMallGetLastestExpressInfo", "errCode " + paramInt1 + ", errMsg " + paramq);
    this.diJ.a(paramInt2, paramInt1, paramq, this);
  }
  
  public final int getType()
  {
    return 578;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/product/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */