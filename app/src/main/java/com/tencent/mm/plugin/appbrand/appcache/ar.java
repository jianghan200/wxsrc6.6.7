package com.tencent.mm.plugin.appbrand.appcache;

import com.tencent.mm.plugin.appbrand.appcache.base.a;
import java.util.Locale;

public final class ar
  extends a
{
  ar(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    super(b(paramString1, paramString2, paramInt1, paramInt2), ai.qO(b(paramString1, paramString2, paramInt1, paramInt2)), paramString1, paramString2, paramInt1, paramInt2);
  }
  
  private static String b(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    return String.format(Locale.US, "WxaPage_%s_%d_%d_%d", new Object[] { paramString2, Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), Integer.valueOf(paramString1.hashCode()) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */