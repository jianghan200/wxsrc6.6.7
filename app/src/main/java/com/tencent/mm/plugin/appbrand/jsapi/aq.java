package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.bi;
import org.json.JSONObject;

public final class aq
  extends a
{
  public static final int CTRL_INDEX = 247;
  public static final String NAME = "openDeliveryList";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = paramJSONObject.optString("query");
    if (bi.oW(paramJSONObject))
    {
      paraml.E(paramInt, f("fail", null));
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", "https://mp.weixin.qq.com/bizmall/expressentry" + paramJSONObject);
    localIntent.putExtra("show_native_web_view", true);
    localIntent.putExtra("KRightBtn", true);
    if (paraml.getContext() != null)
    {
      d.b(paraml.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
      paraml.E(paramInt, f("ok", null));
      return;
    }
    paraml.E(paramInt, f("fail", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */