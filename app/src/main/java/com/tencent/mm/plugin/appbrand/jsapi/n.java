package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import org.json.JSONObject;

public class n
  extends e
{
  public Thread fFo;
  
  public String a(c paramc, JSONObject paramJSONObject)
  {
    if ((paramc instanceof l))
    {
      this.fFo = Thread.currentThread();
      return a((l)paramc, paramJSONObject);
    }
    if ((paramc instanceof p)) {
      return a((p)paramc);
    }
    return "";
  }
  
  public String a(l paraml, JSONObject paramJSONObject)
  {
    return "";
  }
  
  public String a(p paramp)
  {
    return "";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */