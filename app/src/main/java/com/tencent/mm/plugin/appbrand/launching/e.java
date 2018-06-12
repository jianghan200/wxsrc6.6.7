package com.tencent.mm.plugin.appbrand.launching;

import android.util.Pair;
import com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo;
import com.tencent.mm.plugin.appbrand.appcache.a;
import com.tencent.mm.plugin.appbrand.appcache.ag;
import com.tencent.mm.plugin.appbrand.appcache.ak;
import com.tencent.mm.plugin.appbrand.appcache.ak.a;
import com.tencent.mm.plugin.appbrand.appcache.ap;
import com.tencent.mm.plugin.appbrand.q.c;
import com.tencent.mm.plugin.appbrand.q.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.v.g;
import java.io.Closeable;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONObject;

public final class e
{
  public static WxaPkgWrappingInfo aG(String paramString, int paramInt)
  {
    int[] arrayOfInt = com.tencent.mm.plugin.appbrand.app.e.abi().qS(paramString);
    if ((arrayOfInt != null) && (arrayOfInt.length > paramInt)) {}
    for (;;)
    {
      int i = paramInt + 1;
      Pair localPair = ak.t(paramString, 0, arrayOfInt[paramInt]);
      if ((localPair.first == ak.a.fhB) && (localPair.second != null)) {
        return (WxaPkgWrappingInfo)localPair.second;
      }
      if (i >= arrayOfInt.length) {
        return null;
      }
      paramInt = i;
    }
  }
  
  static boolean bA(String paramString1, String paramString2)
  {
    boolean bool = true;
    if ((bi.oW(paramString1)) || (!com.tencent.mm.a.e.cn(paramString1))) {
      return false;
    }
    ag localag = new ag(new File(paramString1));
    if (!localag.abW())
    {
      localag.close();
      return false;
    }
    if (bi.oW(paramString2))
    {
      localag.close();
      return false;
    }
    paramString2 = a.qB(l.vP(paramString2));
    Object localObject = localag.qN(paramString2);
    if (localObject != null) {
      bi.d((Closeable)localObject);
    }
    for (;;)
    {
      localag.close();
      return bool;
      localObject = c.convertStreamToString(localag.qN("app-config.json"));
      if (!bi.oW((String)localObject)) {
        try
        {
          localObject = g.fU((String)localObject).getJSONArray("pages");
          int i = 0;
          while (i < ((JSONArray)localObject).length())
          {
            String str = ((JSONArray)localObject).getString(i);
            if (!bi.oW(str))
            {
              bool = paramString2.startsWith(a.qB(str));
              if (bool) {
                return true;
              }
            }
            i += 1;
          }
          bool = false;
        }
        catch (Exception localException)
        {
          x.e("MicroMsg.AppBrand.Launching.CheckPkgLogic", "isFilePathExistsInPkg, parse app-config.json, pkgPath(%s), queryPath(%s), e = %s", new Object[] { paramString1, paramString2, localException });
        }
      } else {
        bool = false;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */