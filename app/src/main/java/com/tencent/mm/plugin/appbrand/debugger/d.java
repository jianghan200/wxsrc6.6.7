package com.tencent.mm.plugin.appbrand.debugger;

import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.protocal.c.cbg;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.plugin.appbrand.jsapi.n
{
  public static final int CTRL_INDEX = -2;
  public static final String NAME = "remoteDebugInfo";
  
  public final String a(c paramc, JSONObject paramJSONObject)
  {
    if (!(paramc.getRuntime().fcy instanceof n)) {
      return f("fail:not debug", null);
    }
    paramc = (n)paramc.getRuntime().fcy;
    paramJSONObject = paramJSONObject.toString();
    x.d("MicroMsg.RemoteDebugService", "RemoteDebugInfo");
    cbg localcbg = new cbg();
    localcbg.sxz = paramc.fdO.fcz.getCurrentPage().getCurrentPageView().hashCode();
    localcbg.sxy = paramJSONObject;
    paramJSONObject = p.a(localcbg, paramc.ftb, "domEvent");
    paramc.ftC.a(paramJSONObject);
    return f("ok", null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/debugger/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */