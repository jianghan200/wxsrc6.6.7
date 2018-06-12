package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.mm.plugin.appbrand.appstorage.j;
import com.tencent.mm.plugin.appbrand.appstorage.k;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.q.h;
import com.tencent.mm.sdk.platformtools.bi;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Locale;
import org.json.JSONObject;

final class an
  extends d
{
  final f.a a(l paraml, String paramString, JSONObject paramJSONObject)
  {
    paramJSONObject = paramJSONObject.optString("destPath");
    String str1 = String.format(Locale.US, "fail no such file or directory, copyFile \"%s\" -> \"%s\"", new Object[] { paramString, paramJSONObject });
    String str2 = String.format(Locale.US, "fail permission denied, copyFile \"%s\" -> \"%s\"", new Object[] { paramString, paramJSONObject });
    Object localObject = paraml.fdO.fcw.rb(paramString);
    if ((localObject == null) || (!((File)localObject).exists()) || (!((File)localObject).isFile()))
    {
      localObject = new h();
      paraml.fdO.fcw.a(paramString, (h)localObject);
      if (((h)localObject).value == null) {
        return new f.a(str1, new Object[0]);
      }
      paramString = new com.tencent.mm.plugin.appbrand.l.a((ByteBuffer)((h)localObject).value);
      paraml = paraml.fdO.fcw.a(paramJSONObject, paramString, false);
      bi.d(paramString);
    }
    for (;;)
    {
      switch (an.1.fQo[paraml.ordinal()])
      {
      default: 
        return new f.a("fail " + paraml.name(), new Object[0]);
        if (k.z((File)localObject)) {
          return new f.a("fail \"%s\" not a regular file", new Object[] { paramString });
        }
        paraml = paraml.fdO.fcw.a(paramJSONObject, (File)localObject, false);
      }
    }
    return new f.a(str2, new Object[0]);
    return new f.a(str1, new Object[0]);
    return new f.a("fail sdcard not mounted", new Object[0]);
    return new f.a("fail illegal operation on a directory, open \"%s\"", new Object[] { paramJSONObject });
    return new f.a("fail \"%s\" is not a regular file", new Object[] { paramJSONObject });
    return new f.a("fail the maximum size of the file storage limit is exceeded", new Object[0]);
    return new f.a("ok", new Object[0]);
  }
  
  protected final String q(JSONObject paramJSONObject)
  {
    return paramJSONObject.optString("srcPath");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/file/an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */