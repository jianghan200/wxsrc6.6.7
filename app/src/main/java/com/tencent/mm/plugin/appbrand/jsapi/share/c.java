package com.tencent.mm.plugin.appbrand.jsapi.share;

import android.content.Intent;
import com.tencent.mm.bg.d;
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

public final class c
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  public static final int CTRL_INDEX = 73;
  public static final String NAME = "shareAppMessage";
  
  public final void a(com.tencent.mm.plugin.appbrand.l paraml, JSONObject paramJSONObject, int paramInt)
  {
    if (paramJSONObject == null)
    {
      x.i("MicroMsg.JsApiShareAppMessage", "data is null");
      paraml.E(paramInt, f("fail:data is null", null));
      return;
    }
    p localp = d(paraml);
    if (localp == null)
    {
      x.i("MicroMsg.JsApiShareAppMessage", "share app message fail, pageView is null");
      paraml.E(paramInt, f("fail:current page do not exist", null));
      return;
    }
    Object localObject1 = localp.lo(com.tencent.mm.plugin.appbrand.menu.l.gjw);
    if (localObject1 == null)
    {
      x.i("MicroMsg.JsApiShareAppMessage", "share app message fail, menuInfo is null.");
      paraml.E(paramInt, f("fail:menu is null", null));
      return;
    }
    Object localObject2 = ((com.tencent.mm.plugin.appbrand.menu.k)localObject1).fvX;
    if (!((u.b)localObject2).ie("user_clicked_share_btn"))
    {
      x.i("MicroMsg.JsApiShareAppMessage", "share app message fail, not allow to share");
      paraml.E(paramInt, f("fail:not allow to share", null));
      return;
    }
    x.i("MicroMsg.JsApiShareAppMessage", "invoke share app message");
    ((u.b)localObject2).w("user_clicked_share_btn", false);
    localObject1 = c(paraml);
    if (localObject1 == null)
    {
      x.i("MicroMsg.JsApiShareAppMessage", "share app message fail, context is null");
      paraml.E(paramInt, f("fail: page context is null", null));
      return;
    }
    AppBrandSysConfig localAppBrandSysConfig = paraml.fdO.fcu;
    boolean bool2 = ((u.b)localObject2).getBoolean("enable_share_with_share_ticket", false);
    int i;
    String str1;
    String str2;
    String str3;
    String str4;
    String str5;
    label262:
    boolean bool3;
    boolean bool4;
    String str6;
    String str7;
    int k;
    int j;
    label351:
    label361:
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
        break label686;
      }
      bool1 = paramJSONObject.optBoolean("useDefaultSnapshot", false);
      bool3 = ((u.b)localObject2).ie("enable_share_dynamic");
      bool4 = ((u.b)localObject2).ie("enable_share_with_updateable_msg");
      localObject2 = ((u.b)localObject2).getString("enable_share_with_updateable_msg_template_id", "");
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
          break label698;
        }
        paramJSONObject = null;
        if (paramJSONObject == null) {
          break label706;
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
      x.i("MicroMsg.JsApiShareAppMessage", "msgParams:%s", new Object[] { localHashMap });
      localIntent = new Intent();
      localIntent.putExtra("Select_Conv_Type", 3);
      if (bool2) {
        break label721;
      }
    }
    label686:
    label698:
    label706:
    label721:
    for (boolean bool1 = true;; bool1 = false)
    {
      localIntent.putExtra("mutil_select_is_ret", bool1);
      localIntent.putExtra("select_is_ret", true);
      localIntent.putExtra("scene_from", 3);
      localIntent.putExtra("appbrand_params", localHashMap);
      localIntent.putExtra("Retr_Msg_Type", 2);
      d.a((MMActivity)localObject1, ".ui.transmit.SelectConversationUI", localIntent, 1, new c.1(this, paraml, paramInt, str6, str3, bool2, str7, str1, str2, paramJSONObject, i, str4, localAppBrandSysConfig, (String)localObject2, localp, bool5, str8, bool3, bool4, str5, j, (MMActivity)localObject1));
      return;
      i = 2;
      break;
      bool1 = paramJSONObject.optBoolean("useDefaultSnapshot", true);
      break label262;
      paramJSONObject = paramJSONObject.fct;
      break label351;
      x.i("MicroMsg.JsApiShareAppMessage", "null = initConfig!");
      j = k;
      break label361;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/share/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */