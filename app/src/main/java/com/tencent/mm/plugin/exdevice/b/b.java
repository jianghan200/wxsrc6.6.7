package com.tencent.mm.plugin.exdevice.b;

import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public final class b
  extends d
{
  public b(long paramLong, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    super(paramLong, paramInt1, paramInt2, paramArrayOfByte);
    x.i("MicroMsg.exdevice.ExDeviceCmdAuth", "ExDeviceCmdAuth deviceId = " + paramLong + " seq = " + paramInt1 + " cmdId = " + paramInt2);
  }
  
  protected final com.tencent.mm.bk.a ao(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      x.e("MicroMsg.exdevice.ExDeviceCmdAuth", "paras body is null");
      return null;
    }
    com.tencent.mm.plugin.exdevice.e.a locala = new com.tencent.mm.plugin.exdevice.e.a();
    try
    {
      locala.aG(paramArrayOfByte);
      this.isF = locala;
      x.i("MicroMsg.exdevice.ExDeviceCmdAuth", "------AuthRequest------ ClientVersion = " + locala.iwJ + " DeviceName = " + locala.hbP + " Language = " + locala.iwP + " TimeZone = " + locala.iwO);
      return locala;
    }
    catch (IOException paramArrayOfByte)
    {
      x.e("MicroMsg.exdevice.ExDeviceCmdAuth", "AuthRequest.parseFrom Failed!!! %s", new Object[] { paramArrayOfByte.getMessage() });
      x.printErrStackTrace("MicroMsg.exdevice.ExDeviceCmdAuth", paramArrayOfByte, "", new Object[0]);
    }
    return null;
  }
  
  public final void b(int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.exdevice.ExDeviceCmdAuth", "------setAuthResponse------ret = " + paramInt + "errMsg = " + paramString);
    com.tencent.mm.plugin.exdevice.e.b localb = new com.tencent.mm.plugin.exdevice.e.b();
    localb.ixj = X(paramInt, paramString);
    localb.iwQ = com.tencent.mm.bk.b.bi(paramArrayOfByte);
    this.isE = localb;
    this.isC = 20001;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/exdevice/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */