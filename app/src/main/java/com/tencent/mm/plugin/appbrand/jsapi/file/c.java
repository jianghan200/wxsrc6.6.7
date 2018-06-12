package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.mm.plugin.appbrand.jsapi.n;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.r.m;
import org.json.JSONObject;

abstract class c<T extends d>
  extends n
{
  private final T fPZ;
  
  public c(T paramT)
  {
    this.fPZ = paramT;
    this.fPZ.fQc = this;
  }
  
  public final String a(l paraml, JSONObject paramJSONObject)
  {
    paramJSONObject = this.fPZ.b(paraml, paramJSONObject);
    m.a(paraml, paramJSONObject.values, this);
    return f(paramJSONObject.Yy, paramJSONObject.values);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/file/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */