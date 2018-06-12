package com.tencent.mm.plugin.card.compat;

import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.c.e;
import com.tencent.mm.plugin.card.compat.a.b;

public final class PluginCardCompat
  extends f
  implements b
{
  public final void execute(com.tencent.mm.kernel.b.g paramg)
  {
    if (paramg.ES()) {
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.card.compat.a.a.class, new e(new a()));
    }
  }
  
  public final void installed()
  {
    super.installed();
    alias(b.class);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/compat/PluginCardCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */