package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.List;

final class af
{
  public static final class a
    implements x, y
  {
    private Bundle mExtras;
    private Notification.Builder qg;
    private List<Bundle> ql = new ArrayList();
    
    public a(Context paramContext, Notification paramNotification, CharSequence paramCharSequence1, CharSequence paramCharSequence2, CharSequence paramCharSequence3, RemoteViews paramRemoteViews, int paramInt1, PendingIntent paramPendingIntent1, PendingIntent paramPendingIntent2, Bitmap paramBitmap, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt4, CharSequence paramCharSequence4, boolean paramBoolean4, ArrayList<String> paramArrayList, Bundle paramBundle, String paramString1, boolean paramBoolean5, String paramString2)
    {
      paramContext = new Notification.Builder(paramContext).setWhen(paramNotification.when).setShowWhen(paramBoolean2).setSmallIcon(paramNotification.icon, paramNotification.iconLevel).setContent(paramNotification.contentView).setTicker(paramNotification.tickerText, paramRemoteViews).setSound(paramNotification.sound, paramNotification.audioStreamType).setVibrate(paramNotification.vibrate).setLights(paramNotification.ledARGB, paramNotification.ledOnMS, paramNotification.ledOffMS);
      if ((paramNotification.flags & 0x2) != 0)
      {
        paramBoolean2 = true;
        paramContext = paramContext.setOngoing(paramBoolean2);
        if ((paramNotification.flags & 0x8) == 0) {
          break label380;
        }
        paramBoolean2 = true;
        label128:
        paramContext = paramContext.setOnlyAlertOnce(paramBoolean2);
        if ((paramNotification.flags & 0x10) == 0) {
          break label386;
        }
        paramBoolean2 = true;
        label148:
        paramContext = paramContext.setAutoCancel(paramBoolean2).setDefaults(paramNotification.defaults).setContentTitle(paramCharSequence1).setContentText(paramCharSequence2).setSubText(paramCharSequence4).setContentInfo(paramCharSequence3).setContentIntent(paramPendingIntent1).setDeleteIntent(paramNotification.deleteIntent);
        if ((paramNotification.flags & 0x80) == 0) {
          break label392;
        }
        paramBoolean2 = true;
        label207:
        this.qg = paramContext.setFullScreenIntent(paramPendingIntent2, paramBoolean2).setLargeIcon(paramBitmap).setNumber(paramInt1).setUsesChronometer(paramBoolean3).setPriority(paramInt4).setProgress(paramInt2, paramInt3, paramBoolean1);
        this.mExtras = new Bundle();
        if (paramBundle != null) {
          this.mExtras.putAll(paramBundle);
        }
        if ((paramArrayList != null) && (!paramArrayList.isEmpty())) {
          this.mExtras.putStringArray("android.people", (String[])paramArrayList.toArray(new String[paramArrayList.size()]));
        }
        if (paramBoolean4) {
          this.mExtras.putBoolean("android.support.localOnly", true);
        }
        if (paramString1 != null)
        {
          this.mExtras.putString("android.support.groupKey", paramString1);
          if (!paramBoolean5) {
            break label398;
          }
          this.mExtras.putBoolean("android.support.isGroupSummary", true);
        }
      }
      for (;;)
      {
        if (paramString2 != null) {
          this.mExtras.putString("android.support.sortKey", paramString2);
        }
        return;
        paramBoolean2 = false;
        break;
        label380:
        paramBoolean2 = false;
        break label128;
        label386:
        paramBoolean2 = false;
        break label148;
        label392:
        paramBoolean2 = false;
        break label207;
        label398:
        this.mExtras.putBoolean("android.support.useSideChannel", true);
      }
    }
    
    public final void a(ac.a parama)
    {
      this.ql.add(ae.b(this.qg, parama));
    }
    
    public final Notification build()
    {
      SparseArray localSparseArray = ae.h(this.ql);
      if (localSparseArray != null) {
        this.mExtras.putSparseParcelableArray("android.support.actionExtras", localSparseArray);
      }
      this.qg.setExtras(this.mExtras);
      return this.qg.build();
    }
    
    public final Notification.Builder bx()
    {
      return this.qg;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/android/support/v4/app/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */