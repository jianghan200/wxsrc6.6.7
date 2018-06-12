package com.tencent.mm.plugin.exdevice.model;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  implements e
{
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.exdevice.ExDeviceMessageService", "onScenend, errType = %d, errCode = %d, errMsg = ", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/exdevice/model/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */