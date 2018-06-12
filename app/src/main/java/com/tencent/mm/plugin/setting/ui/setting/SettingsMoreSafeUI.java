package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.SparseIntArray;
import com.tencent.mm.g.a.ja;
import com.tencent.mm.g.a.y;
import com.tencent.mm.kernel.k;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.account.ui.FacebookAuthUI;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.a.k;
import com.tencent.mm.plugin.setting.b;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.s.c;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.b;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.IconSwitchKeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;
import junit.framework.Assert;

public class SettingsMoreSafeUI
  extends MMPreference
  implements com.tencent.mm.ab.e, m.b
{
  private ProgressDialog eHw;
  private f eOE;
  private SparseIntArray mRB = new SparseIntArray();
  private String mTa = null;
  private String mTb;
  
  public SettingsMoreSafeUI()
  {
    this.mRB.put(0, a.i.settings_confirm_email_success_tip);
    this.mRB.put(-82, a.i.setting_unbind_qq_err_one_left);
    this.mRB.put(-83, a.i.setting_unbind_qq_err_has_unbind);
    this.mRB.put(-84, a.i.setting_unbind_qq_err_hasbinded);
    this.mRB.put(-85, a.i.setting_unbind_email_err_bindedbyother);
    this.mRB.put(-86, a.i.setting_unbind_qq_err_qmail);
  }
  
  private void btL()
  {
    Preference localPreference = this.eOE.ZZ("settings_email_addr");
    Assert.assertNotNull(localPreference);
    String str = (String)com.tencent.mm.kernel.g.Ei().DT().get(5, null);
    Integer localInteger = (Integer)com.tencent.mm.kernel.g.Ei().DT().get(7, null);
    if ((localInteger != null) && ((localInteger.intValue() & 0x2) != 0))
    {
      localPreference.setSummary(a.i.settings_email_addr_verified);
      return;
    }
    if (str != null)
    {
      localPreference.setSummary(a.i.settings_email_addr_not_verified);
      return;
    }
    localPreference.setSummary(a.i.setting_unbind);
  }
  
  private void btM()
  {
    IconSwitchKeyValuePreference localIconSwitchKeyValuePreference = (IconSwitchKeyValuePreference)this.eOE.ZZ("settings_phone_security");
    if (localIconSwitchKeyValuePreference == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SettingsMoreSafeUI", "phone_security preference is null");
      return;
    }
    if (com.tencent.mm.sdk.platformtools.e.chv())
    {
      this.eOE.bw("settings_phone_security", true);
      return;
    }
    if (c.Cp().a(aa.a.sZC))
    {
      localIconSwitchKeyValuePreference.Et(0);
      return;
    }
    localIconSwitchKeyValuePreference.Et(8);
  }
  
  private void btN()
  {
    Preference localPreference = this.eOE.ZZ("settings_facebook");
    if (localPreference == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SettingsMoreSafeUI", "updateFacebook Preference null");
      return;
    }
    if (!q.He())
    {
      this.eOE.c(localPreference);
      return;
    }
    if (!q.Hg())
    {
      localPreference.setSummary(getString(a.i.settings_bind_qq_unbind));
      return;
    }
    localPreference.setSummary((String)com.tencent.mm.kernel.g.Ei().DT().get(65826, null));
  }
  
  private void btO()
  {
    Preference localPreference = this.eOE.ZZ("settings_bind_qq");
    if (localPreference == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SettingsMoreSafeUI", "updateUin Preference null");
      return;
    }
    int i = ((Integer)com.tencent.mm.kernel.g.Ei().DT().get(9, Integer.valueOf(0))).intValue();
    if (i == 0)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsMoreSafeUI", "updateUin 0 Preference");
      if (bi.getInt(com.tencent.mm.k.g.AT().getValue("BindQQSwitch"), 1) != 1)
      {
        this.eOE.bw("settings_uin", true);
        return;
      }
      localPreference.setSummary(a.i.settings_bind_qq_unbind);
      return;
    }
    localPreference.setSummary(new com.tencent.mm.a.o(i));
  }
  
  public final int Ys()
  {
    return a.k.settings_pref_more_safe;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsMoreSafeUI", "onSceneEnd " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString + "  " + paraml.getType());
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if ((paraml.getType() != 256) || (((paramInt1 != 0) || (paramInt2 != 0)) && (b.ezo.a(this, paramInt1, paramInt2, paramString)))) {
      return;
    }
    int i = this.mRB.get(paramInt2);
    paraml = getString(a.i.settings_confirm_email_fail_tip, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    paramString = paraml;
    if (i != 0) {}
    try
    {
      paramString = getString(i);
      com.tencent.mm.ui.base.h.bA(this.mController.tml, paramString);
      return;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SettingsMoreSafeUI", "try get string by id %d, fail:%s", new Object[] { Integer.valueOf(i), paramString.getMessage() });
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.SettingsMoreSafeUI", paramString, "", new Object[0]);
        paramString = paraml;
      }
    }
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    btO();
    btL();
    btN();
    btM();
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    int j = 0;
    paramf = paramPreference.mKey;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsMoreSafeUI", paramf + " item has been clicked!");
    if (bi.oW(paramf)) {}
    label460:
    do
    {
      do
      {
        do
        {
          return false;
          if (paramf.equals("settings_facebook"))
          {
            L(FacebookAuthUI.class);
            return false;
          }
          int i;
          if (paramf.equals("settings_email_addr"))
          {
            paramf = (Integer)com.tencent.mm.kernel.g.Ei().DT().get(7, null);
            i = j;
            if (paramf != null)
            {
              i = j;
              if ((paramf.intValue() & 0x2) != 0) {
                i = 1;
              }
            }
            paramf = (String)com.tencent.mm.kernel.g.Ei().DT().get(5, null);
            if ((i != 0) || (!bi.oW(paramf))) {
              startActivity(new Intent(this.mController.tml, SettingsModifyEmailAddrUI.class));
            }
            for (;;)
            {
              return true;
              if (this.eHw != null)
              {
                com.tencent.mm.sdk.platformtools.x.w("MicroMsg.SettingsMoreSafeUI", "do get email input, but tips dialog has not dismissed");
                this.eHw.dismiss();
                this.eHw = null;
              }
              paramf = bi.aG(com.tencent.mm.platformtools.x.cg(this.mController.tml), "");
              com.tencent.mm.ui.base.h.a(this.mController.tml, getString(a.i.settings_modify_email_addr), paramf, getString(a.i.settings_modify_email_addr_warning), 50, new h.b()
              {
                public final boolean p(CharSequence paramAnonymousCharSequence)
                {
                  if (!bi.WF(paramAnonymousCharSequence.toString()))
                  {
                    com.tencent.mm.ui.base.h.bA(SettingsMoreSafeUI.this.mController.tml, SettingsMoreSafeUI.this.getString(a.i.verify_email_err_tip));
                    return false;
                  }
                  b.ezo.vl();
                  paramAnonymousCharSequence = new com.tencent.mm.plugin.account.model.d(com.tencent.mm.plugin.account.model.d.eNX, paramAnonymousCharSequence.toString());
                  com.tencent.mm.kernel.g.DF().a(paramAnonymousCharSequence, 0);
                  SettingsMoreSafeUI localSettingsMoreSafeUI = SettingsMoreSafeUI.this;
                  ActionBarActivity localActionBarActivity = SettingsMoreSafeUI.this.mController.tml;
                  SettingsMoreSafeUI.this.getString(a.i.app_tip);
                  SettingsMoreSafeUI.a(localSettingsMoreSafeUI, com.tencent.mm.ui.base.h.a(localActionBarActivity, SettingsMoreSafeUI.this.getString(a.i.settings_binding), true, new SettingsMoreSafeUI.2.1(this, paramAnonymousCharSequence)));
                  return true;
                }
              });
            }
          }
          if (paramf.equals("settings_bind_qq"))
          {
            b.ezn.h(new Intent(), this);
            return true;
          }
          if (paramf.equals("settings_phone_security"))
          {
            Intent localIntent = new Intent();
            if (c.Cp().a(aa.a.sZC))
            {
              i = 1;
              c.Cp().b(aa.a.sZC, false);
              ((IconPreference)paramPreference).Et(8);
              j = ((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sZE, Integer.valueOf(0))).intValue();
              com.tencent.mm.plugin.report.service.h.mEJ.h(10939, new Object[] { Integer.valueOf(j) });
              if (!bi.br(this, "com.tencent.server.back.BackEngine")) {
                break label460;
              }
            }
            for (paramf = getString(a.i.qqpimsecure_jump_url, new Object[] { Integer.valueOf(j), Integer.valueOf(1), Integer.valueOf(i) });; paramf = getString(a.i.qqpimsecure_jump_url, new Object[] { Integer.valueOf(j), Integer.valueOf(0), Integer.valueOf(i) }))
            {
              localIntent.putExtra("rawUrl", paramf);
              localIntent.putExtra("show_bottom", false);
              localIntent.putExtra("showShare", false);
              com.tencent.mm.bg.d.b(this.mController.tml, "webview", ".ui.tools.WebViewUI", localIntent);
              return false;
              i = 0;
              break;
            }
          }
          if (!paramf.equals("settings_delete_account")) {
            break;
          }
          paramf = new Intent();
        } while (bi.oW(this.mTa));
        paramf.putExtra("rawUrl", this.mTa + "&lang=" + w.fD(this.mController.tml));
        paramf.putExtra("showShare", true);
        paramf.putExtra("hardcode_jspermission", JsapiPermissionWrapper.qWa);
        com.tencent.mm.bg.d.b(this.mController.tml, "webview", ".ui.tools.WebViewUI", paramf, 2);
        return false;
      } while (!paramf.equals("settings_dump_personal_data"));
      paramf = new Intent();
    } while (bi.oW(this.mTb));
    paramf.putExtra("rawUrl", this.mTb);
    paramf.putExtra("showShare", false);
    paramf.putExtra("needRedirect", false);
    paramf.putExtra("neverGetA8Key", true);
    paramf.putExtra("hardcode_jspermission", JsapiPermissionWrapper.qWa);
    com.tencent.mm.bg.d.b(this.mController.tml, "webview", ".ui.tools.WebViewUI", paramf);
    return false;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.settings_more_safe);
    this.eOE = this.tCL;
    if (((Integer)com.tencent.mm.kernel.g.Ei().DT().get(9, Integer.valueOf(0))).intValue() == 0) {
      if (bi.getInt(com.tencent.mm.k.g.AT().getValue("BindQQSwitch"), 1) != 1)
      {
        this.eOE.bw("settings_uin", true);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsMoreSafeUI", "summerqq BindQQSwitch off");
      }
    }
    for (;;)
    {
      this.mTa = com.tencent.mm.k.g.AT().getValue("CloseAcctUrl");
      setBackBtn(new SettingsMoreSafeUI.1(this));
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsMoreSafeUI", "summerqq BindQQSwitch bindqq");
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 2) {}
    switch (paramInt2)
    {
    default: 
      return;
    }
    if ((com.tencent.mm.kernel.g.DF() != null) && (com.tencent.mm.kernel.g.DF().dJs != null)) {
      com.tencent.mm.kernel.g.DF().dJs.bD(false);
    }
    b.ezo.vr();
    com.tencent.mm.kernel.g.Ei().DT().b(this);
    paramIntent = new ja();
    paramIntent.bSG.status = 0;
    paramIntent.bSG.aAk = 3;
    com.tencent.mm.sdk.b.a.sFg.m(paramIntent);
    paramIntent = new y();
    paramIntent.bHg.bHh = true;
    com.tencent.mm.sdk.b.a.sFg.m(paramIntent);
    af.Wq("show_whatsnew");
    k.j(this, true);
    paramIntent = new Intent();
    paramIntent.addFlags(67108864);
    paramIntent.putExtra("Intro_Switch", true);
    b.ezn.q(paramIntent, this.mController.tml);
    com.tencent.mm.platformtools.x.H(this, null);
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
    com.tencent.mm.kernel.g.DF().a(256, this);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    com.tencent.mm.kernel.g.DF().b(256, this);
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  protected void onResume()
  {
    btO();
    btL();
    btN();
    Object localObject = com.tencent.mm.k.g.AT().getValue("ShowExportUserDataEntry");
    if (!bi.oW((String)localObject)) {
      this.mTb = ((String)localObject);
    }
    for (;;)
    {
      btM();
      localObject = this.eOE.ZZ("settings_about_domainmail");
      this.eOE.c((Preference)localObject);
      if (bi.oW(this.mTa))
      {
        localObject = this.eOE.ZZ("settings_delete_account");
        this.eOE.c((Preference)localObject);
      }
      super.onResume();
      return;
      this.mTb = "";
      this.eOE.bw("settings_dump_personal_data", true);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsMoreSafeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */