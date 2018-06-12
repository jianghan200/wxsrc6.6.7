package com.tencent.mm.plugin.appbrand.appcache.base;

import com.tencent.mm.pluginsdk.g.a.c.l;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public abstract class a
  extends l
{
  public final String appId;
  public final int bPh;
  public volatile boolean fin = true;
  public final int version;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2)
  {
    super(paramString1, paramString2, String.valueOf(paramInt1), "AppBrandWxaPkgDownloader", paramString3, "GET", 1, 2, 0);
    this.appId = paramString4;
    this.version = paramInt1;
    this.bPh = paramInt2;
    setConnectTimeout((int)TimeUnit.SECONDS.toMillis(15L));
    setReadTimeout((int)TimeUnit.SECONDS.toMillis(30L));
  }
  
  public String toShortString()
  {
    return getClass().getSimpleName() + String.format(Locale.US, "[%s|%d|%d]", new Object[] { this.appId, Integer.valueOf(this.version), Integer.valueOf(this.bPh) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/base/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */