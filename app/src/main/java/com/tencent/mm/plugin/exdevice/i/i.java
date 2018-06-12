package com.tencent.mm.plugin.exdevice.i;

import com.tencent.mm.plugin.exdevice.b.c;
import com.tencent.mm.plugin.exdevice.b.g;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.x;

public final class i
  extends ae
{
  private a izD;
  private g izF;
  
  public i(int paramInt)
  {
    this.izF = new g(paramInt);
  }
  
  public final boolean a(m paramm, d paramd)
  {
    if (!u.aHF().cR(this.izF.hjj))
    {
      x.w("MicroMsg.exdevice.MMSwitchBackGroudTaskExcuter", "push switch backgroud event to device before it do auth, device id = %d", new Object[] { Long.valueOf(this.izF.hjj) });
      return true;
    }
    this.izD = new a(this.izF, paramd);
    return this.izD.b(paramm);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/exdevice/i/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */