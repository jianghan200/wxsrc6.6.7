package com.tencent.mm.plugin.fts.ui.d;

import android.content.Context;
import android.view.View;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.c.e;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.ui.a.c;
import com.tencent.mm.plugin.fts.ui.a.o;
import com.tencent.mm.plugin.fts.ui.a.p;
import com.tencent.mm.plugin.fts.ui.n.g;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class l
  extends k
{
  public String jsp;
  
  public l(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
  }
  
  protected com.tencent.mm.plugin.fts.a.a.a a(ag paramag, HashSet<String> paramHashSet)
  {
    this.jzn = false;
    paramHashSet = new i();
    paramHashSet.bWm = this.bWm;
    paramHashSet.jsu = e.jsX;
    paramHashSet.jsp = this.jsp;
    paramHashSet.jsv = this;
    paramHashSet.handler = paramag;
    paramHashSet.jsn = 10;
    return ((com.tencent.mm.plugin.fts.a.n)g.n(com.tencent.mm.plugin.fts.a.n.class)).search(3, paramHashSet);
  }
  
  protected com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    p localp = null;
    if (parama.jtb) {}
    Object localObject;
    for (int i = paramInt - parama.jta - 1;; i = paramInt - parama.jta)
    {
      localObject = localp;
      if (i >= 0)
      {
        localObject = localp;
        if (i < parama.jte.size())
        {
          localObject = (com.tencent.mm.plugin.fts.a.a.l)parama.jte.get(i);
          if (!((com.tencent.mm.plugin.fts.a.a.l)localObject).jrv.equals("no_result​")) {
            break;
          }
          localObject = new com.tencent.mm.plugin.fts.ui.a.l(paramInt);
        }
      }
      return (com.tencent.mm.plugin.fts.a.d.a.a)localObject;
    }
    localp = new p(paramInt);
    localp.fyJ = ((com.tencent.mm.plugin.fts.a.a.l)localObject);
    localp.jxW = parama.jtg;
    localp.jrx = localp.fyJ.jrx;
    localp.jtk = -14;
    localp.showType = 2;
    localp.cF(((com.tencent.mm.plugin.fts.a.a.l)localObject).type, ((com.tencent.mm.plugin.fts.a.a.l)localObject).jru);
    return localp;
  }
  
  protected final void a(j paramj, HashSet<String> paramHashSet)
  {
    switch (paramj.bjW)
    {
    default: 
      return;
    }
    if (paramj.jsx.size() > 0)
    {
      int i = 0;
      label39:
      if (i < paramj.jsx.size())
      {
        paramHashSet = new e.a();
        paramHashSet.jtb = true;
        paramHashSet.jtg = ((com.tencent.mm.plugin.fts.a.a.l)paramj.jsx.get(i));
        paramHashSet.jrx = paramj.jrx;
        paramHashSet.jte = ((List)paramHashSet.jtg.userData);
        if ((paramHashSet.jte.size() <= 3) || (i == paramj.jsx.size() - 1)) {
          break label160;
        }
        paramHashSet.jtf = true;
      }
      for (paramHashSet.jtd = true;; paramHashSet.jtd = false)
      {
        this.jvp.add(paramHashSet);
        i += 1;
        break label39;
        break;
        label160:
        paramHashSet.jtf = false;
      }
    }
    paramHashSet = new e.a();
    paramHashSet.iPZ = -2;
    paramHashSet.jrx = paramj.jrx;
    paramHashSet.jtb = false;
    paramj = new com.tencent.mm.plugin.fts.a.a.l();
    paramj.jrv = "no_result​";
    paramHashSet.jte = new ArrayList();
    paramHashSet.jte.add(paramj);
    this.jvp.add(paramHashSet);
  }
  
  public final boolean a(View paramView, com.tencent.mm.plugin.fts.a.d.a.a parama, boolean paramBoolean)
  {
    boolean bool = false;
    super.a(paramView, parama, paramBoolean);
    int i;
    if ((parama instanceof c)) {
      i = 0;
    }
    for (;;)
    {
      if (i < this.jvp.size())
      {
        paramView = (e.a)this.jvp.get(i);
        if (paramView.jtc == parama.position)
        {
          paramBoolean = bool;
          if (!paramView.jtf) {
            paramBoolean = true;
          }
          paramView.jtf = paramBoolean;
        }
      }
      else
      {
        return true;
      }
      i += 1;
    }
  }
  
  protected int aQR()
  {
    return 2;
  }
  
  protected com.tencent.mm.plugin.fts.ui.a.k b(int paramInt, e.a parama)
  {
    o localo = new o(paramInt);
    localo.jxW = parama.jtg;
    localo.jrx = localo.jxW.jrx;
    return localo;
  }
  
  protected final com.tencent.mm.plugin.fts.ui.a.n c(int paramInt, e.a parama)
  {
    c localc = new c(paramInt);
    localc.jxE = n.g.fts_header_message;
    localc.jxF = parama.jtf;
    return localc;
  }
  
  public int getType()
  {
    return 176;
  }
  
  public final int qg(int paramInt)
  {
    int k = this.jvp.size();
    int j = 0;
    if (j < k)
    {
      e.a locala = (e.a)this.jvp.get(j);
      locala.jta = paramInt;
      int i = paramInt;
      if (locala.jtb) {
        i = paramInt + 1;
      }
      if (locala.jte.size() > 3) {
        if (locala.jtf)
        {
          i += 3;
          label80:
          locala.jtc = i;
          paramInt = i;
          if (locala.jtd) {
            paramInt = i + 1;
          }
        }
      }
      for (;;)
      {
        j += 1;
        break;
        i += locala.jte.size();
        break label80;
        paramInt = i + locala.jte.size();
        locala.jtc = paramInt;
      }
    }
    return paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/d/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */