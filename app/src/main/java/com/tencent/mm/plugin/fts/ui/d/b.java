package com.tencent.mm.plugin.fts.ui.d;

import android.content.Context;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.a.h;
import com.tencent.mm.plugin.fts.ui.a.q;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.HashSet;
import java.util.List;

public final class b
  extends com.tencent.mm.plugin.fts.ui.a
{
  public b(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ag paramag, HashSet<String> paramHashSet)
  {
    i locali = new i();
    locali.jsn = 32;
    locali.bWm = this.bWm;
    locali.jst = paramHashSet;
    locali.jsu = com.tencent.mm.plugin.fts.a.c.a.jsT;
    locali.jsv = this;
    locali.handler = paramag;
    return ((n)g.n(n.class)).search(2, locali);
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
        if (!locall.jrv.equals("create_chatroom​")) {
          break label100;
        }
        localObject = new h(paramInt);
        ((h)localObject).jrx = parama.jrx;
      }
    }
    for (;;)
    {
      if (localObject != null) {
        ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).jtm = (i + 1);
      }
      return (com.tencent.mm.plugin.fts.a.d.a.a)localObject;
      label100:
      localObject = new q(paramInt);
      ((q)localObject).fyJ = locall;
      ((q)localObject).jrx = parama.jrx;
      ((q)localObject).cF(locall.type, locall.jru);
    }
  }
  
  protected final void a(j paramj, HashSet<String> paramHashSet)
  {
    if (bk(paramj.jsx))
    {
      paramHashSet = new e.a();
      paramHashSet.iPZ = -3;
      paramHashSet.jte = paramj.jsx;
      paramHashSet.jrx = paramj.jrx;
      paramHashSet.jtd = false;
      this.jvp.add(paramHashSet);
    }
  }
  
  public final int getType()
  {
    return 4128;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */