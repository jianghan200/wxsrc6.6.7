package com.tencent.mm.plugin.appbrand;

import android.util.Pair;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.ao;
import com.tencent.mm.plugin.appbrand.appcache.d.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.debugger.r;
import com.tencent.mm.plugin.appbrand.g.a.f;
import com.tencent.mm.plugin.appbrand.g.a.f.6;
import com.tencent.mm.plugin.appbrand.g.a.h;
import com.tencent.mm.plugin.appbrand.g.a.i;
import com.tencent.mm.plugin.appbrand.g.a.i.3;
import com.tencent.mm.plugin.appbrand.g.a.j;
import com.tencent.mm.plugin.appbrand.g.b;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.q.c;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import org.json.JSONObject;

public final class o
{
  l fcy;
  d fec;
  public i fed;
  private j fef = new o.1(this);
  
  public o(l paraml)
  {
    this.fcy = paraml;
    this.fec = ((d)paraml.fdQ.y(d.class));
    this.fed = new i(this.fef);
    paraml.fdQ.addJavascriptInterface(this, "WeixinWorker");
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final int create(String paramString)
  {
    String str1 = c.vM("wxa_library/bootstrap_j2v8_worker.js");
    String str2 = String.format("var __wxConfig = %s;", new Object[] { this.fcy.aaK().toString() });
    String str3 = WxaCommLibRuntimeReader.qJ("WAWorker.js");
    String str4 = ao.a(this.fcy.fdO, paramString);
    int i;
    Object localObject;
    if (!d.a.jC(this.fcy.fdO.fcu.frm.fih))
    {
      i = 1;
      if (i == 0) {
        break label221;
      }
      localObject = ao.a(this.fcy.fdO, paramString + ".map");
      if ((localObject == null) || (((String)localObject).length() <= 0)) {
        break label221;
      }
      localObject = new Pair(null, localObject);
      x.i("MicroMsg.AppBrandWorkerContainer", "injectSourceMap(%s.map)", new Object[] { paramString });
    }
    for (;;)
    {
      return this.fed.a(new Pair[] { new Pair(null, str1), new Pair(null, str2), new Pair(null, str3), new Pair(r.st(paramString), str4), localObject });
      i = 0;
      break;
      label221:
      localObject = null;
    }
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void postMsgToWorker(int paramInt, String paramString)
  {
    i locali = this.fed;
    f localf = (f)locali.geA.get(Integer.valueOf(paramInt));
    if (localf != null) {
      localf.gem.r(new i.3(locali, localf, paramString));
    }
  }
  
  @android.webkit.JavascriptInterface
  @org.xwalk.core.JavascriptInterface
  public final void terminate(int paramInt)
  {
    ??? = (f)this.fed.geA.remove(Integer.valueOf(paramInt));
    if (??? != null)
    {
      ((f)???).gem.r(new f.6((f)???));
      h localh = ((f)???).gem;
      synchronized (localh.gek)
      {
        localh.Sx = false;
        return;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */