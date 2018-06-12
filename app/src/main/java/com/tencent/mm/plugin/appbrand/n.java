package com.tencent.mm.plugin.appbrand;

import com.tencent.mm.compatible.util.p;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

public enum n
{
  public static String a(WxaExposedParams paramWxaExposedParams)
  {
    if ((paramWxaExposedParams == null) || (bi.oW(paramWxaExposedParams.appId)))
    {
      x.e("MicroMsg.AppBrandUrlBuilders", "buildExposeUrl fail, null or nil appId");
      return "";
    }
    try
    {
      paramWxaExposedParams = String.format("https://mp.weixin.qq.com/mp/wacomplain?action=show&appid=%s&pageid=%s&from=%d&version_type=%d&version_code=%d#wechat_redirect", new Object[] { paramWxaExposedParams.appId, p.encode(bi.oV(paramWxaExposedParams.bVs), "UTF-8"), Integer.valueOf(paramWxaExposedParams.bJu), Integer.valueOf(bi.p(Integer.valueOf(paramWxaExposedParams.fih), -1)), Integer.valueOf(bi.p(Integer.valueOf(paramWxaExposedParams.fii), -1)) });
      return paramWxaExposedParams;
    }
    catch (UnsupportedEncodingException paramWxaExposedParams)
    {
      x.e("MicroMsg.AppBrandUrlBuilders", "buildExposeUrl encode fail, invalid arguments");
    }
    return "";
  }
  
  public static String qx(String paramString)
  {
    return String.format(Locale.US, "https://mp.weixin.qq.com/mp/waerrpage?appid=%s&type=overseas#wechat_redirect", new Object[] { paramString });
  }
  
  public static String qy(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.AppBrandUrlBuilders", "buildEntityUrl fail, null or nil appId");
      return "";
    }
    return String.format("https://mp.weixin.qq.com/mp/waverifyinfo?action=get&appid=%s#wechat_redirect", new Object[] { paramString });
  }
  
  public static String qz(String paramString)
  {
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.AppBrandUrlBuilders", "buildLowVersionUrl fail, invalid arguments");
      return "";
    }
    return String.format(Locale.US, "https://mp.weixin.qq.com/mp/waerrpage?appid=%s&type=upgrade&upgradetype=%d#wechat_redirect", new Object[] { paramString, Integer.valueOf(3) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */