package com.tencent.mm.ac;

import com.tencent.mm.kernel.a.b.a;
import com.tencent.mm.kernel.a.b.a.a;
import com.tencent.mm.kernel.api.c;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.storage.p;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class l
  implements o, com.tencent.mm.kernel.a.b.b, com.tencent.mm.kernel.api.bucket.b, c
{
  private com.tencent.mm.storage.o dMt;
  private p dMu;
  
  public final com.tencent.mm.storage.o FU()
  {
    return this.dMt;
  }
  
  public final p FV()
  {
    return this.dMu;
  }
  
  public final String Gl()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    g.Ek();
    return g.Ei().dqp + "brandicon/";
  }
  
  public final List<String> collectStoragePaths()
  {
    LinkedList localLinkedList = new LinkedList();
    Collections.addAll(localLinkedList, new String[] { "brandicon/" });
    return localLinkedList;
  }
  
  public final void onAccountInitialized(e.c paramc)
  {
    paramc = ((i)g.l(i.class)).bcY();
    com.tencent.mm.storage.o localo = new com.tencent.mm.storage.o(paramc);
    this.dMt = localo;
    paramc.a(localo);
    this.dMu = new p(((i)g.l(i.class)).FW());
  }
  
  public final void onAccountRelease() {}
  
  public final void parallelsDependency()
  {
    a.a(this, c.class).aN(g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ac/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */