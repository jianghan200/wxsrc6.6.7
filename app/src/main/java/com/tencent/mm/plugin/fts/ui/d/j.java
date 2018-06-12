package com.tencent.mm.plugin.fts.ui.d;

import android.content.Context;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.a.m;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public final class j
  extends k
{
  public j(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ag paramag, HashSet<String> paramHashSet)
  {
    this.jzn = false;
    com.tencent.mm.plugin.fts.a.a.i locali = new com.tencent.mm.plugin.fts.a.a.i();
    locali.bWm = this.bWm;
    locali.jst = paramHashSet;
    locali.jsv = this;
    locali.handler = paramag;
    return ((n)g.n(n.class)).search(3, locali);
  }
  
  protected final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    int i = paramInt - parama.jta;
    if (parama.jtb) {
      i -= 1;
    }
    for (;;)
    {
      com.tencent.mm.plugin.fts.a.a.l locall = null;
      Object localObject = locall;
      if (i < parama.jte.size())
      {
        localObject = locall;
        if (i >= 0)
        {
          locall = (com.tencent.mm.plugin.fts.a.a.l)parama.jte.get(i);
          if (!locall.jrv.equals("create_talker_message​")) {
            break label120;
          }
          localObject = new com.tencent.mm.plugin.fts.ui.a.i(paramInt);
          ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).jtj = false;
          this.jzn = true;
        }
      }
      for (;;)
      {
        if (localObject != null)
        {
          ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).jtm = (i + 1);
          ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).jrx = parama.jrx;
        }
        return (com.tencent.mm.plugin.fts.a.d.a.a)localObject;
        label120:
        if (locall.jrv.equals("no_result​"))
        {
          localObject = new com.tencent.mm.plugin.fts.ui.a.l(paramInt);
        }
        else
        {
          localObject = new m(paramInt);
          ((m)localObject).fyJ = locall;
          ((m)localObject).cF(locall.type, locall.jru);
        }
      }
    }
  }
  
  protected final void a(com.tencent.mm.plugin.fts.a.a.j paramj, HashSet<String> paramHashSet)
  {
    paramHashSet = paramj.jsx;
    Object localObject;
    if (bk(paramHashSet))
    {
      if (paramHashSet.size() > 0)
      {
        localObject = (com.tencent.mm.plugin.fts.a.a.l)paramHashSet.get(0);
        if (((com.tencent.mm.plugin.fts.a.a.l)localObject).jrv.equals("create_talker_message​"))
        {
          e.a locala = new e.a();
          locala.jtb = false;
          locala.jte = new ArrayList();
          locala.jte.add(localObject);
          locala.jrx = paramj.jrx;
          locala.iPZ = -2;
          this.jvp.add(locala);
          paramHashSet.remove(0);
        }
      }
      localObject = new e.a();
      ((e.a)localObject).iPZ = -2;
      ((e.a)localObject).jrx = paramj.jrx;
      if (paramHashSet.size() != 0) {
        break label203;
      }
      ((e.a)localObject).jtb = false;
      paramj = new com.tencent.mm.plugin.fts.a.a.l();
      paramj.jrv = "no_result​";
      ((e.a)localObject).jte = new ArrayList();
      ((e.a)localObject).jte.add(paramj);
    }
    for (;;)
    {
      this.jvp.add(localObject);
      return;
      label203:
      ((e.a)localObject).jte = paramHashSet;
    }
  }
  
  public final int getType()
  {
    return 4176;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/d/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */