package com.tencent.mm.plugin.hardwareopt.a;

import com.tencent.mm.plugin.hardwareopt.c.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vending.g.d;
import com.tencent.mm.vending.g.d.a;
import com.tencent.mm.vending.g.e;

public final class a
  implements com.tencent.mm.plugin.hardwareopt.a.a.a
{
  public final void fD(boolean paramBoolean)
  {
    new e().w(new Object[] { ad.getContext() }).e(new com.tencent.mm.plugin.hardwareopt.c.a()).d(new b(paramBoolean)).a(new d.a()
    {
      public final void bd(Object paramAnonymousObject)
      {
        x.w("MicroMsg.HardwareProvider", "hy: on interrupt.");
      }
    }).a(new a.1(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/hardwareopt/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */