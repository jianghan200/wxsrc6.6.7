package com.tencent.mm.plugin.downloader.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.tencent.mm.g.a.gt;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.downloader.model.c;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.downloader.model.m;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
{
  private static BroadcastReceiver icC = null;
  private static int icD = -1;
  
  public static void aDb()
  {
    if (icC == null) {
      icC = new a((byte)0);
    }
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
    localIntentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
    localIntentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    try
    {
      ad.getContext().registerReceiver(icC, localIntentFilter);
      return;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.Downloader.NetWorkManager", localException.getMessage());
    }
  }
  
  public static void aDc()
  {
    if (icC != null) {}
    try
    {
      ad.getContext().unregisterReceiver(icC);
      icC = null;
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.Downloader.NetWorkManager", localException.getMessage());
      }
    }
  }
  
  private static final class a
    extends BroadcastReceiver
  {
    public final void onReceive(Context paramContext, Intent paramIntent)
    {
      if ((!g.Eg().Dx()) || (com.tencent.mm.kernel.a.Dr())) {
        x.e("MicroMsg.Downloader.NetWorkManager", "acc has not ready");
      }
      for (;;)
      {
        return;
        int i = ao.getNetType(ad.getContext());
        if (i != a.KD())
        {
          a.nA(i);
          x.i("MicroMsg.Downloader.NetWorkManager", "onNetStateChange, netState = " + i);
          if (!ao.isConnected(paramContext))
          {
            x.w("MicroMsg.Downloader.NetWorkManager", "network is not connected");
            return;
          }
          Object localObject;
          if (ao.isWifi(i))
          {
            paramContext = c.aCT();
            if (paramContext != null)
            {
              paramContext = paramContext.iterator();
              while (paramContext.hasNext())
              {
                paramIntent = (com.tencent.mm.plugin.downloader.c.a)paramContext.next();
                x.i("MicroMsg.Downloader.NetWorkManager", "resumeTask, appId = %s, state = %d", new Object[] { paramIntent.field_appId, Integer.valueOf(paramIntent.field_status) });
                if (paramIntent.field_status == 5)
                {
                  c.ct(paramIntent.field_downloadId);
                }
                else if (paramIntent.field_status == 2)
                {
                  d.aCU().co(paramIntent.field_downloadId);
                }
                else
                {
                  localObject = d.aCU();
                  if (paramIntent.field_downloaderType == 3) {
                    ((d)localObject).aCY().a(paramIntent);
                  } else {
                    ((d)localObject).aCV().a(paramIntent);
                  }
                }
              }
            }
          }
          else
          {
            paramContext = c.aCS();
            if (paramContext != null)
            {
              paramContext = paramContext.iterator();
              while (paramContext.hasNext())
              {
                paramIntent = (com.tencent.mm.plugin.downloader.c.a)paramContext.next();
                d.aCU().cn(paramIntent.field_downloadId);
                localObject = new gt();
                ((gt)localObject).bPU.opType = 9;
                ((gt)localObject).bPU.bGm = paramIntent.field_downloadId;
                com.tencent.mm.sdk.b.a.sFg.m((b)localObject);
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/downloader/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */