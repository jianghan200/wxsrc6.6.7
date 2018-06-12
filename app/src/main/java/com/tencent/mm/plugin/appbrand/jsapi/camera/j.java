package com.tencent.mm.plugin.appbrand.jsapi.camera;

import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class j
  extends b
{
  private static final int CTRL_INDEX = 330;
  public static final String NAME = "removeCamera";
  
  protected final boolean b(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    super.b(paramp, paramInt, paramView, paramJSONObject);
    x.i("MicroMsg.JsApiRemoveCamera", "onRemoveView cameraId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      x.w("MicroMsg.JsApiRemoveCamera", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      return false;
    }
    paramView = (AppBrandCameraView)((CoverViewContainer)paramView).A(AppBrandCameraView.class);
    if (paramView == null)
    {
      x.w("MicroMsg.JsApiRemoveCamera", "the camera view(%s) is null", new Object[] { Integer.valueOf(paramInt) });
      return false;
    }
    paramp.b(paramView);
    paramp.b(paramView);
    paramp.b(paramView);
    paramView.release();
    return true;
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.optInt("cameraId", 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/camera/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */