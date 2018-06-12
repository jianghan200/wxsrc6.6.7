package com.tencent.mm.plugin.topstory;

import android.os.HandlerThread;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.topstory.a.b.a;
import com.tencent.mm.plugin.topstory.a.b.b;
import com.tencent.mm.plugin.topstory.a.f;
import com.tencent.mm.plugin.websearch.api.n;
import com.tencent.mm.protocal.c.bgx;
import com.tencent.mm.protocal.c.bth;
import com.tencent.mm.protocal.c.bti;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class c
  implements f
{
  ag oyH = new ag(new ah("TopStoryReportExposeTask").lnJ.getLooper());
  Map<Long, a> oyI = new ConcurrentHashMap();
  
  public static String a(bth parambth, bti parambti, a parama)
  {
    StringBuilder localStringBuilder = new StringBuilder("");
    localStringBuilder.append("ismediaplay=1");
    localStringBuilder.append("&searchid=");
    localStringBuilder.append(parambth.fuu);
    localStringBuilder.append("&scene=");
    localStringBuilder.append(parambth.scene);
    localStringBuilder.append("&businesstype=3");
    localStringBuilder.append("&mediatype=2");
    localStringBuilder.append("&rec_category=");
    localStringBuilder.append(parambth.sqL);
    localStringBuilder.append("&docid=");
    localStringBuilder.append(parambti.sqZ);
    localStringBuilder.append("&query=");
    try
    {
      localStringBuilder.append(com.tencent.mm.compatible.util.p.encode(parambth.bHt, "utf-8"));
      localStringBuilder.append("&title=");
      try
      {
        localStringBuilder.append(com.tencent.mm.compatible.util.p.encode(parambti.title, "utf-8"));
        localStringBuilder.append("&duration=");
        localStringBuilder.append(parambti.sqR * 1000);
        localStringBuilder.append("&mediaid=");
        localStringBuilder.append(parambti.sqS);
        if (parama != null)
        {
          localStringBuilder.append("&startplaytime=");
          localStringBuilder.append(parama.oyQ);
          localStringBuilder.append("&endplaytime=");
          localStringBuilder.append(parama.oyR);
          localStringBuilder.append("&playtime=");
          localStringBuilder.append(parama.oyS);
          localStringBuilder.append("&lastplayms=");
          localStringBuilder.append(parama.oyT);
          localStringBuilder.append("&autoplay=");
          localStringBuilder.append(parama.oyX);
          localStringBuilder.append("&hasplayended=");
          localStringBuilder.append(parama.oyU);
          localStringBuilder.append("&hasquickplay=");
          localStringBuilder.append(parama.oyV);
          localStringBuilder.append("&hasfullscreen=");
          localStringBuilder.append(parama.oyW);
          localStringBuilder.append("&hitpreload=");
          localStringBuilder.append(parama.oyY);
          localStringBuilder.append("&firstloadtime=");
          localStringBuilder.append(parama.ozb);
          localStringBuilder.append("&downloadfinishtime=");
          localStringBuilder.append(parama.ozc);
          localStringBuilder.append("&firstmoovreadytime=");
          localStringBuilder.append(parama.ozd);
          localStringBuilder.append("&firstdataavailabletime=");
          localStringBuilder.append(parama.ozg);
        }
        return localStringBuilder.toString();
      }
      catch (Exception parambth)
      {
        for (;;) {}
      }
    }
    catch (Exception parambth)
    {
      for (;;) {}
    }
  }
  
  private static String b(bth parambth, bti parambti, int paramInt1, int paramInt2, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder("");
    for (;;)
    {
      try
      {
        localStringBuilder.append("scene=");
        localStringBuilder.append(parambth.scene);
        localStringBuilder.append("&");
        localStringBuilder.append("businesstype=3");
        localStringBuilder.append("&");
        localStringBuilder.append("mediatype=2");
        localStringBuilder.append("&");
        localStringBuilder.append("docid=");
        localStringBuilder.append(parambti.sqZ);
        localStringBuilder.append("&");
        localStringBuilder.append("typepos=");
        localStringBuilder.append("0");
        localStringBuilder.append("&");
        localStringBuilder.append("docpos=");
        localStringBuilder.append(paramInt1 + 1);
        localStringBuilder.append("&");
        localStringBuilder.append("searchid=");
        localStringBuilder.append(parambth.fuu);
        localStringBuilder.append("&");
        localStringBuilder.append("ishomepage=");
        localStringBuilder.append(0);
        localStringBuilder.append("&rec_category=");
        localStringBuilder.append(parambti.sqT);
        localStringBuilder.append("&");
        localStringBuilder.append("timestamp=");
        localStringBuilder.append(System.currentTimeMillis());
        localStringBuilder.append("&");
        localStringBuilder.append("clicktype=");
        localStringBuilder.append(paramInt2);
        localStringBuilder.append("&");
        localStringBuilder.append("clickcontent=");
      }
      catch (Exception parambth)
      {
        continue;
      }
      try
      {
        localStringBuilder.append(com.tencent.mm.compatible.util.p.encode(paramString, "utf-8"));
        localStringBuilder.append("&");
        localStringBuilder.append("clicksource=");
        localStringBuilder.append("4");
        localStringBuilder.append("&");
        localStringBuilder.append("sceneactiontype=");
        localStringBuilder.append(1);
        localStringBuilder.append("&");
        localStringBuilder.append("query=");
        try
        {
          localStringBuilder.append(com.tencent.mm.compatible.util.p.encode(parambth.bHt, "utf-8"));
          localStringBuilder.append("&");
          localStringBuilder.append("resulttype=");
          localStringBuilder.append(parambti.sra);
          localStringBuilder.append("&");
          localStringBuilder.append("sessionid=");
          localStringBuilder.append(com.tencent.mm.plugin.websearch.api.p.zK(parambth.scene));
          localStringBuilder.append("&");
          localStringBuilder.append("expand=");
          try
          {
            localStringBuilder.append(com.tencent.mm.compatible.util.p.encode(parambti.sqV, "utf-8"));
            localStringBuilder.append("&");
            localStringBuilder.append("title=");
            try
            {
              localStringBuilder.append(com.tencent.mm.compatible.util.p.encode(parambti.title, "utf-8"));
              localStringBuilder.append("&");
              localStringBuilder.append("nettype=");
              if (ao.isWifi(ad.getContext()))
              {
                localStringBuilder.append("wifi");
                localStringBuilder.append("&");
                localStringBuilder.append("itemtype=");
                localStringBuilder.append(parambti.sqW);
                return localStringBuilder.toString();
              }
              if (ao.is4G(ad.getContext()))
              {
                localStringBuilder.append("4g");
                continue;
              }
              localStringBuilder.append("3g");
            }
            catch (Exception parambth) {}
          }
          catch (Exception parambth) {}
        }
        catch (Exception paramString) {}
      }
      catch (Exception paramString) {}
    }
  }
  
  public final void a(bth parambth, bti parambti, int paramInt1, int paramInt2, String paramString)
  {
    parambth = b(parambth, parambti, paramInt1, paramInt2, paramString);
    if (!bi.oW(parambth))
    {
      parambti = new bgx();
      parambti.shQ = parambth;
      x.i("MicroMsg.TopStory.TopStoryReporterImpl", "do12721ClickVideoReport %s", new Object[] { parambti.shQ });
      parambth = new n(parambti);
      g.DF().a(parambth, 0);
    }
  }
  
  public final void a(bth parambth, HashSet<b> paramHashSet)
  {
    if (paramHashSet.size() == 0) {}
    a locala;
    do
    {
      for (;;)
      {
        return;
        locala = (a)this.oyI.get(Long.valueOf(parambth.sqL));
        if (locala == null) {
          break;
        }
        x.i("MicroMsg.TopStory.TopStoryReporterImpl", "reportExposeVideoInfo hit cached task %d", new Object[] { Integer.valueOf(paramHashSet.size()) });
        parambth = paramHashSet.iterator();
        while (parambth.hasNext())
        {
          paramHashSet = (b)parambth.next();
          locala.oyJ.add(paramHashSet);
        }
      }
      x.i("MicroMsg.TopStory.TopStoryReporterImpl", "reportExposeVideoInfo new task %d", new Object[] { Integer.valueOf(paramHashSet.size()) });
      locala = new a((byte)0);
      locala.createTime = System.currentTimeMillis();
      paramHashSet = paramHashSet.iterator();
      while (paramHashSet.hasNext())
      {
        b localb = (b)paramHashSet.next();
        locala.oyJ.add(localb);
      }
      locala.oyK = parambth;
    } while (locala.oyJ.size() <= 0);
    this.oyH.removeCallbacksAndMessages(null);
    this.oyH.postDelayed(locala, 5000L);
    this.oyI.put(Long.valueOf(parambth.sqL), locala);
  }
  
  private final class a
    implements Runnable
  {
    long createTime;
    HashSet<b> oyJ = new HashSet();
    bth oyK;
    
    private a() {}
    
    private static String a(List<b> paramList, bth parambth)
    {
      StringBuilder localStringBuilder1;
      try
      {
        if (paramList.size() == 0) {
          return null;
        }
        localStringBuilder1 = new StringBuilder("");
        localStringBuilder1.append("isexpose=1&content=");
        Object localObject1 = new StringBuilder("");
        Object localObject2 = paramList.iterator();
        Object localObject3;
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (b)((Iterator)localObject2).next();
          bti localbti = ((b)localObject3).ozj;
          ((StringBuilder)localObject1).append(localbti.bHu);
          ((StringBuilder)localObject1).append(":");
          ((StringBuilder)localObject1).append(localbti.sqZ);
          ((StringBuilder)localObject1).append(":");
          ((StringBuilder)localObject1).append(((b)localObject3).jyY);
          ((StringBuilder)localObject1).append(":");
          ((StringBuilder)localObject1).append(localbti.sqV);
          ((StringBuilder)localObject1).append(";");
        }
        try
        {
          localStringBuilder1.append(com.tencent.mm.compatible.util.p.encode(((StringBuilder)localObject1).toString(), "utf-8"));
          localStringBuilder1.append("&resulttype=");
          localObject1 = paramList.iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = ((b)((Iterator)localObject1).next()).ozj;
            localStringBuilder1.append(((bti)localObject2).bHu);
            localStringBuilder1.append(":");
            localStringBuilder1.append(((bti)localObject2).sra);
            localStringBuilder1.append(";");
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            x.printErrStackTrace("MicroMsg.TopStory.TopStoryReporterImpl", localException, "", new Object[0]);
          }
          localStringBuilder1.append("&expand=");
          localStringBuilder2 = new StringBuilder("");
          localObject2 = paramList.iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject3 = ((b)((Iterator)localObject2).next()).ozj;
            localStringBuilder2.append(((bti)localObject3).bHu);
            localStringBuilder2.append(":");
            localStringBuilder2.append(((bti)localObject3).sqX);
            localStringBuilder2.append(";");
          }
          try
          {
            localStringBuilder1.append(com.tencent.mm.compatible.util.p.encode(localStringBuilder2.toString(), "utf-8"));
            localStringBuilder1.append("&itemtype=");
            localStringBuilder2 = new StringBuilder("");
            paramList = paramList.iterator();
            while (paramList.hasNext())
            {
              localStringBuilder2.append(((b)paramList.next()).ozj.sqW);
              localStringBuilder2.append(";");
            }
          }
          catch (UnsupportedEncodingException localUnsupportedEncodingException)
          {
            for (;;)
            {
              x.printErrStackTrace("MicroMsg.TopStory.TopStoryReporterImpl", localUnsupportedEncodingException, "", new Object[0]);
            }
            localStringBuilder1.append(localUnsupportedEncodingException);
            if (parambth == null) {
              break label592;
            }
          }
          localStringBuilder1.append("&");
          localStringBuilder1.append("searchid=");
          localStringBuilder1.append(parambth.fuu);
          localStringBuilder1.append("&");
          localStringBuilder1.append("query=");
        }
      }
      catch (Exception paramList)
      {
        x.printErrStackTrace("MicroMsg.TopStory.TopStoryReporterImpl", paramList, "build14057VideoInfoExposeString error: %s", new Object[] { paramList.getMessage() });
        return null;
      }
      try
      {
        StringBuilder localStringBuilder2;
        localStringBuilder1.append(com.tencent.mm.compatible.util.p.encode(parambth.bHt, "utf-8"));
        localStringBuilder1.append("&");
        localStringBuilder1.append("ishomepage=0");
        localStringBuilder1.append("&");
        localStringBuilder1.append("sessionid=");
        localStringBuilder1.append(com.tencent.mm.plugin.websearch.api.p.zK(parambth.scene));
        localStringBuilder1.append("&");
        localStringBuilder1.append("scene=");
        localStringBuilder1.append(parambth.scene);
        localStringBuilder1.append("&rec_category=");
        localStringBuilder1.append(parambth.sqL);
        label592:
        return localStringBuilder1.toString();
      }
      catch (Exception paramList)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.TopStory.TopStoryReporterImpl", paramList, "", new Object[0]);
        }
      }
    }
    
    public final void run()
    {
      x.i("MicroMsg.TopStory.TopStoryReporterImpl", "Star to run ReportExposeTask");
      c.this.oyI.remove(Long.valueOf(this.oyK.sqL));
      ArrayList localArrayList = new ArrayList();
      localArrayList.addAll(this.oyJ);
      int j;
      for (int i = 0;; i = j)
      {
        j = i + 20;
        if (j >= localArrayList.size()) {}
        for (List localList = localArrayList.subList(i, localArrayList.size());; localList = localArrayList.subList(i, j))
        {
          String str = a(localList, this.oyK);
          if (!bi.oW(str))
          {
            bgx localbgx = new bgx();
            localbgx.shQ = str;
            x.i("MicroMsg.TopStory.TopStoryReporterImpl", "build14057VideoInfoExposeString %d report string: %s", new Object[] { Integer.valueOf(localList.size()), localbgx.shQ });
            ah.A(new c.a.1(this, localbgx));
          }
          if (j < localArrayList.size()) {
            break;
          }
          return;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/topstory/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */