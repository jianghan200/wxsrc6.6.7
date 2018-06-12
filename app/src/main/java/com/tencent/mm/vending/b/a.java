package com.tencent.mm.vending.b;

import com.tencent.mm.vending.h.d;
import com.tencent.mm.vending.h.f;
import com.tencent.mm.vending.h.g;
import java.util.LinkedList;
import junit.framework.Assert;

public abstract class a<_Callback>
{
  protected d byz;
  private LinkedList<b> uQy = new LinkedList();
  public f uQz;
  
  public a()
  {
    this(g.cBM());
  }
  
  public a(d paramd)
  {
    Assert.assertNotNull(paramd);
    this.byz = paramd;
    this.uQz = new f(paramd, null);
  }
  
  public final b a(b paramb)
  {
    try
    {
      this.uQy.add(paramb);
      return paramb;
    }
    finally
    {
      paramb = finally;
      throw paramb;
    }
  }
  
  public final void b(b paramb)
  {
    if (paramb == null) {}
    for (;;)
    {
      return;
      try
      {
        this.uQy.remove(paramb);
      }
      finally {}
    }
  }
  
  public final LinkedList<b> cBB()
  {
    try
    {
      LinkedList localLinkedList = new LinkedList(this.uQy);
      return localLinkedList;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean contains(_Callback param_Callback)
  {
    try
    {
      boolean bool = this.uQy.contains(new b(param_Callback, this));
      return bool;
    }
    finally
    {
      param_Callback = finally;
      throw param_Callback;
    }
  }
  
  public final int size()
  {
    try
    {
      int i = this.uQy.size();
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/vending/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */