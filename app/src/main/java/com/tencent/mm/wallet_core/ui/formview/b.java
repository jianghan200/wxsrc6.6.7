package com.tencent.mm.wallet_core.ui.formview;

import android.content.res.Resources;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tenpay.android.wechat.TenpaySecureEditText;

public final class b
{
  private static int uYB = 0;
  private static int uYC = 0;
  private static final int uZv = a.f.wallet_date_dialog_tag_id;
  
  public static void a(MMActivity paramMMActivity, int paramInt1, int paramInt2)
  {
    if (paramInt1 == -1) {
      return;
    }
    paramMMActivity.addDialog(com.tencent.mm.wallet_core.ui.b.a(paramMMActivity, paramInt1, paramMMActivity.getResources().getString(paramInt2), paramMMActivity.getResources().getString(a.i.wallet_i_know_it), new b.2()));
  }
  
  static void a(TenpaySecureEditText paramTenpaySecureEditText, int paramInt)
  {
    if (paramTenpaySecureEditText != null)
    {
      if (paramInt == 1)
      {
        paramTenpaySecureEditText.setIsPasswordFormat(true);
        return;
      }
      if (paramInt == 2)
      {
        paramTenpaySecureEditText.setIsSecurityAnswerFormat(true);
        return;
      }
      if (paramInt == 3)
      {
        paramTenpaySecureEditText.setIsCvvPaymentFormat(true);
        return;
      }
      if (paramInt == 4)
      {
        paramTenpaySecureEditText.setIsCvv4PaymentFormat(true);
        return;
      }
      if (paramInt == 5)
      {
        paramTenpaySecureEditText.setIsValidThru(true);
        return;
      }
      if (paramInt == 6)
      {
        paramTenpaySecureEditText.setIsBankcardFormat(true);
        return;
      }
      if (paramInt == 7)
      {
        paramTenpaySecureEditText.setIsMoneyAmountFormat(true);
        return;
      }
      if (paramInt == 8)
      {
        paramTenpaySecureEditText.setIsIdCardTailFormat(true);
        return;
      }
      paramTenpaySecureEditText.setIsCvv4PaymentFormat(false);
      return;
    }
    x.e("MicroMsg.FormatViewUtil", "hy: param error: no edit text view");
  }
  
  public static void f(MMActivity paramMMActivity, WalletFormView paramWalletFormView)
  {
    paramWalletFormView.setOnClickListener(new b.1(paramMMActivity, paramWalletFormView));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/wallet_core/ui/formview/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */