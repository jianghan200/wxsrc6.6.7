package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.mm.plugin.appbrand.appstorage.j;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import org.json.JSONObject;

final class al
  extends d
{
  final f.a a(l paraml, String paramString, JSONObject paramJSONObject)
  {
    if (paraml.fdO.fcw.ra(paramString) == j.fkI) {}
    for (paraml = "ok";; paraml = String.format("fail no such file or directory \"%s\"", new Object[] { paramString })) {
      return new f.a(paraml, new Object[0]);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/file/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */