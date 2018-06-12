package com.tencent.mm.plugin.card.model;

import android.text.TextUtils;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.card.sharecard.a.a;
import com.tencent.mm.protocal.c.abf;
import com.tencent.mm.protocal.c.abg;
import com.tencent.mm.storage.aa.a;

public final class y
  extends com.tencent.mm.ab.l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  
  public y()
  {
    b.a locala = new b.a();
    locala.dIG = new abf();
    locala.dIH = new abg();
    locala.uri = "/cgi-bin/micromsg-bin/getcardcount";
    locala.dIF = 663;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetCardCount", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (abg)this.diG.dIE.dIL;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetCardCount", "has_card_item:" + paramq.rGi + " has_share_card:" + paramq.rGj);
      if (paramq.rGi > 0)
      {
        com.tencent.mm.plugin.card.d.l.azQ();
        if (TextUtils.isEmpty((String)g.Ei().DT().get(aa.a.sPR, null)))
        {
          am.axh();
          com.tencent.mm.plugin.card.b.b.nG(1);
        }
      }
      if (paramq.rGj > 0)
      {
        com.tencent.mm.plugin.card.d.l.azS();
        paramq = (Long)g.Ei().DT().get(aa.a.sQb, Long.valueOf(0L));
        if ((paramq != null) && (paramq.longValue() == 0L)) {
          am.axp().axD();
        }
      }
    }
    g.Ei().DT().set(282882, Integer.valueOf((int)(System.currentTimeMillis() / 1000L)));
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 663;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/model/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */