package com.tencent.mm.plugin.wallet_payu.pwd.a;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUPwdConfirmUI;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUSetPasswordUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.s;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public abstract class e
  extends c
{
  public g a(MMActivity paramMMActivity, i parami)
  {
    if ((paramMMActivity instanceof WalletPayUPwdConfirmUI)) {
      return new e.1(this, paramMMActivity, parami);
    }
    return super.a(paramMMActivity, parami);
  }
  
  public void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    if ((paramActivity instanceof WalletPayUSetPasswordUI)) {
      c(paramActivity, WalletPayUPwdConfirmUI.class, paramBundle);
    }
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    if (this.jfZ.getInt("key_errcode_payu", -1) == 0) {
      s.makeText(paramActivity, a.i.wallet_order_info_result_success, 0).show();
    }
    for (;;)
    {
      e(paramActivity, "mall", ".ui.MallIndexUI");
      return;
      s.makeText(paramActivity, a.i.wallet_err_wording_comm_failed, 0).show();
    }
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    if ((paramActivity instanceof WalletPayUPwdConfirmUI)) {
      a(paramActivity, WalletPayUSetPasswordUI.class, paramInt);
    }
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/pwd/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */