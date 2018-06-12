package com.tencent.mm.plugin.fingerprint.ui;

import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fingerprint.b.e;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class FingerPrintEntranceUI
  extends WalletBaseUI
{
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return false;
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int j = 1;
    super.onCreate(paramBundle);
    x.i("MicroMsg.FingerPrintEntranceUI", "onCreate");
    int i;
    if (e.aNC())
    {
      x.i("MicroMsg.FingerPrintEntranceUI", "will call showSetFingerPrintGuide()");
      x.i("MicroMsg.FingerPrintEntranceUI", "hy: has standard action starting to fingerprint setting");
      paramBundle = getResources().getString(a.i.strong_guide_set_fingerprint_text);
      Resources localResources = getResources();
      if (((k)g.l(k.class)).aNl())
      {
        i = a.i.btn_guide_reg_system_fingerprint;
        h.a(this, paramBundle, "", localResources.getString(i), getString(a.i.app_cancel), true, new FingerPrintEntranceUI.1(this), new FingerPrintEntranceUI.2(this));
        e.aNx();
        i = j;
      }
    }
    for (;;)
    {
      if (i == 0)
      {
        x.e("MicroMsg.FingerPrintEntranceUI", "finish FingerPrintEntranceUI");
        finish();
      }
      return;
      i = a.i.app_ok;
      break;
      if (!e.aNw())
      {
        x.i("MicroMsg.FingerPrintEntranceUI", "will showOpenFingerPrintPayGuide()");
        h.a(this, getResources().getString(a.i.strong_guide_open_fingerprint_pay_text), "", getResources().getString(a.i.btn_guide_open_fingerprint), getString(a.i.app_cancel), true, new FingerPrintEntranceUI.3(this), new FingerPrintEntranceUI.4(this));
        e.aNv();
        i = j;
      }
      else
      {
        i = 0;
      }
    }
  }
  
  public void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fingerprint/ui/FingerPrintEntranceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */