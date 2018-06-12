package com.tencent.mm.openim;

import com.tencent.mm.ab.o;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.ag;
import com.tencent.mm.model.s;
import com.tencent.mm.openim.b.j;
import com.tencent.mm.openim.c.h;
import com.tencent.mm.openim.d.d;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public class PluginOpenIM
  extends com.tencent.mm.kernel.b.f
  implements com.tencent.mm.kernel.api.a, com.tencent.mm.kernel.api.bucket.c
{
  public static HashMap<Integer, h.d> cVM;
  private com.tencent.mm.sdk.b.c eud = new PluginOpenIM.1(this);
  private d eue;
  private com.tencent.mm.openim.d.b euf;
  private com.tencent.mm.openim.d.f eug;
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("OpenIMAccTypeInfo_TABLE".hashCode()), new PluginOpenIM.2());
    cVM.put(Integer.valueOf("OpenIMAppIdInfo_TABLE".hashCode()), new h.d()
    {
      public final String[] xb()
      {
        return d.diD;
      }
    });
    cVM.put(Integer.valueOf("OpenIMWordingInfo_TABLE".hashCode()), new PluginOpenIM.4());
  }
  
  public HashMap<Integer, h.d> collectDatabaseFactory()
  {
    return cVM;
  }
  
  public void configure(com.tencent.mm.kernel.b.g paramg) {}
  
  public void execute(com.tencent.mm.kernel.b.g paramg) {}
  
  public com.tencent.mm.openim.d.b getAccTypeInfoStg()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (this.euf == null)
    {
      com.tencent.mm.kernel.g.Ek();
      this.euf = new com.tencent.mm.openim.d.b(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return this.euf;
  }
  
  public d getAppIdInfoStg()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (this.euf == null)
    {
      com.tencent.mm.kernel.g.Ek();
      this.eue = new d(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return this.eue;
  }
  
  public com.tencent.mm.openim.d.f getWordingInfoStg()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (this.eug == null)
    {
      com.tencent.mm.kernel.g.Ek();
      this.eug = new com.tencent.mm.openim.d.f(com.tencent.mm.kernel.g.Ei().dqq);
    }
    return this.eug;
  }
  
  public void onAccountInitialized(e.c paramc)
  {
    x.i("MicroMsg.PluginOpenIM", "onAccountInitialized");
    com.tencent.mm.sdk.b.a.sFg.a(this.eud);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.a(com.tencent.mm.openim.a.b.class, new j());
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.a(com.tencent.mm.openim.a.a.class, new h());
    s.a((ag)com.tencent.mm.kernel.g.l(com.tencent.mm.openim.a.a.class));
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(453, (com.tencent.mm.ab.e)com.tencent.mm.kernel.g.l(com.tencent.mm.openim.a.b.class));
  }
  
  public void onAccountRelease()
  {
    x.i("MicroMsg.PluginOpenIM", "onAccountRelease");
    com.tencent.mm.sdk.b.a.sFg.c(this.eud);
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(453, (com.tencent.mm.ab.e)com.tencent.mm.kernel.g.l(com.tencent.mm.openim.a.b.class));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/openim/PluginOpenIM.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */