package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.ipcall.a.a.a;
import com.tencent.mm.plugin.ipcall.a.a.c;
import com.tencent.mm.plugin.ipcall.a.d.l;
import com.tencent.mm.sdk.platformtools.x;

public final class g
  extends a
{
  public final int Mw()
  {
    return 7;
  }
  
  public final int[] aXB()
  {
    return new int[] { 227 };
  }
  
  public final void aXC() {}
  
  public final void b(c paramc)
  {
    if (paramc != null)
    {
      l locall = new l(paramc.kpo, paramc.kpq, paramc.kpT);
      au.DF().a(locall, 0);
      x.i("MicroMsg.IPCallReportService", "start report, roomid: %d, callseq: %d, isAccept: %b", new Object[] { Integer.valueOf(paramc.kpo), Long.valueOf(paramc.kpq), Boolean.valueOf(paramc.kpT) });
    }
  }
  
  public final void onDestroy() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/f/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */