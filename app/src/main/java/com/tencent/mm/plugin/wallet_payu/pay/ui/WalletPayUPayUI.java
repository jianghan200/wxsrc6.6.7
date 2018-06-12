package com.tencent.mm.plugin.wallet_payu.pay.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.td;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet.pay.ui.WalletPayUI;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_payu.pay.a.d;
import com.tencent.mm.plugin.wallet_payu.pay.a.e;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class WalletPayUPayUI
  extends WalletPayUI
{
  private String pFw = null;
  
  protected final void J(Bundle paramBundle)
  {
    boolean bool = true;
    this.pgn = true;
    if (this.mCZ != null) {
      paramBundle.putInt("key_support_bankcard", this.mCZ.pjA);
    }
    if (!bNP()) {}
    for (;;)
    {
      paramBundle.putBoolean("key_is_oversea", bool);
      com.tencent.mm.wallet_core.a.a(this, e.class, paramBundle);
      return;
      bool = false;
    }
  }
  
  protected final void bNC()
  {
    if (!ZB()) {
      return;
    }
    x.d("MicroMsg.WalletPayUPayUI", "pay with old bankcard!");
    this.oZD = b.a(this, this.mCZ, this.pfz, this.oZH, new WalletPayUPayUI.1(this), new WalletPayUPayUI.2(this), new WalletPayUPayUI.3(this), "CREDITCARD_PAYU".equals(this.oZH.field_bankcardType));
  }
  
  protected final void bNK()
  {
    a(new com.tencent.mm.plugin.wallet_payu.pay.a.c(bNW().bOd), bNW().qUJ, false);
    a(new com.tencent.mm.plugin.wallet_core.c.b.a(bNW().bOd), bNW().qUJ, false);
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    int i = 0;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if ((paraml instanceof com.tencent.mm.plugin.wallet_payu.pay.a.c))
      {
        this.mCZ = ((com.tencent.mm.plugin.wallet_payu.pay.a.c)paraml).mCZ;
        paramInt1 = i;
        if (this.mCZ != null) {
          paramInt1 = this.mCZ.ppf.size();
        }
        this.mCount = paramInt1;
        paraml = new StringBuilder("get mOrders! bankcardTag : ");
        if (this.mCZ != null) {}
        for (paramString = Integer.valueOf(this.mCZ.pjA);; paramString = "")
        {
          x.d("MicroMsg.WalletPayUPayUI", paramString);
          ZB();
          if ((this.mCZ == null) || (this.mCZ.ppf == null)) {
            break label294;
          }
          paramString = new LinkedList();
          paraml = this.mCZ.ppf.iterator();
          while (paraml.hasNext())
          {
            Orders.Commodity localCommodity = (Orders.Commodity)paraml.next();
            if (bi.oW(localCommodity.bOe)) {
              localCommodity.bOe = this.mCn.bOd;
            }
            paramString.add(localCommodity.bOe);
          }
        }
        if (paramString.size() > 0)
        {
          paraml = new td();
          paraml.ceE.ceG = paramString;
          com.tencent.mm.sdk.b.a.sFg.m(paraml);
        }
        paramString = new Bundle();
        paramString.putDouble("total_fee", this.mCZ.mBj);
        paramString.putString("fee_type", "ZAR");
        if (this.mCn.qUL == null) {
          this.mCn.qUL = paramString;
        }
      }
      label294:
      do
      {
        do
        {
          for (;;)
          {
            aL();
            return true;
            this.mCn.qUL.putAll(paramString);
          }
          if (!(paraml instanceof com.tencent.mm.plugin.wallet_core.c.b.a)) {
            break;
          }
          p.bNp();
          this.oZG = p.bNq().jl(bNz());
          p.bNp();
          this.oZH = p.bNq().a(null, null, bNz(), false);
          this.mAE.setClickable(true);
        } while ((this.mCZ == null) || (this.oZG == null) || (this.mCn == null));
        com.tencent.mm.plugin.wallet_core.e.c.a(this.mCn, this.mCZ);
        paramString = com.tencent.mm.plugin.report.service.h.mEJ;
        paramInt2 = this.mCn.bVY;
        p.bNp();
        if (p.bNq().bPs()) {}
        for (paramInt1 = 2;; paramInt1 = 1)
        {
          paramString.h(10690, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(0), Integer.valueOf(paramInt1), Integer.valueOf((int)(this.mCZ.mBj * 100.0D)), this.mCZ.lNV });
          break;
        }
        if ((paraml instanceof com.tencent.mm.plugin.wallet_payu.pay.a.b))
        {
          paramString = (com.tencent.mm.plugin.wallet_payu.pay.a.b)paraml;
          paraml = this.sy;
          paraml.putParcelable("key_pay_info", this.mCn);
          paraml.putParcelable("key_bankcard", this.oZH);
          paraml.putString("key_bank_type", this.oZH.field_bankcardType);
          if (!bi.oW(this.eWo)) {
            paraml.putString("key_pwd1", this.eWo);
          }
          paraml.putString("kreq_token", paramString.blM());
          paraml.putParcelable("key_authen", bNO());
          paraml.putBoolean("key_need_verify_sms", false);
          paraml.putString("key_mobile", this.oZH.field_mobile);
          if (paramString.isSuccess()) {
            paraml.putParcelable("key_orders", d.a(this.mCZ, paramString.pFs, paramString.pFt, paramString.timestamp, paramString.psA));
          }
          this.sy.putBoolean("key_should_redirect", paramString.pFq);
          this.sy.putString("key_gateway_code", paramString.pDV);
          this.sy.putString("key_gateway_reference", paramString.pDU);
          this.sy.putBoolean("key_should_force_adjust", paramString.pFr);
          this.sy.putString("key_force_adjust_code", paramString.pDX);
          paraml.putInt("key_pay_flag", 3);
          J(paraml);
          return true;
        }
      } while (!(paraml instanceof com.tencent.mm.plugin.wallet_payu.remittance.a.a));
      paramString = (com.tencent.mm.plugin.wallet_payu.remittance.a.a)paraml;
      paraml = this.sy;
      paraml.putParcelable("key_pay_info", this.mCn);
      paraml.putParcelable("key_bankcard", this.oZH);
      paraml.putString("key_bank_type", this.oZH.field_bankcardType);
      if (!bi.oW(this.eWo)) {
        paraml.putString("key_pwd1", this.eWo);
      }
      paraml.putString("kreq_token", paramString.blM());
      paraml.putParcelable("key_authen", bNO());
      paraml.putBoolean("key_need_verify_sms", false);
      paraml.putString("key_mobile", this.oZH.field_mobile);
      paraml.putParcelable("key_orders", this.mCZ);
      paraml.putInt("key_pay_flag", 3);
      J(paraml);
      return true;
    }
    if ((paraml instanceof com.tencent.mm.plugin.wallet_payu.pay.a.b)) {}
    switch (paramInt2)
    {
    case 405: 
    case 406: 
    case 407: 
    default: 
      return false;
    case 402: 
    case 403: 
    case 408: 
      paraml = (com.tencent.mm.plugin.wallet_payu.pay.a.b)paraml;
      this.pgr = this.sy;
      this.pgr.putParcelable("key_pay_info", this.mCn);
      this.pgr.putParcelable("key_bankcard", this.oZH);
      if (!bi.oW(this.eWo)) {
        this.pgr.putString("key_pwd1", this.eWo);
      }
      this.pgr.putString("kreq_token", paraml.blM());
      this.pgr.putString("key_mobile", this.oZH.field_mobile);
      this.pgr.putInt("key_err_code", paramInt2);
      this.pgr.putParcelable("key_orders", this.mCZ);
      if (bi.oW(paramString)) {
        paramString = getString(a.i.wallet_pay_reset_info_tips);
      }
      break;
    }
    for (;;)
    {
      com.tencent.mm.ui.base.h.a(this, paramString, "", getString(a.i.wallet_pay_reset_info), getString(a.i.app_cancel), new WalletPayUPayUI.4(this), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          if (WalletPayUPayUI.this.bbR()) {
            WalletPayUPayUI.this.finish();
          }
        }
      });
      return true;
      if ((this.oZH == null) || (this.mCZ == null)) {
        break;
      }
      this.oZH.plU = this.mCZ.bOd;
      if ((this.oZG != null) && (this.oZG.size() > 1))
      {
        c(true, 4, paramString);
        return true;
      }
      b(true, 4, paramString);
      return true;
    }
  }
  
  protected final void jp(boolean paramBoolean)
  {
    if ((this.mCn.bVY == 32) || (this.mCn.bVY == 31))
    {
      if (this.mCn.bVY == 32) {
        x.d("MicroMsg.WalletPayUPayUI", "hy: transfer ftf");
      }
      for (int i = 1;; i = 0)
      {
        a(new com.tencent.mm.plugin.wallet_payu.remittance.a.a(this.mCn.bOd, this.eWo, this.mCn.qUL.getDouble("total_fee"), this.mCn.qUL.getString("fee_type"), i, this.mCn.qUL.getString("extinfo_key_1"), this.oZH.field_bindSerial, this.mCn.qUL.getString("extinfo_key_4")), true, false);
        return;
      }
    }
    if (this.mCn.bVY == 11)
    {
      String str1 = this.eWo;
      String str2 = this.pFw;
      String str3 = this.mCn.bOd;
      double d = this.mCn.qUL.getDouble("total_fee");
      String str4 = this.mCn.qUL.getString("fee_type");
      String str5 = this.oZH.field_bindSerial;
      String str6 = this.oZH.field_bankcardType;
      p.bNp();
      a(new com.tencent.mm.plugin.wallet_payu.balance.a.b(str1, str2, str3, d, str4, str5, str6, p.bNq().paw.field_bindSerial), true, false);
      return;
    }
    a(new com.tencent.mm.plugin.wallet_payu.pay.a.b(this.mCn.bOd, this.mCn.qUL.getDouble("total_fee"), this.mCn.qUL.getString("fee_type"), this.oZH.field_bankcardType, this.oZH.field_bindSerial, this.pFw, this.eWo), true, true);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    x.i("MicroMsg.WalletPayUPayUI", "hy: onNewIntent");
    super.onNewIntent(paramIntent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/pay/ui/WalletPayUPayUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */