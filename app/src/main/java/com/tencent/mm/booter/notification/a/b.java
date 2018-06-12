package com.tencent.mm.booter.notification.a;

import android.app.Notification;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import com.tencent.mm.compatible.e.k;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.e.f;
import java.io.File;

public final class b
{
  public int cZe = 0;
  
  private static boolean bq(Context paramContext)
  {
    paramContext = (AudioManager)paramContext.getSystemService("audio");
    if (paramContext == null) {
      return false;
    }
    return paramContext.isWiredHeadsetOn();
  }
  
  private static boolean fw(int paramInt)
  {
    return (paramInt & 0x1) > 0;
  }
  
  public final int a(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, Notification paramNotification, String paramString)
  {
    int i;
    if (com.tencent.mm.k.f.Ai())
    {
      i = 0;
      paramString = paramNotification;
      if (paramNotification == null) {
        paramString = new Notification();
      }
      x.i("MicroMsg.NotificationDefaults", "begin initDefaults, isNeedSound: %B, isNeedShake: %B, n.defaults: %d, n.vibrate: %s, n.sound: %s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Integer.valueOf(paramString.defaults), g.c(paramString.vibrate), paramString.sound });
      if (paramBoolean2) {
        paramString.vibrate = bi.eyq;
      }
      if (paramBoolean1)
      {
        paramNotification = com.tencent.mm.k.f.An();
        if (!bq(paramContext)) {
          break label192;
        }
        i = 0;
        paramString.sound = null;
        f.a.yl().eQ(paramNotification);
        x.i("MicroMsg.NotificationDefaults", "initDefaults, wireOn & playSound by ourselves: %s(if null play follow system notification sound)", new Object[] { paramNotification });
      }
      for (;;)
      {
        x.i("MicroMsg.NotificationDefaults", "end initDefaults, defaults: %d, n.vibrate: %s, n.sound: %s", new Object[] { Integer.valueOf(i), g.c(paramString.vibrate), paramString.sound });
        this.cZe = i;
        return this.cZe;
        label192:
        if ((paramNotification != null) && (paramNotification != e.f.dgL))
        {
          i = 0;
          paramString.sound = Uri.parse(paramNotification);
        }
        else
        {
          i = 1;
        }
      }
    }
    x.i("MicroMsg.NotificationDefaults", "begin initDefaults, isNeedSound: %B, isNeedShake: %B, n.defaults: %d, n.vibrate: %s, n.sound: %s", new Object[] { Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), Integer.valueOf(paramNotification.defaults), paramNotification.vibrate, paramNotification.sound });
    int j = 0;
    boolean bool4 = false;
    boolean bool3 = false;
    boolean bool1;
    if (paramBoolean1) {
      if (bq(paramContext)) {
        bool1 = true;
      }
    }
    for (;;)
    {
      i = j;
      if (paramBoolean2) {
        i = j | 0x2;
      }
      String str = com.tencent.mm.k.f.An();
      if (bi.oW(paramString)) {
        x.d("MicroMsg.NotificationDefaults", "msgContent is null");
      }
      paramString = str;
      if (str != null)
      {
        paramString = str;
        if (new File(str).exists()) {
          paramString = e.f.dgL;
        }
      }
      boolean bool2;
      if (q.deW.ddP != 2)
      {
        bool2 = true;
        label382:
        if (!bool2) {
          break label635;
        }
        if ((i & 0x2) <= 0) {
          break label579;
        }
        j = 1;
        label397:
        if (j == 0) {
          break label629;
        }
        i &= 0xFFFFFFFD;
        bi.t(paramContext, true);
        paramBoolean1 = true;
        label416:
        if ((!fw(i)) || (bool1)) {
          break label621;
        }
        i &= 0xFFFFFFFE;
        f.a.yl().eQ(paramString);
        bool3 = true;
        paramBoolean2 = paramBoolean1;
        paramBoolean1 = bool3;
      }
      for (;;)
      {
        if (bool1)
        {
          i &= 0xFFFFFFFE;
          f.a.yl().eQ(paramString);
          paramBoolean1 = true;
        }
        for (;;)
        {
          this.cZe = i;
          x.i("MicroMsg.NotificationDefaults", "end initDefaults, n.defaults: %d, n.vibrate: %s, n.sound: %s, soundUri: %s, headset&Play: %B, DeviceInfo.mCommonInfo.mmnotify is Enable: %B, isMMShake: %B, isMMPlaySound: %B", new Object[] { Integer.valueOf(paramNotification.defaults), g.c(paramNotification.vibrate), paramNotification.sound, paramString, Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(paramBoolean2), Boolean.valueOf(paramBoolean1) });
          return this.cZe;
          j = 1;
          bool1 = false;
          break;
          bool2 = false;
          break label382;
          label579:
          j = 0;
          break label397;
          if ((fw(i)) && (paramString != null))
          {
            i &= 0xFFFFFFFE;
            paramNotification.sound = Uri.parse(paramString);
          }
        }
        label621:
        paramBoolean2 = paramBoolean1;
        paramBoolean1 = bool3;
        continue;
        label629:
        paramBoolean1 = bool4;
        break label416;
        label635:
        paramBoolean2 = false;
        paramBoolean1 = bool3;
      }
      bool1 = false;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/booter/notification/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */