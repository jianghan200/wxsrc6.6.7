package com.tencent.mm.plugin.appbrand.dynamic.d.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.tencent.mm.plugin.appbrand.dynamic.h.d;
import com.tencent.mm.plugin.appbrand.q.k;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.u.b.b.a;
import com.tencent.mm.v.g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class c
  implements com.tencent.mm.u.c.b
{
  private Handler fwr;
  public com.tencent.mm.plugin.appbrand.dynamic.i.a fws;
  
  public c()
  {
    HandlerThread localHandlerThread = new HandlerThread("JsApiExecutor-Thread:" + hashCode());
    localHandlerThread.start();
    this.fwr = new Handler(localHandlerThread.getLooper());
  }
  
  static JSONObject sG(String paramString)
  {
    String str = paramString;
    try
    {
      if (bi.oW(paramString)) {
        str = "{}";
      }
      long l = System.nanoTime();
      paramString = g.fU(str);
      com.tencent.mm.plugin.appbrand.dynamic.i.b.f(System.nanoTime() - l, str.length());
      return paramString;
    }
    catch (Exception paramString)
    {
      x.e("MicroMsg.DefaultJsApiExecutor", Log.getStackTraceString(paramString));
    }
    return null;
  }
  
  public final String H(String paramString1, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("errMsg", paramString1 + ":" + paramString2);
    return new JSONObject(localHashMap).toString();
  }
  
  public final String a(com.tencent.mm.u.c.a parama, com.tencent.mm.u.d.a parama1, com.tencent.mm.u.b.b paramb, String paramString, b.a parama2)
  {
    String str = paramb.name;
    if (!parama1.gu(paramb.index))
    {
      x.i("MicroMsg.DefaultJsApiExecutor", "JsApiFunc(%s) no permission.", new Object[] { str });
      parama1 = H(str, "fail:access denied");
      return parama1;
    }
    parama1 = k.bT(System.nanoTime());
    boolean bool = d.rB(str);
    com.tencent.mm.plugin.appbrand.collector.c.c("jsapi_draw_canvas", parama1, "start_jsapi_invoke", bool);
    com.tencent.mm.plugin.appbrand.collector.c.ba(parama1, "after_draw_actions");
    if ((paramb instanceof b))
    {
      parama1 = sG(paramString);
      if (parama1 == null) {
        return H(str, "fail:invalid data");
      }
    }
    for (parama = paramb.a(parama, parama1, parama2);; parama = "")
    {
      parama1 = parama;
      if (this.fws == null) {
        break;
      }
      this.fws.sI(str);
      return parama;
      this.fwr.post(new c.1(this, parama1, bool, paramString, parama2, str, paramb, parama));
    }
  }
  
  public final String fN(String paramString)
  {
    x.i("MicroMsg.DefaultJsApiExecutor", "JsApiFunc(%s) do not exist.", new Object[] { paramString });
    return H(paramString, "fail:not supported");
  }
  
  public final void quit()
  {
    this.fwr.getLooper().quit();
    if (this.fws != null) {
      this.fws.xP();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/d/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */