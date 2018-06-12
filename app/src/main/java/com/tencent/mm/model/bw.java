package com.tencent.mm.model;

import com.tencent.mm.ab.d;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.d.b;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.storage.bd;
import java.util.Map;

public final class bw
  implements d
{
  public final d.b b(d.a parama)
  {
    parama = parama.dIN;
    if (parama == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SysNoticeMsgExtension", "onPreAddMessage cmdAM is null");
      return null;
    }
    int i;
    int j;
    try
    {
      parama = bl.z("<root>" + parama.rcl + "</root>", "root");
      i = Integer.valueOf((String)parama.get(".root.newcount")).intValue();
      j = Integer.valueOf((String)parama.get(".root.version")).intValue();
      au.HU();
      parama = c.DT();
      if (j == bi.f((Integer)parama.get(12305, null)))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SysNoticeMsgExtension", "ignore new sys notice count, same version");
        return null;
      }
    }
    catch (Exception parama)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SysNoticeMsgExtension", "exception:%s", new Object[] { bi.i(parama) });
      return null;
    }
    parama.set(12304, Integer.valueOf(i));
    parama.set(12305, Integer.valueOf(j));
    return null;
  }
  
  public final void h(bd parambd) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/model/bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */