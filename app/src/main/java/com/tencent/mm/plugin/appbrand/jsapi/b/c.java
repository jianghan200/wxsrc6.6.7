package com.tencent.mm.plugin.appbrand.jsapi.b;

import android.view.View;
import com.tencent.mm.plugin.appbrand.canvas.i;
import com.tencent.mm.plugin.appbrand.canvas.widget.AppBrandDrawableView;
import com.tencent.mm.plugin.appbrand.jsapi.base.a;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.p;
import org.json.JSONObject;

public final class c
  extends a
{
  public static final int CTRL_INDEX = 67;
  public static final String NAME = "insertCanvas";
  
  protected final View a(p paramp, JSONObject paramJSONObject)
  {
    paramJSONObject = paramp.mContext;
    AppBrandDrawableView localAppBrandDrawableView = new AppBrandDrawableView(paramJSONObject);
    localAppBrandDrawableView.getDrawContext().fnl = i.ado();
    localAppBrandDrawableView.setId(paramp.mAppId);
    return new CoverViewContainer(paramJSONObject, localAppBrandDrawableView);
  }
  
  protected final boolean aii()
  {
    return true;
  }
  
  protected final boolean aij()
  {
    return true;
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.getInt("canvasId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */