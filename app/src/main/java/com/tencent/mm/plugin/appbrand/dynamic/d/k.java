package com.tencent.mm.plugin.appbrand.dynamic.d;

import com.tencent.mm.model.u.b;
import com.tencent.mm.plugin.appbrand.dynamic.WxaWidgetContext;
import com.tencent.mm.plugin.appbrand.dynamic.k.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.u.b.b.a;
import org.json.JSONArray;
import org.json.JSONObject;

public final class k
  extends com.tencent.mm.plugin.appbrand.dynamic.d.a.a
{
  public k(int paramInt)
  {
    super("reportKeyValue", paramInt);
  }
  
  protected final void a(com.tencent.mm.u.c.a parama, JSONObject paramJSONObject, b.a<JSONObject> parama1)
  {
    parama = com.tencent.mm.plugin.appbrand.dynamic.k.sA(parama.Da().getString("__page_view_id", null));
    if (parama == null)
    {
      parama1.aA(a(false, "JsApi Framework Context is null", null));
      return;
    }
    paramJSONObject = paramJSONObject.optJSONArray("dataArray");
    if (paramJSONObject == null)
    {
      parama1.aA(a(false, "dataArray is null", null));
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
          h.mEJ.h(j, new Object[] { parama.getAppId(), Integer.valueOf(parama.aeZ()), Integer.valueOf(b.ke(parama.aeY()) + 1), localObject });
        }
      }
      catch (Exception localException)
      {
        for (;;)
        {
          x.e("MicroMsg.JsApiFunc_ReportKeyValue", "parse report value failed : %s", new Object[] { localException });
        }
      }
      i += 1;
    }
    parama1.aA(a(true, "", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/d/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */