package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.bi;
import org.json.JSONObject;

final class ar
  extends a
{
  public static final int CTRL_INDEX = 0;
  public static final String NAME = "openLink";
  
  public final void a(p paramp, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = paramJSONObject.optString("url");
    if (bi.oW(paramJSONObject))
    {
      paramp.E(paramInt, f("fail", null));
      return;
    }
    Intent localIntent = new Intent().putExtra("rawUrl", paramJSONObject).putExtra("appbrand_report_key_target_url", paramJSONObject);
    localIntent.putExtra("rawUrl", paramJSONObject);
    d.b(paramp.mContext, "webview", ".ui.tools.WebViewUI", localIntent);
    paramp.E(paramInt, f("ok", null));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */