package com.tencent.mm.booter;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.plugin.report.service.h;

public class BluetoothStateReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = BluetoothAdapter.getDefaultAdapter();
    if (paramContext != null)
    {
      if (paramContext.getState() != 12) {
        break label55;
      }
      h.mEJ.h(11921, new Object[] { Integer.valueOf(1) });
    }
    for (;;)
    {
      new StringBuilder("[oneliang]bluetoothAdapter state:").append(paramContext.getState());
      return;
      label55:
      if (paramContext.getState() == 10) {
        h.mEJ.h(11921, new Object[] { Integer.valueOf(0) });
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/booter/BluetoothStateReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */