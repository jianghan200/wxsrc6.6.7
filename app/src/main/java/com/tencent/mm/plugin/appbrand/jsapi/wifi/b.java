package com.tencent.mm.plugin.appbrand.jsapi.wifi;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.os.Build.VERSION;
import com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.c;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.ui.j;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 318;
  public static final String NAME = "getConnectedWifi";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    super.a(paraml, paramJSONObject, paramInt);
    if (!d.gdr)
    {
      x.e("MicroMsg.JsApiGetConnectedWifi", "not invoke startWifi");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12000));
      paraml.E(paramInt, f("fail:not invoke startWifi", paramJSONObject));
      return;
    }
    Object localObject = paraml.getContext();
    if (localObject == null)
    {
      x.e("MicroMsg.JsApiGetConnectedWifi", "mContext is null, invoke fail!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12010));
      paraml.E(paramInt, f("fail:context is null", paramJSONObject));
      return;
    }
    com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.cC((Context)localObject);
    if (!c.isWifiEnabled())
    {
      x.e("MicroMsg.JsApiGetConnectedWifi", "wifi is disable,invoke fail!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12005));
      paraml.E(paramInt, f("fail:wifi is disable", paramJSONObject));
      return;
    }
    paramJSONObject = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.akv();
    if (paramJSONObject == null)
    {
      if ((Build.VERSION.SDK_INT >= 23) && (!j.Ae()) && (!((LocationManager)((Context)localObject).getSystemService("location")).isProviderEnabled("gps")))
      {
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(12006));
        paraml.E(paramInt, f("fail:may be not open GPS", paramJSONObject));
        x.e("MicroMsg.JsApiGetConnectedWifi", "wifiList is empty, may be not open GPS");
        return;
      }
      boolean bool = com.tencent.mm.pluginsdk.permission.a.a((Activity)localObject, "android.permission.ACCESS_COARSE_LOCATION", 64, null, null);
      x.i("MicroMsg.JsApiGetConnectedWifi", "checkLocation:%b", new Object[] { Boolean.valueOf(bool) });
      if (!bool)
      {
        paramJSONObject = new HashMap();
        paramJSONObject.put("errCode", Integer.valueOf(12012));
        paraml.E(paramInt, f("fail:may be not obtain GPS Perrmission", paramJSONObject));
        x.e("MicroMsg.JsApiGetConnectedWifi", "wifiList is empty, may be not obtain GPS Perrmission");
        return;
      }
      x.e("MicroMsg.JsApiGetConnectedWifi", "currentWifi is null");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12010));
      paraml.E(paramInt, f("fail:currentWifi is null", paramJSONObject));
      return;
    }
    localObject = (ConnectivityManager)((Context)localObject).getSystemService("connectivity");
    if (localObject == null)
    {
      x.e("MicroMsg.JsApiGetConnectedWifi", "ConnectivityManager is null");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12010));
      paraml.E(paramInt, f("fail:connectivityManager is null", paramJSONObject));
      return;
    }
    localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
    if (localObject == null)
    {
      x.e("MicroMsg.JsApiGetConnectedWifi", "netInfo is null");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12010));
      paraml.E(paramInt, f("fail:netInfo is null", paramJSONObject));
      return;
    }
    if (((NetworkInfo)localObject).getDetailedState() != NetworkInfo.DetailedState.CONNECTED)
    {
      x.e("MicroMsg.JsApiGetConnectedWifi", "ConnectivityManager is null, detailState:%s", new Object[] { ((NetworkInfo)localObject).getDetailedState() });
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12010));
      paraml.E(paramInt, f("fail:detailState is not connected", paramJSONObject));
      return;
    }
    x.i("MicroMsg.JsApiGetConnectedWifi", "[invoke]currentWifi:%s", new Object[] { paramJSONObject });
    try
    {
      localObject = new HashMap();
      ((HashMap)localObject).put("wifi", paramJSONObject.tR());
      ((HashMap)localObject).put("errCode", Integer.valueOf(0));
      paraml.E(paramInt, f("ok", (Map)localObject));
      return;
    }
    catch (JSONException paramJSONObject)
    {
      x.printErrStackTrace("MicroMsg.JsApiGetConnectedWifi", paramJSONObject, "", new Object[0]);
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12010));
      paraml.E(paramInt, f("fail:parse json err", paramJSONObject));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/wifi/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */