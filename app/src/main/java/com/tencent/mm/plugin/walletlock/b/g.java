package com.tencent.mm.plugin.walletlock.b;

import com.tencent.d.a.c.i;
import com.tencent.mm.plugin.soter.c.h;
import com.tencent.mm.plugin.walletlock.gesture.a.b;
import com.tencent.mm.plugin.walletlock.gesture.a.d;
import com.tencent.mm.storage.aa.a;

public enum g
{
  int mType = -1;
  public String pIu;
  public i pIv;
  
  private g() {}
  
  public static boolean bRE()
  {
    return b.bRE();
  }
  
  public static void bRZ()
  {
    com.tencent.mm.plugin.walletlock.fingerprint.a.a.jG(true);
  }
  
  public static boolean bRt()
  {
    boolean bool = com.tencent.mm.plugin.walletlock.fingerprint.a.a.bRt();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletLockManager", "isUserSetFingerprintLock: %b", new Object[] { Boolean.valueOf(bool) });
    return bool;
  }
  
  public static void bRv()
  {
    d.bRv();
    com.tencent.mm.plugin.walletlock.fingerprint.a.a.bRv();
  }
  
  public static boolean bSa()
  {
    if (((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getInt("TouchLockFunction", 0) == 1) {}
    for (int i = 1; (h.bFl()) && (i == 0); i = 0) {
      return true;
    }
    return false;
  }
  
  public static boolean bSb()
  {
    return ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.zero.b.a.class)).AT().getInt("TouchLockFunction", 0) != 1;
  }
  
  public static void jI(boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GestureGuardManager", "alvinluo setUserSetGesturePwd: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sYC, Boolean.valueOf(paramBoolean));
    com.tencent.mm.kernel.g.Ei().DT().lm(true);
  }
  
  public static void jJ(boolean paramBoolean)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletLockManager", "alvinluo closeAllWalletLock");
    jK(paramBoolean);
    jI(false);
  }
  
  public static void jK(boolean paramBoolean)
  {
    com.tencent.mm.plugin.walletlock.fingerprint.a.a.jG(false);
    if (paramBoolean) {
      com.tencent.mm.plugin.walletlock.fingerprint.a.a.bRs();
    }
  }
  
  public final int bRY()
  {
    if (this.mType == -1) {
      this.mType = ((Integer)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sYz, Integer.valueOf(0))).intValue();
    }
    return this.mType;
  }
  
  public final boolean bRq()
  {
    boolean bool = false;
    if (this.mType == 1) {
      bool = b.bRF();
    }
    while (this.mType != 2) {
      return bool;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletLockManager", "alvinluo isUserBlockedInFingerprint: %b", new Object[] { Boolean.valueOf(com.tencent.mm.plugin.walletlock.fingerprint.a.a.bRu()) });
    return com.tencent.mm.plugin.walletlock.fingerprint.a.a.bRu();
  }
  
  public final void zB(int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.WalletLockManager", "alvinluo old wallet lock type: %d, new type: %d", new Object[] { Integer.valueOf(this.mType), Integer.valueOf(paramInt) });
    this.mType = paramInt;
    com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sYz, Integer.valueOf(paramInt));
    com.tencent.mm.kernel.g.Ei().DT().lm(true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/walletlock/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */