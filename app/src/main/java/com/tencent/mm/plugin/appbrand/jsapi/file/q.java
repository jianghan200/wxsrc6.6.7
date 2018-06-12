package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public final class q
  extends a
{
  private static final int CTRL_INDEX = 115;
  private static final String NAME = "getSavedFileList";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    Object localObject = AppBrandLocalMediaObjectManager.listStoredFiles(paraml.mAppId);
    paramJSONObject = new JSONArray();
    if (!bi.cX((List)localObject))
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        AppBrandLocalMediaObject localAppBrandLocalMediaObject = (AppBrandLocalMediaObject)((Iterator)localObject).next();
        try
        {
          JSONObject localJSONObject = new JSONObject();
          localJSONObject.put("filePath", localAppBrandLocalMediaObject.bNH);
          localJSONObject.put("size", localAppBrandLocalMediaObject.eyz);
          localJSONObject.put("createTime", TimeUnit.MILLISECONDS.toSeconds(localAppBrandLocalMediaObject.fjU));
          paramJSONObject.put(localJSONObject);
        }
        catch (Exception localException) {}
      }
    }
    localObject = new HashMap(1);
    ((Map)localObject).put("fileList", paramJSONObject);
    paraml.E(paramInt, f("ok", (Map)localObject));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/file/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */