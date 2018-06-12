package com.tencent.mm.booter.notification;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.app.ag;
import android.support.v4.app.ag.b;
import android.support.v4.app.ag.f;
import android.support.v4.app.z;
import com.tencent.mm.R.g;
import com.tencent.mm.booter.notification.a.e;
import com.tencent.mm.booter.notification.a.g;
import com.tencent.mm.booter.notification.queue.NotificationQueue;
import com.tencent.mm.booter.notification.queue.a;
import com.tencent.mm.booter.notification.queue.b;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;

public class NotificationItem
  implements Parcelable
{
  public static final Parcelable.Creator<NotificationItem> CREATOR = new Parcelable.Creator() {};
  private final String TAG = "MicroMsg.NotificationItem";
  private Bitmap b;
  PendingIntent cYN;
  public String cYO;
  public long cYP = 0L;
  public int cYQ = 0;
  public boolean cYR = true;
  public int cYS = 0;
  public int cYT = 0;
  public int id = -1;
  Notification pQ;
  
  public NotificationItem(int paramInt, Notification paramNotification, boolean paramBoolean)
  {
    this(paramInt, null, paramNotification, paramBoolean);
  }
  
  public NotificationItem(int paramInt, String paramString, Notification paramNotification)
  {
    this(paramInt, paramString, paramNotification, true);
  }
  
  @TargetApi(11)
  private NotificationItem(int paramInt, String paramString, Notification paramNotification, boolean paramBoolean)
  {
    this.id = paramInt;
    this.cYO = paramString;
    if (Build.VERSION.SDK_INT >= 11) {
      this.b = paramNotification.largeIcon;
    }
    this.pQ = paramNotification;
    this.cYR = paramBoolean;
    this.cYS = 0;
  }
  
  public NotificationItem(Notification paramNotification, boolean paramBoolean)
  {
    this(-1, paramNotification, paramBoolean);
  }
  
  private NotificationItem(Parcel paramParcel)
  {
    if (paramParcel == null) {
      return;
    }
    this.id = paramParcel.readInt();
    this.cYO = paramParcel.readString();
    this.b = ((Bitmap)paramParcel.readParcelable(Bitmap.class.getClassLoader()));
    this.pQ = ((Notification)paramParcel.readParcelable(Notification.class.getClassLoader()));
    this.cYN = ((PendingIntent)paramParcel.readParcelable(PendingIntent.class.getClassLoader()));
    if (paramParcel.readByte() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.cYR = bool;
      this.cYP = paramParcel.readLong();
      this.cYQ = paramParcel.readInt();
      return;
    }
  }
  
  public final int a(g paramg)
  {
    Object localObject2 = null;
    Bundle localBundle = null;
    for (;;)
    {
      int i;
      Object localObject3;
      try
      {
        Context localContext;
        if (this.id == -1)
        {
          i = b.yb().aU(this.cYR);
          this.id = i;
          localContext = ad.getContext();
          if (localContext == null)
          {
            x.e("MicroMsg.NotificationItem", "error, show notification but MMApplicationContext.getContext() == null");
            i = -1;
            return i;
          }
        }
        else
        {
          i = this.id;
          continue;
        }
        if (this.pQ == null)
        {
          x.e("MicroMsg.NotificationItem", "error, show notification but mNotification == null");
          i = -1;
          continue;
        }
        localObject1 = b.yb();
        localObject3 = this.cYO;
        if (ai.oW((String)localObject3))
        {
          localObject1 = null;
          if (localObject1 != null)
          {
            localObject3 = b.yb();
            i = ((NotificationItem)localObject1).id;
            x.d("MicroMsg.Notification.Queue", "mark: %d", new Object[] { Integer.valueOf(i) });
            ((b)localObject3).mark = i;
          }
          if ((localObject1 != null) && (((NotificationItem)localObject1).pQ.tickerText != null) && (this.pQ.tickerText != null) && (((NotificationItem)localObject1).pQ.tickerText.equals(this.pQ.tickerText))) {
            this.pQ.tickerText += " ";
          }
          localObject3 = b.yb();
          if (this == null)
          {
            x.e("MicroMsg.Notification.Queue", "notification item null when put");
            localObject1 = localBundle;
            if (localObject1 != null) {
              b.yb().cancel(((NotificationItem)localObject1).id);
            }
            this.cYT = d.a(this.pQ, paramg);
            if (localContext != null)
            {
              if (this.pQ != null) {
                break label525;
              }
              x.e("MicroMsg.NotificationItem", "error, notify but mNotification == null");
            }
            i = this.id;
          }
        }
        else
        {
          Iterator localIterator = ((b)localObject1).iterator();
          if (!localIterator.hasNext()) {
            break label831;
          }
          localObject1 = (NotificationItem)localIterator.next();
          if ((localObject1 == null) || (((NotificationItem)localObject1).cYO == null) || (!((NotificationItem)localObject1).cYO.equals(localObject3))) {
            continue;
          }
          continue;
        }
        if (this.id == -1)
        {
          x.e("MicroMsg.Notification.Queue", "notification id = -1(NotificationItem.INVALID_ID) when put");
          localObject1 = localBundle;
          continue;
        }
        if (((b)localObject3).mark <= 0) {
          break label441;
        }
      }
      finally {}
      if (((b)localObject3).mark == this.id)
      {
        x.d("MicroMsg.Notification.Queue", "remove mark: %d", new Object[] { Integer.valueOf(((b)localObject3).mark) });
        ((b)localObject3).remove(((b)localObject3).mark);
      }
      ((b)localObject3).mark = -1;
      label441:
      ((b)localObject3).remove(this.id);
      Object localObject1 = localObject2;
      if (((b)localObject3).size() >= 5) {
        localObject1 = ((b)localObject3).yc();
      }
      ((b)localObject3).cZa.d(this);
      ((b)localObject3).cZb.b(this);
      x.i("MicroMsg.Notification.Queue", "put item: %d, queuesize: %d", new Object[] { Integer.valueOf(this.id), Integer.valueOf(((b)localObject3).size()) });
      continue;
      label525:
      paramg = ad.getContext();
      if (paramg == null)
      {
        x.e("MicroMsg.NotificationItem", "error, safeCheck but MMApplicationContext.getContext() == null");
        label541:
        x.i("MicroMsg.NotificationItem", "notificaiton.defaults: %d, notification.sound: %s, notification.vibrate: %s", new Object[] { Integer.valueOf(this.pQ.defaults), this.pQ.sound, g.c(this.pQ.vibrate) });
      }
      for (;;)
      {
        try
        {
          if ((e.yk() == 1) && (this.pQ.defaults != 2) && (this.pQ.vibrate == null))
          {
            this.pQ.defaults = 0;
            this.pQ.sound = null;
            x.i("MicroMsg.NotificationItem", "mode == vibrate & wechat shake is close, so notification switch to silent");
          }
          paramg = ag.L(ad.getContext());
          j = this.id;
          localObject1 = this.pQ;
          localBundle = z.a((Notification)localObject1);
          if ((localBundle == null) || (!localBundle.getBoolean("android.support.useSideChannel"))) {
            continue;
          }
          i = 1;
          if (i == 0) {
            continue;
          }
          paramg.a(new ag.f(paramg.mContext.getPackageName(), j, (Notification)localObject1));
          ag.qu.a(paramg.qr, j);
        }
        catch (Exception paramg)
        {
          int j;
          x.printErrStackTrace("MicroMsg.NotificationItem", paramg, "Notification Exception?", new Object[0]);
          continue;
        }
        if (this.cYP == 0L) {
          break;
        }
        c.aI(this.cYP);
        break;
        if (this.pQ == null)
        {
          x.e("MicroMsg.NotificationItem", "error, safeCheck but mNotification == null");
          break label541;
        }
        i = this.pQ.icon;
        if (paramg.getResources().getDrawable(i) != null) {
          break label541;
        }
        this.pQ.icon = R.g.icon;
        break label541;
        i = 0;
        continue;
        ag.qu.a(paramg.qr, j, (Notification)localObject1);
      }
      label831:
      localObject1 = null;
    }
  }
  
  public final void clear()
  {
    try
    {
      if ((this.b != null) && (!this.b.isRecycled()))
      {
        x.i("MicroMsg.NotificationItem", "recycle bitmap:%s", new Object[] { this.b.toString() });
        this.b.recycle();
      }
      this.pQ = null;
      this.b = null;
      this.cYN = null;
      return;
    }
    finally {}
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String toString()
  {
    return "id: " + this.id + ",msgId: " + this.cYP + ",userName: " + this.cYO + ",unreadCount: " + this.cYQ;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(this.id);
    String str;
    if (this.cYO == null)
    {
      str = "";
      paramParcel.writeString(str);
      paramParcel.writeParcelable(this.b, 0);
      paramParcel.writeParcelable(this.pQ, 0);
      paramParcel.writeParcelable(this.cYN, 0);
      if (!this.cYR) {
        break label91;
      }
    }
    label91:
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeLong(this.cYP);
      paramParcel.writeInt(this.cYQ);
      return;
      str = this.cYO;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/booter/notification/NotificationItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */