package com.tencent.mm.plugin.h.a.a;

import com.tencent.mm.plugin.exdevice.j.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.util.Arrays;

public final class h
  extends j
{
  private static final byte[] hfr = { 76, 0, 2, 21 };
  private byte[] hfs = null;
  public byte[] hft = null;
  public short hfu = -1;
  public short hfv = -1;
  public int hfw = 0;
  
  final boolean ac(byte[] paramArrayOfByte)
  {
    if (bi.bC(paramArrayOfByte))
    {
      x.e("MicroMsg.exdevice.IBeaconTLVSectionB", "valueByte is null or nil");
      return false;
    }
    if (26 != this.mLength)
    {
      x.d("MicroMsg.exdevice.IBeaconTLVSectionB", "IBEACON_TLV_SECTION_B_LENGTH != mLength(%d) ", new Object[] { Integer.valueOf(this.mLength) });
      return false;
    }
    a locala = new a(paramArrayOfByte.length);
    locala.N(paramArrayOfByte, paramArrayOfByte.length);
    paramArrayOfByte = new byte[4];
    locala.M(paramArrayOfByte, 4);
    if (!Arrays.equals(paramArrayOfByte, hfr))
    {
      x.d("MicroMsg.exdevice.IBeaconTLVSectionB", "Cannot find ibeacon cookies!!!");
      return false;
    }
    this.hfs = paramArrayOfByte;
    this.hft = new byte[16];
    locala.M(this.hft, 16);
    try
    {
      this.hfu = locala.readShort();
      this.hfv = locala.readShort();
      paramArrayOfByte = new byte[1];
      locala.M(paramArrayOfByte, 1);
      this.hfw = paramArrayOfByte[0];
      return true;
    }
    catch (IOException paramArrayOfByte)
    {
      x.d("MicroMsg.exdevice.IBeaconTLVSectionB", "Read major/minor from autobuffer failed!!!");
      x.printErrStackTrace("MicroMsg.exdevice.IBeaconTLVSectionB", paramArrayOfByte, "", new Object[0]);
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/h/a/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */