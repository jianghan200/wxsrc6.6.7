package com.tencent.mm.plugin.appbrand.jsapi.wifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.text.TextUtils;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.e.b;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.h;
import com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.b;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
  extends a
{
  public static final int CTRL_INDEX = 314;
  public static final String NAME = "startWifi";
  public static boolean gdr = false;
  public static BroadcastReceiver gds = null;
  
  public final void a(final l paraml, final JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.JsApiStartWifi", "invoke startWifi");
    paramJSONObject = paraml.getContext();
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.JsApiStartWifi", "mContext is null, invoke fail!");
      paramJSONObject = new HashMap();
      paramJSONObject.put("errCode", Integer.valueOf(12010));
      paraml.E(paramInt, f("fail:context is null", paramJSONObject));
      return;
    }
    com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.cC(paramJSONObject);
    if (!gdr)
    {
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
      localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
      localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
      localIntentFilter.setPriority(Integer.MAX_VALUE);
      gds = new BroadcastReceiver()
      {
        public final void onReceive(Context paramAnonymousContext, Intent paramAnonymousIntent)
        {
          if (paramAnonymousIntent == null) {}
          int i;
          label88:
          do
          {
            do
            {
              return;
              paramAnonymousContext = paramAnonymousIntent.getAction();
            } while (TextUtils.isEmpty(paramAnonymousContext));
            x.i("MicroMsg.JsApiStartWifi", "actiong:%s", new Object[] { paramAnonymousContext });
            if ("android.net.wifi.WIFI_STATE_CHANGED".equals(paramAnonymousContext))
            {
              i = paramAnonymousIntent.getIntExtra("wifi_state", 0);
              x.i("MicroMsg.JsApiStartWifi", "wifiState" + i);
            }
            switch (i)
            {
            default: 
              if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(paramAnonymousContext)) {
                break label184;
              }
              paramAnonymousContext = paramAnonymousIntent.getParcelableExtra("networkInfo");
            }
          } while (paramAnonymousContext == null);
          paramAnonymousContext = (NetworkInfo)paramAnonymousContext;
          label125:
          int j;
          if (paramAnonymousContext.getState() == NetworkInfo.State.CONNECTED)
          {
            i = 1;
            if (paramAnonymousContext.getType() != 1) {
              break label191;
            }
            j = 1;
          }
          for (;;)
          {
            if ((i != 0) && (j != 0))
            {
              paramAnonymousContext = com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.d.akv();
              x.i("MicroMsg.JsApiStartWifi", "[mWiFiEventReceiver]currentWifi:%s", new Object[] { paramAnonymousContext });
              if (paramAnonymousContext == null)
              {
                x.e("MicroMsg.JsApiStartWifi", "[CONNECTIVITY_ACTION]currentWIfi is null");
                return;
                d.m(paraml);
                break label88;
                label184:
                break;
                i = 0;
                break label125;
                label191:
                j = 0;
                continue;
              }
              try
              {
                paramAnonymousIntent = new a.a();
                HashMap localHashMap = new HashMap();
                localHashMap.put("wifi", paramAnonymousContext.tR());
                paramAnonymousIntent.aC(paraml.mAppId, 0).x(localHashMap).ahM();
                return;
              }
              catch (JSONException paramAnonymousContext)
              {
                x.e("MicroMsg.JsApiStartWifi", "IConnectWiFiCallback is error");
                x.printErrStackTrace("MicroMsg.JsApiStartWifi", paramAnonymousContext, "", new Object[0]);
                return;
              }
            }
          }
          d.m(paraml);
        }
      };
      paramJSONObject.registerReceiver(gds, localIntentFilter);
      gdr = true;
    }
    paramJSONObject = new e.b()
    {
      public final void onDestroy()
      {
        if (d.gds != null)
        {
          x.i("MicroMsg.JsApiStartWifi", "unregisterReceiver");
          paramJSONObject.unregisterReceiver(d.gds);
          d.gdr = false;
          d.gds = null;
        }
        e.b(paraml.mAppId, this);
      }
    };
    e.a(paraml.mAppId, paramJSONObject);
    paramJSONObject = new HashMap();
    paramJSONObject.put("errCode", Integer.valueOf(0));
    paraml.E(paramInt, f("ok", paramJSONObject));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/wifi/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */