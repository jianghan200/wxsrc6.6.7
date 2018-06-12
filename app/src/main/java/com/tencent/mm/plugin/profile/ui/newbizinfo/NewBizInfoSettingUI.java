package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Window;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ac.d.b;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.z;
import com.tencent.mm.g.a.cz;
import com.tencent.mm.g.a.cz.b;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.i;
import com.tencent.mm.plugin.base.model.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.protocal.c.atx;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.statusbar.DrawStatusBarPreference;

public class NewBizInfoSettingUI
  extends DrawStatusBarPreference
{
  private d.b dKP;
  private int eLK;
  private com.tencent.mm.ui.base.preference.f eOE;
  private ab guS;
  private boolean hEj;
  private boolean isDeleteCancel = false;
  private com.tencent.mm.ac.d lUs;
  com.tencent.mm.ui.widget.a.c lVP = null;
  private p tipDialog = null;
  
  private void a(com.tencent.mm.ac.d paramd, boolean paramBoolean)
  {
    CheckBoxPreference localCheckBoxPreference1 = (CheckBoxPreference)this.eOE.ZZ("contact_info_subscribe_bizinfo");
    CheckBoxPreference localCheckBoxPreference2 = (CheckBoxPreference)this.eOE.ZZ("contact_info_locate");
    atx localatx = new atx();
    localatx.eJV = paramd.field_brandFlag;
    localatx.hbL = this.guS.field_username;
    if (uK(this.eLK))
    {
      au.HU();
      com.tencent.mm.model.c.FQ().b(new h.a(58, localatx));
    }
    for (;;)
    {
      z.MY().c(paramd, new String[0]);
      localCheckBoxPreference1.qpJ = paramd.LQ();
      if (localCheckBoxPreference2 != null) {
        localCheckBoxPreference2.qpJ = paramd.LR();
      }
      if (paramBoolean) {
        initView();
      }
      return;
      au.HU();
      com.tencent.mm.model.c.FQ().b(new h.a(47, localatx));
    }
  }
  
  private void bnq()
  {
    if ((this.guS != null) && (com.tencent.mm.l.a.gd(this.guS.field_type)) && (!com.tencent.mm.model.s.hr(this.guS.field_username)) && (!com.tencent.mm.model.s.hW(this.guS.field_username))) {
      this.eOE.bw("contact_is_mute", false);
    }
    for (;;)
    {
      this.eOE.bw("contact_info_verifyuser_weibo", true);
      this.eOE.bw("contact_info_subscribe_bizinfo", true);
      this.eOE.bw("contact_info_template_recv", true);
      this.eOE.bw("contact_info_locate", true);
      return;
      this.eOE.bw("contact_is_mute", true);
      if ((this.guS != null) && (!com.tencent.mm.l.a.gd(this.guS.field_type)) && (uK(this.eLK))) {
        this.eOE.bw("contact_info_expose_btn", false);
      } else {
        this.eOE.bw("contact_info_expose_btn", true);
      }
    }
  }
  
  private static boolean uK(int paramInt)
  {
    return (paramInt == 81) || (paramInt == 92) || (paramInt == 93) || (paramInt == 94);
  }
  
  public final int Ys()
  {
    return R.o.newbizinfo_setting_pref;
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    paramPreference = paramPreference.mKey;
    x.i("MicroMsg.mmui.MMPreference", paramPreference + " item has been clicked!");
    Object localObject;
    if ("contact_info_locate".endsWith(paramPreference))
    {
      localObject = this.lUs;
      if (localObject != null) {}
    }
    label109:
    label138:
    label317:
    label337:
    label557:
    label573:
    label636:
    label642:
    label652:
    label661:
    label731:
    do
    {
      return true;
      boolean bool;
      if (((com.tencent.mm.ac.d)localObject).LR())
      {
        ((com.tencent.mm.ac.d)localObject).field_brandFlag &= 0xFFFFFFFB;
        a((com.tencent.mm.ac.d)localObject, false);
        if (!((CheckBoxPreference)paramf.ZZ("contact_info_locate")).isChecked()) {
          break label557;
        }
        com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.bT(this.guS.field_username, 905);
        if ("contact_info_expose_btn".equals(paramPreference))
        {
          if ((this.guS != null) && (!bi.oW(this.guS.field_username))) {
            break label573;
          }
          com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.bT(this.guS.field_username, 908);
        }
        if ("contact_info_add_shortcut_btn".equals(paramPreference))
        {
          x.d("MicroMsg.mmui.MMPreference", "dealAddShortcut, username = " + this.guS.field_username);
          b.V(this, this.guS.field_username);
          ah.i(new NewBizInfoSettingUI.7(this), 1000L);
        }
        if ("contact_info_clear_msg".equals(paramPreference))
        {
          getString(R.l.fmt_delcontactmsg_confirm, new Object[] { this.guS.BL() });
          com.tencent.mm.ui.base.h.a(this, getString(R.l.contact_info_biz_clear_msg_tips), "", getString(R.l.contact_info_biz_clear_msg), getString(R.l.app_cancel), new NewBizInfoSettingUI.4(this), null);
          com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.bT(this.guS.field_username, 909);
        }
        if ("contact_is_mute".endsWith(paramPreference))
        {
          if (this.hEj) {
            break label636;
          }
          bool = true;
          this.hEj = bool;
          if (!this.hEj) {
            break label642;
          }
          com.tencent.mm.model.s.n(this.guS);
          bool = this.hEj;
          if (this.guS != null)
          {
            if ((!bool) || (com.tencent.mm.ac.f.eZ(this.guS.field_username))) {
              break label652;
            }
            setTitleMuteIconVisibility(0);
          }
        }
      }
      for (;;)
      {
        localObject = (CheckBoxPreference)this.eOE.ZZ("contact_is_mute");
        if (localObject != null) {
          ((CheckBoxPreference)localObject).qpJ = bool;
        }
        if (!"contact_info_stick_biz".equals(paramPreference)) {
          break label731;
        }
        if (!((CheckBoxPreference)paramf.ZZ("contact_info_stick_biz")).isChecked()) {
          break label661;
        }
        com.tencent.mm.plugin.report.service.h.mEJ.h(13307, new Object[] { this.guS.field_username, Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0) });
        com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.bT(this.guS.field_username, 903);
        i.gy(this.guS.field_username);
        return true;
        this.lVP = com.tencent.mm.ui.base.h.a(this, getString(R.l.chatting_biz_report_location_confirm, new Object[] { this.guS.BL() }), getString(R.l.app_tip), new NewBizInfoSettingUI.2(this, (com.tencent.mm.ac.d)localObject), new NewBizInfoSettingUI.3(this, (com.tencent.mm.ac.d)localObject));
        break;
        com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.bT(this.guS.field_username, 907);
        break label109;
        localObject = new Intent();
        ((Intent)localObject).putExtra("rawUrl", String.format("https://mp.weixin.qq.com/mp/infringement?username=%s&from=1#wechat_redirect", new Object[] { this.guS.field_username }));
        ((Intent)localObject).putExtra("showShare", false);
        com.tencent.mm.bg.d.b(this, "webview", ".ui.tools.WebViewUI", (Intent)localObject);
        break label138;
        bool = false;
        break label317;
        com.tencent.mm.model.s.o(this.guS);
        break label337;
        setTitleMuteIconVisibility(8);
      }
      com.tencent.mm.model.s.u(this.guS.field_username, true);
      com.tencent.mm.plugin.report.service.h.mEJ.h(13307, new Object[] { this.guS.field_username, Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(0) });
      com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.bT(this.guS.field_username, 904);
      return true;
      if ("contact_info_template_recv".equals(paramPreference))
      {
        localObject = new Intent();
        ((Intent)localObject).putExtra("enterprise_biz_name", this.lUs.field_username);
        com.tencent.mm.bg.d.b(this, "brandservice", ".ui.ReceiveTemplateMsgMgrUI", (Intent)localObject);
      }
      if (!"contact_info_subscribe_bizinfo".endsWith(paramPreference)) {
        break;
      }
      paramPreference = this.lUs;
    } while (paramPreference == null);
    int i;
    if (paramPreference.LQ())
    {
      paramPreference.field_brandFlag |= 0x1;
      if ((this.dKP == null) && (paramPreference != null)) {
        this.dKP = paramPreference.bG(false);
      }
      if ((this.dKP != null) && (this.dKP.Mk()) && (com.tencent.mm.bg.d.QS("brandservice")))
      {
        paramf.bw("contact_info_template_recv", false);
        localObject = com.tencent.mm.plugin.report.service.h.mEJ;
        String str = paramPreference.field_username;
        if (!paramPreference.LQ()) {
          break label998;
        }
        i = 3;
        label887:
        ((com.tencent.mm.plugin.report.service.h)localObject).h(13307, new Object[] { str, Integer.valueOf(1), Integer.valueOf(i), Integer.valueOf(0) });
        a(paramPreference, false);
        if (!((CheckBoxPreference)paramf.ZZ("contact_info_subscribe_bizinfo")).isChecked()) {
          break label1003;
        }
        com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.bT(this.guS.field_username, 901);
      }
    }
    for (;;)
    {
      return false;
      paramf.bw("contact_info_template_recv", true);
      break;
      paramPreference.field_brandFlag &= 0xFFFFFFFE;
      paramf.bw("contact_info_template_recv", true);
      break;
      label998:
      i = 4;
      break label887;
      label1003:
      com.tencent.mm.plugin.profile.ui.newbizinfo.c.c.bT(this.guS.field_username, 902);
    }
  }
  
  protected final void initView()
  {
    this.dKP = this.lUs.bG(false);
    if (this.lUs != null)
    {
      this.eOE.bw("contact_is_mute", true);
      this.hEj = false;
    }
    this.eOE.bw("contact_info_stick_biz", true);
    Object localObject;
    boolean bool;
    if (this.lUs != null)
    {
      localObject = this.eOE;
      if ((com.tencent.mm.model.s.hr(this.guS.field_username)) || (!com.tencent.mm.l.a.gd(this.guS.field_type)))
      {
        bool = true;
        ((com.tencent.mm.ui.base.preference.f)localObject).bw("contact_info_stick_biz", bool);
        ((CheckBoxPreference)this.eOE.ZZ("contact_info_stick_biz")).qpJ = this.guS.BG();
      }
    }
    else
    {
      x.d("MicroMsg.mmui.MMPreference", "KIsardDevice(%b)", new Object[] { Boolean.valueOf(getIntent().getBooleanExtra("KIsHardDevice", false)) });
      if ((getIntent() == null) || (!getIntent().getBooleanExtra("KIsHardDevice", false))) {
        break label642;
      }
      x.d("MicroMsg.mmui.MMPreference", "Hard device biz...");
      if (getIntent() != null) {
        break label394;
      }
      bool = false;
      label191:
      x.d("MicroMsg.mmui.MMPreference", "contact.isContact()(%b), isHardDeviceBound(%b)", new Object[] { Boolean.valueOf(com.tencent.mm.l.a.gd(this.guS.field_type)), Boolean.valueOf(bool) });
      if ((!com.tencent.mm.l.a.gd(this.guS.field_type)) || (!bool)) {
        break label553;
      }
      if (this.lUs == null) {
        break label516;
      }
      ((CheckBoxPreference)this.eOE.ZZ("contact_info_subscribe_bizinfo")).qpJ = this.lUs.LQ();
      localObject = (CheckBoxPreference)this.eOE.ZZ("contact_info_locate");
      if (!this.lUs.bG(false).LU()) {
        break label464;
      }
      ((CheckBoxPreference)localObject).qpJ = this.lUs.LR();
      label314:
      if (!this.lUs.LQ()) {
        break label503;
      }
      if ((this.dKP == null) && (this.lUs != null)) {
        this.dKP = this.lUs.bG(false);
      }
      if ((this.dKP == null) || (!this.dKP.Mk()) || (!com.tencent.mm.bg.d.QS("brandservice"))) {
        break label490;
      }
      this.eOE.bw("contact_info_template_recv", false);
    }
    label394:
    label464:
    label490:
    label503:
    label516:
    label553:
    label642:
    label855:
    do
    {
      do
      {
        do
        {
          return;
          bool = false;
          break;
          localObject = getIntent().getStringExtra("device_id");
          String str = getIntent().getStringExtra("device_type");
          cz localcz = new cz();
          localcz.bKx.byN = ((String)localObject);
          localcz.bKx.bKv = str;
          com.tencent.mm.sdk.b.a.sFg.m(localcz);
          bool = localcz.bKy.bKz;
          break label191;
          this.eOE.bw("contact_info_locate", true);
          ((CheckBoxPreference)localObject).qpJ = this.lUs.LR();
          break label314;
          this.eOE.bw("contact_info_template_recv", true);
          return;
          this.eOE.bw("contact_info_template_recv", true);
          return;
          this.eOE.bw("contact_info_subscribe_bizinfo", true);
          this.eOE.bw("contact_info_locate", true);
          this.eOE.bw("contact_info_template_recv", true);
          return;
          x.w("MicroMsg.mmui.MMPreference", "%s is not my hard biz contact", new Object[] { this.guS.field_username });
          bnq();
        } while (!uK(this.eLK));
        if (this.lUs == null)
        {
          x.e("MicroMsg.mmui.MMPreference", "bizinfo is null in temp session");
          return;
        }
        ((CheckBoxPreference)this.eOE.ZZ("contact_info_subscribe_bizinfo")).qpJ = this.lUs.LQ();
        this.eOE.bw("contact_info_subscribe_bizinfo", false);
        return;
        if (!com.tencent.mm.l.a.gd(this.guS.field_type)) {
          break label855;
        }
      } while (this.lUs == null);
      ((CheckBoxPreference)this.eOE.ZZ("contact_info_subscribe_bizinfo")).qpJ = this.lUs.LQ();
      if (this.lUs.LQ())
      {
        if ((this.dKP == null) && (this.lUs != null)) {
          this.dKP = this.lUs.bG(false);
        }
        if ((this.dKP != null) && (this.dKP.Mk()) && (com.tencent.mm.bg.d.QS("brandservice"))) {
          this.eOE.bw("contact_info_template_recv", false);
        }
      }
      for (;;)
      {
        localObject = (CheckBoxPreference)this.eOE.ZZ("contact_info_locate");
        if (!this.lUs.bG(false).LU()) {
          break;
        }
        ((CheckBoxPreference)localObject).qpJ = this.lUs.LR();
        return;
        this.eOE.bw("contact_info_template_recv", true);
        continue;
        this.eOE.bw("contact_info_template_recv", true);
      }
      this.eOE.bw("contact_info_locate", true);
      ((CheckBoxPreference)localObject).qpJ = this.lUs.LR();
      return;
      x.w("MicroMsg.mmui.MMPreference", "%s is not my contact", new Object[] { this.guS.field_username });
      bnq();
    } while (!uK(this.eLK));
    if (this.lUs == null)
    {
      x.e("MicroMsg.mmui.MMPreference", "bizinfo is null in temp session");
      return;
    }
    ((CheckBoxPreference)this.eOE.ZZ("contact_info_subscribe_bizinfo")).qpJ = this.lUs.LQ();
    this.eOE.bw("contact_info_subscribe_bizinfo", false);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    boolean bool2 = true;
    super.onCreate(paramBundle);
    this.eOE = this.tCL;
    lF(a.lYr);
    if (Build.VERSION.SDK_INT >= 21) {
      com.tencent.mm.ui.statusbar.a.c(this.mController.contentView, getWindow().getStatusBarColor(), com.tencent.mm.ui.statusbar.d.c(getWindow()));
    }
    setMMTitle(R.l.contact_info_biz_setting);
    nS(-16777216);
    com.tencent.mm.ui.s.cqp();
    cqh();
    lC(false);
    setBackBtn(new NewBizInfoSettingUI.1(this), R.k.actionbar_icon_dark_back);
    paramBundle = bi.oV(getIntent().getStringExtra("Contact_User"));
    au.HU();
    this.guS = com.tencent.mm.model.c.FR().Yg(paramBundle);
    this.lUs = com.tencent.mm.ac.f.kH(this.guS.field_username);
    boolean bool1;
    if (this.guS != null)
    {
      bool1 = true;
      if (this.lUs == null) {
        break label212;
      }
    }
    for (;;)
    {
      x.i("MicroMsg.mmui.MMPreference", "user:%s contact:%b, bizInfo:%b", new Object[] { paramBundle, Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      this.eLK = getIntent().getIntExtra("Contact_Scene", 9);
      initView();
      return;
      bool1 = false;
      break;
      label212:
      bool2 = false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/newbizinfo/NewBizInfoSettingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */