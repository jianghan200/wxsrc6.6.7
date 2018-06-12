package com.tencent.mm.plugin.appbrand;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.mm.g.a.bs;
import com.tencent.mm.g.a.bs.b;
import com.tencent.mm.g.a.qu;
import com.tencent.mm.g.a.qu.b;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.y.i;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class u
  extends com.tencent.mm.plugin.ah.a
{
  public final int getType()
  {
    return 1;
  }
  
  public final void l(Context paramContext, Intent paramIntent)
  {
    h.mEJ.a(443L, 2L, 1L, false);
    String str = com.tencent.mm.plugin.base.model.c.wO(s.j(paramIntent, "id"));
    Object localObject1 = com.tencent.mm.plugin.base.model.c.wO(s.j(paramIntent, "ext_info"));
    Object localObject2 = s.j(paramIntent, "token");
    int i = s.a(paramIntent, "ext_info_1", 0);
    if ((TextUtils.isEmpty(str)) || (TextUtils.isEmpty((CharSequence)localObject1)) || (TextUtils.isEmpty((CharSequence)localObject2)))
    {
      x.e("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, username or appId or token is null or nil.");
      i = 0;
    }
    for (;;)
    {
      if (i == 0) {
        h.mEJ.a(443L, 3L, 1L, false);
      }
      return;
      if (!i.gr(str))
      {
        x.e("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, username %s invalid ", new Object[] { str });
        f.mDy.a(647L, 1L, 1L, false);
        i = 0;
      }
      else
      {
        localObject3 = new StringBuilder();
        com.tencent.mm.kernel.g.Eg();
        if (!((String)localObject2).equals(com.tencent.mm.plugin.base.model.c.bU((String)localObject1, com.tencent.mm.kernel.a.Df())))
        {
          localObject3 = ad.getContext().getSharedPreferences("app_brand_global_sp", 0);
          if (localObject3 == null)
          {
            x.w("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, sp is null.");
            i = 0;
            continue;
          }
          Object localObject4 = ((SharedPreferences)localObject3).getStringSet("uin_set", new HashSet());
          if ((localObject4 == null) || (((Set)localObject4).isEmpty()))
          {
            x.w("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, uin set is null or nil.");
            i = 0;
            continue;
          }
          localObject3 = new HashSet();
          localObject4 = ((Set)localObject4).iterator();
          while (((Iterator)localObject4).hasNext()) {
            ((Set)localObject3).add(com.tencent.mm.plugin.base.model.c.bU((String)localObject1, (String)((Iterator)localObject4).next()));
          }
          if (!((Set)localObject3).contains(localObject2))
          {
            x.e("MiroMsg.WxaShortcutEntry", "jump to Wxa failed, illegal token(%s).", new Object[] { localObject2 });
            i = 0;
            continue;
          }
        }
        if ((com.tencent.mm.sdk.a.b.chp()) || (i != 1)) {
          break;
        }
        x.i("MiroMsg.WxaShortcutEntry", "can not open testing WeApp in released WeChat.");
        i = 0;
      }
    }
    localObject2 = new qu();
    ((qu)localObject2).cbq.appId = ((String)localObject1);
    ((qu)localObject2).cbq.userName = str;
    ((qu)localObject2).cbq.cbt = i;
    ((qu)localObject2).cbq.scene = 1023;
    ((qu)localObject2).cbq.cbx = true;
    ((qu)localObject2).cbq.context = paramContext;
    ((qu)localObject2).cbq.cby = false;
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject2);
    if (((qu)localObject2).cbr.cbD) {
      x.i("MiroMsg.WxaShortcutEntry", "open wxa with id : %s", new Object[] { str });
    }
    for (;;)
    {
      localObject1 = s.j(paramIntent, "digest");
      if (TextUtils.isEmpty((CharSequence)localObject1)) {
        break label683;
      }
      localObject2 = ((com.tencent.mm.plugin.appbrand.n.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.appbrand.n.c.class)).rR(str);
      if (localObject2 != null) {
        break label575;
      }
      x.e("MiroMsg.WxaShortcutEntry", "no such WeApp(%s)", new Object[] { str });
      i = 1;
      break;
      if (i == 1) {
        Toast.makeText(paramContext, s.j.app_brand_debug_app_from_share_card_can_not_open, 0).show();
      } else if (i == 2) {
        Toast.makeText(paramContext, s.j.app_brand_not_beta_pkg, 0).show();
      }
    }
    label575:
    Object localObject3 = ((WxaAttributes)localObject2).field_nickname;
    if (!((String)localObject1).equals(com.tencent.mm.a.g.u(((String)localObject3 + ((WxaAttributes)localObject2).field_roundedSquareIconURL + ((WxaAttributes)localObject2).field_brandIconURL + ((WxaAttributes)localObject2).field_bigHeadURL).getBytes())))
    {
      x.i("MiroMsg.WxaShortcutEntry", "update shortcut for wxa(%s)", new Object[] { str });
      if (paramContext != null) {
        break label707;
      }
      x.e("MicroMsg.AppBrandShortcutManager", "remove fail, context or username is null.");
    }
    for (;;)
    {
      ah.i(new u.1(this, paramContext, str, i), 1000L);
      label683:
      paramIntent.putExtra("type", 0);
      paramIntent.putExtra("id", "");
      i = 1;
      break;
      label707:
      if (paramIntent == null)
      {
        x.e("MicroMsg.AppBrandShortcutManager", "remove fail, intent is null");
      }
      else
      {
        localObject1 = new bs();
        ((bs)localObject1).bJc.username = str;
        com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
        if (((bs)localObject1).bJd.bJe != null) {
          break label783;
        }
        x.e("MicroMsg.AppBrandShortcutManager", "no such WeApp(%s)", new Object[] { str });
      }
    }
    label783:
    if (TextUtils.isEmpty(((bs)localObject1).bJd.nickname)) {}
    for (localObject1 = str;; localObject1 = ((bs)localObject1).bJd.nickname)
    {
      localObject2 = new Intent("com.android.launcher.action.UNINSTALL_SHORTCUT");
      ((Intent)localObject2).putExtra("android.intent.extra.shortcut.NAME", (String)localObject1);
      ((Intent)localObject2).putExtra("duplicate", false);
      ((Intent)localObject2).putExtra("android.intent.extra.shortcut.INTENT", paramIntent);
      com.tencent.mm.plugin.base.model.b.p(paramContext, (Intent)localObject2);
      x.i("MicroMsg.AppBrandShortcutManager", "remove shortcut %s", new Object[] { str });
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */