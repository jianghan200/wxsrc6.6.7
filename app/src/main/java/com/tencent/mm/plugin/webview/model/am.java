package com.tencent.mm.plugin.webview.model;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.a.g;
import com.tencent.mm.aa.j;
import com.tencent.mm.aa.k;
import com.tencent.mm.aa.q;
import com.tencent.mm.ac.z;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class am
  extends com.tencent.mm.plugin.ah.a
{
  public static String pSK = "";
  
  public final int getType()
  {
    return 2;
  }
  
  public final void l(Context paramContext, Intent paramIntent)
  {
    String str1 = com.tencent.mm.plugin.base.model.c.wO(s.j(paramIntent, "id"));
    String str2 = com.tencent.mm.plugin.base.model.c.wO(s.j(paramIntent, "ext_info"));
    Object localObject1 = s.j(paramIntent, "token");
    if ((TextUtils.isEmpty(str1)) || (TextUtils.isEmpty(str2)) || (TextUtils.isEmpty((CharSequence)localObject1)))
    {
      x.e("MicroMsg.WebViewShortcutEntry", "jump to webview  failed, username or appId or token is null or nil.");
      return;
    }
    Object localObject2 = new StringBuilder();
    au.HU();
    if (!((String)localObject1).equals(com.tencent.mm.plugin.base.model.d.bU(str2, com.tencent.mm.model.c.Df())))
    {
      localObject2 = ad.getContext().getSharedPreferences("app_brand_global_sp", 0);
      if (localObject2 == null)
      {
        x.w("MicroMsg.WebViewShortcutEntry", "jump to webview failed, sp is null.");
        return;
      }
      localObject3 = ((SharedPreferences)localObject2).getStringSet("uin_set", new HashSet());
      if ((localObject3 == null) || (((Set)localObject3).isEmpty()))
      {
        x.w("MicroMsg.WebViewShortcutEntry", "jump to webview failed, uin set is null or nil.");
        return;
      }
      localObject2 = new HashSet();
      localObject3 = ((Set)localObject3).iterator();
      while (((Iterator)localObject3).hasNext()) {
        ((Set)localObject2).add(com.tencent.mm.plugin.base.model.c.bU(str2, (String)((Iterator)localObject3).next()));
      }
      if (!((Set)localObject2).contains(localObject1))
      {
        x.e("MicroMsg.WebViewShortcutEntry", "jump to webview failed, illegal token(%s).", new Object[] { localObject1 });
        Toast.makeText(paramContext, paramContext.getString(R.l.wv_launch_shortcut_fail), 1).show();
        return;
      }
    }
    paramIntent.putExtra("type", 0);
    paramIntent.putExtra("id", "");
    localObject2 = "https://game.weixin.qq.com/cgi-bin/h5/static/gameloading/index.html?wegame_ssid=25&appid=" + str2;
    localObject1 = localObject2;
    if (!bi.oW(pSK)) {
      localObject1 = (String)localObject2 + "&" + pSK;
    }
    localObject2 = new Intent();
    ((Intent)localObject2).putExtra("rawUrl", (String)localObject1);
    ((Intent)localObject2).putExtra("from_shortcut", true);
    ((Intent)localObject2).putExtra("game_hv_menu_appid", str2);
    ((Intent)localObject2).addFlags(67108864);
    ((Intent)localObject2).addFlags(268435456);
    com.tencent.mm.bg.d.b(paramContext, "webview", ".ui.tools.game.H5GameWebViewUI", (Intent)localObject2);
    z.Nk().km(str1);
    localObject1 = s.j(paramIntent, "digest");
    if (TextUtils.isEmpty((CharSequence)localObject1))
    {
      x.i("MicroMsg.WebViewShortcutEntry", "digest is null");
      return;
    }
    au.HU();
    localObject2 = com.tencent.mm.model.c.FR().Yg(str1);
    if ((localObject2 == null) || (bi.oW(((ab)localObject2).BK())))
    {
      x.i("MicroMsg.WebViewShortcutEntry", "no need update, displayName is null");
      return;
    }
    localObject2 = ((ab)localObject2).BK();
    Object localObject3 = q.KH().kc(str1);
    if ((localObject3 == null) || (bi.oW(((j)localObject3).Ky())))
    {
      x.i("MicroMsg.WebViewShortcutEntry", "no need update, imgFlag is null");
      return;
    }
    if (((String)localObject1).equals(g.u(((String)localObject2 + ((j)localObject3).Ky()).getBytes())))
    {
      x.i("MicroMsg.WebViewShortcutEntry", "no need update, digest is same");
      return;
    }
    localObject1 = com.tencent.mm.aa.c.a(str1, false, -1);
    if ((localObject1 == null) || (((Bitmap)localObject1).isRecycled()))
    {
      x.i("MicroMsg.WebViewShortcutEntry", "icon is not downloaded, next time update");
      return;
    }
    x.i("MicroMsg.WebViewShortcutEntry", "update shortcut, displayName = %s", new Object[] { localObject2 });
    com.tencent.mm.plugin.base.model.d.f(paramContext, str1, str2, com.tencent.mm.plugin.base.model.c.wO(s.j(paramIntent, "ext_info_1")));
    ah.i(new am.1(this, str1, str2), 1000L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/webview/model/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */