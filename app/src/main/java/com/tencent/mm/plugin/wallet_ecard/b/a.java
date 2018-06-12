package com.tencent.mm.plugin.wallet_ecard.b;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.plugin.wallet_core.b.b;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wallet_core.model.o;
import com.tencent.mm.plugin.wallet_core.ui.WalletBankcardIdUI;
import com.tencent.mm.plugin.wallet_core.ui.WalletCardImportUI;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.c.q;

public class a
  extends b
{
  public final com.tencent.mm.wallet_core.c a(Activity paramActivity, Bundle paramBundle)
  {
    y(new Object[] { "start", paramActivity, paramBundle });
    x.d("MicroMsg.BindCardProcess", "start Process : BindCardProcess");
    if (paramBundle != null)
    {
      q.fu(6, paramBundle.getInt("key_bind_scene"));
      p.GZ(paramBundle.getInt("key_bind_scene"));
    }
    while (o.bOW().bPs()) {
      if (paramBundle != null)
      {
        if (paramBundle.getBoolean("key_is_import_bind", false))
        {
          c(paramActivity, WalletCardImportUI.class, paramBundle);
          return this;
          q.fu(6, 0);
          p.GZ(0);
        }
        else
        {
          c(paramActivity, WalletBankcardIdUI.class, paramBundle);
          return this;
        }
      }
      else {
        return super.a(paramActivity, paramBundle);
      }
    }
    if (paramBundle != null) {
      com.tencent.mm.plugin.wallet_core.e.c.ea(paramBundle.getInt("key_bind_scene", 0), 1);
    }
    if ((paramBundle != null) && (paramBundle.getBoolean("key_is_import_bind", false)))
    {
      c(paramActivity, WalletCardImportUI.class, paramBundle);
      return this;
    }
    return super.a(paramActivity, paramBundle);
  }
  
  public final String aNK()
  {
    return "OpenECardBindCardProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    if ((paramBundle != null) && (paramBundle.getBoolean("intent_bind_end", false)))
    {
      a(paramActivity, "wallet_ecard", ".ui.WalletECardBindCardListUI", -1, new Intent(), true);
      return;
    }
    a(paramActivity, "wallet_ecard", ".ui.WalletECardBindCardListUI", 0, new Intent(), true);
    paramActivity.finish();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_ecard/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */