package com.tencent.mm.plugin.wallet.balance;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchPwdInputUI;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchResultUI;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceFetchUI;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceManagerUI;
import com.tencent.mm.plugin.wallet.balance.ui.WalletBalanceResultUI;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.Authen;
import com.tencent.mm.plugin.wallet_core.model.Bankcard;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardElementUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletConfirmCardIDUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletSetPasswordUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.plugin.wxpay.a.h;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.tenpay.model.j;
import com.tencent.mm.wallet_core.ui.e;
import java.text.SimpleDateFormat;
import java.util.Date;

public class b
  extends c
{
  public final int a(MMActivity paramMMActivity, int paramInt)
  {
    return a.i.wallet_balance_fetch_finish_confirm;
  }
  
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    com.tencent.mm.wallet_core.c.p.GZ(14);
    if ((paramActivity instanceof WalletBalanceFetchUI))
    {
      com.tencent.mm.plugin.wallet.a.p.bNp();
      if (com.tencent.mm.plugin.wallet.a.p.bNq().bPs())
      {
        if ((Bankcard)this.jfZ.getParcelable("key_bankcard") != null)
        {
          this.jfZ.putInt("key_pay_flag", 3);
          this.jfZ.putString("key_pwd_cash_title", paramActivity.getString(a.i.wallet_balance_fetch_title));
          Orders localOrders = (Orders)this.jfZ.getParcelable("key_orders");
          if (localOrders != null) {
            this.jfZ.putString("key_pwd_cash_money", e.B(localOrders.mBj));
          }
          c(paramActivity, WalletBalanceFetchPwdInputUI.class, paramBundle);
          return this;
        }
        this.jfZ.putInt("key_pay_flag", 2);
        c(paramActivity, WalletCheckPwdUI.class, paramBundle);
        return this;
      }
      this.jfZ.putInt("key_pay_flag", 1);
      c(paramActivity, WalletBankcardIdUI.class, paramBundle);
      return this;
    }
    c(paramActivity, WalletBalanceFetchUI.class, paramBundle);
    return this;
  }
  
  public final g a(MMActivity paramMMActivity, i parami)
  {
    if ((paramMMActivity instanceof WalletBalanceFetchUI)) {
      return new b.1(this, paramMMActivity, parami);
    }
    if ((paramMMActivity instanceof WalletBalanceFetchPwdInputUI)) {
      new g(paramMMActivity, parami)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
        {
          boolean bool = false;
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0) && ((paramAnonymousl instanceof com.tencent.mm.plugin.wallet.pay.a.a.b)))
          {
            paramAnonymousString = (com.tencent.mm.plugin.wallet.pay.a.a.b)paramAnonymousl;
            b.b(b.this).putString("kreq_token", paramAnonymousString.token);
            b.c(b.this).putParcelable("key_authen", paramAnonymousString.pfc);
            paramAnonymousl = b.d(b.this);
            if (!paramAnonymousString.pfa) {
              bool = true;
            }
            paramAnonymousl.putBoolean("key_need_verify_sms", bool);
            paramAnonymousString = paramAnonymousString.lJN;
            if (paramAnonymousString != null) {
              b.e(b.this).putParcelable("key_realname_guide_helper", paramAnonymousString);
            }
            a.j(this.fEY, b.f(b.this));
            this.fEY.finish();
            return true;
          }
          return false;
        }
        
        public final boolean m(Object... paramAnonymousVarArgs)
        {
          Bankcard localBankcard = (Bankcard)b.g(b.this).getParcelable("key_bankcard");
          Object localObject = (String)paramAnonymousVarArgs[0];
          b.h(b.this).putString("key_pwd1", (String)localObject);
          b.i(b.this).putString("key_mobile", localBankcard.field_mobile);
          localObject = new Authen();
          ((Authen)localObject).bWA = 3;
          ((Authen)localObject).pli = ((String)paramAnonymousVarArgs[0]);
          ((Authen)localObject).lMW = localBankcard.field_bindSerial;
          ((Authen)localObject).lMV = localBankcard.field_bankcardType;
          ((Authen)localObject).mpb = ((PayInfo)b.j(b.this).getParcelable("key_pay_info"));
          ((Authen)localObject).plq = localBankcard.field_arrive_type;
          this.uXK.a(new com.tencent.mm.plugin.wallet.pay.a.a.b((Authen)localObject, (Orders)b.k(b.this).getParcelable("key_orders")), true, 1);
          return true;
        }
      };
    }
    if ((paramMMActivity instanceof WalletCardElementUI)) {
      new g(paramMMActivity, parami)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
        {
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            if ((paramAnonymousl instanceof com.tencent.mm.plugin.wallet.pay.a.a.b))
            {
              paramAnonymousString = (com.tencent.mm.plugin.wallet.pay.a.a.b)paramAnonymousl;
              b.l(b.this).putString("kreq_token", paramAnonymousString.token);
              if (paramAnonymousString.pgm) {
                b.m(b.this).putParcelable("key_orders", paramAnonymousString.pfb);
              }
            }
            if (b.this.c(this.fEY, null))
            {
              this.uXK.a(new y(b.n(b.this), 13), true, 1);
              return true;
            }
            b.this.a(this.fEY, 0, b.o(b.this));
            return true;
          }
          return false;
        }
        
        public final boolean m(Object... paramAnonymousVarArgs)
        {
          Authen localAuthen = (Authen)paramAnonymousVarArgs[0];
          paramAnonymousVarArgs = (Orders)paramAnonymousVarArgs[1];
          switch (b.p(b.this).getInt("key_pay_flag", 0))
          {
          default: 
            return false;
          case 1: 
            if (!b.this.bQH()) {
              localAuthen.bWA = 1;
            }
            break;
          }
          for (;;)
          {
            b.q(b.this).putParcelable("key_authen", localAuthen);
            this.uXK.a(new com.tencent.mm.plugin.wallet.pay.a.a.b(localAuthen, paramAnonymousVarArgs), true, 1);
            return true;
            localAuthen.bWA = 4;
            continue;
            if (!b.this.bQH())
            {
              localAuthen.bWA = 2;
            }
            else
            {
              localAuthen.bWA = 5;
              continue;
              if (!b.this.bQH()) {
                localAuthen.bWA = 3;
              } else {
                localAuthen.bWA = 6;
              }
            }
          }
        }
      };
    }
    if ((paramMMActivity instanceof WalletVerifyCodeUI)) {
      return new b.4(this, paramMMActivity, parami);
    }
    if ((paramMMActivity instanceof WalletBalanceFetchResultUI)) {
      new g(paramMMActivity, parami)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
        {
          return false;
        }
        
        public final boolean m(Object... paramAnonymousVarArgs)
        {
          return false;
        }
        
        public final boolean r(Object... paramAnonymousVarArgs)
        {
          Orders localOrders = (Orders)b.A(b.this).getParcelable("key_orders");
          Bankcard localBankcard = o.bOW().paw;
          localBankcard.plV -= localOrders.mBj;
          b.B(b.this).putInt("key_balance_result_logo", a.h.remittance_wait);
          return super.r(paramAnonymousVarArgs);
        }
        
        public final CharSequence ui(int paramAnonymousInt)
        {
          switch (paramAnonymousInt)
          {
          }
          Orders localOrders;
          do
          {
            return super.ui(paramAnonymousInt);
            return this.fEY.getString(a.i.wallet_balance_result_fetch_title);
            localOrders = (Orders)b.C(b.this).getParcelable("key_orders");
            if ((localOrders != null) && (!bi.oW(localOrders.ppa))) {
              return localOrders.ppa;
            }
            return this.fEY.getString(a.i.wallet_balance_result_fetch_request_title);
            localOrders = (Orders)b.D(b.this).getParcelable("key_orders");
          } while ((localOrders == null) || (localOrders.poZ <= 0L));
          return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(localOrders.poZ));
        }
      };
    }
    if ((paramMMActivity instanceof WalletPwdConfirmUI)) {
      return new b.6(this, paramMMActivity, parami);
    }
    return super.a(paramMMActivity, parami);
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    if ((paramActivity instanceof WalletBalanceFetchUI))
    {
      com.tencent.mm.plugin.wallet.a.p.bNp();
      if (com.tencent.mm.plugin.wallet.a.p.bNq().bPs()) {
        if ((Bankcard)this.jfZ.getParcelable("key_bankcard") != null)
        {
          this.jfZ.putInt("key_pay_flag", 3);
          this.jfZ.putString("key_pwd_cash_title", paramActivity.getString(a.i.wallet_balance_fetch_title));
          Orders localOrders = (Orders)this.jfZ.getParcelable("key_orders");
          if (localOrders != null) {
            this.jfZ.putString("key_pwd_cash_money", e.B(localOrders.mBj));
          }
          c(paramActivity, WalletBalanceFetchPwdInputUI.class, paramBundle);
        }
      }
    }
    do
    {
      return;
      this.jfZ.putInt("key_pay_flag", 2);
      c(paramActivity, WalletCheckPwdUI.class, paramBundle);
      return;
      this.jfZ.putInt("key_pay_flag", 1);
      c(paramActivity, WalletBankcardIdUI.class, paramBundle);
      return;
      if ((paramActivity instanceof WalletBalanceFetchPwdInputUI))
      {
        if (paramBundle.getBoolean("key_need_verify_sms", false))
        {
          c(paramActivity, WalletVerifyCodeUI.class, paramBundle);
          return;
        }
        c(paramActivity, WalletBalanceFetchResultUI.class, paramBundle);
        return;
      }
      if ((paramActivity instanceof WalletCheckPwdUI))
      {
        c(paramActivity, WalletBankcardIdUI.class, paramBundle);
        return;
      }
      if (((paramActivity instanceof WalletBankcardIdUI)) || ((paramActivity instanceof WalletConfirmCardIDUI)))
      {
        c(paramActivity, WalletCardElementUI.class, paramBundle);
        return;
      }
      if ((paramActivity instanceof WalletCardElementUI))
      {
        c(paramActivity, WalletVerifyCodeUI.class, paramBundle);
        return;
      }
      if ((paramActivity instanceof WalletVerifyCodeUI))
      {
        com.tencent.mm.plugin.wallet.a.p.bNp();
        if (com.tencent.mm.plugin.wallet.a.p.bNq().bPs())
        {
          c(paramActivity, WalletBalanceFetchResultUI.class, paramBundle);
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
        c(paramActivity, WalletBalanceFetchResultUI.class, paramBundle);
        return;
      }
    } while (!(paramActivity instanceof WalletBalanceFetchResultUI));
    b(paramActivity, paramBundle);
  }
  
  public final String aNK()
  {
    return "BalanceFetchProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    a(paramActivity, WalletBalanceManagerUI.class, -1, true);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    if ((paramActivity instanceof WalletPwdConfirmUI))
    {
      a(paramActivity, WalletSetPasswordUI.class, paramInt);
      return;
    }
    if ((paramActivity instanceof WalletBalanceResultUI))
    {
      com.tencent.mm.wallet_core.c.p.cDe();
      b(paramActivity, this.jfZ);
      return;
    }
    com.tencent.mm.wallet_core.c.p.cDe();
    z(paramActivity);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */