package com.tencent.mm.plugin.appbrand.jsapi.file;

import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObject;
import com.tencent.mm.plugin.appbrand.appstorage.AppBrandLocalMediaObjectManager;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.sdk.platformtools.bi;
import org.json.JSONObject;

public final class z
  extends a
{
  private static final int CTRL_INDEX = 117;
  private static final String NAME = "removeSavedFile";
  
  public final void a(l paraml, JSONObject paramJSONObject, int paramInt)
  {
    String str = paraml.mAppId;
    paramJSONObject = paramJSONObject.optString("filePath", "");
    if (bi.oW(paramJSONObject)) {
      paramJSONObject = "fail:invalid data";
    }
    for (;;)
    {
      paraml.E(paramInt, f(paramJSONObject, null));
      return;
      paramJSONObject = AppBrandLocalMediaObjectManager.getItemByLocalId(str, paramJSONObject);
      if ((paramJSONObject != null) && (!bi.oW(paramJSONObject.dDG)))
      {
        com.tencent.mm.a.e.deleteFile(paramJSONObject.dDG);
        paramJSONObject = "ok";
      }
      else
      {
        paramJSONObject = "fail:file doesn't exist";
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/file/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */