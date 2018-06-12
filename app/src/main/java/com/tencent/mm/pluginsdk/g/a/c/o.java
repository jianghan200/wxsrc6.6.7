package com.tencent.mm.pluginsdk.g.a.c;

import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.network.n;
import java.util.Collection;
import java.util.Iterator;

public final class o
  implements com.tencent.mm.kernel.api.c, com.tencent.mm.kernel.b.c
{
  public static final o qDq = new o();
  private final n qDr = new o.1(this);
  private final com.tencent.mm.sdk.b.c qDs = new o.2(this);
  
  public final void onAccountInitialized(e.c paramc)
  {
    paramc = r.ccI().iterator();
    while (paramc.hasNext()) {
      ((g)paramc.next()).bUO();
    }
    com.tencent.mm.kernel.g.Eh().a(this.qDr);
    this.qDs.cht();
  }
  
  public final void onAccountRelease()
  {
    com.tencent.mm.kernel.g.Eh().b(this.qDr);
    this.qDs.dead();
    Iterator localIterator = r.ccI().iterator();
    while (localIterator.hasNext()) {
      ((g)localIterator.next()).onAccountRelease();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/pluginsdk/g/a/c/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */