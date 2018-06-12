package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b
  extends c
{
  private static final int CTRL_INDEX = 114;
  public static final String NAME = "operateVideoPlayer";
  
  protected final boolean c(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    int i = -1;
    x.i("MicroMsg.JsApiOperateVideoPlayer", "onUpdateView : videoPlayerId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      x.w("MicroMsg.JsApiOperateVideoPlayer", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      return false;
    }
    paramp = (AppBrandVideoView)((CoverViewContainer)paramView).A(AppBrandVideoView.class);
    if (paramp == null)
    {
      x.e("MicroMsg.JsApiOperateVideoPlayer", "view not AppBrandVideoView");
      return false;
    }
    paramView = paramJSONObject.optString("type");
    x.i("MicroMsg.JsApiOperateVideoPlayer", "onUpdateView operateType=%s", new Object[] { paramView });
    switch (paramView.hashCode())
    {
    default: 
      label176:
      paramInt = -1;
    }
    for (;;)
    {
      switch (paramInt)
      {
      default: 
        x.w("MicroMsg.JsApiOperateVideoPlayer", "onUpdateView operateType not supported: %s", new Object[] { paramView });
        return false;
        if (!paramView.equals("play")) {
          break label176;
        }
        paramInt = 0;
        continue;
        if (!paramView.equals("pause")) {
          break label176;
        }
        paramInt = 1;
        continue;
        if (!paramView.equals("stop")) {
          break label176;
        }
        paramInt = 2;
        continue;
        if (!paramView.equals("requestFullScreen")) {
          break label176;
        }
        paramInt = 3;
        continue;
        if (!paramView.equals("exitFullScreen")) {
          break label176;
        }
        paramInt = 4;
        continue;
        if (!paramView.equals("playbackRate")) {
          break label176;
        }
        paramInt = 5;
        continue;
        if (!paramView.equals("seek")) {
          break label176;
        }
        paramInt = 6;
        continue;
        if (!paramView.equals("sendDanmu")) {
          break label176;
        }
        paramInt = 7;
      }
    }
    paramp.start();
    for (;;)
    {
      return true;
      paramp.pause();
      continue;
      paramp.stop();
      continue;
      paramView = paramJSONObject.optJSONArray("data");
      if ((paramView == null) || (paramView.length() == 0)) {
        x.w("MicroMsg.JsApiOperateVideoPlayer", "onUpdateView directionArr nil");
      }
      for (paramInt = i;; paramInt = paramView.optInt(0, -1))
      {
        paramp.f(true, paramInt);
        break;
      }
      paramp.f(false, -1);
      continue;
      paramView = paramJSONObject.optJSONArray("data");
      if ((paramView == null) || (paramView.length() == 0))
      {
        x.w("MicroMsg.JsApiOperateVideoPlayer", "onUpdateView dataArr nil");
        return false;
      }
      double d = paramView.optDouble(0, -1.0D);
      if (d < 0.0D)
      {
        x.i("MicroMsg.JsApiOperateVideoPlayer", "rate invalid %f", new Object[] { Double.valueOf(d) });
        return false;
      }
      float f = (float)d;
      x.i("MicroMsg.AppBrandVideoView", "setPlaybackRate %s", new Object[] { Float.valueOf(f) });
      paramp.gak.ac(f);
      continue;
      paramView = paramJSONObject.optJSONArray("data");
      if ((paramView == null) || (paramView.length() == 0))
      {
        x.w("MicroMsg.JsApiOperateVideoPlayer", "onUpdateView dataArr nil");
        return false;
      }
      paramInt = paramView.optInt(0, -1);
      if (paramInt < 0)
      {
        x.i("MicroMsg.JsApiOperateVideoPlayer", "pos invalid %d", new Object[] { Integer.valueOf(paramInt) });
        return false;
      }
      paramp.C(paramInt, false);
      continue;
      paramView = paramJSONObject.optJSONArray("data");
      if ((paramView == null) || (paramView.length() == 0))
      {
        x.w("MicroMsg.JsApiOperateVideoPlayer", "onUpdateView dataArr nil");
        return false;
      }
      if (paramView.length() == 1) {
        paramp.bt(paramView.optString(0, ""), "");
      } else {
        paramp.bt(paramView.optString(0, ""), paramView.optString(1, ""));
      }
    }
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.optInt("videoPlayerId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/video/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */