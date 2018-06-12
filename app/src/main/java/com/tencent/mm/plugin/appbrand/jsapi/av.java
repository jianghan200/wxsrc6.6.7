package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.bi;
import org.json.JSONObject;

public final class av
  extends a
{
  public static final int CTRL_INDEX = 201;
  public static final String NAME = "openUrl";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = paramJSONObject.optString("url");
    if (bi.oW(paramJSONObject))
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    paramJSONObject = new Intent().putExtra("rawUrl", paramJSONObject).putExtra("appbrand_report_key_target_url", paramJSONObject);
    if (paraml.getContext() != null)
    {
      d.b(paraml.getContext(), "webview", ".ui.tools.WebViewUI", paramJSONObject);
      paraml.E(paramInt, f("ok", null));
      return;
    }
    paraml.E(paramInt, f("fail", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */