package com.tencent.mm.plugin.appbrand.jsapi.l;

import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;
import org.json.JSONObject;

public class c
  extends a
{
  public static final int CTRL_INDEX = 63;
  public static final String NAME = "reportKeyValue";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = paramJSONObject.optJSONArray("dataArray");
    if (paramJSONObject == null)
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    AppBrandSysConfig localAppBrandSysConfig = paraml.fdO.fcu;
    if (localAppBrandSysConfig == null)
    {
      x.e("MicroMsg.JsApiReportKeyValue", "config is Null!");
      paraml.E(paramInt, f("fail", null));
      return;
    }
    int i = 0;
    while (i < paramJSONObject.length())
    {
      try
      {
        Object localObject = paramJSONObject.getJSONObject(i);
        int j = ((JSONObject)localObject).optInt("key");
        localObject = ((JSONObject)localObject).optString("value");
        if ((j > 0) && (!bi.oW((String)localObject))) {
          h.mEJ.h(j, new Object[] { paraml.mAppId, Integer.valueOf(localAppBrandSysConfig.frm.fii), Integer.valueOf(localAppBrandSysConfig.frm.fih + 1), localObject });
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.e("MicroMsg.JsApiReportKeyValue", "AppBrandService parse report value failed : %s", new Object[] { localException.getMessage() });
        }
      }
      i += 1;
    }
    paraml.E(paramInt, f("ok", null));
  }
  
  public final void a(p paramp, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = paramJSONObject.optJSONArray("dataArray");
    if (paramJSONObject == null)
    {
      paramp.E(paramInt, f("fail", null));
      return;
    }
    AppBrandSysConfig localAppBrandSysConfig = paramp.fdO.fcu;
    if (localAppBrandSysConfig == null)
    {
      x.e("MicroMsg.JsApiReportKeyValue", "config is Null!");
      paramp.E(paramInt, f("fail", null));
      return;
    }
    int i = 0;
    while (i < paramJSONObject.length())
    {
      try
      {
        Object localObject = paramJSONObject.getJSONObject(i);
        int j = ((JSONObject)localObject).optInt("key");
        localObject = ((JSONObject)localObject).optString("value");
        if ((j > 0) && (!bi.oW((String)localObject))) {
          h.mEJ.h(j, new Object[] { paramp.mAppId, Integer.valueOf(localAppBrandSysConfig.frm.fii), Integer.valueOf(localAppBrandSysConfig.frm.fih + 1), localObject });
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.e("MicroMsg.JsApiReportKeyValue", "AppBrandPageView parse report value failed : %s", new Object[] { localException.getMessage() });
        }
      }
      i += 1;
    }
    paramp.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/l/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */