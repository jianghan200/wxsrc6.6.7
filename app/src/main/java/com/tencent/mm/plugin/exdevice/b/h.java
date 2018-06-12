package com.tencent.mm.plugin.exdevice.b;

import com.tencent.mm.bk.a;
import com.tencent.mm.plugin.exdevice.e.c;
import com.tencent.mm.plugin.exdevice.e.n;
import com.tencent.mm.sdk.platformtools.x;

public final class h
  extends j
{
  public h(int paramInt1, int paramInt2, long paramLong)
  {
    n localn = new n();
    localn.ixh = new c();
    localn.ixl = paramInt1;
    localn.ixm = paramInt2;
    this.isE = localn;
    this.hjj = paramLong;
    this.isC = 30002;
  }
  
  public final byte[] aGC()
  {
    try
    {
      byte[] arrayOfByte = this.isE.toByteArray();
      return arrayOfByte;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.exdevice.ExDeviceCmdSwitchViewPush", "mResp.toByteArray() Failed!!! %s", new Object[] { localException.getMessage() });
    }
    return null;
  }
  
  public final int aGE()
  {
    n localn = (n)this.isE;
    if (localn == null)
    {
      x.e("MicroMsg.exdevice.ExDeviceCmdSwitchViewPush", "null = pushReq");
      return -1;
    }
    return localn.ixl;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/exdevice/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */