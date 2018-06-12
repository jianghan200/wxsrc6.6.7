package com.tencent.mm.ar;

import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bi;

public final class c
  implements com.tencent.mm.ab.e
{
  private static c ecx;
  private boolean dFt = false;
  private int ecw = 3;
  
  public static c Qj()
  {
    if (ecx == null) {
      ecx = new c();
    }
    return ecx;
  }
  
  private void release()
  {
    this.dFt = false;
    g.Eh().dpP.b(159, this);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (paraml.getType() == 159)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ConfigListUpdater", "getPackageList sceneEnd, %s, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label66;
      }
      g.Ei().DT().set(81938, Long.valueOf(bi.VE()));
    }
    for (;;)
    {
      release();
      return;
      label66:
      paramInt1 = this.ecw - 1;
      this.ecw = paramInt1;
      if (paramInt1 < 0)
      {
        g.Ei().DT().set(81938, Long.valueOf((bi.VF() - 86400000L + 3600000L) / 1000L));
        this.ecw = 3;
      }
    }
  }
  
  public final void update()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ConfigListUpdater", "isUpdateing : " + this.dFt);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ConfigListUpdater", "isSDCardAvailable : " + g.Ei().isSDCardAvailable());
    if ((!this.dFt) && (g.Ei().isSDCardAvailable()))
    {
      release();
      this.dFt = true;
      g.Eh().dpP.a(159, this);
      k localk = new k(7);
      g.Eh().dpP.a(localk, 0);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ar/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */