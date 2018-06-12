package com.tencent.mm.plugin.appbrand.jsapi.b;

import com.tencent.mm.plugin.appbrand.jsapi.base.c;
import org.json.JSONObject;

public final class f
  extends c
{
  public static final int CTRL_INDEX = 83;
  public static final String NAME = "updateCanvas";
  
  protected final boolean aii()
  {
    return true;
  }
  
  protected final int k(JSONObject paramJSONObject)
  {
    return paramJSONObject.optInt("canvasId");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */