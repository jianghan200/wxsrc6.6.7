package com.tencent.mm.plugin.appbrand.f;

import android.content.Context;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;
import java.util.List;

public final class f
  extends com.tencent.mm.plugin.fts.ui.a
{
  public f(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ag paramag, HashSet<String> paramHashSet)
  {
    i locali = new i();
    locali.bWm = this.bWm;
    locali.jsu = com.tencent.mm.plugin.fts.a.c.d.jsW;
    locali.jsv = this;
    locali.handler = paramag;
    locali.jst = paramHashSet;
    return ((n)g.n(n.class)).search(7, locali);
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
        localObject = new d(paramInt);
        ((d)localObject).fyJ = locall;
        ((d)localObject).jrx = parama.jrx;
        ((d)localObject).cF(locall.type, locall.jru);
      }
    }
    if (localObject != null) {
      ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).jtm = (i + 1);
    }
    return (com.tencent.mm.plugin.fts.a.d.a.a)localObject;
  }
  
  protected final void a(j paramj, HashSet<String> paramHashSet)
  {
    List localList = paramj.jsx;
    if ((localList != null) && (!localList.isEmpty()))
    {
      com.tencent.mm.modelsns.d locald = new com.tencent.mm.modelsns.d();
      String str = this.bWm;
      paramHashSet = str;
      if (str != null) {
        paramHashSet = str.replaceAll(",", " ");
      }
      locald.r("20KeyWordId", paramHashSet + ",");
      locald.r("21ViewType", "2,");
      locald.r("22OpType", "1,");
      locald.r("23ResultCount", localList.size() + ",");
      locald.r("24ClickPos", ",");
      locald.r("25ClickAppUserName", ",");
      x.i("MicroMsg.FTSWeAppDetailUIUnit", "report oreh LocalSearchWeApp(13963), %s", new Object[] { locald.wF() });
      h.mEJ.h(13963, new Object[] { locald });
    }
    if (bk(paramj.jsx))
    {
      paramHashSet = new e.a();
      paramHashSet.iPZ = -13;
      paramHashSet.jrx = paramj.jrx;
      paramHashSet.jte = paramj.jsx;
      this.jvp.add(paramHashSet);
    }
  }
  
  public final int getType()
  {
    return 4224;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/f/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */