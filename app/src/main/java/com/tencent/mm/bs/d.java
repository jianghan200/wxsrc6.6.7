package com.tencent.mm.bs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.tencent.mm.sdk.platformtools.x;

final class d
  extends BroadcastReceiver
{
  a<Boolean> sNL;
  a<Boolean> sNM;
  
  d(Context paramContext)
  {
    Object localObject = new IntentFilter();
    ((IntentFilter)localObject).addAction("android.intent.action.SCREEN_ON");
    ((IntentFilter)localObject).addAction("android.intent.action.SCREEN_OFF");
    ((IntentFilter)localObject).addAction("android.intent.action.ACTION_POWER_CONNECTED");
    ((IntentFilter)localObject).addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
    paramContext.registerReceiver(this, (IntentFilter)localObject);
    localObject = paramContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    boolean bool1 = bool2;
    if (localObject != null)
    {
      int i = ((Intent)localObject).getIntExtra("status", -1);
      if (i != 2)
      {
        bool1 = bool2;
        if (i != 5) {}
      }
      else
      {
        bool1 = true;
      }
    }
    this.sNL = new a("charging", Boolean.valueOf(bool1));
    this.sNM = new a("interactive", Boolean.valueOf(((PowerManager)paramContext.getSystemService("power")).isScreenOn()));
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    paramIntent = paramIntent.getAction();
    if (paramIntent == null) {
      return;
    }
    paramContext = null;
    int i = -1;
    switch (paramIntent.hashCode())
    {
    default: 
      label60:
      switch (i)
      {
      }
      break;
    }
    while (paramContext != null)
    {
      x.i("MicroMsg.SystemStatus", "System status changed: %s = %s", new Object[] { paramContext.name(), paramContext.get().toString() });
      return;
      if (!paramIntent.equals("android.intent.action.SCREEN_ON")) {
        break label60;
      }
      i = 0;
      break label60;
      if (!paramIntent.equals("android.intent.action.SCREEN_OFF")) {
        break label60;
      }
      i = 1;
      break label60;
      if (!paramIntent.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
        break label60;
      }
      i = 2;
      break label60;
      if (!paramIntent.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
        break label60;
      }
      i = 3;
      break label60;
      this.sNM.set(Boolean.valueOf(true));
      paramContext = this.sNM;
      continue;
      this.sNM.set(Boolean.valueOf(false));
      paramContext = this.sNM;
      continue;
      this.sNL.set(Boolean.valueOf(true));
      paramContext = this.sNL;
      continue;
      this.sNL.set(Boolean.valueOf(false));
      paramContext = this.sNL;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/bs/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */