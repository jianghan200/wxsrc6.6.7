package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import android.annotation.TargetApi;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;
import org.json.JSONObject;

@TargetApi(18)
public final class e
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 174;
  private static final String NAME = "closeBluetoothAdapter";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    c.kB(116);
    paramJSONObject = paraml.mAppId;
    x.i("MicroMsg.JsApiCloseBluetoothAdapter", "appId:%s closeBluetoothAdapter!", new Object[] { paramJSONObject });
    paramJSONObject = a.ts(paramJSONObject);
    x.i("MicroMsg.JsApiCloseBluetoothAdapter", "result:%s", new Object[] { paramJSONObject });
    switch (e.1.fLf[paramJSONObject.ordinal()])
    {
    default: 
      paraml.E(paramInt, f("fail", null));
      c.kB(118);
      return;
    }
    paraml.E(paramInt, f("ok", null));
    c.kB(117);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */