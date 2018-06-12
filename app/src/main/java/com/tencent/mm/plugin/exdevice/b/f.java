package com.tencent.mm.plugin.exdevice.b;

import com.tencent.mm.bk.a;
import com.tencent.mm.bk.b;
import com.tencent.mm.plugin.exdevice.e.k;
import com.tencent.mm.plugin.exdevice.e.l;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public final class f
  extends d
{
  public f(long paramLong, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    super(paramLong, paramInt1, paramInt2, paramArrayOfByte);
    x.i("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "ExDeviceCmdSendDataToManufacturer deviceId = " + paramLong + " seq = " + paramInt1 + " cmdId = " + paramInt2);
  }
  
  protected final a ao(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      x.e("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "data is null");
      return null;
    }
    k localk = new k();
    try
    {
      localk.aG(paramArrayOfByte);
      this.isF = localk;
      x.i("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "SendDataToManufacturerSvrRequest cmd has been received");
      return localk;
    }
    catch (IOException paramArrayOfByte)
    {
      x.e("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "SendDataToManufacturerSvrRequest.parseFrom Failed!!! %s", new Object[] { paramArrayOfByte.getMessage() });
      x.printErrStackTrace("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", paramArrayOfByte, "", new Object[0]);
    }
    return null;
  }
  
  public final void c(int paramInt, String paramString, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.exdevice.ExDeviceCmdSendDataToManufacturer", "setSendDataToManufacturerResponse ret = " + paramInt + paramString);
    l locall = new l();
    locall.ixj = X(paramInt, paramString);
    paramString = paramArrayOfByte;
    if (paramArrayOfByte == null) {
      paramString = new byte[0];
    }
    locall.hbs = new b(paramString);
    this.isE = locall;
    this.isC = 20002;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/exdevice/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */