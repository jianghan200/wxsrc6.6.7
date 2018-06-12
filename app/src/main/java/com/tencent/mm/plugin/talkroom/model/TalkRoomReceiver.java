package com.tencent.mm.plugin.talkroom.model;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.x;

public class TalkRoomReceiver
  extends BroadcastReceiver
{
  public static void bk(Context paramContext)
  {
    long l2 = ab.chU();
    x.d("MicroMsg.TalkRoomReceiver", "bumper comes, next=" + l2);
    if (l2 > 600000L) {
      return;
    }
    long l1 = l2;
    if (l2 < 30000L) {
      l1 = 30000L;
    }
    l2 = SystemClock.elapsedRealtime();
    x.w("MicroMsg.TalkRoomReceiver", "reset bumper, interval:%d, now:%d", new Object[] { Long.valueOf(l1), Long.valueOf(l2) });
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    if (localAlarmManager == null)
    {
      x.e("MicroMsg.TalkRoomReceiver", "keep bumper failed, null am");
      return;
    }
    localAlarmManager.set(2, l1 + l2, PendingIntent.getBroadcast(paramContext, 1, new Intent(paramContext, TalkRoomReceiver.class).putExtra("MMBoot_Bump", true), 268435456));
  }
  
  public static void bl(Context paramContext)
  {
    AlarmManager localAlarmManager = (AlarmManager)paramContext.getSystemService("alarm");
    if (localAlarmManager == null) {
      x.e("MicroMsg.TalkRoomReceiver", "stop bumper failed, null am");
    }
    do
    {
      return;
      paramContext = PendingIntent.getBroadcast(paramContext, 1, new Intent(paramContext, TalkRoomReceiver.class).putExtra("MMBoot_Bump", true), 536870912);
    } while (paramContext == null);
    localAlarmManager.cancel(paramContext);
    paramContext.cancel();
  }
  
  protected static void init()
  {
    ab.a(new TalkRoomReceiver.1());
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool = paramIntent.getBooleanExtra("MMBoot_Bump", false);
    x.i("MicroMsg.TalkRoomReceiver", "[ALARM NOTIFICATION] bump:" + bool);
    bk(paramContext);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/talkroom/model/TalkRoomReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */