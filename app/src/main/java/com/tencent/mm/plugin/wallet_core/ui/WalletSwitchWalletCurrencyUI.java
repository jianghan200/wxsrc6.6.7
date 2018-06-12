package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.wallet_core.d.f;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.model.app.ap;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;

public class WalletSwitchWalletCurrencyUI
  extends WalletBaseUI
  implements View.OnClickListener
{
  private p pyA = null;
  private com.tencent.mm.plugin.wallet_core.model.x pyB;
  private com.tencent.mm.plugin.wallet_core.model.x pyC;
  private ListView pyy;
  private ArrayList<com.tencent.mm.plugin.wallet_core.model.x> pyz = null;
  
  private void jD(boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletSwitchWalletCurrencyUI", "doGetAllWalletType isShowProcess = " + paramBoolean);
    a(new com.tencent.mm.plugin.wallet_core.c.l(), paramBoolean, false);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.wallet_core.c.l))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletSwitchWalletCurrencyUI", "NetSceneQueryUserWallet succ and update view");
        this.pyz = o.bOZ().bPT();
        this.pyA.mData = this.pyz;
        this.pyA.notifyDataSetChanged();
        return true;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletSwitchWalletCurrencyUI", "NetSceneQueryUserWallet error");
      if (this.pyz == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletSwitchWalletCurrencyUI", "wallet list is null in cache");
        return false;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletSwitchWalletCurrencyUI", "use cache wallet list data");
      return true;
    }
    if (((paraml instanceof com.tencent.mm.plugin.wallet_core.c.p)) && (paramInt1 == 0) && (paramInt2 == 0))
    {
      this.pyB.field_wallet_selected = 1;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletSwitchWalletCurrencyUI", "set user wallet succ. current wallet type = " + this.pyB.field_wallet_type + " " + this.pyB.field_wallet_tpa_country_mask);
      ap.ccb().reset();
      o.bOZ().c(this.pyB, new String[0]);
      paramString = this.pyA.pyE;
      if (paramString != null)
      {
        paramString.field_wallet_selected = 0;
        o.bOZ().c(paramString, new String[0]);
      }
      g.Ek();
      g.Ei().DT().set(339975, Integer.valueOf(this.pyB.field_wallet_type));
      g.Ek();
      g.Ei().DT().a(aa.a.sTs, Integer.valueOf(this.pyB.field_wallet_tpa_country_mask));
      if (q.GT())
      {
        o.bOR();
        o.w(this, null);
      }
      setResult(-1);
      finish();
      return true;
    }
    return false;
  }
  
  protected final int getLayoutId()
  {
    return a.g.wallet_switch_wallet_kind;
  }
  
  protected final void initView()
  {
    this.pyy = ((ListView)findViewById(a.f.settings_wallet_type_list));
    this.pyA = new p(this, this.pyz);
    this.pyy.setAdapter(this.pyA);
    if ((this.pyz != null) && (this.pyz.size() > 0))
    {
      this.pyA.mData = this.pyz;
      this.pyA.notifyDataSetChanged();
    }
    this.pyy.setOnItemClickListener(new WalletSwitchWalletCurrencyUI.1(this));
  }
  
  public void onClick(View paramView) {}
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.i.wallet_switch_wallet_type);
    g.Ek();
    g.Ei().DT().a(aa.a.sSo, Boolean.valueOf(true));
    getIntent().getIntExtra("switch_wallet_scene", 0);
    this.pyz = o.bOZ().bPT();
    if ((this.pyz == null) || (this.pyz.size() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletSwitchWalletCurrencyUI", "not data cache,do NetSceneQueryUserWallet");
      jD(true);
    }
    for (;;)
    {
      initView();
      setResult(0);
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletSwitchWalletCurrencyUI", "use cache data first, and do NetSceneQueryUserWallet for update cache");
      jD(false);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletSwitchWalletCurrencyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */