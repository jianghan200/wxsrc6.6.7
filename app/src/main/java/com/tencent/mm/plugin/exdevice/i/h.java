package com.tencent.mm.plugin.exdevice.i;

import com.tencent.mm.plugin.exdevice.b.f;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.sdk.platformtools.x;

public final class h
  extends ae
{
  private f isP;
  private a izE;
  
  public h(f paramf)
  {
    this.isP = paramf;
  }
  
  public final boolean a(m paramm, d paramd)
  {
    this.izE = new a(this.isP, paramd);
    boolean bool = this.izE.b(paramm);
    x.i("MicroMsg.exdevice.MMSendDataToDeviceExcuter", "send data to devide : %b", new Object[] { Boolean.valueOf(bool) });
    return bool;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/exdevice/i/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */