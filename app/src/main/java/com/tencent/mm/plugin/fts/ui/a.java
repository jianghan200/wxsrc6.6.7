package com.tencent.mm.plugin.fts.ui;

import android.content.Context;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.d.b;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.ui.a.k;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public abstract class a
  extends b
  implements com.tencent.mm.plugin.fts.a.l
{
  public String bWm;
  HashSet<String> jst = new HashSet();
  private com.tencent.mm.plugin.fts.a.a.a jsw;
  public List<e.a> jvp = Collections.synchronizedList(new LinkedList());
  
  public a(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
  }
  
  public abstract com.tencent.mm.plugin.fts.a.a.a a(ag paramag, HashSet<String> paramHashSet);
  
  public com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt1, int paramInt2, com.tencent.mm.plugin.fts.a.a.l paraml, e.a parama)
  {
    return null;
  }
  
  public abstract com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama);
  
  public abstract void a(j paramj, HashSet<String> paramHashSet);
  
  public final void a(String paramString, ag paramag, HashSet<String> paramHashSet)
  {
    aQe();
    acV();
    this.bWm = paramString;
    this.jsw = a(paramag, paramHashSet);
  }
  
  public final void aQe()
  {
    if (this.jsw != null)
    {
      ((com.tencent.mm.plugin.fts.a.n)g.n(com.tencent.mm.plugin.fts.a.n.class)).cancelSearchTask(this.jsw);
      this.jsw = null;
    }
  }
  
  public final LinkedList<Integer> aQf()
  {
    LinkedList localLinkedList = new LinkedList();
    int j = this.jvp.size();
    int i = 0;
    while (i < j)
    {
      e.a locala = (e.a)this.jvp.get(i);
      if (locala.jta != Integer.MAX_VALUE) {
        localLinkedList.add(Integer.valueOf(locala.jta));
      }
      i += 1;
    }
    return localLinkedList;
  }
  
  public final int aQg()
  {
    return aQw();
  }
  
  public final int aQw()
  {
    int m = this.jvp.size();
    int j = 0;
    int k = 0;
    while (j < m)
    {
      Iterator localIterator = ((e.a)this.jvp.get(j)).jte.iterator();
      if (localIterator.hasNext())
      {
        String str = bi.aG(((com.tencent.mm.plugin.fts.a.a.l)localIterator.next()).jrv, "");
        int i = -1;
        switch (str.hashCode())
        {
        }
        for (;;)
        {
          switch (i)
          {
          }
          k += 1;
          break;
          if (str.equals("create_chatroom​"))
          {
            i = 0;
            continue;
            if (str.equals("create_talker_message​"))
            {
              i = 1;
              continue;
              if (str.equals("no_result​")) {
                i = 2;
              }
            }
          }
        }
      }
      j += 1;
    }
    return k;
  }
  
  public final void acV()
  {
    this.bWm = null;
    this.jst.clear();
    this.jvp.clear();
  }
  
  public k b(int paramInt, e.a parama)
  {
    return new k(paramInt);
  }
  
  public final void b(j paramj)
  {
    switch (paramj.bjW)
    {
    default: 
      return;
    case 0: 
      x.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "search type %d | result %d", new Object[] { Integer.valueOf(getType()), Integer.valueOf(paramj.jsx.size()) });
      if ((this.bWm == null) || (!this.bWm.equals(paramj.joH.bWm)))
      {
        x.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "Native Search: Not Same query origin:%s current:%s", new Object[] { paramj.joH.bWm, this.bWm });
        return;
      }
      this.jst = paramj.joH.jst;
      a(paramj, this.jst);
    }
    do
    {
      this.jsY.a(this, paramj.joH.bWm);
      return;
      x.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "onSearchError: type=%d | errorCode=%d | originQuery=%s", new Object[] { Integer.valueOf(getType()), Integer.valueOf(paramj.bjW), paramj.joH.bWm });
    } while (paramj.joH.bWm.equals(this.bWm));
    x.i("MicroMsg.FTS.BaseNativeFTSUIUnit", "Native Search: Not Same Query");
  }
  
  public com.tencent.mm.plugin.fts.ui.a.n c(int paramInt, e.a parama)
  {
    com.tencent.mm.plugin.fts.ui.a.n localn = new com.tencent.mm.plugin.fts.ui.a.n(paramInt);
    localn.jtm = (parama.jtc - parama.jta);
    localn.jts = true;
    return localn;
  }
  
  public int qg(int paramInt)
  {
    int k = this.jvp.size();
    int i = 0;
    if (i < k)
    {
      e.a locala = (e.a)this.jvp.get(i);
      locala.jta = paramInt;
      int j = paramInt;
      if (locala.jtb) {
        j = paramInt + 1;
      }
      paramInt = j + (locala.jte.size() + locala.jth);
      locala.jtc = paramInt;
      if (!locala.jtd) {
        break label100;
      }
      paramInt += 1;
    }
    label100:
    for (;;)
    {
      i += 1;
      break;
      return paramInt;
    }
  }
  
  public final com.tencent.mm.plugin.fts.a.d.a.a qh(int paramInt)
  {
    int j = this.jvp.size();
    int i = 0;
    e.a locala;
    Object localObject;
    if (i < j)
    {
      locala = (e.a)this.jvp.get(i);
      if ((locala.jta == paramInt) && (locala.jtb)) {
        localObject = b(paramInt, locala);
      }
    }
    for (;;)
    {
      if (localObject != null)
      {
        if (((com.tencent.mm.plugin.fts.a.d.a.a)localObject).position == locala.jtc) {
          ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).jtj = false;
        }
        ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).jsZ = this.jsZ;
        ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).jrx = locala.jrx;
        ((com.tencent.mm.plugin.fts.a.d.a.a)localObject).jtk = locala.iPZ;
        return (com.tencent.mm.plugin.fts.a.d.a.a)localObject;
        if ((locala.jtc == paramInt) && (locala.jtd))
        {
          localObject = c(paramInt, locala);
          continue;
        }
        if (paramInt <= locala.jtc) {
          localObject = a(paramInt, locala);
        }
      }
      else
      {
        i += 1;
        break;
        return null;
      }
      localObject = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */