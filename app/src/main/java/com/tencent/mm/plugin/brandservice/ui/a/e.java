package com.tencent.mm.plugin.brandservice.ui.a;

import android.content.Context;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.c.b;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.HashSet;
import java.util.List;

public final class e
  extends com.tencent.mm.plugin.fts.ui.a
{
  public e(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ag paramag, HashSet<String> paramHashSet)
  {
    String str = this.bWm;
    b localb = b.jsU;
    paramag = i.a(str, new int[] { 131076 }, null, 4, paramHashSet, localb, this, paramag);
    return ((n)g.n(n.class)).search(2, paramag);
  }
  
  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt1, int paramInt2, l paraml, e.a parama)
  {
    a locala = new a(paramInt2);
    locala.fyJ = paraml;
    locala.jrx = parama.jrx;
    locala.cF(paraml.type, paraml.jru);
    return locala;
  }
  
  protected final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    int i = paramInt - parama.jta - 1;
    l locall = null;
    Object localObject = locall;
    if (i < parama.jte.size())
    {
      localObject = locall;
      if (i >= 0)
      {
        locall = (l)parama.jte.get(i);
        localObject = a(131076, paramInt, locall, parama);
        ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).cF(locall.type, locall.jru);
      }
    }
    if (localObject != null) {
      ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).jtm = (i + 1);
    }
    return (com.tencent.mm.plugin.fts.a.d.a.a)localObject;
  }
  
  protected final void a(j paramj, HashSet<String> paramHashSet)
  {
    if (bk(paramj.jsx))
    {
      paramHashSet = new e.a();
      paramHashSet.iPZ = -7;
      paramHashSet.jte = paramj.jsx;
      paramHashSet.jrx = paramj.jrx;
      if (paramHashSet.jte.size() > 3)
      {
        paramHashSet.jtd = true;
        paramHashSet.jte = paramHashSet.jte.subList(0, 3);
      }
      this.jvp.add(paramHashSet);
    }
  }
  
  public final int getType()
  {
    return 96;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/brandservice/ui/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */