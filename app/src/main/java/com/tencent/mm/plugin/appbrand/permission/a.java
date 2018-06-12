package com.tencent.mm.plugin.appbrand.permission;

import android.content.res.Resources;
import android.util.SparseIntArray;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.jsapi.b;
import com.tencent.mm.plugin.appbrand.r.c;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.sdk.platformtools.ad;
import java.util.HashSet;
import java.util.Set;

final class a
{
  private static final SparseIntArray gpO = new a.1();
  private static final Set<String> gpP = new HashSet();
  
  static
  {
    gpO.put("requestPayment".hashCode(), s.j.app_brand_jsapi_ban_banner_hint_api_name_pay);
    gpO.put("playVoice".hashCode(), s.j.app_brand_jsapi_ban_banner_hint_api_name_play);
    gpO.put("operateMusicPlayer".hashCode(), s.j.app_brand_jsapi_ban_banner_hint_api_name_play);
    gpO.put("shareAppMessage".hashCode(), s.j.app_brand_jsapi_ban_banner_hint_api_name_share);
    gpO.put("onShareAppMessage".hashCode(), s.j.app_brand_jsapi_ban_banner_hint_api_name_share);
    gpO.put("shareAppMessageDirectly".hashCode(), s.j.app_brand_jsapi_ban_banner_hint_api_name_share);
    gpO.put("shareTimeline".hashCode(), s.j.app_brand_jsapi_ban_banner_hint_api_name_share);
    gpO.put("onMenuShareTimeline".hashCode(), s.j.app_brand_jsapi_ban_banner_hint_api_name_share);
    gpO.put("launchMiniProgram".hashCode(), s.j.app_brand_jsapi_ban_banner_hint_api_name_launch);
    gpP.add("requestPayment");
    gpP.add("playVoice");
    gpP.add("operateMusicPlayer");
    gpP.add("shareAppMessage");
    gpP.add("onShareAppMessage");
    gpP.add("shareAppMessageDirectly");
    gpP.add("shareTimeline");
    gpP.add("onMenuShareTimeline");
    gpP.add("launchMiniProgram");
    gpP.add("makeVoIPCall");
    gpP.add("addCard");
    gpP.add("chooseContact");
    gpP.add("openCard");
    gpP.add("openOfflinePayView");
  }
  
  static void a(g paramg, b paramb)
  {
    if ((paramg == null) || (paramb == null)) {}
    while (!gpP.contains(paramb.getName())) {
      return;
    }
    paramb = ad.getResources().getString(gpO.get(paramb.getName().hashCode()));
    c.runOnUiThread(new a.2(paramg, ad.getResources().getString(s.j.app_brand_jsapi_ban_banner_hint_format_wording, new Object[] { paramb })));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/permission/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */