package com.tencent.mm.plugin.exdevice.g;

import com.tencent.mm.plugin.exdevice.h.b;
import com.tencent.mm.plugin.exdevice.h.c;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  public static void l(long paramLong, int paramInt)
  {
    b localb = ad.aHe().Ak(String.valueOf(paramLong));
    if (localb == null)
    {
      x.e("MicroMsg.exdevice.BTDeviceReport", "SubCoreExDevice.getHardDeviceInfoStorage().getByDeviceId Failed!!!");
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(localb.field_deviceType).append(',');
    localStringBuilder.append(localb.field_deviceID).append(',');
    localStringBuilder.append(paramInt);
    h.mEJ.k(11232, localStringBuilder.toString());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/exdevice/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */