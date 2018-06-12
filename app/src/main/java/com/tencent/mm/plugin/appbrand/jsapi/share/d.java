package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.content.Intent;
import com.tencent.mm.model.u.b;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.jsapi.e;
import com.tencent.mm.plugin.appbrand.n;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import org.json.JSONObject;

public final class d
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 240;
  public static final String NAME = "shareAppMessageDirectly";
  
  public final void a(com.tencent.mm.plugin.appbrand.l paraml, JSONObject paramJSONObject, int paramInt)
  {
    x.i("MicroMsg.JsApiShareAppMessageDirectly", "invoke share app message directly.");
    if (paramJSONObject == null)
    {
      x.i("MicroMsg.JsApiShareAppMessageDirectly", "data is null");
      paraml.E(paramInt, f("fail:data is null", null));
      return;
    }
    MMActivity localMMActivity = c(paraml);
    if (localMMActivity == null)
    {
      x.i("MicroMsg.JsApiShareAppMessageDirectly", "share app message fail, context is null");
      paraml.E(paramInt, f("fail: page context is null", null));
      return;
    }
    p localp = d(paraml);
    if (localp == null)
    {
      x.i("MicroMsg.JsApiShareAppMessageDirectly", "share app message fail, pageView is null");
      paraml.E(paramInt, f("fail:current page do not exist", null));
      return;
    }
    Object localObject = localp.lo(com.tencent.mm.plugin.appbrand.menu.l.gjw);
    if (localObject == null)
    {
      x.i("MicroMsg.JsApiShareAppMessageDirectly", "share app message fail, menuInfo is null.");
      paraml.E(paramInt, f("fail:menu is null", null));
      return;
    }
    AppBrandSysConfig localAppBrandSysConfig = paraml.fdO.fcu;
    boolean bool2 = ((com.tencent.mm.plugin.appbrand.menu.k)localObject).fvX.getBoolean("enable_share_with_share_ticket", false);
    int i;
    String str1;
    String str2;
    String str3;
    String str4;
    String str5;
    label219:
    boolean bool3;
    boolean bool4;
    String str6;
    String str7;
    int k;
    int j;
    label317:
    label327:
    boolean bool5;
    String str8;
    HashMap localHashMap;
    Intent localIntent;
    if (bool2)
    {
      i = 3;
      str1 = paramJSONObject.optString("title");
      str2 = paramJSONObject.optString("desc", "");
      str3 = paramJSONObject.optString("path");
      str4 = paramJSONObject.optString("imageUrl");
      str5 = paramJSONObject.optString("cacheKey");
      if (!paraml.fdO.aaq()) {
        break label647;
      }
      bool1 = paramJSONObject.optBoolean("useDefaultSnapshot", false);
      bool3 = ((com.tencent.mm.plugin.appbrand.menu.k)localObject).fvX.ie("enable_share_dynamic");
      bool4 = ((com.tencent.mm.plugin.appbrand.menu.k)localObject).fvX.ie("enable_share_with_updateable_msg");
      localObject = ((com.tencent.mm.plugin.appbrand.menu.k)localObject).fvX.getString("enable_share_with_updateable_msg_template_id", "");
      str6 = paraml.mAppId;
      str7 = localAppBrandSysConfig.bGy;
      int m = localAppBrandSysConfig.frm.fih;
      int n = localAppBrandSysConfig.frm.fii;
      k = 0;
      j = k;
      if (!bi.oW(str6))
      {
        paramJSONObject = com.tencent.mm.plugin.appbrand.a.pY(str6);
        if (paramJSONObject != null) {
          break label659;
        }
        paramJSONObject = null;
        if (paramJSONObject == null) {
          break label667;
        }
        j = paramJSONObject.bGM;
      }
      paramJSONObject = n.qz(paraml.mAppId);
      bool5 = k.tY(str4);
      str8 = k.a(localp, str4, bool1);
      localHashMap = new HashMap();
      localHashMap.put("desc", str2);
      localHashMap.put("type", Integer.valueOf(i));
      localHashMap.put("title", str1);
      localHashMap.put("app_id", str6);
      localHashMap.put("pkg_type", Integer.valueOf(m));
      localHashMap.put("pkg_version", Integer.valueOf(n));
      localHashMap.put("img_url", str4);
      localHashMap.put("is_dynamic", Boolean.valueOf(bool3));
      localHashMap.put("cache_key", str5);
      localHashMap.put("path", str3);
      if (!bi.oW(str8)) {
        localHashMap.put("delay_load_img_path", str8);
      }
      x.i("MicroMsg.JsApiShareAppMessageDirectly", "msgParams:%s", new Object[] { localHashMap });
      localIntent = new Intent();
      localIntent.putExtra("Select_Conv_Type", 3);
      if (bool2) {
        break label682;
      }
    }
    label647:
    label659:
    label667:
    label682:
    for (boolean bool1 = true;; bool1 = false)
    {
      localIntent.putExtra("mutil_select_is_ret", bool1);
      localIntent.putExtra("select_is_ret", true);
      localIntent.putExtra("scene_from", 3);
      localIntent.putExtra("appbrand_params", localHashMap);
      localIntent.putExtra("Retr_Msg_Type", 2);
      com.tencent.mm.bg.d.a(localMMActivity, ".ui.transmit.SelectConversationUI", localIntent, 1, new d.1(this, paraml, paramInt, str6, str7, str1, str2, paramJSONObject, str3, i, bool5, str4, localAppBrandSysConfig, localp, str8, bool2, bool3, bool4, (String)localObject, str5, j, localMMActivity));
      return;
      i = 2;
      break;
      bool1 = paramJSONObject.optBoolean("useDefaultSnapshot", true);
      break label219;
      paramJSONObject = paramJSONObject.fct;
      break label317;
      x.i("MicroMsg.JsApiShareAppMessageDirectly", "null = initConfig!");
      j = k;
      break label327;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/share/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */