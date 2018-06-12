package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.ipcall.a.a.a;
import com.tencent.mm.plugin.ipcall.a.a.c;
import com.tencent.mm.plugin.ipcall.a.d.i;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends a
{
  public final int Mw()
  {
    return 1;
  }
  
  public final int[] aXB()
  {
    return new int[] { 991 };
  }
  
  public final void aXC() {}
  
  public final void b(c paramc)
  {
    if (paramc != null)
    {
      if (paramc.kpr == 0) {
        paramc.kpr = ((int)System.currentTimeMillis());
      }
      i locali = new i(paramc.bZR, paramc.kpQ, paramc.kpr, paramc.kps, paramc.kpt);
      au.DF().a(locali, 0);
      x.d("MicroMsg.IPCallInviteService", "start invite, toUsername: %s, toPhoneNumber: %s, inviteid: %d", new Object[] { paramc.bZR, paramc.kpQ, Integer.valueOf(paramc.kpr) });
    }
  }
  
  public final void onDestroy() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */