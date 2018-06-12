package com.tencent.mm.booter.notification;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.z;
import com.tencent.mm.g.c.am;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.al;
import com.tencent.mm.model.ao;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bd.b;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.z.1;
import com.tencent.mm.platformtools.z.2;
import com.tencent.mm.plugin.account.ui.MobileVerifyUI;
import com.tencent.mm.plugin.bbom.r;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.LauncherUI;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b
  implements al, ao
{
  com.tencent.mm.storage.bd bXQ;
  private String cYi;
  private String cYj;
  String cYk;
  Intent cYl;
  private boolean cYm;
  private int cYn;
  private boolean cYo;
  private long cYp;
  f cYq = f.a.ya();
  private com.tencent.mm.booter.notification.a.e cYr;
  @SuppressLint({"HandlerLeak"})
  com.tencent.mm.sdk.platformtools.ag cYs = new b.1(this, Looper.getMainLooper());
  private final com.tencent.mm.sdk.b.c cYt = new b.2(this);
  private final com.tencent.mm.sdk.b.c cYu = new b.3(this);
  Context context = null;
  String talker;
  
  public b(Context paramContext)
  {
    this.context = paramContext;
    this.talker = "";
    this.cYk = "";
    this.cYi = "";
    this.cYp = 0L;
    this.cYo = false;
    this.cYl = null;
    this.cYr = new com.tencent.mm.booter.notification.a.e();
    r.a(this);
    com.tencent.mm.modelvoice.e.a(this);
    com.tencent.mm.plugin.base.stub.b.a(this);
    com.tencent.mm.sdk.b.a.sFg.b(this.cYu);
    com.tencent.mm.sdk.b.a.sFg.b(this.cYt);
  }
  
  public static int b(com.tencent.mm.storage.bd parambd)
  {
    int j = 0;
    int i;
    if (s.hf(parambd.field_talker))
    {
      i = 0;
      if ((parambd.field_bizChatId == -1L) || (!com.tencent.mm.ac.f.eZ(parambd.field_talker))) {
        break label71;
      }
      com.tencent.mm.ac.a.c localc = z.Na().ak(parambd.field_bizChatId);
      if ((localc.isGroup()) || (!localc.hu(1))) {
        break label71;
      }
    }
    label71:
    do
    {
      do
      {
        return i;
        i = 3;
        break;
        parambd = parambd.cqb;
      } while (bi.oW(parambd));
      parambd = bl.z(parambd, "msgsource");
    } while ((parambd == null) || (parambd.isEmpty()));
    for (;;)
    {
      int k;
      try
      {
        k = bi.getInt((String)parambd.get(".msgsource.tips"), i);
        if (((k & 0x1) == 0) && ((k & 0x2) != 0))
        {
          i = j;
          return i;
        }
      }
      catch (Exception parambd)
      {
        return i;
      }
      i = k;
    }
  }
  
  static Message b(String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3)
  {
    Message localMessage = Message.obtain();
    Bundle localBundle = new Bundle();
    localBundle.putString("notification.show.talker", paramString1);
    localBundle.putString("notification.show.message.content", paramString2);
    localBundle.putInt("notification.show.message.type", paramInt1);
    localBundle.putInt("notification.show.tipsflag", paramInt2);
    localMessage.setData(localBundle);
    localMessage.what = paramInt3;
    return localMessage;
  }
  
  private void cancel()
  {
    this.cYo = false;
    e.cancel();
  }
  
  public final void B(List<com.tencent.mm.storage.bd> paramList)
  {
    String str = null;
    if ((paramList == null) || (paramList.size() <= 0))
    {
      if (paramList == null) {}
      for (i = -1;; i = paramList.size())
      {
        x.w("MicroMsg.MMNotification", "notifyOther newMsgList:%d :%s", new Object[] { Integer.valueOf(i), bi.cjd() });
        return;
      }
    }
    int j = paramList.size() - 1;
    int i = 0;
    com.tencent.mm.storage.bd localbd;
    for (;;)
    {
      if (j < 0) {
        break label234;
      }
      localbd = (com.tencent.mm.storage.bd)paramList.get(j);
      i = b(localbd);
      if (f.a(localbd.field_talker, localbd, i, false)) {
        break;
      }
      j -= 1;
    }
    label234:
    for (paramList = localbd;; paramList = str)
    {
      if (paramList == null)
      {
        x.w("MicroMsg.MMNotification", "notifyOther msg == null");
        return;
      }
      this.cYk = "";
      this.talker = paramList.field_talker;
      str = paramList.field_content;
      j = paramList.getType();
      this.bXQ = paramList;
      x.i("MicroMsg.MMNotification", "notifyOther talker:%s msgid:%d type:%d tipsFlag:%d content:%s", new Object[] { this.talker, Long.valueOf(paramList.field_msgSvrId), Integer.valueOf(j), Integer.valueOf(i), bi.Xf(str) });
      this.cYs.sendMessageDelayed(b(this.talker, str, j, i, 0), 200L);
      return;
    }
  }
  
  public final int a(Notification paramNotification, boolean paramBoolean)
  {
    return f.a.ya().a(new NotificationItem(paramNotification, paramBoolean));
  }
  
  public final Notification a(Notification paramNotification, int paramInt1, int paramInt2, PendingIntent paramPendingIntent, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, String paramString4)
  {
    return f.a.ya().cYU.cYM.a(paramNotification, paramInt1, paramInt2, paramPendingIntent, paramString1, paramString2, paramString3, paramBitmap, paramString4);
  }
  
  public final Notification a(Notification paramNotification, int paramInt1, PendingIntent paramPendingIntent1, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, int paramInt2, String paramString4, PendingIntent paramPendingIntent2, int paramInt3, String paramString5, PendingIntent paramPendingIntent3, String paramString6)
  {
    return f.a.ya().cYU.cYM.a(paramNotification, paramInt1, 1, paramPendingIntent1, paramString1, paramString2, paramString3, paramBitmap, paramInt2, paramString4, paramPendingIntent2, paramInt3, paramString5, paramPendingIntent3, paramString6);
  }
  
  public final Notification a(PendingIntent paramPendingIntent, String paramString1, String paramString2, String paramString3, Bitmap paramBitmap, String paramString4)
  {
    return a(null, -1, 0, paramPendingIntent, paramString1, paramString2, paramString3, paramBitmap, paramString4);
  }
  
  public final void a(int paramInt, Notification paramNotification, boolean paramBoolean)
  {
    f.a.ya().a(new NotificationItem(paramInt, paramNotification, paramBoolean));
  }
  
  public final void a(int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, Bundle paramBundle)
  {
    com.tencent.mm.bg.d.a("webview", new z.1(paramString3, paramString4, paramBundle, paramString1, paramString2, paramInt), new z.2());
  }
  
  public final void a(com.tencent.mm.storage.bd parambd)
  {
    if (parambd == null) {}
    do
    {
      return;
      if (parambd.field_isSend == 1)
      {
        x.w("MicroMsg.MMNotification", "notifyFirst is sender , msgid:%d ", new Object[] { Long.valueOf(parambd.field_msgSvrId) });
        return;
      }
      localObject = com.tencent.mm.model.bd.iF(parambd.cqb);
    } while ((localObject != null) && (((bd.b)localObject).scene == 1));
    int i = b(parambd);
    this.bXQ = parambd;
    this.talker = parambd.field_talker;
    Object localObject = parambd.field_content;
    int j = parambd.getType();
    this.cYk = "";
    this.cYl = null;
    x.i("MicroMsg.MMNotification", "notifyFirst talker:%s msgid:%d type:%d tipsFlag:%d content:%s", new Object[] { this.talker, Long.valueOf(parambd.field_msgSvrId), Integer.valueOf(j), Integer.valueOf(i), bi.Xf((String)localObject) });
    if (!f.a(this.talker, this.bXQ, i, false))
    {
      x.w("MicroMsg.MMNotification", "[no notificaion], preNotificationCheck");
      return;
    }
    this.cYs.sendMessageDelayed(b(this.talker, (String)localObject, j, i, 0), 200L);
  }
  
  public final void aR(boolean paramBoolean)
  {
    x.i("MicroMsg.MMNotification", "set isMainUI: %s, stack[%s]", new Object[] { Boolean.valueOf(paramBoolean), bi.cjd() });
    this.cYm = paramBoolean;
  }
  
  public final void aS(boolean paramBoolean)
  {
    d.aT(paramBoolean);
  }
  
  public final int b(Notification paramNotification)
  {
    return a(paramNotification, true);
  }
  
  public final void cancel(int paramInt)
  {
    f.a.ya();
    com.tencent.mm.booter.notification.queue.b.yb().cancel(paramInt);
  }
  
  public final void cancelNotification(String paramString)
  {
    int i = 1;
    x.v("MicroMsg.MMNotification", "cancel notification talker:" + paramString + " last talker:" + this.cYj + "  curChattingTalker:" + this.cYi + " talker count:" + this.cYn);
    if (!this.cYo) {}
    do
    {
      return;
      if ((this.cYj != null) && (this.cYj.equals(this.cYi)) && (this.cYn == 1)) {}
      while (i != 0)
      {
        cancel();
        return;
        i = 0;
      }
      au.HU();
      paramString = com.tencent.mm.model.c.FW().Yq(paramString);
      if ((paramString != null) && (paramString.field_unReadCount != 0))
      {
        cancel();
        return;
      }
    } while (t.hX(s.dAN) != 0);
    cancel();
  }
  
  public final void eJ(String paramString)
  {
    this.cYi = paramString;
  }
  
  public final void eK(String paramString)
  {
    Intent localIntent = new Intent(this.context, LauncherUI.class);
    localIntent.putExtra("Intro_Notify", true);
    localIntent.putExtra("Intro_Notify_User", this.talker);
    localIntent.addFlags(536870912);
    localIntent.addFlags(67108864);
    String str = paramString;
    if (!bi.oW(paramString))
    {
      str = paramString;
      if (paramString.startsWith("autoauth_errmsg_")) {
        str = paramString.substring(16);
      }
    }
    paramString = str;
    if (!bi.oW(str))
    {
      paramString = str;
      if (str.startsWith("<"))
      {
        Map localMap = bl.z(str, "e");
        paramString = str;
        if (localMap != null)
        {
          paramString = str;
          if (!bi.oW((String)localMap.get(".e.Content"))) {
            paramString = (String)localMap.get(".e.Content");
          }
        }
      }
    }
    paramString = new Notification.Builder(this.context).setContentTitle(paramString).setContentText(null).setContentIntent(PendingIntent.getActivity(this.context, 0, localIntent, 268435456)).getNotification();
    paramString.icon = com.tencent.mm.bf.a.cbg();
    paramString.flags = 16;
    a(paramString, true);
  }
  
  public final void fp(int paramInt)
  {
    Object localObject = new Intent(this.context, LauncherUI.class);
    ((Intent)localObject).addFlags(536870912);
    ((Intent)localObject).addFlags(67108864);
    ((Intent)localObject).putExtra("nofification_type", "update_nofification");
    ((Intent)localObject).putExtra("show_update_dialog", true);
    ((Intent)localObject).putExtra("update_type", paramInt);
    localObject = PendingIntent.getActivity(this.context, 0, (Intent)localObject, 0);
    localObject = new Notification.Builder(this.context).setTicker(null).setWhen(System.currentTimeMillis()).setContentTitle(this.context.getString(R.l.app_update_package_notify)).setContentText(this.context.getString(R.l.app_recommend_update)).setContentIntent((PendingIntent)localObject).getNotification();
    ((Notification)localObject).flags |= 0x10;
    a(34, (Notification)localObject, false);
  }
  
  public final void fq(int paramInt)
  {
    d.ft(paramInt);
  }
  
  public final void fr(int paramInt)
  {
    f.a.ya();
    Object localObject;
    if (paramInt != 0)
    {
      localObject = com.tencent.mm.booter.notification.queue.b.yb().cZb.fu(paramInt);
      if (!((List)localObject).isEmpty()) {
        break label29;
      }
    }
    for (;;)
    {
      return;
      label29:
      android.support.v4.app.ag localag = android.support.v4.app.ag.L(ad.getContext());
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        Integer localInteger = (Integer)((Iterator)localObject).next();
        com.tencent.mm.booter.notification.queue.b.yb().a(localag, localInteger.intValue());
      }
    }
  }
  
  public final Looper getLooper()
  {
    return Looper.getMainLooper();
  }
  
  public final void n(int paramInt, String paramString)
  {
    f.a.ya();
    f.n(paramInt, paramString);
  }
  
  public final void notify(int paramInt, Notification paramNotification)
  {
    a(paramInt, paramNotification, true);
  }
  
  public final void v(String paramString, int paramInt)
  {
    d.w(paramString, paramInt);
  }
  
  public final void vo()
  {
    x.d("MicroMsg.MMNotification", "force cancelNotification");
    cancel();
  }
  
  public final String xQ()
  {
    return this.cYi;
  }
  
  public final void xR()
  {
    try
    {
      Object localObject = ad.getContext().getSharedPreferences("notify_newfriend_prep", 0).getString("notify_newfriend_prep", null);
      if (localObject != null)
      {
        localObject = ((String)localObject).split(",");
        int j = localObject.length;
        int i = 0;
        while (i < j)
        {
          int k = bi.WU(localObject[i]);
          if (k > 0) {
            au.getNotification().cancel(k);
          }
          i += 1;
        }
      }
      return;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.MMNotification", localException, "try cancel notification fail: %s", new Object[] { localException.getMessage() });
    }
  }
  
  @TargetApi(16)
  public final boolean xS()
  {
    boolean bool = true;
    Object localObject = ((ActivityManager.RunningTaskInfo)((ActivityManager)this.context.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity;
    x.d("MicroMsg.MMNotification", "[oneliang][showMobileRegNoVerifyCodeNotification]:%s", new Object[] { ((ComponentName)localObject).getClassName() });
    if (!MobileVerifyUI.class.getName().equals(((ComponentName)localObject).getClassName())) {
      if (bool)
      {
        localObject = new Intent(this.context, MobileVerifyUI.class);
        ((Intent)localObject).addFlags(2);
        ((Intent)localObject).addFlags(536870912);
        ((Intent)localObject).addFlags(67108864);
        ((Intent)localObject).putExtra("nofification_type", "no_reg_notification");
        localObject = PendingIntent.getActivity(this.context, 36, (Intent)localObject, 1073741824);
        if (Build.VERSION.SDK_INT < 16) {
          break label251;
        }
        Notification.Builder localBuilder = new Notification.Builder(this.context);
        localBuilder.setContentTitle(this.context.getString(R.l.app_pushcontent_title));
        localBuilder.setSmallIcon(com.tencent.mm.bf.a.cbg());
        localBuilder.setWhen(System.currentTimeMillis());
        localBuilder.setContentIntent((PendingIntent)localObject);
        localObject = new Notification.BigTextStyle(localBuilder).bigText(this.context.getString(R.l.message_mobile_reg_no_verify_code)).build();
        ((Notification)localObject).defaults |= 0x1;
      }
    }
    for (((Notification)localObject).flags |= 0x10;; ((Notification)localObject).flags |= 0x10)
    {
      a(36, (Notification)localObject, false);
      return bool;
      bool = false;
      break;
      label251:
      localObject = new Notification.Builder(this.context).setTicker(null).setWhen(System.currentTimeMillis()).setContentTitle(this.context.getString(R.l.app_pushcontent_title)).setContentText(this.context.getString(R.l.message_mobile_reg_no_verify_code)).setContentIntent((PendingIntent)localObject).getNotification();
      ((Notification)localObject).icon = com.tencent.mm.bf.a.cbg();
      ((Notification)localObject).defaults |= 0x1;
    }
  }
  
  public final void xT()
  {
    cancel(36);
  }
  
  public final void xU()
  {
    f.a.ya();
    c.xU();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/booter/notification/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */