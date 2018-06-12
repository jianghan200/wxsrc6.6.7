package com.tencent.mm.plugin.walletlock.b;

import com.tencent.mm.sdk.platformtools.x;

public final class h
{
  private static long iNJ = -1L;
  
  public static void Z(int paramInt1, int paramInt2, int paramInt3)
  {
    if (iNJ == -1L) {
      x.e("MicroMsg.WalletLockReportManager", "alvinluo wallet lock report sessionId is -1, not create session, ignore");
    }
    while (paramInt1 == -1) {
      return;
    }
    x.i("MicroMsg.WalletLockReportManager", "alvinluo reportVerifyWalletLock session: %d, protectScene: %d, walletLockType: %d, result: %d", new Object[] { Long.valueOf(iNJ), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    com.tencent.mm.plugin.report.service.h.mEJ.h(14839, new Object[] { Long.valueOf(iNJ), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
  }
  
  public static void bSc()
  {
    x.i("MicroMsg.WalletLockReportManager", "alvinluo idkey report fingerprintlock verify by passwd success");
    com.tencent.mm.plugin.report.service.h.mEJ.a(713L, 2L, 1L, false);
  }
  
  public static void bSd()
  {
    x.i("MicroMsg.WalletLockReportManager", "alvinluo idkey report close wallet lock success");
    com.tencent.mm.plugin.report.service.h.mEJ.a(713L, 3L, 1L, false);
  }
  
  public static void bSe()
  {
    iNJ = System.currentTimeMillis();
    x.i("MicroMsg.WalletLockReportManager", "alvinluo wallet lock report create session: %d", new Object[] { Long.valueOf(iNJ) });
  }
  
  public static void ed(int paramInt1, int paramInt2)
  {
    switch (paramInt2)
    {
    default: 
      paramInt1 = -1;
    }
    for (;;)
    {
      if (paramInt1 != -1)
      {
        x.i("MicroMsg.WalletLockReportManager", "alvinluo wallet lock idkey report id: %d, key: %d, value: %d", new Object[] { Integer.valueOf(713), Integer.valueOf(paramInt1), Long.valueOf(1L) });
        com.tencent.mm.plugin.report.service.h.mEJ.a(713L, paramInt1, 1L, false);
      }
      return;
      if (paramInt1 == 3)
      {
        paramInt1 = 4;
        continue;
        paramInt1 = 5;
        continue;
        paramInt1 = 6;
      }
      else
      {
        paramInt1 = -1;
      }
    }
  }
  
  public static void jL(boolean paramBoolean)
  {
    x.i("MicroMsg.WalletLockReportManager", "alvinluo idkey fingerprint open result: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    com.tencent.mm.plugin.report.service.h localh = com.tencent.mm.plugin.report.service.h.mEJ;
    if (paramBoolean) {}
    for (long l = 0L;; l = 1L)
    {
      localh.a(713L, l, 1L, false);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/walletlock/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */