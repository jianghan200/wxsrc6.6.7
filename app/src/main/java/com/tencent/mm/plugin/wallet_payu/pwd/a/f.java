package com.tencent.mm.plugin.wallet_payu.pwd.a;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.mm.plugin.wallet_payu.pwd.ui.WalletPayUSetPasswordUI;
import com.tencent.mm.plugin.wallet_payu.security_question.model.a;
import com.tencent.mm.plugin.wallet_payu.security_question.ui.WalletPayUSecurityQuestionAnswerUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class f
  extends e
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    c(paramActivity, WalletPayUSecurityQuestionAnswerUI.class, paramBundle);
    return super.a(paramActivity, paramBundle);
  }
  
  public final g a(MMActivity paramMMActivity, i parami)
  {
    if ((paramMMActivity instanceof WalletPayUSecurityQuestionAnswerUI)) {
      return new a(paramMMActivity, parami, this.jfZ);
    }
    return super.a(paramMMActivity, parami);
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    if ((paramActivity instanceof WalletPayUSecurityQuestionAnswerUI))
    {
      c(paramActivity, WalletPayUSetPasswordUI.class, paramBundle);
      return;
    }
    super.a(paramActivity, paramInt, paramBundle);
  }
  
  public final String aNK()
  {
    return "PayUForgotPwdProcess";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/pwd/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */