package com.tencent.mm.plugin.notification.d;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.ox;
import com.tencent.mm.g.a.oz;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.notification.c.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;

public final class d
  extends com.tencent.mm.plugin.notification.c.a<bd>
{
  private com.tencent.mm.sdk.b.c lHK = new com.tencent.mm.sdk.b.c() {};
  private com.tencent.mm.sdk.b.c lHL = new com.tencent.mm.sdk.b.c() {};
  
  protected final void I(ArrayList<Long> paramArrayList)
  {
    au.HU();
    com.tencent.mm.model.c.FT().E(paramArrayList);
  }
  
  protected final String T(int paramInt1, int paramInt2, int paramInt3)
  {
    return this.mContext.getString(R.l.notification_resending_msg_with_fail, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(paramInt3) });
  }
  
  protected final void bko()
  {
    x.d("MicroMsg.SendNormalMsgFailNotificaiton", "onNotificationClick, mMsgList.size:%d", new Object[] { Integer.valueOf(this.lHt.lHE.size()) });
    if (this.lHt.lHE.size() > 1)
    {
      localObject = new Intent();
      ((Intent)localObject).addFlags(67108864);
      ((Intent)localObject).addFlags(536870912);
      if (Build.VERSION.SDK_INT < 16) {
        ((Intent)localObject).putExtra("resend_fail_messages", true);
      }
      ((Intent)localObject).putExtra("From_fail_notify", true);
      x.d("MicroMsg.SendNormalMsgFailNotificaiton", "startMainUI");
      com.tencent.mm.bg.d.e(this.mContext, "com.tencent.mm.ui.LauncherUI", (Intent)localObject);
    }
    while (this.lHt.lHE.size() != 1) {
      return;
    }
    long l = this.lHt.get(0);
    au.HU();
    Object localObject = com.tencent.mm.model.c.FT().dW(l).field_talker;
    Intent localIntent = new Intent();
    localIntent.putExtra("Main_User", (String)localObject);
    localIntent.putExtra("From_fail_notify", true);
    localIntent.addFlags(67108864);
    localIntent.addFlags(536870912);
    if (Build.VERSION.SDK_INT < 16) {
      localIntent.putExtra("resend_fail_messages", true);
    }
    com.tencent.mm.bg.d.e(this.mContext, "com.tencent.mm.ui.LauncherUI", localIntent);
  }
  
  public final void bkt()
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.lHK);
  }
  
  public final void bku()
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.lHL);
  }
  
  public final void bkv()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.lHK);
  }
  
  public final void bkw()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.lHL);
  }
  
  protected final String dc(int paramInt1, int paramInt2)
  {
    return this.mContext.getString(R.l.notification_resending_msg, new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
  }
  
  protected final String dd(int paramInt1, int paramInt2)
  {
    if (paramInt2 <= 0) {
      return this.mContext.getString(R.l.notification_resend_finish_msg_without_fail, new Object[] { Integer.valueOf(paramInt1) });
    }
    return this.mContext.getString(R.l.notification_resend_finish_msg, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  public final void eh(long paramLong)
  {
    au.HU();
    ah.A(new d.3(this, paramLong, com.tencent.mm.model.c.FT().dW(paramLong)));
  }
  
  public final boolean ei(long paramLong)
  {
    au.HU();
    bd localbd = com.tencent.mm.model.c.FT().dW(paramLong);
    x.d("MicroMsg.SendNormalMsgFailNotificaiton", "checkMsgIfExist, msgId:%d, msg.getMsgId:%d", new Object[] { Long.valueOf(paramLong), Long.valueOf(localbd.field_msgId) });
    return localbd.field_msgId != 0L;
  }
  
  protected final int getType()
  {
    return 1;
  }
  
  protected final String ue(int paramInt)
  {
    return this.mContext.getString(R.l.notificaiton_notify_fail_msg, new Object[] { Integer.valueOf(paramInt) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/notification/d/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */