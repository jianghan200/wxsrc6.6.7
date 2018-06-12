package com.tencent.mm.plugin.account.friend.a;

import com.tencent.mm.aa.c;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bhp;
import com.tencent.mm.protocal.c.fl;
import com.tencent.mm.protocal.c.vj;
import com.tencent.mm.protocal.c.vk;
import com.tencent.mm.sdk.platformtools.bi;

public final class v
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public int opType;
  
  public v(int paramInt, String paramString)
  {
    this.opType = paramInt;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new vj();
    ((b.a)localObject).dIH = new vk();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/facebookauth";
    ((b.a)localObject).dIF = 183;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    vj localvj = (vj)this.diG.dID.dIL;
    localObject = paramString;
    if (bi.oW(paramString)) {
      localObject = "";
    }
    localvj.ryE = ((String)localObject);
    localvj.jRb = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneFaceBookAuth", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (vk)this.diG.dIE.dIL;
      paramInt1 = paramq.six.rfn;
      if (paramInt1 != 0)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneFaceBookAuth", "baseresponse.ret = " + paramInt1);
        this.diJ.a(4, paramInt1, paramString, this);
        return;
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneFaceBookAuth", "fbuserid = " + paramq.ryG + ", fbusername = " + paramq.ryH);
      if ((this.opType == 0) || (this.opType == 1))
      {
        g.Ei().DT().set(65825, paramq.ryG);
        c.jH(paramq.ryG);
        g.Ei().DT().set(65826, paramq.ryH);
        g.Ei().DT().lm(true);
      }
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 183;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */