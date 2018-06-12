package com.tencent.mm.plugin.i;

import com.tencent.mm.compatible.e.m;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.kernel.a.c.a;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.sdk.platformtools.x;

public final class f
  extends a
{
  public final void execute(g paramg)
  {
    int i = m.zj();
    if ((i & 0x400) != 0)
    {
      x.i("MicroMsg.SightInitTask", "load wechatsight_v7a, core number[%d]", new Object[] { Integer.valueOf(i >> 12) });
      k.b("wechatsight_v7a", getClass().getClassLoader());
      if (i >> 12 >= 4)
      {
        com.tencent.mm.plugin.sight.base.b.nbT = 3;
        com.tencent.mm.plugin.sight.base.b.nbV = 3;
        com.tencent.mm.plugin.sight.base.b.nbW = 544000;
        return;
      }
      com.tencent.mm.plugin.sight.base.b.nbT = 1;
      com.tencent.mm.plugin.sight.base.b.nbV = 1;
      com.tencent.mm.plugin.sight.base.b.nbW = 640000;
      return;
    }
    x.i("MicroMsg.SightInitTask", "load wechatsight");
    k.b("wechatsight", getClass().getClassLoader());
    com.tencent.mm.plugin.sight.base.b.nbT = 1;
    com.tencent.mm.plugin.sight.base.b.nbV = 1;
    com.tencent.mm.plugin.sight.base.b.nbW = 640000;
  }
  
  public final String name()
  {
    return "boot-sight-init";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/i/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */