package com.tencent.mm.plugin.appbrand.jsapi.h;

import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.k.f;
import com.tencent.mm.plugin.appbrand.k.g;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class i
  extends a
{
  public static final int CTRL_INDEX = 273;
  public static final String NAME = "operateUploadTask";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    x.d("MicroMsg.JsApiOperateUploadTask", "JsApiOperateUploadTask");
    if (paramJSONObject == null)
    {
      paraml.E(paramInt, f("fail:data is null", null));
      x.e("MicroMsg.JsApiOperateUploadTask", "data is null");
      return;
    }
    String str = paramJSONObject.optString("uploadTaskId");
    if (bi.oW(str))
    {
      x.e("MicroMsg.JsApiOperateUploadTask", "uploadTaskId is null");
      paraml.E(paramInt, f("fail:uploadTaskId is null or nil", null));
      return;
    }
    paramJSONObject = paramJSONObject.optString("operationType");
    if (bi.oW(paramJSONObject))
    {
      x.e("MicroMsg.JsApiOperateUploadTask", "operationType is null");
      paraml.E(paramInt, f("fail:operationType is null or nil", null));
      return;
    }
    if (paramJSONObject.equals("abort"))
    {
      paramJSONObject = com.tencent.mm.plugin.appbrand.k.h.alw().uN(paraml.mAppId);
      if (paramJSONObject == null)
      {
        x.i("MicroMsg.JsApiOperateUploadTask", "upload is null");
        paraml.E(paramInt, f("fail:no task", null));
        return;
      }
      g localg = paramJSONObject.uM(str);
      if (localg == null)
      {
        x.i("MicroMsg.JsApiOperateUploadTask", "uploadInfo is null %s", new Object[] { str });
        paraml.E(paramInt, f("fail:no task", null));
        return;
      }
      paramJSONObject.a(localg);
      paraml.E(paramInt, f("ok", null));
      paramJSONObject = new HashMap();
      paramJSONObject.put("uploadTaskId", str);
      paramJSONObject.put("state", "fail");
      paramJSONObject.put("errMsg", "abort");
      paramJSONObject = new JSONObject(paramJSONObject).toString();
      paraml = new e.a().a(paraml);
      paraml.mData = paramJSONObject;
      paraml.ahM();
      x.d("MicroMsg.JsApiOperateUploadTask", "abortTask finish %s", new Object[] { str });
      return;
    }
    paraml.E(paramInt, f("fail:unknown operationType", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/h/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */