package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import android.annotation.TargetApi;
import com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.j;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

@TargetApi(18)
public final class d
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 181;
  private static final String NAME = "closeBLEConnection";
  
  public final void a(final l paraml, JSONObject paramJSONObject, final int paramInt)
  {
    c.kB(91);
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiCloseBLEConnection", "JsApiCloseBLEConnection data is null");
      paraml.E(paramInt, f("fail:invalid data", null));
      c.bK(93, 94);
      return;
    }
    x.i("MicroMsg.JsApiCloseBLEConnection", "appId:%s createBLEConnection data %s", new Object[] { paraml.mAppId, paramJSONObject.toString() });
    b localb = a.tr(paraml.mAppId);
    if (localb == null)
    {
      x.e("MicroMsg.JsApiCloseBLEConnection", "bleWorker is null, may not open ble");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10000));
      paraml.E(paramInt, f("fail:not init", paramJSONObject));
      c.bK(93, 96);
      return;
    }
    if (!com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.d.b.aiB())
    {
      x.e("MicroMsg.JsApiCloseBLEConnection", "adapter is null or not enabled!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(10001));
      paraml.E(paramInt, f("fail:not available", paramJSONObject));
      c.bK(93, 98);
      return;
    }
    String str = paramJSONObject.optString("deviceId");
    boolean bool1 = paramJSONObject.optBoolean("debug", false);
    boolean bool2 = paramJSONObject.optBoolean("mainThread", true);
    boolean bool3 = paramJSONObject.optBoolean("serial", true);
    paramJSONObject = new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.a.a.a();
    paramJSONObject.Zq = bool1;
    paramJSONObject.fLy = bool2;
    paramJSONObject.fLA = bool3;
    localb.a(str, paramJSONObject, new com.tencent.mm.plugin.appbrand.jsapi.bluetooth.ble.sdk.c.b()
    {
      public final void a(j paramAnonymousj)
      {
        switch (d.2.fLf[paramAnonymousj.ordinal()])
        {
        default: 
          HashMap localHashMap = new HashMap();
          localHashMap.put("errCode", Integer.valueOf(paramAnonymousj.errCode));
          paraml.E(paramInt, d.this.f(paramAnonymousj.Yy, localHashMap));
          c.kB(93);
          return;
        }
        paramAnonymousj = new HashMap();
        paramAnonymousj.put("errCode", Integer.valueOf(0));
        paraml.E(paramInt, d.this.f("ok", paramAnonymousj));
        c.kB(92);
      }
    });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */