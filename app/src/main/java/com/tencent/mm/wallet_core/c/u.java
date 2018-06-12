package com.tencent.mm.wallet_core.c;

import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.x;

public final class u
{
  public static void d(int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    x.v("Micromsg.WalletPayLinkReport", "kvAction scene %s reqKey %s action %s info %s", new Object[] { Integer.valueOf(paramInt1), paramString1, Integer.valueOf(paramInt2), paramString2 });
    h.mEJ.h(15001, new Object[] { Integer.valueOf(paramInt1), paramString1, Integer.valueOf(paramInt2), paramString2 });
  }
  
  public static void j(int paramInt1, String paramString, int paramInt2)
  {
    x.v("Micromsg.WalletPayLinkReport", "kvStatStartPay scene %s reqKey %s errcode %s", new Object[] { Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramInt2) });
    h.mEJ.h(14997, new Object[] { Integer.valueOf(paramInt1), paramString, Integer.valueOf(paramInt2) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/wallet_core/c/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */