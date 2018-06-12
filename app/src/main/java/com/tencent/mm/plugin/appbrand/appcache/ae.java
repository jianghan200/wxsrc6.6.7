package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.mm.plugin.appbrand.appcache.base.a;
import java.util.Locale;

final class ae
  extends a
{
  final int fgJ;
  final int fgK;
  final aq.a fgL;
  
  ae(String paramString1, int paramInt1, int paramInt2, String paramString2, aq.a parama)
  {
    super(r(paramString1, paramInt1, paramInt2), ah.abY() + String.format(Locale.US, "_%s_%d_%d.wxapkg.diff", new Object[] { Integer.valueOf(paramString1.hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), paramString2, paramString1, 0, paramInt2);
    this.fgJ = paramInt1;
    this.fgK = paramInt2;
    this.fgL = parama;
    if (!"@LibraryAppId".equals(paramString1)) {
      bool = true;
    }
    this.fin = bool;
  }
  
  static String r(String paramString, int paramInt1, int paramInt2)
  {
    return String.format(Locale.US, "WxaPkgDiff_%s_%d_%d", new Object[] { Integer.valueOf(paramString.hashCode()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  public final String abR()
  {
    return ai.ag(this.appId, this.fgK);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */