package com.tencent.mm.compatible.c;

import android.media.AudioManager;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class a
{
  public static boolean a(AudioManager paramAudioManager)
  {
    if (ar.vZ()) {
      return false;
    }
    x.i("MicroMsg.BluetoothUtil", "stop DeviceInfo mCommonInfo getStartBluetoothSco:%s,getStopBluetoothInBU:%s ", new Object[] { Integer.valueOf(q.deW.ddx), Integer.valueOf(q.deW.ddw) });
    if (((q.deW.ddw == 1) || (q.deW.ddx == -1)) && (paramAudioManager.isBluetoothScoOn()))
    {
      x.i("MicroMsg.BluetoothUtil", "BluetoothUtil stopBluetoothSco stack: %s", new Object[] { bi.cjd() });
      paramAudioManager.stopBluetoothSco();
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/compatible/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */