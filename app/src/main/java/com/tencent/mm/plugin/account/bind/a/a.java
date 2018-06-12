package com.tencent.mm.plugin.account.bind.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.he;
import com.tencent.mm.protocal.c.hf;

public final class a
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  
  public a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new he();
    ((b.a)localObject).dIH = new hf();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/bindlinkedincontact";
    ((b.a)localObject).dIF = 549;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (he)this.diG.dID.dIL;
    ((he)localObject).rfe = 1;
    ((he)localObject).rhm = paramInt;
    ((he)localObject).rhn = paramString1;
    ((he)localObject).rho = paramString2;
    ((he)localObject).rhp = paramString3;
    ((he)localObject).rhq = paramString4;
    ((he)localObject).rhr = paramString5;
    ((he)localObject).rhs = paramString6;
    ((he)localObject).rht = paramString7;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneBindLinkedinContact", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    paramq = (he)this.diG.dID.dIL;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      g.Ei().DT().set(286722, paramq.rho);
      g.Ei().DT().set(286721, paramq.rhn);
      g.Ei().DT().set(286723, paramq.rhp);
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 549;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/bind/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */