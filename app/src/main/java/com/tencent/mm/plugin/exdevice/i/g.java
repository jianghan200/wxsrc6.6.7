package com.tencent.mm.plugin.exdevice.i;

import com.tencent.mm.plugin.exdevice.b.c;
import com.tencent.mm.plugin.exdevice.b.i;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.service.f;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.x;

public final class g
  extends ae
{
  private c izC;
  private a izD;
  
  public g(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    this.izC = new i(paramArrayOfByte, paramInt, paramLong);
  }
  
  public final boolean a(m paramm, d paramd)
  {
    if (!u.aHF().cR(this.izC.hjj))
    {
      x.w("MicroMsg.exdevice.MMPushManufacturerSvrSendDataLogic", "Service push data to device before it do auth, device id = %d", new Object[] { Long.valueOf(this.izC.hjj) });
      return true;
    }
    this.izD = new a(this.izC, paramd);
    return this.izD.b(paramm);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/exdevice/i/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */