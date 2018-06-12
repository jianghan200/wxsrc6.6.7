package com.tencent.mm.plugin.appbrand.jsapi.auth;

import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.r.f;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Queue;
import org.json.JSONObject;

abstract class c
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, int paramInt, String paramString)
  {
    paramc.E(paramInt, f(paramString, null));
  }
  
  public void a(com.tencent.mm.plugin.appbrand.jsapi.c arg1, final JSONObject paramJSONObject, final int paramInt)
  {
    final a locala = a.r(???.getRuntime());
    paramJSONObject = new a.a()
    {
      public final void Yz()
      {
        x.i("MicroMsg.AppBrand.BaseAuthJsApi", "about to call AuthInvoke, api[%s]", new Object[] { c.this.getName() });
        if (!paramc.isRunning())
        {
          x.e("MicroMsg.AppBrand.BaseAuthJsApi", "doAuth but component not running, api = %s", new Object[] { c.this.getName() });
          locala.Dd(2);
          return;
        }
        c.this.a(paramc, paramJSONObject, paramInt, locala);
      }
      
      public final String toString()
      {
        return hashCode() + "|" + c.this.getName();
      }
    };
    if (!locala.aic()) {}
    synchronized (locala.gBF)
    {
      locala.gBF.offer(paramJSONObject);
      locala.Dd(1);
      return;
    }
  }
  
  protected abstract void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject paramJSONObject, int paramInt, b paramb);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/auth/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */