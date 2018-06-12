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

public final class c
  extends com.tencent.mm.plugin.fts.ui.a
{
  public c(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ag paramag, HashSet<String> paramHashSet)
  {
    i locali = new i();
    locali.jsn = 96;
    locali.jss = 3;
    locali.bWm = this.bWm;
    locali.jst = paramHashSet;
    locali.jsu = com.tencent.mm.plugin.fts.a.c.a.jsT;
    locali.jsv = this;
    locali.handler = paramag;
    return ((n)g.n(n.class)).search(2, locali);
  }
  
  public final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt1, int paramInt2, l paraml, e.a parama)
  {
    q localq = new q(paramInt2);
    localq.fyJ = paraml;
    localq.jrx = parama.jrx;
    localq.cF(paraml.type, paraml.jru);
    return localq;
  }
  
  protected final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    int i = paramInt - parama.jta - 1;
    Object localObject;
    if ((i < parama.jte.size()) && (i >= 0))
    {
      localObject = (l)parama.jte.get(i);
      if (((l)localObject).jrv.equals("create_chatroom​"))
      {
        localObject = new h(paramInt);
        ((h)localObject).jrx = parama.jrx;
        parama = (e.a)localObject;
      }
    }
    for (;;)
    {
      if (parama != null) {
        parama.jtm = (i + 1);
      }
      return parama;
      if (((l)localObject).type == 131075)
      {
        parama = a(131075, paramInt, (l)localObject, parama);
        parama.cF(((l)localObject).type, ((l)localObject).jru);
      }
      else
      {
        parama = null;
      }
    }
  }
  
  protected final void a(j paramj, HashSet<String> paramHashSet)
  {
    boolean bool;
    if (bk(paramj.jsx))
    {
      paramHashSet = new e.a();
      paramHashSet.jte = paramj.jsx;
      paramHashSet.iPZ = -3;
      paramHashSet.jrx = paramj.jrx;
      if (paramHashSet.jte.size() > 3)
      {
        if (!((l)paramHashSet.jte.get(3)).jrv.equals("create_chatroom​")) {
          break label129;
        }
        if (paramHashSet.jte.size() <= 4) {
          break label124;
        }
        bool = true;
        paramHashSet.jtd = bool;
      }
    }
    for (paramHashSet.jte = paramHashSet.jte.subList(0, 4);; paramHashSet.jte = paramHashSet.jte.subList(0, 3))
    {
      this.jvp.add(paramHashSet);
      return;
      label124:
      bool = false;
      break;
      label129:
      paramHashSet.jtd = true;
    }
  }
  
  public final int getType()
  {
    return 48;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */