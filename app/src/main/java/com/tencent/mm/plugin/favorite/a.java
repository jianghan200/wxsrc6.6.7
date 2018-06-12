package com.tencent.mm.plugin.favorite;

import com.tencent.mm.kernel.a.b.a.a;
import com.tencent.mm.kernel.a.b.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.p;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fts.a.n;

public final class a
  extends p
  implements b
{
  public a()
  {
    super(com.tencent.mm.bg.c.Un("favorite"));
  }
  
  public final void parallelsDependency()
  {
    com.tencent.mm.kernel.a.b.a.a(this, com.tencent.mm.kernel.api.c.class).aN(g.n(n.class));
    com.tencent.mm.kernel.a.b.a.a(this, com.tencent.mm.kernel.api.c.class).aN(g.n(ae.class));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/favorite/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */