package com.tencent.mm.plugin.appbrand.jsapi.container;

import android.view.View;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.q.f;
import org.json.JSONObject;

public final class a
  extends com.tencent.mm.plugin.appbrand.jsapi.base.a
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "insertContainer";
  
  protected final View a(p paramp, JSONObject paramJSONObject)
  {
    paramp = new AppBrandNativeContainerView(paramp.mContext);
    paramp.setBackgroundColor(0);
    boolean bool1 = paramJSONObject.optBoolean("visible", true);
    boolean bool2 = paramJSONObject.optBoolean("canFullScreenByChild", false);
    int j = f.a(paramJSONObject, "contentOffsetLeft", 0);
    int k = f.a(paramJSONObject, "contentOffsetTop", 0);
    if (bool1) {}
    for (int i = 0;; i = 4)
    {
      paramp.setVisibility(i);
      paramp.setPadding(-j, -k, 0, 0);
      paramp.setDuplicateParentStateEnabled(true);
      paramp.setFullscreenWithChild(bool2);
      return paramp;
    }
  }
  
  protected final void a(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    paramView.setOnTouchListener(new a.1(this));
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.getInt("containerId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/container/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */