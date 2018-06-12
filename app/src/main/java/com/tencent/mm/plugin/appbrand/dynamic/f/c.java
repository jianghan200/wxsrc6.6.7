package com.tencent.mm.plugin.appbrand.dynamic.f;

import com.tencent.mm.sdk.platformtools.bi;
import org.json.JSONException;
import org.json.JSONObject;

public final class c
  extends com.tencent.mm.u.b.c
{
  public String data;
  
  public c()
  {
    super("onDataPush");
  }
  
  c(int paramInt)
  {
    super("onDataPush", paramInt);
  }
  
  public final JSONObject tR()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("data", bi.oV(this.data));
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return localJSONObject;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */