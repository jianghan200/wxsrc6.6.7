package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class bs
  extends a
{
  public static final int CTRL_INDEX = 65;
  public static final String NAME = "systemLog";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = paramJSONObject.optString("message");
    x.i("AppBrandLog." + paraml.mAppId, paramJSONObject);
  }
  
  public final void a(p paramp, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = paramJSONObject.optString("message");
    x.i("AppBrandLog." + paramp.mAppId, paramJSONObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */