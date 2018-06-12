package com.tencent.mm.plugin.game.model;

import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.a.b;
import com.tencent.mm.plugin.game.d.ap;
import com.tencent.mm.plugin.game.d.aq;
import com.tencent.mm.plugin.game.d.as;
import com.tencent.mm.plugin.game.d.bj;
import com.tencent.mm.plugin.game.d.cb;
import com.tencent.mm.plugin.game.d.cc;
import com.tencent.mm.plugin.game.d.cf;
import com.tencent.mm.plugin.game.d.e;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class ak
  extends ac
{
  public bj jNZ;
  private boolean jOa;
  public LinkedList<d> jOb;
  public HashMap<String, Integer> jOc = new HashMap();
  
  public ak(com.tencent.mm.bk.a parama)
  {
    if (parama == null)
    {
      this.jNZ = new bj();
      return;
    }
    this.jNZ = ((bj)parama);
    this.jOa = true;
    Wj();
  }
  
  public ak(byte[] paramArrayOfByte)
  {
    this.jNZ = new bj();
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0)) {
      return;
    }
    try
    {
      this.jNZ.aG(paramArrayOfByte);
      this.jOa = false;
      Wj();
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      for (;;)
      {
        x.e("MicroMsg.GamePBDataOverSea", "Parsing Failed: %s", new Object[] { paramArrayOfByte.getMessage() });
      }
    }
  }
  
  private void Wj()
  {
    LinkedList localLinkedList = new LinkedList();
    if ((this.jNZ.jRX == null) || (this.jNZ.jRX.jPz == null)) {}
    for (;;)
    {
      this.jOb = localLinkedList;
      if (this.jOa)
      {
        com.tencent.mm.plugin.game.e.d.S(this.jOb);
        aUx();
        ((b)g.l(b.class)).aSf().init(ad.getContext());
      }
      return;
      Iterator localIterator = this.jNZ.jRX.jPz.iterator();
      int i = 1;
      while (localIterator.hasNext())
      {
        Object localObject = (ap)localIterator.next();
        if (((ap)localObject).jOV != null)
        {
          d locald = a(((ap)localObject).jOV);
          if (locald != null)
          {
            aq localaq;
            StringBuilder localStringBuilder;
            int j;
            if (((ap)localObject).jOV.jPq != null) {
              if ((((ap)localObject).jOV.jPq.jPe != null) && (((ap)localObject).jOV.jPq.jSH != null))
              {
                locald.jLp = ((ap)localObject).jOV.jPq.jPe;
                locald.jLq = ((ap)localObject).jOV.jPq.jSH;
                locald.jLt = an.Q(((ap)localObject).jPA, "label", locald.jLp);
                if (((ap)localObject).jQX == null) {
                  break label507;
                }
                localObject = ((ap)localObject).jQX.iterator();
                do
                {
                  if (!((Iterator)localObject).hasNext()) {
                    break;
                  }
                  localaq = (aq)((Iterator)localObject).next();
                } while (localaq == null);
                if ((localaq.jQY == null) || (localaq.jQY.size() == 0)) {
                  break label493;
                }
                localStringBuilder = new StringBuilder();
                j = 0;
                label302:
                if (j >= localaq.jQY.size()) {
                  break label454;
                }
                ab localab = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg((String)localaq.jQY.get(j));
                if ((localab == null) || (localab.dhP == 0L)) {
                  break label433;
                }
                localStringBuilder.append(localab.BL());
              }
            }
            for (;;)
            {
              if (j < localaq.jQY.size() - 1) {
                localStringBuilder.append("、");
              }
              j += 1;
              break label302;
              locald.jLt = an.Dx(((ap)localObject).jPA);
              break;
              locald.jLt = an.Dx(((ap)localObject).jPA);
              break;
              label433:
              localStringBuilder.append((String)localaq.jQY.get(j));
            }
            label454:
            localStringBuilder.append(" ");
            locald.jLk.add(localStringBuilder.toString());
            for (;;)
            {
              locald.jLk.add(localaq.jQf);
              break;
              label493:
              locald.jLk.add("");
            }
            label507:
            locald.scene = 10;
            locald.bYq = 1004;
            locald.position = i;
            localLinkedList.add(locald);
            i += 1;
          }
        }
      }
    }
  }
  
  private void aUx()
  {
    this.jOc = new HashMap();
    if ((this.jNZ.jRY == null) || (this.jNZ.jRY.jSD == null)) {}
    for (;;)
    {
      return;
      Iterator localIterator = this.jNZ.jRY.jSD.iterator();
      while (localIterator.hasNext())
      {
        cc localcc = (cc)localIterator.next();
        Object localObject = a(localcc.jOV);
        if (localObject != null)
        {
          this.jOc.put(((d)localObject).field_appId, Integer.valueOf(((d)localObject).versionCode));
          localObject = com.tencent.mm.plugin.ac.a.bmf().SW(((d)localObject).field_appId);
          if (localObject != null)
          {
            ((f)localObject).dk(localcc.jSF);
            if (!com.tencent.mm.plugin.ac.a.bmf().a((f)localObject, new String[0])) {
              x.e("MicroMsg.GamePBDataOverSea", "Store rank info failed, AppID: %s", new Object[] { ((f)localObject).field_appId });
            }
          }
        }
      }
    }
  }
  
  public final as aUy()
  {
    if (this.jNZ != null) {
      return this.jNZ.jRV;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/game/model/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */