package com.tencent.mm.plugin.game.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.bk.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.game.a.c;
import com.tencent.mm.plugin.game.d.bj;
import com.tencent.mm.plugin.game.d.r;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class ax
  extends com.tencent.mm.ab.l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  public final b ivx;
  
  public ax(String paramString, LinkedList<String> paramLinkedList, s params1, s params2, s params3, boolean paramBoolean)
  {
    x.i("MicroMsg.NetSceneGetGameIndexForeign", "lang = " + paramString + ", installedApp list size: " + paramLinkedList.size());
    Object localObject = paramLinkedList.iterator();
    while (((Iterator)localObject).hasNext()) {
      x.i("MicroMsg.NetSceneGetGameIndexForeign", "install id:[%s]", new Object[] { (String)((Iterator)localObject).next() });
    }
    localObject = new com.tencent.mm.plugin.game.d.bi();
    ((com.tencent.mm.plugin.game.d.bi)localObject).jRj = paramString;
    ((com.tencent.mm.plugin.game.d.bi)localObject).jRK = paramLinkedList;
    paramLinkedList = f.dz(ad.getContext());
    paramString = paramLinkedList;
    if (com.tencent.mm.sdk.platformtools.bi.oW(paramLinkedList)) {
      paramString = com.tencent.mm.sdk.platformtools.bi.fS(ad.getContext());
    }
    if (!com.tencent.mm.sdk.platformtools.bi.oW(l.countryCode)) {
      paramString = l.countryCode;
    }
    for (;;)
    {
      ((com.tencent.mm.plugin.game.d.bi)localObject).eJQ = paramString;
      if (params1 != null) {}
      for (;;)
      {
        ((com.tencent.mm.plugin.game.d.bi)localObject).jRL = new r();
        if (params1 != null)
        {
          ((com.tencent.mm.plugin.game.d.bi)localObject).jRL.jQa = params1.jMt.jNi;
          ((com.tencent.mm.plugin.game.d.bi)localObject).jRL.jQb = params1.field_appId;
          ((com.tencent.mm.plugin.game.d.bi)localObject).jRL.jOZ = params1.jNb;
          if (params1.field_msgType == 100) {
            ((com.tencent.mm.plugin.game.d.bi)localObject).jRL.jQd = params1.jNa;
          }
        }
        else
        {
          label223:
          if (params2 != null)
          {
            paramLinkedList = ((com.tencent.mm.plugin.game.d.bi)localObject).jRL;
            paramLinkedList.jQc |= 0x1;
          }
          if (params3 != null)
          {
            paramLinkedList = ((com.tencent.mm.plugin.game.d.bi)localObject).jRL;
            paramLinkedList.jQc |= 0x2;
          }
          ((com.tencent.mm.plugin.game.d.bi)localObject).jRM = ((c)g.l(c.class)).aSj().aUf();
          ((com.tencent.mm.plugin.game.d.bi)localObject).jRN = paramBoolean;
          if (!com.tencent.mm.sdk.platformtools.e.chv()) {
            break label456;
          }
        }
        label456:
        for (int i = 1;; i = 0)
        {
          ((com.tencent.mm.plugin.game.d.bi)localObject).jRk = i;
          x.i("MicroMsg.NetSceneGetGameIndexForeign", "Country Code: %s", new Object[] { paramString });
          if ((!com.tencent.mm.sdk.platformtools.bi.oW(((com.tencent.mm.plugin.game.d.bi)localObject).eJQ)) && ("CN".equalsIgnoreCase(((com.tencent.mm.plugin.game.d.bi)localObject).eJQ))) {
            h.mEJ.a(860L, 8L, 1L, false);
          }
          paramString = new b.a();
          paramString.dIG = ((a)localObject);
          paramString.dIH = new bj();
          paramString.uri = "/cgi-bin/mmgame-bin/getgameindexforeign";
          paramString.dIF = 2855;
          paramString.dII = 0;
          paramString.dIJ = 0;
          this.ivx = paramString.KT();
          return;
          if (params2 != null)
          {
            params1 = params2;
            break;
          }
          if (params3 == null) {
            break label462;
          }
          params1 = params3;
          break;
          ((com.tencent.mm.plugin.game.d.bi)localObject).jRL.jQd = params1.field_msgType;
          break label223;
        }
        label462:
        params1 = null;
      }
    }
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.ivx, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetGameIndexForeign", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 2855;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/model/ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */