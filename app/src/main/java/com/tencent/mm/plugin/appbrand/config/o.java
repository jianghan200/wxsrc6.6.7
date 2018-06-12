package com.tencent.mm.plugin.appbrand.config;

import android.os.HandlerThread;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.plugin.appbrand.n.c;
import com.tencent.mm.plugin.appbrand.n.c.a;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;

public final class o
  implements c
{
  public final void a(String paramString, c.a parama)
  {
    r.a(paramString, false, new o.1(this, parama));
  }
  
  public final void al(List<String> paramList)
  {
    if (bi.cX(paramList)) {
      return;
    }
    x.i("MicroMsg.AppBrand.WxaAttrExportService", "batchSync list %s", new Object[] { bi.c(paramList, ", ") });
    r.a(paramList, k.a.frs);
  }
  
  public final void b(String paramString, c.a parama)
  {
    if (bi.oW(paramString))
    {
      if (parama != null) {
        parama.b(null);
      }
      return;
    }
    ah localah = new ah();
    new ag(localah.lnJ.getLooper()).post(new o.2(this, paramString, parama, localah));
  }
  
  public final WxaAttributes rR(String paramString)
  {
    return e.aba().e(paramString, new String[0]);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */