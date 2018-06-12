package com.tencent.mm.plugin.appbrand.jsapi.h;

import android.os.Handler;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.jsapi.n;
import com.tencent.mm.plugin.appbrand.l;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public abstract class a
  extends n
{
  public final String a(l paraml, JSONObject paramJSONObject)
  {
    String str = ajr();
    HashMap localHashMap = new HashMap();
    localHashMap.put(ajs(), str);
    paraml.fdP.fwr.post(new a.1(this, paraml, paramJSONObject, str));
    return f("ok", localHashMap);
  }
  
  public abstract void a(l paraml, JSONObject paramJSONObject, String paramString);
  
  public abstract String ajr();
  
  public abstract String ajs();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/h/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */