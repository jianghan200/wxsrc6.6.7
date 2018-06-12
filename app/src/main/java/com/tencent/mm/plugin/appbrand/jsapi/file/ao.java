package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.mm.plugin.appbrand.appstorage.j;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import org.json.JSONObject;

final class ao
  extends d
{
  final f.a a(l paraml, String paramString, JSONObject paramJSONObject)
  {
    boolean bool = true;
    paraml = paraml.fdO.fcw.rf(paramString);
    switch (ao.1.fQo[paraml.ordinal()])
    {
    default: 
      return new f.a("fail " + paraml.name(), new Object[0]);
    case 1: 
      return new f.a("fail no such file or directory \"%s\"", new Object[] { paramString });
    }
    paramString = new f.a("ok", new Object[0]);
    if (paraml == j.fkI) {}
    for (;;)
    {
      return paramString.t("result", Boolean.valueOf(bool));
      bool = false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/file/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */