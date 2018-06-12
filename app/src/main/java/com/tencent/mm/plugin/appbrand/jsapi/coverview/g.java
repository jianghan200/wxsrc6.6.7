package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.page.u;
import org.json.JSONObject;

public final class g
  extends b
{
  private static final int CTRL_INDEX = 448;
  public static final String NAME = "removeScrollView";
  
  protected final boolean b(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    paramp.agU().ly(paramInt);
    return super.b(paramp, paramInt, paramView, paramJSONObject);
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.getInt("viewId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/coverview/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */