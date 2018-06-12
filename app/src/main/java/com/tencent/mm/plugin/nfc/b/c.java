package com.tencent.mm.plugin.nfc.b;

import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.x;

public final class c
{
  public static void aa(String paramString, int paramInt1, int paramInt2)
  {
    x.i("MicroMsg.HCEReportManager", "alvinluo reportStartHCEResult appId: %s, result: %d, diff: %d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    h.mEJ.h(14837, new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/nfc/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */