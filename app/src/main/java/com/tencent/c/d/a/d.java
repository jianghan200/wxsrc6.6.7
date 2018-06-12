package com.tencent.c.d.a;

import com.tencent.c.d.b.d.a;
import com.tencent.c.f.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class d
  implements b
{
  private final HashSet<Integer> vjp = new HashSet();
  private final List<d.a> vjq = new ArrayList();
  
  public final void a(d.a parama)
  {
    if (parama.uid != 0) {}
    do
    {
      return;
      if ((parama.vjv == 1) && (!"/sbin/adbd".equals(parama.name)))
      {
        h.d("ProcessRelationAnalyzer parent : " + parama.toString());
        this.vjp.add(Integer.valueOf(parama.pid));
        return;
      }
    } while ((parama.vjv <= 1) || (!"sh".equals(parama.name)) || (!"/system/bin/sh".equals(parama.name)));
    h.d("ProcessRelationAnalyzer child : " + parama.toString());
    this.vjq.add(parama);
  }
  
  public final boolean cFe()
  {
    Iterator localIterator = this.vjq.iterator();
    while (localIterator.hasNext())
    {
      d.a locala = (d.a)localIterator.next();
      if (this.vjp.contains(Integer.valueOf(locala.vjv)))
      {
        h.i("ProcessRelationAnalyzer match : " + locala.toString());
        return true;
      }
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/c/d/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */