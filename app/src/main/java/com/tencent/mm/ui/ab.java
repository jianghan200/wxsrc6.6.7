package com.tencent.mm.ui;

import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Looper;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.ak.o;
import com.tencent.mm.g.a.nn;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.setting.a.c;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference;
import com.tencent.mm.s.a.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.bh;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.base.preference.i;
import com.tencent.mm.ui.base.s;
import com.tencent.mm.ui.contact.AddressUI;
import com.tencent.mm.ui.tools.r;
import java.util.UUID;

public class ab
  extends a
  implements m.b
{
  private f eOE;
  private a.a mUs = new ab.1(this);
  
  private void cqG()
  {
    if (!com.tencent.mm.bg.d.QS("sns"))
    {
      this.eOE.bw("settings_my_album", true);
      return;
    }
    this.eOE.bw("settings_my_album", false);
  }
  
  private void cqH()
  {
    Object localObject1 = (com.tencent.mm.plugin.card.c.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.card.c.b.class);
    if ((localObject1 == null) || ((!((com.tencent.mm.plugin.card.c.b)localObject1).axz()) && (!((com.tencent.mm.plugin.card.c.b)localObject1).axA())) || (!com.tencent.mm.bg.d.QS("card")))
    {
      this.eOE.bw("settings_mm_cardpackage", true);
      return;
    }
    if (localObject1 != null) {}
    for (localObject1 = ((com.tencent.mm.plugin.card.c.b)localObject1).axB();; localObject1 = "")
    {
      boolean bool1 = com.tencent.mm.s.c.Cp().aU(262152, 266256);
      boolean bool2 = com.tencent.mm.s.c.Cp().aT(262152, 266256);
      boolean bool3 = com.tencent.mm.s.c.Cp().a(aa.a.sPM, aa.a.sPO);
      boolean bool4 = com.tencent.mm.s.c.Cp().a(aa.a.sPN, aa.a.sPP);
      this.eOE.bw("settings_mm_cardpackage", false);
      final IconPreference localIconPreference = (IconPreference)this.eOE.ZZ("settings_mm_cardpackage");
      if (localIconPreference == null) {
        break;
      }
      localIconPreference.setTitle(R.l.settings_mm_card_package_new);
      if (bool2)
      {
        localIconPreference.Er(0);
        localIconPreference.dk(getString(R.l.app_new), R.g.new_tips_bg);
        localIconPreference.Et(8);
        localIconPreference.setSummary(null);
        localIconPreference.V(null);
        localIconPreference.Ev(8);
        localIconPreference.dl("", -1);
        localIconPreference.Es(8);
        return;
      }
      au.HU();
      String str = (String)com.tencent.mm.model.c.DT().get(aa.a.sPV, "");
      if ((bool4) && (!TextUtils.isEmpty(str)))
      {
        int i = getResources().getDimensionPixelOffset(R.f.card_entrance_icon_height);
        Object localObject2 = new c.a();
        ((c.a)localObject2).dXB = com.tencent.mm.compatible.util.e.bnE;
        o.Pk();
        ((c.a)localObject2).dXU = null;
        ((c.a)localObject2).dXy = true;
        ((c.a)localObject2).dXW = true;
        ((c.a)localObject2).dXw = true;
        ((c.a)localObject2).dXF = i;
        ((c.a)localObject2).dXE = i;
        localObject2 = ((c.a)localObject2).Pt();
        o.Pj().a(str, localIconPreference.kYT, (com.tencent.mm.ak.a.a.c)localObject2, new com.tencent.mm.ak.a.c.g()
        {
          public final Bitmap a(String paramAnonymousString, com.tencent.mm.ak.a.d.b paramAnonymousb)
          {
            return null;
          }
          
          public final void a(String paramAnonymousString, View paramAnonymousView, com.tencent.mm.ak.a.d.b paramAnonymousb)
          {
            if (paramAnonymousb.bitmap != null)
            {
              ah.A(new ab.2.2(this, paramAnonymousb.bitmap));
              return;
            }
            ah.A(new ab.2.3(this));
          }
          
          public final void me(String paramAnonymousString)
          {
            ah.A(new ab.2.1(this));
          }
        });
        if (!bool1) {
          break label451;
        }
        localIconPreference.Et(0);
      }
      for (;;)
      {
        if (bool3)
        {
          localIconPreference.dk("", -1);
          localIconPreference.Er(8);
          if (bool4)
          {
            localIconPreference.setSummary(null);
            if (!ai.oW((String)localObject1))
            {
              localIconPreference.ao((String)localObject1, -1, getResources().getColor(R.e.hint_text_color));
              localIconPreference.Es(0);
              return;
              localIconPreference.V(null);
              localIconPreference.Ev(8);
              break;
              label451:
              localIconPreference.Et(8);
              continue;
            }
            localIconPreference.dl("", -1);
            localIconPreference.Es(8);
            return;
          }
          localIconPreference.dl("", -1);
          localIconPreference.Es(8);
          if (!ai.oW((String)localObject1))
          {
            localIconPreference.setSummary((CharSequence)localObject1);
            return;
          }
          localIconPreference.setSummary(null);
          return;
        }
      }
      localIconPreference.Es(8);
      localIconPreference.Er(8);
      localIconPreference.setSummary(null);
      return;
    }
  }
  
  private void cqI()
  {
    this.eOE.bw("more_setting", false);
    IconPreference localIconPreference = (IconPreference)this.eOE.ZZ("more_setting");
    boolean bool;
    if (localIconPreference != null)
    {
      localIconPreference.Ew(8);
      bool = com.tencent.mm.s.c.Cp().aT(262145, 266242);
      if (!bool) {
        break label131;
      }
      localIconPreference.Er(0);
      localIconPreference.dk(getString(R.l.app_new), R.g.new_tips_bg);
      au.HU();
      if (((Integer)com.tencent.mm.model.c.DT().get(9, Integer.valueOf(0))).intValue() != 0)
      {
        if (q.GN()) {
          break label149;
        }
        localIconPreference.setSummary(R.l.safe_device_account_state_unsafe_in_setting);
      }
    }
    for (;;)
    {
      localIconPreference.Et(8);
      if (!bool) {
        break label159;
      }
      return;
      label131:
      localIconPreference.Er(8);
      localIconPreference.dk("", -1);
      break;
      label149:
      localIconPreference.setSummary("");
    }
    label159:
    au.HU();
    int i = ((Integer)com.tencent.mm.model.c.DT().get(aa.a.sWf, Integer.valueOf(0))).intValue();
    au.HU();
    int j = ((Integer)com.tencent.mm.model.c.DT().get(aa.a.sWg, Integer.valueOf(0))).intValue();
    if (((((com.tencent.mm.plugin.welab.a.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.welab.a.a.c.class)).bYN()) || (((com.tencent.mm.plugin.welab.a.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.welab.a.a.c.class)).bYO()) || (i > j)) && (!bool))
    {
      localIconPreference.Et(0);
      localIconPreference.Er(8);
      localIconPreference.dk("", -1);
      return;
    }
    localIconPreference.Et(8);
    if (com.tencent.mm.s.c.Cp().aU(262157, 266261))
    {
      localIconPreference.Et(0);
      localIconPreference.Er(8);
      localIconPreference.dk("", -1);
      return;
    }
    localIconPreference.Et(8);
    if (com.tencent.mm.s.c.Cp().aU(262158, 266264))
    {
      localIconPreference.Et(0);
      localIconPreference.Er(8);
      localIconPreference.dk("", -1);
      return;
    }
    if (com.tencent.mm.s.c.Cp().a(aa.a.sZC, 266264))
    {
      localIconPreference.Et(0);
      return;
    }
    localIconPreference.Et(8);
    au.HU();
    if ((com.tencent.mm.model.c.DT().getInt(40, 0) & 0x20000) == 0) {}
    for (i = 1;; i = 0)
    {
      if (com.tencent.mm.sdk.platformtools.bi.getInt(com.tencent.mm.k.g.AT().getValue("VoiceprintEntry"), 0) == 1) {
        au.HU();
      }
      for (bool = ((Boolean)com.tencent.mm.model.c.DT().get(aa.a.sPp, Boolean.valueOf(true))).booleanValue();; bool = false)
      {
        if ((bool) && (i != 0))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MoreTabUI", "show voiceprint dot");
          localIconPreference.Et(0);
          return;
        }
        localIconPreference.Et(8);
        bh localbh = com.tencent.mm.plugin.ab.a.bjj().Do(com.tencent.mm.ao.b.ebm);
        if ((localbh != null) && (!localbh.field_isExit))
        {
          com.tencent.mm.plugin.ab.a.bji().ebC = new ab.3(this, localIconPreference);
          return;
        }
        com.tencent.mm.plugin.ab.a.bjk();
        if (!com.tencent.mm.ao.c.ig(com.tencent.mm.ao.b.ebm)) {
          break;
        }
        localIconPreference.Et(0);
        localIconPreference.Er(8);
        localIconPreference.dk("", -1);
        return;
      }
    }
  }
  
  private void cqJ()
  {
    boolean bool1;
    boolean bool2;
    IconPreference localIconPreference;
    if (com.tencent.mm.bg.d.QS("emoji"))
    {
      com.tencent.mm.bg.d.cfH();
      this.eOE.bw("settings_emoji_store", false);
      bool1 = com.tencent.mm.s.c.Cp().aT(262147, 266244);
      bool2 = com.tencent.mm.s.c.Cp().aT(262149, 266244);
      localIconPreference = (IconPreference)this.eOE.ZZ("settings_emoji_store");
      if (localIconPreference != null) {}
    }
    else
    {
      this.eOE.bw("settings_emoji_store", false);
      return;
    }
    if (bool1)
    {
      localIconPreference.Er(0);
      localIconPreference.dk(getString(R.l.app_new), R.g.new_tips_bg);
    }
    while ((bool2) || (bool1))
    {
      au.HU();
      String str = (String)com.tencent.mm.model.c.DT().get(229633, null);
      o.Pj().a(str, localIconPreference.kYT, new ab.5(this, localIconPreference));
      return;
      if (bool2)
      {
        localIconPreference.Er(0);
        localIconPreference.dk(getString(R.l.app_free), R.g.new_tips_bg);
      }
      else
      {
        localIconPreference.Er(8);
        localIconPreference.dk("", -1);
      }
    }
    localIconPreference.Ev(8);
  }
  
  private void cqK()
  {
    boolean bool = q.GO();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MoreTabUI", "wallet status: is open" + bool);
    f localf = this.eOE;
    if (!bool) {}
    for (bool = true;; bool = false)
    {
      localf.bw("settings_mm_wallet", bool);
      this.tCL.notifyDataSetChanged();
      return;
    }
  }
  
  private void cqL()
  {
    au.HU();
    int i = ai.g((Integer)com.tencent.mm.model.c.DT().get(204820, null));
    au.HU();
    i += ai.g((Integer)com.tencent.mm.model.c.DT().get(204817, null));
    boolean bool3 = com.tencent.mm.s.c.Cp().aT(262156, 266248);
    boolean bool4 = com.tencent.mm.s.c.Cp().aU(262156, 266248);
    boolean bool5 = com.tencent.mm.s.c.Cp().b(aa.a.sYc, aa.a.sYe);
    au.HU();
    Object localObject = (String)com.tencent.mm.model.c.DT().get(aa.a.sYf, "");
    IconPreference localIconPreference = (IconPreference)this.eOE.ZZ("settings_mm_wallet");
    if (localIconPreference == null) {
      return;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MoreTabUI", "isShowNew : " + bool3);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MoreTabUI", "isShowDot : " + bool4);
    au.HU();
    String str1 = (String)com.tencent.mm.model.c.DT().get(aa.a.sXL, "");
    au.HU();
    int j = ((Integer)com.tencent.mm.model.c.DT().get(aa.a.sXM, Integer.valueOf(-1))).intValue();
    boolean bool2;
    boolean bool1;
    if (!bool3)
    {
      bool2 = bool4;
      bool1 = bool3;
      if (!bool4) {}
    }
    else
    {
      au.HU();
      long l1 = ((Long)com.tencent.mm.model.c.DT().get(aa.a.sXJ, Long.valueOf(-1L))).longValue();
      long l2 = ai.oX(com.tencent.mm.k.g.AT().getValue("PayWalletRedDotExpire"));
      long l3 = System.currentTimeMillis();
      double d = (l3 - l1) / 8.64E7D;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MoreTabUI", "pushTick: %s, expireTime: %s, expireTick: %s, currentTick: %s, passDay: %s", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(86400000L * l2), Long.valueOf(l3), Double.valueOf(d) });
      bool2 = bool4;
      bool1 = bool3;
      if (l1 > 0L)
      {
        bool2 = bool4;
        bool1 = bool3;
        if (l2 > 0L)
        {
          bool2 = bool4;
          bool1 = bool3;
          if (d >= l2)
          {
            bool1 = false;
            com.tencent.mm.s.c.Cp().u(262156, false);
            bool2 = false;
          }
        }
      }
    }
    com.tencent.mm.kernel.g.Ek();
    bool2 |= ((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sZu, Boolean.valueOf(false))).booleanValue();
    com.tencent.mm.kernel.g.Ek();
    String str2 = (String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sZs, "");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MoreTabUI", "after check, isShowNew: %s, isShowDot: %s, walletEntryWording: %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), str2 });
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MoreTabUI", "bankcardDot : " + bool5);
    if (bool5) {
      if (!com.tencent.mm.sdk.platformtools.bi.oW((String)localObject))
      {
        localIconPreference.Es(0);
        localIconPreference.ao((String)localObject, -1, -7566196);
        localIconPreference.lN(true);
        localIconPreference.Et(8);
        if ((ai.oW(str2)) || (!bool2)) {
          break label919;
        }
        localIconPreference.setSummary(str2);
        label591:
        localObject = h.mEJ;
        if (!bool2) {
          break label929;
        }
      }
    }
    label919:
    label929:
    for (i = 1;; i = 0)
    {
      ((h)localObject).h(14872, new Object[] { Integer.valueOf(6), Integer.valueOf(i), "", "", Integer.valueOf(1) });
      return;
      localIconPreference.dl("", -1);
      localIconPreference.Es(8);
      localIconPreference.Et(0);
      break;
      if (bool1)
      {
        localIconPreference.Er(0);
        localIconPreference.dk(getString(R.l.app_new), R.g.new_tips_bg);
        localIconPreference.Et(8);
        break;
      }
      if (i > 99)
      {
        localIconPreference.Er(0);
        localIconPreference.dk(getString(R.l.tab_msg_tip_over), r.hd(getContext()));
        localIconPreference.Et(8);
        break;
      }
      if (i > 0)
      {
        localIconPreference.Er(0);
        localIconPreference.dk(String.valueOf(i), r.hd(getContext()));
        localIconPreference.Et(8);
        break;
      }
      if (bool2)
      {
        localIconPreference.dk("", -1);
        localIconPreference.Er(8);
        localIconPreference.Et(0);
        break;
      }
      if (j == 1)
      {
        localIconPreference.dk("", -1);
        localIconPreference.Er(8);
        localIconPreference.Es(0);
        localIconPreference.lN(true);
        if (!ai.oW(str1)) {
          localIconPreference.ao(str1, -1, Color.parseColor("#888888"));
        }
        localIconPreference.Ew(8);
        break;
      }
      localIconPreference.dk("", -1);
      localIconPreference.Er(8);
      localIconPreference.Et(8);
      localIconPreference.Es(8);
      localIconPreference.dl("", -1);
      break;
      localIconPreference.setSummary("");
      break label591;
    }
  }
  
  public final int Ys()
  {
    return R.o.more_tab_pref;
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    int i = ai.bc(paramObject);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MoreTabUI", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    au.HU();
    if ((paramm != com.tencent.mm.model.c.DT()) || (i <= 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MoreTabUI", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
    }
    do
    {
      return;
      if ((204817 == i) || (204820 == i))
      {
        cqL();
        return;
      }
      if (40 == i)
      {
        cqK();
        return;
      }
    } while (!"208899".equals(Integer.valueOf(paramInt)));
    cqJ();
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    if (paramPreference.mKey.equals("more_tab_setting_personal_info"))
    {
      paramf = new Intent();
      com.tencent.mm.bg.d.b(getContext(), "setting", ".ui.setting.SettingsPersonalInfoUI", paramf);
    }
    boolean bool1;
    int i;
    label477:
    int j;
    do
    {
      return true;
      if (paramPreference.mKey.equals("settings_my_address"))
      {
        paramf = new Intent(getContext(), AddressUI.class);
        paramf.putExtra("Contact_GroupFilter_Type", "@biz.contact");
        startActivity(paramf);
        return true;
      }
      if (paramPreference.mKey.equals("settings_my_add_contact"))
      {
        com.tencent.mm.bg.d.b(getContext(), "subapp", ".ui.pluginapp.AddMoreFriendsUI", new Intent());
        return true;
      }
      if (paramPreference.mKey.equals("settings_mm_wallet"))
      {
        bool1 = com.tencent.mm.s.c.Cp().aT(262156, 266248);
        boolean bool2 = com.tencent.mm.s.c.Cp().aU(262156, 266248);
        h.mEJ.k(10958, "9");
        paramf = h.mEJ;
        if ((bool1) || (bool2))
        {
          i = 1;
          paramf.h(13341, new Object[] { Integer.valueOf(i) });
          paramf = UUID.randomUUID().toString();
          h.mEJ.h(14419, new Object[] { paramf, Integer.valueOf(0) });
          paramPreference = new nn();
          paramPreference.bYA.context = getContext();
          Intent localIntent = new Intent();
          localIntent.putExtra("key_wallet_has_red", bool2);
          localIntent.putExtra("key_uuid", paramf);
          paramPreference.bYA.intent = localIntent;
          com.tencent.mm.sdk.b.a.sFg.m(paramPreference);
          com.tencent.mm.s.c.Cp().aV(262156, 266248);
          com.tencent.mm.s.c.Cp().c(aa.a.sYc, aa.a.sYe);
          au.HU();
          com.tencent.mm.model.c.DT().a(aa.a.sXL, "");
          au.HU();
          com.tencent.mm.model.c.DT().a(aa.a.sXM, Integer.valueOf(-1));
          com.tencent.mm.kernel.g.Ek();
          com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sZu, Boolean.valueOf(false));
          com.tencent.mm.kernel.g.Ek();
          com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sZs, "");
          com.tencent.mm.kernel.g.Ek();
          com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sZt, Boolean.valueOf(false));
          paramf = h.mEJ;
          if (!bool2) {
            break label477;
          }
        }
        for (i = 1;; i = 0)
        {
          paramf.h(14872, new Object[] { Integer.valueOf(6), Integer.valueOf(i), "", "", Integer.valueOf(0) });
          return true;
          i = 0;
          break;
        }
      }
      if (paramPreference.mKey.equals("settings_mm_cardpackage"))
      {
        au.HU();
        com.tencent.mm.model.c.DT().a(aa.a.sPS, "");
        paramf = new Intent();
        paramf.putExtra("key_from_scene", 22);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MoreTabUI", "enter to cardhome");
        com.tencent.mm.bg.d.b(getContext(), "card", ".ui.CardHomePageUI", paramf);
        return true;
      }
      if (paramPreference.mKey.equals("settings_my_album"))
      {
        au.HU();
        if (!com.tencent.mm.model.c.isSDCardAvailable())
        {
          s.gH(getContext());
          return true;
        }
        au.HU();
        paramf = (String)com.tencent.mm.model.c.DT().get(2, null);
        paramPreference = new Intent();
        paramPreference.putExtra("sns_userName", paramf);
        paramPreference.setFlags(536870912);
        paramPreference.addFlags(67108864);
        au.HU();
        i = ai.g((Integer)com.tencent.mm.model.c.DT().get(68389, null));
        au.HU();
        com.tencent.mm.model.c.DT().set(68389, Integer.valueOf(i + 1));
        com.tencent.mm.bg.d.b(getContext(), "sns", ".ui.SnsUserUI", paramPreference);
        return true;
      }
      if (paramPreference.mKey.equals("settings_mm_favorite"))
      {
        h.mEJ.k(10958, "8");
        h.mEJ.h(14103, new Object[] { Integer.valueOf(0) });
        com.tencent.mm.plugin.fav.a.b.a(getContext(), ".ui.FavoriteIndexUI", new Intent());
        paramf = new Intent();
        paramf.setComponent(new ComponentName(e.i.thA, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
        paramf.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
        sendBroadcast(paramf);
        return true;
      }
      if (paramPreference.mKey.equals("settings_emoji_store"))
      {
        h.mEJ.k(10958, "7");
        com.tencent.mm.s.c.Cp().aV(262147, 266244);
        com.tencent.mm.s.c.Cp().aV(262149, 266244);
        paramf = new Intent();
        paramf.putExtra("preceding_scence", 2);
        com.tencent.mm.bg.d.b(getContext(), "emoji", ".ui.v2.EmojiStoreV2UI", paramf);
        h.mEJ.h(12065, new Object[] { Integer.valueOf(1) });
        ((com.tencent.mm.plugin.boots.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.boots.a.c.class)).ch(com.tencent.mm.plugin.boots.a.b.hjv, 881);
        return true;
      }
      if (!paramPreference.mKey.equals("more_setting")) {
        break;
      }
      bool1 = com.tencent.mm.s.c.Cp().aT(262145, 266242);
      com.tencent.mm.s.c.Cp().aV(262145, 266242);
      com.tencent.mm.s.c.Cp().aV(262157, 266261);
      com.tencent.mm.s.c.Cp().aV(262158, 266264);
      com.tencent.mm.s.c.Cp().b(aa.a.sZC, 266264);
      paramPreference = new Intent();
      com.tencent.mm.bg.d.b(getContext(), "setting", ".ui.setting.SettingsUI", paramPreference);
      au.HU();
      i = ((Integer)com.tencent.mm.model.c.DT().get(aa.a.sWf, Integer.valueOf(0))).intValue();
      au.HU();
      j = ((Integer)com.tencent.mm.model.c.DT().get(aa.a.sWg, Integer.valueOf(0))).intValue();
    } while ((bool1) || (i <= j));
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sWg, Integer.valueOf(i));
    paramf = (IconPreference)paramf.ZZ("more_setting");
    if (paramf != null) {
      paramf.Et(8);
    }
    com.tencent.mm.s.c.Cp().aV(266260, 266241);
    return true;
    if (paramPreference.mKey.equals("more_uishow"))
    {
      com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.al.a.a.a.class);
      getContext();
      new Intent();
      return true;
    }
    if (paramPreference.mKey.equals("settings_privacy_agreements"))
    {
      com.tencent.mm.platformtools.a.b(getActivity(), getString(a.j.license_read_url, new Object[] { w.chP(), com.tencent.mm.kernel.g.Ei().DT().get(274436, null), "setting", Integer.valueOf(0), Integer.valueOf(0) }), 0, true);
      return true;
    }
    return false;
  }
  
  protected final void coA() {}
  
  protected final void coB()
  {
    com.tencent.mm.s.c.Cp().b(this.mUs);
    au.HU();
    com.tencent.mm.model.c.DT().b(this);
  }
  
  protected final void coC() {}
  
  protected final void coD() {}
  
  public final void coF() {}
  
  public final void coG() {}
  
  public final void coI() {}
  
  protected final void coy()
  {
    this.eOE = this.tCL;
  }
  
  protected final void coz()
  {
    this.eOE = this.tCL;
    au.HU();
    com.tencent.mm.model.c.DT().a(this);
    com.tencent.mm.s.c.Cp().a(this.mUs);
    this.eOE.bw("more_tab_setting_personal_info", false);
    Object localObject2 = (AccountInfoPreference)this.tCL.ZZ("more_tab_setting_personal_info");
    Object localObject1 = q.GG();
    if (ai.oW((String)localObject1))
    {
      localObject1 = q.GF();
      if (com.tencent.mm.storage.ab.XT((String)localObject1))
      {
        ((AccountInfoPreference)localObject2).qOp = null;
        ((AccountInfoPreference)localObject2).userName = q.GF();
        String str = q.GH();
        localObject1 = str;
        if (ai.oW(str)) {
          localObject1 = q.GF();
        }
        ((AccountInfoPreference)localObject2).qOo = j.a(getContext(), (CharSequence)localObject1);
        ((AccountInfoPreference)this.eOE.ZZ("more_tab_setting_personal_info")).qOr = new ab.4(this);
        localObject1 = (IconPreference)this.eOE.ZZ("settings_my_address");
        if (localObject1 != null)
        {
          int i = com.tencent.mm.az.d.SF().clP();
          if (i <= 0) {
            break label457;
          }
          ((IconPreference)localObject1).Er(0);
          ((IconPreference)localObject1).dk(String.valueOf(i), R.g.new_tips_bg);
        }
        label198:
        cqG();
        cqJ();
        cqI();
        if (com.tencent.mm.bg.d.QS("favorite")) {
          break label473;
        }
        this.eOE.bw("settings_mm_favorite", true);
        label232:
        cqL();
        cqK();
        cqH();
        if (!com.tencent.mm.kernel.g.Ee().k(com.tencent.mm.plugin.al.a.a.class)) {
          break label489;
        }
        this.eOE.bw("more_uishow", false);
        label269:
        localObject1 = this.eOE.ZZ("settings_privacy_agreements");
        if (!com.tencent.mm.al.b.ml((String)com.tencent.mm.kernel.g.Ei().DT().get(274436, null))) {
          break label505;
        }
        str = getString(a.i.privacy_detail);
        localObject2 = Spannable.Factory.getInstance().newSpannable(str);
        ((Spannable)localObject2).setSpan(new ForegroundColorSpan(getResources().getColor(a.c.link_color)), ((Spannable)localObject2).length() - str.length(), ((Spannable)localObject2).length(), 33);
        ((Preference)localObject1).setTitle((CharSequence)localObject2);
        this.eOE.bw("settings_privacy_agreements", false);
      }
    }
    for (;;)
    {
      this.eOE.notifyDataSetChanged();
      localObject1 = findViewById(R.h.loading_tips_area);
      if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8)) {
        new ag(Looper.getMainLooper()).post(new ab.6(this, (View)localObject1));
      }
      return;
      ((AccountInfoPreference)localObject2).qOp = ((String)localObject1);
      break;
      ((AccountInfoPreference)localObject2).qOp = ((String)localObject1);
      break;
      label457:
      ((IconPreference)localObject1).Er(8);
      ((IconPreference)localObject1).dk("", -1);
      break label198;
      label473:
      this.eOE.bw("settings_mm_favorite", false);
      break label232;
      label489:
      this.eOE.bw("more_uishow", true);
      break label269;
      label505:
      this.eOE.bw("settings_privacy_agreements", true);
    }
  }
  
  public final void cpr() {}
  
  public final void cps() {}
  
  public boolean noActionBar()
  {
    return true;
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MoreTabUI", "onActivityCreated");
    super.onActivityCreated(paramBundle);
    this.eOE = this.tCL;
    this.eOE.bw("more_setting", true);
    this.eOE.bw("settings_emoji_store", true);
    this.eOE.bw("settings_mm_wallet", true);
    this.eOE.bw("settings_mm_cardpackage", true);
    this.eOE.bw("settings_mm_favorite", true);
    this.eOE.bw("settings_my_album", true);
    this.eOE.bw("settings_my_address", true);
    this.eOE.bw("more_tab_setting_personal_info", true);
    this.eOE.bw("more_uishow", true);
    this.eOE.bw("settings_privacy_agreements", true);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if ((!au.HX()) || (au.Dr())) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MoreTabUI", "Create MoreTabUI when accready:%b ishold:%b", new Object[] { Boolean.valueOf(au.HX()), Boolean.valueOf(au.Dr()) });
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  public boolean supportNavigationSwipeBack()
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */