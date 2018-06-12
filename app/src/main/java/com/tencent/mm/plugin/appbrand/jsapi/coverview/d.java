package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.view.View;
import com.tencent.mm.model.u.b;
import com.tencent.mm.plugin.appbrand.jsapi.base.a;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q.f;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class d
  extends a
{
  private static final int CTRL_INDEX = 446;
  public static final String NAME = "insertScrollView";
  
  protected final View a(p paramp, JSONObject paramJSONObject)
  {
    return new WxaScrollView(paramp.mContext);
  }
  
  protected final void a(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    x.d("MicroMsg.JsApiInsertScrollView", "onInsertView(viewId : %s, %s)", new Object[] { Integer.valueOf(paramInt), paramJSONObject });
    WxaScrollView localWxaScrollView = (WxaScrollView)paramView;
    boolean bool = paramJSONObject.optBoolean("needScrollEvent");
    String str = paramJSONObject.optString("data", "");
    com.tencent.mm.plugin.appbrand.jsapi.o.d.a(paramView, paramJSONObject.optJSONObject("style"));
    paramp.agU().E(paramInt, true).p("data", str);
    if (bool) {
      localWxaScrollView.setOnScrollChangedListener(new d.1(this, paramp, paramInt));
    }
    paramJSONObject.optInt("scrollLeft", 0);
    if (paramJSONObject.has("scrollX"))
    {
      bool = paramJSONObject.optBoolean("scrollX", true);
      x.i("MicroMsg.JsApiInsertScrollView", "scrollHorizontal:%b", new Object[] { Boolean.valueOf(bool) });
      localWxaScrollView.setScrollHorizontal(bool);
    }
    if (paramJSONObject.has("scrollY"))
    {
      bool = paramJSONObject.optBoolean("scrollY", true);
      x.i("MicroMsg.JsApiInsertScrollView", "scrollVertical:%b", new Object[] { Boolean.valueOf(bool) });
      localWxaScrollView.setScrollVertical(bool);
    }
    if (paramJSONObject.has("scrollTop"))
    {
      paramInt = f.a(paramJSONObject, "scrollTop", localWxaScrollView.getScrollY());
      x.i("MicroMsg.JsApiInsertScrollView", "scrollTop:%d", new Object[] { Integer.valueOf(paramInt) });
      localWxaScrollView.postDelayed(new d.2(this, localWxaScrollView, paramInt), 100L);
    }
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.getInt("viewId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/coverview/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */