package com.tencent.mm.plugin.wallet.pwd.ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.wallet_core.c.ae;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.plugin.wxpay.a.l;
import com.tencent.mm.protocal.c.auq;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;

public class WalletDelayTransferSettingUI
  extends MMPreference
  implements com.tencent.mm.ab.e
{
  private String cZH;
  private f eOE;
  private long hXx;
  private String mzm;
  private Preference pho;
  private Preference php;
  private Preference phq;
  private Preference phr;
  private String phs;
  private int pht = 0;
  
  private void bNY()
  {
    if ((this.pht == 1) && (!bi.oW(this.mzm)))
    {
      addIconOptionMenu(0, a.e.wallet_qanda_icon, new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          com.tencent.mm.wallet_core.ui.e.l(WalletDelayTransferSettingUI.this.mController.tml, WalletDelayTransferSettingUI.a(WalletDelayTransferSettingUI.this), false);
          return false;
        }
      });
      return;
    }
    this.mController.removeAllOptionMenu();
  }
  
  private void bNZ()
  {
    if (uL(16))
    {
      this.pho.setWidgetLayoutResource(a.g.mm_preference_radio_unchecked);
      this.php.setWidgetLayoutResource(a.g.mm_preference_radio_checked);
      this.phq.setWidgetLayoutResource(a.g.mm_preference_radio_unchecked);
      return;
    }
    if (uL(32))
    {
      this.pho.setWidgetLayoutResource(a.g.mm_preference_radio_unchecked);
      this.php.setWidgetLayoutResource(a.g.mm_preference_radio_unchecked);
      this.phq.setWidgetLayoutResource(a.g.mm_preference_radio_checked);
      return;
    }
    this.pho.setWidgetLayoutResource(a.g.mm_preference_radio_checked);
    this.php.setWidgetLayoutResource(a.g.mm_preference_radio_unchecked);
    this.phq.setWidgetLayoutResource(a.g.mm_preference_radio_unchecked);
  }
  
  private boolean uL(int paramInt)
  {
    return (this.hXx & paramInt) != 0L;
  }
  
  public final int Ys()
  {
    return -1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof ae))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.phs = ((ae)paraml).pjL;
        this.cZH = ((ae)paraml).pjK;
        this.mzm = ((ae)paraml).pjN;
        this.pht = ((ae)paraml).pjO;
        if (!bi.oW(this.phs))
        {
          this.phr.setTitle(this.phs);
          if (bi.oW(this.cZH)) {
            break label137;
          }
          setMMTitle(this.cZH);
          label103:
          bNY();
        }
      }
      for (;;)
      {
        this.eOE.notifyDataSetChanged();
        return;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletDelayTransferSettingUI", "use hardcode wording");
        this.phr.setTitle(a.i.wallet_delay_transfer_setting_title_hardcode_tip);
        break;
        label137:
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletDelayTransferSettingUI", "use hardcode title wording");
        setMMTitle(a.i.wallet_password_setting_delay_transfer_date);
        break label103;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletDelayTransferSettingUI", "net error, use hardcode wording");
        this.phr.setTitle(a.i.wallet_delay_transfer_setting_title_hardcode_tip);
        setMMTitle(a.i.wallet_password_setting_delay_transfer_date);
      }
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletDelayTransferSettingUI", "other scene");
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    paramf = paramPreference.mKey;
    if ("wallet_transfer_realtime".equals(paramf))
    {
      this.hXx &= 0xFFFFFFFFFFFFFFEF;
      this.hXx &= 0xFFFFFFFFFFFFFFDF;
    }
    for (;;)
    {
      bNZ();
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Ei().DT().set(147457, Long.valueOf(this.hXx));
      finish();
      return true;
      if ("wallet_transfer_2h".equals(paramf))
      {
        this.hXx &= 0xFFFFFFFFFFFFFFDF;
        this.hXx |= 0x10;
      }
      else if ("wallet_transfer_24h".equals(paramf))
      {
        this.hXx &= 0xFFFFFFFFFFFFFFEF;
        this.hXx |= 0x20;
      }
    }
  }
  
  protected final void initView()
  {
    this.pho = this.eOE.ZZ("wallet_transfer_realtime");
    this.php = this.eOE.ZZ("wallet_transfer_2h");
    this.phq = this.eOE.ZZ("wallet_transfer_24h");
    this.phr = this.eOE.ZZ("wallet_transfer_title_tips");
    bNZ();
    setBackBtn(new WalletDelayTransferSettingUI.2(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eOE = this.tCL;
    this.eOE.addPreferencesFromResource(a.l.wallet_delay_transfer_setting_pref);
    com.tencent.mm.kernel.g.Ek();
    this.hXx = ((Long)com.tencent.mm.kernel.g.Ei().DT().get(147457, Long.valueOf(0L))).longValue();
    initView();
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(385, this);
    com.tencent.mm.kernel.g.Ek();
    this.phs = ((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sVk, ""));
    com.tencent.mm.kernel.g.Ek();
    this.cZH = ((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sVj, ""));
    com.tencent.mm.kernel.g.Ek();
    this.mzm = ((String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sVm, ""));
    com.tencent.mm.kernel.g.Ek();
    this.pht = ((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sVn, Integer.valueOf(0))).intValue();
    if ((bi.oW(this.phs)) || (bi.oW(this.cZH)) || (bi.oW(this.mzm))) {}
    for (boolean bool = ae.a(true, null);; bool = ae.a(false, null))
    {
      com.tencent.mm.wallet_core.ui.e.cDN();
      if (!bool)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletDelayTransferSettingUI", "no need do scene, remove listener");
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Eh().dpP.b(385, this);
      }
      return;
      this.phr.setTitle(this.phs);
      setMMTitle(this.cZH);
      bNY();
    }
  }
  
  protected void onDestroy()
  {
    int i = 1;
    super.onDestroy();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletDelayTransferSettingUI", "do oplog, %s", new Object[] { Long.valueOf(this.hXx) });
    if (uL(16)) {}
    for (;;)
    {
      auq localauq = new auq();
      localauq.mEc = i;
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(205, localauq));
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Eh().dpP.b(385, this);
      return;
      if (uL(32)) {
        i = 2;
      } else {
        i = 0;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet/pwd/ui/WalletDelayTransferSettingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */