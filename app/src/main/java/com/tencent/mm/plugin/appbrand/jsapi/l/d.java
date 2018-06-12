package com.tencent.mm.plugin.appbrand.jsapi.l;

import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.report.a.b;
import com.tencent.mm.plugin.appbrand.report.a.g.a;
import com.tencent.mm.plugin.appbrand.report.a.g.b;
import com.tencent.mm.protocal.c.cgu;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 108;
  public static final String NAME = "reportRealtimeAction";
  
  private static void a(com.tencent.mm.plugin.appbrand.g paramg, p paramp, JSONObject paramJSONObject)
  {
    paramJSONObject = paramJSONObject.optString("actionData");
    cgu localcgu = new cgu();
    localcgu.hcE = 2;
    localcgu.jQb = paramg.mAppId;
    localcgu.mEb = 0;
    localcgu.ixe = ((int)bi.VE());
    localcgu.mEc = 0;
    localcgu.sAT = paramJSONObject;
    localcgu.sAU = (paramg.fcu.frm.fih + 1);
    localcgu.sAW = com.tencent.mm.plugin.appbrand.report.a.cH(ad.getContext());
    localcgu.sAV = j.g(paramg).fdE;
    paramJSONObject = paramg.fcE;
    localcgu.pPq = paramJSONObject.scene;
    localcgu.sAY = paramJSONObject.bGG;
    localcgu.cbB = paramJSONObject.cbB;
    localcgu.cbC = paramJSONObject.cbC;
    localcgu.sAX = paramJSONObject.gqK;
    com.tencent.mm.plugin.appbrand.report.a.g localg = paramg.fcz.getReporter().gqZ;
    if (paramp != null)
    {
      paramp = localg.g(paramp);
      localcgu.sAS = paramp.path;
      if (paramp.grt != null) {
        break label355;
      }
      paramJSONObject = null;
      label191:
      localcgu.grK = paramJSONObject;
      if (!localg.vr(paramp.path)) {
        break label366;
      }
    }
    label355:
    label366:
    for (int i = 1;; i = 0)
    {
      localcgu.grP = i;
      x.i("MicroMsg.JsApiReportRealtimeAction", "report(%s), path %s, appState %d, sessionId %s, scene %d, sceneNote %s, preScene %d, preSceneNote %s, usedState %d, referPath %s, isEntrance %d", new Object[] { paramg.mAppId, localcgu.sAS, Integer.valueOf(localcgu.sAU), localcgu.sAV, Integer.valueOf(localcgu.pPq), localcgu.sAY, Integer.valueOf(localcgu.cbB), localcgu.cbC, Integer.valueOf(localcgu.sAX), localcgu.grK, Integer.valueOf(localcgu.grP) });
      AppBrandIDKeyBatchReport.a(localcgu);
      return;
      paramp = localg.amJ();
      break;
      paramJSONObject = paramp.grt.path;
      break label191;
    }
  }
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    try
    {
      a(paraml.fdO, null, paramJSONObject);
      paraml.E(paramInt, f("ok", null));
      return;
    }
    catch (Exception paramJSONObject)
    {
      x.e("MicroMsg.JsApiReportRealtimeAction", "report by service(%s), e = %s", new Object[] { paraml.mAppId, paramJSONObject });
    }
  }
  
  public final void a(p paramp, JSONObject paramJSONObject, int paramInt)
  {
    try
    {
      a(paramp.fdO, paramp, paramJSONObject);
      paramp.E(paramInt, f("ok", null));
      return;
    }
    catch (Exception paramJSONObject)
    {
      x.e("MicroMsg.JsApiReportRealtimeAction", "report by page(%s), e = %s", new Object[] { paramp.mAppId, paramJSONObject });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/l/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */