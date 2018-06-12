package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Build.VERSION;
import com.tencent.mm.plugin.appbrand.appcache.WxaCommLibRuntimeReader;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.l;
import com.tencent.mm.plugin.appbrand.page.p;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

final class ae
  extends n
{
  private static final int CTRL_INDEX = 97;
  private static final String NAME = "getPublicLibVersion";
  
  private String q(g paramg)
  {
    boolean bool2 = true;
    Object localObject = paramg.fcu;
    if (localObject == null) {
      return f("fail", null);
    }
    paramg = new HashMap();
    if (((AppBrandSysConfig)localObject).frm.fih != 0)
    {
      bool1 = true;
      paramg.put("appDebug", Boolean.valueOf(bool1));
      paramg.put("appMd5", bi.oV(((AppBrandSysConfig)localObject).frm.bKg));
      paramg.put("appVersion", Integer.valueOf(((AppBrandSysConfig)localObject).frm.fii));
      localObject = WxaCommLibRuntimeReader.abP();
      if (((WxaPkgWrappingInfo)localObject).fih == 0) {
        break label229;
      }
    }
    label229:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      paramg.put("libDebug", Boolean.valueOf(bool1));
      paramg.put("libMd5", bi.oV(((WxaPkgWrappingInfo)localObject).bKg));
      paramg.put("libVersion", Integer.valueOf(((WxaPkgWrappingInfo)localObject).fii));
      paramg.put("clientVersion", Integer.valueOf(com.tencent.mm.protocal.d.qVN));
      paramg.put("system", "android");
      paramg.put("systemVersion", Integer.valueOf(Build.VERSION.SDK_INT));
      paramg.put("x5Version", Integer.valueOf(com.tencent.xweb.x5.sdk.d.getTbsVersion(ad.getContext())));
      return f("ok", paramg);
      bool1 = false;
      break;
    }
  }
  
  public final String a(l paraml, JSONObject paramJSONObject)
  {
    return q(paraml.fdO);
  }
  
  public final String a(p paramp)
  {
    return q(paramp.fdO);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */