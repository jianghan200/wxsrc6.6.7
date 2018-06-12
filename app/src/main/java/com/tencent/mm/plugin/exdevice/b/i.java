package com.tencent.mm.plugin.exdevice.b;

import com.tencent.mm.bk.a;
import com.tencent.mm.bk.b;
import com.tencent.mm.plugin.exdevice.e.c;
import com.tencent.mm.plugin.exdevice.e.h;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import junit.framework.Assert;

public final class i
  extends j
{
  public i(byte[] paramArrayOfByte, int paramInt, long paramLong)
  {
    h localh = new h();
    localh.ixh = new c();
    localh.hbs = new b(paramArrayOfByte);
    localh.hcE = paramInt;
    this.isE = localh;
    this.hjj = paramLong;
    this.isC = 30001;
  }
  
  public final byte[] aGC()
  {
    Assert.assertNotNull(this.isE);
    try
    {
      byte[] arrayOfByte = this.isE.toByteArray();
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      x.e("MicroMsg.exdevice.ExDevicePushManufacturerSvrSendData", "mResp.toByteArray() Failed!!! %s", new Object[] { localIOException.getMessage() });
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/exdevice/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */