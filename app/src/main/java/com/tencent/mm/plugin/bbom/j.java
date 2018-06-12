package com.tencent.mm.plugin.bbom;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.R.l;
import com.tencent.mm.booter.notification.NotificationItem;
import com.tencent.mm.booter.notification.a.g;
import com.tencent.mm.booter.notification.a.h;
import com.tencent.mm.booter.notification.c;
import com.tencent.mm.booter.notification.c.a;
import com.tencent.mm.booter.notification.f.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.LauncherUI;
import java.util.ArrayList;

public final class j
  implements com.tencent.mm.plugin.zero.a.b
{
  public final void a(long paramLong, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    String str1 = paramString2;
    int i;
    if (bi.oW(paramString2))
    {
      paramString2 = ad.getContext();
      if (!com.tencent.mm.k.f.fq(paramString1)) {
        break label141;
      }
      i = R.l.chatting_roominfo_noname;
    }
    c localc;
    Context localContext;
    boolean bool2;
    boolean bool1;
    for (;;)
    {
      str1 = paramString2.getString(i);
      paramString2 = f.a.ya().cYU;
      if (!com.tencent.mm.k.f.Al()) {
        com.tencent.mm.booter.notification.e.cancel();
      }
      try
      {
        localc = paramString2.cYM;
        localContext = ad.getContext();
        bool2 = com.tencent.mm.booter.notification.a.e.yj();
        bool1 = com.tencent.mm.booter.notification.a.e.yh();
        x.i("MicroMsg.Notification.AppMsg.Handle", "push:isShake: %B, isSound: %B", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
        if (paramLong != 0L)
        {
          if ((bi.oW(paramString1)) || (bi.oW(str1)) || (bi.oW(paramString3))) {
            x.i("MicroMsg.Notification.AppMsg.Handle", "[NO NOTIFICATION] Util.isNullOrNil(userName) || Util.isNullOrNil(nickName) || Util.isNullOrNil(content)");
          }
        }
        else
        {
          return;
          label141:
          i = R.l.intro_title;
          continue;
        }
        if ((com.tencent.mm.k.f.AL()) && (!com.tencent.mm.k.f.AM()))
        {
          x.i("MicroMsg.Notification.AppMsg.Handle", "[NO NOTIFICATION](MMCore.getAccStg().isWebWXOnline() && !ConfigStorageLogic.isWebWXNotificationOpen())preNotificationCheck");
          return;
        }
      }
      catch (Exception paramString1)
      {
        x.e("MicroMsg.Notification.Handle", "push:notify, error");
        x.printErrStackTrace("MicroMsg.Notification.Handle", paramString1, "", new Object[0]);
        return;
      }
    }
    if (!com.tencent.mm.k.f.Aj())
    {
      x.i("MicroMsg.Notification.AppMsg.Handle", "[NO NOTIFICATION]new MsgNotification setting no notification");
      return;
    }
    if (c.aJ(paramLong))
    {
      x.i("MicroMsg.Notification.AppMsg.Handle", "[NO NOTIFICATION]already notify");
      return;
    }
    com.tencent.mm.booter.notification.queue.b.yb().restore();
    int j = c.xW() + 1;
    paramString2 = c.a(c.xX(), paramString1);
    Object localObject;
    label321:
    int k;
    int m;
    int n;
    int i1;
    PendingIntent localPendingIntent;
    String str2;
    if (paramString2 == null)
    {
      i = 0;
      i += 1;
      localObject = c.xX();
      paramString2 = (String)localObject;
      if (localObject == null) {
        paramString2 = new ArrayList();
      }
      localObject = c.a(paramString2, paramString1);
      if (localObject != null) {
        break label775;
      }
      localObject = new c.a((byte)0);
      ((c.a)localObject).userName = paramString1;
      ((c.a)localObject).cYz = 1;
      paramString2.add(localObject);
      c.d(paramString2);
      c.fs(c.xW() + 1);
      k = paramString2.size();
      if (com.tencent.mm.booter.notification.a.e.yg())
      {
        bool1 = false;
        bool2 = false;
      }
      localObject = c.xV();
      m = com.tencent.mm.booter.notification.queue.b.yb().eM(paramString1);
      localc.bzK.cZz = j;
      localc.bzK.cZy = k;
      localc.bzK.cZF = bool2;
      localc.bzK.cZE = bool1;
      boolean bool3 = com.tencent.mm.k.f.Al();
      n = com.tencent.mm.bf.a.cbg();
      paramString2 = localc.bzK;
      paramString2.cZr.a(paramString2.mContext, bool1, bool2, (Notification)localObject, null);
      i1 = paramString2.cZr.cZe;
      x.i("MicroMsg.NotificationIntent", "[oneliang] notificationId:%s, userName:%s, msgType:%s, unReadMsgCount:%s, unReadTalkerCount:%s, isMuted:%s, isShowDetails:%s", new Object[] { Integer.valueOf(m), paramString1, Integer.valueOf(paramInt), Integer.valueOf(j), Integer.valueOf(k), Boolean.valueOf(false), Boolean.valueOf(bool3) });
      paramString2 = new Intent(localContext, LauncherUI.class);
      paramString2.putExtra("nofification_type", "new_msg_nofification");
      paramString2.putExtra("Main_User", paramString1);
      paramString2.putExtra("MainUI_User_Last_Msg_Type", paramInt);
      paramString2.addFlags(536870912);
      paramString2.addFlags(67108864);
      if (!bool3) {
        break label790;
      }
      paramString2.putExtra("talkerCount", 1);
      paramString2.putExtra("Intro_Is_Muti_Talker", false);
      paramString2.putExtra("pushcontent_unread_count", j);
      localPendingIntent = com.tencent.mm.booter.notification.a.d.a(localContext, m, paramString2);
      str1 = h.c(localContext, str1, bool3);
      str2 = h.a(localContext, paramString3, k, j, i, bool3);
      paramString3 = h.d(localContext, paramString3, bool3);
      if (!com.tencent.mm.k.f.Al()) {
        break label833;
      }
    }
    label775:
    label790:
    label833:
    for (paramString2 = com.tencent.mm.booter.notification.a.a.b(localContext, com.tencent.mm.booter.notification.a.a.D(paramString1, paramString4));; paramString2 = null)
    {
      paramString2 = new NotificationItem(m, paramString1, localc.a((Notification)localObject, n, i1, localPendingIntent, str1, str2, paramString3, paramString2, paramString1));
      paramString2.cYP = paramLong;
      paramString2.cYQ = i;
      localc.a(paramString2, localc.bzK);
      com.tencent.mm.booter.notification.d.ft(localc.bzK.cZz);
      com.tencent.mm.booter.notification.d.w(paramString1, i);
      return;
      i = paramString2.cYz;
      break;
      ((c.a)localObject).cYz += 1;
      break label321;
      if (k <= 1) {
        paramString2.putExtra("Intro_Is_Muti_Talker", false);
      }
      for (;;)
      {
        paramString2.putExtra("talkerCount", k);
        break;
        paramString2.putExtra("Intro_Is_Muti_Talker", true);
      }
    }
  }
  
  public final void atF()
  {
    f.a.ya();
    com.tencent.mm.booter.notification.f.n(-1, null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/bbom/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */