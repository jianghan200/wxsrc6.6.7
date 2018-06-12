package com.tencent.mm.plugin.appbrand.dynamic.d;

import com.tencent.mm.model.u.b;
import com.tencent.mm.modelappbrand.LogInfo;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.u.b.b.a;
import com.tencent.recovery.util.Util;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f
  extends com.tencent.mm.plugin.appbrand.dynamic.d.a.a
{
  public f(int paramInt)
  {
    super("log", paramInt);
  }
  
  protected final void a(com.tencent.mm.u.c.a parama, JSONObject paramJSONObject, b.a<JSONObject> parama1)
  {
    for (;;)
    {
      int i;
      try
      {
        paramJSONObject = paramJSONObject.getJSONArray("dataArray");
        ArrayList localArrayList = new ArrayList(paramJSONObject.length());
        i = 0;
        if (i < paramJSONObject.length())
        {
          JSONObject localJSONObject = paramJSONObject.getJSONObject(i);
          if (localJSONObject != null)
          {
            LogInfo localLogInfo = new LogInfo();
            localLogInfo.ts = localJSONObject.optLong("ts");
            localLogInfo.level = (localJSONObject.optInt("level") + 1);
            localLogInfo.message = localJSONObject.optString("msg");
            localArrayList.add(localLogInfo);
            x.d("MicroMsg.JsApiFunc_Log", "ts : %s, level : %d, msg : %s", new Object[] { Util.gS(localLogInfo.ts), Integer.valueOf(localLogInfo.level), localLogInfo.message });
          }
        }
        else
        {
          com.tencent.mm.plugin.appbrand.dynamic.debugger.a.a(parama.Da().getString("__page_view_id", null), localArrayList);
          parama1.aA(a(true, "", null));
          return;
        }
      }
      catch (JSONException parama)
      {
        parama1.aA(a(false, "dataArray is null", null));
        return;
      }
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */