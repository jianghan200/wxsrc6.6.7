package com.tencent.mm.plugin.remittance.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.remittance.model.r;
import com.tencent.mm.plugin.remittance.model.z;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@a(7)
public class RemittanceOSRedirect
  extends WalletBaseUI
{
  public String cYO = "";
  private int fdx;
  
  public final void b(int paramInt1, int paramInt2, String paramString, l paraml, boolean paramBoolean)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      if ((paraml instanceof z))
      {
        paramString = (z)paraml;
        x.i("MicroMsg.RemittanceOSRedirect", "indexScene  %s", new Object[] { paramString.myA });
        paraml = getIntent();
        if (paramString.hUw == 1)
        {
          com.tencent.mm.pluginsdk.wallet.h.a(this, 2, this.cYO, 11, null);
          finish();
        }
      }
    }
    do
    {
      do
      {
        return;
        paraml.setClass(this, RemittanceOSUI.class);
        paraml.putExtra("os_currency", paramString.hUw);
        paraml.putExtra("os_currencyuint", paramString.myA);
        paraml.putExtra("os_currencywording", paramString.myB);
        paraml.putExtra("os_notice", paramString.hUy);
        paraml.putExtra("os_notice_url", paramString.hUz);
        startActivity(paraml);
        break;
      } while (!(paraml instanceof r));
      paramString = (r)paraml;
      paraml = new Intent();
      paraml.setClass(this, RemittanceHKUI.class);
      this.cYO = paramString.mxw;
      if (bi.oW(this.cYO))
      {
        x.e("MicroMsg.RemittanceOSRedirect", "empty username");
        finish();
      }
      paraml.putExtra("scene", this.fdx);
      paraml.putExtra("fee", paramString.cfh / 100.0D);
      paraml.putExtra("desc", paramString.desc);
      paraml.putExtra("scan_remittance_id", paramString.mxy);
      paraml.putExtra("receiver_name", paramString.mxw);
      paraml.putExtra("receiver_true_name", paramString.hUA);
      paraml.putExtra("receiver_nick_name", paramString.mxx);
      paraml.putExtra("hk_currency", paramString.hUw);
      paraml.putExtra("hk_currencyuint", paramString.hUx);
      paraml.putExtra("hk_notice", paramString.hUy);
      paraml.putExtra("hk_notice_url", paramString.hUz);
      paramInt2 = paramString.hUB;
      paramInt1 = 32;
      x.i("MicroMsg.RemittanceOSRedirect", "setAmount: %d", new Object[] { Integer.valueOf(paramInt2) });
      if (paramInt2 == 1) {
        paramInt1 = 33;
      }
      paraml.putExtra("pay_scene", paramInt1);
      g.Ek();
      if (((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yf(this.cYO) != null)
      {
        startActivity(paraml);
        finish();
        return;
      }
      x.d("MicroMsg.RemittanceOSRedirect", "Receiver in contactStg and try to get contact");
      long l = bi.VF();
      am.a.dBr.a(this.cYO, "", new RemittanceOSRedirect.1(this, l, paraml));
      return;
      if ((paraml instanceof z))
      {
        x.i("MicroMsg.RemittanceOSRedirect", "indexScene  errMsg %s", new Object[] { paramString });
        com.tencent.mm.ui.base.h.a(this, paramString, "", new RemittanceOSRedirect.2(this));
        return;
      }
    } while (!(paraml instanceof r));
    com.tencent.mm.ui.base.h.a(this, paramString, "", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        RemittanceOSRedirect.this.finish();
      }
    });
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    return true;
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setTitleVisibility(8);
    this.fdx = getIntent().getIntExtra("scene", 0);
    this.cYO = getIntent().getStringExtra("receiver_name");
    if (this.fdx == 0)
    {
      x.e("MicroMsg.RemittanceOSRedirect", "error scene: %s", new Object[] { Integer.valueOf(this.fdx) });
      finish();
    }
    do
    {
      return;
      if (this.fdx == 5)
      {
        this.uYO.jr(1574);
        a(new z(q.GM()), true, true);
        return;
      }
    } while (this.fdx != 6);
    this.uYO.jr(1301);
    a(new r(this.cYO), true, false);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    if (this.fdx == 5) {
      js(1574);
    }
    while (this.fdx != 6) {
      return;
    }
    js(1301);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/remittance/ui/RemittanceOSRedirect.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */