package com.tencent.mm.plugin.card.b;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.model.u;
import com.tencent.mm.sdk.platformtools.x;

public final class l
  implements e
{
  public float cXm = -85.0F;
  public float cXn = -1000.0F;
  private long dlj = 0L;
  
  public final void G(float paramFloat1, float paramFloat2)
  {
    this.cXm = paramFloat1;
    this.cXn = paramFloat2;
    this.dlj = (System.currentTimeMillis() / 1000L);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.i("MicroMsg.CardReportLBSManager", "rplbs onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    g.Eh().dpP.b(1253, this);
  }
  
  public final void p(String paramString1, String paramString2, int paramInt)
  {
    if (System.currentTimeMillis() / 1000L - this.dlj > 1800L)
    {
      this.cXm = -85.0F;
      this.cXn = -1000.0F;
      x.i("MicroMsg.CardReportLBSManager", "checkDataValid time is out");
    }
    if (this.cXm == -85.0F) {
      x.i("MicroMsg.CardReportLBSManager", "checkDataValid lbsLatitude ==  LocationGeo.INVALID_LAT");
    }
    if (this.cXn == -1000.0F) {
      x.i("MicroMsg.CardReportLBSManager", "checkDataValid lbsLongitude ==  LocationGeo.INVALID_LNG");
    }
    g.Eh().dpP.a(1253, this);
    paramString1 = new u(this.cXm, this.cXn, paramString1, paramString2, paramInt);
    g.Eh().dpP.a(paramString1, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/card/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */