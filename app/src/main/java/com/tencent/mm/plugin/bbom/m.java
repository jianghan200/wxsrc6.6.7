package com.tencent.mm.plugin.bbom;

import com.tencent.mm.ac.a.e;
import com.tencent.mm.ac.f;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.plugin.messenger.foundation.a.g;
import com.tencent.mm.plugin.messenger.foundation.a.l;
import com.tencent.mm.protocal.c.ato;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.bd;

public final class m
  implements g, l
{
  public final void a(ato paramato, bd parambd)
  {
    if (f.eZ(parambd.field_talker))
    {
      paramato.rco = parambd.cqb;
      if (bi.oW(paramato.rco)) {
        paramato.rco = e.lg(parambd.cqb);
      }
      return;
    }
    paramato.rco = parambd.cqb;
  }
  
  public final String v(bd parambd)
  {
    if (f.eZ(parambd.field_talker)) {
      return e.Ir();
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/bbom/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */