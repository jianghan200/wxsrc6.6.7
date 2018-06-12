package com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.g.a.aa;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.x;

public class BakOldUSBReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    try
    {
      String str = paramIntent.getAction();
      if ("MMBakchatServiceStart".equalsIgnoreCase(str))
      {
        paramContext.startService(new Intent().setClassName(paramContext, "com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.BakOldUSBService").putExtra("url", paramIntent.getStringExtra("url")));
        x.d("MicroMsg.BakOldUSBReceiver", "START_ACTION onReceive start end");
        return;
      }
      if ("MMBakchatServiceStop".equalsIgnoreCase(str))
      {
        paramIntent = new aa();
        paramIntent.bHi.bHj = paramContext;
        a.sFg.m(paramIntent);
        x.d("MicroMsg.BakOldUSBReceiver", "STOP_ACTION onReceive stop end");
        return;
      }
    }
    catch (Exception paramContext)
    {
      x.printErrStackTrace("MicroMsg.BakOldUSBReceiver", paramContext, "onReceive:", new Object[0]);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/bakoldmodel/BakOldUSBReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */