package com.tencent.mm.plugin.appbrand.jsapi.file;

import android.net.Uri;
import com.tencent.mm.plugin.appbrand.appstorage.j;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

final class aq
  extends d
{
  final f.a a(l paraml, String paramString, JSONObject paramJSONObject)
  {
    Object localObject = Uri.parse(paramString);
    paramJSONObject = new LinkedList();
    if ((bi.oV(((Uri)localObject).getScheme()).equals("wxfile")) && (bi.oW(((Uri)localObject).getAuthority())))
    {
      localObject = new com.tencent.mm.plugin.appbrand.q.h();
      ((com.tencent.mm.plugin.appbrand.appstorage.a)paraml.fdO.fcw.B(com.tencent.mm.plugin.appbrand.appstorage.a.class)).b("", (com.tencent.mm.plugin.appbrand.q.h)localObject);
      if (!bi.cX((List)((com.tencent.mm.plugin.appbrand.q.h)localObject).value))
      {
        Iterator localIterator = ((List)((com.tencent.mm.plugin.appbrand.q.h)localObject).value).iterator();
        while (localIterator.hasNext())
        {
          com.tencent.mm.plugin.appbrand.appstorage.h localh = (com.tencent.mm.plugin.appbrand.appstorage.h)localIterator.next();
          localh.fileName = localh.fileName.replaceFirst(Pattern.quote("wxfile://"), "");
        }
      }
      com.tencent.mm.plugin.appbrand.q.e.d(paramJSONObject, (List)((com.tencent.mm.plugin.appbrand.q.h)localObject).value);
      localObject = new com.tencent.mm.plugin.appbrand.q.h();
      ((com.tencent.mm.plugin.appbrand.appstorage.e)paraml.fdO.fcw.B(com.tencent.mm.plugin.appbrand.appstorage.e.class)).b("wxfile://usr", (com.tencent.mm.plugin.appbrand.q.h)localObject);
      com.tencent.mm.plugin.appbrand.q.e.d(paramJSONObject, (List)((com.tencent.mm.plugin.appbrand.q.h)localObject).value);
      paraml = j.fkI;
    }
    for (;;)
    {
      switch (1.fQo[paraml.ordinal()])
      {
      default: 
        return new f.a("fail " + paraml.name(), new Object[0]);
        localObject = new com.tencent.mm.plugin.appbrand.q.h();
        paraml = paraml.fdO.fcw.b(paramString, (com.tencent.mm.plugin.appbrand.q.h)localObject);
        com.tencent.mm.plugin.appbrand.q.e.d(paramJSONObject, (List)((com.tencent.mm.plugin.appbrand.q.h)localObject).value);
      }
    }
    return new f.a("fail no such file or directory \"%s\"", new Object[] { paramString });
    return new f.a("fail not a directory \"%s\"", new Object[] { paramString });
    return new f.a("fail permission denied, open \"%s\"", new Object[] { paramString });
    return new f.a("fail \"%s\" is not a regular file", new Object[] { paramString });
    paraml = new JSONArray();
    paramString = paramJSONObject.iterator();
    while (paramString.hasNext()) {
      paraml.put(((com.tencent.mm.plugin.appbrand.appstorage.h)paramString.next()).fileName);
    }
    return new f.a("ok", new Object[0]).t("files", paraml);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/file/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */