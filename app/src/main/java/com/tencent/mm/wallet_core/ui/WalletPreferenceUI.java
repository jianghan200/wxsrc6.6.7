package com.tencent.mm.wallet_core.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.f;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

@a(3)
public abstract class WalletPreferenceUI
  extends MMPreference
  implements f
{
  public c uYN = null;
  public i uYO = null;
  public g uYP = null;
  
  public final void b(int paramInt1, int paramInt2, String paramString, l paraml, boolean paramBoolean)
  {
    if ((!h(paramInt1, paramInt2, paramString, paraml)) && (paramInt2 != 0))
    {
      paraml = paramString;
      if (bi.oW(paramString)) {
        paraml = getString(a.i.wallet_data_err);
      }
      h.a(this, paraml, null, false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          WalletPreferenceUI.this.finish();
        }
      });
    }
  }
  
  public final i cDP()
  {
    if (this.uYO == null) {
      this.uYO = new i(this, this);
    }
    return this.uYO;
  }
  
  public abstract boolean h(int paramInt1, int paramInt2, String paramString, l paraml);
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.uYO = new i(this, this);
    this.uYO.jr(385);
    this.uYO.jr(1518);
    if (getLayoutId() > 0) {
      e.cDN();
    }
  }
  
  public void onDestroy()
  {
    this.uYO.js(385);
    this.uYO.js(1518);
    this.uYO = null;
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/wallet_core/ui/WalletPreferenceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */