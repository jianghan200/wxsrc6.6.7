package com.tencent.mm.plugin.wallet_payu.pay.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.lp;
import com.tencent.mm.plugin.wallet.a.f;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet.pay.ui.WalletChangeBankcardUI;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.FavorPayInfo;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.ui.g;
import com.tencent.mm.plugin.wallet_core.ui.o;
import com.tencent.mm.plugin.wallet_payu.pay.a.d;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

@com.tencent.mm.ui.base.a(3)
public class WalletPayUChangeBankcardUI
  extends WalletChangeBankcardUI
{
  private String pFw = null;
  private c pFx = new c() {};
  
  protected final void OQ(String paramString)
  {
    this.pdF.pli = paramString;
    label163:
    Object localObject;
    boolean bool;
    if (this.oZH != null)
    {
      this.sy.putString("key_mobile", this.oZH.field_mobile);
      this.sy.putParcelable("key_bankcard", this.oZH);
      this.pdF.lMW = this.oZH.field_bindSerial;
      this.pdF.lMV = this.oZH.field_bankcardType;
      if (this.pfz == null) {
        break label332;
      }
      this.pdF.plu = this.pfz.pnP;
      if ((this.mCZ != null) && (this.mCZ.ppg != null)) {
        this.pdF.plt = this.mCZ.ppg.pdY;
      }
      if ((this.mCZ != null) && (this.mCZ.pjA == 3))
      {
        if (!this.oZH.bOv()) {
          break label343;
        }
        this.pdF.bWA = 3;
        localObject = this.sy;
        if (this.oZH.bOv()) {
          break label355;
        }
        bool = true;
        label182:
        ((Bundle)localObject).putBoolean("key_is_oversea", bool);
      }
    }
    this.sy.putParcelable("key_authen", this.pdF);
    if ((this.mCn.bVY == 32) || (this.mCn.bVY == 31))
    {
      if (this.mCn.bVY == 32) {
        x.d("MicroMsg.WalletPayUChangeBankcardUI", "hy: transfer ftf");
      }
      for (int i = 1;; i = 0)
      {
        a(new com.tencent.mm.plugin.wallet_payu.remittance.a.a(this.mCn.bOd, this.eWo, this.mCn.qUL.getDouble("total_fee"), this.mCn.qUL.getString("fee_type"), i, this.mCn.qUL.getString("extinfo_key_1"), this.oZH.field_bindSerial, this.mCn.qUL.getString("extinfo_key_4")), true, false);
        return;
        label332:
        this.pdF.plu = null;
        break;
        label343:
        this.pdF.bWA = 6;
        break label163;
        label355:
        bool = false;
        break label182;
      }
    }
    if (this.mCn.bVY == 11)
    {
      paramString = this.eWo;
      localObject = this.pFw;
      String str1 = this.mCn.bOd;
      double d = this.mCn.qUL.getDouble("total_fee");
      String str2 = this.mCn.qUL.getString("fee_type");
      String str3 = this.oZH.field_bindSerial;
      String str4 = this.oZH.field_bankcardType;
      p.bNp();
      a(new com.tencent.mm.plugin.wallet_payu.balance.a.b(paramString, (String)localObject, str1, d, str2, str3, str4, p.bNq().paw.field_bindSerial), true, false);
      return;
    }
    a(new com.tencent.mm.plugin.wallet_payu.pay.a.b(this.mCn.bOd, this.mCn.qUL.getDouble("total_fee"), this.mCn.qUL.getString("fee_type"), this.oZH.field_bankcardType, this.oZH.field_bindSerial, this.pFw, paramString), true, true);
  }
  
  protected final g bNB()
  {
    return new a(this, this.oZG, this.pfw, this.mCZ);
  }
  
  protected final void bNC()
  {
    x.d("MicroMsg.WalletPayUChangeBankcardUI", "pay with old bankcard!");
    String str = this.sy.getString("key_pwd1");
    if (bi.oW(str))
    {
      ux(4);
      this.oZD = b.a(this, this.mCZ, this.pfz, this.oZH, new WalletPayUChangeBankcardUI.1(this), new View.OnClickListener()new WalletPayUChangeBankcardUI.3
      {
        public final void onClick(View paramAnonymousView)
        {
          if (WalletPayUChangeBankcardUI.b(WalletPayUChangeBankcardUI.this) != null) {
            WalletPayUChangeBankcardUI.c(WalletPayUChangeBankcardUI.this).dismiss();
          }
          WalletPayUChangeBankcardUI.e(WalletPayUChangeBankcardUI.this).e(WalletPayUChangeBankcardUI.d(WalletPayUChangeBankcardUI.this), true);
          WalletPayUChangeBankcardUI.b(WalletPayUChangeBankcardUI.this, (FavorPayInfo)paramAnonymousView.getTag());
          if (WalletPayUChangeBankcardUI.f(WalletPayUChangeBankcardUI.this) != null) {
            WalletPayUChangeBankcardUI.g(WalletPayUChangeBankcardUI.this).pnT = "";
          }
          WalletPayUChangeBankcardUI.this.sy.putParcelable("key_favor_pay_info", WalletPayUChangeBankcardUI.h(WalletPayUChangeBankcardUI.this));
          WalletPayUChangeBankcardUI.i(WalletPayUChangeBankcardUI.this);
          WalletPayUChangeBankcardUI.this.ux(0);
        }
      }, new WalletPayUChangeBankcardUI.3(this), "CREDITCARD_PAYU".equals(this.oZH.field_bankcardType));
      return;
    }
    OQ(str);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramInt1 == 0)
    {
      bool1 = bool2;
      if (paramInt2 == 0) {
        if ((!(paraml instanceof com.tencent.mm.plugin.wallet_payu.pay.a.b)) && (!(paraml instanceof com.tencent.mm.plugin.wallet_payu.remittance.a.a)))
        {
          bool1 = bool2;
          if (!(paraml instanceof com.tencent.mm.plugin.wallet_payu.balance.a.b)) {}
        }
        else
        {
          paramString = this.sy;
          if (!bi.oW(this.eWo)) {
            paramString.putString("key_pwd1", this.eWo);
          }
          paramString.putBoolean("key_need_verify_sms", false);
          paramString.putParcelable("key_pay_info", this.mCn);
          paramString.putInt("key_pay_flag", 3);
          if ((paraml instanceof com.tencent.mm.plugin.wallet_payu.pay.a.b))
          {
            com.tencent.mm.plugin.wallet_payu.pay.a.b localb = (com.tencent.mm.plugin.wallet_payu.pay.a.b)paraml;
            paramString.putString("transid", localb.hTI);
            paramString.putBoolean("key_should_redirect", localb.pFq);
            paramString.putString("key_gateway_code", localb.pDV);
            paramString.putString("key_gateway_reference", localb.pDU);
            paramString.putString("key_force_adjust_code", localb.pDX);
            paramString.putBoolean("key_should_force_adjust", localb.pFr);
            if (localb.isSuccess()) {
              paramString.putParcelable("key_orders", d.a(this.mCZ, localb.pFs, localb.pFt, localb.timestamp, localb.psA));
            }
          }
          if ((paraml instanceof com.tencent.mm.plugin.wallet_payu.balance.a.b))
          {
            paraml = (com.tencent.mm.plugin.wallet_payu.balance.a.b)paraml;
            paramString.putString("transid", paraml.hTI);
            paramString.putBoolean("key_should_redirect", paraml.pDT);
            paramString.putString("key_gateway_code", paraml.pDV);
            paramString.putString("key_gateway_reference", paraml.pDU);
            paramString.putString("key_force_adjust_code", paraml.pDX);
            paramString.putBoolean("key_should_force_adjust", paraml.pDW);
          }
          com.tencent.mm.wallet_core.a.j(this, paramString);
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 23351)
    {
      x.d("MicroMsg.WalletPayUChangeBankcardUI", "hy: check otp done. resultcode: %d", new Object[] { Integer.valueOf(paramInt2) });
      if (paramInt2 == -1)
      {
        this.sy.putBoolean("key_should_redirect", false);
        com.tencent.mm.wallet_core.a.j(this, this.sy);
      }
      if (paramInt2 == 0) {
        com.tencent.mm.wallet_core.a.c(this, this.sy, 0);
      }
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.b.a.sFg.b(this.pFx);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    com.tencent.mm.sdk.b.a.sFg.c(this.pFx);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/pay/ui/WalletPayUChangeBankcardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */