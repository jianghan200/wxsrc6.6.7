package com.tencent.mm.plugin.appbrand.jsapi.video;

import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends c
{
  private static final int CTRL_INDEX = 87;
  public static final String NAME = "updateVideoPlayer";
  
  protected final boolean c(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView : videoPlayerId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      x.w("MicroMsg.JsApiUpdateVideoPlayer", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      return false;
    }
    paramView = (AppBrandVideoView)((CoverViewContainer)paramView).A(AppBrandVideoView.class);
    if (paramView == null)
    {
      x.e("MicroMsg.JsApiUpdateVideoPlayer", "view not AppBrandVideoView");
      return false;
    }
    try
    {
      if (paramJSONObject.has("showDanmuBtn")) {
        paramView.setShowDanmakuBtn(paramJSONObject.getBoolean("showDanmuBtn"));
      }
    }
    catch (JSONException paramp)
    {
      try
      {
        if (paramJSONObject.has("danmuList")) {
          paramView.setDanmakuItemList(paramJSONObject.getJSONArray("danmuList"));
        }
      }
      catch (JSONException paramp)
      {
        try
        {
          if (paramJSONObject.has("objectFit")) {
            paramView.setObjectFit(paramJSONObject.getString("objectFit"));
          }
        }
        catch (JSONException paramp)
        {
          try
          {
            if (paramJSONObject.has("autoplay")) {
              paramView.setAutoPlay(paramJSONObject.getBoolean("autoplay"));
            }
          }
          catch (JSONException paramp)
          {
            try
            {
              if (paramJSONObject.has("showBasicControls")) {
                paramView.setIsShowBasicControls(paramJSONObject.getBoolean("showBasicControls"));
              }
            }
            catch (JSONException paramp)
            {
              try
              {
                if (paramJSONObject.has("poster")) {
                  paramView.setCover$16da05f7(paramJSONObject.getString("poster"));
                }
              }
              catch (JSONException paramp)
              {
                try
                {
                  if (paramJSONObject.has("direction")) {
                    paramView.setFullScreenDirection(paramJSONObject.getInt("direction"));
                  }
                }
                catch (Exception paramp)
                {
                  try
                  {
                    if (paramJSONObject.has("muted")) {
                      paramView.setMute(paramJSONObject.getBoolean("muted"));
                    }
                  }
                  catch (JSONException paramp)
                  {
                    try
                    {
                      if (paramJSONObject.has("loop")) {
                        paramView.setLoop(paramJSONObject.getBoolean("loop"));
                      }
                    }
                    catch (JSONException paramp)
                    {
                      try
                      {
                        if (paramJSONObject.has("data")) {
                          paramView.setCookieData(paramJSONObject.getString("data"));
                        }
                      }
                      catch (JSONException paramp)
                      {
                        try
                        {
                          if (paramJSONObject.has("pageGesture")) {
                            paramView.setPageGesture(paramJSONObject.getBoolean("pageGesture"));
                          }
                        }
                        catch (JSONException paramp)
                        {
                          try
                          {
                            if (paramJSONObject.has("showLiveBtn")) {
                              paramView.setShowLiveBtn(paramJSONObject.getBoolean("showLiveBtn"));
                            }
                          }
                          catch (JSONException paramp)
                          {
                            try
                            {
                              if (paramJSONObject.has("showProgress")) {
                                paramView.setShowProgress(paramJSONObject.getBoolean("showProgress"));
                              }
                            }
                            catch (JSONException paramp)
                            {
                              try
                              {
                                if (paramJSONObject.has("showFullScreenBtn")) {
                                  paramView.setShowFullScreenBtn(paramJSONObject.getBoolean("showFullScreenBtn"));
                                }
                              }
                              catch (JSONException paramp)
                              {
                                try
                                {
                                  if (paramJSONObject.has("showPlayBtn")) {
                                    paramView.setShowPlayBtn(paramJSONObject.getBoolean("showPlayBtn"));
                                  }
                                }
                                catch (JSONException paramp)
                                {
                                  try
                                  {
                                    if (paramJSONObject.has("showCenterPlayBtn")) {
                                      paramView.setShowCenterPlayBtn(paramJSONObject.getBoolean("showCenterPlayBtn"));
                                    }
                                  }
                                  catch (JSONException paramp)
                                  {
                                    try
                                    {
                                      if (paramJSONObject.has("enableProgressGesture")) {
                                        paramView.cU(paramJSONObject.getBoolean("enableProgressGesture"));
                                      }
                                    }
                                    catch (JSONException paramp)
                                    {
                                      try
                                      {
                                        if (paramJSONObject.has("duration")) {
                                          paramView.setDuration(paramJSONObject.getInt("duration"));
                                        }
                                      }
                                      catch (JSONException paramp)
                                      {
                                        try
                                        {
                                          if ((paramJSONObject.has("hide")) && (paramJSONObject.getBoolean("hide")))
                                          {
                                            x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView hide stop");
                                            paramView.stop();
                                          }
                                        }
                                        catch (JSONException paramp)
                                        {
                                          try
                                          {
                                            if (paramJSONObject.has("initialTime")) {
                                              paramView.setInitialTime(paramJSONObject.getInt("initialTime"));
                                            }
                                          }
                                          catch (JSONException paramp)
                                          {
                                            try
                                            {
                                              if (paramJSONObject.has("needEvent"))
                                              {
                                                if (paramJSONObject.getBoolean("needEvent")) {
                                                  break label1143;
                                                }
                                                paramView.setCallback(null);
                                              }
                                            }
                                            catch (JSONException paramp)
                                            {
                                              try
                                              {
                                                for (;;)
                                                {
                                                  if (paramJSONObject.has("filePath")) {
                                                    paramView.e(paramJSONObject.getString("filePath"), paramJSONObject.optBoolean("live"), paramJSONObject.optInt("duration"));
                                                  }
                                                  return true;
                                                  localJSONException1 = localJSONException1;
                                                  x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "showDanmuBtn", localJSONException1.getLocalizedMessage() });
                                                  continue;
                                                  localJSONException2 = localJSONException2;
                                                  x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "danmuList", localJSONException2.getLocalizedMessage() });
                                                  continue;
                                                  localJSONException3 = localJSONException3;
                                                  x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "objectFit", localJSONException3.getLocalizedMessage() });
                                                  continue;
                                                  localJSONException4 = localJSONException4;
                                                  x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "autoplay", localJSONException4.getLocalizedMessage() });
                                                  continue;
                                                  localJSONException5 = localJSONException5;
                                                  x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "showBasicControls", localJSONException5.getLocalizedMessage() });
                                                  continue;
                                                  localJSONException6 = localJSONException6;
                                                  x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "poster", localJSONException6.getLocalizedMessage() });
                                                  continue;
                                                  localException = localException;
                                                  x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "direction", localException.getLocalizedMessage() });
                                                  continue;
                                                  localJSONException7 = localJSONException7;
                                                  x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "muted", localJSONException7.getLocalizedMessage() });
                                                  continue;
                                                  localJSONException8 = localJSONException8;
                                                  x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "loop", localJSONException8.getLocalizedMessage() });
                                                  continue;
                                                  localJSONException9 = localJSONException9;
                                                  x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "data", localJSONException9.getLocalizedMessage() });
                                                  continue;
                                                  localJSONException10 = localJSONException10;
                                                  x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "pageGesture", localJSONException10.getLocalizedMessage() });
                                                  continue;
                                                  localJSONException11 = localJSONException11;
                                                  x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "showLiveBtn", localJSONException11.getLocalizedMessage() });
                                                  continue;
                                                  localJSONException12 = localJSONException12;
                                                  x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "showProgress", localJSONException12.getLocalizedMessage() });
                                                  continue;
                                                  localJSONException13 = localJSONException13;
                                                  x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "showFullScreenBtn", localJSONException13.getLocalizedMessage() });
                                                  continue;
                                                  localJSONException14 = localJSONException14;
                                                  x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "showPlayBtn", localJSONException14.getLocalizedMessage() });
                                                  continue;
                                                  localJSONException15 = localJSONException15;
                                                  x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "showCenterPlayBtn", localJSONException15.getLocalizedMessage() });
                                                  continue;
                                                  localJSONException16 = localJSONException16;
                                                  x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "enableProgressGesture", localJSONException16.getLocalizedMessage() });
                                                  continue;
                                                  localJSONException17 = localJSONException17;
                                                  x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "disableScroll", localJSONException17.getLocalizedMessage() });
                                                  continue;
                                                  localJSONException18 = localJSONException18;
                                                  x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "hide", localJSONException18.getLocalizedMessage() });
                                                  continue;
                                                  localJSONException19 = localJSONException19;
                                                  x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "initialTime", localJSONException19.getLocalizedMessage() });
                                                }
                                                label1143:
                                                if (paramView.gaz != null) {}
                                                for (paramInt = 1; paramInt == 0; paramInt = 0)
                                                {
                                                  paramView.setCallback(new e(paramView, paramp));
                                                  break;
                                                  paramp = paramp;
                                                  x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "needEvent", paramp.getLocalizedMessage() });
                                                  break;
                                                }
                                              }
                                              catch (JSONException paramp)
                                              {
                                                for (;;)
                                                {
                                                  x.i("MicroMsg.JsApiUpdateVideoPlayer", "onUpdateView param=%s exp=%s", new Object[] { "filePath", paramp.getLocalizedMessage() });
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.optInt("videoPlayerId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/video/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */