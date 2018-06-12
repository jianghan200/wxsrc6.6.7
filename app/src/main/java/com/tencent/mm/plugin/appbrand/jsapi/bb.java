package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.base.ReportSubmitFormTask;
import com.tencent.mm.plugin.appbrand.k;
import com.tencent.mm.plugin.appbrand.page.p;
import java.util.HashMap;
import org.json.JSONObject;

public final class bb
  extends a
{
  public static final int CTRL_INDEX = 66;
  public static final String NAME = "reportSubmitForm";
  
  public final void a(p paramp, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = new ReportSubmitFormTask(paramp.fdO.fcu);
    paramJSONObject.type = 1;
    paramJSONObject.fKK = System.currentTimeMillis();
    paramJSONObject.bVs = paramp.ahc();
    AppBrandMainProcessService.a(paramJSONObject);
    HashMap localHashMap = new HashMap();
    localHashMap.put("formId", paramJSONObject.fKK);
    k localk = k.qv(paramp.mAppId);
    if (localk != null) {
      localk.fdG = paramJSONObject.fKK;
    }
    paramp.E(paramInt, f("ok", localHashMap));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */