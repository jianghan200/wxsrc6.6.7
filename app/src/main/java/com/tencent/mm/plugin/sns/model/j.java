package com.tencent.mm.plugin.sns.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.awn;
import com.tencent.mm.protocal.c.awo;
import com.tencent.mm.storage.aa.a;

public final class j
  extends l
  implements k
{
  private b diG;
  public com.tencent.mm.ab.e diJ;
  private final int dxI;
  
  public j()
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new awn();
    ((b.a)localObject).dIH = new awo();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/oauth_checkgrant";
    ((b.a)localObject).dIF = 2842;
    this.dxI = -1216949095;
    this.diG = ((b.a)localObject).KT();
    localObject = (awn)this.diG.dID.dIL;
    g.Ek();
    g.Eg();
    ((awn)localObject).rZO = a.Df();
    ((awn)localObject).rZP = -1216949095;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneOauthCheckGrant", "init useruin:%d, bizuin:%d", new Object[] { Integer.valueOf(((awn)localObject).rZO), Integer.valueOf(((awn)localObject).rZP) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneOauthCheckGrant", "onGYNetEnd netId : " + paramInt1 + " errType :" + paramInt2 + " errCode: " + paramInt3 + " errMsg :" + paramString);
    aa.a locala;
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (awo)((b)paramq).dIE.dIL;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneOauthCheckGrant", "onGYNetEnd bizUin:%d, status:%d", new Object[] { Integer.valueOf(this.dxI), Integer.valueOf(paramq.status) });
      if (this.dxI == -1216949095)
      {
        g.Ek();
        paramArrayOfByte = g.Ei().DT();
        locala = aa.a.sQN;
        if (paramq.status != 1) {
          break label170;
        }
      }
    }
    label170:
    for (boolean bool = true;; bool = false)
    {
      paramArrayOfByte.a(locala, Boolean.valueOf(bool));
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
  }
  
  public final int getType()
  {
    return 2842;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/model/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */