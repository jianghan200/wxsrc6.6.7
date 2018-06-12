package com.tencent.mm.plugin.game.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.game.a.c;
import com.tencent.mm.plugin.game.d.bc;
import com.tencent.mm.plugin.game.d.bd;
import com.tencent.mm.plugin.game.d.r;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class av
  extends com.tencent.mm.ab.l
  implements k
{
  private com.tencent.mm.ab.e diJ;
  public final b ivx;
  
  public av(String paramString, LinkedList<String> paramLinkedList, s params1, s params2, s params3, boolean paramBoolean)
  {
    x.i("MicroMsg.NetSceneGetGameIndex4", "lang = " + paramString + ", installedApp list size: " + paramLinkedList.size());
    Object localObject = paramLinkedList.iterator();
    while (((Iterator)localObject).hasNext()) {
      x.i("MicroMsg.NetSceneGetGameIndex4", "install id:[%s]", new Object[] { (String)((Iterator)localObject).next() });
    }
    localObject = new b.a();
    ((b.a)localObject).dIG = new bc();
    ((b.a)localObject).dIH = new bd();
    ((b.a)localObject).uri = "/cgi-bin/mmgame-bin/getgameindex4";
    ((b.a)localObject).dIF = 2994;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.ivx = ((b.a)localObject).KT();
    localObject = (bc)this.ivx.dID.dIL;
    ((bc)localObject).jRj = paramString;
    ((bc)localObject).jRK = paramLinkedList;
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
      ((bc)localObject).eJQ = paramString;
      if (params1 != null) {}
      for (;;)
      {
        ((bc)localObject).jRL = new r();
        if (params1 != null)
        {
          ((bc)localObject).jRL.jQa = params1.jMt.jNi;
          ((bc)localObject).jRL.jQb = params1.field_appId;
          ((bc)localObject).jRL.jOZ = params1.jNb;
          if (params1.field_msgType == 100) {
            ((bc)localObject).jRL.jQd = params1.jNa;
          }
        }
        else
        {
          label298:
          if (params2 != null)
          {
            paramLinkedList = ((bc)localObject).jRL;
            paramLinkedList.jQc |= 0x1;
          }
          if (params3 != null)
          {
            paramLinkedList = ((bc)localObject).jRL;
            paramLinkedList.jQc |= 0x2;
          }
          ((bc)localObject).jRM = ((c)g.l(c.class)).aSj().aUf();
          ((bc)localObject).jRN = paramBoolean;
          if (!com.tencent.mm.sdk.platformtools.e.chv()) {
            break label475;
          }
        }
        label475:
        for (int i = 1;; i = 0)
        {
          ((bc)localObject).jRk = i;
          x.i("MicroMsg.NetSceneGetGameIndex4", "Country Code: %s", new Object[] { paramString });
          if ((!bi.oW(((bc)localObject).eJQ)) && (!"CN".equalsIgnoreCase(((bc)localObject).eJQ))) {
            h.mEJ.a(860L, 7L, 1L, false);
          }
          return;
          if (params2 != null)
          {
            params1 = params2;
            break;
          }
          if (params3 == null) {
            break label481;
          }
          params1 = params3;
          break;
          ((bc)localObject).jRL.jQd = params1.field_msgType;
          break label298;
        }
        label481:
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
    x.i("MicroMsg.NetSceneGetGameIndex4", "errType = " + paramInt2 + ", errCode = " + paramInt3);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 2994;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/game/model/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */