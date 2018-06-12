package com.tencent.mm.wallet_core.ui;

import android.content.res.Resources;
import android.os.Bundle;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.c.i;
import com.tencent.mm.wallet_core.e.a.b;
import com.tencent.mm.wallet_core.tenpay.model.m;

public final class f
{
  private static String fGO = null;
  private static int isA;
  private static int isM = 0;
  
  static
  {
    isA = 0;
  }
  
  public static void a(WalletBaseUI paramWalletBaseUI, int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml, boolean paramBoolean)
  {
    int j = 1;
    String str = paramString;
    if (bi.oW(paramString)) {
      str = paramWalletBaseUI.getString(a.i.wallet_unknown_err);
    }
    if ((paraml instanceof i)) {}
    for (boolean bool1 = ((i)paraml).bkU();; bool1 = true)
    {
      if ((paraml instanceof com.tencent.mm.wallet_core.c.g)) {
        bool1 = ((com.tencent.mm.wallet_core.c.g)paraml).caB;
      }
      for (;;)
      {
        x.i("MicroMsg.WalletDispatcher", "dispatch errType:%d errCode %s ,errMsg: %s, isBlock %s scene: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), str, Boolean.valueOf(bool1), paraml });
        boolean bool2;
        Bundle localBundle;
        if ((!(paraml instanceof m)) && (!(paraml instanceof b)))
        {
          if (!(paraml instanceof i)) {
            break label578;
          }
          paramString = (i)paraml;
          if (paramString.uXh != null) {
            break label461;
          }
          bool2 = false;
          if (!bool2) {
            break label478;
          }
          x.d("MicroMsg.WalletDispatcher", "order pay end!!!");
          localBundle = paramWalletBaseUI.sy;
          localBundle.putInt("intent_pay_end_errcode", paramInt2);
          localBundle.putString("intent_pay_app_url", paramString.uXi);
          localBundle.putString("intent_wap_pay_jump_url", paramString.uXj);
          localBundle.putBoolean("intent_pay_end", true);
          a.k(paramWalletBaseUI, localBundle);
          label204:
          if ((!bool1) || (!com.tencent.mm.wallet_core.d.h.a(paramWalletBaseUI, paraml, paramInt1, paramInt2, str)) || (paramString.bOn())) {
            break label710;
          }
        }
        label309:
        label461:
        label478:
        label578:
        label660:
        label665:
        label697:
        label710:
        for (int i = 0;; i = 1)
        {
          if (i != 0) {
            if (((paramWalletBaseUI.cDK() == null) || (!paramWalletBaseUI.cDL().d(paramInt1, paramInt2, str, paraml))) && (!paramWalletBaseUI.d(paramInt1, paramInt2, str, (i)paraml)) && (bool1))
            {
              if ((paramInt1 != 0) || (paramInt2 != 0))
              {
                isM = paramInt1;
                isA = paramInt2;
                fGO = str;
                x.d("MicroMsg.WalletDispatcher", "wallet base consume this response in the end!");
              }
            }
            else if (paramBoolean)
            {
              x.d("MicroMsg.WalletDispatcher", "scenes & forcescenes isEmpty! %s", new Object[] { Boolean.valueOf(bool1) });
              if (isA == 0) {
                break label697;
              }
              x.e("MicroMsg.WalletDispatcher", "showAlert! mErrCode : " + isA);
              if (!(paraml instanceof i)) {
                break label660;
              }
              paramString = ((i)paraml).cCY();
              if (bi.oW(paramString)) {
                break label660;
              }
              x.i("MicroMsg.WalletDispatcher", "error_detail_url is not null ");
              com.tencent.mm.ui.base.h.a(paramWalletBaseUI.mController.tml, fGO, null, paramWalletBaseUI.getResources().getString(a.i.wallet_err_alert_btn_err_detail_text), paramWalletBaseUI.getResources().getString(a.i.app_ok), true, new f.2(paramWalletBaseUI, paramString), new f.3(paramWalletBaseUI));
              cDI();
              e.He(4);
              paramInt1 = j;
              if (paramInt1 == 0) {
                break label665;
              }
            }
          }
          while (paramWalletBaseUI.aWj())
          {
            for (;;)
            {
              return;
              bool2 = "1".equals(paramString.uXh.trim());
              break;
              if ((!(paraml instanceof com.tencent.mm.wallet_core.tenpay.model.l)) || (!((com.tencent.mm.wallet_core.tenpay.model.l)paraml).pgm)) {
                break label204;
              }
              x.i("MicroMsg.WalletDispatcher", "delay order pay end");
              localBundle = paramWalletBaseUI.sy;
              localBundle.putInt("intent_pay_end_errcode", paramInt2);
              localBundle.putString("intent_pay_app_url", paramString.uXi);
              localBundle.putString("intent_wap_pay_jump_url", paramString.uXj);
              localBundle.putBoolean("intent_pay_end", true);
              a.k(paramWalletBaseUI, localBundle);
              break label204;
              x.d("MicroMsg.WalletDispatcher", "wallet this response havn't error!");
              break label309;
              x.d("MicroMsg.WalletDispatcher", "wallet base consume this response before subclass!");
              break label309;
              if (((paramWalletBaseUI.cDK() != null) && (paramWalletBaseUI.cDL().d(paramInt1, paramInt2, str, paraml))) || (paramWalletBaseUI.d(paramInt1, paramInt2, str, paraml)) || (!bool1)) {
                break label309;
              }
              if ((paramInt1 != 0) || (paramInt2 != 0))
              {
                isM = paramInt1;
                isA = paramInt2;
                fGO = str;
                x.d("MicroMsg.WalletDispatcher", "wallet base consume this response in the end!");
                break label309;
              }
              x.d("MicroMsg.WalletDispatcher", "wallet other scene this response havn't error!");
              break label309;
              paramInt1 = 0;
            }
            x.i("MicroMsg.WalletDispatcher", "error_detail_url is null ");
            com.tencent.mm.ui.base.h.a(paramWalletBaseUI.mController.tml, fGO, null, false, new f.1(paramWalletBaseUI));
            return;
          }
          paramWalletBaseUI.ux(0);
          return;
        }
      }
    }
  }
  
  public static void cDI()
  {
    isM = 0;
    isA = 0;
    fGO = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/wallet_core/ui/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */