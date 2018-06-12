package com.tencent.mm.plugin.fts.ui.d;

import android.content.Context;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.c;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ag;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public final class a
  extends com.tencent.mm.plugin.fts.ui.a
{
  private boolean jzm;
  
  public a(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    paramContext = (String)g.Ei().DT().get(6, null);
    if ((paramContext != null) && (paramContext.length() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      this.jzm = bool;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FTS.FTSAddFriendUIUnit", "[FTSAddFriendUIUnit doSearchMobile : %s]", new Object[] { Boolean.valueOf(this.jzm) });
      return;
    }
  }
  
  private int[] aQQ()
  {
    ArrayList localArrayList = new ArrayList();
    if (this.jzm) {
      localArrayList.add(Integer.valueOf(16));
    }
    int[] arrayOfInt = new int[localArrayList.size()];
    int i = 0;
    while (i < localArrayList.size())
    {
      arrayOfInt[i] = ((Integer)localArrayList.get(i)).intValue();
      i += 1;
    }
    return arrayOfInt;
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ag paramag, HashSet<String> paramHashSet)
  {
    String str = this.bWm;
    ArrayList localArrayList = new ArrayList();
    if (this.jzm)
    {
      localArrayList.add(Integer.valueOf(131073));
      localArrayList.add(Integer.valueOf(131074));
    }
    int[] arrayOfInt = new int[localArrayList.size()];
    int i = 0;
    while (i < localArrayList.size())
    {
      arrayOfInt[i] = ((Integer)localArrayList.get(i)).intValue();
      i += 1;
    }
    paramag = i.a(str, arrayOfInt, aQQ(), -1, paramHashSet, com.tencent.mm.plugin.fts.a.c.b.jsU, this, paramag);
    return ((n)g.n(n.class)).search(9, paramag);
  }
  
  protected final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    int i = paramInt - parama.jta - 1;
    Object localObject2 = null;
    Object localObject1;
    if ((i < parama.jte.size()) && (i >= 0))
    {
      localObject1 = (l)parama.jte.get(i);
      if ((((l)localObject1).type != 131073) && (((l)localObject1).type != 131074)) {
        break label167;
      }
    }
    label167:
    for (parama = ((com.tencent.mm.plugin.fts.ui.a)((n)g.n(n.class)).createFTSUIUnit(33, this.context, this.jsY, this.jsZ)).a(((l)localObject1).type, paramInt, (l)localObject1, parama);; parama = null)
    {
      localObject1 = parama;
      for (;;)
      {
        if (localObject1 != null) {
          ((com.tencent.mm.plugin.fts.a.d.a.a)localObject1).jtm = (i + 1);
        }
        return (com.tencent.mm.plugin.fts.a.d.a.a)localObject1;
        localObject1 = localObject2;
        if (!parama.jtb)
        {
          localObject1 = localObject2;
          if (paramInt == 0)
          {
            localObject1 = new com.tencent.mm.plugin.fts.ui.a.a(paramInt);
            ((com.tencent.mm.plugin.fts.ui.a.a)localObject1).jrx = parama.jrx;
          }
        }
      }
    }
  }
  
  protected final void a(j paramj, HashSet<String> paramHashSet)
  {
    paramHashSet = paramj.jsx;
    this.jvp.clear();
    e.a locala = new e.a();
    locala.iPZ = -4;
    locala.jtb = false;
    locala.jth = 1;
    locala.jrx = paramj.jrx;
    locala.jte = new LinkedList();
    this.jvp.add(locala);
    if (bk(paramHashSet))
    {
      paramHashSet = d.a(paramHashSet, c.jqq);
      if (bk(paramHashSet))
      {
        locala = new e.a();
        locala.iPZ = -11;
        locala.jte = paramHashSet;
        locala.jrx = paramj.jrx;
        this.jvp.add(locala);
      }
    }
  }
  
  public final int getType()
  {
    return 8192;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */