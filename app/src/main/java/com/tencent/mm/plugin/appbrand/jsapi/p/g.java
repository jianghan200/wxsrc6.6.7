package com.tencent.mm.plugin.appbrand.jsapi.p;

import com.tencent.mm.plugin.appbrand.jsapi.base.b;
import org.json.JSONObject;

public final class g
  extends b
{
  public static final int CTRL_INDEX = 299;
  public static final String NAME = "removeHTMLWebView";
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.getInt("htmlId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/p/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */