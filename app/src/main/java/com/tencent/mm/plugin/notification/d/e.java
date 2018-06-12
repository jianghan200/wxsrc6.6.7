package com.tencent.mm.plugin.notification.d;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.tencent.mm.R.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.kv;
import com.tencent.mm.g.a.qh;
import com.tencent.mm.g.a.qh.a;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.g.a.qi.a;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.sns.b.g;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.ArrayList;
import java.util.List;

public final class e
  extends com.tencent.mm.plugin.notification.c.a<c>
{
  private com.tencent.mm.sdk.b.c lHR = new com.tencent.mm.sdk.b.c() {};
  private com.tencent.mm.sdk.b.c lHS = new com.tencent.mm.sdk.b.c() {};
  
  protected final void I(ArrayList<Long> paramArrayList)
  {
    kv localkv = new kv();
    localkv.bVg.bQh = paramArrayList;
    com.tencent.mm.sdk.b.a.sFg.m(localkv);
  }
  
  protected final String T(int paramInt1, int paramInt2, int paramInt3)
  {
    return this.mContext.getString(R.l.notification_resending_sns_with_fail, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt3) });
  }
  
  protected final void bke()
  {
    if (au.HX())
    {
      au.HU();
      com.tencent.mm.model.c.DT().set(589825, Boolean.valueOf(false));
    }
  }
  
  protected final void bko()
  {
    Object localObject = ((ActivityManager)this.mContext.getSystemService("activity")).getRunningTasks(1);
    if ((localObject != null) && (((List)localObject).size() > 0))
    {
      localObject = ((ActivityManager.RunningTaskInfo)((List)localObject).get(0)).topActivity;
      if (localObject != null)
      {
        localObject = ((ComponentName)localObject).getClassName();
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SendSnsFailNotification", "onNotificationClick, currentActivity name:%s", new Object[] { localObject });
        if (((String)localObject).contains("SnsTimeLineUI"))
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SendSnsFailNotification", "onNotificationClick, already in SnsTimlineUI");
          return;
        }
      }
    }
    localObject = new Intent();
    ((Intent)localObject).putExtra("sns_resume_state", false);
    ((Intent)localObject).putExtra("sns_timeline_NeedFirstLoadint", true);
    ((Intent)localObject).putExtra("preferred_tab", 2);
    if (Build.VERSION.SDK_INT < 16) {
      ((Intent)localObject).putExtra("is_need_resend_sns", true);
    }
    ((Intent)localObject).putExtra("From_fail_notify", true);
    ((Intent)localObject).putExtra("jump_sns_from_notify", true);
    ((Intent)localObject).addFlags(67108864);
    ((Intent)localObject).addFlags(536870912);
    d.e(this.mContext, "com.tencent.mm.ui.LauncherUI", (Intent)localObject);
  }
  
  public final void bkt()
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.lHS);
  }
  
  public final void bku()
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.lHR);
  }
  
  public final void bkv()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.lHS);
  }
  
  public final void bkw()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.lHR);
  }
  
  protected final String dc(int paramInt1, int paramInt2)
  {
    return this.mContext.getString(R.l.notification_resending_sns, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
  }
  
  protected final String dd(int paramInt1, int paramInt2)
  {
    if (paramInt2 <= 0) {
      return this.mContext.getString(R.l.notification_resend_finish_sns_without_fail, new Object[] { Integer.valueOf(paramInt1) });
    }
    return this.mContext.getString(R.l.notificaiton_resend_finish_sns, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  public final void eh(long paramLong)
  {
    ah.A(new e.3(this, paramLong));
  }
  
  public final boolean ei(long paramLong)
  {
    boolean bool = n.nkD.wi((int)paramLong);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SendSnsFailNotification", "checkMsgIfExist, msgId:%d, result:%b", new Object[] { Long.valueOf(paramLong), Boolean.valueOf(bool) });
    return bool;
  }
  
  protected final int getType()
  {
    return 2;
  }
  
  protected final String ue(int paramInt)
  {
    return this.mContext.getString(R.l.notificaiton_notify_fail_sns, new Object[] { Integer.valueOf(paramInt) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/notification/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */