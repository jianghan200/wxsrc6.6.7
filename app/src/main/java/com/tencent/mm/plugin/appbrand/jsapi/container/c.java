package com.tencent.mm.plugin.appbrand.jsapi.container;

import android.view.View;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.q.f;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
  extends com.tencent.mm.plugin.appbrand.jsapi.base.c
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "updateContainer";
  
  protected final boolean c(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    if (!(paramView instanceof AppBrandNativeContainerView)) {
      return false;
    }
    int i = f.a(paramJSONObject, "contentOffsetLeft", 0);
    int j = f.a(paramJSONObject, "contentOffsetTop", 0);
    paramp = (AppBrandNativeContainerView)paramView;
    for (;;)
    {
      try
      {
        if (!paramJSONObject.getBoolean("visible")) {
          continue;
        }
        paramInt = 0;
        paramp.setVisibility(paramInt);
      }
      catch (JSONException paramView)
      {
        continue;
      }
      paramp.setPadding(-i, -j, 0, 0);
      return true;
      paramInt = 4;
    }
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.getInt("containerId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/container/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */