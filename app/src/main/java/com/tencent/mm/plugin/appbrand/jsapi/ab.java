package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;

public class ab
  extends n
{
  public static int CTRL_INDEX = 71;
  public static String NAME = "getCurrentRoute";
  
  public final String a(p paramp)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("route", paramp.getURL());
    x.d("MicroMsg.JsApiGetCurrentRoute", "getCurrentRoute : %s", new Object[] { f("ok", localHashMap) });
    return f("ok", localHashMap);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */