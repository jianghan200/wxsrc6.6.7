package com.tencent.mm.plugin.appbrand.jsapi.p;

import android.text.TextUtils;
import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.xweb.WebView;
import org.json.JSONObject;

public final class h
  extends c
{
  public static final int CTRL_INDEX = 300;
  public static final String NAME = "updateHTMLWebView";
  
  protected final boolean c(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    if (!(paramView instanceof a)) {
      return false;
    }
    paramp = paramJSONObject.optString("src", "about:blank");
    x.i("URL", paramp);
    paramView = ((a)paramView).getWebView();
    if ((paramp.indexOf("#") >= 0) && (!TextUtils.isEmpty(paramView.getUrl()))) {
      paramView.evaluateJavascript(String.format("window.location=\"%s\"", new Object[] { paramp }), null);
    }
    for (;;)
    {
      return true;
      paramView.loadUrl(paramp);
    }
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.getInt("htmlId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/p/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */