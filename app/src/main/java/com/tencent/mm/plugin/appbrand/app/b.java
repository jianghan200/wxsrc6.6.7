package com.tencent.mm.plugin.appbrand.app;

import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;

public final class b
{
  private static volatile boolean fer = false;
  
  static void aaQ()
  {
    ah.A(new b.1());
  }
  
  public static void aaR()
  {
    x.i("MicroMsg.AppBrandProcessProfileInit[applaunch]", "setSkipMiscPreload %b", new Object[] { Boolean.valueOf(true) });
    fer = true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/app/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */