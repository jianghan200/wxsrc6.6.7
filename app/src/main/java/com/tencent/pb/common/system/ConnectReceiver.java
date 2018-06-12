package com.tencent.pb.common.system;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.f.a.a;
import com.tencent.f.f;
import com.tencent.pb.common.b.g;
import com.tencent.pb.common.b.h;
import com.tencent.pb.common.c.c;

public class ConnectReceiver
  extends BroadcastReceiver
{
  private static g vgc = null;
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent != null)
    {
      try
      {
        if (paramIntent.getAction() == null) {
          return;
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(paramIntent.getAction())) {
          return;
        }
        if (vgc == null) {
          vgc = new g();
        }
        boolean bool1 = h.isNetworkConnected();
        boolean bool2 = vgc.xy();
        paramContext = (a)f.adc("EventCenter");
        if ((!bool2) || (paramContext == null)) {
          return;
        }
        if (bool1)
        {
          paramContext.c("GLOBAL_TOPIC_NETWORK_CHANGE", 21, null);
          return;
        }
      }
      catch (Throwable paramContext)
      {
        c.x("ConnectReceiver", new Object[] { "onReceive", paramContext });
        return;
      }
      paramContext.c("GLOBAL_TOPIC_NETWORK_CHANGE", 33, null);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/pb/common/system/ConnectReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */