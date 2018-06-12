package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.mm.plugin.appbrand.appstorage.j;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.sdk.platformtools.bi;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.util.Map;
import org.json.JSONObject;

class ax
  extends d
{
  f.a a(l paraml, String paramString, JSONObject paramJSONObject)
  {
    boolean bool = paramJSONObject.optBoolean("append");
    String str = paramJSONObject.optString("encoding");
    m.a(paraml, paramJSONObject, this.fQc);
    Object localObject = paramJSONObject.opt("data");
    if ((localObject instanceof String)) {
      if (bi.oW(str)) {
        paramJSONObject = (e)e.a.fQd.get("utf8");
      }
    }
    for (;;)
    {
      try
      {
        paramJSONObject = paramJSONObject.ty((String)localObject);
        paramJSONObject = new com.tencent.mm.plugin.appbrand.l.a(paramJSONObject);
        paraml = paraml.fdO.fcw.a(paramString, paramJSONObject, bool);
        switch (1.fQo[paraml.ordinal()])
        {
        default: 
          return new f.a("fail " + paraml.name(), new Object[0]);
        }
      }
      catch (Exception paraml)
      {
        return new f.a("fail " + paraml.getMessage(), new Object[0]);
      }
      paramJSONObject = (e)e.a.fQd.get(str.toLowerCase());
      if (paramJSONObject == null)
      {
        return new f.a("fail invalid encoding", new Object[0]);
        if ((localObject instanceof ByteBuffer))
        {
          paramJSONObject = new com.tencent.mm.plugin.appbrand.l.a((ByteBuffer)localObject);
        }
        else if (localObject == null)
        {
          if (bool) {
            return new f.a("ok", new Object[0]);
          }
          paramJSONObject = new ByteArrayInputStream(new byte[0]);
        }
        else
        {
          return new f.a("fail invalid data", new Object[0]);
          return new f.a("fail no such file or directory, open \"%s\"", new Object[] { paramString });
          return new f.a("fail illegal operation on a directory, open \"%s\"", new Object[] { paramString });
          return new f.a("fail permission denied, open \"%s\"", new Object[] { paramString });
          return new f.a("fail \"%s\" is not a regular file", new Object[] { paramString });
          return new f.a("fail the maximum size of the file storage limit is exceeded", new Object[0]);
          return new f.a("ok", new Object[0]);
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/file/ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */