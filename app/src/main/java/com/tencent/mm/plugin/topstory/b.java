package com.tencent.mm.plugin.topstory;

import com.tencent.mm.g.a.os;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bv;
import com.tencent.mm.plugin.messenger.foundation.a.n;
import com.tencent.mm.plugin.websearch.api.ad;
import com.tencent.mm.plugin.websearch.api.p;
import com.tencent.mm.plugin.websearch.api.r;
import com.tencent.mm.protocal.c.bte;
import com.tencent.mm.protocal.c.btf;
import com.tencent.mm.protocal.c.ps;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import java.util.LinkedList;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONObject;

public final class b
  implements com.tencent.mm.plugin.topstory.a.e
{
  private com.tencent.mm.ab.e dKj = new b.2(this);
  private btf oyD;
  n oyE = new b.1(this);
  com.tencent.mm.plugin.topstory.a.c.a oyF;
  
  public b()
  {
    ((com.tencent.mm.plugin.messenger.foundation.a.o)g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class)).getSysCmdMsgExtension().a("mmsearch_reddot_new", this.oyE);
    this.oyD = new btf();
    b(this.oyD);
    btf localbtf = this.oyD;
    Object localObject = (String)g.Ei().DT().get(aa.a.sZB, "");
    if (!bi.oW((String)localObject))
    {
      localObject = ((String)localObject).split(",");
      if (localObject != null) {}
      try
      {
        if (localObject.length == 13)
        {
          localbtf.bWQ = localObject[0];
          localbtf.sqF = Integer.valueOf(localObject[1]).intValue();
          localbtf.pMn = Integer.valueOf(localObject[2]).intValue();
          localbtf.pMo = Integer.valueOf(localObject[3]).intValue();
          localbtf.pMm = Integer.valueOf(localObject[4]).intValue();
          localbtf.eiD = Long.valueOf(localObject[5]).longValue();
          localbtf.pLn = Integer.valueOf(localObject[6]).intValue();
          localbtf.sqG = Long.valueOf(localObject[7]).longValue();
          localbtf.text = localObject[8];
          localbtf.type = Integer.valueOf(localObject[9]).intValue();
          localbtf.csE = Integer.valueOf(localObject[10]).intValue();
          localbtf.sqE = Long.valueOf(localObject[11]).longValue();
          localbtf.bWP = localObject[12];
          return;
        }
        g.Ei().DT().a(aa.a.sZB, "");
        return;
      }
      catch (Exception localException)
      {
        g.Ei().DT().a(aa.a.sZB, "");
      }
    }
  }
  
  static void b(btf parambtf)
  {
    parambtf.bWP = "";
    parambtf.bWQ = "";
    parambtf.text = "";
  }
  
  private static long bHA()
  {
    Object localObject = g.Ei().DT().get(aa.a.sZA, null);
    if (localObject == null) {
      return 0L;
    }
    return ((Long)localObject).longValue();
  }
  
  private void bHv()
  {
    this.oyD = new btf();
    b(this.oyD);
    g.Ei().DT().a(aa.a.sZB, "");
  }
  
  private void bHy()
  {
    com.tencent.mm.storage.x localx = g.Ei().DT();
    aa.a locala = aa.a.sZB;
    btf localbtf = this.oyD;
    localx.a(locala, String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { localbtf.bWQ, Integer.valueOf(localbtf.sqF), Integer.valueOf(localbtf.pMn), Integer.valueOf(localbtf.pMo), Integer.valueOf(localbtf.pMm), Long.valueOf(localbtf.eiD), Integer.valueOf(localbtf.pLn), Long.valueOf(localbtf.sqG), localbtf.text, Integer.valueOf(localbtf.type), Integer.valueOf(localbtf.csE), Long.valueOf(localbtf.sqE), localbtf.bWP }));
  }
  
  private int bHz()
  {
    int j = 0;
    int i = 1;
    if (bi.oW(this.oyD.bWQ)) {
      j = -5;
    }
    label272:
    label275:
    for (;;)
    {
      return j;
      if (this.oyD.sqF == 1) {
        return -1;
      }
      if (this.oyD.pMn > d.qVN)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TopStory.TopStoryRedDotImpl", "msgid %s clientVersion %d invalid ,curVer is %d", new Object[] { this.oyD.bWQ, Integer.valueOf(this.oyD.pMn), Integer.valueOf(d.qVN) });
        return -2;
      }
      long l1 = this.oyD.sqG;
      long l2 = this.oyD.eiD;
      if (System.currentTimeMillis() > l1 + l2 * 1000L)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TopStory.TopStoryRedDotImpl", "msgid %s expired", new Object[] { this.oyD.bWQ });
        return -3;
      }
      boolean bool;
      if (p.zP(1) >= this.oyD.pLn)
      {
        bool = true;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TopStory.TopStoryRedDotImpl", "h5 version valid ? %b, red.h5 %d, cur.h5 %s, red.timestamp %d, last rec.timestamp %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.oyD.pLn), Integer.valueOf(p.zP(1)), Long.valueOf(this.oyD.sqE), Long.valueOf(bHA()) });
        if ((p.zP(1) < this.oyD.pLn) || (this.oyD.sqE <= bHA())) {
          break label272;
        }
      }
      for (;;)
      {
        if (i != 0) {
          break label275;
        }
        return -4;
        bool = false;
        break;
        i = 0;
      }
    }
  }
  
  public final void a(btf parambtf)
  {
    if ((this.oyD != null) && (!bi.oW(this.oyD.bWQ)) && (this.oyD.csE != 1)) {
      switch (bHz())
      {
      }
    }
    for (;;)
    {
      this.oyD = parambtf;
      bHy();
      ad.aS(10, this.oyD.bWQ);
      if (this.oyD.pMm != 3) {
        break;
      }
      Object localObject = r.PX("discoverRecommendEntry").optString("wording");
      parambtf = new bte();
      parambtf.sqA = UUID.randomUUID().toString();
      parambtf.scene = 0;
      parambtf.fuu = "";
      parambtf.bHt = ((String)localObject);
      localObject = p.zK(0);
      parambtf.bJK = ((String)localObject);
      parambtf.bWr = ((String)localObject);
      localObject = new ps();
      ((ps)localObject).aAL = "redPointMsgId";
      ((ps)localObject).rtV = this.oyD.bWQ;
      parambtf.pKZ.add(localObject);
      localObject = new ps();
      ((ps)localObject).aAL = "netType";
      ((ps)localObject).rtV = p.bjC();
      parambtf.pKZ.add(localObject);
      localObject = new ps();
      ((ps)localObject).aAL = "time_zone_min";
      ((ps)localObject).rtV = String.valueOf(-TimeZone.getDefault().getRawOffset() / 1000 / 60);
      parambtf.pKZ.add(localObject);
      this.oyF = new com.tencent.mm.plugin.topstory.a.c.a(parambtf);
      g.DF().a(this.oyF.getType(), this.dKj);
      g.DF().a(this.oyF, 0);
      return;
      ad.aS(15, this.oyD.bWQ);
      continue;
      ad.aS(13, this.oyD.bWQ);
    }
    parambtf = new os();
    com.tencent.mm.sdk.b.a.sFg.m(parambtf);
  }
  
  public final boolean bHt()
  {
    int i = bHz();
    JSONObject localJSONObject;
    boolean bool;
    if (i == 0)
    {
      localJSONObject = r.PX("discoverRecommendEntry");
      if (((com.tencent.mm.plugin.welab.a.a.a)g.l(com.tencent.mm.plugin.welab.a.a.a.class)).RZ("labs_browse"))
      {
        if (!((com.tencent.mm.plugin.welab.a.a.a)g.l(com.tencent.mm.plugin.welab.a.a.a.class)).RX("labs_browse")) {
          break label122;
        }
        bool = true;
      }
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TopStory.TopStoryRedDotImpl", "recommend show %b", new Object[] { Boolean.valueOf(bool) });
      if (bool)
      {
        return true;
        if (localJSONObject.optInt("entrySwitch") != 1) {
          break label122;
        }
        bool = true;
        continue;
        if (i == -3)
        {
          ad.aS(14, this.oyD.bWQ);
          bHv();
        }
      }
      return false;
      label122:
      bool = false;
    }
  }
  
  public final void bHu()
  {
    if (bHt())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TopStory.TopStoryRedDotImpl", "click red dot, report and clear red dot");
      ad.aS(12, this.oyD.bWQ);
      bHv();
    }
  }
  
  public final btf bHw()
  {
    return this.oyD;
  }
  
  public final void bHx()
  {
    if (this.oyD.csE != 1)
    {
      this.oyD.csE = 1;
      ad.aS(11, this.oyD.bWQ);
      bHy();
    }
  }
  
  public final void fu(long paramLong)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.TopStory.TopStoryRedDotImpl", "rec updateRedDotTimestamp %d", new Object[] { Long.valueOf(paramLong) });
    g.Ei().DT().a(aa.a.sZA, Long.valueOf(paramLong));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/topstory/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */