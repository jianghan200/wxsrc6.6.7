package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class g
  extends b
{
  private static final int CTRL_INDEX = 362;
  public static final String NAME = "removeLivePusher";
  
  protected final boolean b(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    super.b(paramp, paramInt, paramView, paramJSONObject);
    x.i("MicroMsg.JsApiRemoveLivePusher", "onRemoveView livePusherId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      x.w("MicroMsg.JsApiRemoveLivePusher", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      return false;
    }
    paramp = ((CoverViewContainer)paramView).A(View.class);
    if (!(paramp instanceof AppBrandLivePusherView))
    {
      x.e("MicroMsg.JsApiRemoveLivePusher", "targetView not AppBrandLivePusherView");
      return false;
    }
    ((AppBrandLivePusherView)paramp).ua();
    return true;
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.optInt("livePusherId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/live/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */