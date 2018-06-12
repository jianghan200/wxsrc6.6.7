package com.tencent.mm.plugin.appbrand.appcache.a.b;

import com.tencent.mm.by.f;
import com.tencent.mm.kernel.a;
import com.tencent.mm.sdk.platformtools.x;

public enum i
{
  public volatile boolean fiR = false;
  public volatile f<Void> fiS;
  
  private i() {}
  
  public final void acr()
  {
    for (;;)
    {
      try
      {
        if (this.fiR)
        {
          x.d("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "triggerRetry, queueRunning, skip");
          return;
        }
        if (!com.tencent.mm.kernel.g.Eg().dpD)
        {
          x.e("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "triggerRetry, account not ready");
          continue;
        }
        x.i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "triggerRetry, set flag queue running");
      }
      finally {}
      this.fiR = true;
      this.fiS = com.tencent.mm.by.g.cDZ();
      this.fiS.j(new i.1(this));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/a/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */