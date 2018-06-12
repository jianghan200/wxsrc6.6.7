package com.tencent.mm.plugin.appbrand.dynamic.h;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.mm.plugin.appbrand.collector.CollectSession;
import com.tencent.mm.plugin.appbrand.collector.c;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public final class d
{
  private static Set<String> fxu = new HashSet();
  
  static
  {
    if (!TextUtils.isEmpty("drawCanvas")) {
      fxu.add("drawCanvas");
    }
  }
  
  public static void a(String paramString1, String paramString2, JSONObject paramJSONObject)
  {
    try
    {
      paramJSONObject.put("__session_id", paramString1);
      paramJSONObject.put("__invoke_jsapi_timestamp", System.nanoTime());
      paramString1 = c.rv(paramString1);
      if (paramString1 != null) {
        paramString1.bQf.putInt("__invoke_jsapi_data_size", paramString2.length());
      }
      return;
    }
    catch (JSONException paramString1)
    {
      x.e("MicroMsg.JsApiCostTimeStrategy", "%s", new Object[] { Log.getStackTraceString(paramString1) });
    }
  }
  
  public static String j(JSONObject paramJSONObject)
  {
    return paramJSONObject.optString("__session_id");
  }
  
  public static boolean rB(String paramString)
  {
    return fxu.contains(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/h/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */