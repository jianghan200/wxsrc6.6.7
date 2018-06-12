package com.tencent.mm.plugin.game.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.bk.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.game.a.c;
import com.tencent.mm.plugin.game.d.bg;
import com.tencent.mm.plugin.game.d.bh;
import com.tencent.mm.plugin.game.d.r;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class aw
  extends com.tencent.mm.ab.l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  public final b ivx;
  
  public aw(String paramString, LinkedList<String> paramLinkedList, s params1, s params2, s params3, boolean paramBoolean)
  {
    x.i("MicroMsg.NetSceneGetGameIndexDownloadGuidance", "lang = " + paramString + ", installedApp list size: " + paramLinkedList.size());
    Object localObject = paramLinkedList.iterator();
    while (((Iterator)localObject).hasNext()) {
      x.i("MicroMsg.NetSceneGetGameIndexDownloadGuidance", "install id:[%s]", new Object[] { (String)((Iterator)localObject).next() });
    }
    localObject = new bg();
    ((bg)localObject).jRj = paramString;
    ((bg)localObject).jRK = paramLinkedList;
    paramLinkedList = f.dz(ad.getContext());
    paramString = paramLinkedList;
    if (bi.oW(paramLinkedList)) {
      paramString = bi.fS(ad.getContext());
    }
    if (!bi.oW(l.countryCode)) {
      paramString = l.countryCode;
    }
    for (;;)
    {
      ((bg)localObject).eJQ = paramString;
      if (params1 != null) {}
      for (;;)
      {
        ((bg)localObject).jRL = new r();
        if (params1 != null)
        {
          ((bg)localObject).jRL.jQa = params1.jMt.jNi;
          ((bg)localObject).jRL.jQb = params1.field_appId;
          ((bg)localObject).jRL.jOZ = params1.jNb;
          if (params1.field_msgType == 100) {
            ((bg)localObject).jRL.jQd = params1.jNa;
          }
        }
        else
        {
          label223:
          if (params2 != null)
          {
            paramLinkedList = ((bg)localObject).jRL;
            paramLinkedList.jQc |= 0x1;
          }
          if (params3 != null)
          {
            paramLinkedList = ((bg)localObject).jRL;
            paramLinkedList.jQc |= 0x2;
          }
          ((bg)localObject).jRM = ((c)g.l(c.class)).aSj().aUf();
          ((bg)localObject).jRN = paramBoolean;
          if (!com.tencent.mm.sdk.platformtools.e.chv()) {
            break label418;
          }
        }
        label418:
        for (int i = 1;; i = 0)
        {
          ((bg)localObject).jRk = i;
          x.i("MicroMsg.NetSceneGetGameIndexDownloadGuidance", "Country Code: %s", new Object[] { paramString });
          paramString = new b.a();
          paramString.dIG = ((a)localObject);
          paramString.dIH = new bh();
          paramString.uri = "/cgi-bin/mmgame-bin/getgameindexdownloadguidance";
          paramString.dIF = 2586;
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
            break label424;
          }
          params1 = params3;
          break;
          ((bg)localObject).jRL.jQd = params1.field_msgType;
          break label223;
        }
        label424:
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
    x.i("MicroMsg.NetSceneGetGameIndexDownloadGuidance", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 2586;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/model/aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */