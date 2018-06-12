package com.tencent.mm.plugin.freewifi.ui;

import android.os.Looper;
import com.tencent.mm.modelgeo.a;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;

public final class d
{
  public static void xP()
  {
    try
    {
      c localc = c.aPC();
      d.1 local1 = new d.1();
      if (!localc.bgH)
      {
        localc.bgH = true;
        localc.jnm = com.tencent.mm.modelgeo.c.OB();
        if (localc.jnm == null)
        {
          x.e(c.TAG, "doGeoLocation fail, iGetLocation is null");
          return;
        }
        if (localc.fRk == null) {
          localc.fRk = new c.1(localc, local1);
        }
        if (localc.jnn == null) {
          localc.jnn = new ag(Looper.myLooper());
        }
        localc.jnn.postDelayed(new c.2(localc), 20000L);
        localc.jnm.a(localc.fRk);
        return;
      }
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.FreeWifi.FreeWifiLocationReporter", "report location error. " + localException.getMessage());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */