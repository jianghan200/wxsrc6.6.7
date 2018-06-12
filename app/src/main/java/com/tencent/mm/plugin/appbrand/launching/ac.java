package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.mm.a.g;
import com.tencent.mm.plugin.appbrand.appcache.al;
import com.tencent.mm.plugin.appbrand.appcache.ap;
import com.tencent.mm.sdk.platformtools.bi;

final class ac
{
  static String aI(String paramString, int paramInt)
  {
    Object localObject = null;
    al localal = com.tencent.mm.plugin.appbrand.app.e.abi().a(paramString, paramInt, new String[] { "versionMd5", "pkgPath" });
    paramString = (String)localObject;
    if (localal != null)
    {
      paramString = (String)localObject;
      if (!bi.oW(localal.field_pkgPath))
      {
        paramString = (String)localObject;
        if (com.tencent.mm.a.e.cn(localal.field_pkgPath))
        {
          paramString = (String)localObject;
          if (!bi.oW(localal.field_versionMd5))
          {
            paramString = (String)localObject;
            if (localal.field_pkgPath.equals(g.cu(localal.field_pkgPath))) {
              paramString = localal.field_versionMd5;
            }
          }
        }
      }
    }
    return paramString;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */