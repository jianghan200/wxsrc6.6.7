package com.tencent.tencentmap.mapsdk.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class ei
  extends BroadcastReceiver
{
  ei(ef paramef) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    fx.a("AccessSchedulerTrigger", "onAccessSchedulerTriggered by timer, curTime:" + System.currentTimeMillis());
    el.a().a(new ef.a(this.a, (byte)0));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */