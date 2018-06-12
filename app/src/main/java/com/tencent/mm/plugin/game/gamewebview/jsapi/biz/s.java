package com.tencent.mm.plugin.game.gamewebview.jsapi.biz;

import com.tencent.mm.plugin.game.gamewebview.jsapi.a;
import com.tencent.mm.plugin.game.gamewebview.ui.d;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class s
  extends a
{
  public static final int CTRL_BYTE = 16;
  public static final String NAME = "getNetworkType";
  
  public final void a(d paramd, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.GameJsApiGetNetworkType", "invoke");
    paramJSONObject = paramd.getContext();
    if (paramJSONObject == null)
    {
      x.e("MicroMsg.GameJsApiGetNetworkType", "context is null");
      return;
    }
    if (!ao.isConnected(paramJSONObject))
    {
      x.i("MicroMsg.GameJsApiGetNetworkType", "getNetworkType, not connected");
      paramd.E(paramInt, a.f("network_type:fail", null));
      return;
    }
    int i = ao.getNetType(paramJSONObject);
    x.i("MicroMsg.GameJsApiGetNetworkType", "getNetworkType, type = " + i);
    HashMap localHashMap = new HashMap();
    if (ao.isWifi(paramJSONObject))
    {
      x.i("MicroMsg.GameJsApiGetNetworkType", "getNetworkType, wifi");
      paramd.E(paramInt, a.f("network_type:wifi", null));
      return;
    }
    if (ao.is2G(paramJSONObject))
    {
      x.i("MicroMsg.GameJsApiGetNetworkType", "getNetworkType, 2g");
      localHashMap.put("subtype", "2g");
    }
    for (;;)
    {
      paramd.E(paramInt, f("network_type:wwan", localHashMap));
      return;
      if (ao.is3G(paramJSONObject))
      {
        x.i("MicroMsg.GameJsApiGetNetworkType", "getNetworkType, 3g");
        localHashMap.put("subtype", "3g");
      }
      else if (ao.is4G(paramJSONObject))
      {
        x.i("MicroMsg.GameJsApiGetNetworkType", "getNetworkType, 4g");
        localHashMap.put("subtype", "4g");
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/game/gamewebview/jsapi/biz/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */