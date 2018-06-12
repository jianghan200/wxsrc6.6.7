package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d
  extends c
{
  private static final int CTRL_INDEX = 367;
  public static final String NAME = "operateLivePlayer";
  
  protected final boolean c(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.JsApiOperateLivePlayer", "onUpdateView : livePlayerId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      x.w("MicroMsg.JsApiOperateLivePlayer", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      label43:
      return false;
    }
    paramp = ((CoverViewContainer)paramView).A(View.class);
    if (!(paramp instanceof AppBrandLivePlayerView))
    {
      x.e("MicroMsg.JsApiOperateLivePlayer", "targetView not AppBrandLivePlayerView");
      return false;
    }
    paramp = (AppBrandLivePlayerView)paramp;
    paramView = paramJSONObject.optString("type");
    x.i("MicroMsg.JsApiOperateLivePlayer", "onUpdateView operateType=%s", new Object[] { paramView });
    paramInt = -1;
    switch (paramView.hashCode())
    {
    }
    for (;;)
    {
      switch (paramInt)
      {
      default: 
        paramp = paramp.fRA.tC(paramView);
        x.i("MicroMsg.AppBrandLivePlayerView", "onOperate code:%d info:%s", new Object[] { Integer.valueOf(paramp.errorCode), paramp.fRT });
        if (paramp.errorCode != 0) {
          break label43;
        }
        return true;
        if (paramView.equals("requestFullScreen"))
        {
          paramInt = 0;
          continue;
          if (paramView.equals("exitFullScreen")) {
            paramInt = 1;
          }
        }
        break;
      }
    }
    paramView = paramJSONObject.optJSONArray("data");
    if ((paramView == null) || (paramView.length() == 0)) {
      x.w("MicroMsg.JsApiOperateLivePlayer", "onUpdateView directionArr nil");
    }
    for (paramInt = 0;; paramInt = paramView.optInt(0, 0))
    {
      x.i("MicroMsg.AppBrandLivePlayerView", "enterFullScreen direction:%s", new Object[] { Integer.valueOf(paramInt) });
      if (paramp.fRB != null) {
        break;
      }
      x.w("MicroMsg.AppBrandLivePlayerView", "enterFullScreen mFullScreenDelegate null");
      return false;
    }
    if (paramp.fRB.isFullScreen())
    {
      x.i("MicroMsg.AppBrandLivePlayerView", "enterFullScreen already full screen");
      return true;
    }
    paramp.fRB.kM(paramInt);
    paramp.fRD = paramInt;
    paramp.cP(true);
    return true;
    x.i("MicroMsg.AppBrandLivePlayerView", "quitFullScreen");
    if (paramp.fRB == null)
    {
      x.w("MicroMsg.AppBrandLivePlayerView", "quitFullScreen mFullScreenDelegate null");
      return false;
    }
    if (!paramp.fRB.isFullScreen())
    {
      x.i("MicroMsg.AppBrandLivePlayerView", "quitFullScreen already quit full screen");
      return true;
    }
    paramp.fRB.ajc();
    return true;
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.optInt("livePlayerId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/live/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */