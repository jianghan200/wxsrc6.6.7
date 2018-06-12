package com.tencent.mm.ui.contact;

import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bi;

public final class x
{
  public static void FO(int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SelectContactReportLogic", "reportCreateChatroomClick %d %d", new Object[] { Integer.valueOf(13941), Integer.valueOf(paramInt) });
    h.mEJ.h(13941, new Object[] { Integer.valueOf(paramInt) });
  }
  
  public static final void n(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    if (bi.oW(paramString)) {
      return;
    }
    paramString = String.format("%s,%d,%d,%d,%d", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(0) });
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.SelectContactReportLogic", "reportClick: %s", new Object[] { paramString });
    h.mEJ.k(13234, paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/contact/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */