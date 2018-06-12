package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.mm.plugin.appbrand.appstorage.j;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.q.h;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.nio.ByteBuffer;
import java.util.Map;
import org.json.JSONObject;

final class ar
  extends d
{
  final f.a a(l paraml, String paramString, JSONObject paramJSONObject)
  {
    paramJSONObject = paramJSONObject.optString("encoding");
    x.i("MicroMsg.AppBrand.UnitReadFile", "call, path %s, encoding %s", new Object[] { paramString, paramJSONObject });
    if (bi.oW(paramJSONObject)) {
      paramJSONObject = null;
    }
    for (;;)
    {
      h localh = new h();
      paraml = paraml.fdO.fcw.a(paramString, localh);
      if (paraml == j.fkI)
      {
        if (paramJSONObject == null) {}
        for (paraml = (Comparable)localh.value;; paraml = paramJSONObject.i((ByteBuffer)localh.value))
        {
          if (!(paraml instanceof ByteBuffer)) {
            com.tencent.mm.plugin.appbrand.l.a.j((ByteBuffer)localh.value);
          }
          return new f.a("ok", new Object[0]).t("data", paraml);
          paramJSONObject = (e)e.a.fQd.get(paramJSONObject.toLowerCase());
          if (paramJSONObject != null) {
            break;
          }
          return new f.a("fail invalid encoding", new Object[0]);
        }
      }
      switch (ar.1.fQo[paraml.ordinal()])
      {
      default: 
        return new f.a("fail " + paraml.name(), new Object[0]);
      case 1: 
        return new f.a("fail no such file \"%s\"", new Object[] { paramString });
      case 2: 
        return new f.a("fail permission denied, open \"%s\"", new Object[] { paramString });
      }
      return new f.a("fail \"%s\" is not a regular file", new Object[] { paramString });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/file/ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */