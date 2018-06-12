package com.tencent.mm.plugin.gallery.model;

import java.util.LinkedList;

public final class f<E>
  extends LinkedList<E>
{
  private byte[] dsN = new byte[0];
  
  public final E aRy()
  {
    synchronized (this.dsN)
    {
      if (size() > 0)
      {
        Object localObject1 = super.poll();
        return (E)localObject1;
      }
      return null;
    }
  }
  
  public final boolean add(E paramE)
  {
    synchronized (this.dsN)
    {
      boolean bool = super.add(paramE);
      return bool;
    }
  }
  
  public final void bB(E paramE)
  {
    synchronized (this.dsN)
    {
      if (bb(paramE)) {
        super.remove(paramE);
      }
      return;
    }
  }
  
  public final boolean bb(E paramE)
  {
    synchronized (this.dsN)
    {
      boolean bool = super.contains(paramE);
      return bool;
    }
  }
  
  public final int size()
  {
    synchronized (this.dsN)
    {
      int i = super.size();
      return i;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/gallery/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */