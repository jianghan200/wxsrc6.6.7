package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.mm.plugin.appbrand.appstorage.j;
import com.tencent.mm.plugin.appbrand.appstorage.k;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import java.io.File;
import java.util.Locale;
import org.json.JSONObject;

final class as
  extends d
{
  final f.a a(l paraml, String paramString, JSONObject paramJSONObject)
  {
    String str2 = paramJSONObject.optString("newPath");
    paramJSONObject = String.format(Locale.US, "fail no such file or directory, rename \"%s\" -> \"%s\"", new Object[] { paramString, str2 });
    String str1 = String.format(Locale.US, "fail permission denied, rename \"%s\" -> \"%s\"", new Object[] { paramString, str2 });
    File localFile = paraml.fdO.fcw.rb(paramString);
    if ((localFile == null) || (!localFile.exists())) {
      return new f.a(paramJSONObject, new Object[0]);
    }
    if (k.z(localFile)) {
      return new f.a("fail \"%s\" not a regular file", new Object[] { paramString });
    }
    paraml = paraml.fdO.fcw.a(str2, localFile, true);
    switch (as.1.fQo[paraml.ordinal()])
    {
    default: 
      return new f.a("fail " + paraml.name(), new Object[0]);
    case 1: 
      return new f.a(str1, new Object[0]);
    case 2: 
      return new f.a(paramJSONObject, new Object[0]);
    case 3: 
      return new f.a("fail sdcard not mounted", new Object[0]);
    }
    return new f.a("ok", new Object[0]);
  }
  
  protected final String q(JSONObject paramJSONObject)
  {
    return paramJSONObject.optString("oldPath");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/file/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */