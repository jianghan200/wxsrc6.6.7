package com.tencent.mm.modelsimple;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aco;
import com.tencent.mm.protocal.c.acp;
import com.tencent.mm.sdk.platformtools.x;

public final class j
  extends l
  implements k
{
  public String country;
  public String csK;
  public String csL;
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public j(double paramDouble1, double paramDouble2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aco();
    ((b.a)localObject).dIH = new acp();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getcurlocation";
    ((b.a)localObject).dIF = 665;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (aco)this.diG.dID.dIL;
    ((aco)localObject).rjj = paramDouble1;
    ((aco)localObject).rji = paramDouble2;
    x.d("MicroMsg.NetSceneGetCurLocation", "latitude:" + paramDouble1 + ", longitude:" + paramDouble2);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneGetCurLocation", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (acp)this.diG.dIE.dIL;
      this.csL = paramq.eJJ;
      this.country = paramq.eJQ;
      this.csK = paramq.eJI;
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 665;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/modelsimple/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */