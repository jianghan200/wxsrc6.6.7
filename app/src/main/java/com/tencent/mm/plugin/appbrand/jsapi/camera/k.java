package com.tencent.mm.plugin.appbrand.jsapi.camera;

import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.q.f;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONArray;
import org.json.JSONObject;

public final class k
  extends c
{
  private static final int CTRL_INDEX = 331;
  public static final String NAME = "updateCamera";
  
  protected final boolean c(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.JsApiUpdateCamera", "onUpdateView : cameraId=%d", new Object[] { Integer.valueOf(paramInt) });
    if (!(paramView instanceof CoverViewContainer))
    {
      x.w("MicroMsg.JsApiUpdateCamera", "the view(%s) is not a instance of CoverViewContainer", new Object[] { Integer.valueOf(paramInt) });
      return false;
    }
    paramView = (AppBrandCameraView)((CoverViewContainer)paramView).A(AppBrandCameraView.class);
    if (paramView == null)
    {
      x.w("MicroMsg.JsApiUpdateCamera", "the camera view(%s) is null", new Object[] { Integer.valueOf(paramInt) });
      return false;
    }
    paramInt = paramJSONObject.optInt("cameraId");
    String str1 = paramJSONObject.optString("devicePosition", "back");
    String str2 = paramJSONObject.optString("flash", "auto");
    boolean bool1 = paramJSONObject.optBoolean("needOutput", false);
    paramView.setAppId(paramp.mAppId);
    paramView.Y(str1, false);
    paramView.setFlash(str2);
    paramView.setNeedOutput(bool1);
    paramp = paramJSONObject.optJSONObject("position");
    int i = f.a(paramp, "width", 0);
    int j = f.a(paramp, "height", 0);
    x.d("MicroMsg.JsApiUpdateCamera", "onUpdateView cameraId: %d, devicePosition: %s,flash: %s,width： %d,height： %d", new Object[] { Integer.valueOf(paramInt), str1, str2, Integer.valueOf(i), Integer.valueOf(j) });
    boolean bool2 = false;
    bool1 = bool2;
    if (i != 0)
    {
      bool1 = bool2;
      if (j != 0) {
        bool1 = paramView.bL(i, j);
      }
    }
    paramp = paramJSONObject.optString("mode");
    if (!bi.oW(paramp)) {
      paramView.setMode(paramp);
    }
    paramp = paramJSONObject.optJSONArray("scanArea");
    if ((paramp != null) && (paramp.length() == 4))
    {
      x.i("MicroMsg.JsApiUpdateCamera", "scanAreaArray:%s, scanAreaArray.length:%d", new Object[] { paramp, Integer.valueOf(paramp.length()) });
      paramView.l(f.lP(paramp.optInt(0)), f.lP(paramp.optInt(1)), f.lP(paramp.optInt(2)), f.lP(paramp.optInt(3)));
    }
    paramView.setScanFreq(paramJSONObject.optInt("scanFreq"));
    if (bool1)
    {
      paramView.release();
      paramView.initView();
    }
    for (;;)
    {
      return true;
      paramView.aiF();
    }
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.optInt("cameraId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/camera/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */