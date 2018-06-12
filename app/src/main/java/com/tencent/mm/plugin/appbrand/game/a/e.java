package com.tencent.mm.plugin.appbrand.game.a;

import android.content.Context;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.c.d;
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
    i locali = new i();
    locali.bWm = this.bWm;
    locali.jsu = d.jsW;
    locali.jsv = this;
    locali.handler = paramag;
    locali.jst = paramHashSet;
    locali.jsu = h.fAM;
    return ((n)g.n(n.class)).search(10, locali);
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
        localObject = new c(paramInt);
        ((c)localObject).fyJ = locall;
        ((c)localObject).jrx = parama.jrx;
        ((c)localObject).cF(locall.type, locall.jru);
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
      paramHashSet.iPZ = -15;
      paramHashSet.jrx = paramj.jrx;
      paramHashSet.jte = paramj.jsx;
      this.jvp.add(paramHashSet);
    }
  }
  
  public final int getType()
  {
    return 4240;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */