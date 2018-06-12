package com.tencent.mm.plugin.wxcredit;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wxcredit.a.e;
import com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountResultUI;
import com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class b
  extends com.tencent.mm.wallet_core.c
{
  public final com.tencent.mm.wallet_core.c a(Activity paramActivity, Bundle paramBundle)
  {
    x.d("MicroMsg.WXCreditChangeAmountProcess", "start Process : WXCreditChangeAmountProcess");
    c(paramActivity, WalletCheckPwdUI.class, paramBundle);
    return this;
  }
  
  public final g a(MMActivity paramMMActivity, i parami)
  {
    if ((paramMMActivity instanceof WalletWXCreditChangeAmountUI)) {
      new g(paramMMActivity, parami)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
        {
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if (!(paramAnonymousl instanceof e)) {
              break label38;
            }
            b.a(b.this).putString("kreq_token", ((e)paramAnonymousl).token);
          }
          label38:
          while (!(paramAnonymousl instanceof com.tencent.mm.plugin.wxcredit.a.c)) {
            return false;
          }
          b.b(b.this).putDouble("key_credit_amount", ((com.tencent.mm.plugin.wxcredit.a.c)paramAnonymousl).qwm);
          b.this.a(this.fEY, 0, b.c(b.this));
          return true;
        }
        
        public final boolean m(Object... paramAnonymousVarArgs)
        {
          paramAnonymousVarArgs = (Bankcard)b.d(b.this).getParcelable("key_bankcard");
          this.uXK.a(new e(paramAnonymousVarArgs.field_bindSerial), true, 1);
          return true;
        }
      };
    }
    if ((paramMMActivity instanceof WalletCheckPwdUI)) {
      return new b.2(this, paramMMActivity, parami);
    }
    return null;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    if ((paramActivity instanceof WalletCheckPwdUI)) {
      c(paramActivity, WalletWXCreditChangeAmountUI.class, paramBundle);
    }
    do
    {
      return;
      if ((paramActivity instanceof WalletWXCreditChangeAmountUI))
      {
        c(paramActivity, WalletWXCreditChangeAmountResultUI.class, paramBundle);
        return;
      }
    } while (!(paramActivity instanceof WalletWXCreditChangeAmountResultUI));
    b(paramActivity, paramBundle);
  }
  
  public final String aNK()
  {
    return "WXCreditChangeAmountProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    e(paramActivity, "wallet", ".bind.ui.WalletBankcardManageUI");
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    z(paramActivity);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wxcredit/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */