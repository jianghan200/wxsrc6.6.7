package com.tencent.mm.plugin.wxcredit;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet_core.b.a.b;
import com.tencent.mm.plugin.wallet_core.c.q;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wallet_core.model.p;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.plugin.wxcredit.a.h;
import com.tencent.mm.plugin.wxcredit.ui.WalletBindDepositUI;
import com.tencent.mm.plugin.wxcredit.ui.WalletCheckIdentityUI;
import com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenResultUI;
import com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditOpenUI;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.i;

public class e
  extends c
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    if (!o.bOW().bPr())
    {
      if (o.bOW().bPs()) {
        c(paramActivity, WalletCheckPwdUI.class, paramBundle);
      }
    }
    else {
      return this;
    }
    c(paramActivity, WalletWXCreditOpenUI.class, paramBundle);
    return this;
  }
  
  public final com.tencent.mm.wallet_core.d.g a(MMActivity paramMMActivity, i parami)
  {
    if ((paramMMActivity instanceof WalletCheckPwdUI)) {
      return new e.1(this, paramMMActivity, parami);
    }
    if ((paramMMActivity instanceof WalletCheckIdentityUI)) {
      return new e.2(this, paramMMActivity, parami);
    }
    if ((paramMMActivity instanceof WalletVerifyCodeUI)) {
      new com.tencent.mm.wallet_core.d.g(paramMMActivity, parami)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
        {
          boolean bool2 = false;
          boolean bool1 = bool2;
          if (paramAnonymousInt1 == 0)
          {
            bool1 = bool2;
            if (paramAnonymousInt2 == 0)
            {
              if (!(paramAnonymousl instanceof com.tencent.mm.plugin.wxcredit.a.g)) {
                break label81;
              }
              paramAnonymousString = ((com.tencent.mm.plugin.wxcredit.a.g)paramAnonymousl).bVX;
              if (!bi.oW(paramAnonymousString)) {
                e.q(e.this).putString("key_bank_username", paramAnonymousString);
              }
              e.this.a(this.fEY, 0, e.r(e.this));
              bool1 = true;
            }
          }
          label81:
          do
          {
            return bool1;
            if ((paramAnonymousl instanceof h))
            {
              e.this.a(this.fEY, 0, e.s(e.this));
              return true;
            }
            if ((paramAnonymousl instanceof q))
            {
              if (o.bOW().bPs())
              {
                this.uXK.a(new y(), true, 1);
                return true;
              }
              e.this.a(this.fEY, 0, e.t(e.this));
              return true;
            }
            bool1 = bool2;
          } while (!(paramAnonymousl instanceof y));
          paramAnonymousString = o.bOW().bPH();
          paramAnonymousString = new com.tencent.mm.plugin.wxcredit.a.g(e.u(e.this).getString("key_verify_code"), e.v(e.this).getString("KEY_SESSION_KEY"), e.w(e.this).getString("key_pwd1"), paramAnonymousString, e.x(e.this).getString("key_bank_type"));
          this.uXK.a(paramAnonymousString, true, 1);
          return true;
        }
        
        public final boolean m(Object... paramAnonymousVarArgs)
        {
          String str = (String)paramAnonymousVarArgs[0];
          e.y(e.this).putString("key_verify_code", str);
          if (o.bOW().bPs())
          {
            if ((e.z(e.this).getBoolean("key_need_bind_deposit", true)) && (!e.A(e.this).getBoolean("key_is_bank_user")))
            {
              paramAnonymousVarArgs = (p)paramAnonymousVarArgs[1];
              paramAnonymousVarArgs.flag = "2";
              this.uXK.a(new q(paramAnonymousVarArgs), true, 1);
              return true;
            }
            this.uXK.a(new com.tencent.mm.plugin.wxcredit.a.g(str, e.B(e.this).getString("KEY_SESSION_KEY"), e.C(e.this).getString("key_pwd1"), e.D(e.this).getString("key_bind_serial"), e.E(e.this).getString("key_bank_type")), true, 1);
            return true;
          }
          if (e.F(e.this).getBoolean("key_is_bank_user", false))
          {
            e.G(e.this).putString("key_verify_code", str);
            this.uXK.a(new h(str, e.H(e.this).getString("KEY_SESSION_KEY"), e.I(e.this).getString("key_pwd1"), e.J(e.this).getString("key_bind_serial"), e.K(e.this).getString("key_bank_type")), true, 1);
            return true;
          }
          paramAnonymousVarArgs = (p)paramAnonymousVarArgs[1];
          paramAnonymousVarArgs.flag = "1";
          this.uXK.a(new q(paramAnonymousVarArgs), true, 1);
          return true;
        }
      };
    }
    if ((paramMMActivity instanceof WalletBindDepositUI)) {
      return new e.4(this, paramMMActivity, parami);
    }
    if ((paramMMActivity instanceof WalletPwdConfirmUI)) {
      new com.tencent.mm.wallet_core.d.g(paramMMActivity, parami)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
        {
          boolean bool2 = false;
          boolean bool1 = bool2;
          if (paramAnonymousInt1 == 0)
          {
            bool1 = bool2;
            if (paramAnonymousInt2 == 0)
            {
              if (!(paramAnonymousl instanceof b)) {
                break label49;
              }
              this.uXK.a(new y(), true, 1);
              bool1 = true;
            }
          }
          label49:
          do
          {
            return bool1;
            if ((paramAnonymousl instanceof y))
            {
              paramAnonymousString = new com.tencent.mm.plugin.wxcredit.a.g(e.aa(e.this).getString("key_verify_code"), e.ab(e.this).getString("KEY_SESSION_KEY"), e.ac(e.this).getString("key_pwd1"), o.bOW().bPH(), e.ad(e.this).getString("key_bank_type"));
              this.uXK.a(paramAnonymousString, true, 1);
              return true;
            }
            bool1 = bool2;
          } while (!(paramAnonymousl instanceof com.tencent.mm.plugin.wxcredit.a.g));
          paramAnonymousString = ((com.tencent.mm.plugin.wxcredit.a.g)paramAnonymousl).bVX;
          if (!bi.oW(paramAnonymousString)) {
            e.ae(e.this).putString("key_bank_username", paramAnonymousString);
          }
          e.this.a(this.fEY, 0, e.af(e.this));
          return true;
        }
        
        public final boolean m(Object... paramAnonymousVarArgs)
        {
          if (!e.ag(e.this).getBoolean("key_is_bank_user", false))
          {
            this.uXK.a(new b((p)paramAnonymousVarArgs[0]), true, 1);
            return true;
          }
          this.uXK.a(new com.tencent.mm.plugin.wxcredit.a.g(e.ah(e.this).getString("key_verify_code"), e.ai(e.this).getString("KEY_SESSION_KEY"), e.aj(e.this).getString("key_pwd1"), o.bOW().bPH(), e.ak(e.this).getString("key_bank_type")), true, 1);
          return true;
        }
      };
    }
    if ((paramMMActivity instanceof WalletWXCreditOpenResultUI)) {
      return new e.6(this, paramMMActivity, parami);
    }
    return null;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    if ((paramActivity instanceof WalletWXCreditOpenUI)) {
      c(paramActivity, WalletCheckIdentityUI.class, paramBundle);
    }
    do
    {
      return;
      if ((paramActivity instanceof WalletCheckPwdUI))
      {
        z(paramActivity);
        c(paramActivity, WalletWXCreditOpenUI.class, paramBundle);
        return;
      }
      if ((paramActivity instanceof WalletWXCreditOpenUI))
      {
        c(paramActivity, WalletCheckIdentityUI.class, paramBundle);
        return;
      }
      if ((paramActivity instanceof WalletCheckIdentityUI))
      {
        if (paramBundle.getBoolean("key_need_bind_deposit", true))
        {
          c(paramActivity, WalletBindDepositUI.class, paramBundle);
          return;
        }
        c(paramActivity, WalletVerifyCodeUI.class, paramBundle);
        return;
      }
      if ((paramActivity instanceof WalletBindDepositUI))
      {
        c(paramActivity, WalletVerifyCodeUI.class, paramBundle);
        return;
      }
      if ((paramActivity instanceof WalletVerifyCodeUI))
      {
        if (o.bOW().bPs())
        {
          c(paramActivity, WalletWXCreditOpenResultUI.class, paramBundle);
          return;
        }
        c(paramActivity, WalletSetPasswordUI.class, paramBundle);
        return;
      }
      if ((paramActivity instanceof WalletSetPasswordUI))
      {
        c(paramActivity, WalletPwdConfirmUI.class, paramBundle);
        return;
      }
      if ((paramActivity instanceof WalletPwdConfirmUI))
      {
        c(paramActivity, WalletWXCreditOpenResultUI.class, paramBundle);
        return;
      }
    } while (!(paramActivity instanceof WalletWXCreditOpenResultUI));
    b(paramActivity, paramBundle);
  }
  
  public final String aNK()
  {
    return "WXCreditOpenProcess";
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/wxcredit/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */