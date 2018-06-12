package com.tencent.mm.booter;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.x;

public class TrafficStatsReceiver
  extends BroadcastReceiver
{
  private long mLastTime = -1L;
  
  public static void bo(Context paramContext)
  {
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    paramContext = PendingIntent.getBroadcast(paramContext, 1, new Intent("com.tencent.mm.TrafficStatsReceiver"), 268435456);
    localAlarmManager.setRepeating(3, SystemClock.elapsedRealtime(), 300000L, paramContext);
    x.i("MicroMsg.TrafficStats", "Register alarm, interval: %d ms", new Object[] { Long.valueOf(300000L) });
  }
  
  public static void bp(Context paramContext)
  {
    ((AlarmManager)paramContext.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(paramContext, 1, new Intent("com.tencent.mm.TrafficStatsReceiver"), 268435456));
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    x.d("MicroMsg.TrafficStats", "onRecieve");
    long l1 = SystemClock.elapsedRealtime();
    bh.update();
    if (this.mLastTime >= 0L)
    {
      long l2 = l1 - this.mLastTime;
      long l3 = bh.ciQ() + bh.ciP();
      long l4 = bh.ciO() + bh.ciN();
      long l5 = bh.ciU() + bh.ciT();
      long l6 = bh.ciU() + bh.ciT();
      x.i("MicroMsg.TrafficStats", "Time: %d ms, System - [Mobile: %d, Wifi: %d, Speed: %.2f], WeChat - [Mobile: %d, Wifi: %d, Speed: %.2f]", new Object[] { Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l4), Double.valueOf((l3 + l4) / (l2 / 1000L)), Long.valueOf(l5), Long.valueOf(l6), Double.valueOf((l5 + l6) / (l2 / 1000L)) });
    }
    this.mLastTime = l1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/booter/TrafficStatsReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */