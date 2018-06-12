package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.mm.model.au;
import com.tencent.mm.plugin.ipcall.a.a.b;
import com.tencent.mm.plugin.ipcall.a.a.c;
import com.tencent.mm.sdk.platformtools.x;

public final class i
  extends b
{
  private com.tencent.mm.plugin.ipcall.a.d.o kst = null;
  private int ksu = 0;
  
  public final int Mw()
  {
    return 2;
  }
  
  public final int[] aXB()
  {
    return new int[] { 819 };
  }
  
  public final void aXC() {}
  
  public final int aXD()
  {
    return this.ksu;
  }
  
  public final void aXE()
  {
    x.d("MicroMsg.IPCallSyncService", "onLoopSuccess");
  }
  
  public final void aXF()
  {
    x.d("MicroMsg.IPCallSyncService", "onLoopFailed");
  }
  
  public final void b(c paramc)
  {
    boolean bool = true;
    if (paramc == null) {}
    for (;;)
    {
      x.d("MicroMsg.IPCallSyncService", "serviceImpl, info==null: %b", new Object[] { Boolean.valueOf(bool) });
      if (this.koG != null)
      {
        this.ksu = this.koG.kpy;
        this.kst = new com.tencent.mm.plugin.ipcall.a.d.o(this.koG.kpo, this.koG.kpp, this.koG.aXG(), this.koG.kpq, false);
        au.DF().a(this.kst, 0);
      }
      return;
      bool = false;
    }
  }
  
  public final void onDestroy() {}
  
  public final void onStop()
  {
    if (this.kst != null) {
      au.DF().c(this.kst);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/f/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */