package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.os.Bundle;
import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.rtmp.TXLivePlayer;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

public final class h
  extends c
{
  private static final int CTRL_INDEX = 365;
  public static final String NAME = "updateLivePlayer";
  
  private static Bundle s(JSONObject paramJSONObject)
  {
    Bundle localBundle = new Bundle();
    try
    {
      if (paramJSONObject.has("playUrl"))
      {
        localBundle.putString("playUrl", paramJSONObject.getString("playUrl"));
        x.i("MicroMsg.JsApiUpdateLivePlayer", "convertParams playUrl:%s", new Object[] { paramJSONObject.getString("playUrl") });
      }
    }
    catch (JSONException localJSONException10)
    {
      try
      {
        if (paramJSONObject.has("mode")) {
          localBundle.putInt("mode", paramJSONObject.getInt("mode"));
        }
      }
      catch (JSONException localJSONException10)
      {
        try
        {
          if (paramJSONObject.has("autoplay")) {
            localBundle.putBoolean("autoplay", paramJSONObject.getBoolean("autoplay"));
          }
        }
        catch (JSONException localJSONException10)
        {
          try
          {
            if (paramJSONObject.has("muted")) {
              localBundle.putBoolean("muted", paramJSONObject.getBoolean("muted"));
            }
          }
          catch (JSONException localJSONException10)
          {
            try
            {
              if (paramJSONObject.has("orientation")) {
                localBundle.putString("orientation", paramJSONObject.getString("orientation"));
              }
            }
            catch (JSONException localJSONException10)
            {
              try
              {
                if (paramJSONObject.has("objectFit")) {
                  localBundle.putString("objectFit", paramJSONObject.getString("objectFit"));
                }
              }
              catch (JSONException localJSONException10)
              {
                try
                {
                  if (paramJSONObject.has("backgroundMute")) {
                    localBundle.putBoolean("backgroundMute", paramJSONObject.getBoolean("backgroundMute"));
                  }
                }
                catch (JSONException localJSONException10)
                {
                  try
                  {
                    if (paramJSONObject.has("minCache")) {
                      localBundle.putFloat("minCache", BigDecimal.valueOf(paramJSONObject.getDouble("minCache")).floatValue());
                    }
                  }
                  catch (JSONException localJSONException10)
                  {
                    try
                    {
                      if (paramJSONObject.has("maxCache")) {
                        localBundle.putFloat("maxCache", BigDecimal.valueOf(paramJSONObject.getDouble("maxCache")).floatValue());
                      }
                    }
                    catch (JSONException localJSONException10)
                    {
                      try
                      {
                        if (paramJSONObject.has("needEvent")) {
                          localBundle.putBoolean("needEvent", paramJSONObject.getBoolean("needEvent"));
                        }
                      }
                      catch (JSONException localJSONException10)
                      {
                        try
                        {
                          for (;;)
                          {
                            if (paramJSONObject.has("debug")) {
                              localBundle.putBoolean("debug", paramJSONObject.getBoolean("debug"));
                            }
                            try
                            {
                              if (paramJSONObject.has("soundMode"))
                              {
                                localBundle.putString("soundMode", paramJSONObject.getString("soundMode"));
                                x.i("MicroMsg.JsApiUpdateLivePlayer", "convertParams soundMode:%s", new Object[] { paramJSONObject.getString("soundMode") });
                              }
                              return localBundle;
                            }
                            catch (JSONException paramJSONObject)
                            {
                              x.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "soundMode", paramJSONObject.getLocalizedMessage() });
                            }
                            localJSONException1 = localJSONException1;
                            x.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "playUrl", localJSONException1.getLocalizedMessage() });
                            continue;
                            localJSONException2 = localJSONException2;
                            x.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "mode", localJSONException2.getLocalizedMessage() });
                            continue;
                            localJSONException3 = localJSONException3;
                            x.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "autoplay", localJSONException3.getLocalizedMessage() });
                            continue;
                            localJSONException4 = localJSONException4;
                            x.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "muted", localJSONException4.getLocalizedMessage() });
                            continue;
                            localJSONException5 = localJSONException5;
                            x.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "orientation", localJSONException5.getLocalizedMessage() });
                            continue;
                            localJSONException6 = localJSONException6;
                            x.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "objectFit", localJSONException6.getLocalizedMessage() });
                            continue;
                            localJSONException7 = localJSONException7;
                            x.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "backgroundMute", localJSONException7.getLocalizedMessage() });
                            continue;
                            localJSONException8 = localJSONException8;
                            x.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "minCache", localJSONException8.getLocalizedMessage() });
                            continue;
                            localJSONException9 = localJSONException9;
                            x.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "maxCache", localJSONException9.getLocalizedMessage() });
                            continue;
                            localJSONException10 = localJSONException10;
                            x.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "needEvent", localJSONException10.getLocalizedMessage() });
                          }
                        }
                        catch (JSONException localJSONException11)
                        {
                          for (;;)
                          {
                            x.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView param=%s exp=%s", new Object[] { "debug", localJSONException11.getLocalizedMessage() });
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
    return localBundle;
  }
  
  protected final boolean c(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.JsApiUpdateLivePlayer", "onUpdateView : livePlayerId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      x.w("MicroMsg.JsApiUpdateLivePlayer", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      return false;
    }
    paramp = ((CoverViewContainer)paramView).A(View.class);
    if (!(paramp instanceof AppBrandLivePlayerView))
    {
      x.e("MicroMsg.JsApiUpdateLivePlayer", "targetView not AppBrandLivePlayerView");
      return false;
    }
    paramView = (AppBrandLivePlayerView)paramp;
    paramp = s(paramJSONObject);
    paramView.fRE = paramp.getBoolean("needEvent", paramView.fRE);
    paramView = paramView.fRA;
    if (!paramView.dni) {}
    for (paramp = new j(-3, "uninited livePlayer");; paramp = new j())
    {
      x.i("MicroMsg.AppBrandLivePlayerView", "onUpdate code:%d info:%s", new Object[] { Integer.valueOf(paramp.errorCode), paramp.fRT });
      return true;
      l.d("updateLivePlayer", paramp);
      paramView.w(paramp);
      boolean bool = paramView.fRX.isPlaying();
      paramJSONObject = paramp.getString("playUrl", paramView.fRZ);
      if ((paramJSONObject != null) && (!paramJSONObject.isEmpty()) && (paramView.fRZ != null) && (!paramView.fRZ.equalsIgnoreCase(paramJSONObject)) && (paramView.fRX.isPlaying()))
      {
        x.i("TXLivePlayerJSAdapter", "updateLivePlayer: stopPlay playUrl-old = " + paramView.fRZ + " playUrl-new = " + paramJSONObject);
        paramView.fRX.stopPlay(true);
      }
      paramView.fRZ = paramJSONObject;
      paramInt = paramView.v(paramp);
      if ((paramInt != paramView.fSa) && (paramView.fRX.isPlaying()))
      {
        x.i("TXLivePlayerJSAdapter", "updateLivePlayer: stopPlay  playType-old = " + paramView.fSa + " playType-new = " + paramInt);
        paramView.fRX.stopPlay(true);
      }
      paramView.fSa = paramInt;
      paramView.mAutoPlay = paramp.getBoolean("autoplay", paramView.mAutoPlay);
      if (((paramView.mAutoPlay) || (bool)) && (paramView.fRZ != null) && (!paramView.fRZ.isEmpty()) && (!paramView.fRX.isPlaying()))
      {
        x.i("TXLivePlayerJSAdapter", "updateLivePlayer: startPlay");
        paramView.fRX.startPlay(paramView.fRZ, paramView.fSa);
      }
    }
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.optInt("livePlayerId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/live/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */