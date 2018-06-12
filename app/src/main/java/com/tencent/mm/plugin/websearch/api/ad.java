package com.tencent.mm.plugin.websearch.api;

import android.net.Uri;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.protocal.c.bgx;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class ad
{
  private static a pMq = new a();
  
  public static void Ab(int paramInt)
  {
    pMq.scene = paramInt;
    pMq.pLn = 1;
    pMq.pMr = System.currentTimeMillis();
    pMq.pMs = 0L;
    pMq.ltv = System.currentTimeMillis();
    pMq.lrE = 0L;
    pMq.mGh = false;
    x.v("MicroMsg.WebSearch.WebSearchReportLogic", "initReport %d %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(1) });
  }
  
  public static void Ac(int paramInt)
  {
    x.v("MicroMsg.WebSearch.WebSearchReportLogic", "kvReportWebSearchVisit %d", new Object[] { Integer.valueOf(paramInt) });
    f.mDy.h(12041, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(p.zP(0)) });
  }
  
  public static final void Ad(int paramInt)
  {
    x.v("MicroMsg.WebSearch.WebSearchReportLogic", "reportIdKey649 %d", new Object[] { Integer.valueOf(paramInt) });
    f.mDy.a(649L, paramInt, 1L, true);
  }
  
  public static final void Qa(String paramString)
  {
    x.v("MicroMsg.WebSearch.WebSearchReportLogic", "reportWebSuggestClick %s", new Object[] { paramString });
    f.mDy.k(12721, paramString);
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString)
  {
    if (paramInt1 == 21) {}
    for (int i = p.zP(1);; i = p.zP(0))
    {
      f.mDy.h(14457, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramString });
      return;
    }
  }
  
  public static void a(int paramInt1, int paramInt2, String paramString1, int paramInt3, int paramInt4, String paramString2, int paramInt5)
  {
    x.v("MicroMsg.WebSearch.WebSearchReportLogic", "kvReportWebSearchGuideDisplay %d %d %s %d %d %s %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString1, Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramString2, Integer.valueOf(paramInt5) });
    f.mDy.h(12098, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(p.zP(0)), Integer.valueOf(paramInt2), paramString1, Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), paramString2, Integer.valueOf(paramInt5) });
  }
  
  public static void a(int paramInt1, String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    int i;
    if (paramBoolean1) {
      i = 3;
    }
    for (;;)
    {
      f.mDy.h(12042, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(paramInt2), bi.aG(paramString, "").replace(",", " ") });
      return;
      if (paramBoolean2) {
        i = 2;
      } else {
        i = 1;
      }
    }
  }
  
  public static void a(String paramString1, String paramString2, long paramLong, String paramString3)
  {
    x.v("MicroMsg.WebSearch.WebSearchReportLogic", "kvReportWebSearchLocalPageExposure:");
    f.mDy.h(14663, new Object[] { Uri.encode(paramString1), paramString2, Long.valueOf(paramLong), paramString3, Integer.valueOf(3) });
  }
  
  public static void aQ(int paramInt, String paramString)
  {
    f.mDy.k(paramInt, paramString);
  }
  
  public static void aR(int paramInt, String paramString)
  {
    f.mDy.h(12070, new Object[] { Integer.valueOf(paramInt), Integer.valueOf(p.zP(0)), paramString, Integer.valueOf(4), Integer.valueOf(0), "", Integer.valueOf(1), Integer.valueOf(0) });
  }
  
  public static void aS(int paramInt, String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("recnondocreport=1");
    localStringBuffer.append("&type=");
    localStringBuffer.append(paramInt);
    localStringBuffer.append("&content=");
    localStringBuffer.append(paramString);
    x.i("MicroMsg.TopStory", "reportTopStoryRedDot 14791 %s", new Object[] { localStringBuffer.toString() });
    paramString = new bgx();
    paramString.shQ = localStringBuffer.toString();
    paramString = new n(paramString);
    g.DF().a(paramString, 0);
  }
  
  public static void aa(int paramInt1, int paramInt2, int paramInt3)
  {
    a(paramInt1, 3, paramInt2, paramInt3, "");
  }
  
  public static void ai(String paramString1, String paramString2, String paramString3)
  {
    f.mDy.h(14752, new Object[] { Integer.valueOf(1), paramString1, paramString2, paramString3 });
  }
  
  public static void b(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3)
  {
    f.mDy.h(13810, new Object[] { Integer.valueOf(paramInt1), paramString1, paramString2, Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(0) });
  }
  
  public static void bTj()
  {
    pMq.pMr = System.currentTimeMillis();
    x.v("MicroMsg.WebSearch.WebSearchReportLogic", "startH5Report %s", new Object[] { Long.valueOf(pMq.pMr) });
  }
  
  public static void bTk()
  {
    a locala = pMq;
    locala.pMs += System.currentTimeMillis() - pMq.pMr;
    x.v("MicroMsg.WebSearch.WebSearchReportLogic", "stopH5Report %s", new Object[] { Long.valueOf(pMq.pMs) });
  }
  
  public static void bTl()
  {
    a locala = pMq;
    locala.lrE += System.currentTimeMillis() - pMq.ltv;
    x.v("MicroMsg.WebSearch.WebSearchReportLogic", "stopTotalReport %s", new Object[] { Long.valueOf(pMq.lrE) });
  }
  
  public static void bTm()
  {
    a locala = pMq;
    if (!locala.mGh)
    {
      f.mDy.h(12044, new Object[] { Integer.valueOf(locala.scene), Integer.valueOf(locala.pLn), Long.valueOf(locala.pMs / 1000L), Long.valueOf(locala.lrE / 1000L) });
      locala.mGh = true;
    }
    x.v("MicroMsg.WebSearch.WebSearchReportLogic", "reportTime");
  }
  
  public static void c(int paramInt1, int paramInt2, String paramString, boolean paramBoolean)
  {
    int i = 1;
    f localf = f.mDy;
    if (paramBoolean) {}
    for (;;)
    {
      localf.h(12845, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(0), Integer.valueOf(paramInt2), paramString, Integer.valueOf(i) });
      return;
      i = 0;
    }
  }
  
  public static void ef(int paramInt1, int paramInt2)
  {
    r(paramInt1, paramInt2, "");
  }
  
  public static void h(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    f.mDy.h(12639, new Object[] { bi.aG(paramString, "").replace(",", " "), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0), Integer.valueOf(paramInt3) });
  }
  
  public static void h(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    x.v("MicroMsg.WebSearch.WebSearchReportLogic", "kvReportWebSearchLocalPageClick %s %s %d %s", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt), paramString3 });
    f.mDy.h(14657, new Object[] { Uri.encode(paramString1), paramString2, Integer.valueOf(paramInt), paramString3, Integer.valueOf(3) });
  }
  
  public static void q(int paramInt1, int paramInt2, String paramString)
  {
    c(paramInt1, paramInt2, paramString, false);
  }
  
  public static void r(int paramInt1, int paramInt2, String paramString)
  {
    a(paramInt1, paramInt2, 0, 0, paramString);
  }
  
  public static final void reportIdKey649ForLook(int paramInt1, int paramInt2)
  {
    if (paramInt1 == 21) {
      f.mDy.a(649L, paramInt2, 1L, true);
    }
  }
  
  public static void v(int paramInt, String paramString1, String paramString2)
  {
    f.mDy.h(13809, new Object[] { Integer.valueOf(paramInt), paramString1, paramString2, Integer.valueOf(0) });
  }
  
  public static final class a
  {
    long lrE;
    long ltv;
    boolean mGh = true;
    int pLn;
    long pMr;
    long pMs;
    int scene;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/websearch/api/ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */