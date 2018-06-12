package com.tencent.mm.plugin.appbrand.jsapi;

import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import java.util.Map;
import org.json.JSONObject;

public abstract class g
{
  protected l fFa;
  protected p fFb;
  protected JSONObject fFc;
  private int fFd;
  private e fFe;
  
  public g(e parame, l paraml, p paramp, JSONObject paramJSONObject, int paramInt)
  {
    if ((parame == null) || (paraml == null) || (paramJSONObject == null)) {
      throw new IllegalArgumentException("JsApiAsyncRequest");
    }
    this.fFe = parame;
    this.fFa = paraml;
    this.fFb = paramp;
    this.fFd = paramInt;
    this.fFc = paramJSONObject;
  }
  
  public final l ahK()
  {
    return this.fFa;
  }
  
  public final JSONObject ahL()
  {
    return this.fFc;
  }
  
  public final void g(String paramString, Map<String, ? extends Object> paramMap)
  {
    this.fFa.E(this.fFd, this.fFe.f(paramString, paramMap));
  }
  
  public final void w(Map<String, ? extends Object> paramMap)
  {
    this.fFa.E(this.fFd, this.fFe.f("ok", paramMap));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */