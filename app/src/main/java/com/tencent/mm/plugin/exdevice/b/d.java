package com.tencent.mm.plugin.exdevice.b;

import com.tencent.mm.bk.a;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public abstract class d
  extends c
{
  protected a isF = null;
  private short isG = -1;
  private short isH = -1;
  
  public d(long paramLong, int paramInt1, int paramInt2, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.exdevice.ExDeviceCmdBaseReqResp", "onDeviceRequest deviceId = " + paramLong + " seq = " + paramInt1 + " cmdId = " + paramInt2);
    this.hjj = paramLong;
    this.isG = ((short)paramInt2);
    this.isH = ((short)paramInt1);
    ao(paramArrayOfByte);
  }
  
  public final short aGA()
  {
    return this.isG;
  }
  
  public final short aGB()
  {
    return this.isH;
  }
  
  public final byte[] aGC()
  {
    try
    {
      byte[] arrayOfByte = this.isE.toByteArray();
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      x.e("MicroMsg.exdevice.ExDeviceCmdBaseReqResp", "mResp.toByteArray() Failed!!! %s", new Object[] { localIOException.getMessage() });
      x.printErrStackTrace("MicroMsg.exdevice.ExDeviceCmdBaseReqResp", localIOException, "", new Object[0]);
    }
    return null;
  }
  
  public final a aGD()
  {
    return this.isF;
  }
  
  protected abstract a ao(byte[] paramArrayOfByte);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/exdevice/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */