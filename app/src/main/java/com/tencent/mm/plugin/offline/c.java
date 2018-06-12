package com.tencent.mm.plugin.offline;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.kr;
import com.tencent.mm.plugin.offline.a.k;
import com.tencent.mm.plugin.offline.ui.WalletOfflineEntranceUI;
import com.tencent.mm.plugin.wallet_core.b.b;
import com.tencent.mm.plugin.wallet_core.c.q;
import com.tencent.mm.plugin.wallet_core.c.y;
import com.tencent.mm.plugin.wallet_core.model.p;
import com.tencent.mm.plugin.wallet_core.ui.WalletPwdConfirmUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletVerifyCodeUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class c
  extends b
{
  public final com.tencent.mm.wallet_core.c a(Activity paramActivity, Bundle paramBundle)
  {
    return super.a(paramActivity, paramBundle);
  }
  
  public final g a(MMActivity paramMMActivity, i parami)
  {
    if ((paramMMActivity instanceof WalletVerifyCodeUI)) {
      new g(paramMMActivity, parami)
      {
        public final boolean d(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, l paramAnonymousl)
        {
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0)) {
            if ((paramAnonymousl instanceof y))
            {
              if ((((WalletBaseUI)this.fEY).sy != null) && (((WalletBaseUI)this.fEY).sy.getInt("key_bind_scene", -1) == 5) && (!com.tencent.mm.plugin.offline.c.a.bly()))
              {
                c.g(this.fEY);
                return true;
              }
            }
            else if ((paramAnonymousl instanceof k))
            {
              com.tencent.mm.wallet_core.a.j(this.fEY, ((WalletBaseUI)this.fEY).sy);
              com.tencent.mm.plugin.offline.c.a.C(this.fEY);
              return true;
            }
          }
          return false;
        }
        
        public final boolean m(Object... paramAnonymousVarArgs)
        {
          paramAnonymousVarArgs = (p)paramAnonymousVarArgs[1];
          paramAnonymousVarArgs.flag = "2";
          this.uXK.a(new q(paramAnonymousVarArgs), true, 1);
          return true;
        }
      };
    }
    if ((paramMMActivity instanceof WalletPwdConfirmUI)) {
      return new c.2(this, paramMMActivity, parami);
    }
    return super.a(paramMMActivity, parami);
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle)
  {
    super.a(paramActivity, paramInt, paramBundle);
  }
  
  public final String aNK()
  {
    return "OfflineBindCardProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    com.tencent.mm.sdk.b.a.sFg.m(new kr());
    if (com.tencent.mm.plugin.offline.c.a.bly()) {
      c(paramActivity, WalletOfflineEntranceUI.class);
    }
    for (;;)
    {
      if (paramActivity != null) {
        paramActivity.finish();
      }
      return;
      if (paramBundle.getInt("key_entry_scene", -1) == 2) {
        e(paramActivity, "offline", "ui.WalletOfflineEntranceUI");
      } else {
        e(paramActivity, "mall", ".ui.MallIndexUI");
      }
    }
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return super.c(paramActivity, paramBundle);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/offline/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */