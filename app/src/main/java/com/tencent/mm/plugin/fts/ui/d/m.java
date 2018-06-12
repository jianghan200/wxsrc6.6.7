package com.tencent.mm.plugin.fts.ui.d;

import android.content.Context;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.j;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.d;
import com.tencent.mm.plugin.fts.a.d.b;
import com.tencent.mm.plugin.fts.a.d.e.a;
import com.tencent.mm.plugin.fts.a.d.e.b;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.x;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class m
  extends com.tencent.mm.plugin.fts.ui.a
{
  private boolean jzm = false;
  
  public m(Context paramContext, e.b paramb, int paramInt)
  {
    super(paramContext, paramb, paramInt);
    paramb = (String)g.Ei().DT().get(6, null);
    if ((paramb != null) && (paramb.length() > 0)) {}
    for (boolean bool = true;; bool = false)
    {
      this.jzm = bool;
      this.jzm &= bi.fU(paramContext);
      return;
    }
  }
  
  protected final com.tencent.mm.plugin.fts.a.a.a a(ag paramag, HashSet<String> paramHashSet)
  {
    i locali = new i();
    int[] arrayOfInt;
    if (this.jzm)
    {
      arrayOfInt = new int[6];
      int[] tmp22_21 = arrayOfInt;
      tmp22_21[0] = 131072;
      int[] tmp27_22 = tmp22_21;
      tmp27_22[1] = 131075;
      int[] tmp32_27 = tmp27_22;
      tmp32_27[2] = 131073;
      int[] tmp37_32 = tmp32_27;
      tmp37_32[3] = 131074;
      int[] tmp42_37 = tmp37_32;
      tmp42_37[4] = 262144;
      int[] tmp47_42 = tmp42_37;
      tmp47_42[5] = 131076;
      tmp47_42;
    }
    for (;;)
    {
      locali.jsq = arrayOfInt;
      locali.jss = 3;
      locali.jsv = this;
      locali.handler = paramag;
      locali.scene = 0;
      locali.jst = paramHashSet;
      if (!this.bWm.startsWith("@@")) {
        break;
      }
      locali.bWm = this.bWm.substring(2);
      return ((n)g.n(n.class)).search(10000, locali);
      arrayOfInt = new int[4];
      int[] tmp138_137 = arrayOfInt;
      tmp138_137[0] = 131072;
      int[] tmp143_138 = tmp138_137;
      tmp143_138[1] = 131075;
      int[] tmp148_143 = tmp143_138;
      tmp148_143[2] = 262144;
      int[] tmp153_148 = tmp148_143;
      tmp153_148[3] = 131076;
      tmp153_148;
    }
    locali.bWm = this.bWm;
    return ((n)g.n(n.class)).search(1, locali);
  }
  
  protected final com.tencent.mm.plugin.fts.a.d.a.a a(int paramInt, e.a parama)
  {
    int i = paramInt - parama.jta - 1;
    l locall;
    com.tencent.mm.plugin.fts.ui.a locala;
    if ((i < parama.jte.size()) && (i >= 0))
    {
      locall = (l)parama.jte.get(i);
      if (locall.type == 131075) {
        locala = (com.tencent.mm.plugin.fts.ui.a)((n)g.n(n.class)).createFTSUIUnit(48, this.context, this.jsY, this.jsZ);
      }
    }
    for (;;)
    {
      if (locala != null) {}
      for (parama = locala.a(locall.type, paramInt, locall, parama);; parama = null)
      {
        if (parama != null) {
          parama.jtm = (i + 1);
        }
        return parama;
        if ((locall.type == 131072) || (locall.type == 131073) || (locall.type == 131074))
        {
          locala = (com.tencent.mm.plugin.fts.ui.a)((n)g.n(n.class)).createFTSUIUnit(32, this.context, this.jsY, this.jsZ);
          break;
        }
        if (locall.type == 262144)
        {
          locala = (com.tencent.mm.plugin.fts.ui.a)((n)g.n(n.class)).createFTSUIUnit(64, this.context, this.jsY, this.jsZ);
          break;
        }
        if (locall.type != 131076) {
          break label276;
        }
        locala = (com.tencent.mm.plugin.fts.ui.a)((n)g.n(n.class)).createFTSUIUnit(96, this.context, this.jsY, this.jsZ);
        break;
      }
      label276:
      locala = null;
    }
  }
  
  protected final void a(j paramj, HashSet<String> paramHashSet)
  {
    Object localObject = paramj.jsx.iterator();
    while (((Iterator)localObject).hasNext()) {
      paramHashSet.add(((l)((Iterator)localObject).next()).jrv);
    }
    if (bk(paramj.jsx))
    {
      e.a locala = new e.a();
      locala.iPZ = -8;
      localObject = paramj.jsx;
      paramHashSet = (HashSet<String>)localObject;
      if (b.bk((List)localObject))
      {
        paramHashSet = (HashSet<String>)localObject;
        if (((List)localObject).size() > 3) {
          paramHashSet = ((List)localObject).subList(0, 3);
        }
      }
      locala.jte = paramHashSet;
      locala.jtd = false;
      locala.jrx = paramj.jrx;
      this.jvp.add(locala);
    }
    d.bj(paramj.jsx);
  }
  
  public final int getType()
  {
    return 16;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fts/ui/d/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */