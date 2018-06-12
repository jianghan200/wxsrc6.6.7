package com.tencent.mm.vending.b;

import com.tencent.mm.vending.h.d;
import com.tencent.mm.vending.h.f;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class c<_Callback>
  extends a<_Callback>
{
  public c() {}
  
  public c(d paramd)
  {
    super(paramd);
  }
  
  public final void a(final com.tencent.mm.vending.j.a parama)
  {
    for (;;)
    {
      try
      {
        Iterator localIterator = cBB().iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        final b localb = (b)localIterator.next();
        if (localb != null) {
          if (localb.byz != null)
          {
            this.uQz.b(localb.byz);
            this.uQz.a(new com.tencent.mm.vending.c.a() {}, com.tencent.mm.vending.c.a.uQG, true);
          }
          else
          {
            this.uQz.b(d.cBM());
          }
        }
      }
      finally {}
    }
  }
  
  public abstract void a(_Callback param_Callback, com.tencent.mm.vending.j.a parama);
  
  public final b<_Callback> aI(_Callback param_Callback)
  {
    return a(new b(param_Callback, this));
  }
  
  public final void cBC()
  {
    try
    {
      a(null);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/vending/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */