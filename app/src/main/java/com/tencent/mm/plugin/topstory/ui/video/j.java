package com.tencent.mm.plugin.topstory.ui.video;

import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.topstory.PluginTopStory;
import com.tencent.mm.plugin.topstory.c;
import com.tencent.mm.plugin.websearch.api.n;
import com.tencent.mm.plugin.websearch.api.p;
import com.tencent.mm.protocal.c.bgx;
import com.tencent.mm.protocal.c.bth;
import com.tencent.mm.protocal.c.bti;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public final class j
{
  a oAb;
  Map<String, com.tencent.mm.plugin.topstory.a.b.b> oAk = new HashMap();
  public int oAl = 1;
  com.tencent.mm.plugin.topstory.a.b.a oAm;
  private bti ozj;
  
  public final void a(bti parambti)
  {
    if (parambti == null) {
      x.i("MicroMSsg.TopStory.TopStoryVideoReportMgr", "setVideoInfoExpose null");
    }
    com.tencent.mm.plugin.topstory.a.b.b localb = new com.tencent.mm.plugin.topstory.a.b.b(parambti);
    if (!this.oAk.containsKey(localb.ozj.sqS))
    {
      this.oAk.put(localb.ozj.sqS, localb);
      x.i("MicroMSsg.TopStory.TopStoryVideoReportMgr", "setVideoInfoExpose %s", new Object[] { parambti });
      return;
    }
    ((com.tencent.mm.plugin.topstory.a.b.b)this.oAk.get(localb.ozj.sqS)).ozj = parambti;
  }
  
  public final void a(bti parambti, int paramInt, String paramString)
  {
    this.ozj = parambti;
    this.oAm = new com.tencent.mm.plugin.topstory.a.b.a();
    this.oAm.oyQ = System.currentTimeMillis();
    this.oAm.oyY = 2L;
    this.oAm.oyX = this.oAl;
    this.oAm.position = (paramInt + 1);
    bth localbth = this.oAb.bHT();
    this.oAm.jHv = (localbth.scene + "_" + localbth.fuu + "_" + localbth.sqL);
    if (this.oAb.bHQ().jMc) {
      this.oAm.oyW = 1L;
    }
    this.oAl = 1;
    x.i("MicroMSsg.TopStory.TopStoryVideoReportMgr", "startVideoPlay %s %s %s reportInfo: %d %d", new Object[] { paramString, parambti.sqS, parambti.title, Long.valueOf(this.oAm.oyX), Long.valueOf(this.oAm.oyY) });
  }
  
  public final void b(bth parambth)
  {
    ((PluginTopStory)g.n(PluginTopStory.class)).getReporter();
    bti localbti = this.ozj;
    com.tencent.mm.plugin.topstory.a.b.a locala = this.oAm;
    x.i("MicroMsg.TopStory.TopStoryReporterImpl", "stopVideoPlay: %s %s", new Object[] { localbti, locala });
    if ((localbti != null) && (locala != null))
    {
      locala.oyR = System.currentTimeMillis();
      locala.oyS = (locala.oyR - locala.oyQ);
      Object localObject = c.a(parambth, localbti, locala);
      if (!bi.oW((String)localObject))
      {
        bgx localbgx = new bgx();
        localbgx.shQ = ((String)localObject);
        x.i("MicroMsg.TopStory.TopStoryReporterImpl", "build14436VideoPlayReportString %s", new Object[] { localbgx.shQ });
        localObject = new n(localbgx);
        g.DF().a((l)localObject, 0);
      }
      parambth = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { Integer.valueOf(parambth.scene), localbti.sqS, Long.valueOf(localbti.srb), "mp4", Integer.valueOf(localbti.sqR), Integer.valueOf(0), Long.valueOf(locala.oyQ), Long.valueOf(locala.oyR), Long.valueOf(locala.oyT), Long.valueOf(locala.oyS), Long.valueOf(locala.oyV), Long.valueOf(locala.oyW), Long.valueOf(locala.oyX), Long.valueOf(locala.oyY), Long.valueOf(locala.ozb), Long.valueOf(locala.ozc), Long.valueOf(locala.oyU), Long.valueOf(locala.ozd), Long.valueOf(locala.oze), Long.valueOf(locala.ozg), Long.valueOf(locala.ozh), locala.jHv, Long.valueOf(locala.position), p.bjC(), Long.valueOf(locala.ozf), Long.valueOf(locala.ozi), Long.valueOf(locala.oyZ), Long.valueOf(locala.oza) });
      x.i("MicroMsg.TopStory.TopStoryReporterImpl", "stopVideoPlay 15414 %s", new Object[] { parambth });
      com.tencent.mm.plugin.report.f.mDy.k(15414, parambth);
      com.tencent.mm.plugin.topstory.a.a.a.a(locala);
    }
    this.ozj = null;
    this.oAm = null;
  }
  
  public final void b(bti parambti)
  {
    a(parambti);
    ((com.tencent.mm.plugin.topstory.a.b.b)this.oAk.get(parambti.sqS)).ozk = true;
  }
  
  public final void bIe()
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator = this.oAk.values().iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.topstory.a.b.b localb = (com.tencent.mm.plugin.topstory.a.b.b)localIterator.next();
      if (!localb.mGh)
      {
        localHashSet.add(localb);
        localb.mGh = true;
      }
    }
    if (this.oAb != null) {
      ((com.tencent.mm.plugin.topstory.a.b)g.n(com.tencent.mm.plugin.topstory.a.b.class)).getReporter().a(this.oAb.bHT(), localHashSet);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/topstory/ui/video/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */