package com.tencent.mm.plugin.wallet_payu.pay.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI.a;
import com.tencent.mm.plugin.wallet_payu.pay.a.c;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.c.j;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WalletPayUOrderInfoUI
  extends WalletOrderInfoOldUI
{
  protected final void Pt(String paramString)
  {
    a(new c(paramString, 1), true, true);
  }
  
  protected final void bQp()
  {
    a(new com.tencent.mm.plugin.wallet_core.c.b.a(), true, true);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof com.tencent.mm.plugin.wallet_payu.pay.a.a)) {
      return true;
    }
    Object localObject;
    if ((paraml instanceof c))
    {
      localObject = (c)paraml;
      if ((((c)localObject).mCZ.ppf != null) && (((c)localObject).mCZ.ppf.size() > 0)) {
        break label88;
      }
      x.w("MicroMsg.WalletPayUOrderInfoUI", "hy: no commodity. show alert");
      h.a(this, a.i.wallet_payu_show_order_error, a.i.app_tip, new WalletPayUOrderInfoUI.1(this));
    }
    label88:
    do
    {
      return super.d(paramInt1, paramInt2, paramString, paraml);
      localObject = (Orders.Commodity)((c)localObject).mCZ.ppf.get(0);
      x.d("MicroMsg.WalletPayUOrderInfoUI", "Coomdity:" + localObject);
      com.tencent.mm.plugin.wallet_payu.a.d.bRk().pEW = null;
    } while (localObject == null);
    this.pvL = new ArrayList();
    this.pvL.add(localObject);
    g.Ek();
    ab localab = ((i)g.l(i.class)).FR().Yg(((Orders.Commodity)localObject).lNW);
    if ((localab != null) && ((int)localab.dhP != 0)) {
      M(localab);
    }
    for (;;)
    {
      this.pwu.notifyDataSetChanged();
      bQq();
      break;
      am.a.dBr.a(((Orders.Commodity)localObject).lNW, "", this.pwB);
    }
  }
  
  public final void done()
  {
    bQb();
    Object localObject1 = new Bundle();
    ((Bundle)localObject1).putInt("intent_pay_end_errcode", this.sy.getInt("intent_pay_end_errcode"));
    ((Bundle)localObject1).putString("intent_pay_app_url", this.sy.getString("intent_pay_app_url"));
    ((Bundle)localObject1).putBoolean("intent_pay_end", this.sy.getBoolean("intent_pay_end"));
    x.i("MicroMsg.WalletPayUOrderInfoUI", "pay done...feedbackData errCode:" + this.sy.getInt("intent_pay_end_errcode"));
    Object localObject2 = this.pvK.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      String str = (String)((Iterator)localObject2).next();
      if (!bi.oW(str))
      {
        x.d("MicroMsg.WalletPayUOrderInfoUI", "hy: doing netscene subscribe...appName: %s", new Object[] { str });
        a(new j(str), false, false);
      }
    }
    com.tencent.mm.wallet_core.a.j(this, (Bundle)localObject1);
    if ((this.pfb != null) && (!bi.oW(this.pfb.ixy))) {
      if (this.pfb.ppf.size() <= 0) {
        break label321;
      }
    }
    label321:
    for (localObject1 = ((Orders.Commodity)this.pfb.ppf.get(0)).bOe;; localObject1 = "")
    {
      localObject1 = String.format("%sreqkey=%s&transid=%s", new Object[] { this.pfb.ixy, this.pfb.bOd, localObject1 });
      x.d("MicroMsg.WalletPayUOrderInfoUI", "url = " + (String)localObject1);
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("rawUrl", (String)localObject1);
      ((Intent)localObject2).putExtra("showShare", false);
      ((Intent)localObject2).putExtra("geta8key_username", q.GF());
      com.tencent.mm.bg.d.b(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", (Intent)localObject2);
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    jr(1554);
  }
  
  public void onDestroy()
  {
    js(1554);
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/pay/ui/WalletPayUOrderInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */