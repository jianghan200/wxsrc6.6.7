package com.tencent.mm.plugin.wallet_payu.pay.a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.te;
import com.tencent.mm.g.a.te.a;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wallet_payu.balance.ui.WalletPayUBalanceManagerUI;
import com.tencent.mm.plugin.wallet_payu.balance.ui.WalletPayUBalanceResultUI;
import com.tencent.mm.plugin.wallet_payu.create.ui.WalletPayUVerifyCodeUI;
import com.tencent.mm.plugin.wallet_payu.pay.ui.WalletPayUChangeBankcardUI;
import com.tencent.mm.plugin.wallet_payu.pay.ui.WalletPayUOrderInfoUI;
import com.tencent.mm.plugin.wallet_payu.pay.ui.WalletPayUPayUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class e
  extends com.tencent.mm.plugin.wallet_core.b.a
{
  private void f(Activity paramActivity, Bundle paramBundle)
  {
    int i = paramBundle.getInt("key_pay_scene", 6);
    if ((i == 11) || (i == 21))
    {
      c(paramActivity, WalletPayUBalanceResultUI.class, paramBundle);
      return;
    }
    if ((i == 31) || (i == 32) || (i == 33))
    {
      a(paramActivity, "remittance", ".ui.RemittanceResultUI", paramBundle);
      return;
    }
    c(paramActivity, WalletPayUOrderInfoUI.class, paramBundle);
  }
  
  private void i(Activity paramActivity, Bundle paramBundle)
  {
    if (paramBundle.getBoolean("key_should_redirect", false))
    {
      paramBundle.getString("key_gateway_code");
      String str = paramBundle.getString("key_gateway_reference");
      boolean bool = paramBundle.getBoolean("key_should_force_adjust");
      paramBundle = paramBundle.getString("key_force_adjust_code");
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", str);
      localIntent.putExtra("showShare", false);
      localIntent.putExtra("shouldForceViewPort", bool);
      localIntent.putExtra("pay_channel", 2);
      localIntent.putExtra("view_port_code", paramBundle);
      d.b(paramActivity, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent, 23351);
      return;
    }
    f(paramActivity, paramBundle);
  }
  
  public final int a(MMActivity paramMMActivity, int paramInt)
  {
    return a.i.wallet_pay_finish_confirm_payu;
  }
  
  public final com.tencent.mm.wallet_core.c a(Activity paramActivity, Bundle paramBundle)
  {
    paramBundle.putInt("key_pay_scene", ((PayInfo)paramBundle.getParcelable("key_pay_info")).bVY);
    switch (paramBundle.getInt("key_err_code", 0))
    {
    default: 
      x.d("MicroMsg.PayUPayProcess", "start pay_flag : " + paramBundle.getInt("key_pay_flag", 0));
      switch (paramBundle.getInt("key_pay_flag", 0))
      {
      default: 
        return this;
      }
      break;
    }
    paramBundle.putInt("key_pay_flag", 3);
    paramBundle.putInt("key_err_code", 0);
    c(paramActivity, WalletPayUChangeBankcardUI.class, paramBundle);
    return this;
    i(paramActivity, paramBundle);
    return this;
  }
  
  public final g a(MMActivity paramMMActivity, i parami)
  {
    if ((paramMMActivity instanceof WalletPayUPayUI)) {
      return new e.1(this, paramMMActivity, parami);
    }
    if ((paramMMActivity instanceof WalletPayUBalanceResultUI)) {
      return new e.2(this, paramMMActivity, parami);
    }
    return super.a(paramMMActivity, parami);
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    paramInt = 1;
    switch (paramBundle.getInt("key_err_code", 0))
    {
    default: 
      paramInt = 0;
    }
    while (paramInt != 0)
    {
      x.i("MicroMsg.PayUPayProcess", "deal with the err!");
      return;
      b(paramActivity, paramBundle);
      continue;
      com.tencent.mm.wallet_core.a.a(paramActivity, com.tencent.mm.plugin.wallet_payu.bind.model.c.class, paramBundle);
      continue;
      paramBundle.putInt("key_pay_flag", 3);
      paramBundle.putInt("key_err_code", 0);
      c(paramActivity, WalletPayUChangeBankcardUI.class, paramBundle);
    }
    if (paramBundle.containsKey("key_pay_flag")) {}
    for (paramInt = paramBundle.getInt("key_pay_flag", 0);; paramInt = this.jfZ.getInt("key_pay_flag", 0))
    {
      x.d("MicroMsg.PayUPayProcess", "forward pay_flag : " + paramInt);
      switch (paramInt)
      {
      default: 
        return;
      }
      if (!(paramActivity instanceof WalletPayUVerifyCodeUI)) {
        break;
      }
      f(paramActivity, paramBundle);
      return;
    }
    if ((paramActivity instanceof WalletPayUChangeBankcardUI))
    {
      i(paramActivity, paramBundle);
      return;
    }
    if ((paramActivity instanceof WalletPayUBalanceResultUI))
    {
      Intent localIntent = new Intent(paramActivity, WalletPayUBalanceManagerUI.class);
      localIntent.putExtras(new Bundle());
      localIntent.getExtras().putAll(paramBundle);
      a(paramActivity, WalletPayUBalanceManagerUI.class, localIntent);
      return;
    }
    super.a(paramActivity, 0, paramBundle);
  }
  
  public final boolean a(WalletBaseUI paramWalletBaseUI, int paramInt, String paramString)
  {
    return false;
  }
  
  public final String aNK()
  {
    return "PayUPayProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    int j = -1;
    x.d("MicroMsg.PayUPayProcess", "end pay_flag : " + this.jfZ.getInt("key_pay_flag", 0));
    int i;
    Intent localIntent;
    te.a locala;
    if (this.jfZ.getBoolean("intent_pay_end", false))
    {
      i = -1;
      localIntent = new Intent();
      if (paramBundle != null)
      {
        paramBundle = new Bundle();
        paramBundle.putInt("intent_pay_end_errcode", this.jfZ.getInt("intent_pay_end_errcode"));
        paramBundle.putString("intent_pay_app_url", this.jfZ.getString("intent_pay_app_url"));
        paramBundle.putBoolean("intent_pay_end", this.jfZ.getBoolean("intent_pay_end"));
        paramBundle.putString("intent_wap_pay_jump_url", this.jfZ.getString("intent_wap_pay_jump_url"));
        localIntent.putExtras(paramBundle);
      }
      paramBundle = new te();
      paramBundle.ceH.intent = localIntent;
      locala = paramBundle.ceH;
      if (!this.jfZ.getBoolean("intent_pay_end", false)) {
        break label208;
      }
    }
    for (;;)
    {
      locala.result = j;
      com.tencent.mm.sdk.b.a.sFg.m(paramBundle);
      a(paramActivity, "wallet_payu", ".pay.ui.WalletPayUPayUI", i, localIntent, false);
      return;
      i = 0;
      break;
      label208:
      j = 0;
    }
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    x.d("MicroMsg.PayUPayProcess", "bakck pay_flag : " + this.jfZ.getInt("key_pay_flag", 0));
    if ((paramActivity instanceof WalletPwdConfirmUI))
    {
      a(paramActivity, WalletSetPasswordUI.class, paramInt);
      return;
    }
    z(paramActivity);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    x.d("MicroMsg.PayUPayProcess", "needupdatebankcardlist pay_flag : " + this.jfZ.getInt("key_pay_flag", 0));
    switch (this.jfZ.getInt("key_pay_flag", 0))
    {
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/pay/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */