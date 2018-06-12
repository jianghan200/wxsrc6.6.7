package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.mm.ab.l;
import com.tencent.mm.plugin.ipcall.a.a.a.a;
import com.tencent.mm.plugin.ipcall.a.a.c;
import com.tencent.mm.plugin.ipcall.a.h;
import com.tencent.mm.plugin.ipcall.a.h.a;
import com.tencent.mm.protocal.c.bcd;

public final class e
  extends com.tencent.mm.plugin.ipcall.a.a.a
  implements h.a
{
  private h ksq = null;
  
  public final int Mw()
  {
    return 8;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml) {}
  
  public final void a(bcd parambcd)
  {
    this.kpk.a(8, parambcd, 0, 0);
  }
  
  public final int[] aXB()
  {
    return new int[0];
  }
  
  public final void aXC()
  {
    this.ksq = new h();
    this.ksq.koL = this;
    com.tencent.mm.sdk.b.a.sFg.b(this.ksq);
  }
  
  public final void b(c paramc) {}
  
  public final void onDestroy()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.ksq);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/f/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */