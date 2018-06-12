package com.tencent.mm.plugin.card.b;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.hz;
import com.tencent.mm.g.a.hz.a;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.card.model.af;
import com.tencent.mm.plugin.card.model.d;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.storage.bd;
import com.tencent.mm.y.g.a;

public final class n
  extends c<hz>
  implements e
{
  private long bIZ = 0L;
  
  public n()
  {
    this.sFo = hz.class.getName().hashCode();
  }
  
  private boolean a(hz paramhz)
  {
    String str;
    if ((paramhz instanceof hz))
    {
      Object localObject = paramhz.bRv.bRw;
      this.bIZ = paramhz.bRv.bIZ;
      str = paramhz.bRv.bRx;
      paramhz = com.tencent.mm.plugin.card.d.g.xQ((String)localObject);
      localObject = ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().dW(this.bIZ);
      ((bd)localObject).setStatus(1);
      ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().a(this.bIZ, (bd)localObject);
      if (paramhz != null) {
        break label150;
      }
      paramhz = com.tencent.mm.plugin.card.d.g.xQ(((cm)localObject).field_content);
    }
    label150:
    for (;;)
    {
      if (paramhz != null)
      {
        com.tencent.mm.kernel.g.Eh().dpP.a(652, this);
        paramhz = new af(paramhz.cac, str, 17);
        com.tencent.mm.kernel.g.Eh().dpP.a(paramhz, 0);
      }
      return true;
      return false;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof af))
    {
      paramString = ((af)paraml).cad;
      paraml = ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().dW(this.bIZ);
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        break label153;
      }
      paraml.setStatus(2);
    }
    for (;;)
    {
      g.a locala = g.a.gp(paraml.field_content);
      d locald = com.tencent.mm.plugin.card.d.g.xQ(paraml.field_content);
      locald.cad = paramString;
      locala.dxE = com.tencent.mm.plugin.card.d.g.a(locald);
      locala.bRw = g.a.a(locala, null, null);
      paraml.setContent(g.a.a(locala, null, null));
      ((i)com.tencent.mm.kernel.g.l(i.class)).bcY().a(this.bIZ, paraml);
      com.tencent.mm.kernel.g.Eh().dpP.b(652, this);
      return;
      label153:
      paraml.setStatus(5);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/b/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */