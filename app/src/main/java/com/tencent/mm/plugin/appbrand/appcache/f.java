package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.mm.plugin.appbrand.appcache.base.a;
import java.util.Locale;

public final class f
  extends a
{
  final int ffw;
  
  public f(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    this(str1, str2 + String.format(Locale.US, "%d_%d_%d.encwxapkg", new Object[] { Integer.valueOf(paramString1.hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), paramString2, paramString1, paramInt1, paramInt2);
  }
  
  private f(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2)
  {
    super(paramString1, paramString2, paramString3, paramString4, paramInt2, 0);
    this.ffw = paramInt1;
  }
  
  public final String toShortString()
  {
    return String.format(Locale.US, "EncryptPkgDownloadRequest[%s %d %d]", new Object[] { this.appId, Integer.valueOf(this.ffw), Integer.valueOf(this.version) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */