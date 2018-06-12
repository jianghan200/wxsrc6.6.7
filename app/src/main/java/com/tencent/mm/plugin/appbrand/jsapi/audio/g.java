package com.tencent.mm.plugin.appbrand.jsapi.audio;

import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.media.record.b;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class g
  extends a
{
  public static final int CTRL_INDEX = 469;
  public static final String NAME = "getAvailableAudioSources";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    if (paramJSONObject != null) {}
    for (paramJSONObject = paramJSONObject.toString();; paramJSONObject = "")
    {
      x.i("MicroMsg.JsApiGetAvailableAudioSources", "getAvailableAudioSources data:%s", new Object[] { paramJSONObject });
      localObject = new ArrayList();
      ((List)localObject).add(b.gib.toString().toLowerCase());
      ((List)localObject).add(b.gic.toString().toLowerCase());
      ((List)localObject).add(b.gid.toString().toLowerCase());
      ((List)localObject).add(b.gie.toString().toLowerCase());
      ((List)localObject).add(b.gif.toString().toLowerCase());
      if (d.fR(24)) {
        ((List)localObject).add(b.gig.toString().toLowerCase());
      }
      paramJSONObject = new JSONArray();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        paramJSONObject.put((String)((Iterator)localObject).next());
      }
    }
    Object localObject = new HashMap(1);
    ((HashMap)localObject).put("audioSources", paramJSONObject);
    x.i("MicroMsg.JsApiGetAvailableAudioSources", "getAvailableAudioSources ret:%s", new Object[] { ((HashMap)localObject).toString() });
    paraml.E(paramInt, f("ok", (Map)localObject));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/audio/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */