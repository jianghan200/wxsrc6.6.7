package com.tencent.mm.plugin.appbrand.jsapi.live;

import android.os.Bundle;
import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONException;
import org.json.JSONObject;

public final class i
  extends c
{
  private static final int CTRL_INDEX = 361;
  public static final String NAME = "updateLivePusher";
  
  private static Bundle s(JSONObject paramJSONObject)
  {
    Bundle localBundle = new Bundle();
    try
    {
      if (paramJSONObject.has("pushUrl"))
      {
        localBundle.putString("pushUrl", paramJSONObject.getString("pushUrl"));
        x.i("MicroMsg.JsApiUpdateLivePusher", "convertParams pushUrl:%s", new Object[] { paramJSONObject.getString("pushUrl") });
      }
    }
    catch (JSONException localJSONException13)
    {
      try
      {
        if (paramJSONObject.has("mode")) {
          localBundle.putInt("mode", paramJSONObject.getInt("mode"));
        }
      }
      catch (JSONException localJSONException13)
      {
        try
        {
          if (paramJSONObject.has("autopush")) {
            localBundle.putBoolean("autopush", paramJSONObject.getBoolean("autopush"));
          }
        }
        catch (JSONException localJSONException13)
        {
          try
          {
            if (paramJSONObject.has("audioQuality")) {
              localBundle.putString("audioQuality", paramJSONObject.getString("audioQuality"));
            }
          }
          catch (JSONException localJSONException13)
          {
            try
            {
              if (paramJSONObject.has("muted")) {
                localBundle.putBoolean("muted", paramJSONObject.getBoolean("muted"));
              }
            }
            catch (JSONException localJSONException13)
            {
              try
              {
                if (paramJSONObject.has("enableCamera")) {
                  localBundle.putBoolean("enableCamera", paramJSONObject.getBoolean("enableCamera"));
                }
              }
              catch (JSONException localJSONException13)
              {
                try
                {
                  if (paramJSONObject.has("focusMode")) {
                    localBundle.putInt("focusMode", paramJSONObject.getInt("focusMode"));
                  }
                }
                catch (JSONException localJSONException13)
                {
                  try
                  {
                    if (paramJSONObject.has("orientation")) {
                      localBundle.putString("orientation", paramJSONObject.getString("orientation"));
                    }
                  }
                  catch (JSONException localJSONException13)
                  {
                    try
                    {
                      if (paramJSONObject.has("beauty")) {
                        localBundle.putInt("beauty", paramJSONObject.getInt("beauty"));
                      }
                    }
                    catch (JSONException localJSONException13)
                    {
                      try
                      {
                        if (paramJSONObject.has("whiteness")) {
                          localBundle.putInt("whiteness", paramJSONObject.getInt("whiteness"));
                        }
                      }
                      catch (JSONException localJSONException13)
                      {
                        try
                        {
                          if (paramJSONObject.has("aspect")) {
                            localBundle.putInt("aspect", paramJSONObject.getInt("aspect"));
                          }
                        }
                        catch (JSONException localJSONException13)
                        {
                          try
                          {
                            if (paramJSONObject.has("minBitrate")) {
                              localBundle.putInt("minBitrate", paramJSONObject.getInt("minBitrate"));
                            }
                          }
                          catch (JSONException localJSONException13)
                          {
                            try
                            {
                              if (paramJSONObject.has("maxBitrate")) {
                                localBundle.putInt("maxBitrate", paramJSONObject.getInt("maxBitrate"));
                              }
                            }
                            catch (JSONException localJSONException13)
                            {
                              try
                              {
                                for (;;)
                                {
                                  if (paramJSONObject.has("backgroundImage")) {
                                    localBundle.putString("backgroundImage", paramJSONObject.getString("backgroundImage"));
                                  }
                                  try
                                  {
                                    if (paramJSONObject.has("debug")) {
                                      localBundle.putBoolean("debug", paramJSONObject.getBoolean("debug"));
                                    }
                                    return localBundle;
                                  }
                                  catch (JSONException paramJSONObject)
                                  {
                                    x.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "debug", paramJSONObject.getLocalizedMessage() });
                                  }
                                  localJSONException1 = localJSONException1;
                                  x.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "pushUrl", localJSONException1.getLocalizedMessage() });
                                  continue;
                                  localJSONException2 = localJSONException2;
                                  x.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "mode", localJSONException2.getLocalizedMessage() });
                                  continue;
                                  localJSONException3 = localJSONException3;
                                  x.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "autopush", localJSONException3.getLocalizedMessage() });
                                  continue;
                                  localJSONException4 = localJSONException4;
                                  x.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "audioQuality", localJSONException4.getLocalizedMessage() });
                                  continue;
                                  localJSONException5 = localJSONException5;
                                  x.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "muted", localJSONException5.getLocalizedMessage() });
                                  continue;
                                  localJSONException6 = localJSONException6;
                                  x.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "enableCamera", localJSONException6.getLocalizedMessage() });
                                  continue;
                                  localJSONException7 = localJSONException7;
                                  x.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "focusMode", localJSONException7.getLocalizedMessage() });
                                  continue;
                                  localJSONException8 = localJSONException8;
                                  x.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "orientation", localJSONException8.getLocalizedMessage() });
                                  continue;
                                  localJSONException9 = localJSONException9;
                                  x.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "beauty", localJSONException9.getLocalizedMessage() });
                                  continue;
                                  localJSONException10 = localJSONException10;
                                  x.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "whiteness", localJSONException10.getLocalizedMessage() });
                                  continue;
                                  localJSONException11 = localJSONException11;
                                  x.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "aspect", localJSONException11.getLocalizedMessage() });
                                  continue;
                                  localJSONException12 = localJSONException12;
                                  x.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "minBitrate", localJSONException12.getLocalizedMessage() });
                                  continue;
                                  localJSONException13 = localJSONException13;
                                  x.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "maxBitrate", localJSONException13.getLocalizedMessage() });
                                }
                              }
                              catch (JSONException localJSONException14)
                              {
                                for (;;)
                                {
                                  x.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "pushUrl", localJSONException14.getLocalizedMessage() });
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
    return localBundle;
  }
  
  protected final boolean c(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView : livePusherId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      x.w("MicroMsg.JsApiUpdateLivePusher", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      return false;
    }
    paramp = ((CoverViewContainer)paramView).A(View.class);
    if (!(paramp instanceof AppBrandLivePusherView))
    {
      x.e("MicroMsg.JsApiUpdateLivePusher", "targetView not AppBrandLivePusherView");
      return false;
    }
    paramp = (AppBrandLivePusherView)paramp;
    paramp.u(s(paramJSONObject));
    try
    {
      if (paramJSONObject.has("backgroundImage")) {
        a.a(paramJSONObject.getString("backgroundImage"), paramJSONObject.optString("backgroundMD5"), new i.1(this, paramp));
      }
      return true;
    }
    catch (JSONException paramp)
    {
      for (;;)
      {
        x.i("MicroMsg.JsApiUpdateLivePusher", "onUpdateView param=%s exp=%s", new Object[] { "backgroundMute", paramp.getLocalizedMessage() });
      }
    }
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.optInt("livePusherId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/live/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */