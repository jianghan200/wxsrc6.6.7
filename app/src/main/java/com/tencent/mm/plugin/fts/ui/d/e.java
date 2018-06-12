package com.tencent.mm.plugin.fts.ui.d;

import android.content.Context;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.a.r;
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
    i locali = new i();
    locali.jsn = 64;
    locali.bWm = this.bWm;
    locali.jsq = new int[] { 131072, 131081 };
    locali.jss = 3;
    locali.jsu = com.tencent.mm.plugin.fts.a.c.b.jsU;
    locali.jst = paramHashSet;
    locali.jsv = this;
    locali.handler = paramag;
    return ((n)g.n(n.class)).search(2, locali);
  }
  
  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt1, int paramInt2, l paraml, e.a parama)
  {
    r localr = null;
    if ((paraml.type == 131072) || (paraml.type == 131081))
    {
      localr = new r(paramInt2);
      localr.fyJ = paraml;
      localr.jrx = parama.jrx;
      localr.cF(paraml.type, paraml.jru);
    }
    while ((paraml.type != 131073) && (paraml.type != 131074)) {
      return localr;
    }
    return ((com.tencent.mm.plugin.fts.ui.a)((n)g.n(n.class)).createFTSUIUnit(33, this.context, this.jsY, this.jsZ)).a(paramInt1, paramInt2, paraml, parama);
  }
  
  protected final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    Object localObject = null;
    l locall = null;
    int i = 0;
    if (parama.jtb)
    {
      i = paramInt - parama.jta - 1;
      localObject = locall;
      if (i < parama.jte.size())
      {
        localObject = locall;
        if (i >= 0)
        {
          locall = (l)parama.jte.get(i);
          parama = a(locall.type, paramInt, locall, parama);
          localObject = parama;
          if (parama != null)
          {
            parama.cF(locall.type, locall.jru);
            localObject = parama;
          }
        }
      }
    }
    if (localObject != null) {
      ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).jtm = (i + 1);
    }
    return (com.tencent.mm.plugin.fts.a.d.a.a)localObject;
  }
  
  protected final void a(j paramj, HashSet<String> paramHashSet)
  {
    paramHashSet = new e.a();
    paramHashSet.iPZ = -4;
    paramHashSet.jte = paramj.jsx;
    paramHashSet.jtb = bk(paramj.jsx);
    paramHashSet.jrx = paramj.jrx;
    if (paramHashSet.jte.size() > 3)
    {
      paramHashSet.jtd = true;
      paramHashSet.jte = paramHashSet.jte.subList(0, 3);
    }
    if (bk(paramj.jsx)) {
      this.jvp.add(paramHashSet);
    }
  }
  
  public final int getType()
  {
    return 32;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */