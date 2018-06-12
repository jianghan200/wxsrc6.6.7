package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.ay;
import com.tencent.mm.g.a.ay.a;
import com.tencent.mm.g.a.nq;
import com.tencent.mm.g.a.nq.b;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.c;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI;
import com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI;
import com.tencent.mm.plugin.setting.a.e;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.a.k;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.s.c;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.IconSwitchKeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.PluginTextPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

public class SettingsAccountInfoUI
  extends MMPreference
  implements m.b
{
  private f eOE;
  private boolean mRA;
  private SparseIntArray mRB = new SparseIntArray();
  private View mRx;
  private TextView mRy;
  private EditText mRz;
  
  public SettingsAccountInfoUI()
  {
    this.mRB.put(0, a.i.settings_confirm_email_success_tip);
    this.mRB.put(-82, a.i.setting_unbind_qq_err_one_left);
    this.mRB.put(-83, a.i.setting_unbind_qq_err_has_unbind);
    this.mRB.put(-84, a.i.setting_unbind_qq_err_hasbinded);
    this.mRB.put(-85, a.i.setting_unbind_email_err_bindedbyother);
    this.mRB.put(-86, a.i.setting_unbind_qq_err_qmail);
  }
  
  private void btC()
  {
    Preference localPreference = this.eOE.ZZ("settings_username");
    String str = q.GG();
    if (bi.oW(str))
    {
      str = q.GF();
      if (ab.XT(str))
      {
        localPreference.setSummary(getString(a.i.settings_notset));
        return;
      }
      localPreference.setSummary(str);
      return;
    }
    localPreference.setSummary(str);
  }
  
  private void btD()
  {
    if (this.eOE.ZZ("settings_manage_login_device") == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SettingsAccountInfoUI", "safedevicesate preference is null");
      return;
    }
    this.eOE.bw("settings_manage_login_device", false);
  }
  
  private void btE()
  {
    IconSwitchKeyValuePreference localIconSwitchKeyValuePreference = (IconSwitchKeyValuePreference)this.eOE.ZZ("settings_mobile");
    if (localIconSwitchKeyValuePreference == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SettingsAccountInfoUI", "updateMobile Preference null");
      return;
    }
    String str = (String)com.tencent.mm.kernel.g.Ei().DT().get(6, null);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsAccountInfoUI", "mobile :" + str);
    if ((str == null) || (str.length() <= 0))
    {
      localIconSwitchKeyValuePreference.setSummary(getString(a.i.settings_bind_qq_unbind));
      localIconSwitchKeyValuePreference.Ey(0);
      return;
    }
    localIconSwitchKeyValuePreference.setSummary(str);
    localIconSwitchKeyValuePreference.Ey(1);
  }
  
  private void btF()
  {
    boolean bool = true;
    Object localObject = new ay();
    com.tencent.mm.sdk.b.a.sFg.m((b)localObject);
    if ((((ay)localObject).bIt.bIu) && (((ay)localObject).bIt.bIv) && (((ay)localObject).bIt.bIw)) {}
    for (int i = 1;; i = 0)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsAccountInfoUI", "check is support soter, isSupportSoter: %b, isSupportFP: %b, isSystemHasFPEnrolled: %b", new Object[] { Boolean.valueOf(((ay)localObject).bIt.bIu), Boolean.valueOf(((ay)localObject).bIt.bIv), Boolean.valueOf(((ay)localObject).bIt.bIw) });
      localObject = this.eOE;
      if (i == 0) {}
      for (;;)
      {
        ((f)localObject).bw("settings_fingerprint_title", bool);
        return;
        bool = false;
      }
    }
  }
  
  public final int Ys()
  {
    return a.k.settings_pref_account_info;
  }
  
  public final boolean Yy()
  {
    return true;
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    btC();
    btE();
    btD();
    btF();
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    paramf = paramPreference.mKey;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsAccountInfoUI", paramf + " item has been clicked!");
    q.GF();
    if (bi.oW(paramf)) {
      return false;
    }
    if ((paramf.equals("settings_username")) && (bi.oW(q.GG())) && (ab.XU(q.GF()))) {
      L(SettingsAliasUI.class);
    }
    if (paramf.equals("settings_mobile"))
    {
      paramf = new Intent(this, BindMContactIntroUI.class);
      paramf.putExtra("key_upload_scene", 4);
      MMWizardActivity.D(this, paramf);
      return true;
    }
    if (paramf.equals("settings_about_vuser_about"))
    {
      paramf = String.format("https://weixin.qq.com/cgi-bin/readtemplate?check=false&t=weixin_faq_verifyaccount&platform=android&lang=%s", new Object[] { w.chP() });
      bi.L(this.mController.tml, paramf);
    }
    for (;;)
    {
      return false;
      if (paramf.equals("settings_independent_password"))
      {
        paramf = new Intent();
        paramf.putExtra("kintent_hint", getString(a.i.settings_modify_password_tip));
        a(RegByMobileSetPwdUI.class, paramf);
      }
      else if (paramf.equals("settings_manage_login_device"))
      {
        d.A(this, "account", ".security.ui.MySafeDeviceListUI");
      }
      else if (paramf.equals("settings_security_center"))
      {
        paramf = getString(a.i.wechat_securiy_center_path);
        paramf = paramf + w.chP();
        paramPreference = this.mController.tml;
        Intent localIntent = new Intent();
        localIntent.putExtra("rawUrl", paramf);
        localIntent.putExtra("showShare", true);
        localIntent.putExtra("show_bottom", false);
        localIntent.putExtra("needRedirect", false);
        localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.qWa);
        localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.qVX);
        d.b(paramPreference, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
      }
      else if (paramf.equals("settings_voiceprint_title"))
      {
        if ((bi.getInt(com.tencent.mm.k.g.AT().getValue("VoiceprintEntry"), 0) == 1) && ((com.tencent.mm.kernel.g.Ei().DT().getInt(40, 0) & 0x20000) == 0))
        {
          com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sPs, Boolean.valueOf(false));
          ((IconPreference)this.eOE.ZZ("settings_voiceprint_title")).Er(8);
          this.eOE.notifyDataSetChanged();
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsAccountInfoUI", "unset setting account info new show");
        }
        d.A(this.mController.tml, "voiceprint", "com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI");
      }
      else if (paramf.equals("settings_facedect_title"))
      {
        paramf = new nq();
        paramf.bYK.context = this;
        com.tencent.mm.sdk.b.a.sFg.m(paramf);
        boolean bool = paramf.bYL.bYJ;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsAccountInfoUI", "hy: is start to face settings succ: %b", new Object[] { Boolean.valueOf(bool) });
        if (!bool) {
          com.tencent.mm.ui.base.s.makeText(this.mController.tml, getString(a.i.face_settings_not_support), 0).show();
        }
      }
      else if (paramf.equals("settings_trust_friend"))
      {
        L(SettingsTrustFriendUI.class);
      }
      else if (paramf.equals("settings_more_safe"))
      {
        c.Cp().c(aa.a.sZC, aa.a.sZD);
        L(SettingsMoreSafeUI.class);
      }
    }
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.settings_account_info);
    this.eOE = this.tCL;
    this.mRx = View.inflate(this, a.g.sendrequest_dialog, null);
    this.mRy = ((TextView)this.mRx.findViewById(a.f.sendrequest_tip));
    this.mRy.setText(getString(a.i.settings_independent_password_tip));
    this.mRz = ((EditText)this.mRx.findViewById(a.f.sendrequest_content));
    this.mRz.setInputType(129);
    if (bi.getInt(com.tencent.mm.k.g.AT().getValue("VoiceprintEntry"), 0) != 1) {
      this.eOE.bw("settings_voiceprint_title", true);
    }
    for (;;)
    {
      setBackBtn(new SettingsAccountInfoUI.1(this));
      return;
      if (!com.tencent.mm.kernel.g.Eg().Dx())
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SettingsAccountInfoUI", "update voiceprint dot, account not ready!");
        return;
      }
      IconPreference localIconPreference = (IconPreference)this.eOE.ZZ("settings_voiceprint_title");
      if ((((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sPs, Boolean.valueOf(true))).booleanValue()) && ((com.tencent.mm.kernel.g.Ei().DT().getInt(40, 0) & 0x20000) == 0))
      {
        localIconPreference.dk(getString(a.i.app_new), a.e.new_tips_bg);
        localIconPreference.Er(0);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsAccountInfoUI", "show voiceprint dot");
        this.eOE.notifyDataSetChanged();
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
    com.tencent.mm.kernel.g.Ei().DT().a(this);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    com.tencent.mm.kernel.g.Ei().DT().b(this);
  }
  
  protected void onResume()
  {
    btC();
    btE();
    this.mRA = false;
    Object localObject = (IconPreference)this.eOE.ZZ("settings_more_safe");
    SelfVuserPreference localSelfVuserPreference;
    Preference localPreference;
    if (c.Cp().b(aa.a.sZC, aa.a.sZD))
    {
      ((IconPreference)localObject).Et(0);
      btD();
      btF();
      this.eOE.bw("settings_facedect_title", true);
      localObject = (PluginTextPreference)this.eOE.ZZ("settings_about_vusertitle");
      localSelfVuserPreference = (SelfVuserPreference)this.eOE.ZZ("settings_about_vuserinfo");
      localPreference = this.eOE.ZZ("settings_about_vuser_about");
      int i = bi.f((Integer)com.tencent.mm.kernel.g.Ei().DT().get(66049, null));
      if (i == 0) {
        break label228;
      }
      ((PluginTextPreference)localObject).visibility = 8;
      ((PluginTextPreference)localObject).EA(a.i.contact_info_verify_user_title);
      if (am.a.dBt == null) {
        break label223;
      }
      localObject = BackwardSupportUtil.b.e(am.a.dBt.gX(i), 2.0F);
      label173:
      localSelfVuserPreference.drawable = new BitmapDrawable(getResources(), (Bitmap)localObject);
      localSelfVuserPreference.text = ((String)com.tencent.mm.kernel.g.Ei().DT().get(66050, null));
    }
    for (;;)
    {
      super.onResume();
      return;
      ((IconPreference)localObject).Et(8);
      break;
      label223:
      localObject = null;
      break label173;
      label228:
      this.eOE.c((Preference)localObject);
      this.eOE.c(localSelfVuserPreference);
      this.eOE.c(localPreference);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsAccountInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */