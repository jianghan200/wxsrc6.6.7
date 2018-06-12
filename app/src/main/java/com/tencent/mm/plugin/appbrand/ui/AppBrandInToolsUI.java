package com.tencent.mm.plugin.appbrand.ui;

import android.os.Bundle;
import com.tencent.mm.plugin.appbrand.task.d;
import com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver;
import com.tencent.mm.sdk.platformtools.x;

public final class AppBrandInToolsUI
  extends AppBrandUI
{
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    try
    {
      KVCommCrossProcessReceiver.brP();
      d.a(null, true);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.printErrStackTrace("MicroMsg.AppBrandInToolsUI", localException, "sendKV", new Object[0]);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/AppBrandInToolsUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */