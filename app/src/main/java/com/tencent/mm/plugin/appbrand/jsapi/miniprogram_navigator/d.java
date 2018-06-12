package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.bi;
import org.json.JSONObject;

public final class d
  extends a
{
  public static final int CTRL_INDEX = 251;
  public static final String NAME = "navigateToMiniProgram";
  
  public final void a(c paramc, JSONObject paramJSONObject, int paramInt)
  {
    String str1 = paramJSONObject.optString("appId", null);
    if (bi.oW(str1))
    {
      paramc.E(paramInt, f("fail:invalid data", null));
      return;
    }
    if (str1.equals(paramc.getAppId()))
    {
      paramc.E(paramInt, f("fail:target appId is the same as the caller appId", null));
      return;
    }
    String str2 = paramJSONObject.optString("path", null);
    Object localObject2 = paramJSONObject.optJSONObject("extraData");
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = new JSONObject();
    }
    Object localObject4 = paramJSONObject.optString("envVersion");
    Object localObject3 = paramJSONObject.optJSONObject("privateExtraData");
    localObject2 = localObject3;
    if (localObject3 == null) {
      localObject2 = new JSONObject();
    }
    int k = paramc.getRuntime().fcu.frm.fih;
    localObject3 = localObject4;
    if (localObject4 == null) {
      localObject3 = "";
    }
    int i;
    switch (((String)localObject3).hashCode())
    {
    default: 
      i = -1;
      switch (i)
      {
      default: 
        label195:
        i = 0;
      }
      break;
    }
    for (;;)
    {
      int j = i;
      if (k != 1)
      {
        j = i;
        if (k != 2) {
          j = 0;
        }
      }
      i = paramJSONObject.optInt("sourcetype", 0);
      localObject3 = paramJSONObject.optString("agentId");
      localObject4 = new e.a();
      ((e.a)localObject4).scene = paramJSONObject.optInt("scene", 0);
      ((e.a)localObject4).bGG = paramJSONObject.optString("sceneNote");
      ((e.a)localObject4).cbB = paramJSONObject.optInt("preScene", 0);
      ((e.a)localObject4).cbC = paramJSONObject.optString("preSceneNote");
      ((e.a)localObject4).bJt = i;
      ((e.a)localObject4).fqH = ((String)localObject3);
      e.a(paramc, str1, j, str2, (e.a)localObject4, (JSONObject)localObject1, (JSONObject)localObject2, new d.1(this, paramc, paramInt));
      return;
      if (!((String)localObject3).equals("develop")) {
        break;
      }
      i = 0;
      break label195;
      if (!((String)localObject3).equals("trial")) {
        break;
      }
      i = 1;
      break label195;
      if (!((String)localObject3).equals("release")) {
        break;
      }
      i = 2;
      break label195;
      i = 1;
      continue;
      i = 2;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/miniprogram_navigator/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */