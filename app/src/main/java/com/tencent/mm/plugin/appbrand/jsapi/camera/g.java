package com.tencent.mm.plugin.appbrand.jsapi.camera;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.plugin.appbrand.q.f;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g
  extends com.tencent.mm.plugin.appbrand.jsapi.base.a
{
  private static final int CTRL_INDEX = 329;
  public static final String NAME = "insertCamera";
  
  protected final View a(p paramp, JSONObject paramJSONObject)
  {
    Context localContext = paramp.mContext;
    AppBrandCameraView localAppBrandCameraView = new AppBrandCameraView(localContext);
    int i = paramJSONObject.optInt("cameraId");
    Object localObject = paramJSONObject.optString("mode", "normal");
    String str1 = paramJSONObject.optString("devicePosition", "back");
    String str2 = paramJSONObject.optString("flash", "auto");
    boolean bool = paramJSONObject.optBoolean("needOutput", false);
    localAppBrandCameraView.setAppId(paramp.mAppId);
    localAppBrandCameraView.setMode((String)localObject);
    localAppBrandCameraView.setPage(paramp);
    localAppBrandCameraView.setCameraId(i);
    localAppBrandCameraView.Y(str1, true);
    localAppBrandCameraView.setFlash(str2);
    localAppBrandCameraView.setNeedOutput(bool);
    localObject = paramJSONObject.optJSONObject("position");
    int j = f.a((JSONObject)localObject, "width", 0);
    int k = f.a((JSONObject)localObject, "height", 0);
    if ((j != 0) && (k != 0)) {
      localAppBrandCameraView.bL(j, k);
    }
    localObject = paramJSONObject.optJSONArray("scanArea");
    if ((localObject != null) && (((JSONArray)localObject).length() == 4))
    {
      x.i("MicroMsg.JsApiInsertCamera", "scanAreaArray:%s, scanAreaArray.length:%d", new Object[] { localObject, Integer.valueOf(((JSONArray)localObject).length()) });
      localAppBrandCameraView.l(f.lP(((JSONArray)localObject).optInt(0)), f.lP(((JSONArray)localObject).optInt(1)), f.lP(((JSONArray)localObject).optInt(2)), f.lP(((JSONArray)localObject).optInt(3)));
    }
    for (;;)
    {
      localAppBrandCameraView.setScanFreq(paramJSONObject.optInt("scanFreq"));
      x.d("MicroMsg.JsApiInsertCamera", "inflateView appId:%s,cameraId: %d,devicePosition: %s,flash: %s,width: %d,height: %d", new Object[] { paramp.mAppId, Integer.valueOf(i), str1, str2, Integer.valueOf(j), Integer.valueOf(k) });
      a(paramp, localAppBrandCameraView);
      return new CoverViewContainer(localContext, localAppBrandCameraView);
      localAppBrandCameraView.l(0, 0, j, k);
    }
  }
  
  protected final void a(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    x.i("MicroMsg.JsApiInsertCamera", "onInsertView cameraId=%d", new Object[] { Integer.valueOf(paramInt) });
    paramView = (AppBrandCameraView)((CoverViewContainer)paramView).A(AppBrandCameraView.class);
    if (paramView == null)
    {
      x.w("MicroMsg.JsApiInsertCamera", "onInsertView(viewId : %d) failed, cameraView is null", new Object[] { Integer.valueOf(paramInt) });
      return;
    }
    paramJSONObject = a.a.aiD();
    int i = paramView.getCameraId();
    paramJSONObject.fNX.put(Integer.valueOf(i), paramView);
    paramp.a(paramView);
    paramp.a(paramView);
    paramp.a(paramView);
    e.a(paramp.mAppId, new g.1(this, paramp, paramView, paramInt));
    paramView.setOutPutCallBack(new g.2(this));
  }
  
  final boolean a(p paramp, AppBrandCameraView paramAppBrandCameraView)
  {
    com.tencent.mm.plugin.appbrand.a.a(paramp.mAppId, new g.3(this, paramp, paramAppBrandCameraView));
    Activity localActivity = (Activity)paramp.mContext;
    if (localActivity == null) {
      return false;
    }
    boolean bool = com.tencent.mm.pluginsdk.permission.a.a(localActivity, "android.permission.CAMERA", 16, "", "");
    a.a.aiD().fNV = bool;
    if (!bool) {
      return false;
    }
    bool = com.tencent.mm.pluginsdk.permission.a.a(localActivity, "android.permission.RECORD_AUDIO", 18, "", "");
    a.a.aiD().fNW = bool;
    if (!bool) {
      return false;
    }
    com.tencent.mm.plugin.appbrand.a.pZ(paramp.mAppId);
    paramAppBrandCameraView.initView();
    return true;
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.optInt("cameraId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/camera/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */