package com.tencent.mm.plugin.walletlock.b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import com.tencent.mm.plugin.walletlock.a.b.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;

public final class d
  implements b.b
{
  private static d pIm = null;
  
  public static d bRW()
  {
    if (pIm == null) {
      pIm = new d();
    }
    return pIm;
  }
  
  public final boolean L(Activity paramActivity)
  {
    Object localObject = ((ActivityManager.RunningTaskInfo)((ActivityManager)ad.getContext().getSystemService("activity")).getRunningTasks(1).get(0)).topActivity;
    if (localObject != null) {}
    for (localObject = ((ComponentName)localObject).getClassName();; localObject = "")
    {
      x.d("MicroMsg.WalletGuardFilter", "coveredPage: " + (String)localObject);
      if ((localObject == null) || (((String)localObject).equals(paramActivity.getClass().getName())) || (!((String)localObject).contains(ad.chX())) || ((!((String)localObject).contains("plugin.mall")) && (!((String)localObject).contains("plugin.card")) && (!((String)localObject).contains("plugin.wallet")) && (!((String)localObject).contains("plugin.wallet_index")) && (!((String)localObject).contains("plugin.webview")) && (!((String)localObject).contains("plugin.offline")) && (!((String)localObject).contains("plugin.recharge")))) {
        break;
      }
      return false;
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/walletlock/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */