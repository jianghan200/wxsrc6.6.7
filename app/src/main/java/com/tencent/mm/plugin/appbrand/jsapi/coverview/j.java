package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.o.d;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.q.f;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public final class j
  extends c
{
  private static final int CTRL_INDEX = 447;
  public static final String NAME = "updateScrollView";
  
  protected final boolean c(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    x.d("MicroMsg.JsApiUpdateScrollView", "onUpdateView(viewId : %s, %s)", new Object[] { Integer.valueOf(paramInt), paramJSONObject });
    if (!(paramView instanceof WxaScrollView))
    {
      x.w("MicroMsg.JsApiUpdateScrollView", "the view(%s) is not a instance of WxaScrollView", new Object[] { Integer.valueOf(paramInt) });
      return false;
    }
    WxaScrollView localWxaScrollView = (WxaScrollView)paramView;
    d.a(paramView, paramJSONObject.optJSONObject("style"));
    try
    {
      if (paramJSONObject.getBoolean("needScrollEvent")) {
        localWxaScrollView.setOnScrollChangedListener(new j.1(this, paramp, paramInt));
      }
      for (;;)
      {
        paramJSONObject.optInt("scrollLeft", 0);
        boolean bool;
        if (paramJSONObject.has("scrollX"))
        {
          bool = paramJSONObject.optBoolean("scrollX", true);
          x.i("MicroMsg.JsApiUpdateScrollView", "scrollHorizontal:%b", new Object[] { Boolean.valueOf(bool) });
          localWxaScrollView.setScrollHorizontal(bool);
        }
        if (paramJSONObject.has("scrollY"))
        {
          bool = paramJSONObject.optBoolean("scrollY", true);
          x.i("MicroMsg.JsApiUpdateScrollView", "scrollVertical:%b", new Object[] { Boolean.valueOf(bool) });
          localWxaScrollView.setScrollVertical(bool);
        }
        if (paramJSONObject.has("scrollTop"))
        {
          int i = f.a(paramJSONObject, "scrollTop", localWxaScrollView.getScrollY());
          x.i("MicroMsg.JsApiUpdateScrollView", "scrollTop:%d", new Object[] { Integer.valueOf(i) });
          localWxaScrollView.scrollTo(localWxaScrollView.getScrollX(), i);
        }
        return super.c(paramp, paramInt, paramView, paramJSONObject);
        localWxaScrollView.setOnScrollChangedListener(null);
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.getInt("viewId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/coverview/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */