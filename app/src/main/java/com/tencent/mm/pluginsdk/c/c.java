package com.tencent.mm.pluginsdk.c;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.kb;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public abstract class c<T extends b>
  extends com.tencent.mm.sdk.b.c<T>
  implements e
{
  private static HashMap<b, c<? extends b>> dRX = new HashMap();
  private static HashMap<l, b> qyx = new HashMap();
  private int qyw = 0;
  
  public static void k(b paramb)
  {
    Iterator localIterator = qyx.entrySet().iterator();
    Map.Entry localEntry;
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
      localEntry = (Map.Entry)localIterator.next();
    } while (localEntry.getValue() != paramb);
    for (paramb = (l)localEntry.getKey();; paramb = null)
    {
      if (paramb != null)
      {
        g.DF().c(paramb);
        qyx.remove(paramb);
      }
      return;
    }
  }
  
  public abstract b a(int paramInt, l paraml, T paramT);
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    b localb;
    if (aAu() == paraml.getType())
    {
      localb = (b)qyx.remove(paraml);
      if (localb != null) {}
    }
    else
    {
      return;
    }
    kb localkb = new kb();
    localkb.bUq.bUr = a(paramInt2, paraml, localb);
    localkb.bUq.errType = paramInt1;
    localkb.bUq.errCode = paramInt2;
    localkb.bUq.Yy = paramString;
    a.sFg.m(localkb);
  }
  
  public abstract int aAu();
  
  public final void aYG()
  {
    if (this.qyw == 0) {}
    do
    {
      return;
      this.qyw -= 1;
    } while (this.qyw != 0);
    g.DF().b(aAu(), this);
  }
  
  public abstract l b(T paramT);
  
  public final void cbp()
  {
    if (this.qyw == 0) {
      g.DF().a(aAu(), this);
    }
    this.qyw += 1;
  }
  
  public final void l(T paramT)
  {
    l locall = b(paramT);
    g.DF().a(locall, 0);
    qyx.put(locall, paramT);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/pluginsdk/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */