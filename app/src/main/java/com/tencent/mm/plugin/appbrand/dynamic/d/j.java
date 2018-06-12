package com.tencent.mm.plugin.appbrand.dynamic.d;

import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.u.b.b.a;
import org.json.JSONArray;
import org.json.JSONObject;

public final class j
  extends com.tencent.mm.plugin.appbrand.dynamic.d.a.a
{
  public j(int paramInt)
  {
    super("reportIDKey", paramInt);
  }
  
  protected final void a(com.tencent.mm.u.c.a parama, JSONObject paramJSONObject, b.a<JSONObject> parama1)
  {
    parama = paramJSONObject.optJSONArray("dataArray");
    if (parama == null)
    {
      parama1.aA(a(false, "dataArray is null", null));
      return;
    }
    int i = 0;
    for (;;)
    {
      if (i < parama.length()) {
        try
        {
          paramJSONObject = parama.getJSONObject(i);
          int j = paramJSONObject.optInt("id");
          int k = paramJSONObject.optInt("key");
          int m = paramJSONObject.optInt("value");
          h.mEJ.a(j, k, m, false);
          i += 1;
        }
        catch (Exception paramJSONObject)
        {
          for (;;)
          {
            x.e("MicroMsg.JsApiFunc_ReportIDKey", "parse json failed : %s", new Object[] { paramJSONObject.getMessage() });
          }
        }
      }
    }
    parama1.aA(a(true, "", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/d/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */