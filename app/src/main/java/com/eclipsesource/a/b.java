package com.eclipsesource.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b
  extends h
  implements Iterable<h>
{
  public final List<h> abz = new ArrayList();
  
  public final b a(h paramh)
  {
    if (paramh == null) {
      throw new NullPointerException("value is null");
    }
    this.abz.add(paramh);
    return this;
  }
  
  final void a(i parami)
  {
    parami.jdMethod_if();
    Iterator localIterator = iterator();
    for (int i = 1; localIterator.hasNext(); i = 0)
    {
      if (i == 0) {
        parami.ih();
      }
      ((h)localIterator.next()).a(parami);
    }
    parami.ig();
  }
  
  public final b ad(boolean paramBoolean)
  {
    this.abz.add(a.ac(paramBoolean));
    return this;
  }
  
  public final b bY(int paramInt)
  {
    this.abz.add(a.bX(paramInt));
    return this;
  }
  
  public final h bZ(int paramInt)
  {
    return (h)this.abz.get(paramInt);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (this == paramObject) {
      bool1 = true;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (paramObject == null);
      bool1 = bool2;
    } while (getClass() != paramObject.getClass());
    paramObject = (b)paramObject;
    return this.abz.equals(((b)paramObject).abz);
  }
  
  public final b hQ()
  {
    return this;
  }
  
  public final int hashCode()
  {
    return this.abz.hashCode();
  }
  
  public final boolean isArray()
  {
    return true;
  }
  
  public final Iterator<h> iterator()
  {
    return new b.1(this, this.abz.iterator());
  }
  
  public final b l(long paramLong)
  {
    this.abz.add(a.k(paramLong));
    return this;
  }
  
  public final b m(double paramDouble)
  {
    this.abz.add(a.l(paramDouble));
    return this;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/eclipsesource/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */