package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class f
  extends b
{
  private static final int CTRL_INDEX = 366;
  public static final String NAME = "removeLivePlayer";
  
  protected final boolean b(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    super.b(paramp, paramInt, paramView, paramJSONObject);
    x.i("MicroMsg.JsApiRemoveLivePlayer", "onRemoveView livePlayerId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      x.w("MicroMsg.JsApiRemoveLivePlayer", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      return false;
    }
    paramp = ((CoverViewContainer)paramView).A(View.class);
    if (!(paramp instanceof AppBrandLivePlayerView))
    {
      x.e("MicroMsg.JsApiRemoveLivePlayer", "targetView not AppBrandLivePlayerView");
      return false;
    }
    ((AppBrandLivePlayerView)paramp).ua();
    return true;
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.optInt("livePlayerId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/live/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */