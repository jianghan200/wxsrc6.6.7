package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.mm.plugin.appbrand.appcache.ap;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import org.json.JSONObject;

public final class h
  extends i<g>
{
  public static final String[] dzV = { i.a(g.fgt, "DevPkgLaunchExtInfo") };
  
  public h(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, g.fgt, "DevPkgLaunchExtInfo", g.ciG);
  }
  
  public final String aH(String paramString, int paramInt)
  {
    if (bi.oW(paramString)) {
      return "";
    }
    g localg = new g();
    localg.field_appId = paramString;
    localg.field_versionType = paramInt;
    if (super.b(localg, g.fgs)) {
      return localg.field_extJson;
    }
    return "";
  }
  
  public final boolean n(String paramString1, int paramInt, String paramString2)
  {
    boolean bool;
    if (bi.oW(paramString1)) {
      bool = false;
    }
    for (;;)
    {
      g localg;
      if (bool) {
        localg = null;
      }
      try
      {
        paramString2 = WxaAttributes.e.sj(new JSONObject(paramString2).optString("module_list"));
        if (!bi.cX(paramString2)) {
          com.tencent.mm.plugin.appbrand.app.e.abi().a(paramString1, paramInt, -1, paramString2);
        }
        return bool;
        localg = new g();
        localg.field_appId = paramString1;
        localg.field_versionType = paramInt;
        if (super.b(localg, g.fgs))
        {
          localg.field_extJson = bi.aG(paramString2, "{}");
          bool = super.c(localg, new String[0]);
          continue;
        }
        localg.field_extJson = bi.aG(paramString2, "{}");
        bool = super.b(localg);
      }
      catch (Exception paramString2)
      {
        for (;;)
        {
          paramString2 = localg;
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */