package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.mm.plugin.appbrand.appstorage.j;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import org.json.JSONObject;

final class at
  extends d
{
  final f.a a(l paraml, String paramString, JSONObject paramJSONObject)
  {
    paraml = paraml.fdO.fcw.rh(paramString);
    switch (at.1.fQo[paraml.ordinal()])
    {
    default: 
      return new f.a("fail " + paraml.name(), new Object[0]);
    case 1: 
    case 2: 
      return new f.a("fail no such file or directory \"%s\"", new Object[] { paramString });
    case 3: 
      return new f.a("fail directory not empty", new Object[0]);
    case 4: 
      return new f.a("fail permission denied, open \"%s\"", new Object[] { paramString });
    }
    return new f.a("ok", new Object[0]);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/file/at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */