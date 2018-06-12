package com.tencent.mm.plugin.sport.b;

import com.tencent.mm.plugin.report.f;
import com.tencent.mm.sdk.platformtools.x;

public final class d
{
  public static final void kB(int paramInt)
  {
    x.v("MicroMsg.Sport.SportReportLogic", "report action=%d", new Object[] { Integer.valueOf(paramInt) });
    f.mDy.h(13168, new Object[] { Integer.valueOf(paramInt) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sport/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */