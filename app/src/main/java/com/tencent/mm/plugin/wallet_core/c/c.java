package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.oj;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.i;
import com.tencent.mm.pluginsdk.wallet.f;
import com.tencent.mm.protocal.c.aab;
import com.tencent.mm.protocal.c.aac;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.LinkedList;

public final class c
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public LinkedList<String> piZ;
  
  public c(LinkedList<String> paramLinkedList)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetBankcardLogo", "NetSceneGetBankcardLogo call");
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aab();
    ((b.a)localObject).dIH = new aac();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/bankresource";
    ((b.a)localObject).dIF = 1650;
    this.diG = ((b.a)localObject).KT();
    this.diG.dIU = true;
    localObject = (aab)this.diG.dID.dIL;
    ((aab)localObject).rFF = paramLinkedList;
    ((aab)localObject).rmQ = i.bOL();
    if (!f.cfE()) {
      ((aab)localObject).rqE = f.cfF();
    }
    com.tencent.mm.wallet_core.ui.e.He(42);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetBankcardLogo", "NetSceneGetBankcardLogo onGYNetEnd,errType=" + paramInt2 + "errCode=" + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (aac)((b)paramq).dIE.dIL;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetBankcardLogo", "respone %s", new Object[] { paramq.rFG });
      this.piZ = paramq.piZ;
      paramArrayOfByte = this.piZ;
      if ((paramArrayOfByte == null) || (paramArrayOfByte.size() == 0))
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetBankcardLogo", "empty bank logo list");
        g.Ek();
        g.Ei().DT().a(aa.a.sTa, bi.aG(paramq.rFG, ""));
        g.Ek();
        g.Ei().DT().a(aa.a.sTb, Long.valueOf(System.currentTimeMillis() / 1000L));
      }
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      oj localoj = new oj();
      localoj.bZj.bZl = paramArrayOfByte;
      a.sFg.m(localoj);
      break;
      com.tencent.mm.wallet_core.ui.e.He(43);
    }
  }
  
  public final int getType()
  {
    return 1650;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */