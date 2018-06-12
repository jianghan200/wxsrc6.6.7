package com.tencent.mm.plugin.websearch.c.a;

import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.l;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class b
  implements c
{
  Map<a, c.a> diQ = new HashMap();
  Map<a, CountDownLatch> pNa = new ConcurrentHashMap();
  private l pNb = new b.1(this);
  private l pNc = new l()
  {
    public final void b(j paramAnonymousj)
    {
      a locala = (a)paramAnonymousj.jsw.jrq;
      if (locala == null) {}
      c.a locala1;
      do
      {
        return;
        locala1 = (c.a)b.this.diQ.remove(locala);
      } while (locala1 == null);
      switch (paramAnonymousj.bjW)
      {
      }
      for (;;)
      {
        locala1.bTt();
        return;
        if ((paramAnonymousj.jsx == null) || (paramAnonymousj.jsx.size() == 0))
        {
          x.i("FTSMatchContact", "local contact search size 0");
          locala1.bTt();
          return;
        }
        locala.cL(paramAnonymousj.jsx);
        continue;
        locala.cL(Collections.emptyList());
      }
    }
  };
  
  private static boolean a(a parama, l paraml)
  {
    if (bi.oW(parama.bWm)) {
      return false;
    }
    i locali = new i();
    locali.bWm = parama.bWm;
    locali.jsq = new int[] { 131072 };
    locali.jsr = new int[] { 1, 5 };
    locali.jss = parama.pMZ;
    locali.jsu = com.tencent.mm.plugin.fts.a.c.b.jsU;
    locali.jst = new HashSet();
    locali.jsv = paraml;
    locali.scene = 1;
    ((n)g.n(n.class)).search(2, locali).jrq = parama;
    return true;
  }
  
  public final a Qb(String paramString)
  {
    e locale = new e(paramString);
    CountDownLatch localCountDownLatch = (CountDownLatch)this.pNa.get(locale);
    if (localCountDownLatch == null) {
      if (a(locale, this.pNb))
      {
        x.i("FTSMatchContact", "not have a running task ,start new task, query %s,maxMatch %d", new Object[] { paramString, Integer.valueOf(Integer.MAX_VALUE) });
        paramString = new CountDownLatch(1);
        this.pNa.put(locale, paramString);
      }
    }
    for (;;)
    {
      if (paramString != null) {}
      try
      {
        paramString.await(2000L, TimeUnit.MILLISECONDS);
        this.pNa.remove(locale);
        return locale;
        x.i("FTSMatchContact", "start new task fail, query %s,maxMatch %d", new Object[] { paramString, Integer.valueOf(Integer.MAX_VALUE) });
        paramString = localCountDownLatch;
        continue;
        x.i("FTSMatchContact", "have a running task ,wait for result, query %s,maxMatch %d", new Object[] { paramString, Integer.valueOf(Integer.MAX_VALUE) });
        paramString = localCountDownLatch;
      }
      catch (Exception paramString)
      {
        for (;;)
        {
          x.printErrStackTrace("FTSMatchContact", paramString, "", new Object[0]);
        }
      }
    }
  }
  
  public final void a(a parama, c.a parama1)
  {
    this.diQ.put(parama, parama1);
    a(parama, this.pNc);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/websearch/c/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */