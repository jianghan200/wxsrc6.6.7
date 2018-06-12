package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.setting.a.b;
import com.tencent.mm.plugin.setting.a.e;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.h;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.a.k;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.protocal.c.xt;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.widget.a.c.a;

public class SettingsAboutSystemUI
  extends MMPreference
{
  private f eOE;
  private boolean isDeleteCancel = false;
  private ProgressDialog mQY = null;
  private boolean mRg = false;
  private int mRh = -1;
  private int mRi = -1;
  private boolean mRj = false;
  
  private void a(LinearLayout paramLinearLayout, int paramInt1, int paramInt2, boolean paramBoolean, View.OnClickListener paramOnClickListener)
  {
    TextView localTextView = (TextView)View.inflate(this.mController.tml, a.g.radio_btn_item, null);
    localTextView.setText(paramInt1);
    localTextView.setTag(Integer.valueOf(paramInt2));
    paramLinearLayout.addView(localTextView);
    localTextView.setOnClickListener(paramOnClickListener);
    if (paramBoolean) {
      localTextView.setCompoundDrawablesWithIntrinsicBounds(a.h.radio_on, 0, 0, 0);
    }
  }
  
  private void btA()
  {
    int j = 1;
    if (bi.WU(com.tencent.mm.k.g.AT().getValue("SilentDownloadApkAtWiFi")) != 0) {}
    for (int i = 1;; i = 0)
    {
      if ((com.tencent.mm.sdk.platformtools.e.bxm & 0x1) != 0)
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsAboutSystemUI", "channel pack, not silence download.");
        i = 1;
      }
      if (i == 0) {
        break;
      }
      this.eOE.bw("settings_silence_update_mode", true);
      return;
    }
    this.eOE.bw("settings_silence_update_mode", false);
    Preference localPreference;
    if ((((Integer)com.tencent.mm.kernel.g.Ei().DT().get(7, Integer.valueOf(0))).intValue() & 0x1000000) == 0)
    {
      i = j;
      localPreference = this.eOE.ZZ("settings_silence_update_mode");
      if (i == 0) {
        break label142;
      }
    }
    label142:
    for (i = a.i.settings_silence_update_mode_wifi;; i = a.i.settings_silence_update_mode_none)
    {
      localPreference.setSummary(getString(i));
      this.eOE.notifyDataSetChanged();
      return;
      i = 0;
      break;
    }
  }
  
  private void btB()
  {
    int i = bi.getInt(com.tencent.mm.k.g.AT().getValue("SIGHTAutoLoadNetwork"), 1);
    int j = bi.a((Integer)com.tencent.mm.kernel.g.Ei().DT().get(327686, null), i);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsAboutSystemUI", "auto getSightViewSummary %d, %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
    if (this.mRh == -1) {
      this.mRh = j;
    }
    this.mRi = j;
    if (3 == j) {
      i = a.i.settings_sns_sight_auto_download_never;
    }
    for (;;)
    {
      Preference localPreference = this.eOE.ZZ("settings_sns_sight_auto_download");
      if ((localPreference != null) && (i != 0)) {
        localPreference.setSummary(getString(i));
      }
      this.eOE.notifyDataSetChanged();
      return;
      if (2 == j) {
        i = a.i.settings_sns_sight_auto_download_wifi;
      } else {
        i = a.i.settings_sns_sight_auto_download_always;
      }
    }
  }
  
  private void bty()
  {
    int j = 0;
    IconPreference localIconPreference = (IconPreference)this.eOE.ZZ("settings_plugins");
    if (bi.a((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(-2046825377, null), false))
    {
      localIconPreference.Er(0);
      localIconPreference.dk(getString(a.i.app_new), a.e.new_tips_bg);
      if (!com.tencent.mm.s.c.Cp().aU(262158, 266266)) {
        break label127;
      }
      i = 0;
      label75:
      localIconPreference.Et(i);
      com.tencent.mm.plugin.ab.a.bjk();
      if (!com.tencent.mm.ao.c.ig(com.tencent.mm.ao.b.ebm)) {
        break label133;
      }
    }
    label127:
    label133:
    for (int i = j;; i = 8)
    {
      localIconPreference.Et(i);
      this.eOE.notifyDataSetChanged();
      return;
      localIconPreference.Er(8);
      localIconPreference.dk("", -1);
      break;
      i = 8;
      break label75;
    }
  }
  
  private boolean btz()
  {
    startActivity(new Intent(this, SettingsFontUI.class));
    return true;
  }
  
  private void gT(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      getPackageManager().setComponentEnabledSetting(new ComponentName(ad.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 1, 1);
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sQG, Integer.valueOf(1));
      return;
    }
    getPackageManager().setComponentEnabledSetting(new ComponentName(ad.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 2, 1);
    com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sQG, Integer.valueOf(2));
  }
  
  private void hz(boolean paramBoolean)
  {
    CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.eOE.ZZ("settings_nfc_switch");
    ad.getContext().getSharedPreferences(ad.chY(), 0).edit().putBoolean("settings_nfc_switch", paramBoolean).commit();
    localCheckBoxPreference.qpJ = paramBoolean;
    this.eOE.notifyDataSetChanged();
  }
  
  public final int Ys()
  {
    return a.k.settings_pref_system;
  }
  
  public final boolean a(final f paramf, Preference paramPreference)
  {
    boolean bool2 = false;
    paramf = paramPreference.mKey;
    if (paramf.equals("settings_landscape_mode")) {
      if (this.duR.getBoolean("settings_landscape_mode", false)) {
        setRequestedOrientation(-1);
      }
    }
    int i;
    int j;
    do
    {
      for (;;)
      {
        return true;
        setRequestedOrientation(1);
        return true;
        if (!paramf.equals("settings_voicerecorder_mode")) {
          break;
        }
        if (q.deN.dbG == 1) {}
        for (bool1 = false; !this.duR.getBoolean("settings_voicerecorder_mode", bool1); bool1 = true)
        {
          com.tencent.mm.ui.base.h.a(this.mController.tml, a.i.settings_voicerecorder_mode_change_to_amr, a.i.app_tip, new SettingsAboutSystemUI.8(this), new SettingsAboutSystemUI.9(this));
          return true;
        }
      }
      if (paramf.equals("settings_nfc_switch"))
      {
        paramf = NfcAdapter.getDefaultAdapter(this);
        if (paramf == null)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsAboutSystemUI", "lo-nfc-goTosetNfcSwitch phone not suppot nfc");
          return true;
        }
        i = ((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sQG, Integer.valueOf(0))).intValue();
        j = ((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sQH, Integer.valueOf(0))).intValue();
        if (((i == 2) || ((i == 0) && (j != 1))) && (!paramf.isEnabled()) && (this.duR.getBoolean("settings_nfc_switch", false)))
        {
          hz(false);
          com.tencent.mm.ui.base.h.a(this.mController.tml, getString(a.i.nfc_off_tips), "", getString(a.i.nfc_open_title), getString(a.i.app_cancel), new SettingsAboutSystemUI.6(this), new SettingsAboutSystemUI.7(this));
          return true;
        }
        gT(this.duR.getBoolean("settings_nfc_switch", false));
        return true;
      }
      if (paramf.equals("settings_voice_play_mode"))
      {
        boolean bool3 = ((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(26, Boolean.valueOf(false))).booleanValue();
        if (!bool3) {}
        for (bool1 = true;; bool1 = false)
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsAboutSystemUI", "set voice mode from %B to %B", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool1) });
          paramf = com.tencent.mm.kernel.g.Ei().DT();
          bool1 = bool2;
          if (!bool3) {
            bool1 = true;
          }
          paramf.set(26, Boolean.valueOf(bool1));
          return true;
        }
      }
      if (!paramf.equals("settings_enter_button_send")) {
        break;
      }
      paramf = (CheckBoxPreference)this.eOE.ZZ("settings_enter_button_send");
    } while (paramf == null);
    boolean bool1 = paramf.isChecked();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsAboutSystemUI", "set enter button send : %s", new Object[] { Boolean.valueOf(bool1) });
    com.tencent.mm.kernel.g.Ei().DT().set(66832, Boolean.valueOf(bool1));
    return true;
    View localView;
    Object localObject;
    if (paramf.equals("settings_sns_sight_auto_download"))
    {
      paramPreference = new c.a(this.mController.tml);
      paramPreference.Gu(a.i.app_cancel);
      paramPreference.Gq(a.i.settings_sns_sight_auto_download_tips);
      localView = View.inflate(this.mController.tml, a.g.mm_alert_switch, null);
      paramf = (LinearLayout)localView.findViewById(a.f.switcher_container);
      i = bi.getInt(com.tencent.mm.k.g.AT().getValue("SIGHTAutoLoadNetwork"), 1);
      i = bi.a((Integer)com.tencent.mm.kernel.g.Ei().DT().get(327686, null), i);
      localObject = new SettingsAboutSystemUI.2(this, paramf, i);
      j = a.i.settings_sns_sight_auto_download_always;
      if (1 == i)
      {
        bool1 = true;
        a(paramf, j, 1, bool1, (View.OnClickListener)localObject);
        j = a.i.settings_sns_sight_auto_download_wifi;
        if (2 != i) {
          break label729;
        }
        bool1 = true;
        label653:
        a(paramf, j, 2, bool1, (View.OnClickListener)localObject);
        j = a.i.settings_sns_sight_auto_download_never;
        if (3 != i) {
          break label735;
        }
      }
      label729:
      label735:
      for (bool1 = true;; bool1 = false)
      {
        a(paramf, j, 3, bool1, (View.OnClickListener)localObject);
        paramPreference.dR(localView);
        paramPreference = paramPreference.anj();
        paramf.setTag(paramPreference);
        paramPreference.show();
        addDialog(paramPreference);
        this.mRj = true;
        return true;
        bool1 = false;
        break;
        bool1 = false;
        break label653;
      }
    }
    if (paramf.equals("settings_silence_update_mode"))
    {
      paramPreference = new c.a(this.mController.tml);
      paramPreference.Gu(a.i.app_cancel);
      paramPreference.Gq(a.i.settings_silence_update_mode);
      localView = View.inflate(this.mController.tml, a.g.mm_alert_switch, null);
      paramf = (LinearLayout)localView.findViewById(a.f.switcher_container);
      localObject = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          int k = 0;
          int i = 0;
          Object localObject;
          while (i < paramf.getChildCount())
          {
            localObject = (TextView)paramf.getChildAt(i);
            if (a.f.tips_tv != ((TextView)localObject).getId()) {
              ((TextView)localObject).setCompoundDrawablesWithIntrinsicBounds(a.h.radio_off, 0, 0, 0);
            }
            i += 1;
          }
          ((TextView)paramAnonymousView).setCompoundDrawablesWithIntrinsicBounds(a.h.radio_on, 0, 0, 0);
          int m = ((Integer)com.tencent.mm.kernel.g.Ei().DT().get(7, Integer.valueOf(0))).intValue();
          int n = ((Integer)paramAnonymousView.getTag()).intValue();
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsAboutSystemUI", "settings_silence_update_mode choice: %d", new Object[] { Integer.valueOf(n) });
          if (n == 0)
          {
            i = 1;
            if ((m & 0x1000000) != 0) {
              break label153;
            }
          }
          label153:
          for (int j = 1;; j = 0)
          {
            if (i != j) {
              break label158;
            }
            return;
            i = 0;
            break;
          }
          label158:
          i = k;
          if (n == 0) {
            i = 1;
          }
          if (i != 0)
          {
            j = 0xFEFFFFFF & m;
            if (i != 0) {
              break label281;
            }
          }
          label281:
          for (i = 1;; i = 2)
          {
            com.tencent.mm.kernel.g.Ei().DT().set(7, Integer.valueOf(j));
            localObject = new xt();
            ((xt)localObject).rDz = 35;
            ((xt)localObject).rDA = i;
            ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(23, (com.tencent.mm.bk.a)localObject));
            com.tencent.mm.plugin.setting.b.ezo.vl();
            paramAnonymousView.post(new SettingsAboutSystemUI.10.1(this));
            return;
            j = m | 0x1000000;
            break;
          }
        }
      };
      if ((((Integer)com.tencent.mm.kernel.g.Ei().DT().get(7, Integer.valueOf(0))).intValue() & 0x1000000) == 0)
      {
        bool1 = true;
        a(paramf, a.i.settings_silence_update_mode_wifi, 0, bool1, (View.OnClickListener)localObject);
        i = a.i.settings_silence_update_mode_none;
        if (bool1) {
          break label920;
        }
      }
      label920:
      for (bool1 = true;; bool1 = false)
      {
        a(paramf, i, 1, bool1, (View.OnClickListener)localObject);
        paramPreference.dR(localView);
        paramPreference = paramPreference.anj();
        paramf.setTag(paramPreference);
        paramPreference.show();
        addDialog(paramPreference);
        return true;
        bool1 = false;
        break;
      }
    }
    if (paramf.equals("settings_language"))
    {
      startActivity(new Intent(this.mController.tml, SettingsLanguageUI.class));
      return true;
    }
    if (paramf.equals("settings_text_size")) {
      return btz();
    }
    if (paramf.equals("settings_chatting_bg"))
    {
      paramf = new Intent();
      paramf.setClass(this, SettingsChattingBackgroundUI.class);
      this.mController.tml.startActivity(paramf);
      return true;
    }
    if (paramf.equals("settings_manage_findmoreui"))
    {
      paramf = new Intent();
      paramf.setClass(this, SettingsManageFindMoreUI.class);
      startActivity(paramf);
      return true;
    }
    if (paramf.equals("settings_plugins"))
    {
      com.tencent.mm.kernel.g.Ei().DT().set(-2046825377, Boolean.valueOf(false));
      paramf = new Intent();
      paramf.setClass(this, SettingsPluginsUI.class);
      startActivity(paramf);
      com.tencent.mm.s.c.Cp().aV(262158, 266266);
      return true;
    }
    if (paramf.equals("settings_reset"))
    {
      com.tencent.mm.ui.base.h.a(this.mController.tml, getResources().getString(a.i.settings_reset_warning), "", getString(a.i.app_clear), getString(a.i.app_cancel), new SettingsAboutSystemUI.5(this), null);
      return true;
    }
    if (paramf.equals("settings_emoji_manager"))
    {
      paramf = new Intent();
      paramf.putExtra("10931", 2);
      com.tencent.mm.bg.d.b(this.mController.tml, "emoji", ".ui.EmojiMineUI", paramf);
      return true;
    }
    if (paramf.equals("settngs_clean"))
    {
      if (!com.tencent.mm.kernel.g.Ei().isSDCardAvailable())
      {
        com.tencent.mm.ui.base.s.gH(this.mController.tml);
        return true;
      }
      com.tencent.mm.bg.d.b(this.mController.tml, "clean", ".ui.CleanUI", new Intent());
      return true;
    }
    if (paramf.equals("settings_traffic_statistic"))
    {
      startActivity(new Intent(this, SettingsNetStatUI.class));
      return true;
    }
    if (paramf.equals("settings_text_size")) {
      return btz();
    }
    if (paramf.equals("settings_swipeback_mode"))
    {
      paramf = (CheckBoxPreference)paramPreference;
      bool1 = com.tencent.mm.compatible.i.a.zX();
      if (!bool1) {}
      for (i = a.i.settings_swipeback_mode_open_tips;; i = a.i.settings_swipeback_mode_close_tips)
      {
        com.tencent.mm.ui.base.h.a(this.mController.tml, getString(i), null, new SettingsAboutSystemUI.3(this), new SettingsAboutSystemUI.4(this, paramf, bool1));
        return true;
      }
    }
    if (paramf.equals("settings_take_photo")) {
      startActivity(new Intent(this, SettingsAboutCamera.class));
    }
    return false;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.settings_about_system);
    this.eOE = this.tCL;
    setBackBtn(new SettingsAboutSystemUI.1(this));
    f localf = this.eOE;
    if (!com.tencent.mm.compatible.util.d.fR(19)) {}
    for (boolean bool = true;; bool = false)
    {
      localf.bw("settings_swipeback_mode", bool);
      if (!com.tencent.mm.bg.d.QS("backup")) {
        this.eOE.bw("settings_bak_chat", true);
      }
      bty();
      this.eOE.bw("settings_traffic_statistic", com.tencent.mm.bg.d.cfH());
      if (af.eyg) {
        this.eOE.bw("settings_take_photo", true);
      }
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mRg = false;
    initView();
  }
  
  protected void onDestroy()
  {
    boolean bool2 = true;
    super.onDestroy();
    int i;
    com.tencent.mm.plugin.report.service.h localh;
    if (this.mRj)
    {
      i = this.mRi;
      if (this.mRh != this.mRi) {
        break label114;
      }
      bool1 = true;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsAboutSystemUI", "kvstat, autodownload sight change: %d, %b", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool1) });
      localh = com.tencent.mm.plugin.report.service.h.mEJ;
      i = this.mRi;
      if (this.mRh != this.mRi) {
        break label119;
      }
    }
    label114:
    label119:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      localh.h(11437, new Object[] { Integer.valueOf(1), Integer.valueOf(i), Boolean.valueOf(bool1) });
      return;
      bool1 = false;
      break;
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    Object localObject = (CheckBoxPreference)this.eOE.ZZ("settings_voice_play_mode");
    if (localObject != null)
    {
      ((CheckBoxPreference)localObject).qpJ = ((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(26, Boolean.valueOf(false))).booleanValue();
      ((Preference)localObject).tDr = false;
    }
    localObject = (CheckBoxPreference)this.eOE.ZZ("settings_enter_button_send");
    if (localObject != null)
    {
      ((CheckBoxPreference)localObject).qpJ = ((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(66832, Boolean.valueOf(false))).booleanValue();
      ((Preference)localObject).tDr = false;
    }
    localObject = (CheckBoxPreference)this.eOE.ZZ("settings_swipeback_mode");
    if (localObject != null)
    {
      ((CheckBoxPreference)localObject).qpJ = com.tencent.mm.compatible.i.a.zX();
      ((Preference)localObject).tDr = false;
    }
    localObject = this.eOE.ZZ("settings_language");
    if (localObject != null) {
      ((Preference)localObject).setSummary(w.h(this.mController.tml, a.b.language_setting, a.i.app_lang_sys));
    }
    bty();
    btB();
    btB();
    btA();
    localObject = NfcAdapter.getDefaultAdapter(this);
    CheckBoxPreference localCheckBoxPreference = (CheckBoxPreference)this.eOE.ZZ("settings_nfc_switch");
    if (localObject == null)
    {
      this.eOE.bw("settings_nfc_switch", true);
      return;
    }
    this.eOE.bw("settings_nfc_switch", false);
    localCheckBoxPreference.setSummary(bi.oV((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sQK, null)));
    if (this.mRg)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsAboutSystemUI", "lo-nfc-updateNfcOpenSwitch go setSystemNfc and back");
      if (((NfcAdapter)localObject).isEnabled())
      {
        gT(true);
        hz(true);
        return;
      }
    }
    int i = ((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sQG, Integer.valueOf(0))).intValue();
    if (i == 0) {
      if (((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sQH, Integer.valueOf(0))).intValue() == 1) {
        hz(true);
      }
    }
    for (;;)
    {
      this.eOE.notifyDataSetChanged();
      return;
      hz(false);
      continue;
      if (i == 1) {
        hz(true);
      } else {
        hz(false);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsAboutSystemUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */