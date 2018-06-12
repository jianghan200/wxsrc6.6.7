package com.tencent.mm.plugin.fts.ui.d;

import android.content.Context;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.c.e;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.a.f;
import com.tencent.mm.plugin.fts.ui.a.k;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.HashSet;
import java.util.List;

public final class g
  extends l
{
  public String jso;
  public int showType;
  public String talker;
  
  public g(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ag paramag, HashSet<String> paramHashSet)
  {
    this.jzn = false;
    paramHashSet = new i();
    paramHashSet.bWm = this.bWm;
    paramHashSet.jsu = e.jsX;
    paramHashSet.jso = this.jso;
    paramHashSet.jsp = this.jsp;
    paramHashSet.talker = this.talker;
    paramHashSet.jsv = this;
    paramHashSet.handler = paramag;
    paramHashSet.jsn = 11;
    return ((n)com.tencent.mm.kernel.g.n(n.class)).search(3, paramHashSet);
  }
  
  protected final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    Object localObject2 = null;
    if (parama.jtb) {}
    for (int i = paramInt - parama.jta - 1;; i = paramInt - parama.jta)
    {
      localObject1 = localObject2;
      if (i >= 0)
      {
        localObject1 = localObject2;
        if (i < parama.jte.size())
        {
          parama = (com.tencent.mm.plugin.fts.a.a.l)parama.jte.get(i);
          if (!parama.jrv.equals("no_result​")) {
            break;
          }
          localObject1 = new com.tencent.mm.plugin.fts.ui.a.l(paramInt);
        }
      }
      return (com.tencent.mm.plugin.fts.a.d.a.a)localObject1;
    }
    Object localObject1 = new com.tencent.mm.plugin.fts.ui.a.g(paramInt);
    ((com.tencent.mm.plugin.fts.ui.a.g)localObject1).fyJ = parama;
    ((com.tencent.mm.plugin.fts.ui.a.g)localObject1).jrx = ((com.tencent.mm.plugin.fts.ui.a.g)localObject1).fyJ.jrx;
    ((com.tencent.mm.plugin.fts.ui.a.g)localObject1).cF(parama.type, parama.jru);
    return (com.tencent.mm.plugin.fts.a.d.a.a)localObject1;
  }
  
  public final int aQR()
  {
    return this.showType;
  }
  
  protected final k b(int paramInt, e.a parama)
  {
    f localf = new f(paramInt);
    localf.jxW = parama.jtg;
    localf.jso = this.jso;
    return localf;
  }
  
  public final int getType()
  {
    return 192;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/d/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */