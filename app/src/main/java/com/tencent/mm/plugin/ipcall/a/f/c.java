package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.ipcall.a.a.b;
import com.tencent.mm.plugin.ipcall.a.d.h;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends b
{
  private h ksp;
  
  public final int Mw()
  {
    return 5;
  }
  
  public final int[] aXB()
  {
    return new int[] { 824 };
  }
  
  public final void aXC() {}
  
  public final int aXD()
  {
    return 50000;
  }
  
  public final void aXE()
  {
    x.d("MicroMsg.IPCallHeartBeatService", "heartbeat, onLoopSuccess");
  }
  
  public final void aXF()
  {
    x.d("MicroMsg.IPCallHeartBeatService", "heartbeat, onLoopFailed");
  }
  
  public final void b(com.tencent.mm.plugin.ipcall.a.a.c paramc)
  {
    if (this.koG != null)
    {
      this.ksp = new h(this.koG.kpo, this.koG.kpp, this.koG.kpq);
      au.DF().a(this.ksp, 0);
    }
  }
  
  public final void onDestroy() {}
  
  public final void onStop()
  {
    if (this.ksp != null) {
      au.DF().c(this.ksp);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/f/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */