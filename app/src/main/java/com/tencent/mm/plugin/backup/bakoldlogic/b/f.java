package com.tencent.mm.plugin.backup.bakoldlogic.b;

import com.tencent.mm.g.c.cm;
import com.tencent.mm.plugin.backup.bakoldlogic.d.b;
import com.tencent.mm.plugin.backup.bakoldlogic.d.c;
import com.tencent.mm.plugin.backup.bakoldlogic.d.d;
import com.tencent.mm.plugin.backup.h.u;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.ey;
import com.tencent.mm.storage.bd;
import java.util.LinkedList;

public final class f
  implements j
{
  public final int a(ey paramey, bd parambd, LinkedList<u> paramLinkedList)
  {
    if (parambd.field_content == null) {
      return 0;
    }
    return parambd.field_content.getBytes().length;
  }
  
  public final int a(String paramString, ey paramey, bd parambd)
  {
    paramString = new String(paramey.rcl.siM);
    com.tencent.mm.plugin.messenger.foundation.a.a.f localf = b.atl().atm().FT();
    parambd.setContent(paramString);
    switch (paramey.hcE)
    {
    default: 
      if (parambd.field_msgId == 0L) {
        d.i(parambd);
      }
      break;
    }
    for (;;)
    {
      return 0;
      parambd.setStatus(6);
      break;
      localf.b(paramey.rcq, parambd);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */