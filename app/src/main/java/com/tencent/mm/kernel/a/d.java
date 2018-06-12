package com.tencent.mm.kernel.a;

import android.os.HandlerThread;
import com.tencent.mm.blink.b.2;
import com.tencent.mm.blink.b.b;
import com.tencent.mm.compatible.e.n;
import com.tencent.mm.g.a.lt;
import com.tencent.mm.kernel.a.b.e.b;
import com.tencent.mm.kernel.a.b.e.c;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.model.ai;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public abstract class d
  implements b
{
  public com.tencent.mm.kernel.a.b.e<Object> drW = com.tencent.mm.kernel.a.b.e.EF();
  private final HashSet<String> drX = new HashSet();
  
  public static void gl(String paramString)
  {
    com.tencent.mm.kernel.g.Ee().gf(paramString);
  }
  
  public static void r(Class<? extends f> paramClass)
  {
    com.tencent.mm.kernel.g.Ee().j(paramClass);
  }
  
  public final void Er()
  {
    com.tencent.mm.kernel.g.Ee().DK();
    this.drW.prepare();
    Iterator localIterator = this.drW.EH().iterator();
    while (localIterator.hasNext())
    {
      e.c localc = (e.c)localIterator.next();
      c.Et().b(localc.byy.getLooper());
    }
    com.tencent.mm.blink.a.ey("makeDependency");
  }
  
  public final void Es()
  {
    this.drW.a(new e.b(), c.drE, c.Et().drt, "task-functional plugins");
    com.tencent.mm.blink.a.ey("executeTasks");
  }
  
  public void a(com.tencent.mm.kernel.b.g paramg)
  {
    this.drW.a(new e.b(), c.drD, c.Et().dru, "configure-functional plugins");
    com.tencent.mm.blink.a.ey("configurePlugins");
  }
  
  public void b(com.tencent.mm.kernel.b.g paramg)
  {
    a.j("startup final step, account initialize... for parallels", new Object[0]);
    Object localObject1;
    Object localObject2;
    if (paramg.ES())
    {
      localObject1 = c.Et();
      localObject2 = com.tencent.mm.kernel.g.Ee().DL().iterator();
      while (((Iterator)localObject2).hasNext()) {
        ((c)localObject1).aG((f)((Iterator)localObject2).next());
      }
      if (com.tencent.mm.kernel.g.Eg().Dx()) {
        com.tencent.mm.kernel.g.Eg().Dn();
      }
    }
    com.tencent.mm.blink.a.ey("installPendingPlugins");
    long l = System.nanoTime();
    if (this.drX.size() > 0)
    {
      localObject1 = this.drX.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        com.tencent.mm.kernel.g.Ek();
        com.tencent.mm.kernel.g.Ee().r((String)localObject2, true);
      }
      this.drX.clear();
      com.tencent.mm.blink.a.i("installPendingPlugins installed", l);
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Ee().DK();
      com.tencent.mm.blink.a.ey("installPendingPlugins dependency made.");
      localObject1 = new lt();
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
    }
    boolean bool = uT();
    int i;
    if ((paramg.ES()) && (com.tencent.mm.kernel.g.Eg().Dx()))
    {
      i = 1;
      if ((i != 0) && (!bool)) {
        com.tencent.mm.kernel.g.Eg().Dy();
      }
      paramg = com.tencent.mm.blink.b.xi();
      x.i("MicroMsg.FirstScreenArrangement", "arrangeInitializePendingPlugins now? %s", new Object[] { Boolean.valueOf(bool) });
      if (!bool) {
        break label291;
      }
      paramg.a(b.b.cWp);
    }
    for (;;)
    {
      if ((i != 0) && (bool)) {
        com.tencent.mm.kernel.g.Eg().Dy();
      }
      com.tencent.mm.blink.a.ey("afterAccountInit");
      return;
      i = 0;
      break;
      label291:
      ah.i(new b.2(paramg), 1000L);
    }
  }
  
  public final void gm(String paramString)
  {
    this.drX.add(paramString);
  }
  
  public void uQ()
  {
    boolean bool = ((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.Ef().DM()).ES();
    double d2 = n.zs();
    if (bool) {}
    for (double d1 = 1.5D;; d1 = 1.0D)
    {
      int i = (int)Math.min(Math.floor(d1 * d2), 6.0D);
      x.i("MicroMsg.ParallelsBootStep", "core num %s for parallels", new Object[] { Integer.valueOf(i) });
      this.drW.init(i);
      c localc = c.Et();
      localc.dru.a(new Class[] { com.tencent.mm.kernel.b.b.class });
      localc.drt.a(new Class[] { com.tencent.mm.kernel.a.c.b.class });
      localc.drv.a(new Class[] { com.tencent.mm.kernel.api.h.class, com.tencent.mm.kernel.api.a.class, com.tencent.mm.kernel.api.e.class, ai.class, com.tencent.mm.kernel.api.c.class });
      Object localObject = localc.drv;
      ((com.tencent.mm.kernel.a.b.g)localObject).dsI = new Class[1];
      localObject = ((com.tencent.mm.kernel.a.b.g)localObject).dsI;
      System.arraycopy(new Class[] { com.tencent.mm.kernel.api.c.class }, 0, localObject, 0, 1);
      ((com.tencent.mm.kernel.b.h)com.tencent.mm.kernel.g.Ef().DM()).dqh.dro = new c.1(localc);
      com.tencent.mm.blink.a.ey("helloWeChat");
      return;
    }
  }
  
  public boolean uT()
  {
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kernel/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */