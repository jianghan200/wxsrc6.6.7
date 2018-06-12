package com.tencent.mm.plugin.wxcredit;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.mm.plugin.wallet_core.ui.WalletCheckPwdUI;
import com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditDetailUI;
import com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditErrDetailUI;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class d
  extends c
{
  public final c a(Activity paramActivity, Bundle paramBundle)
  {
    x.d("MicroMsg.WXCreditManagerProcess", "start Process : WXCreditManagerProcess");
    c(paramActivity, WalletWXCreditDetailUI.class, paramBundle);
    return this;
  }
  
  public final g a(MMActivity paramMMActivity, i parami)
  {
    if ((paramMMActivity instanceof WalletWXCreditDetailUI)) {
      return new d.1(this, paramMMActivity, parami);
    }
    if ((paramMMActivity instanceof WalletCheckPwdUI)) {
      return new d.2(this, paramMMActivity, parami);
    }
    return super.a(paramMMActivity, parami);
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    if (paramInt == 1)
    {
      c(paramActivity, WalletWXCreditErrDetailUI.class, paramBundle);
      paramActivity.finish();
    }
    do
    {
      return;
      if ((paramActivity instanceof WalletWXCreditDetailUI))
      {
        c(paramActivity, WalletCheckPwdUI.class, paramBundle);
        return;
      }
      if ((paramActivity instanceof WalletCheckPwdUI))
      {
        b(paramActivity, paramBundle);
        return;
      }
    } while (!(paramActivity instanceof WalletWXCreditErrDetailUI));
    c(paramActivity, WalletCheckPwdUI.class, paramBundle);
  }
  
  public final String aNK()
  {
    return "WXCreditManagerProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    e(paramActivity, "mall", ".ui.MallIndexUI");
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wxcredit/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */