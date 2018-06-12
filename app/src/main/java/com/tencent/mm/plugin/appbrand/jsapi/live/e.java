package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.base.f;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class e
  extends c
{
  private static final int CTRL_INDEX = 363;
  public static final String NAME = "operateLivePusher";
  
  protected final boolean a(p paramp, int paramInt, View paramView, JSONObject paramJSONObject, f paramf)
  {
    x.i("MicroMsg.JsApiOperateLivePusher", "onUpdateView : livePusherId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      x.w("MicroMsg.JsApiOperateLivePusher", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      return false;
    }
    Object localObject = ((CoverViewContainer)paramView).A(View.class);
    if (!(localObject instanceof AppBrandLivePusherView))
    {
      x.e("MicroMsg.JsApiOperateLivePusher", "targetView not AppBrandLivePusherView");
      return false;
    }
    localObject = (AppBrandLivePusherView)localObject;
    String str = paramJSONObject.optString("type");
    x.i("MicroMsg.JsApiOperateLivePusher", "onUpdateView operateType=%s", new Object[] { str });
    if (str.equalsIgnoreCase("snapshot"))
    {
      ((AppBrandLivePusherView)localObject).setSnapshotListener(new e.1(this, paramf, paramp));
      if (!((AppBrandLivePusherView)localObject).tB("snapshot")) {
        paramf.tp(f("fail", null));
      }
    }
    for (;;)
    {
      return super.a(paramp, paramInt, paramView, paramJSONObject, paramf);
      if (((AppBrandLivePusherView)localObject).tB(str)) {
        paramf.tp(f("ok", null));
      } else {
        paramf.tp(f("fail", null));
      }
    }
  }
  
  protected final boolean aik()
  {
    return true;
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.optInt("livePusherId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/live/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */