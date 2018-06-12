package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;

public class WalletSelectProfessionUI
  extends MMPreference
{
  private f eOE;
  private Profession[] pjD = null;
  
  public final int Ys()
  {
    return -1;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    if (paramPreference.mKey.startsWith("index_"))
    {
      paramf = paramPreference.mKey.split("_");
      if (paramf.length != 2) {
        break label71;
      }
      int i = bi.getInt(paramf[1], 0);
      paramf = this.pjD[i];
      paramPreference = new Intent();
      paramPreference.putExtra("key_select_profession", paramf);
      setResult(-1, paramPreference);
    }
    for (;;)
    {
      finish();
      return true;
      label71:
      x.w("MicroMsg.WalletSelectProfessionUI", "error key: %s, %s", new Object[] { paramPreference.mKey, paramPreference.getTitle() });
      setResult(0);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.i.wallet_select_profession_title);
    this.eOE = this.tCL;
    paramBundle = new PreferenceTitleCategory(this.mController.tml);
    paramBundle.setTitle(getString(a.i.wallet_select_profession_tips));
    paramBundle.setKey("title_category");
    this.eOE.a(paramBundle);
    paramBundle = getIntent().getParcelableArrayExtra("key_profession_list");
    int i;
    if ((paramBundle != null) && (paramBundle.length > 0))
    {
      this.pjD = new Profession[paramBundle.length];
      i = 0;
      while (i < this.pjD.length)
      {
        this.pjD[i] = ((Profession)paramBundle[i]);
        i += 1;
      }
    }
    if (this.pjD != null)
    {
      paramBundle = this.pjD;
      int k = paramBundle.length;
      i = 0;
      int j = 0;
      while (i < k)
      {
        Object localObject = paramBundle[i];
        if ((localObject != null) && (!bi.oW(((Profession)localObject).pkT)))
        {
          Preference localPreference = new Preference(this.mController.tml);
          localPreference.setTitle(((Profession)localObject).pkT);
          localPreference.setKey("index_" + j);
          this.eOE.a(localPreference);
        }
        j += 1;
        i += 1;
      }
    }
    setBackBtn(new WalletSelectProfessionUI.1(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletSelectProfessionUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */