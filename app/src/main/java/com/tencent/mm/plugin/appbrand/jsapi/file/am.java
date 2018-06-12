package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.mm.ipcinvoker.h.b;
import com.tencent.mm.plugin.appbrand.appstorage.j;
import com.tencent.mm.plugin.appbrand.l;
import org.json.JSONObject;

final class am
  extends ax
{
  final f.a a(l paraml, String paramString, JSONObject paramJSONObject)
  {
    try
    {
      paramJSONObject.put("append", true);
      return super.a(paraml, paramString, paramJSONObject);
    }
    catch (Exception paraml)
    {
      b.e("MicroMsg.AppBrand.UnitAppendFile", "call with path(%s), put append fail ex = %s", new Object[] { paramString, paraml });
    }
    return new f.a("fail " + j.fkJ.name(), new Object[0]);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/file/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */