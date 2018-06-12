package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.mm.plugin.appbrand.appstorage.FileStructStat;
import com.tencent.mm.plugin.appbrand.appstorage.j;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import org.json.JSONObject;

final class au
  extends d
{
  final f.a a(l paraml, String paramString, JSONObject paramJSONObject)
  {
    paramJSONObject = new FileStructStat();
    paraml = paraml.fdO.fcw.a(paramString, paramJSONObject);
    switch (1.fQo[paraml.ordinal()])
    {
    default: 
      return new f.a("fail " + paraml.name(), new Object[0]);
    case 1: 
      return new f.a("ok", new Object[0]).t("mode", Integer.valueOf(paramJSONObject.st_mode)).t("size", Long.valueOf(paramJSONObject.st_size)).t("lastAccessedTime", Long.valueOf(paramJSONObject.st_atime)).t("lastModifiedTime", Long.valueOf(paramJSONObject.st_mtime));
    case 2: 
    case 3: 
      return new f.a("fail no such file or directory \"%s\"", new Object[] { paramString });
    }
    return new f.a("fail permission denied, open \"%s\"", new Object[] { paramString });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/file/au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */