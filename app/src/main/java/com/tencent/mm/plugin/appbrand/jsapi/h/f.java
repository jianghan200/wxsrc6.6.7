package com.tencent.mm.plugin.appbrand.jsapi.h;

import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class f
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 270;
  public static final String NAME = "operateDownloadTask";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    x.d("MicroMsg.JsApiOperateDownloadTask", "JsApiOperateDownloadTask");
    if (paramJSONObject == null)
    {
      paraml.E(paramInt, f("fail:data is null", null));
      x.e("MicroMsg.JsApiOperateDownloadTask", "data is null");
      return;
    }
    String str = paramJSONObject.optString("downloadTaskId");
    if (bi.oW(str))
    {
      x.e("MicroMsg.JsApiOperateDownloadTask", "downloadTaskId is null");
      paraml.E(paramInt, f("fail:downloadTaskId is null or nil", null));
      return;
    }
    paramJSONObject = paramJSONObject.optString("operationType");
    if (bi.oW(paramJSONObject))
    {
      x.e("MicroMsg.JsApiOperateDownloadTask", "operationType is null");
      paraml.E(paramInt, f("fail:operationType is null or nil", null));
      return;
    }
    if (paramJSONObject.equals("abort"))
    {
      paramJSONObject = com.tencent.mm.plugin.appbrand.k.b.alr().uI(paraml.mAppId);
      if (paramJSONObject == null)
      {
        paraml.E(paramInt, f("fail:no task", null));
        x.w("MicroMsg.JsApiOperateDownloadTask", "download is null");
        return;
      }
      com.tencent.mm.plugin.appbrand.k.a.b localb = paramJSONObject.uF(str);
      if (localb == null)
      {
        paraml.E(paramInt, f("fail:no task", null));
        x.w("MicroMsg.JsApiOperateDownloadTask", "downloadWorker is null %s", new Object[] { str });
        return;
      }
      paramJSONObject.a(localb);
      paraml.E(paramInt, f("ok", null));
      paramJSONObject = new HashMap();
      paramJSONObject.put("downloadTaskId", str);
      paramJSONObject.put("state", "fail");
      paramJSONObject.put("errMsg", "abort");
      paramJSONObject = new JSONObject(paramJSONObject).toString();
      paraml = new b.a().a(paraml);
      paraml.mData = paramJSONObject;
      paraml.ahM();
      x.d("MicroMsg.JsApiOperateDownloadTask", "abortTask finish %s", new Object[] { str });
      return;
    }
    paraml.E(paramInt, f("fail:unknown operationType", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/h/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */