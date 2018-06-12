package com.tencent.mm.sdk.b;

import com.tencent.mm.sdk.platformtools.ListenerInstanceMonitor;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class c<T extends b>
{
  final int priority;
  public int sFo = 0;
  private com.tencent.mm.vending.b.b<c> sFp;
  
  public c()
  {
    this(0);
  }
  
  public c(int paramInt)
  {
    this.priority = paramInt;
  }
  
  public abstract boolean a(T paramT);
  
  final int chs()
  {
    if (this.sFo == 0)
    {
      long l = System.currentTimeMillis();
      Type localType2 = getClass().getGenericSuperclass();
      Type localType1 = localType2;
      if (!(localType2 instanceof ParameterizedType)) {
        localType1 = getClass().getSuperclass().getGenericSuperclass();
      }
      localType1 = ((ParameterizedType)localType1).getActualTypeArguments()[0];
      this.sFo = ((Class)localType1).getName().hashCode();
      x.v("IListener", "genEventID, %s<%s>, useTime:%d", new Object[] { getClass().getName(), localType1, Long.valueOf(System.currentTimeMillis() - l) });
    }
    return this.sFo;
  }
  
  public final com.tencent.mm.vending.b.b<c> cht()
  {
    try
    {
      if (this.sFp == null)
      {
        ListenerInstanceMonitor.cc(this);
        this.sFp = a.sFg.a(this);
      }
      com.tencent.mm.vending.b.b localb = this.sFp;
      return localb;
    }
    finally {}
  }
  
  public final void dead()
  {
    try
    {
      if (this.sFp != null)
      {
        ListenerInstanceMonitor.cd((c)this.sFp.uQB);
        this.sFp.dead();
        this.sFp = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */