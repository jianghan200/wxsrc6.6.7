package com.tencent.mm.plugin.wallet.pwd.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Message;
import com.tencent.mm.ab.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.bq;
import com.tencent.mm.g.b.a.j;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet_core.c.ae;
import com.tencent.mm.plugin.wallet_core.d.h;
import com.tencent.mm.plugin.wallet_core.model.z;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.l;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.sdk.platformtools.ag.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

@com.tencent.mm.ui.base.a(19)
public class WalletPasswordSettingUI
  extends MMPreference
  implements com.tencent.mm.ab.e
{
  private boolean dlV;
  private f eOE;
  private Dialog eXG;
  private com.tencent.mm.sdk.platformtools.ag handler = new com.tencent.mm.sdk.platformtools.ag(new ag.a()
  {
    public final boolean handleMessage(Message paramAnonymousMessage)
    {
      switch (paramAnonymousMessage.what)
      {
      }
      for (;;)
      {
        return false;
        WalletPasswordSettingUI.a(WalletPasswordSettingUI.this);
        continue;
        WalletPasswordSettingUI.b(WalletPasswordSettingUI.this);
      }
    }
  });
  com.tencent.mm.sdk.b.c pdx = new WalletPasswordSettingUI.2(this);
  CheckBoxPreference phV;
  private IconPreference phW;
  private Preference phX;
  private String phY;
  private String phZ;
  private String pia;
  private z pib;
  private boolean pic = false;
  private int pie = 0;
  
  private void bOc()
  {
    com.tencent.mm.kernel.g.Ek();
    String str1 = (String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sYH, "");
    com.tencent.mm.kernel.g.Ek();
    String str2 = (String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sYI, "");
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletPasswordSettingUI", "updateUnRegPref unreg_title %s unreg_url %s", new Object[] { str1, str2 });
    if ((!bi.oW(str1)) && (!bi.oW(str2)))
    {
      this.eOE.bw("wallet_password_setting_un_reg", false);
      return;
    }
    this.eOE.bw("wallet_password_setting_un_reg", true);
  }
  
  private void fc(String paramString1, String paramString2)
  {
    this.phW.setTitle(paramString1);
    if (!bi.oW(paramString2))
    {
      this.eOE.bw("wallet_open_auto_pay", false);
      return;
    }
    this.eOE.bw("wallet_open_auto_pay", true);
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletPasswordSettingUI", "deduct_url is null");
  }
  
  private void jq(boolean paramBoolean)
  {
    this.duR.edit().putBoolean("wallet_fingerprint_switch", paramBoolean).commit();
    this.phV.qpJ = paramBoolean;
    this.eOE.notifyDataSetChanged();
  }
  
  private void jr(boolean paramBoolean)
  {
    com.tencent.mm.plugin.wallet.pwd.a.c localc = new com.tencent.mm.plugin.wallet.pwd.a.c();
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(localc, 0);
    this.pic = true;
    if (paramBoolean) {
      this.eXG = com.tencent.mm.wallet_core.ui.g.a(this, false, new WalletPasswordSettingUI.9(this));
    }
  }
  
  public final int Ys()
  {
    return -1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paraml instanceof com.tencent.mm.plugin.wallet.pwd.a.c))
      {
        bOg();
        paramString = (com.tencent.mm.plugin.wallet.pwd.a.c)paraml;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletPasswordSettingUI", "isShowDeduct=" + paramString.phg);
        this.phZ = paramString.phk;
        if (paramString.phg == 1)
        {
          this.phY = paramString.phh;
          fc(bi.aG(paramString.phj, getString(a.i.wallet_pay_deduct_checkbox_label)), paramString.phh);
          bOc();
          if (this.eXG != null) {
            this.eXG.dismiss();
          }
        }
      }
    }
    while (!(paraml instanceof ae))
    {
      do
      {
        for (;;)
        {
          return;
          this.eOE.bw("wallet_open_auto_pay", true);
        }
      } while (!(paraml instanceof ae));
      this.pia = ((ae)paraml).pjK;
      this.pie = ((ae)paraml).pjP;
      if (this.pie == 0)
      {
        this.eOE.bw("wallet_delay_transfer_date", true);
        return;
      }
      if (!bi.oW(this.pia)) {
        this.phX.setTitle(this.pia);
      }
      for (;;)
      {
        this.eOE.bw("wallet_delay_transfer_date", false);
        return;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletPasswordSettingUI", "use hardcode wording");
      }
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletPasswordSettingUI", "net error, use hardcode wording");
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    if ("wallet_modify_password".equals(paramPreference.mKey))
    {
      bOe();
      com.tencent.mm.wallet_core.ui.e.He(24);
      return true;
    }
    if ("wallet_forget_password".equals(paramPreference.mKey))
    {
      com.tencent.mm.kernel.g.Ek();
      paramf = (String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sTf, "");
      if (!bi.oW(paramf))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletPasswordSettingUI", "jump to forget_url %s", new Object[] { paramf });
        paramPreference = new Intent();
        paramPreference.putExtra("rawUrl", paramf);
        paramPreference.putExtra("showShare", false);
        d.b(this, "webview", ".ui.tools.WebViewUI", paramPreference);
        paramf = new j();
        paramf.cip = 2L;
        paramf.ciq = 2L;
        paramf.RD();
        return true;
      }
      bOf();
      paramf = new j();
      paramf.cip = 2L;
      paramf.ciq = 1L;
      paramf.RD();
      com.tencent.mm.wallet_core.ui.e.He(25);
      return true;
    }
    if ("wallet_realname_verify".equals(paramPreference.mKey))
    {
      if (com.tencent.mm.plugin.wallet_core.model.o.bOW().bPs()) {
        if (!bi.oW(this.phZ))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletPasswordSettingUI", "jump to mRealnameUrl");
          paramf = new Intent();
          paramf.putExtra("rawUrl", this.phZ);
          paramf.putExtra("showShare", false);
          d.b(this, "webview", ".ui.tools.WebViewUI", paramf);
        }
      }
      for (;;)
      {
        return true;
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletPasswordSettingUI", "mRealnameUrl is null");
        continue;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletPasswordSettingUI", "go to RealNameVerifyProcess");
        paramf = new Bundle();
        paramf.putInt("real_name_verify_mode", 0);
        paramf.putString("realname_verify_process_jump_plugin", "wallet");
        paramf.putString("realname_verify_process_jump_activity", ".pwd.ui.WalletPasswordSettingUI");
        com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet_core.id_verify.a.class, paramf, new WalletPasswordSettingUI.4(this));
      }
    }
    if ("wallet_fingerprint_switch".equals(paramPreference.mKey))
    {
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sQo, Boolean.valueOf(true));
      if (this.phV.isChecked()) {
        if (this.dlV)
        {
          com.tencent.mm.plugin.soter.c.a.xO(2);
          paramf = (k)com.tencent.mm.kernel.g.l(k.class);
          if ((paramf == null) || (!paramf.aNb())) {
            break label448;
          }
          paramf = new Bundle();
          paramf.putInt("open_scene", 1);
          com.tencent.mm.wallet_core.a.b(this, "FingerprintAuth", paramf);
        }
      }
      for (;;)
      {
        return true;
        com.tencent.mm.plugin.soter.c.a.xO(1);
        break;
        label448:
        this.handler.obtainMessage(2).sendToTarget();
        continue;
        this.handler.obtainMessage(1).sendToTarget();
      }
    }
    if ("wallet_open_auto_pay".equals(paramPreference.mKey))
    {
      if (!bi.oW(this.phY))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletPasswordSettingUI", "mDeductUrl is not null,jump!");
        paramf = new Intent();
        paramf.putExtra("rawUrl", this.phY);
        paramf.putExtra("showShare", false);
        d.b(this, "webview", ".ui.tools.WebViewUI", paramf);
        this.phW.Es(8);
        return true;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletPasswordSettingUI", "mDeductUrl is null");
    }
    if ("wallet_digitalcert".equals(paramPreference.mKey))
    {
      if (!this.pic)
      {
        paramf = new com.tencent.mm.plugin.wallet.pwd.a.c();
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Eh().dpP.a(paramf, 0);
      }
      d.b(this, "wallet", ".pwd.ui.WalletDigitalCertUI", new Intent());
      return true;
    }
    if ("wallet_delay_transfer_date".equals(paramPreference.mKey))
    {
      startActivity(new Intent(this, WalletDelayTransferSettingUI.class));
      return true;
    }
    if ("wallet_password_setting_un_reg".equals(paramPreference.mKey))
    {
      com.tencent.mm.kernel.g.Ek();
      paramf = (String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sYI, "");
      paramPreference = new Intent();
      paramPreference.putExtra("rawUrl", paramf);
      paramPreference.putExtra("showShare", false);
      d.b(this, "webview", ".ui.tools.WebViewUI", paramPreference);
    }
    return false;
  }
  
  public int bOd()
  {
    return a.l.wallet_password_setting_pref;
  }
  
  public void bOe()
  {
    com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.pwd.b.class, null, null);
  }
  
  public void bOf()
  {
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("key_is_paymanager", true);
    com.tencent.mm.wallet_core.a.a(this, com.tencent.mm.plugin.wallet.pwd.a.class, localBundle, null);
  }
  
  public void bOg()
  {
    label165:
    Object localObject;
    if ((com.tencent.mm.plugin.wallet_core.model.o.bOW().bPp()) || (com.tencent.mm.plugin.wallet_core.model.o.bOW().bPt()))
    {
      this.eOE.bw("wallet_modify_password", true);
      this.eOE.bw("wallet_forget_password", true);
      this.eOE.bw("wallet_fingerprint_switch", true);
      this.eOE.bw("wallet_realname_verify", false);
      this.eOE.ZZ("wallet_realname_verify").setSummary(a.i.wallet_password_setting_ui_go_realname_verify_now);
      this.eOE.bw("wallet_digitalcert", true);
      if (!d.QS("fingerprint")) {
        break label501;
      }
      if (!com.tencent.mm.plugin.wallet.b.a.bOh()) {
        break label486;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletPasswordSettingUI", "isSupportFingeprint is true");
      p.bNp();
      if ((p.bNq() == null) || (!((k)com.tencent.mm.kernel.g.l(k.class)).aNa())) {
        break label455;
      }
      this.phV.qpJ = true;
      this.phV.tDr = false;
      this.phV.setSummary(a.i.wallet_password_setting_ui_fingerprint_off_summary);
      this.eOE.bw("wallet_fingerprint_switch", false);
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sQm, Boolean.valueOf(true));
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sQn, Boolean.valueOf(true));
      com.tencent.mm.kernel.g.Ek();
      localObject = com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sQo, Boolean.valueOf(false));
      if (localObject == null) {
        break label541;
      }
    }
    label292:
    label455:
    label486:
    label501:
    label524:
    label541:
    for (boolean bool = ((Boolean)localObject).booleanValue();; bool = false)
    {
      long l;
      int i;
      if (!bool)
      {
        this.phV.cq(getString(a.i.app_new), a.e.unread_count_shape);
        this.phV.zi(0);
        com.tencent.mm.kernel.g.Ek();
        l = ((Long)com.tencent.mm.kernel.g.Ei().DT().get(147457, Long.valueOf(0L))).longValue();
        i = a.i.wallet_delay_transfer_setting_realtime_text;
        if ((0x10 & l) == 0L) {
          break label524;
        }
        i = a.i.wallet_delay_transfer_setting_2h_text;
      }
      for (;;)
      {
        this.eOE.ZZ("wallet_delay_transfer_date").setSummary(i);
        this.eOE.notifyDataSetChanged();
        return;
        if (com.tencent.mm.plugin.wallet_core.model.o.bOW().bPs())
        {
          this.eOE.bw("wallet_modify_password", false);
          this.eOE.bw("wallet_forget_password", false);
          this.eOE.bw("wallet_fingerprint_switch", false);
          this.eOE.bw("wallet_realname_verify", false);
          this.eOE.ZZ("wallet_realname_verify").setSummary(a.i.wallet_password_setting_ui_realname_verify_done);
          break;
        }
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletPasswordSettingUI", "unknow reg state");
        break;
        this.phV.qpJ = false;
        this.phV.tDr = false;
        break label165;
        this.phV.zi(8);
        break label292;
        this.eOE.bw("wallet_fingerprint_switch", true);
        break label292;
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletPasswordSettingUI", "plugin fingerprinthad not been installed");
        this.eOE.bw("wallet_fingerprint_switch", true);
        break label292;
        if ((l & 0x20) != 0L) {
          i = a.i.wallet_delay_transfer_setting_24h_text;
        }
      }
    }
  }
  
  protected final void initView()
  {
    if (q.GS()) {}
    for (String str = getString(a.i.wallet_password_setting_ui_title_payu);; str = getString(a.i.wallet_password_setting_ui_title))
    {
      setMMTitle(str);
      com.tencent.mm.wallet_core.ui.e.cDN();
      this.eOE = this.tCL;
      this.eOE.addPreferencesFromResource(bOd());
      this.phW = ((IconPreference)this.eOE.ZZ("wallet_open_auto_pay"));
      this.phX = this.eOE.ZZ("wallet_delay_transfer_date");
      com.tencent.mm.kernel.g.Ek();
      if (!((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sSW, Boolean.valueOf(false))).booleanValue())
      {
        this.phW.dl("new", a.e.unread_count_shape);
        this.phW.Es(0);
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sSW, Boolean.valueOf(true));
      }
      this.phV = ((CheckBoxPreference)this.eOE.ZZ("wallet_fingerprint_switch"));
      bOg();
      this.eOE.bw("nfc_idpay", true);
      this.eOE.bw("wallet_open_auto_pay", true);
      bOc();
      setBackBtn(new WalletPasswordSettingUI.3(this));
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(385, this);
    com.tencent.mm.sdk.b.a.sFg.b(this.pdx);
    this.dlV = getIntent().getBooleanExtra("key_is_from_system", false);
    if (this.dlV)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletPasswordSettingUI", "hy: enter password setting from system setting");
      ((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.walletlock.a.b.class)).a(this, null);
    }
    initView();
    label165:
    Cursor localCursor;
    if (com.tencent.mm.plugin.wallet.pwd.a.c.bFZ())
    {
      jr(false);
      com.tencent.mm.kernel.g.Ek();
      this.pie = ((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sVo, Integer.valueOf(0))).intValue();
      com.tencent.mm.kernel.g.Ek();
      this.pia = ((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sVj, ""));
      if (bi.oW(this.pia))
      {
        ae.a(true, null);
        if (this.pie == 0) {
          this.eOE.bw("wallet_delay_transfer_date", true);
        }
      }
    }
    else
    {
      com.tencent.mm.kernel.g.Ek();
      this.phZ = ((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sTf, ""));
      paramBundle = com.tencent.mm.plugin.wallet_core.model.o.bOV();
      if (!bi.oW("wallet_open_auto_pay"))
      {
        localCursor = paramBundle.diF.b("select * from WalletPrefInfo where pref_key=?", new String[] { "wallet_open_auto_pay" }, 2);
        if (localCursor != null)
        {
          if (!localCursor.moveToFirst()) {
            break label447;
          }
          paramBundle = new z();
          paramBundle.d(localCursor);
        }
      }
    }
    for (;;)
    {
      localCursor.close();
      for (;;)
      {
        this.pib = paramBundle;
        if ((this.pib == null) || (this.pib.field_is_show != 1) || (bi.oW(this.pib.field_pref_url))) {
          break label359;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletPasswordSettingUI", "deduct info from cache is not null");
        this.phY = this.pib.field_pref_url;
        fc(this.pib.field_pref_title, this.pib.field_pref_url);
        break;
        paramBundle = null;
      }
      label359:
      if (this.pib == null)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletPasswordSettingUI", "deduct info from cache is null");
        break;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletPasswordSettingUI", "mOpenAutoPayPrefInfo.field_is_show = " + this.pib.field_is_show + " and mOpenAutoPayPrefInfo.field_pref_url is null?" + bi.oW(this.pib.field_pref_url));
      break;
      this.phX.setTitle(this.pia);
      ae.a(false, null);
      break label165;
      label447:
      paramBundle = null;
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    com.tencent.mm.sdk.b.a.sFg.c(this.pdx);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(385, this);
  }
  
  protected void onResume()
  {
    super.onResume();
    if (((com.tencent.mm.plugin.walletlock.a.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.walletlock.a.b.class)).bRq())
    {
      finish();
      return;
    }
    bOg();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/ui/WalletPasswordSettingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */