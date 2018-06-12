package com.tencent.mm.plugin.wallet_core.ui;

import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.model.am.b.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.wallet_core.c.z;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class WalletOrderInfoUI
  extends WalletBaseUI
{
  private String lJJ;
  private Orders pfb;
  protected am.b.a pwB = new WalletOrderInfoUI.1(this);
  
  private void d(Orders paramOrders)
  {
    x.l("MicroMsg.WalletOrderInfoUI", "goToOrderInfoUI, is_use_new_paid_succ_page: %d", new Object[] { Integer.valueOf(paramOrders.ppp) });
    if (paramOrders.ppp == 1) {
      cDK().c(this, WalletOrderInfoNewUI.class, this.sy);
    }
    for (;;)
    {
      finish();
      return;
      cDK().c(this, WalletOrderInfoOldUI.class, this.sy);
    }
  }
  
  protected static String e(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    try
    {
      paramString5 = URLEncoder.encode(URLEncoder.encode(paramString5, "utf-8"), "utf-8");
      if ((paramString1.indexOf("%7Breqkey%7D") > 0) || (paramString1.indexOf("%7Btransid%7D") > 0) || (paramString1.indexOf("%7Bphone%7D") > 0) || (paramString1.indexOf("%7Bremark%7D") > 0))
      {
        x.i("MicroMsg.WalletOrderInfoUI", "concat url 1: ");
        return paramString1.replace("%7Breqkey%7D", paramString2).replace("%7Btransid%7D", paramString3).replace("%7Bphone%7D", paramString4).replace("%7Bremark%7D", paramString5);
      }
      if ((paramString1.indexOf("{reqkey}") > 0) || (paramString1.indexOf("{transid}") > 0) || (paramString1.indexOf("{phone}") > 0) || (paramString1.indexOf("{remark}") > 0))
      {
        x.i("MicroMsg.WalletOrderInfoUI", "concat url 2: ");
        return paramString1.replace("{reqkey}", paramString2).replace("{transid}", paramString3).replace("{phone}", paramString4).replace("{remark}", paramString5);
      }
      x.i("MicroMsg.WalletOrderInfoUI", "concat url 3: ");
      paramString2 = paramString1 + String.format("?reqkey=%s&transid=%s&phone=%s&remark=%s", new Object[] { paramString2, paramString3, paramString4, paramString5 });
      return paramString2;
    }
    catch (Exception paramString2)
    {
      x.printErrStackTrace("MicroMsg.WalletOrderInfoUI", paramString2, "", new Object[0]);
    }
    return paramString1;
  }
  
  protected void M(ab paramab)
  {
    if ((paramab != null) && ((int)paramab.dhP != 0))
    {
      String str = paramab.BK();
      x.d("MicroMsg.WalletOrderInfoUI", "call back from contactServer nickName " + str + " username: " + paramab.field_username);
      if ((this.pfb.ppf != null) && (this.pfb.ppf.size() > 0))
      {
        paramab = this.pfb.ppf.iterator();
        while (paramab.hasNext()) {
          ((Orders.Commodity)paramab.next()).lNW = str;
        }
      }
    }
  }
  
  public void Pt(String paramString)
  {
    a(new z(paramString), true, true);
  }
  
  public Orders bQo()
  {
    return (Orders)this.sy.getParcelable("key_orders");
  }
  
  protected boolean brH()
  {
    return true;
  }
  
  protected void cr(String paramString, int paramInt)
  {
    a(new z(paramString, paramInt), true, true);
  }
  
  public boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paraml instanceof z))
    {
      bool1 = bool2;
      if (paramInt1 == 0)
      {
        bool1 = bool2;
        if (paramInt2 == 0)
        {
          this.pfb = ((z)paraml).pjG;
          if (this.pfb == null) {
            break label207;
          }
          if ((this.pfb.ppf != null) && (this.pfb.ppf.size() != 0))
          {
            paramString = (Orders.Commodity)this.pfb.ppf.get(0);
            this.lJJ = paramString.bOe;
            x.d("MicroMsg.WalletOrderInfoUI", "Coomdity:" + paramString.toString());
            g.Ek();
            paraml = ((i)g.l(i.class)).FR().Yg(paramString.lNW);
            if ((paraml == null) || ((int)paraml.dhP == 0)) {
              break label186;
            }
            M(paraml);
          }
          d(this.pfb);
        }
      }
    }
    for (;;)
    {
      bool1 = true;
      return bool1;
      label186:
      am.a.dBr.a(paramString.lNW, "", this.pwB);
      break;
      label207:
      x.e("MicroMsg.WalletOrderInfoUI", "cannot get orders");
      h.a(this.mController.tml, a.i.wallet_order_info_err, 0, new WalletOrderInfoUI.2(this));
    }
  }
  
  protected int getLayoutId()
  {
    return a.g.transparent_layout;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    int i;
    if (brH())
    {
      this.pfb = bQo();
      this.lJJ = this.sy.getString("key_trans_id");
      i = this.sy.getInt("key_pay_type", -1);
      x.i("MicroMsg.WalletOrderInfoUI", "mTransId %s", new Object[] { this.lJJ });
      if (this.lJJ == null) {
        break label96;
      }
      if (i != -1) {
        break label86;
      }
      Pt(this.lJJ);
    }
    label86:
    label96:
    while (this.pfb == null)
    {
      return;
      cr(this.lJJ, i);
      return;
    }
    d(this.pfb);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    if ((this.pfb != null) && (!bi.oW(this.pfb.username))) {
      am.a.dBr.iw(this.pfb.username);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/ui/WalletOrderInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */