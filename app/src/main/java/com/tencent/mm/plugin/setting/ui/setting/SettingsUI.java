package com.tencent.mm.plugin.setting.ui.setting;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.CheckBox;
import com.tencent.mm.g.a.ef;
import com.tencent.mm.g.a.ef.a;
import com.tencent.mm.g.a.ja;
import com.tencent.mm.g.a.y;
import com.tencent.mm.kernel.k;
import com.tencent.mm.model.bt;
import com.tencent.mm.modelsimple.ac;
import com.tencent.mm.modelsimple.p;
import com.tencent.mm.modelsimple.r;
import com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.plugin.setting.a.e;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.h;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.a.k;
import com.tencent.mm.pluginsdk.f.e.a;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.s.a.a;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.SwitchKeyValuePreference;
import com.tencent.mm.ui.s;
import java.util.ArrayList;
import java.util.Set;

public class SettingsUI
  extends MMPreference
  implements m.b
{
  private com.tencent.mm.ui.base.preference.f eOE;
  private com.tencent.mm.sdk.platformtools.al eOf;
  private com.tencent.mm.ui.widget.a.d eSg;
  private com.tencent.mm.sdk.platformtools.al eaF = null;
  private com.tencent.mm.ab.e ehD = null;
  private View kOX;
  private ProgressDialog mQY = null;
  private com.tencent.mm.sdk.platformtools.al mQZ;
  private com.tencent.mm.ab.e mRa = null;
  private PersonalPreference mUq = null;
  private com.tencent.mm.ab.e mUr = null;
  private a.a mUs = new SettingsUI.1(this);
  private Dialog mUt = null;
  private com.tencent.mm.ui.widget.a.c mUu;
  private CheckBox mUv;
  private com.tencent.mm.ab.e mUw = null;
  
  private void btX()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsUI", "oneliang logout mm");
    com.tencent.mm.plugin.setting.b.ezo.vr();
    com.tencent.mm.kernel.g.Ei().DT().b(this);
    Object localObject = new ja();
    ((ja)localObject).bSG.status = 0;
    ((ja)localObject).bSG.aAk = 0;
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = new y();
    ((y)localObject).bHg.bHh = true;
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
    af.Wq("show_whatsnew");
    k.j(this, true);
    ad.getContext().getSharedPreferences("switch_account_preferences", 0).edit().putBoolean("last_logout_switch_account", false).commit();
    localObject = new Intent();
    ((Intent)localObject).addFlags(67108864);
    ((Intent)localObject).putExtra("Intro_Switch", true);
    com.tencent.mm.plugin.setting.b.ezn.q((Intent)localObject, this.mController.tml);
    com.tencent.mm.platformtools.x.H(this, null);
    finish();
  }
  
  private void bty()
  {
    int j = 0;
    IconPreference localIconPreference = (IconPreference)this.eOE.ZZ("settings_about_micromsg");
    boolean bool1 = bi.a(Boolean.valueOf(com.tencent.mm.s.c.Cp().aT(262145, 266243)), false);
    boolean bool2 = com.tencent.mm.s.c.Cp().aU(262157, 266262);
    if (com.tencent.mm.sdk.platformtools.e.sFF)
    {
      localIconPreference.dk("", -1);
      localIconPreference.Er(8);
      bool1 = com.tencent.mm.s.c.Cp().aU(262158, 266265);
      localIconPreference = (IconPreference)this.eOE.ZZ("settings_about_system");
      if (!bool1) {
        break label207;
      }
      i = 0;
      label111:
      localIconPreference.Et(i);
      com.tencent.mm.plugin.ab.a.bjk();
      if (!com.tencent.mm.ao.c.ig(com.tencent.mm.ao.b.ebm)) {
        break label213;
      }
    }
    label207:
    label213:
    for (int i = j;; i = 8)
    {
      localIconPreference.Et(i);
      return;
      if (bool1)
      {
        localIconPreference.Er(0);
        localIconPreference.dk(getString(a.i.app_new), a.e.new_tips_bg);
        break;
      }
      if (bool2)
      {
        localIconPreference.Et(0);
        break;
      }
      localIconPreference.Et(8);
      localIconPreference.dk("", -1);
      localIconPreference.Er(8);
      break;
      i = 8;
      break label111;
    }
  }
  
  private void bub()
  {
    IconPreference localIconPreference = (IconPreference)this.eOE.ZZ("settings_account_info");
    if (localIconPreference == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SettingsUI", "safedevicesate preference is null");
      return;
    }
    localIconPreference.Ew(8);
    if (com.tencent.mm.s.c.Cp().a(aa.a.sZC, 266257))
    {
      localIconPreference.Et(0);
      label55:
      if (bi.getInt(com.tencent.mm.k.g.AT().getValue("VoiceprintEntry"), 0) != 1) {
        break label160;
      }
      if (!((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sPr, Boolean.valueOf(true))).booleanValue()) {
        break label162;
      }
      if ((com.tencent.mm.kernel.g.Ei().DT().getInt(40, 0) & 0x20000) == 0)
      {
        localIconPreference.dk(getString(a.i.app_new), a.e.new_tips_bg);
        localIconPreference.Er(0);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsUI", "show voiceprint dot");
      }
    }
    for (;;)
    {
      this.eOE.notifyDataSetChanged();
      return;
      localIconPreference.Et(8);
      break label55;
      label160:
      break;
      label162:
      localIconPreference.Er(8);
      localIconPreference.dk("", -1);
    }
  }
  
  private void buc()
  {
    IconPreference localIconPreference = (IconPreference)this.eOE.ZZ("settings_about_privacy");
    if (localIconPreference != null)
    {
      if (((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sWh, Integer.valueOf(0))).intValue() > ((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sWi, Integer.valueOf(0))).intValue()) {
        localIconPreference.Et(0);
      }
    }
    else {
      return;
    }
    localIconPreference.Et(8);
  }
  
  private void bud()
  {
    l.a locala = com.tencent.mm.plugin.account.friend.a.l.XC();
    SwitchKeyValuePreference localSwitchKeyValuePreference = (SwitchKeyValuePreference)this.eOE.ZZ("settings_bind_mobile");
    boolean bool;
    if (localSwitchKeyValuePreference != null)
    {
      if ((locala != l.a.eKt) && (locala != l.a.eKu)) {
        break label78;
      }
      bool = true;
      localSwitchKeyValuePreference.bKe = bool;
      localSwitchKeyValuePreference.aL();
      if ((locala != l.a.eKt) && (locala != l.a.eKu)) {
        break label83;
      }
    }
    label78:
    label83:
    for (int i = a.i.settings_plugins_enable;; i = a.i.settings_plugins_disable)
    {
      localSwitchKeyValuePreference.setSummary(i);
      return;
      bool = false;
      break;
    }
  }
  
  private void bue()
  {
    Intent localIntent = new Intent(this, SettingsSwitchAccountUI.class);
    localIntent.putExtra("key_scene", 0);
    startActivity(localIntent);
  }
  
  private boolean buf()
  {
    com.tencent.mm.plugin.report.service.h.mEJ.h(11545, new Object[] { Integer.valueOf(1) });
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutOutside");
    if (this.mUt != null)
    {
      this.mUt.show();
      return true;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutOutside");
    this.mUt = com.tencent.mm.ui.base.h.a(this, getString(a.i.settings_logout_warning_tip), "", getString(a.i.settings_logout), getString(a.i.settings_logout_option_cancel), new SettingsUI.2(this), new SettingsUI.3(this));
    return true;
  }
  
  private boolean bug()
  {
    com.tencent.mm.plugin.report.service.h.mEJ.h(11545, new Object[] { Integer.valueOf(4) });
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_CloseWeChat");
    if (this.kOX == null)
    {
      this.kOX = View.inflate(this.mController.tml, a.g.settings_close, null);
      this.mUv = ((CheckBox)this.kOX.findViewById(a.f.settings_notify_dialog_cb));
      this.mUv.setChecked(true);
    }
    if (this.mUu == null)
    {
      this.mUu = com.tencent.mm.ui.base.h.a(this.mController.tml, null, this.kOX, getString(a.i.logout_menu_exit), getString(a.i.app_cancel), new SettingsUI.4(this), new SettingsUI.5(this));
      return true;
    }
    this.mUu.show();
    return true;
  }
  
  private void buh()
  {
    Object localObject = com.tencent.mm.kernel.g.DF();
    SettingsUI.19 local19 = new SettingsUI.19(this);
    this.mUr = local19;
    ((com.tencent.mm.ab.o)localObject).a(282, local19);
    localObject = new p();
    com.tencent.mm.kernel.g.DF().a((com.tencent.mm.ab.l)localObject, 0);
  }
  
  private void bui()
  {
    Object localObject1 = com.tencent.mm.kernel.g.DF();
    Object localObject2 = new SettingsUI.20(this);
    this.mRa = ((com.tencent.mm.ab.e)localObject2);
    ((com.tencent.mm.ab.o)localObject1).a(255, (com.tencent.mm.ab.e)localObject2);
    localObject1 = new r(2);
    ((r)localObject1).efX = 1;
    com.tencent.mm.kernel.g.DF().a((com.tencent.mm.ab.l)localObject1, 0);
    this.mQZ = new com.tencent.mm.sdk.platformtools.al(Looper.getMainLooper(), new SettingsUI.21(this, (r)localObject1), false);
    this.mQZ.J(3000L, 3000L);
    localObject2 = this.mController.tml;
    getString(a.i.app_tip);
    this.mQY = com.tencent.mm.ui.base.h.a((Context)localObject2, getString(a.i.wx_exit_processing_txt), false, new SettingsUI.22(this, (r)localObject1));
  }
  
  private void hC(boolean paramBoolean)
  {
    af.Wq("welcome_page_show");
    if (paramBoolean) {
      ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.notification.b.a.class)).getNotification().xU();
    }
    for (;;)
    {
      y localy = new y();
      localy.bHg.bHh = false;
      com.tencent.mm.sdk.b.a.sFg.m(localy);
      com.tencent.mm.plugin.setting.b.ezo.vo();
      ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.notification.b.a.class)).getNotification().xR();
      finish();
      if (com.tencent.mm.pluginsdk.f.e.qBn != null) {
        com.tencent.mm.pluginsdk.f.e.qBn.h(this.mController.tml, paramBoolean);
      }
      return;
      ((com.tencent.mm.plugin.notification.b.a)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.notification.b.a.class)).getNotification().n(-1, null);
    }
  }
  
  public final int Ys()
  {
    return a.k.settings_pref;
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    int i = bi.p(paramObject, 0);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsUI", "onNotifyChange event:%d obj:%d stg:%s", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), paramm });
    if ((paramm != com.tencent.mm.kernel.g.Ei().DT()) || (i <= 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SettingsUI", "onNotifyChange error obj:%d stg:%s", new Object[] { Integer.valueOf(i), paramm });
    }
    do
    {
      return;
      if (4 == i)
      {
        com.tencent.mm.kernel.g.Ei().DT().get(2, null);
        com.tencent.mm.kernel.g.Ei().DT().get(4, null);
      }
      if (6 == i)
      {
        bud();
        return;
      }
    } while (64 != i);
    bub();
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    paramf = paramPreference.mKey;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsUI", paramf + " item has been clicked!");
    if ("settings_welab".equals(paramf))
    {
      paramf = new Intent();
      paramPreference = new ArrayList();
      paramPreference.add("labs_browse");
      paramf.putStringArrayListExtra("key_exclude_apps", paramPreference);
      ((com.tencent.mm.plugin.welab.a.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.welab.a.a.c.class)).x(this, paramf);
      return true;
    }
    if ("settings_account_info".equals(paramf))
    {
      if ((bi.getInt(com.tencent.mm.k.g.AT().getValue("VoiceprintEntry"), 0) == 1) && ((com.tencent.mm.kernel.g.Ei().DT().getInt(40, 0) & 0x20000) == 0))
      {
        com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sPr, Boolean.valueOf(false));
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsUI", "unset setting account info dot show");
      }
      com.tencent.mm.s.c.Cp().b(aa.a.sZC, 266257);
      L(SettingsAccountInfoUI.class);
      return true;
    }
    if ("settings_account".equals(paramf))
    {
      this.mController.tml.startActivity(new Intent(this, SettingsPersonalInfoUI.class));
      return true;
    }
    if (paramf.equals("settings_bind_mobile"))
    {
      paramf = new Intent(this, BindMContactIntroUI.class);
      paramf.putExtra("key_upload_scene", 4);
      MMWizardActivity.D(this, paramf);
      return true;
    }
    if (paramf.equals("settings_about_privacy"))
    {
      int i = ((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sWh, Integer.valueOf(0))).intValue();
      if (i > ((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sWi, Integer.valueOf(0))).intValue()) {
        com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sWi, Integer.valueOf(i));
      }
      startActivity(new Intent(this, SettingsPrivacyUI.class));
      return true;
    }
    if (paramf.equals("settings_about_system"))
    {
      com.tencent.mm.s.c.Cp().aV(262158, 266265);
      startActivity(new Intent(this, SettingsAboutSystemUI.class));
      return true;
    }
    if (paramf.equals("settings_about_micromsg"))
    {
      com.tencent.mm.s.c.Cp().aV(262145, 266243);
      com.tencent.mm.s.c.Cp().aV(262157, 266262);
      this.mController.tml.startActivity(new Intent(this, SettingsAboutMicroMsgUI.class));
      new ag().postDelayed(new SettingsUI.29(this), 100L);
      return true;
    }
    if (paramf.equals("settings_about_device"))
    {
      paramf = new Intent();
      com.tencent.mm.bg.d.b(this.mController.tml, "exdevice", ".ui.ExdeviceManageDeviceUI", paramf);
      return true;
    }
    if (paramf.equals("settings_logout"))
    {
      if (com.tencent.mm.al.b.PD())
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsUI", "oversea user logout");
        com.tencent.mm.ui.base.h.a(this.mController.tml, true, getResources().getString(a.i.settings_logout_warning_tip), "", getResources().getString(a.i.settings_logout), getString(a.i.app_cancel), new SettingsUI.13(this), null);
        return true;
      }
      com.tencent.mm.plugin.report.service.h.mEJ.h(11545, new Object[] { Integer.valueOf(8) });
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsUI", "reprot: MM_LightPushCloseWechat == OP_LogoutCloseEntrance");
      if (bt.dDs.IH().size() > 1) {
        com.tencent.mm.plugin.report.service.h.mEJ.h(14978, new Object[] { Integer.valueOf(1), Integer.valueOf(10), bt.dDs.II() });
      }
      for (;;)
      {
        this.eSg.bXO();
        return true;
        com.tencent.mm.plugin.report.service.h.mEJ.h(14978, new Object[] { Integer.valueOf(0), Integer.valueOf(10), bt.dDs.II() });
      }
    }
    if (paramf.equals("settings_exit")) {
      return bug();
    }
    if (paramf.equals("settings_logout_option")) {
      return buf();
    }
    if (paramf.equals("settings_notification_preference"))
    {
      startActivity(new Intent(this, SettingsNotificationUI.class));
      return true;
    }
    if (paramf.equals("settings_chatting"))
    {
      L(SettingsChattingUI.class);
      return true;
    }
    if (paramf.equals("settings_active_time"))
    {
      com.tencent.mm.plugin.report.service.h.mEJ.h(11351, new Object[] { Integer.valueOf(1), Integer.valueOf(0) });
      L(SettingsActiveTimeUI.class);
      return true;
    }
    if (paramf.equals("settings_feedback")) {
      if ((!com.tencent.mm.sdk.platformtools.e.sFF) && (w.chP().equals("zh_CN")))
      {
        paramf = getString(a.i.wechat_faq_url);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsUI", "using faq webpage");
        paramPreference = new Intent();
        paramPreference.putExtra("showShare", false);
        paramPreference.putExtra("rawUrl", paramf);
        paramPreference.putExtra("show_feedback", false);
        paramPreference.putExtra("KShowFixToolsBtn", true);
        com.tencent.mm.bg.d.b(this.mController.tml, "webview", ".ui.tools.WebViewUI", paramPreference);
      }
    }
    label1175:
    label1182:
    do
    {
      for (;;)
      {
        return false;
        if (w.chP().equals("zh_HK"))
        {
          paramf = getString(a.i.wechat_faq_url_cht);
          break;
        }
        if (w.chP().equals("zh_TW"))
        {
          paramf = getString(a.i.wechat_faq_url_cht_tw);
          break;
        }
        paramf = getString(a.i.wechat_faq_url_en);
        break;
        if (!paramf.equals("settings_hardcoder"))
        {
          if (!paramf.equals("settings_switch_account")) {
            break label1182;
          }
          if (bt.dDs.IH().size() > 1) {
            com.tencent.mm.plugin.report.service.h.mEJ.h(14978, new Object[] { Integer.valueOf(1), Integer.valueOf(6), bt.dDs.II() });
          }
          for (;;)
          {
            if (!com.tencent.mm.kernel.g.Ei().DT().getBoolean(aa.a.sZa, true)) {
              break label1175;
            }
            com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sZa, Boolean.valueOf(false));
            com.tencent.mm.ui.base.h.a(this, getString(a.i.settings_switch_account_alert_tip), getString(a.i.settings_switch_account_alert_title), getString(a.i.app_i_known), false, new SettingsUI.28(this));
            break;
            com.tencent.mm.plugin.report.service.h.mEJ.h(14978, new Object[] { Integer.valueOf(0), Integer.valueOf(6), bt.dDs.II() });
          }
          bue();
        }
      }
    } while (!paramf.equals("settings_redesign"));
    startActivity(new Intent(this, SettingRedesign.class));
    return true;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.settings_title);
    this.eOE = this.tCL;
    setBackBtn(new SettingsUI.23(this));
    this.eSg = new com.tencent.mm.ui.widget.a.d(this, 1, false);
    this.eSg.ofp = new SettingsUI.24(this);
    this.eSg.uJQ = new SettingsUI.25(this);
    this.eSg.ofq = new SettingsUI.26(this);
    new SettingsUI.27(this);
    bud();
    bty();
    buc();
    if (!com.tencent.mm.sdk.platformtools.d.REDESIGN_ENTRANCE) {
      this.eOE.bw("settings_redesign", true);
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.SettingsUI", "settings handle");
    switch (paramInt1)
    {
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return;
            } while (paramInt2 != -1);
            btX();
            return;
            paramIntent = com.tencent.mm.pluginsdk.ui.tools.l.d(getApplicationContext(), paramIntent, com.tencent.mm.plugin.p.c.Gb());
          } while (paramIntent == null);
          localObject = new Intent();
          ((Intent)localObject).putExtra("CropImageMode", 1);
          ((Intent)localObject).putExtra("CropImage_OutputPath", paramIntent);
          ((Intent)localObject).putExtra("CropImage_ImgPath", paramIntent);
          com.tencent.mm.plugin.setting.b.ezn.a(this.mController.tml, (Intent)localObject, 4);
          return;
        } while (paramIntent == null);
        localObject = com.tencent.mm.pluginsdk.ui.tools.l.d(getApplicationContext(), paramIntent, com.tencent.mm.plugin.p.c.Gb());
      } while (localObject == null);
      Intent localIntent = new Intent();
      localIntent.putExtra("CropImageMode", 1);
      localIntent.putExtra("CropImage_OutputPath", com.tencent.mm.aa.q.Kp().c(com.tencent.mm.model.q.GF(), true, false));
      localIntent.putExtra("CropImage_ImgPath", (String)localObject);
      com.tencent.mm.plugin.setting.b.ezn.a(this, paramIntent, localIntent, com.tencent.mm.plugin.p.c.Gb(), 4, null);
      return;
    } while (paramIntent == null);
    Object localObject = paramIntent.getStringExtra("CropImage_OutputPath");
    if (localObject == null) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SettingsUI", "crop picture failed");
    }
    for (;;)
    {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      return;
      new com.tencent.mm.aa.o(this.mController.tml, (String)localObject).b(1, null);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
    com.tencent.mm.kernel.g.Ei().DT().a(this);
    com.tencent.mm.s.c.Cp().a(this.mUs);
    if ((bi.getInt(com.tencent.mm.k.g.AT().getValue("VoiceprintEntry"), 0) == 1) && ((com.tencent.mm.kernel.g.Ei().DT().getInt(40, 0) & 0x20000) == 0))
    {
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sPp, Boolean.valueOf(false));
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsUI", "unset more tab dot");
    }
  }
  
  protected void onDestroy()
  {
    if (com.tencent.mm.kernel.g.Eg().Dx())
    {
      com.tencent.mm.kernel.g.Ei().DT().b(this);
      com.tencent.mm.s.c.Cp().b(this.mUs);
    }
    if (this.ehD != null) {
      com.tencent.mm.kernel.g.DF().b(281, this.ehD);
    }
    if (this.mRa != null) {
      com.tencent.mm.kernel.g.DF().b(255, this.mRa);
    }
    if (this.mUw != null) {
      com.tencent.mm.kernel.g.DF().b(281, this.mUw);
    }
    super.onDestroy();
  }
  
  public void onPause()
  {
    super.onPause();
    com.tencent.mm.kernel.g.Em().L(new SettingsUI.12(this));
  }
  
  public void onResume()
  {
    Object localObject1 = (PersonalPreference)this.eOE.ZZ("settings_account");
    if (localObject1 != null)
    {
      localObject2 = com.tencent.mm.model.q.GF();
      ((PersonalPreference)localObject1).dHf = null;
      ((PersonalPreference)localObject1).mQd = -1;
      ((PersonalPreference)localObject1).mQe = ((String)localObject2);
      if (((PersonalPreference)localObject1).jev != null) {
        a.b.a(((PersonalPreference)localObject1).jev, ((PersonalPreference)localObject1).mQe);
      }
    }
    localObject1 = new ef();
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
    if (!((ef)localObject1).bMc.bKE)
    {
      localObject1 = this.eOE.ZZ("settings_about_device");
      this.eOE.c((Preference)localObject1);
    }
    bub();
    bud();
    bty();
    buc();
    localObject1 = (IconPreference)this.eOE.ZZ("settings_welab");
    Object localObject2 = (com.tencent.mm.plugin.welab.a.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.welab.a.a.c.class);
    if (((com.tencent.mm.plugin.welab.a.a.c)localObject2).bYO())
    {
      ((IconPreference)localObject1).Er(0);
      ((IconPreference)localObject1).dk(getString(a.i.app_new), a.e.new_tips_bg);
      if (!((com.tencent.mm.plugin.welab.a.a.c)localObject2).bYP()) {
        break label260;
      }
      if (!((com.tencent.mm.plugin.welab.a.a.c)localObject2).bYN()) {
        break label249;
      }
      ((IconPreference)localObject1).eV(0, a.h.welab_icon_light);
    }
    for (;;)
    {
      localObject1 = this.eOE.ZZ("settings_hardcoder");
      this.eOE.c((Preference)localObject1);
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.SettingsUI", "on resume");
      super.onResume();
      return;
      ((IconPreference)localObject1).Er(8);
      break;
      label249:
      ((IconPreference)localObject1).eV(0, a.h.welab_icon_grey);
      continue;
      label260:
      ((IconPreference)localObject1).eV(8, -1);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */