package com.tencent.mm.kernel.c;

import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Modifier;
import java.util.concurrent.ConcurrentHashMap;

public final class d
{
  private static final d dsZ = new d();
  public ConcurrentHashMap<Class<? extends a>, c> dsX = new ConcurrentHashMap();
  public a dsY = null;
  
  public final <T extends a> T l(Class<T> paramClass)
  {
    c localc = (c)this.dsX.get(paramClass);
    if ((!paramClass.isInterface()) && (Modifier.isAbstract(paramClass.getModifiers()))) {
      x.w("MicroMsg.ServiceHub", "Did you call service by using the service implementation class ?? Use interface class instead!! Carl is warning u!");
    }
    for (int i = 1;; i = 0)
    {
      if (localc != null) {}
      for (paramClass = localc.EV();; paramClass = null)
      {
        if (this.dsY != null) {
          this.dsY.a(paramClass);
        }
        return paramClass;
        x.e("MicroMsg.ServiceHub", "Service(%s) not found!!! ", new Object[] { paramClass });
        if (i != 0) {
          x.e("MicroMsg.ServiceHub", "This error must cause by using implementation class to call service! Use interface instead! Understand?");
        }
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(a parama);
    
    public abstract void a(c paramc);
    
    public abstract void b(c paramc);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kernel/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */