package com.tencent.mm.plugin.sport.ui.a;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.ac.z;
import com.tencent.mm.ao.b;
import com.tencent.mm.g.a.ow;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI;
import com.tencent.mm.plugin.messenger.a.g;
import com.tencent.mm.pluginsdk.model.m;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  implements com.tencent.mm.ab.e, com.tencent.mm.pluginsdk.b.a
{
  Context context;
  private com.tencent.mm.ui.base.preference.f eOE;
  ab guS;
  private p guT;
  private CheckBoxPreference opQ;
  private CheckBoxPreference opR;
  
  public a(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof m))
    {
      au.DF().b(30, this);
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        break label102;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Sport.ContactWidgetSport", "errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      if ((paramInt1 == 4) && (paramInt2 == -24) && (!bi.oW(paramString))) {
        Toast.makeText(ad.getContext(), paramString, 1).show();
      }
    }
    label102:
    Object localObject;
    for (;;)
    {
      if (this.guT != null) {
        this.guT.dismiss();
      }
      auv();
      return;
      localObject = ((m)paraml).cby();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Sport.ContactWidgetSport", "bind fitness contact %s success", new Object[] { localObject });
      au.HU();
      paraml = com.tencent.mm.model.c.FR().Yg("gh_43f2581f6fd6");
      if ((paraml != null) && (!bi.oW((String)localObject))) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Sport.ContactWidgetSport", "respUsername == " + (String)localObject + ", contact = " + paraml);
      paramString = z.MY().kA(paraml.field_username);
      z.MY().e(paramString);
      au.HU();
      com.tencent.mm.model.c.DT().set(327825, Boolean.valueOf(true));
      com.tencent.mm.plugin.ab.a.bji();
      paramInt1 = b.ebo;
      com.tencent.mm.ao.d.b(paramInt1, b.ebk, "", null);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NewTipsManager", "dancy register local newtips, tipsId:%s, tipsVersion:%s, key:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(1), "" });
    }
    if (s.hd(paraml.field_username))
    {
      String str = bi.oV(paraml.field_username);
      paramString = com.tencent.mm.ac.f.kH(str);
      if (paramString != null) {
        paramString.field_username = ((String)localObject);
      }
      z.MY().delete(str);
      paraml.dD(str);
    }
    for (;;)
    {
      paraml.setUsername((String)localObject);
      if ((int)paraml.dhP == 0)
      {
        au.HU();
        com.tencent.mm.model.c.FR().U(paraml);
      }
      if ((int)paraml.dhP <= 0)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Sport.ContactWidgetSport", "addContact : insert contact failed");
        break;
      }
      s.p(paraml);
      au.HU();
      localObject = com.tencent.mm.model.c.FR().Yg(paraml.field_username);
      if (paramString != null)
      {
        z.MY().d(paramString);
        break;
      }
      paramString = com.tencent.mm.ac.f.kH(((ai)localObject).field_username);
      if ((paramString == null) || (paramString.LS()))
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Sport.ContactWidgetSport", "shouldUpdate");
        am.a.dBr.R(((ai)localObject).field_username, "");
        com.tencent.mm.aa.c.jN(((ai)localObject).field_username);
        break;
      }
      if (!((ab)localObject).ckZ()) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Sport.ContactWidgetSport", "update contact, last check time=%d", new Object[] { Integer.valueOf(((ai)localObject).csR) });
      am.a.dBr.R(((ai)localObject).field_username, "");
      com.tencent.mm.aa.c.jN(((ai)localObject).field_username);
      break;
      paramString = null;
    }
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, ab paramab, boolean paramBoolean, int paramInt)
  {
    this.eOE = paramf;
    this.guS = paramab;
    paramf.addPreferencesFromResource(R.o.contact_info_pref_sport);
    this.opQ = ((CheckBoxPreference)paramf.ZZ("contact_info_top_sport"));
    this.opR = ((CheckBoxPreference)paramf.ZZ("contact_info_not_disturb"));
    auv();
    return true;
  }
  
  final void auv()
  {
    HelperHeaderPreference localHelperHeaderPreference = (HelperHeaderPreference)this.eOE.ZZ("contact_info_header_helper");
    localHelperHeaderPreference.an(this.guS.field_username, this.guS.BL(), this.context.getString(R.l.contact_info_sport_switch_tip));
    if (com.tencent.mm.l.a.gd(this.guS.field_type))
    {
      localHelperHeaderPreference.nw(1);
      this.eOE.bw("contact_info_sport_install", true);
      this.eOE.bw("contact_info_sport_uninstall", false);
      this.eOE.bw("contact_info_go_to_sport", false);
      this.eOE.bw("contact_info_go_to_my_profile", false);
      this.eOE.bw("contact_info_invite_friend", false);
      this.eOE.bw("contact_info_common_problem", false);
      this.eOE.bw("contact_info_record_data", false);
      this.eOE.bw("contact_info_privacy_and_notification", false);
      this.eOE.bw("contact_info_top_sport", false);
      this.eOE.bw("contact_info_not_disturb", false);
      au.HU();
      if (com.tencent.mm.model.c.FW().Yx(this.guS.field_username)) {}
      for (this.opQ.qpJ = true; this.guS.BD(); this.opQ.qpJ = false)
      {
        this.opR.qpJ = true;
        return;
      }
      this.opR.qpJ = false;
      return;
    }
    localHelperHeaderPreference.nw(0);
    this.eOE.bw("contact_info_sport_install", false);
    this.eOE.bw("contact_info_sport_uninstall", true);
    this.eOE.bw("contact_info_go_to_sport", true);
    this.eOE.bw("contact_info_go_to_my_profile", true);
    this.eOE.bw("contact_info_invite_friend", true);
    this.eOE.bw("contact_info_common_problem", true);
    this.eOE.bw("contact_info_record_data", true);
    this.eOE.bw("contact_info_privacy_and_notification", true);
    this.eOE.bw("contact_info_top_sport", true);
    this.eOE.bw("contact_info_not_disturb", true);
  }
  
  public final boolean auw()
  {
    return true;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 == -1) {
      switch (paramInt1)
      {
      }
    }
    for (;;)
    {
      return;
      if (paramIntent != null)
      {
        Object localObject = bi.F(paramIntent.getStringExtra("received_card_name").split(","));
        paramIntent = paramIntent.getStringExtra("custom_send_text");
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          g.bcT().l("gh_43f2581f6fd6", str, s.fq(str));
          if (!bi.oW(paramIntent))
          {
            ow localow = new ow();
            localow.bZQ.bZR = str;
            localow.bZQ.content = paramIntent;
            localow.bZQ.type = s.hQ(str);
            localow.bZQ.flags = 0;
            com.tencent.mm.sdk.b.a.sFg.m(localow);
          }
        }
      }
    }
  }
  
  public final boolean wX(String paramString)
  {
    if ("contact_info_record_data".equals(paramString))
    {
      paramString = new Intent(this.context, ExdeviceRankDataSourceUI.class);
      this.context.startActivity(paramString);
    }
    do
    {
      return false;
      if ("contact_info_top_sport".equals(paramString))
      {
        if (this.opQ.isChecked())
        {
          com.tencent.mm.plugin.sport.b.d.kB(20);
          s.t(this.guS.field_username, true);
          return false;
        }
        com.tencent.mm.plugin.sport.b.d.kB(21);
        s.u(this.guS.field_username, true);
        return false;
      }
      if ("contact_info_not_disturb".equals(paramString))
      {
        if (this.opR.isChecked())
        {
          com.tencent.mm.plugin.sport.b.d.kB(22);
          s.n(this.guS);
          return false;
        }
        com.tencent.mm.plugin.sport.b.d.kB(23);
        s.o(this.guS);
        return false;
      }
      if ("contact_info_go_to_sport".equals(paramString))
      {
        paramString = new Intent();
        paramString.putExtra("Chat_User", this.guS.field_username);
        paramString.putExtra("finish_direct", true);
        com.tencent.mm.bg.d.e(this.context, ".ui.chatting.ChattingUI", paramString);
        com.tencent.mm.plugin.sport.b.d.kB(19);
        return false;
      }
      Object localObject;
      if ("contact_info_go_to_my_profile".equals(paramString))
      {
        paramString = q.GF();
        if (bi.oW(paramString))
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Sport.ContactWidgetSport", "Get username from UserInfo return null or nil.");
          return false;
        }
        localObject = new Intent();
        ((Intent)localObject).putExtra("username", paramString);
        com.tencent.mm.bg.d.b(this.context, "exdevice", ".ui.ExdeviceProfileUI", (Intent)localObject);
        com.tencent.mm.plugin.sport.b.d.kB(3);
        return false;
      }
      if ("contact_info_invite_friend".equals(paramString))
      {
        paramString = new Intent();
        paramString.putExtra("Select_Talker_Name", this.guS.field_username);
        paramString.putExtra("Select_block_List", this.guS.field_username);
        paramString.putExtra("Select_Conv_Type", 3);
        paramString.putExtra("Select_Send_Card", true);
        paramString.putExtra("mutil_select_is_ret", true);
        com.tencent.mm.bg.d.b(this.context, ".ui.transmit.SelectConversationUI", paramString, 1);
        com.tencent.mm.plugin.sport.b.d.kB(4);
        return false;
      }
      if ("contact_info_common_problem".equals(paramString))
      {
        paramString = new Intent();
        paramString.putExtra("KPublisherId", "custom_menu");
        paramString.putExtra("pre_username", this.guS.field_username);
        paramString.putExtra("prePublishId", "custom_menu");
        paramString.putExtra("preUsername", this.guS.field_username);
        paramString.putExtra("preChatName", this.guS.field_username);
        paramString.putExtra("preChatTYPE", t.N(this.guS.field_username, this.guS.field_username));
        paramString.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=wechat_movement_faq/index");
        paramString.putExtra("geta8key_username", this.guS.field_username);
        paramString.putExtra("from_scence", 1);
        com.tencent.mm.bg.d.b(this.context, "webview", ".ui.tools.WebViewUI", paramString);
        com.tencent.mm.plugin.sport.b.d.kB(5);
        return false;
      }
      if ("contact_info_privacy_and_notification".equals(paramString))
      {
        com.tencent.mm.bg.d.A(this.context, "exdevice", ".ui.ExdeviceSettingUI");
        return false;
      }
      if ("contact_info_sport_install".equals(paramString))
      {
        com.tencent.mm.plugin.sport.b.d.kB(13);
        paramString = this.context;
        this.context.getString(R.l.app_tip);
        this.guT = h.a(paramString, this.context.getString(R.l.settings_plugins_installing), true, null);
        this.guT.show();
        au.DF().a(30, this);
        paramString = new LinkedList();
        paramString.add("gh_43f2581f6fd6");
        localObject = new LinkedList();
        ((LinkedList)localObject).add(Integer.valueOf(1));
        paramString = new m(1, paramString, (List)localObject, "", "");
        au.DF().a(paramString, 0);
        return false;
      }
      if ("contact_info_sport_uninstall".equals(paramString))
      {
        com.tencent.mm.plugin.sport.b.d.kB(14);
        h.a(this.context, this.context.getString(R.l.settings_plugins_uninstall_hint), "", this.context.getString(R.l.app_clear), this.context.getString(R.l.app_cancel), new a.2(this), null);
        return false;
      }
    } while (!"contact_info_clear_data".equals(paramString));
    h.a(this.context, this.context.getString(R.l.contact_info_clear_data), "", this.context.getString(R.l.app_clear), this.context.getString(R.l.app_cancel), new a.1(this), null);
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sport/ui/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */