package com.tencent.mm.plugin.sport.c;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.booter.MMReceivers.a;
import com.tencent.mm.sdk.platformtools.x;

public final class j
  implements MMReceivers.a
{
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    long l = System.currentTimeMillis();
    x.i("MicroMsg.Sport.SportRebootReceiverImpl", "onReceive, save rebootTime = %d %s", new Object[] { Long.valueOf(l), n.bx(l) });
    i.N(205, l);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sport/c/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */