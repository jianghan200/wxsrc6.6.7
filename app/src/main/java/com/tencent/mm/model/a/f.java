package com.tencent.mm.model.a;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public final class f
{
  public static void a(e parame)
  {
    if ((parame != null) && (g.IW().IU()))
    {
      String str1 = g.IW().dDN.dDJ;
      String str2 = parame.id;
      String str3 = parame.id;
      String str4 = parame.endTime - parame.startTime;
      String str5 = parame.result;
      String str6 = parame.dDP;
      long l = parame.dDS;
      x.i("MicroMsg.abtest.AbTestReportHelper", "TestCaseID:%s TestPointsID:%s TestReportID：%s TetsCheckID:%s TestDurationTime:%s TestActionResult:%s, TestActionScene:%d", new Object[] { str1, str2, str6, str3, str4, str5, Long.valueOf(l) });
      h.mEJ.h(11394, new Object[] { str1, str2, str6, str3, str4, str5, Long.valueOf(l) });
    }
  }
  
  private static void a(e parame, boolean paramBoolean)
  {
    if ((parame == null) || (!g.IW().IU()))
    {
      x.w("MicroMsg.abtest.AbTestReportHelper", "[AbTest] reportAbTestClickStreamBroadcast abtest faild. abTestPoint or testcase is null.");
      return;
    }
    StringBuilder localStringBuilder2 = new StringBuilder();
    if (paramBoolean) {}
    for (StringBuilder localStringBuilder1 = localStringBuilder2.append("TestPointStart:");; localStringBuilder1 = localStringBuilder2.append("TestPointEnd:"))
    {
      localStringBuilder2.append(localStringBuilder1);
      localStringBuilder2.append(g.IW().dDN.dDJ);
      localStringBuilder2.append("_");
      localStringBuilder2.append(parame.id);
      localStringBuilder2.append("_");
      localStringBuilder2.append(parame.dDP);
      localStringBuilder2.append("_");
      localStringBuilder2.append(parame.dDP);
      localStringBuilder2.append("_");
      localStringBuilder2.append(parame.dDQ);
      localStringBuilder2.append("_");
      localStringBuilder2.append(parame.result);
      localStringBuilder2.append("_");
      localStringBuilder2.append(parame.dDS);
      iR(localStringBuilder2.toString());
      return;
    }
  }
  
  private static void iR(String paramString)
  {
    x.i("MicroMsg.abtest.AbTestReportHelper", "[AbTest] reportAbTestClickStreamBroadcast:%s", new Object[] { paramString });
    if (g.IW().IU())
    {
      Intent localIntent = new Intent();
      localIntent.setAction("com.tencent.mm.ui.ACTION_ABTEST");
      localIntent.putExtra("content", paramString);
      ad.getContext().sendBroadcast(localIntent, "com.tencent.mm.permission.MM_MESSAGE");
      return;
    }
    x.i("MicroMsg.abtest.AbTestReportHelper", "[AbTest] reportAbTestClickStreamBroadcast abtest faild. no test case.");
  }
  
  public static void iS(String paramString)
  {
    x.i("MicroMsg.abtest.AbTestReportHelper", "[Abtest] startAbTestCase: start abtest click stream");
    iR("TestCaseID:" + paramString);
  }
  
  public static void iT(String paramString)
  {
    if (g.IW().iP(paramString) != null)
    {
      x.i("MicroMsg.abtest.AbTestReportHelper", "[Abtest] startAbTestPoint:%s", new Object[] { paramString });
      g.IW().iP(paramString).dDQ = System.currentTimeMillis();
      g.IW().iP(paramString).startTime = System.currentTimeMillis();
      g.IW().iP(paramString).dDR = false;
      g.IW().iP(paramString).result = "0";
      a(g.IW().iP(paramString), true);
    }
  }
  
  public static void iU(String paramString)
  {
    if ((g.IW().iP(paramString) != null) && (!g.IW().iP(paramString).dDR))
    {
      x.i("MicroMsg.abtest.AbTestReportHelper", "[Abtest] endAbTestPoint:%s", new Object[] { paramString });
      g.IW().iP(paramString).dDQ = System.currentTimeMillis();
      g.IW().iP(paramString).endTime = System.currentTimeMillis();
      g.IW().iP(paramString).dDR = true;
      a(g.IW().iP(paramString));
      a(g.IW().iP(paramString), false);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/model/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */