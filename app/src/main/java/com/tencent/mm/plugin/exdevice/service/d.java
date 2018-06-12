package com.tencent.mm.plugin.exdevice.service;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.kernel.k;
import com.tencent.mm.sdk.platformtools.x;

public final class d
{
  public static boolean de(Context paramContext)
  {
    if (k.bA(paramContext))
    {
      x.i("MicroMsg.exdevice.ExDeviceServiceHelper", "fully exited, no need to start service");
      return false;
    }
    Intent localIntent = new Intent(paramContext, ExDeviceService.class);
    localIntent.setFlags(268435456);
    paramContext.startService(localIntent);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/exdevice/service/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */