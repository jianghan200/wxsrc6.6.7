package com.tencent.mm.plugin.appbrand.task;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.plugin.appbrand.ui.AppBrandInToolsUI;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.ui.e.i;
import java.util.Iterator;
import java.util.List;

final class b
  extends f
{
  b()
  {
    super(AppBrandInToolsUI.class, null);
  }
  
  final void amU()
  {
    Object localObject = (ActivityManager)ad.getContext().getSystemService("activity");
    if (localObject == null) {}
    ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo;
    do
    {
      do
      {
        return;
        localObject = ((ActivityManager)localObject).getRunningAppProcesses();
      } while (localObject == null);
      localObject = ((List)localObject).iterator();
      do
      {
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
        localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
      } while (!(ad.getPackageName() + ":tools").equals(localRunningAppProcessInfo.processName));
    } while (localRunningAppProcessInfo.importance == 100);
    localObject = new Intent();
    ((Intent)localObject).setComponent(new ComponentName(e.i.thA, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver"));
    ((Intent)localObject).putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_KILL_TOOLS_PROCESS");
    ad.getContext().sendBroadcast((Intent)localObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/task/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */