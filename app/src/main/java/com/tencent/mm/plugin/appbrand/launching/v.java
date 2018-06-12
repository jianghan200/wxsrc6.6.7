package com.tencent.mm.plugin.appbrand.launching;

import android.content.Intent;
import android.os.Build.VERSION;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.plugin.appbrand.task.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity.a;

public class v
  implements MMActivity.a
{
  public final int bRZ = v.class.hashCode() & 0xFFFF;
  
  public void akI() {}
  
  public final void akJ()
  {
    if (d.fR(17)) {
      onReady();
    }
  }
  
  public final void b(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (this.bRZ != paramInt1) {
      return;
    }
    if (paramInt2 == -1)
    {
      x.i("MicroMsg.AppBrand.PreLaunchCheckForTBS", "onActivityResult, tbs download ok");
      e.lE(0);
      onReady();
      return;
    }
    if (paramInt2 == 2)
    {
      x.i("MicroMsg.AppBrand.PreLaunchCheckForTBS", "onActivityResult, tbs cancel loading, download in background");
      akI();
      return;
    }
    x.i("MicroMsg.AppBrand.PreLaunchCheckForTBS", "onActivityResult, tbs download unknown error, resultCode = %d, apiLevel = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(Build.VERSION.SDK_INT) });
    h.mEJ.a(366L, 8L, 1L, false);
    akJ();
  }
  
  public void onReady() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */