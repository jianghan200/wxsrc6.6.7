package com.tencent.mm.plugin.appbrand.appcache;

import android.annotation.SuppressLint;
import com.tencent.mm.plugin.appbrand.appcache.base.a;

@SuppressLint({"DefaultLocale"})
public class ai
  extends a
{
  ai(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    this(String.format("WxaPkg_%s_%d", new Object[] { paramString1, Integer.valueOf(paramInt2) }), ag(paramString1, paramInt2), paramString2, paramString1, paramInt2, paramInt1);
  }
  
  private ai(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2)
  {
    super(paramString1, paramString2, paramString3, paramString4, paramInt1, paramInt2);
  }
  
  public static String ag(String paramString, int paramInt)
  {
    String str = ah.abY();
    return str + String.format("_%d_%d.wxapkg", new Object[] { Integer.valueOf(paramString.hashCode()), Integer.valueOf(paramInt) });
  }
  
  static String qO(String paramString)
  {
    String str = ah.abY();
    return str + String.format("_%s.wxapkg", new Object[] { paramString });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appcache/ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */