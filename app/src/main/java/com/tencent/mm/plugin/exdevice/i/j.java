package com.tencent.mm.plugin.exdevice.i;

import com.tencent.mm.plugin.exdevice.b.c;
import com.tencent.mm.plugin.exdevice.b.h;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.x;

public final class j
  extends ae
{
  private a izG;
  private h izH;
  
  public j(int paramInt1, int paramInt2, long paramLong)
  {
    this.izH = new h(paramInt1, paramInt2, paramLong);
  }
  
  public final boolean a(m paramm, d paramd)
  {
    if (!u.aHF().cR(this.izH.hjj))
    {
      x.w("MicroMsg.exdevice.MMSwitchViewPushTaskExcuter", "push switchview event to device before it do auth, device id = %d", new Object[] { Long.valueOf(this.izH.hjj) });
      return true;
    }
    this.izG = new b(this.izH, paramd);
    return this.izG.b(paramm);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/exdevice/i/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */