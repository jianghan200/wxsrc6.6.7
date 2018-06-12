package com.tencent.mm.plugin.appbrand.jsapi.p;

import android.view.View;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.s.g;
import java.util.Set;
import org.json.JSONObject;

public final class f
  extends com.tencent.mm.plugin.appbrand.jsapi.base.a
{
  public static final int CTRL_INDEX = 298;
  public static final String NAME = "insertHTMLWebView";
  
  protected final View a(p paramp, JSONObject paramJSONObject)
  {
    if (paramp.alS() != null) {
      return null;
    }
    paramp.getContentView().post(new f.1(this, paramp));
    paramJSONObject = new a(paramp.mContext, paramp.fdO, paramp);
    paramJSONObject.setId(s.g.app_brand_pageview_html_webview);
    f.2 local2 = new f.2(this, paramJSONObject);
    paramp.gnl.add(local2);
    paramp.a(new f.3(this, paramJSONObject));
    paramp.a(new f.4(this, paramJSONObject));
    return paramJSONObject;
  }
  
  protected final void a(p paramp, int paramInt, View paramView, JSONObject paramJSONObject) {}
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.getInt("htmlId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/p/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */