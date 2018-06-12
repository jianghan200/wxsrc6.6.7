package com.tencent.mm.plugin.card.sharecard.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.sharecard.a.a;
import com.tencent.mm.plugin.card.sharecard.a.a.2;
import com.tencent.mm.protocal.c.bmw;
import com.tencent.mm.protocal.c.bmx;
import com.tencent.mm.protocal.c.bmy;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.Iterator;
import java.util.List;

public final class h
  extends l
  implements com.tencent.mm.network.k
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  
  public h()
  {
    b.a locala = new b.a();
    locala.dIG = new bmx();
    locala.dIH = new bmy();
    locala.uri = "/cgi-bin/micromsg-bin/sharecardsync";
    locala.dIF = 906;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((bmx)this.diG.dID.dIL).slc = ((Long)g.Ei().DT().get(aa.a.sQb, Long.valueOf(0L))).longValue();
  }
  
  private static boolean a(bmw parambmw)
  {
    if (parambmw == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneShareCardSync", "processShareCardCmdItem fail, null cmd");
      return false;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneShareCardSync", "processShareCardCmdItem, item card_id = %s, seq = %d", new Object[] { parambmw.cac, Long.valueOf(parambmw.slb) });
    for (;;)
    {
      boolean bool;
      try
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneShareCardSync", "processShareCardCmdItem, card user item, Status = %d", new Object[] { Integer.valueOf(parambmw.hyk) });
        switch (parambmw.hyk)
        {
        case 0: 
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneShareCardSync", "processShareCardCmdItem, card user item, unknown StateFlag = %d", new Object[] { Integer.valueOf(parambmw.hyk) });
          return false;
        }
      }
      catch (Exception parambmw)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneShareCardSync", "processShareCardCmdItem fail, ex = %s", new Object[] { parambmw.getMessage() });
        return false;
      }
      Object localObject1 = am.axp();
      if (parambmw == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr push fail, ShareCardSyncItem is null");
        if ((parambmw.hyk == 0) || (parambmw.hyk == 5)) {
          break;
        }
        localObject1 = (String)g.Ei().DT().get(aa.a.sQj, "");
        bool = ((Boolean)g.Ei().DT().get(aa.a.sQk, Boolean.valueOf(false))).booleanValue();
        if ((bool) && (!bi.oW((String)localObject1)) && (((String)localObject1).equals(parambmw.cac)))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneShareCardSync", "need check is true, do clearRedDotAndWording()");
          com.tencent.mm.plugin.card.b.k.awV();
          break;
        }
      }
      else
      {
        ??? = am.axq().xC(parambmw.cac);
        Object localObject3 = parambmw.cac;
        long l;
        if (??? == null)
        {
          l = 0L;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr pushShareCardSyncItem, card_id = %s, localSeq = %d, svrSeq = %d", new Object[] { localObject3, Long.valueOf(l), Long.valueOf(parambmw.slb) });
          if ((??? != null) && (((ShareCardInfo)???).field_updateSeq == parambmw.slb)) {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr push ShareCardSyncItem fail, card.field_updateSeq == item.seq");
          }
        }
        else
        {
          l = ((ShareCardInfo)???).field_updateSeq;
          continue;
        }
        localObject3 = n.b(parambmw);
        synchronized (((a)localObject1).dsN)
        {
          if (!((a)localObject1).hty.contains(localObject3)) {}
        }
        if (((a)localObject1).htz.contains(localObject3)) {
          continue;
        }
        ((a)localObject1).hty.add(localObject3);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr pushShareCardSyncItem, insertRet = %b", new Object[] { Boolean.valueOf(am.axr().b((c)localObject3)) });
        continue;
        localObject1 = am.axp();
        if (parambmw == null)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ShareCardBatchGetCardMgr", "delete item is  null");
          continue;
        }
        ??? = am.axq().xC(parambmw.cac);
        am.axq().xB(parambmw.cac);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShareCardBatchGetCardMgr", "delete share card for id " + parambmw.cac);
        if (??? != null) {
          com.tencent.mm.plugin.card.sharecard.a.b.a(ad.getContext(), (com.tencent.mm.plugin.card.base.b)???);
        }
        for (;;)
        {
          ((a)localObject1).auM();
          break;
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ShareCardBatchGetCardMgr", "info is null");
        }
      }
      if (bool)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneShareCardSync", "need check is true, but card id is diff!");
        break;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneShareCardSync", "need check is false");
      break;
    }
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q arg5, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneShareCardSync", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", new Object[] { Integer.valueOf(906), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneShareCardSync", "onGYNetEnd, share card sync fail, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramArrayOfByte = (bmy)this.diG.dIE.dIL;
    if (paramArrayOfByte.dzs == null)
    {
      ??? = null;
      if (??? != null) {
        break label227;
      }
      paramInt1 = 0;
      label117:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneShareCardSync", "onGYNetEnd, share card cmd list size = %d, continueFlag = %d, req = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramArrayOfByte.sld), Long.valueOf(paramArrayOfByte.slb) });
      if ((??? == null) || (???.size() <= 0)) {
        break label363;
      }
      paramInt1 = 0;
      ??? = ???.iterator();
      label184:
      if (!???.hasNext()) {
        break label238;
      }
      if (a((bmw)???.next())) {
        break label450;
      }
      paramInt1 += 1;
    }
    label227:
    label238:
    label363:
    label450:
    for (;;)
    {
      break label184;
      ??? = paramArrayOfByte.dzs;
      break;
      paramInt1 = ???.size();
      break label117;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneShareCardSync", "onGYNetEnd, %d fail share cmds", new Object[] { Integer.valueOf(paramInt1) });
      am.axp().awz();
      for (;;)
      {
        g.Ei().DT().a(aa.a.sQb, Long.valueOf(paramArrayOfByte.slb));
        am.axp().hyc = paramArrayOfByte.hyc;
        if (paramArrayOfByte.sld > 0)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneShareCardSync", "onGYNetEnd, should continue, continueFlag = %d", new Object[] { Integer.valueOf(paramArrayOfByte.sld) });
          ??? = am.axp();
          ???.mHandler.post(new a.2(???));
        }
        this.diJ.a(paramInt2, paramInt3, paramString, this);
        return;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneShareCardSync", "share cmdList == null or size is 0");
        a locala = am.axp();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ShareCardBatchGetCardMgr", "scsmgr sharecardsync retryAll, getNow = %b", new Object[] { Boolean.valueOf(true) });
        synchronized (locala.dsN)
        {
          locala.hty.addAll(locala.htz);
          locala.htz.clear();
          locala.awz();
        }
      }
    }
  }
  
  public final int getType()
  {
    return 906;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */