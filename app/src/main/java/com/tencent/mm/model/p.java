package com.tencent.mm.model;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.api.a;
import com.tencent.mm.kernel.api.h;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class p
  implements a, com.tencent.mm.kernel.api.c, com.tencent.mm.kernel.api.f, h, com.tencent.mm.kernel.b.c
{
  private static ConcurrentHashMap<String, p> dAK = new ConcurrentHashMap();
  private volatile a dAG;
  private volatile Class<? extends ar> dAH;
  private volatile ar dAI;
  private volatile boolean dAJ = false;
  
  public p(a parama)
  {
    this.dAG = parama;
  }
  
  public p(Class<? extends ar> paramClass)
  {
    this.dAH = paramClass;
    a(this.dAH.getName(), this);
  }
  
  public static void GD()
  {
    Iterator localIterator = dAK.values().iterator();
    while (localIterator.hasNext()) {
      ((p)localIterator.next()).reset();
    }
  }
  
  public static p a(String paramString, p paramp)
  {
    Object localObject = (p)dAK.putIfAbsent(paramString, paramp);
    if (localObject == null)
    {
      localObject = com.tencent.mm.kernel.a.c.Et();
      x.i("MicroMsg.CallbacksProxy", "add pending callbacks %s", new Object[] { paramp });
      ((com.tencent.mm.kernel.a.c)localObject).drJ.putIfAbsent(paramp, ((com.tencent.mm.kernel.a.c)localObject).drJ);
    }
    for (;;)
    {
      x.i("MicroMsg.CompatSubCore", "registerCompatSubCoreWithNameIfAbsent %s, %s", new Object[] { paramString, paramp });
      return paramp;
      paramp = (p)localObject;
    }
  }
  
  private ar createSubCore()
  {
    try
    {
      x.i("MicroMsg.CompatSubCore", "createSubCore(), %s %s", new Object[] { this.dAH, this.dAG });
      if (this.dAG != null) {
        return this.dAG.createSubCore();
      }
      ar localar = (ar)this.dAH.newInstance();
      return localar;
    }
    catch (InstantiationException localInstantiationException)
    {
      x.printErrStackTrace("MicroMsg.CompatSubCore", localInstantiationException, "", new Object[0]);
      throw new IllegalAccessError(localInstantiationException.getMessage());
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      x.printErrStackTrace("MicroMsg.CompatSubCore", localIllegalAccessException, "", new Object[0]);
      throw new IllegalAccessError(localIllegalAccessException.getMessage());
    }
  }
  
  public static p gP(String paramString)
  {
    p localp = (p)dAK.get(paramString);
    if (localp == null)
    {
      x.i("MicroMsg.CompatSubCore", "compatSubCore is null by name %s", new Object[] { paramString });
      return localp;
    }
    com.tencent.mm.kernel.a.c.Et().aH(localp);
    return localp;
  }
  
  public static void gS(int paramInt)
  {
    Iterator localIterator = dAK.values().iterator();
    while (localIterator.hasNext())
    {
      ar localar = ((p)localIterator.next()).GC();
      if (localar != null) {
        localar.gi(paramInt);
      }
    }
  }
  
  private void reset()
  {
    try
    {
      this.dAI = null;
      this.dAJ = false;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static <T extends ar> T v(Class<T> paramClass)
  {
    p localp2 = gP(paramClass.getName());
    p localp1 = localp2;
    if (localp2 == null)
    {
      localp1 = new p(paramClass);
      a(paramClass.getName(), localp1);
    }
    return localp1.GC();
  }
  
  public final void Ep()
  {
    ar localar = GC();
    if (localar == null) {}
    while (!this.dAJ) {
      return;
    }
    localar.bo(com.tencent.mm.compatible.util.f.zZ());
  }
  
  public final void Eq()
  {
    GC();
  }
  
  public final ar GC()
  {
    try
    {
      if (this.dAI == null) {
        a(createSubCore());
      }
      ar localar = this.dAI;
      return localar;
    }
    finally {}
  }
  
  public final void a(ar paramar)
  {
    try
    {
      this.dAI = paramar;
      if ((this.dAH == null) && (this.dAI != null)) {
        this.dAH = this.dAI.getClass();
      }
      return;
    }
    finally {}
  }
  
  public HashMap<Integer, h.d> collectDatabaseFactory()
  {
    ar localar = GC();
    if (localar == null) {
      return null;
    }
    return localar.Ci();
  }
  
  public void gj(String paramString) {}
  
  public void onAccountInitialized(e.c paramc)
  {
    ar localar = GC();
    if (localar == null) {
      return;
    }
    localar.bn(paramc.dqH);
    this.dAJ = true;
  }
  
  public void onAccountRelease()
  {
    ar localar = GC();
    if (localar == null) {
      return;
    }
    localar.onAccountRelease();
  }
  
  public String toString()
  {
    return super.toString() + " " + this.dAH + " " + this.dAG + " " + this.dAI;
  }
  
  public static abstract interface a
  {
    public abstract ar createSubCore();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/model/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */