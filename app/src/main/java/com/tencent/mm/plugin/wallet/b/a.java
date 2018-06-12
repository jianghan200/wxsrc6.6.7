package com.tencent.mm.plugin.wallet.b;

import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet.a.p;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.pluginsdk.k;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.d;
import java.util.Map;

public final class a
{
  public static boolean bOh()
  {
    k localk = (k)g.l(k.class);
    Object localObject = new StringBuilder("mgr==null?");
    ae localae;
    StringBuilder localStringBuilder;
    if (localk == null)
    {
      bool = true;
      x.i("MicroMsg.WalletUtil", bool);
      if (localk != null) {
        x.i("MicroMsg.WalletUtil", " mgr.isSupportAndLoadSuccess()=" + localk.aNm());
      }
      p.bNp();
      localObject = p.bNq();
      localae = ((ag)localObject).bPw();
      localStringBuilder = new StringBuilder("config==null?");
      if (localae != null) {
        break label202;
      }
    }
    label202:
    for (boolean bool = true;; bool = false)
    {
      x.i("MicroMsg.WalletUtil", bool);
      if (localae != null) {
        x.i("MicroMsg.WalletUtil", "config.isSupportTouchPay()=" + localae.bPl());
      }
      x.i("MicroMsg.WalletUtil", "userInfoManger.isReg()=" + ((ag)localObject).bPs());
      if ((localk == null) || (!localk.aNm()) || (localae == null) || (!localae.bPl()) || (!((ag)localObject).bPs())) {
        break label207;
      }
      return true;
      bool = false;
      break;
    }
    label207:
    return false;
  }
  
  public static boolean bOi()
  {
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.Jx().fJ("100338");
    boolean bool;
    if (localc.isValid()) {
      if (bi.getInt((String)localc.ckq().get("enabled"), 0) == 1) {
        bool = true;
      }
    }
    for (;;)
    {
      x.i("MicroMsg.WalletUtil", "isEnableSaveAndFetchBindQuery enabled: %b", new Object[] { Boolean.valueOf(bool) });
      return bool;
      bool = false;
      continue;
      bool = false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wallet/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */