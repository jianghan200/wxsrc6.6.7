package com.tencent.mm.plugin.fts.ui.d;

import android.content.Context;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.c.c;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.HashSet;
import java.util.List;

public final class h
  extends com.tencent.mm.plugin.fts.ui.a
{
  public h(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ag paramag, HashSet<String> paramHashSet)
  {
    i locali = new i();
    locali.bWm = this.bWm;
    locali.handler = paramag;
    locali.jst = paramHashSet;
    locali.jsv = this;
    locali.jsu = c.jsV;
    return ((n)g.n(n.class)).search(4, locali);
  }
  
  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt1, int paramInt2, l paraml, e.a parama)
  {
    com.tencent.mm.plugin.fts.ui.a.j localj = new com.tencent.mm.plugin.fts.ui.a.j(paramInt2);
    localj.fyJ = paraml;
    localj.jrx = parama.jrx;
    localj.cF(paraml.type, paraml.jru);
    return localj;
  }
  
  protected final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    int i = paramInt - parama.jta - 1;
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (i < parama.jte.size())
    {
      localObject1 = localObject2;
      if (i >= 0) {
        localObject1 = a(262144, paramInt, (l)parama.jte.get(i), parama);
      }
    }
    if (localObject1 != null) {
      ((com.tencent.mm.plugin.fts.a.d.a.a)localObject1).jtm = (i + 1);
    }
    return (com.tencent.mm.plugin.fts.a.d.a.a)localObject1;
  }
  
  protected final void a(com.tencent.mm.plugin.fts.a.a.j paramj, HashSet<String> paramHashSet)
  {
    if (bk(paramj.jsx))
    {
      paramHashSet = new e.a();
      paramHashSet.iPZ = -6;
      paramHashSet.jrx = paramj.jrx;
      paramHashSet.jte = paramj.jsx;
      paramHashSet.jtd = false;
      this.jvp.add(paramHashSet);
    }
  }
  
  public final int getType()
  {
    return 64;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/d/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */