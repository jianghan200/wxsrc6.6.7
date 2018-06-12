package com.tencent.mm.plugin.talkroom.model;

import android.app.Notification;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.ax.d;
import com.tencent.mm.model.al;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.talkroom.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;

public final class c
  implements d
{
  public String kFP = "";
  public boolean kGt = false;
  ag mHandler = new ag(Looper.getMainLooper());
  public boolean owe = false;
  private Notification owf;
  private String owg;
  
  private static boolean bGX()
  {
    if (bi.oW(b.bGT().owU))
    {
      x.w("MicroMsg.TalkRoomDisplayMgr", "yy checkServer null");
      x.v("MicroMsg.TalkRoomDisplayMgr", "yy dismissStatusBar");
      bGZ();
      return false;
    }
    return true;
  }
  
  private void bGY()
  {
    if (!bGX()) {
      return;
    }
    if (this.owf == null)
    {
      x.e("MicroMsg.TalkRoomDisplayMgr", "yy updateNotify error no notification");
      return;
    }
    String str2 = h.aJ(ad.getContext(), b.bGT().owU);
    if (b.bGT().oxi) {}
    for (String str1 = ad.getContext().getString(R.l.talk_room_pausing);; str1 = ad.getContext().getString(R.l.talk_room_member_count, new Object[] { Integer.valueOf(b.bGT().aZp().size()) }))
    {
      Object localObject = a.ezo.vp();
      ((Intent)localObject).putExtra("enter_chat_usrname", b.bGT().owU);
      localObject = PendingIntent.getActivity(ad.getContext(), 100, (Intent)localObject, 268435456);
      this.owf = new Notification.Builder(ad.getContext()).setTicker(this.owg).setWhen(0L).setContentTitle(str2).setContentText(str1).setContentIntent((PendingIntent)localObject).getNotification();
      this.owf.icon = R.g.talk_room_notify_ic;
      this.owf.flags = 32;
      au.getNotification().a(100, this.owf, false);
      return;
    }
  }
  
  public static void bGZ()
  {
    x.v("MicroMsg.TalkRoomDisplayMgr", "yy cancelNotify");
    au.getNotification().cancel(100);
  }
  
  public final void Op(String paramString)
  {
    if (!bGX()) {
      return;
    }
    x.v("MicroMsg.TalkRoomDisplayMgr", "yy showNotify: " + paramString);
    this.owg = paramString;
    this.owf = new Notification.Builder(ad.getContext()).setTicker(paramString).setWhen(0L).getNotification();
    this.owf.icon = R.g.talk_room_notify_ic;
    this.owf.flags = 32;
    bGY();
  }
  
  public final void St()
  {
    this.kGt = false;
  }
  
  public final void Su() {}
  
  public final void Sv()
  {
    x.v("MicroMsg.TalkRoomDisplayMgr", "yy dismissStatusBar");
    bGZ();
  }
  
  public final void Sw() {}
  
  public final void Sx() {}
  
  public final void Sy() {}
  
  public final void ay(String paramString1, String paramString2)
  {
    if (this.owe) {
      return;
    }
    bGY();
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString) {}
  
  public final void i(String paramString, int paramInt1, int paramInt2)
  {
    this.kGt = false;
  }
  
  public final void iA(int paramInt) {}
  
  public final void nr(String paramString)
  {
    this.kFP = paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/talkroom/model/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */