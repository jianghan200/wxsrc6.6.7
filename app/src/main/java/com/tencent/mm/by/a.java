package com.tencent.mm.by;

import com.tencent.mm.vending.b.b;
import com.tencent.mm.vending.h.d;
import com.tencent.mm.vending.h.f;
import java.util.Iterator;
import java.util.LinkedList;

public class a<_Callback>
  extends com.tencent.mm.vending.b.a<_Callback>
{
  public a()
  {
    super(new e());
  }
  
  public a(d paramd)
  {
    super(paramd);
  }
  
  public final void a(final a<_Callback> parama)
  {
    Iterator localIterator = cBB().iterator();
    while (localIterator.hasNext())
    {
      final b localb = (b)localIterator.next();
      if (localb != null) {
        if (localb.byz != null)
        {
          this.uQz.b(localb.byz);
          this.uQz.a(new com.tencent.mm.vending.c.a() {}, com.tencent.mm.vending.c.a.uQG, true);
        }
        else
        {
          parama.aD(localb.uQB);
        }
      }
    }
  }
  
  public b<_Callback> aI(_Callback param_Callback)
  {
    return super.a(new b(param_Callback, this));
  }
  
  public final void remove(_Callback param_Callback)
  {
    super.b(new b(param_Callback, this));
  }
  
  public static abstract interface a<_Callback>
  {
    public abstract void aD(_Callback param_Callback);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/by/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */