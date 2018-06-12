package com.tencent.mm.plugin.cdndownloader.d;

import java.util.HashSet;

public final class a<E>
  extends HashSet<E>
{
  private b hKq;
  
  public a(b paramb)
  {
    this.hKq = paramb;
  }
  
  private void aAn()
  {
    try
    {
      this.hKq.aAm();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void aAo()
  {
    try
    {
      this.hKq.remove();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void aAp()
  {
    try
    {
      this.hKq.clear();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean add(E paramE)
  {
    try
    {
      boolean bool = super.add(paramE);
      aAn();
      return bool;
    }
    finally
    {
      paramE = finally;
      throw paramE;
    }
  }
  
  public final void clear()
  {
    super.clear();
    aAp();
  }
  
  public final boolean remove(Object paramObject)
  {
    try
    {
      boolean bool = super.remove(paramObject);
      aAo();
      return bool;
    }
    finally
    {
      paramObject = finally;
      throw ((Throwable)paramObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/cdndownloader/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */