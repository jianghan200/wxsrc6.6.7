package com.tencent.mm.plugin.ipcall.a.f;

import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.ipcall.a.d.g;

public final class b
{
  private static b ksn;
  private g kso;
  
  public static b aXT()
  {
    if (ksn == null) {
      ksn = new b();
    }
    return ksn;
  }
  
  public final void fY(boolean paramBoolean)
  {
    au.DF().c(this.kso);
    this.kso = null;
    if (paramBoolean) {}
    for (this.kso = new g(1);; this.kso = new g(0))
    {
      au.DF().a(this.kso, 0);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */