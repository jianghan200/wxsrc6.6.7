package com.tencent.mm.plugin.appbrand.jsapi.op_report;

import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 245;
  private static final String NAME = "reportPageData";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    Object localObject = paraml.fdO.fcu;
    AppBrandStatObject localAppBrandStatObject = com.tencent.mm.plugin.appbrand.a.qb(paraml.mAppId);
    AppBrandOpReportLogic.ReportTask localReportTask = new AppBrandOpReportLogic.ReportTask();
    if (localObject != null)
    {
      localReportTask.appId = ((AppBrandSysConfig)localObject).appId;
      localReportTask.username = ((AppBrandSysConfig)localObject).bGy;
      localReportTask.fmv = ((AppBrandSysConfig)localObject).frm.fih;
      localReportTask.cbu = ((AppBrandSysConfig)localObject).frm.fii;
      localReportTask.fKP = WxaCommLibRuntimeReader.abP().fii;
    }
    if (localAppBrandStatObject != null)
    {
      localReportTask.scene = localAppBrandStatObject.scene;
      localReportTask.cbB = localAppBrandStatObject.cbB;
    }
    localObject = d(paraml);
    if (localObject != null) {
      localReportTask.bGH = ((p)localObject).getURL();
    }
    localReportTask.fWF = paramJSONObject.toString();
    AppBrandMainProcessService.a(localReportTask);
    paraml.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/op_report/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */