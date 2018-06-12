package com.tencent.mm.booter.notification;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.booter.notification.queue.b;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;

public class NotificationDeleteReceive
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    int i;
    try
    {
      i = paramIntent.getIntExtra("com.tencent.notification.id.key", -1);
      x.d("MicroMsg.Notification.Delete.Receive", "receive: %d", new Object[] { Integer.valueOf(i) });
      if (i == -1) {
        return;
      }
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.Notification.Delete.Receive", paramContext, "", new Object[0]);
        i = -1;
      }
      paramIntent = b.yb().iterator();
    }
    do
    {
      if (!paramIntent.hasNext()) {
        break;
      }
      paramContext = (NotificationItem)paramIntent.next();
    } while ((paramContext == null) || (paramContext.id != i));
    for (;;)
    {
      if (paramContext == null)
      {
        x.w("MicroMsg.Notification.Delete.Receive", "receive delete notification: %d, but no item in queue", new Object[] { Integer.valueOf(i) });
        return;
      }
      if (paramContext.cYN != null) {}
      try
      {
        paramContext.cYN.send();
        b.yb().remove(i);
        return;
      }
      catch (PendingIntent.CanceledException paramContext)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.NotificationItem", paramContext, "Delete intent send Exception?", new Object[0]);
        }
      }
      paramContext = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/booter/notification/NotificationDeleteReceive.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */