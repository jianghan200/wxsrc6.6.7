package com.tencent.mm.plugin.appbrand.config;

import android.support.v4.e.a;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Map;

public final class f
  implements j.a
{
  private static f fqB;
  public final Map<String, AppBrandInitConfig> fqC = new a();
  public final Map<String, String> fqD = new a();
  
  public static AppBrandInitConfig a(WxaAttributes paramWxaAttributes)
  {
    AppBrandInitConfig localAppBrandInitConfig = null;
    if (paramWxaAttributes != null)
    {
      localAppBrandInitConfig = new AppBrandInitConfig();
      localAppBrandInitConfig.username = paramWxaAttributes.field_username;
      localAppBrandInitConfig.appId = paramWxaAttributes.field_appId;
      localAppBrandInitConfig.bKC = paramWxaAttributes.field_nickname;
      localAppBrandInitConfig.iconUrl = paramWxaAttributes.field_brandIconURL;
      localAppBrandInitConfig.bGM = paramWxaAttributes.aej().dCn;
      if (paramWxaAttributes.aej().frT <= 0) {
        break label76;
      }
    }
    label76:
    for (boolean bool = true;; bool = false)
    {
      localAppBrandInitConfig.fqr = bool;
      return localAppBrandInitConfig;
    }
  }
  
  public static f aee()
  {
    try
    {
      f localf = fqB;
      return localf;
    }
    finally {}
  }
  
  public static void init()
  {
    try
    {
      fqB = new f();
      q.aei().c(fqB);
      return;
    }
    finally {}
  }
  
  private AppBrandInitConfig rM(String paramString)
  {
    if (bi.oW(paramString)) {
      ??? = null;
    }
    Object localObject2;
    for (;;)
    {
      return (AppBrandInitConfig)???;
      synchronized (this.fqD)
      {
        localObject2 = (String)this.fqD.get(paramString);
        if (bi.oW((String)localObject2))
        {
          localObject2 = a(e.aba().e(paramString, new String[] { "appId", "appInfo", "brandIconURL", "nickname" }));
          ??? = localObject2;
          if (localObject2 == null) {
            continue;
          }
          synchronized (this.fqD)
          {
            this.fqD.put(paramString, ((AppBrandInitConfig)localObject2).appId);
            return (AppBrandInitConfig)localObject2;
          }
        }
      }
    }
    return rN((String)localObject2);
  }
  
  public static void release()
  {
    try
    {
      fqB = null;
      return;
    }
    finally {}
  }
  
  public final void a(String arg1, l paraml)
  {
    if ("single".equals(???)) {
      if (String.class.isInstance(paraml.obj))
      {
        ??? = String.valueOf(paraml.obj);
        if (!bi.oW(???)) {
          rM(???);
        }
      }
    }
    while (!"batch".equals(???)) {
      return;
    }
    synchronized (this.fqC)
    {
      this.fqC.clear();
      return;
    }
  }
  
  public final String rL(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    synchronized (this.fqD)
    {
      paramString = (String)this.fqD.get(paramString);
      return paramString;
    }
  }
  
  public final AppBrandInitConfig rN(String paramString)
  {
    if (bi.oW(paramString)) {
      ??? = null;
    }
    for (;;)
    {
      return (AppBrandInitConfig)???;
      synchronized (this.fqC)
      {
        AppBrandInitConfig localAppBrandInitConfig = (AppBrandInitConfig)this.fqC.remove(paramString);
        ??? = localAppBrandInitConfig;
        if (localAppBrandInitConfig != null) {
          continue;
        }
        return a(e.aba().f(paramString, new String[] { "appInfo", "brandIconURL", "nickname" }));
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */