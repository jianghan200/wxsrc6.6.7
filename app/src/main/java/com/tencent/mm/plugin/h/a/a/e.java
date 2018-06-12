package com.tencent.mm.plugin.h.a.a;

import com.tencent.mm.plugin.exdevice.j.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class e
{
  private final g heR = new g();
  public final h heS = new h();
  
  public final boolean ab(byte[] paramArrayOfByte)
  {
    boolean bool1;
    if (bi.bC(paramArrayOfByte))
    {
      x.e("MicroMsg.exdevice.IBeaconProtocal", "dataIn is null or nil");
      bool1 = false;
    }
    boolean bool2;
    do
    {
      return bool1;
      a locala = new a(paramArrayOfByte.length);
      locala.N(paramArrayOfByte, paramArrayOfByte.length);
      bool1 = this.heR.a(locala);
      if (!bool1)
      {
        x.d("MicroMsg.exdevice.IBeaconProtocal", "mSectionA.ParseTLV Failed!!!");
        return bool1;
      }
      bool2 = this.heS.a(locala);
      bool1 = bool2;
    } while (bool2);
    x.d("MicroMsg.exdevice.IBeaconProtocal", "mSectionB.ParseTLV Failed!!!");
    return bool2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/h/a/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */