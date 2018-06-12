package com.tencent.mm.plugin.wallet_core.ui.ibg;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.c.a.b;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.model.u.a;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(7)
public class WalletIbgAdapterUI
  extends WalletBaseUI
{
  private void Py(String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramString);
    localIntent.putExtra("showShare", false);
    d.b(this, "webview", ".ui.tools.WebViewUI", localIntent);
  }
  
  private void bQI()
  {
    g.Ek();
    g.Ei().DT().a(aa.a.sSV, Boolean.valueOf(true));
    h.a(this, false, getString(a.i.webview_tbs_need_download), "", getString(a.i.webview_tbs_download_ok), getString(a.i.webview_tbs_download_cancel), new WalletIbgAdapterUI.1(this), new WalletIbgAdapterUI.2(this));
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0) && ((paraml instanceof b)))
    {
      paramInt1 = ((b)paraml).pjQ;
      paramString = ((b)paraml).jumpUrl;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletH5AdapterUI", "hy: get success! url is: %s, download x5 = %b", new Object[] { paramString, Integer.valueOf(paramInt1) });
      if (paramInt1 == 1)
      {
        paramInt1 = u.a.cbE();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletH5AdapterUI", "now status = %d", new Object[] { Integer.valueOf(paramInt1) });
        switch (paramInt1)
        {
        default: 
          bQI();
        case 1: 
        case 4: 
          for (paramInt1 = 0;; paramInt1 = 1)
          {
            if (paramInt1 != 0)
            {
              Py(paramString);
              finish();
            }
            return false;
          }
        }
        g.Ek();
        if (((Boolean)g.Ei().DT().get(aa.a.sSV, Boolean.valueOf(false))).booleanValue())
        {
          Toast.makeText(this, getString(a.i.webview_tbs_downloading), 1).show();
          u.a.eQ(this);
          finish();
        }
        for (;;)
        {
          paramInt1 = 0;
          break;
          bQI();
        }
      }
      Py(paramString);
      finish();
      return false;
    }
    com.tencent.mm.wallet_core.a.c(this, null, 0);
    return false;
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    ux(4);
    this.uYO.jr(1564);
    a(new b(), true, false);
  }
  
  public void onDestroy()
  {
    this.uYO.js(1564);
    super.onDestroy();
  }
  
  public void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/ibg/WalletIbgAdapterUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */