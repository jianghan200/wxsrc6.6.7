package com.tencent.mm.plugin.card.sharecard.model;

import android.text.TextUtils;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.card.d.f;
import com.tencent.mm.protocal.c.ahu;
import com.tencent.mm.protocal.c.ahv;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class e
  extends com.tencent.mm.ab.l
  implements k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  public LinkedList<String> hwZ;
  public LinkedList<String> hxa = new LinkedList();
  
  public e(LinkedList<String> paramLinkedList)
  {
    this.hwZ = paramLinkedList;
    b.a locala = new b.a();
    locala.dIG = new ahu();
    locala.dIH = new ahv();
    locala.uri = "/cgi-bin/micromsg-bin/getsharecardlist";
    locala.dIF = 903;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((ahu)this.diG.dID.dIL).rgw = paramLinkedList;
    x.i("MicroMsg.NetSceneGetShareCardList", "card_ids length is " + paramLinkedList.size());
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(903), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      x.e("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd, batch get fail, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramq = (ahv)this.diG.dIE.dIL;
    x.v("MicroMsg.NetSceneGetShareCardList", "json:" + paramq.hwU);
    paramq = paramq.hwU;
    if (TextUtils.isEmpty(paramq))
    {
      x.e("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd fail, resp json_ret is null");
      this.diJ.a(4, -1, null, this);
      return;
    }
    long l1 = System.currentTimeMillis();
    paramq = f.xN(paramq);
    if (paramq != null)
    {
      if (this.hwZ != null) {
        this.hxa.addAll(this.hwZ);
      }
      long l2 = System.currentTimeMillis();
      long l3 = g.Ei().dqq.dO(Thread.currentThread().getId());
      paramInt1 = 0;
      paramArrayOfByte = paramq.iterator();
      int i = 0;
      Object localObject;
      while (paramArrayOfByte.hasNext())
      {
        localObject = (ShareCardInfo)paramArrayOfByte.next();
        int j = paramInt1 + 1;
        if (!com.tencent.mm.plugin.card.d.l.a((ShareCardInfo)localObject))
        {
          i += 1;
          this.hxa.remove(((ShareCardInfo)localObject).field_card_id);
          paramInt1 = j;
        }
        else
        {
          x.i("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd update share card count");
          com.tencent.mm.plugin.card.sharecard.a.b.aa(ad.getContext(), ((ShareCardInfo)localObject).field_card_tp_id);
          paramInt1 = j;
          if (((ShareCardInfo)localObject).field_status != 0)
          {
            com.tencent.mm.plugin.card.sharecard.a.b.cb(((ShareCardInfo)localObject).field_card_id, ((ShareCardInfo)localObject).field_card_tp_id);
            paramInt1 = j;
          }
        }
      }
      g.Ei().dqq.gp(l3);
      x.i("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd do transaction use time %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l2) });
      x.e("MicroMsg.NetSceneGetShareCardList", "onGYNetEnd, deal CardObject %d fail of %d", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt1) });
      com.tencent.mm.plugin.card.d.l.azS();
      if (paramq.size() > 0)
      {
        paramInt1 = (int)(System.currentTimeMillis() - l1);
        paramArrayOfByte = new ArrayList();
        localObject = new IDKey();
        ((IDKey)localObject).SetID(281);
        ((IDKey)localObject).SetKey(17);
        ((IDKey)localObject).SetValue(1L);
        IDKey localIDKey1 = new IDKey();
        localIDKey1.SetID(281);
        localIDKey1.SetKey(18);
        localIDKey1.SetValue(paramInt1);
        IDKey localIDKey2 = new IDKey();
        localIDKey2.SetID(281);
        localIDKey2.SetKey(19);
        localIDKey2.SetValue(paramq.size());
        IDKey localIDKey3 = new IDKey();
        localIDKey3.SetID(281);
        localIDKey3.SetKey(21);
        localIDKey3.SetValue(paramInt1 / paramq.size());
        paramArrayOfByte.add(localObject);
        paramArrayOfByte.add(localIDKey1);
        paramArrayOfByte.add(localIDKey2);
        paramArrayOfByte.add(localIDKey3);
        com.tencent.mm.plugin.report.service.h.mEJ.b(paramArrayOfByte, true);
      }
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 903;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */