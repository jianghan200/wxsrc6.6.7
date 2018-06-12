package com.tencent.mm.kiss.widget.textview;

import com.tencent.mm.kiss.widget.textview.a.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public final class c
{
  public static c dtC = new c();
  public ConcurrentHashMap<Integer, b> dtD = new ConcurrentHashMap();
  
  public static int a(a parama)
  {
    return parama.hashCode();
  }
  
  public final void EZ()
  {
    Iterator localIterator = this.dtD.values().iterator();
    while (localIterator.hasNext()) {
      ((b)localIterator.next()).dtB.clear();
    }
    this.dtD.clear();
  }
  
  public final f a(a parama, CharSequence paramCharSequence)
  {
    if (parama != null)
    {
      parama = (b)this.dtD.get(Integer.valueOf(parama.hashCode()));
      if (parama != null) {
        return parama.m(paramCharSequence);
      }
    }
    return null;
  }
  
  public final void a(a parama, f paramf)
  {
    if (parama == null) {
      return;
    }
    b localb = (b)this.dtD.get(Integer.valueOf(parama.hashCode()));
    if (localb != null)
    {
      localb.a(paramf);
      this.dtD.put(Integer.valueOf(parama.hashCode()), localb);
      return;
    }
    localb = new b();
    localb.a(paramf);
    this.dtD.put(Integer.valueOf(parama.hashCode()), localb);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/kiss/widget/textview/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */