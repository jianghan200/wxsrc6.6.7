package com.tencent.mm.plugin.appbrand.jsapi.f;

import android.view.View;
import com.tencent.mm.plugin.appbrand.jsapi.f.a.c;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class k
  extends com.tencent.mm.plugin.appbrand.jsapi.base.b
{
  public static final int CTRL_INDEX = 3;
  public static final String NAME = "removeMap";
  
  public final void a(p paramp, JSONObject paramJSONObject, int paramInt)
  {
    Object localObject = paramp.mAppId;
    int i = k(paramJSONObject);
    x.i("MicroMsg.JsApiRemoveMap", "removeMap appId:%s mapId:%d data:%s", new Object[] { localObject, Integer.valueOf(i), paramJSONObject });
    localObject = com.tencent.mm.plugin.appbrand.jsapi.f.a.b.E((String)localObject, paramp.hashCode(), i);
    if (localObject != null) {
      ah.A(new k.1(this, (c)localObject));
    }
    super.a(paramp, paramJSONObject, paramInt);
  }
  
  protected final boolean b(p paramp, int paramInt, View paramView, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiRemoveMap", "data is null");
      return false;
    }
    com.tencent.mm.plugin.appbrand.jsapi.f.a.b.F(paramp.mAppId, paramp.hashCode(), k(paramJSONObject));
    return true;
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
      x.e("MicroMsg.JsApiRemoveMap", "get mapId error, exception : %s", new Object[] { paramJSONObject });
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/f/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */