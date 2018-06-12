package com.tencent.mm.plugin.appbrand.report.a;

import android.content.ComponentName;
import android.content.Intent;
import android.util.Pair;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class e
{
  public static void a(g paramg, JSONObject paramJSONObject)
  {
    try
    {
      b(paramg, paramJSONObject);
      paramJSONObject.put("referpagepath", a.d(paramg.fct.fqA));
      paramJSONObject.put("clickTimestamp", bi.VF());
      return;
    }
    catch (Exception paramg)
    {
      x.e("MicroMsg.AppBrandPageVisitStatisticsHelper", "fillWxConfigLaunchInfo ex = %s", new Object[] { paramg });
    }
  }
  
  public static void b(g paramg, JSONObject paramJSONObject)
  {
    paramJSONObject.put("scene_note", paramg.fcE.bGG);
    paramJSONObject.put("sessionId", paramg.fct.fdE);
    paramJSONObject.put("usedState", paramg.fcE.gqK);
    paramJSONObject.put("prescene", paramg.fcE.cbB);
    paramJSONObject.put("prescene_note", paramg.fcE.cbC);
  }
  
  public static Pair<Integer, String> h(com.tencent.mm.plugin.appbrand.page.p paramp)
  {
    int i = 1;
    Intent localIntent;
    switch (e.1.fjK[com.tencent.mm.plugin.appbrand.e.qn(paramp.mAppId).ordinal()])
    {
    default: 
      localIntent = paramp.fdO.fcz.getReporter().gqU;
      if (localIntent != null) {
        if (localIntent.getComponent() == null)
        {
          x.e("MicroMsg.AppBrandPageVisitStatisticsHelper", "onBackground, intent %s, get null cmp name", new Object[] { localIntent });
          paramp = "";
          if (!paramp.contains("WebViewUI")) {
            break label231;
          }
          i = 10;
          paramp = localIntent.getStringExtra("appbrand_report_key_target_url");
        }
      }
      break;
    }
    for (;;)
    {
      return Pair.create(Integer.valueOf(i), paramp);
      if (paramp.gnC.iD()) {}
      for (i = 4;; i = 3)
      {
        paramp = null;
        break;
      }
      if (paramp.gnC.iD()) {
        i = 5;
      }
      paramp = null;
      continue;
      i = 6;
      paramp = null;
      continue;
      i = 9;
      paramp = k.qu(paramp.mAppId).fdL + ":" + com.tencent.mm.compatible.util.p.encode(bi.oV(k.qu(paramp.mAppId).fdM));
      continue;
      paramp = localIntent.getComponent().getClassName();
      break;
      label231:
      paramp = bi.aG(localIntent.getStringExtra("appbrand_report_key_target_activity"), paramp);
      i = 8;
      continue;
      i = 7;
      paramp = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/report/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */