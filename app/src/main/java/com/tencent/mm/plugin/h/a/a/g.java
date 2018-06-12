package com.tencent.mm.plugin.h.a.a;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class g
  extends j
{
  private byte hfq = 0;
  
  final boolean ac(byte[] paramArrayOfByte)
  {
    if (bi.bC(paramArrayOfByte))
    {
      x.e("MicroMsg.exdevice.IBeaconTLVSectionA", "valueByte is null or nil");
      return false;
    }
    if (2 != this.mLength)
    {
      x.d("MicroMsg.exdevice.IBeaconTLVSectionA", "IBEACON_TLV_SECTION_A_LENGTH != mLength(%d)", new Object[] { Integer.valueOf(this.mLength) });
      return false;
    }
    this.hfq = paramArrayOfByte[0];
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/h/a/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */