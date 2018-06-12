package com.tencent.mm.plugin.appbrand.jsapi.h;

import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.k.c;
import com.tencent.mm.plugin.appbrand.k.d;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class g
  extends a
{
  public static final int CTRL_INDEX = 243;
  public static final String NAME = "operateRequestTask";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    x.d("MicroMsg.JsApiOperateRequestTask", "JsApiOperateRequestTask");
    if (paramJSONObject == null)
    {
      paraml.E(paramInt, f("fail:data is null", null));
      x.e("MicroMsg.JsApiOperateRequestTask", "data is null");
      return;
    }
    String str = paramJSONObject.optString("requestTaskId");
    if (bi.oW(str))
    {
      x.e("MicroMsg.JsApiOperateRequestTask", "requestTaskId is null");
      paraml.E(paramInt, f("fail:requestTaskId is null or nil", null));
      return;
    }
    paramJSONObject = paramJSONObject.optString("operationType");
    if (bi.oW(paramJSONObject))
    {
      x.e("MicroMsg.JsApiOperateRequestTask", "operationType is null");
      paraml.E(paramInt, f("fail:operationType is null or nil", null));
      return;
    }
    if (paramJSONObject.equals("abort"))
    {
      paramJSONObject = com.tencent.mm.plugin.appbrand.k.e.alu().uL(paraml.mAppId);
      if (paramJSONObject == null)
      {
        paraml.E(paramInt, f("fail:no task", null));
        x.w("MicroMsg.JsApiOperateRequestTask", "request is null");
        return;
      }
      d locald = paramJSONObject.uK(str);
      if (locald == null)
      {
        paraml.E(paramInt, f("fail:no task", null));
        x.w("MicroMsg.JsApiOperateRequestTask", "requestInfo is null %s", new Object[] { str });
        return;
      }
      paramJSONObject.b(locald);
      paraml.E(paramInt, f("ok", null));
      paramJSONObject = new HashMap();
      paramJSONObject.put("requestTaskId", str);
      paramJSONObject.put("state", "fail");
      paramJSONObject.put("errMsg", "abort");
      paramJSONObject = new JSONObject(paramJSONObject).toString();
      paraml = new c.a().a(paraml);
      paraml.mData = paramJSONObject;
      paraml.ahM();
      x.d("MicroMsg.JsApiOperateRequestTask", "abortTask finish %s", new Object[] { str });
      return;
    }
    paraml.E(paramInt, f("fail:unknown operationType", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/h/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */