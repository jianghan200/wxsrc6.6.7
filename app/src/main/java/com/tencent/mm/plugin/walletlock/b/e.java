package com.tencent.mm.plugin.walletlock.b;

import android.app.Activity;
import android.content.Intent;
import com.tencent.mm.bg.d;
import com.tencent.mm.plugin.soter.c.h;
import com.tencent.mm.plugin.walletlock.a.b.a;
import com.tencent.mm.plugin.walletlock.a.b.b;
import com.tencent.mm.plugin.walletlock.gesture.a.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;

public final class e
  extends a
{
  private static com.tencent.mm.plugin.walletlock.a.b pIn;
  
  private static void bRX()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletLockImpl", "alvinluo WalletLock init end, wallet lock type: %d", new Object[] { Integer.valueOf(g.pIt.bRY()) });
  }
  
  public final void K(Activity paramActivity)
  {
    if (pIn != null) {
      pIn.K(paramActivity);
    }
  }
  
  public final void a(Activity paramActivity, b.b paramb)
  {
    if (pIn != null) {
      pIn.a(paramActivity, paramb);
    }
  }
  
  public final void a(Activity paramActivity, b.b paramb, b.a parama)
  {
    if (pIn != null) {
      pIn.a(paramActivity, paramb, parama);
    }
  }
  
  public final void b(Activity paramActivity, int paramInt1, int paramInt2)
  {
    super.b(paramActivity, paramInt1, paramInt2);
  }
  
  public final void b(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    if (pIn != null)
    {
      pIn.b(paramActivity, paramIntent, paramInt);
      return;
    }
    super.b(paramActivity, paramIntent, paramInt);
  }
  
  public final b.b bRo()
  {
    if (pIn != null) {
      return pIn.bRo();
    }
    return null;
  }
  
  public final boolean bRp()
  {
    g localg = g.pIt;
    if (!g.bRE()) {
      localg = g.pIt;
    }
    return g.bRt();
  }
  
  public final boolean bRq()
  {
    if (pIn != null) {
      return pIn.bRq();
    }
    return false;
  }
  
  public final void c(Activity paramActivity, Intent paramIntent)
  {
    if (pIn != null)
    {
      pIn.c(paramActivity, paramIntent);
      return;
    }
    super.c(paramActivity, paramIntent);
  }
  
  public final void h(Activity paramActivity, int paramInt)
  {
    super.h(paramActivity, paramInt);
  }
  
  public final void i(Activity paramActivity, int paramInt)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("action", "action.close_wallet_lock");
    d.b(paramActivity, "wallet", ".pwd.ui.WalletLockCheckPwdUI", localIntent, paramInt);
  }
  
  public final void init()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletLockImpl", "alvinluo WalletLock init start, call stack: %s", new Object[] { bi.i(new Throwable()) });
    int i = bi.p(com.tencent.mm.kernel.g.Ei().DT().get(40, null), 0);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletLockImpl", "alvinluo pluginSwitch %d %d", new Object[] { Integer.valueOf(i), Integer.valueOf(i & 0x800000) });
    Object localObject;
    if ((i & 0x800000) != 0)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletLockImpl", "alvinluo fingerprint wallet lock is opened");
      localObject = new com.tencent.mm.plugin.walletlock.fingerprint.a.b();
      pIn = (com.tencent.mm.plugin.walletlock.a.b)localObject;
      ((com.tencent.mm.plugin.walletlock.a.b)localObject).init();
      localObject = g.pIt;
      boolean bool = g.bSa();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletLockImpl", "alvinluo init isSupportSoter: %b, isSupportFingerprintLock: %b", new Object[] { Boolean.valueOf(h.bFl()), Boolean.valueOf(bool) });
      if ((com.tencent.mm.plugin.walletlock.gesture.a.b.bRE()) && (!bool))
      {
        bool = com.tencent.mm.kernel.g.Ei().DT().getBoolean(aa.a.sYF, false);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletLockImpl", "alvinluo has opened fingerprint lock, but device not support soter, and use gesture, isAutoJumpToGesture: %b", new Object[] { Boolean.valueOf(bool) });
        if (bool)
        {
          localObject = new c();
          pIn = (com.tencent.mm.plugin.walletlock.a.b)localObject;
          ((com.tencent.mm.plugin.walletlock.a.b)localObject).init();
          bRX();
        }
      }
    }
    else
    {
      if (!com.tencent.mm.plugin.walletlock.gesture.a.b.bRE()) {
        break label247;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletLockImpl", "alvinluo gesture wallet lock is opened");
      localObject = new c();
      pIn = (com.tencent.mm.plugin.walletlock.a.b)localObject;
      ((com.tencent.mm.plugin.walletlock.a.b)localObject).init();
      localObject = g.pIt;
      g.jK(false);
    }
    for (;;)
    {
      bRX();
      return;
      label247:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletLockImpl", "alvinluo wallet lock is not open");
      pIn = new a();
      localObject = g.pIt;
      g.jJ(false);
      pIn.init();
    }
  }
  
  public final void zw(int paramInt)
  {
    Object localObject;
    if (paramInt == 1)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletLockImpl", "alvinluo wallet lock switch to gesture");
      localObject = new c();
      pIn = (com.tencent.mm.plugin.walletlock.a.b)localObject;
      ((com.tencent.mm.plugin.walletlock.a.b)localObject).init();
      localObject = g.pIt;
      g.jK(true);
      return;
    }
    if (paramInt == 2)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletLockImpl", "alvinluo wallet lock switch to fingerprint lock");
      localObject = new com.tencent.mm.plugin.walletlock.fingerprint.a.b();
      pIn = (com.tencent.mm.plugin.walletlock.a.b)localObject;
      ((com.tencent.mm.plugin.walletlock.a.b)localObject).init();
      localObject = g.pIt;
      g.jI(false);
      return;
    }
    if (paramInt == 0)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletLockImpl", "alvinluo wallet lock switch to none");
      localObject = new a();
      pIn = (com.tencent.mm.plugin.walletlock.a.b)localObject;
      ((com.tencent.mm.plugin.walletlock.a.b)localObject).init();
      localObject = g.pIt;
      g.jJ(true);
      return;
    }
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WalletLockImpl", "alvinluo unknown wallet lock type, ignore switch");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/walletlock/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */