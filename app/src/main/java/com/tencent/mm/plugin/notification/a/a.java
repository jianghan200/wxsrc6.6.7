package com.tencent.mm.plugin.notification.a;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;

public final class a
  implements m.b
{
  private final String TAG = "MicroMsg.NotificationObserver";
  private final int lHi = 50;
  public boolean lHj = false;
  private ag mHandler = new a.1(this, Looper.getMainLooper());
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    x.i("MicroMsg.NotificationObserver", "event: %d", new Object[] { Integer.valueOf(paramInt) });
    if ((!(paramObject instanceof String)) || (bi.oW((String)paramObject)))
    {
      x.d("MicroMsg.NotificationObserver", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
      return;
    }
    if (!au.HM()) {
      au.HU();
    }
    for (paramInt = (int)c.FR().Ye((String)paramObject).dhP;; paramInt = 0)
    {
      this.mHandler.removeMessages(paramInt);
      paramm = Message.obtain();
      Bundle localBundle = new Bundle();
      localBundle.putString("com.tencent.mm.notification.observer", (String)paramObject);
      paramm.setData(localBundle);
      paramm.what = paramInt;
      this.mHandler.sendMessageDelayed(paramm, 50L);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/notification/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */