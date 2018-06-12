package com.tencent.mm.booter;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.jg.JgClassChecked;
import com.tencent.mm.compatible.b.f;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Set;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.RECEIVERCHECK})
public class BluetoothReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramContext == null) || (paramIntent == null) || (bi.oW(paramIntent.getAction()))) {}
    int i;
    do
    {
      do
      {
        do
        {
          return;
          paramContext = BluetoothAdapter.getDefaultAdapter();
          if (paramContext == null)
          {
            x.d("MicroMsg.BluetoothReceiver", "getDefaultAdapter == null");
            return;
          }
          paramContext = paramContext.getBondedDevices();
          if ((paramContext == null) || (paramContext.size() == 0))
          {
            x.d("MicroMsg.BluetoothReceiver", "getBondedDevices == null");
            return;
          }
        } while (bi.oW(paramIntent.getAction()));
        x.d("MicroMsg.BluetoothReceiver", "dkbt action :" + paramIntent.getAction());
      } while (!au.HX());
      try
      {
        i = paramIntent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
        x.d("MicroMsg.BluetoothReceiver", "dkbt  action :" + paramIntent.getAction() + " state:" + i + " isBluetoothScoOn :" + au.HV().yE() + " " + au.HV().yI());
        if (paramIntent.getAction().equalsIgnoreCase("android.media.SCO_AUDIO_STATE_CHANGED"))
        {
          x.d("MicroMsg.BluetoothReceiver", "just STATE_CHANGED not real STATE_UPDATED" + paramIntent.getAction());
          return;
        }
      }
      catch (Exception paramContext)
      {
        for (;;)
        {
          x.e("MicroMsg.BluetoothReceiver", "%s", new Object[] { bi.i(paramContext) });
          i = 0;
        }
        if (i == 1)
        {
          x.d("MicroMsg.BluetoothReceiver", "sco connected!");
          paramContext = au.HV();
          x.i("MicroMsg.MMAudioManager", "dkbt bluetoothStartSucc %s", new Object[] { paramContext.yI() });
          f.daW = true;
          paramContext.fC(1);
          return;
        }
      }
    } while (i != 0);
    x.d("MicroMsg.BluetoothReceiver", "sco disconnected!getStopBluetoothInBR = %s", new Object[] { Integer.valueOf(q.deW.ddv) });
    if (q.deW.ddv == 1) {
      au.HV().yC();
    }
    au.HV().yA();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/booter/BluetoothReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */