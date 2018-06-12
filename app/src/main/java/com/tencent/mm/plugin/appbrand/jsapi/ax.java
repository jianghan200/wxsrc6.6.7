package com.tencent.mm.plugin.appbrand.jsapi;

import android.content.Intent;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class ax
  extends a
{
  public static final int CTRL_INDEX = 406;
  public static final String NAME = "private_openUrl";
  
  private void a(p paramp, l paraml, int paramInt, String paramString)
  {
    x.e("MicroMsg.JsApiPrivateOpenUrl", "switchCallback msg:%s", new Object[] { paramString });
    if (paramp != null) {
      paramp.E(paramInt, f(paramString, null));
    }
    if (paraml != null) {
      paraml.E(paramInt, f(paramString, null));
    }
  }
  
  private void a(p paramp, l paraml, JSONObject paramJSONObject, int paramInt)
  {
    Object localObject = paramJSONObject.optString("url");
    if (bi.oW((String)localObject))
    {
      a(paramp, paraml, paramInt, "fail");
      return;
    }
    boolean bool = paramJSONObject.optBoolean("isNativeStyle", false);
    if (bool)
    {
      localObject = new Intent().putExtra("rawUrl", (String)localObject).putExtra("appbrand_report_key_target_url", (String)localObject).putExtra("open_custom_style_url", bool).putExtra("forceHideShare", true).putExtra("status_bar_style", "black");
      ((Intent)localObject).putExtra("ad_info", paramJSONObject.optString("adInfo"));
      if (paramp == null) {
        break label158;
      }
    }
    label158:
    for (paramJSONObject = paramp.mContext;; paramJSONObject = paraml.getContext())
    {
      if (paramJSONObject == null) {
        break label166;
      }
      d.b(paramJSONObject, "webview", ".ui.tools.WebViewUI", (Intent)localObject);
      a(paramp, paraml, paramInt, "ok");
      return;
      localObject = new Intent().putExtra("rawUrl", (String)localObject).putExtra("appbrand_report_key_target_url", (String)localObject);
      break;
    }
    label166:
    a(paramp, paraml, paramInt, "fail");
  }
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    a(null, paraml, paramJSONObject, paramInt);
  }
  
  public final void a(p paramp, JSONObject paramJSONObject, int paramInt)
  {
    a(paramp, null, paramJSONObject, paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */