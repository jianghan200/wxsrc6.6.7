package com.tencent.mm.plugin.websearch.api;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.tencent.mm.pluginsdk.model.u;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.e.i;

public class ToolsProcessStarterService
  extends Service
{
  public static void af(Intent paramIntent)
  {
    paramIntent.setComponent(new ComponentName(e.i.thA, "com.tencent.mm.plugin.websearch.api.ToolsProcessStarterService"));
    ad.getContext().startService(paramIntent);
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    if (paramIntent == null) {
      return super.onStartCommand(paramIntent, paramInt1, paramInt2);
    }
    String str = paramIntent.getStringExtra("tools_process_action_code_key");
    if (TextUtils.isEmpty(str)) {
      return super.onStartCommand(paramIntent, paramInt1, paramInt2);
    }
    x.i("ToolsProcessStarterService", "onStartCommand, action = " + str);
    if (str.equals("com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS")) {
      x.i("ToolsProcessStarterService", "start tools process task, try to pre load tbs");
    }
    for (;;)
    {
      return super.onStartCommand(paramIntent, paramInt1, paramInt2);
      if (str.equals("com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS_DO_NOTHING"))
      {
        x.i("ToolsProcessStarterService", "start tools process and do nothing");
      }
      else if (str.equals("com.tencent.mm.intent.ACTION_CHECK_MINIQB_CAN_OPEN_FILE"))
      {
        u.al(paramIntent);
      }
      else if (str.equals("com.tencent.mm.intent.ACTION_PRELOAD_DISCOVERY_RECOMMEND"))
      {
        str = paramIntent.getStringExtra("tools_param_preload_url");
        z.bTc().cu(str, 2);
      }
      else if (str.equals("com.tencent.mm.intent.ACTION_PRELOAD_DISCOVERY_SEARCH"))
      {
        str = paramIntent.getStringExtra("tools_param_preload_url");
        z.bTc().cu(str, 1);
      }
      else if (str.equals("com.tencent.mm.intent.ACTION_PRELOAD_SET_SWITCH"))
      {
        boolean bool = paramIntent.getBooleanExtra("tools_param_preload_switch", false);
        z.bTc().jP(bool);
      }
      else if (str.equals("com.tencent.mm.intent.ACTION_PRELOAD_SEARCH"))
      {
        z.bTc().ai(paramIntent);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/websearch/api/ToolsProcessStarterService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */