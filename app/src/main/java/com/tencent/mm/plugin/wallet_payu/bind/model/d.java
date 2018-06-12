package com.tencent.mm.plugin.wallet_payu.bind.model;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet.bind.a;
import com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardDetailUI;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_payu.bind.ui.WalletPayUBankcardDetailUI;
import com.tencent.mm.plugin.wallet_payu.pwd.a.c;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUCheckPwdUI;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.s;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class d
  extends a
{
  public final g a(MMActivity paramMMActivity, i parami)
  {
    if ((paramMMActivity instanceof WalletPayUCheckPwdUI)) {
      new g(paramMMActivity, parami)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
        {
          if ((paramAnonymousl instanceof c)) {
            if ((paramAnonymousInt2 == 0) && (paramAnonymousInt1 == 0))
            {
              paramAnonymousString = (c)paramAnonymousl;
              d.a(d.this).putString("payu_reference", paramAnonymousString.token);
              if (bi.oW(paramAnonymousString.token)) {
                break label108;
              }
              x.d("MicroMsg.PayUUnbindProcess", "hy: check pwd pass");
              paramAnonymousString = (Bankcard)d.b(d.this).getParcelable("key_bankcard");
              if (paramAnonymousString != null) {
                this.uXK.a(new b(paramAnonymousString.field_bindSerial, d.c(d.this).getString("payu_reference")), true);
              }
            }
          }
          label108:
          while ((!(paramAnonymousl instanceof b)) || (paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            return false;
            x.w("MicroMsg.PayUUnbindProcess", "hy: check pwd failed");
            return false;
          }
          d.d(d.this).putInt("key_errcode_payu", 0);
          d.this.b(this.fEY, d.e(d.this));
          return false;
        }
        
        public final boolean m(Object... paramAnonymousVarArgs)
        {
          d.f(d.this).putString("key_pwd1", (String)paramAnonymousVarArgs[0]);
          this.uXK.a(new c(d.g(d.this).getString("key_pwd1")), true);
          return true;
        }
        
        public final CharSequence ui(int paramAnonymousInt)
        {
          if (paramAnonymousInt == 0) {
            return this.fEY.getString(a.i.wallet_check_pwd_unbind_bankcard_tip_payu);
          }
          return super.ui(paramAnonymousInt);
        }
      };
    }
    return super.a(paramMMActivity, parami);
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    if ((paramActivity instanceof WalletBankcardDetailUI)) {
      c(paramActivity, WalletPayUCheckPwdUI.class, paramBundle);
    }
    while (!(paramActivity instanceof WalletPayUCheckPwdUI)) {
      return;
    }
    b(paramActivity, paramBundle);
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
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
  
  protected final void d(Activity paramActivity, Bundle paramBundle)
  {
    c(paramActivity, WalletPayUBankcardDetailUI.class, paramBundle);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/bind/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */