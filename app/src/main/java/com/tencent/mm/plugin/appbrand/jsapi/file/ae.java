package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.mm.a.e;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class ae
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 51;
  public static final String NAME = "saveFile";
  
  public static String a(g paramg, String paramString1, String paramString2)
  {
    com.tencent.mm.plugin.appbrand.appstorage.j localj2 = paramg.fcw.rf(paramString2);
    com.tencent.mm.plugin.appbrand.appstorage.j localj1;
    if (localj2 != com.tencent.mm.plugin.appbrand.appstorage.j.fkO)
    {
      localj1 = localj2;
      if (localj2 != com.tencent.mm.plugin.appbrand.appstorage.j.fkQ) {
        break label47;
      }
    }
    try
    {
      localj1 = paramg.fcw.a(paramString2, new FileInputStream(paramString1), false);
      label47:
      switch (ae.1.fQo[localj1.ordinal()])
      {
      default: 
        return "fail " + localj1.name();
      }
    }
    catch (Exception paramg)
    {
      x.printErrStackTrace("MicroMsg.JsApiSaveFile", paramg, "saveToNewFS", new Object[0]);
      return "fail read tempFilePath error";
    }
    return String.format("fail permission denied, open \"%s\"", new Object[] { paramString2 });
    return String.format("fail no such file or directory \"%s\"", new Object[] { paramString2 });
    return String.format("fail illegal operation on a directory, open \"%s\"", new Object[] { paramString2 });
    return "fail the maximum size of the file storage limit is exceeded";
    return "ok";
  }
  
  static f.a c(l paraml, JSONObject paramJSONObject)
  {
    Object localObject1 = paraml.mAppId;
    Object localObject2 = paramJSONObject.optString("tempFilePath");
    paramJSONObject = paramJSONObject.optString("filePath");
    if (bi.oW((String)localObject2))
    {
      x.e("MicroMsg.JsApiSaveFile", "temp localId is null or nil");
      return new f.a("fail", new Object[0]);
    }
    localObject2 = AppBrandLocalMediaObjectManager.getItemByLocalId((String)localObject1, (String)localObject2);
    if ((localObject2 != null) && (e.cn(((AppBrandLocalMediaObject)localObject2).dDG))) {}
    for (boolean bool = true;; bool = false)
    {
      x.i("MicroMsg.JsApiSaveFile", "get temp obj = %s, fileExists = %b", new Object[] { localObject2, Boolean.valueOf(bool) });
      if ((bool) && (!bi.oW(((AppBrandLocalMediaObject)localObject2).dDG))) {
        break;
      }
      return new f.a("fail tempFilePath file not exist", new Object[0]);
    }
    if (!bi.oW(paramJSONObject))
    {
      localObject1 = a(paraml.fdO, ((AppBrandLocalMediaObject)localObject2).dDG, paramJSONObject);
      paraml = null;
      if ("ok".equals(localObject1))
      {
        paraml = new HashMap();
        paraml.put("savedFilePath", paramJSONObject);
      }
      return new f.a((String)localObject1, new Object[0]).z(paraml);
    }
    if (((AppBrandLocalMediaObject)localObject2).fjT) {
      return new f.a("ok", new Object[0]);
    }
    long l1 = com.tencent.mm.plugin.appbrand.config.j.rQ((String)localObject1);
    long l2 = AppBrandLocalMediaObjectManager.getStoredFilesOccupation((String)localObject1);
    long l3 = new File(((AppBrandLocalMediaObject)localObject2).dDG).length();
    x.i("MicroMsg.JsApiSaveFile", "before markPermanent, quota = %d, occupation = %d, fileLength = %d", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3) });
    if (l2 + l3 > l1) {
      return new f.a(String.format(Locale.US, "fail:exceed quota %dM", new Object[] { Long.valueOf(l1 / 1048576L) }), new Object[0]);
    }
    localObject1 = AppBrandLocalMediaObjectManager.markPermanent(paraml.mAppId, (AppBrandLocalMediaObject)localObject2);
    if (localObject1 == null)
    {
      bool = true;
      if (localObject1 != null) {
        break label466;
      }
      paraml = null;
      label360:
      if (localObject1 != null) {
        break label475;
      }
    }
    label466:
    label475:
    for (paramJSONObject = null;; paramJSONObject = ((AppBrandLocalMediaObject)localObject1).dDG)
    {
      x.i("MicroMsg.JsApiSaveFile", "after markPermanent, (obj==null): %b, obj.localId: %s, obj.path: %s", new Object[] { Boolean.valueOf(bool), paraml, paramJSONObject });
      if ((localObject1 == null) || (bi.oW(((AppBrandLocalMediaObject)localObject1).bNH)) || (bi.oW(((AppBrandLocalMediaObject)localObject1).dDG))) {
        break label484;
      }
      paraml = new HashMap(1);
      paraml.put("savedFilePath", ((AppBrandLocalMediaObject)localObject1).bNH);
      return new f.a("ok", new Object[0]).z(paraml);
      bool = false;
      break;
      paraml = ((AppBrandLocalMediaObject)localObject1).bNH;
      break label360;
    }
    label484:
    return new f.a("fail", new Object[0]);
  }
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    paramJSONObject = c(paraml, paramJSONObject);
    paraml.E(paramInt, f(paramJSONObject.Yy, paramJSONObject.values));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/file/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */