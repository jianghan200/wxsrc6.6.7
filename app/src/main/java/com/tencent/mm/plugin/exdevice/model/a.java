package com.tencent.mm.plugin.exdevice.model;

import android.os.Bundle;
import com.tencent.mm.g.a.ds;
import com.tencent.mm.plugin.exdevice.service.n.a;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  extends n.a
{
  private static final a isW = new a();
  
  public static a aGJ()
  {
    return isW;
  }
  
  public final Bundle k(int paramInt, Bundle paramBundle)
  {
    x.i("MicroMsg.exdevice.ExDeviceInvokerHandler", "onExdeviceInvoke, action code = %d", new Object[] { Integer.valueOf(paramInt) });
    if (paramBundle == null) {
      x.e("MicroMsg.exdevice.ExDeviceInvokerHandler", "null == aData");
    }
    do
    {
      return null;
      switch (paramInt)
      {
      default: 
        return null;
      }
      if (paramBundle == null)
      {
        x.e("MicroMsg.exdevice.ExDeviceInvokerHandler", "null == aData");
        return null;
      }
      paramInt = paramBundle.getInt("key_state");
      x.i("MicroMsg.exdevice.ExDeviceInvokerHandler", "handleOnBluetoothStateChange, state = %d", new Object[] { Integer.valueOf(paramInt) });
      if (-1 == paramInt)
      {
        x.e("MicroMsg.exdevice.ExDeviceInvokerHandler", "invalid state, just leave!!!");
        return null;
      }
      paramBundle = new ds();
      paramBundle.bLC.bLD = paramInt;
    } while (com.tencent.mm.sdk.b.a.sFg.m(paramBundle));
    x.e("MicroMsg.exdevice.ExDeviceInvokerHandler", "EventCenter.instance.publish failed!!!");
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/exdevice/model/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */