package com.tencent.mm.plugin.zero;

import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.api.bucket.c;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bu;
import com.tencent.mm.model.bu.a;
import com.tencent.mm.modelmulti.p;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Queue;

public final class b
  implements c, com.tencent.mm.plugin.zero.b.b
{
  private bu qxB;
  private p qxC;
  
  public final p PM()
  {
    g.Ek();
    g.Eg().Ds();
    if (this.qxC == null) {
      this.qxC = new p();
    }
    return this.qxC;
  }
  
  public final bu cbe()
  {
    g.Ek();
    g.Eg().Ds();
    if (this.qxB == null) {
      this.qxB = new bu(new bu.a()
      {
        public final boolean IQ()
        {
          return b.this.PM().eaw == null;
        }
      });
    }
    return this.qxB;
  }
  
  public final void onAccountInitialized(e.c paramc) {}
  
  public final void onAccountRelease()
  {
    if (this.qxC != null)
    {
      p localp = this.qxC;
      x.i("MicroMsg.SyncService", "clear synclist:%s notify:%s running:%s", new Object[] { Integer.valueOf(localp.eat.size()), Integer.valueOf(localp.eau.size()), localp.eaw });
      localp.eat.clear();
      localp.eau.clear();
    }
    if (this.qxB != null) {
      this.qxB.IL();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/zero/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */