package com.tencent.mm.plugin.b;

import com.tencent.mm.ab.d.c;
import com.tencent.mm.kernel.api.bucket.c;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.a.d;
import com.tencent.mm.model.bv;
import com.tencent.mm.model.p;
import com.tencent.mm.plugin.messenger.foundation.a.o;

public final class a
  extends p
  implements c
{
  private static a eEu;
  private d eEv = new d();
  private com.tencent.mm.model.a.a eEw = new com.tencent.mm.model.a.a();
  
  private a()
  {
    super(com.tencent.mm.model.a.g.class);
  }
  
  public static a WB()
  {
    try
    {
      if (eEu == null) {
        eEu = new a();
      }
      a locala = eEu;
      return locala;
    }
    finally {}
  }
  
  public final void onAccountInitialized(e.c paramc)
  {
    super.onAccountInitialized(paramc);
    d.c.a(Integer.valueOf(-1879048184), this.eEv);
    ((o)com.tencent.mm.kernel.g.n(o.class)).getSysCmdMsgExtension().a("abtest", this.eEw);
  }
  
  public final void onAccountRelease()
  {
    super.onAccountRelease();
    d.c.a(Integer.valueOf(-1879048184), this.eEv);
    ((o)com.tencent.mm.kernel.g.n(o.class)).getSysCmdMsgExtension().b("abtest", this.eEw);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */