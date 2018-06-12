package com.tencent.mm.wallet_core.d;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.c;
import com.tencent.mm.wallet_core.c.i;
import com.tencent.mm.wallet_core.tenpay.model.j;
import com.tencent.mm.wallet_core.tenpay.model.m;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public final class h
{
  public static boolean a(WalletBaseUI paramWalletBaseUI, l paraml, int paramInt1, int paramInt2, String paramString)
  {
    int i = 0;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramInt1 == 1000)
    {
      if (!bi.oW(paramString)) {
        break label551;
      }
      paramString = paramWalletBaseUI.getString(a.i.wallet_unknown_err);
    }
    label551:
    for (;;)
    {
      c localc = a.af(paramWalletBaseUI);
      switch (paramInt2)
      {
      default: 
        bool1 = bool2;
        if ((paraml instanceof i)) {
          ((i)paraml).uXo = bool1;
        }
        return bool1;
      case 401: 
        if (!(paraml instanceof j)) {
          break;
        }
      }
      for (paramInt1 = ((j)paraml).ppo;; paramInt1 = 0)
      {
        if (paramInt1 == 1) {
          com.tencent.mm.ui.base.h.a(paramWalletBaseUI, paramString, "", paramWalletBaseUI.getString(a.i.wallet_forget_notretry_password), new h.1(paramWalletBaseUI));
        }
        for (;;)
        {
          bool1 = true;
          break;
          com.tencent.mm.ui.base.h.a(paramWalletBaseUI, false, paramString, "", paramWalletBaseUI.getString(a.i.wallet_forget_password), paramWalletBaseUI.getString(a.i.app_retry), new h.4(paraml, paramWalletBaseUI), new h.5(paramWalletBaseUI));
        }
        bool1 = bool2;
        if (localc == null) {
          break;
        }
        bool1 = localc.a(paramWalletBaseUI, paramInt2, paramString);
        break;
        cDs();
        if (q.GS()) {
          b(paramWalletBaseUI, paramInt2, paramString);
        }
        for (;;)
        {
          bool1 = true;
          break;
          com.tencent.mm.ui.base.h.a(paramWalletBaseUI, paramString, null, false, new h.6(paramWalletBaseUI, paramInt2));
        }
        bool1 = bool2;
        if (localc == null) {
          break;
        }
        bool1 = localc.a(paramWalletBaseUI, paramInt2, paramString);
        break;
        paramInt1 = i;
        if ((paraml instanceof j)) {
          paramInt1 = ((j)paraml).ppo;
        }
        if (paramInt1 == 1) {
          com.tencent.mm.ui.base.h.a(paramWalletBaseUI, paramString, "", paramWalletBaseUI.getString(a.i.wallet_forget_notretry_password), new h.7(paramWalletBaseUI));
        }
        for (;;)
        {
          bool1 = true;
          break;
          com.tencent.mm.ui.base.h.a(paramWalletBaseUI, paramString, "", paramWalletBaseUI.getString(a.i.wallet_retry), paramWalletBaseUI.getString(a.i.app_cancel), new h.8(paramWalletBaseUI), null);
        }
        com.tencent.mm.ui.base.h.a(paramWalletBaseUI, paramString, "", paramWalletBaseUI.getString(a.i.wallet_verify_user_info_tips), paramWalletBaseUI.getString(a.i.app_cancel), new h.9(paramWalletBaseUI), null);
        bool1 = true;
        break;
        cDs();
        b(paramWalletBaseUI, paramInt2, paramString);
        bool1 = true;
        break;
        com.tencent.mm.ui.base.h.a(paramWalletBaseUI, paramWalletBaseUI.getString(a.i.wallet_err_wording_payment_not_match), null, false, new h.10(paramWalletBaseUI, paramInt2));
        bool1 = true;
        break;
        com.tencent.mm.ui.base.h.a(paramWalletBaseUI, paramWalletBaseUI.getString(a.i.wallet_err_wording_not_open_wallet), null, false, new h.11(paramWalletBaseUI, paramInt2));
        bool1 = true;
        break;
      }
    }
  }
  
  private static void b(WalletBaseUI paramWalletBaseUI, final int paramInt, String paramString)
  {
    com.tencent.mm.ui.base.h.a(paramWalletBaseUI, false, paramString, "", paramWalletBaseUI.getString(a.i.wallet_err_wording_contact_me_payu), paramWalletBaseUI.getString(a.i.app_cancel), new h.2(paramWalletBaseUI), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        a.c(this.peV, this.peV.sy, paramInt);
        if ((this.peV.bbR()) || (this.peV.mController.contentView.getVisibility() != 0)) {
          this.peV.finish();
        }
      }
    });
  }
  
  private static void cDs()
  {
    if (!q.GS()) {}
    for (Object localObject = new m();; localObject = new com.tencent.mm.wallet_core.e.a.b())
    {
      g.Ek();
      g.Eh().dpP.a((l)localObject, 0);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/wallet_core/d/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */