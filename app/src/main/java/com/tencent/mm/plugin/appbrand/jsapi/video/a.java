package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.view.View;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.page.p.d;
import com.tencent.mm.plugin.appbrand.page.p.e;
import com.tencent.mm.plugin.appbrand.page.p.f;
import com.tencent.mm.plugin.appbrand.page.y;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.appbrand.jsapi.base.a
{
  private static final int CTRL_INDEX = 6;
  public static final String NAME = "insertVideoPlayer";
  
  protected final View a(p paramp, JSONObject paramJSONObject)
  {
    paramp = paramp.mContext;
    return new CoverViewContainer(paramp, new AppBrandVideoView(paramp));
  }
  
  protected final void a(p paramp, int paramInt, final View paramView, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.JsApiInsertVideoPlayer", "onInsertView videoPlayerId=%d", new Object[] { Integer.valueOf(paramInt) });
    paramView = (AppBrandVideoView)((CoverViewContainer)paramView).A(AppBrandVideoView.class);
    if (paramView == null)
    {
      x.e("MicroMsg.JsApiInsertVideoPlayer", "onInsertView appBrandVideoView null");
      return;
    }
    Object localObject1 = new a.1(this, paramView);
    Object localObject2 = new p.f()
    {
      public final void agL()
      {
        AppBrandVideoView localAppBrandVideoView = paramView;
        x.i("MicroMsg.AppBrandVideoView", "onUIResume");
        localAppBrandVideoView.gak.SM();
      }
    };
    Object localObject3 = new a.3(this, paramView);
    Object localObject4 = new a.4(this, paramView, paramp, (p.f)localObject2, (p.d)localObject3);
    paramp.a((p.f)localObject2);
    paramp.a((p.d)localObject3);
    paramp.a((p.e)localObject4);
    paramView.setFullScreenDelegate(new a.5(this, paramp, paramInt, (y)localObject1));
    paramView.setMute(paramJSONObject.optBoolean("muted", false));
    boolean bool1 = paramJSONObject.optBoolean("needEvent", false);
    x.i("MicroMsg.JsApiInsertVideoPlayer", "onInsertView autoPlay=%b needEvent=%b", new Object[] { Boolean.valueOf(paramJSONObject.optBoolean("autoplay", false)), Boolean.valueOf(bool1) });
    boolean bool2 = paramJSONObject.optBoolean("showDanmuBtn", true);
    boolean bool3 = paramJSONObject.optBoolean("enableDanmu", false);
    localObject1 = paramJSONObject.optJSONArray("danmuList");
    localObject2 = paramJSONObject.optString("objectFit");
    localObject3 = paramJSONObject.optString("poster");
    boolean bool4 = paramJSONObject.optBoolean("showBasicControls", true);
    localObject4 = paramJSONObject.optString("data");
    paramInt = paramJSONObject.optInt("direction", 90);
    boolean bool5 = paramJSONObject.optBoolean("loop", false);
    boolean bool6 = paramJSONObject.optBoolean("pageGesture", false);
    int i = paramJSONObject.optInt("initialTime", 0);
    boolean bool7 = paramJSONObject.optBoolean("showLiveBtn", true);
    boolean bool8 = paramJSONObject.optBoolean("showProgress", true);
    boolean bool9 = paramJSONObject.optBoolean("showFullScreenBtn", true);
    boolean bool10 = paramJSONObject.optBoolean("showPlayBtn", true);
    boolean bool11 = paramJSONObject.optBoolean("showCenterPlayBtn", true);
    boolean bool12 = paramJSONObject.optBoolean("enableProgressGesture", true);
    paramView.setAppId(paramp.mAppId);
    paramView.setIsGame(paramp.fdO.aaq());
    paramView.setCookieData((String)localObject4);
    paramView.setIsShowBasicControls(bool4);
    paramView.setCover$16da05f7((String)localObject3);
    paramView.setFullScreenDirection(paramInt);
    paramView.setObjectFit((String)localObject2);
    paramView.setLoop(bool5);
    paramView.setPageGesture(bool6);
    try
    {
      paramView.setVideoPlayerId(k(paramJSONObject));
      paramView.setShowDanmakuBtn(bool2);
      paramView.setDanmakuEnable(bool3);
      paramView.setDanmakuItemList((JSONArray)localObject1);
      paramView.setInitialTime(i);
      paramView.setShowLiveBtn(bool7);
      paramView.setShowProgress(bool8);
      paramView.setShowFullScreenBtn(bool9);
      paramView.setShowPlayBtn(bool10);
      paramView.setShowCenterPlayBtn(bool11);
      paramView.cU(bool12);
      if (bool1) {
        paramView.setCallback(new e(paramView, paramp));
      }
      paramInt = paramJSONObject.optInt("duration", -1);
      paramp = paramJSONObject.optString("filePath");
      bool1 = paramJSONObject.optBoolean("live", false);
      x.i("MicroMsg.JsApiInsertVideoPlayer", "onInsertView filePath=%s live=%b", new Object[] { paramp, Boolean.valueOf(bool1) });
      paramView.e(paramp, bool1, paramInt);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        x.e("MicroMsg.JsApiInsertVideoPlayer", "inflateView setVideoPlayerId exp=%s", new Object[] { localJSONException });
      }
    }
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.getInt("videoPlayerId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/video/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */