package com.tencent.mm.plugin.appbrand.debugger;

import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.ao;
import com.tencent.mm.plugin.appbrand.appcache.d.a;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.b;
import com.tencent.mm.plugin.appbrand.r.i;
import com.tencent.mm.plugin.appbrand.r.i.a;
import com.tencent.mm.sdk.platformtools.x;

public final class r
{
  public static void a(g paramg, b paramb, String paramString)
  {
    if ((paramg == null) || (paramb == null) || (paramString == null) || (paramString.length() == 0))
    {
      x.w("MicroMsg.SourceMapInjector", "runtime or jsRuntime or filePath is null.");
      return;
    }
    if (d.a.jC(paramg.fcu.frm.fih))
    {
      x.i("MicroMsg.SourceMapInjector", "current running type is ReleaseType do not need to inject sourceMap.");
      return;
    }
    paramg = ao.a(paramg, paramString + ".map");
    if ((paramg == null) || (paramg.length() == 0))
    {
      x.i("MicroMsg.SourceMapInjector", "sourceMap of the script(%s) is null or nil.", new Object[] { paramString });
      return;
    }
    i.a(paramb, String.format("var __wxSourceMap ={ '%s': %s };", new Object[] { paramString, paramg }), new r.2(paramString));
  }
  
  public static String st(String paramString)
  {
    return "https://servicewechat.qq.com/" + paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/debugger/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */