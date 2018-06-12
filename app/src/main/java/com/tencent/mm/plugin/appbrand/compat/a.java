package com.tencent.mm.plugin.appbrand.compat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.v;
import com.tencent.mm.g.a.hm;
import com.tencent.mm.g.a.hm.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.b;
import com.tencent.mm.plugin.appbrand.compat.a.a.a;
import com.tencent.mm.plugin.appbrand.compat.a.f;
import com.tencent.mm.plugin.appbrand.ui.AppBrandNearbyWebViewUI;
import com.tencent.mm.plugin.appbrand.ui.AppBrandSearchUI;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.protocal.c.akf;
import com.tencent.mm.protocal.c.akg;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.g.a;
import java.util.Map;

final class a
  implements com.tencent.mm.plugin.appbrand.compat.a.a
{
  public final void S(Context paramContext, String paramString)
  {
    paramString = new Intent(paramContext, AppBrandNearbyWebViewUI.class).putExtra("rawUrl", paramString);
    paramString.putExtra("geta8key_scene", 41);
    paramString.putExtra("title", paramContext.getString(R.l.app_brand_nearby_list_title));
    if (!(paramContext instanceof Activity)) {
      paramString.addFlags(268435456);
    }
    if ((paramContext instanceof Activity))
    {
      ((Activity)paramContext).startActivityForResult(paramString, 3);
      return;
    }
    paramContext.startActivity(paramString);
  }
  
  public final void T(Context paramContext, String paramString)
  {
    paramString = new Intent(paramContext, AppBrandNearbyWebViewUI.class).putExtra("rawUrl", paramString);
    paramString.putExtra("geta8key_scene", 41);
    paramString.putExtra("title", paramContext.getString(R.l.app_brand_launcher_head_wxagame));
    if (!(paramContext instanceof Activity)) {
      paramString.addFlags(268435456);
    }
    if ((paramContext instanceof Activity))
    {
      ((Activity)paramContext).startActivityForResult(paramString, 4);
      return;
    }
    paramContext.startActivity(paramString);
  }
  
  public final void a(a.a parama)
  {
    b.a locala = new b.a();
    locala.dIG = new akf();
    locala.dIH = new akg();
    locala.uri = "/cgi-bin/mmoc-bin/hardware/getwerunuserstate";
    locala.dIF = 1926;
    locala.dII = 0;
    locala.dIJ = 0;
    v.a(locala.KT(), new a.1(this, parama), true);
  }
  
  public final void a(g.a parama, String paramString1, String paramString2, String paramString3, byte[] paramArrayOfByte)
  {
    l.a(parama, paramString1, paramString2, paramString3, null, paramArrayOfByte);
  }
  
  public final int adu()
  {
    hm localhm = new hm();
    com.tencent.mm.sdk.b.a.sFg.m(localhm);
    return localhm.bQR.bQS;
  }
  
  public final View c(Context paramContext, ViewGroup paramViewGroup)
  {
    return LayoutInflater.from(paramContext).inflate(R.i.layout_appbrand_share_page_preview_footer, paramViewGroup, false);
  }
  
  public final Intent cp(Context paramContext)
  {
    Intent localIntent = ((f)g.l(f.class)).adR();
    localIntent.setClass(paramContext, AppBrandSearchUI.class);
    localIntent.putExtra("key_trust_url", true);
    localIntent.putExtra("title", paramContext.getString(R.l.app_brand_fts_search_wxapp));
    localIntent.putExtra("searchbar_tips", paramContext.getString(R.l.app_brand_fts_search_wxapp));
    localIntent.putExtra("KRightBtn", true);
    localIntent.putExtra("ftsneedkeyboard", true);
    localIntent.putExtra("ftsType", 64);
    localIntent.putExtra("ftsbizscene", 201);
    paramContext = ((f)g.l(f.class)).adS();
    String str = b.JK();
    paramContext.put("WASessionId", str);
    localIntent.putExtra("rawUrl", ((f)g.l(f.class)).v(paramContext));
    localIntent.putExtra("key_load_js_without_delay", true);
    localIntent.addFlags(67108864);
    localIntent.putExtra("key_session_id", str);
    paramContext = g.Ei().DT().get(aa.a.sVA, null);
    if ((paramContext != null) && ((paramContext instanceof String))) {}
    for (paramContext = (String)paramContext;; paramContext = "")
    {
      localIntent.putExtra("key_search_input_hint", paramContext);
      return localIntent;
    }
  }
  
  public final String cq(Context paramContext)
  {
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ad.getContext();
    }
    return localContext.getString(R.l.settings_plugins_installing);
  }
  
  public final String cr(Context paramContext)
  {
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ad.getContext();
    }
    return localContext.getString(R.l.settings_plugins_install);
  }
  
  public final String cs(Context paramContext)
  {
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ad.getContext();
    }
    return localContext.getString(R.l.settings_plugins_installed);
  }
  
  public final String ct(Context paramContext)
  {
    Context localContext = paramContext;
    if (paramContext == null) {
      localContext = ad.getContext();
    }
    return localContext.getString(R.l.settings_plugins_uninstalled);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/compat/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */