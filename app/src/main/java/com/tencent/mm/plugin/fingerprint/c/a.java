package com.tencent.mm.plugin.fingerprint.c;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.soter.b.d;
import com.tencent.mm.plugin.soter.c.c;
import com.tencent.mm.plugin.wallet_core.model.s;
import com.tencent.mm.protocal.c.bqi;
import com.tencent.mm.protocal.c.bqj;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends d
  implements k
{
  public final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public String jgX = "";
  public boolean jgY = false;
  
  public a()
  {
    Object localObject1 = new b.a();
    ((b.a)localObject1).dIG = new bqi();
    ((b.a)localObject1).dIH = new bqj();
    ((b.a)localObject1).uri = "/cgi-bin/mmpay-bin/sotergetchallenge";
    ((b.a)localObject1).dIF = 1586;
    ((b.a)localObject1).dII = 0;
    ((b.a)localObject1).dIJ = 0;
    this.diG = ((b.a)localObject1).KT();
    localObject1 = (bqi)this.diG.dID.dIL;
    Object localObject2 = com.tencent.mm.plugin.soter.c.b.bFh();
    String str = ((c)localObject2).onE;
    localObject2 = ((c)localObject2).onF;
    x.i("MicroMsg.NetSceneSoterGetPayChallenge", "hy: cpu_id: %s, uid: %s", new Object[] { str, localObject2 });
    ((bqi)localObject1).onE = str;
    ((bqi)localObject1).onF = ((String)localObject2);
    ((bqi)localObject1).scene = 0;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void aNJ()
  {
    x.e("MicroMsg.NetSceneSoterGetPayChallenge", "hy: auth key expired");
    if (this.diJ != null) {
      this.diJ.a(4, -1, "", this);
    }
  }
  
  public final void d(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.d("MicroMsg.NetSceneSoterGetPayChallenge", "hy: onGYNetEnd errType %d errCode%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramq = (bqj)((com.tencent.mm.ab.b)paramq).dIE.dIL;
      this.jgX = paramq.jgX;
      s.pqR.jgX = this.jgX;
      if (1 != paramq.soi) {
        break label169;
      }
      bool = true;
      this.jgY = bool;
      if (1 != paramq.soi) {
        break label175;
      }
    }
    label169:
    label175:
    for (boolean bool = true;; bool = false)
    {
      x.d("MicroMsg.NetSceneSoterGetPayChallenge", "get pay challenge needChangeAuthKey: %b", new Object[] { Boolean.valueOf(bool) });
      s.pqR.jgY = this.jgY;
      x.i("MicroMsg.NetSceneSoterGetPayChallenge", "hy: challenge: %s, need auth key: %b", new Object[] { this.jgX, Boolean.valueOf(this.jgY) });
      this.diJ.a(paramInt1, paramInt2, paramString, this);
      return;
      bool = false;
      break;
    }
  }
  
  public final int getType()
  {
    return 1586;
  }
  
  public final void pS(int paramInt)
  {
    if (this.diJ != null) {
      this.diJ.a(4, -1, "", this);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fingerprint/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */