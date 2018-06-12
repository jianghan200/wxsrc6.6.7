package com.tencent.mm.plugin.sport;

import com.tencent.mm.booter.MMReceivers.ExdeviceProcessReceiver;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.a.b.a.a;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.c.e;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.sport.c.g.a;
import com.tencent.mm.plugin.sport.c.h;
import com.tencent.mm.plugin.sport.c.i;
import com.tencent.mm.plugin.sport.c.j;
import com.tencent.mm.plugin.sport.c.l;
import com.tencent.mm.plugin.sport.c.m;
import java.util.HashMap;

public class PluginSport
  extends f
  implements com.tencent.mm.kernel.a.b.b, com.tencent.mm.kernel.api.a, com.tencent.mm.kernel.api.bucket.c, a
{
  public static HashMap<Integer, h.d> cVM;
  private com.tencent.mm.plugin.sport.c.a ooA;
  private com.tencent.mm.plugin.sport.c.b ooB;
  private l ooC;
  private m ooD;
  private g.a ooE = new PluginSport.1(this);
  private h ooy;
  private com.tencent.mm.plugin.sport.b.b ooz;
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("SPORTSTEP_TABLE".hashCode()), new PluginSport.2());
  }
  
  public HashMap<Integer, h.d> collectDatabaseFactory()
  {
    return cVM;
  }
  
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    MMReceivers.ExdeviceProcessReceiver.a(new j());
  }
  
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    if (this.ooy == null) {
      this.ooy = i.bFN();
    }
    if (paramg.ES())
    {
      this.ooz = new c();
      com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.sport.b.b.class, new e(this.ooz));
    }
  }
  
  public com.tencent.mm.plugin.sport.c.a getDeviceStepManager()
  {
    return this.ooA;
  }
  
  public com.tencent.mm.plugin.sport.c.b getExtApiStepManager()
  {
    return this.ooB;
  }
  
  public h getSportFileStorage()
  {
    if (this.ooy == null) {
      this.ooy = i.bFN();
    }
    return this.ooy;
  }
  
  public l getSportStepManager()
  {
    return this.ooC;
  }
  
  public m getSportStepStorage()
  {
    return this.ooD;
  }
  
  public void onAccountInitialized(e.c paramc)
  {
    this.ooA = new com.tencent.mm.plugin.sport.c.a();
    this.ooB = new com.tencent.mm.plugin.sport.c.b();
    this.ooD = new m();
    this.ooC = new l();
    com.tencent.mm.plugin.sport.c.g.a(this.ooE);
    this.ooE.bFt();
  }
  
  public void onAccountRelease()
  {
    com.tencent.mm.plugin.sport.c.g.a(null);
    Object localObject;
    if (this.ooA != null)
    {
      localObject = this.ooA;
      ((com.tencent.mm.plugin.sport.c.a)localObject).ooJ.dead();
      if (((com.tencent.mm.plugin.sport.c.a)localObject).ooK != null) {
        com.tencent.mm.kernel.g.DF().c(((com.tencent.mm.plugin.sport.c.a)localObject).ooK);
      }
      this.ooA = null;
    }
    if (this.ooB != null)
    {
      localObject = this.ooB;
      ((com.tencent.mm.plugin.sport.c.b)localObject).ooQ.dead();
      ((com.tencent.mm.plugin.sport.c.b)localObject).ooJ.dead();
      if (((com.tencent.mm.plugin.sport.c.b)localObject).ooK != null) {
        com.tencent.mm.kernel.g.DF().c(((com.tencent.mm.plugin.sport.c.b)localObject).ooK);
      }
      this.ooB = null;
    }
  }
  
  public void parallelsDependency()
  {
    com.tencent.mm.kernel.a.b.a.a(this, com.tencent.mm.kernel.api.c.class).aN(com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.messenger.foundation.a.o.class));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sport/PluginSport.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */