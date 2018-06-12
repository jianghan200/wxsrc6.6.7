package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.bi;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class p
  extends a
{
  private static final int CTRL_INDEX = 116;
  private static final String NAME = "getSavedFileInfo";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    Object localObject = paraml.mAppId;
    paramJSONObject = paramJSONObject.optString("filePath", "");
    if (bi.oW(paramJSONObject))
    {
      paraml.E(paramInt, f("fail:invalid data", null));
      return;
    }
    paramJSONObject = AppBrandLocalMediaObjectManager.getItemByLocalId((String)localObject, paramJSONObject);
    if (paramJSONObject == null)
    {
      paraml.E(paramInt, f("fail:file doesn't exist", null));
      return;
    }
    paramJSONObject = new File(paramJSONObject.dDG);
    localObject = new HashMap(3);
    ((Map)localObject).put("size", Long.valueOf(paramJSONObject.length()));
    ((Map)localObject).put("createTime", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(paramJSONObject.lastModified())));
    paraml.E(paramInt, f("ok", (Map)localObject));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/file/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */