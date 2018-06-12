package com.tencent.mm.plugin.appbrand.jsapi.l;

import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;
import org.json.JSONObject;

public class b
  extends a
{
  private static final int CTRL_INDEX = 64;
  private static final String NAME = "reportIDKey";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = paramJSONObject.optJSONArray("dataArray");
    if (paramJSONObject == null)
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    int i = 0;
    for (;;)
    {
      if (i < paramJSONObject.length()) {
        try
        {
          JSONObject localJSONObject = paramJSONObject.getJSONObject(i);
          int j = localJSONObject.optInt("id");
          int k = localJSONObject.optInt("key");
          int m = localJSONObject.optInt("value");
          h.mEJ.a(j, k, m, false);
          i += 1;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            x.e("MicroMsg.JsApiReportIDKey", "parse json failed : %s", new Object[] { localException.getMessage() });
          }
        }
      }
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
    int i = 0;
    for (;;)
    {
      if (i < paramJSONObject.length()) {
        try
        {
          JSONObject localJSONObject = paramJSONObject.getJSONObject(i);
          int j = localJSONObject.optInt("id");
          int k = localJSONObject.optInt("key");
          int m = localJSONObject.optInt("value");
          h.mEJ.a(j, k, m, false);
          i += 1;
        }
        catch (Exception localException)
        {
          for (;;)
          {
            x.e("MicroMsg.JsApiReportIDKey", "parse json failed : %s", new Object[] { localException.getMessage() });
          }
        }
      }
    }
    paramp.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/l/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */