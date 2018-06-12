package com.tencent.mm.plugin.fts.ui.d;

import android.content.Context;
import android.view.View;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.ui.a.m;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;
import java.util.List;

public class k
  extends com.tencent.mm.plugin.fts.ui.a
{
  protected boolean jzn = false;
  
  public k(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
  }
  
  protected com.tencent.mm.plugin.fts.a.a.a a(ag paramag, HashSet<String> paramHashSet)
  {
    this.jzn = false;
    com.tencent.mm.plugin.fts.a.a.i locali = new com.tencent.mm.plugin.fts.a.a.i();
    locali.bWm = this.bWm;
    locali.jst = paramHashSet;
    locali.jsv = this;
    locali.handler = paramag;
    locali.jsn = 1;
    locali.jss = 3;
    return ((n)g.n(n.class)).search(3, locali);
  }
  
  protected com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    int i = paramInt - parama.jta;
    if (parama.jtb) {
      i -= 1;
    }
    for (;;)
    {
      l locall = null;
      Object localObject = locall;
      boolean bool;
      if (i < parama.jte.size())
      {
        localObject = locall;
        if (i >= 0)
        {
          locall = (l)parama.jte.get(i);
          if (!locall.jrv.equals("create_talker_message​")) {
            break label143;
          }
          localObject = new com.tencent.mm.plugin.fts.ui.a.i(paramInt);
          if (parama.jte.size() != 1) {
            break label137;
          }
          bool = true;
          ((com.tencent.mm.plugin.fts.ui.a.i)localObject).jym = bool;
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
        label137:
        bool = false;
        break;
        label143:
        localObject = new m(paramInt);
        ((m)localObject).fyJ = locall;
        ((m)localObject).cF(locall.type, locall.jru);
      }
    }
  }
  
  protected void a(j paramj, HashSet<String> paramHashSet)
  {
    if (bk(paramj.jsx))
    {
      paramHashSet = new e.a();
      paramHashSet.iPZ = -2;
      paramHashSet.jrx = paramj.jrx;
      paramHashSet.jte = paramj.jsx;
      if (paramHashSet.jte.size() <= 3) {
        break label132;
      }
      if (!((l)paramj.jsx.get(3)).jrv.equals("create_talker_message​")) {
        break label109;
      }
      paramHashSet.jtd = false;
      paramHashSet.jte = paramHashSet.jte.subList(0, 4);
    }
    for (;;)
    {
      this.jvp.add(paramHashSet);
      return;
      label109:
      paramHashSet.jtd = true;
      paramHashSet.jte = paramHashSet.jte.subList(0, 3);
      continue;
      label132:
      if ((paramj.jsx.size() == 1) && (((l)paramj.jsx.get(0)).jrv.equals("create_talker_message​"))) {
        paramHashSet.jtb = false;
      }
    }
  }
  
  public boolean a(View paramView, com.tencent.mm.plugin.fts.a.d.a.a parama, boolean paramBoolean)
  {
    int i;
    if ((parama instanceof m))
    {
      i = aQR();
      paramBoolean = this.jzn;
      if (parama.jtq != 65536) {}
    }
    label72:
    int k;
    switch (parama.pageType)
    {
    default: 
      return false;
    case 1: 
    case 2: 
    case 3: 
    case 4: 
      i = parama.pageType;
      k = parama.aQj();
      if (!paramBoolean) {
        break;
      }
    }
    for (int j = 1;; j = 0)
    {
      paramView = String.format("%s,%s,%s", new Object[] { Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j) });
      x.v("MicroMsg.FTS.FTSReportLogic", "reportFTSGlobalMsgResultClick: %d, %s", new Object[] { Integer.valueOf(14756), paramView });
      h.mEJ.k(14756, paramView);
      return false;
      if (i == 1)
      {
        i = 6;
        break label72;
      }
      if (i != 2) {
        break;
      }
      i = 5;
      break label72;
    }
  }
  
  protected int aQR()
  {
    return 0;
  }
  
  public int getType()
  {
    return 112;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/d/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */