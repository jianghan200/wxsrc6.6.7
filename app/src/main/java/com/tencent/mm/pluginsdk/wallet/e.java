package com.tencent.mm.pluginsdk.wallet;

import android.content.Context;
import com.tencent.mm.g.a.ti;
import com.tencent.mm.g.a.ti.b;
import com.tencent.mm.g.a.tj;
import com.tencent.mm.g.a.tj.b;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.comm.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import com.tencent.mm.y.g.a;
import java.util.Iterator;
import java.util.List;

public final class e
{
  public static String Uk(String paramString)
  {
    Object localObject = ((i)g.l(i.class)).bcY().Hd(paramString);
    int k;
    int j;
    int i;
    if (localObject != null)
    {
      x.i("MicroMsg.WalletConvDelCheckLogic", "checkUnProcessWalletMsgCount, msgInfoList size: %s", new Object[] { Integer.valueOf(((List)localObject).size()) });
      Iterator localIterator = ((List)localObject).iterator();
      k = 0;
      j = 0;
      i = 0;
      while (localIterator.hasNext())
      {
        localObject = (bd)localIterator.next();
        if (!af((bd)localObject)) {
          break label309;
        }
        if (((bd)localObject).getType() == 419430449)
        {
          k += 1;
        }
        else
        {
          if (((bd)localObject).getType() != 436207665) {
            break label309;
          }
          localObject = ((cm)localObject).field_content;
          if (localObject == null) {
            break label312;
          }
        }
      }
    }
    label309:
    label312:
    for (localObject = g.a.gp((String)localObject);; localObject = null)
    {
      if (localObject != null)
      {
        if ("1001".equals(((g.a)localObject).dyb))
        {
          j += 1;
          break;
        }
        i += 1;
      }
      for (;;)
      {
        break;
        if ((i > 0) || (j > 0) || (k > 0))
        {
          if (s.fq(paramString)) {
            return ad.getContext().getString(a.h.wallet_delete_note_aa_stub, new Object[] { Integer.valueOf(j) });
          }
          if ((i > 0) && (k <= 0)) {
            return ad.getContext().getString(a.h.wallet_delete_note_luckymoney_stub, new Object[] { Integer.valueOf(i) });
          }
          if ((k > 0) && (i <= 0)) {
            return ad.getContext().getString(a.h.wallet_delete_note_remittance_stub, new Object[] { Integer.valueOf(k) });
          }
          if ((k > 0) && (i > 0)) {
            return ad.getContext().getString(a.h.wallet_delete_note_luckymoney_remittance_stub, new Object[] { Integer.valueOf(i), Integer.valueOf(k) });
          }
        }
        return null;
      }
    }
  }
  
  public static boolean af(bd parambd)
  {
    Object localObject1 = null;
    if (parambd.getType() == 419430449)
    {
      if (parambd.field_isSend != 0) {
        break label310;
      }
      localObject1 = parambd.field_content;
      if (localObject1 == null) {
        break label319;
      }
    }
    label310:
    label312:
    label319:
    for (parambd = g.a.J((String)localObject1, parambd.field_reserved);; parambd = null)
    {
      int i;
      if (parambd != null)
      {
        localObject1 = new tj();
        ((tj)localObject1).ceU.bXz = parambd.dxB;
        a.sFg.m((b)localObject1);
        j = ((tj)localObject1).ceV.status;
        i = j;
        if (j <= 0) {
          i = parambd.dxy;
        }
        if ((i >= 0) && ((i == 1) || (i == 7)))
        {
          return true;
          if ((parambd.getType() == 436207665) && (parambd.field_isSend == 0))
          {
            Object localObject2 = parambd.field_content;
            if (localObject2 != null) {
              localObject1 = g.a.gp((String)localObject2);
            }
            if (localObject1 != null) {
              if ((!"1001".equals(((g.a)localObject1).dyb)) && (!s.fq(parambd.field_talker)))
              {
                parambd = new ti();
                if (!bi.oW(((g.a)localObject1).dyc))
                {
                  parambd.ceP.ceR = ((g.a)localObject1).dyc;
                  a.sFg.m(parambd);
                  if (parambd.ceQ.ceT == 0) {
                    return true;
                  }
                }
              }
              else if (s.fq(parambd.field_talker))
              {
                parambd = q.GF();
                if (bi.cX(((g.a)localObject1).dyr)) {
                  break label312;
                }
                localObject1 = ((g.a)localObject1).dyr.iterator();
                while (((Iterator)localObject1).hasNext())
                {
                  localObject2 = ((String)((Iterator)localObject1).next()).split(",");
                  if ((localObject2.length == 3) && (localObject2[0].equals(parambd))) {
                    i = bi.getInt(localObject2[2], -1);
                  }
                }
              }
            }
          }
        }
      }
      for (int j = 1;; j = 0)
      {
        return (j != 0) && (i == 1);
        i = 0;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/pluginsdk/wallet/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */