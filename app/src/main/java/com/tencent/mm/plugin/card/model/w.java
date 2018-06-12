package com.tencent.mm.plugin.card.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.aqo;
import com.tencent.mm.protocal.c.ld;
import com.tencent.mm.protocal.c.le;
import com.tencent.mm.protocal.c.lh;
import com.tencent.mm.protocal.c.pm;
import com.tencent.mm.protocal.c.pn;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.Iterator;
import java.util.List;

public final class w
  extends com.tencent.mm.ab.l
  implements k
{
  private byte[] dZu;
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e diJ;
  private int hxe = 0;
  
  public w(int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneCardSync", "<init>, selector = %d", new Object[] { Integer.valueOf(1) });
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new ld();
    ((b.a)localObject).dIH = new le();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/cardsync";
    ((b.a)localObject).dIF = 558;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = new aqo();
    ((aqo)localObject).hym = ((String)g.Ei().DT().get(aa.a.sPR, null));
    ((aqo)localObject).latitude = am.axo().cXm;
    ((aqo)localObject).longitude = am.axo().cXn;
    ld localld = (ld)this.diG.dID.dIL;
    localld.rnx = 1;
    localld.rnz = ((aqo)localObject);
    localld.rnA = paramInt;
    this.hxe = paramInt;
  }
  
  private static boolean a(pm parampm)
  {
    if (parampm == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneCardSync", "processCmdItem fail, null cmd");
      return false;
    }
    ??? = ab.a(parampm.rtN);
    if ((??? == null) || (???.length == 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneCardSync", "processCmdItem fail, null buf");
      return false;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneCardSync", "processCmdItem, buf length = %d, cmdId = %d", new Object[] { Integer.valueOf(???.length), Integer.valueOf(parampm.rtM) });
    try
    {
      switch (parampm.rtM)
      {
      case 1: 
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NetSceneCardSync", "processCmdItem, unknown cmdId = %d", new Object[] { Integer.valueOf(parampm.rtM) });
        return false;
      }
    }
    catch (Exception parampm)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneCardSync", "processCmdItem fail, ex = %s", new Object[] { parampm.getMessage() });
      return false;
    }
    ??? = (lh)new lh().aG((byte[])???);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCardSync", "processCmdIem, card user item, Status = %d", new Object[] { Integer.valueOf(((lh)???).hcd) });
    switch (((lh)???).hcd)
    {
    case 0: 
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 7: 
    default: 
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneCardSync", "processCmdIem, card user item, unknown StateFlag = %d", new Object[] { Integer.valueOf(((lh)???).rou) });
        return false;
        parampm = am.axh();
        if (??? == null)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BatchGetCardMgr", "push fail, CardUserItem is null");
          break label477;
        }
        Object localObject2 = am.axi().xm(((lh)???).ros);
        String str = ((lh)???).ros;
        if (localObject2 == null) {}
        for (long l = 0L;; l = ((CardInfo)localObject2).field_updateSeq)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BatchGetCardMgr", "pushCardUserItem, cardUserId = %s, localSeq = %d, svrSeq = %d", new Object[] { str, Long.valueOf(l), Long.valueOf(((lh)???).rot) });
          if ((localObject2 == null) || (((CardInfo)localObject2).field_updateSeq != ((lh)???).rot)) {
            break;
          }
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BatchGetCardMgr", "push CardUserItem fail, card.field_updateSeq == item.UpdateSequence");
          break label477;
        }
        localObject2 = ak.a((lh)???);
        synchronized (parampm.dsN)
        {
          if (!parampm.hty.contains(localObject2)) {}
        }
        if (parampm.htz.contains(localObject2)) {
          break label477;
        }
        parampm.hty.add(localObject2);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BatchGetCardMgr", "pushCardUserItem, insertRet = %b", new Object[] { Boolean.valueOf(am.axj().b((com.tencent.mm.sdk.e.c)localObject2)) });
        break label477;
        break;
      }
    }
    label477:
    return true;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    parame1 = (ld)this.diG.dID.dIL;
    this.dZu = bi.WP(bi.oV((String)g.Ei().DT().get(282880, null)));
    if ((this.dZu == null) || (this.dZu.length == 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneCardSync", "doScene, keyBuf is null, init card sync~~~");
    }
    parame1.rny = ab.O(this.dZu);
    if (this.dZu == null) {}
    for (int i = 0;; i = this.dZu.length)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCardSync", "doScene, keyBuf.length = %d", new Object[] { Integer.valueOf(i) });
      return a(parame, this.diG, this);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q arg5, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneCardSync", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneCardSync", "onGYNetEnd, card sync fail, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    paramArrayOfByte = (le)this.diG.dIE.dIL;
    if (paramArrayOfByte.rnC == 1) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCardSync", "need do getCardsLayoutScene");
    }
    this.dZu = ab.a(paramArrayOfByte.rny, new byte[0]);
    if (paramArrayOfByte.rnB == null)
    {
      ??? = null;
      label133:
      if (??? != null) {
        break label258;
      }
      paramInt1 = 0;
      label140:
      if (this.dZu != null) {
        break label269;
      }
      paramInt2 = 0;
      label149:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCardSync", "onGYNetEnd, cmd list size = %d, synckey length = %d, continueFlag = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramArrayOfByte.rlm) });
      if ((??? == null) || (???.size() <= 0)) {
        break label404;
      }
      paramInt1 = 0;
      ??? = ???.iterator();
      label212:
      if (!???.hasNext()) {
        break label278;
      }
      if (a((pm)???.next())) {
        break label506;
      }
      paramInt1 += 1;
    }
    label258:
    label269:
    label278:
    label404:
    label506:
    for (;;)
    {
      break label212;
      ??? = paramArrayOfByte.rnB.hbG;
      break label133;
      paramInt1 = ???.size();
      break label140;
      paramInt2 = this.dZu.length;
      break label149;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCardSync", "onGYNetEnd, %d fail cmds", new Object[] { Integer.valueOf(paramInt1) });
      am.axh().awz();
      for (;;)
      {
        g.Ei().DT().set(282880, bi.bE(this.dZu));
        if (paramArrayOfByte.rlm > 0)
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneCardSync", "onGYNetEnd, should continue, continueFlag = %d", new Object[] { Integer.valueOf(paramArrayOfByte.rlm) });
          paramInt1 = a(this.dIX, this.diJ);
          if (paramInt1 > 0) {
            break;
          }
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneCardSync", "onGYNetEnd, doScene again fail, ret = %d", new Object[] { Integer.valueOf(paramInt1) });
          this.diJ.a(3, -1, paramString, this);
          return;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneCardSync", "cmdList == null or size is 0");
          com.tencent.mm.plugin.card.b.b localb = am.axh();
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BatchGetCardMgr", "retryAll, getNow = %b", new Object[] { Boolean.valueOf(true) });
          synchronized (localb.dsN)
          {
            localb.hty.addAll(localb.htz);
            localb.htz.clear();
            localb.awz();
          }
        }
      }
      this.diJ.a(0, 0, paramString, this);
      return;
    }
  }
  
  public final int getType()
  {
    return 558;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/model/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */