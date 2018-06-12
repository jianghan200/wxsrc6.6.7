package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.mm.plugin.appbrand.MiniProgramNavigationBackResult;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.6;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.ui.MMActivity;
import org.json.JSONObject;

public final class c
  extends a
{
  public static final int CTRL_INDEX = 252;
  public static final String NAME = "navigateBackMiniProgram";
  
  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt)
  {
    JSONObject localJSONObject = paramJSONObject.optJSONObject("extraData");
    paramJSONObject = paramJSONObject.optJSONObject("privateExtraData");
    paramc = paramc.getRuntime();
    paramJSONObject = MiniProgramNavigationBackResult.a(localJSONObject, paramJSONObject);
    paramc.fcq.runOnUiThread(new g.6(paramc, paramJSONObject));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/miniprogram_navigator/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */