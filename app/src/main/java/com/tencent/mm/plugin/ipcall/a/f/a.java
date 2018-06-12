package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.ipcall.a.a.c;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends com.tencent.mm.plugin.ipcall.a.a.a
{
  public final int Mw()
  {
    return 3;
  }
  
  public final int[] aXB()
  {
    return new int[] { 843 };
  }
  
  public final void aXC() {}
  
  public final void b(c paramc)
  {
    if (paramc != null)
    {
      x.d("MicroMsg.IPCallCancelService", "call cancel scene, roomId: %d, inviteId: %d", new Object[] { Integer.valueOf(paramc.kpo), Integer.valueOf(paramc.kpr) });
      paramc = new com.tencent.mm.plugin.ipcall.a.d.a(paramc.kpo, paramc.kpp, paramc.bZR, paramc.kpQ, paramc.kpr, paramc.kpq);
      au.DF().a(paramc, 0);
    }
  }
  
  public final void onDestroy() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */