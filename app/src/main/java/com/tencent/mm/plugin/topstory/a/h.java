package com.tencent.mm.plugin.topstory.a;

import com.tencent.mm.ab.o;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.websearch.api.n;
import com.tencent.mm.plugin.websearch.api.p;
import com.tencent.mm.protocal.c.bgx;
import com.tencent.mm.protocal.c.bte;
import com.tencent.mm.protocal.c.bth;
import com.tencent.mm.protocal.c.bti;
import com.tencent.mm.protocal.c.cfn;
import com.tencent.mm.sdk.platformtools.x;

public final class h
{
  public static void a(bte parambte, String paramString, long paramLong)
  {
    int i = p.zP(1);
    parambte = String.format("%s,%s,%s,%s,%s,%s,%s,%s", new Object[] { Integer.valueOf(parambte.scene), parambte.sqA, parambte.bJK, Integer.valueOf(i), paramString, Long.valueOf(paramLong), Integer.valueOf(parambte.ozm), Integer.valueOf(parambte.sqC) });
    x.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryHomeUIAction 15466 %s", new Object[] { parambte });
    com.tencent.mm.plugin.report.service.h.mEJ.k(15466, parambte);
  }
  
  public static void a(bth parambth, bti parambti, String paramString1, String paramString2, String paramString3)
  {
    com.tencent.mm.plugin.report.service.h.mEJ.h(15035, new Object[] { Integer.valueOf(parambth.scene), parambth.fuu, parambti.sqZ, parambti.sqS, Integer.valueOf(0), paramString2, paramString3, Long.valueOf(parambth.sqL), paramString1 });
  }
  
  public static void a(cfn paramcfn, com.tencent.mm.storage.bd parambd)
  {
    Object localObject1;
    Object localObject2;
    int i;
    if (s.fq(parambd.field_talker))
    {
      if (parambd.field_isSend == 1) {}
      for (localObject1 = q.GF();; localObject1 = com.tencent.mm.model.bd.iB(parambd.field_content))
      {
        localObject2 = parambd.field_talker;
        i = 2;
        parambd = (com.tencent.mm.storage.bd)localObject1;
        localObject1 = new StringBuffer();
        ((StringBuffer)localObject1).append("isShareClick=1");
        ((StringBuffer)localObject1).append("&relevant_vid=");
        ((StringBuffer)localObject1).append(paramcfn.pLr);
        ((StringBuffer)localObject1).append("&relevant_pre_searchid=");
        ((StringBuffer)localObject1).append(paramcfn.pLt);
        ((StringBuffer)localObject1).append("&relevant_shared_openid=");
        ((StringBuffer)localObject1).append(paramcfn.pLu);
        ((StringBuffer)localObject1).append("&rec_category=");
        ((StringBuffer)localObject1).append(paramcfn.pLv);
        ((StringBuffer)localObject1).append("&source=");
        ((StringBuffer)localObject1).append(paramcfn.bhd);
        ((StringBuffer)localObject1).append("&fromUser=");
        ((StringBuffer)localObject1).append(parambd);
        ((StringBuffer)localObject1).append("&fromScene=");
        ((StringBuffer)localObject1).append(i);
        ((StringBuffer)localObject1).append("&targetInfo=");
        ((StringBuffer)localObject1).append((String)localObject2);
        x.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryClickShareItem 15371 %s", new Object[] { ((StringBuffer)localObject1).toString() });
        paramcfn = new bgx();
        paramcfn.shQ = ((StringBuffer)localObject1).toString();
        paramcfn = new n(paramcfn);
        g.DF().a(paramcfn, 0);
        return;
      }
    }
    if (parambd.field_isSend == 1)
    {
      localObject2 = q.GF();
      localObject1 = parambd.field_talker;
      parambd = (com.tencent.mm.storage.bd)localObject2;
    }
    for (;;)
    {
      i = 1;
      localObject2 = localObject1;
      break;
      parambd = parambd.field_talker;
      localObject1 = q.GF();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/topstory/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */