package com.tencent.mm.booter.notification;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.ag;
import com.tencent.mm.booter.notification.queue.b;
import com.tencent.mm.sdk.platformtools.ad;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public final class e
  extends a
{
  public c cYM = new c();
  private Context mContext = ad.getContext();
  private NotificationManager qr = (NotificationManager)this.mContext.getSystemService("notification");
  
  public static void cancel()
  {
    ag localag = ag.L(ad.getContext());
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = b.yb().yd().iterator();
    while (localIterator.hasNext())
    {
      Integer localInteger = (Integer)localIterator.next();
      if (!localLinkedList.contains(localInteger))
      {
        b.yb().a(localag, localInteger.intValue());
        localLinkedList.add(localInteger);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/booter/notification/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */