package com.tencent.mm.plugin.appbrand.jsapi.f;

import android.view.View;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.q.f;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class h
  extends com.tencent.mm.plugin.appbrand.jsapi.base.c
{
  public static final int CTRL_INDEX = 136;
  public static final String NAME = "includeMapPoints";
  
  protected final boolean c(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiIncludeMapPoints", "data is null");
      return false;
    }
    paramp = com.tencent.mm.plugin.appbrand.jsapi.f.a.b.E(paramp.mAppId, paramp.hashCode(), k(paramJSONObject));
    if (paramp == null)
    {
      x.e("MicroMsg.JsApiIncludeMapPoints", "appBrandMapView is null, return");
      return false;
    }
    x.i("MicroMsg.JsApiIncludeMapPoints", "includeMapPoints, onUpdateView()");
    for (;;)
    {
      try
      {
        if (paramJSONObject.has("points"))
        {
          paramView = new ArrayList();
          Object localObject = paramJSONObject.optString("points");
          if (!bi.oW((String)localObject))
          {
            localObject = new JSONArray((String)localObject);
            paramInt = 0;
            if (paramInt < ((JSONArray)localObject).length())
            {
              JSONObject localJSONObject = (JSONObject)((JSONArray)localObject).get(paramInt);
              paramView.add(paramp.C(bi.getFloat(localJSONObject.optString("latitude"), 0.0F), bi.getFloat(localJSONObject.optString("longitude"), 0.0F)));
              paramInt += 1;
              continue;
            }
          }
          paramJSONObject = paramJSONObject.optString("padding");
          if (bi.oW(paramJSONObject)) {
            break label231;
          }
          paramInt = f.a(new JSONArray(paramJSONObject), 0);
          if (paramView.size() > 0) {
            paramp.fSW.d(paramView, paramInt);
          }
        }
        return true;
      }
      catch (Exception paramp)
      {
        x.e("MicroMsg.JsApiIncludeMapPoints", "parse points error, exception : %s", new Object[] { paramp });
        return false;
      }
      label231:
      paramInt = 0;
    }
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    try
    {
      int i = paramJSONObject.optInt("mapId");
      return i;
    }
    catch (Exception paramJSONObject)
    {
      x.e("MicroMsg.JsApiIncludeMapPoints", "get mapId error, exception : %s", new Object[] { paramJSONObject });
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */