package com.tencent.mm.bh;

import android.accounts.Account;
import android.accounts.AccountManager;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.protocal.c.alc;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;

public final class b
{
  public static void run()
  {
    long l1 = 0L;
    if ((!au.HX()) || (au.Dr())) {}
    for (;;)
    {
      return;
      long l3 = bi.VE();
      au.HU();
      long l2 = bi.a((Long)c.DT().get(331797, null), 0L);
      if ((10013 == af.exm) && (af.exn != 0)) {}
      while (l1 < l3)
      {
        au.HU();
        c.DT().set(331797, Long.valueOf(432000L + l3));
        try
        {
          alc localalc = new alc();
          localalc.rNT = "";
          Account[] arrayOfAccount = AccountManager.get(ad.getContext()).getAccountsByType("com.google");
          int j = arrayOfAccount.length;
          int i = 0;
          while (i < j)
          {
            Account localAccount = arrayOfAccount[i];
            if (!bi.oW(localalc.rNT)) {
              break;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PostTaskGoogleAcc", "google account[%s]", new Object[] { localAccount.name });
            localalc.rNT = localAccount.name;
            i += 1;
          }
          if ((10013 == af.exm) && (af.exn != 0)) {
            localalc.rNT = "rssjbbk@gmail.com";
          }
          if (!bi.oW(localalc.rNT))
          {
            au.HU();
            c.FQ().b(new h.a(57, localalc));
            return;
          }
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.PostTaskGoogleAcc", "Get Accounts failed :%s", new Object[] { localException.getMessage() });
          return;
        }
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.PostTaskGoogleAcc", "Get Accounts failed , Not any info?");
        return;
        l1 = l2;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/bh/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */