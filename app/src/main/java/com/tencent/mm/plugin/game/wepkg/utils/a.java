package com.tencent.mm.plugin.game.wepkg.utils;

import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  public static String Eq(String paramString)
  {
    if (paramString == null) {
      return "";
    }
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("url", paramString);
      paramString = URLEncoder.encode(localJSONObject.toString(), "UTF-8");
      return paramString;
    }
    catch (JSONException paramString)
    {
      x.e("MicroMsg.WePkgReport", paramString.getMessage());
      return "";
    }
    catch (UnsupportedEncodingException paramString)
    {
      for (;;)
      {
        x.e("MicroMsg.WePkgReport", paramString.getMessage());
      }
    }
  }
  
  public static void b(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong1, long paramLong2, String paramString5)
  {
    for (;;)
    {
      try
      {
        if (bi.oW(paramString5))
        {
          localObject = new JSONObject();
          ((JSONObject)localObject).put("netType", ao.fH(ad.getContext()));
          localObject = URLEncoder.encode(((JSONObject)localObject).toString(), "UTF-8");
          paramString5 = (String)localObject;
          localObject = paramString5;
          str3 = paramString2;
        }
      }
      catch (Exception localException1)
      {
        Object localObject;
        String str1 = paramString5;
        str3 = paramString2;
        continue;
      }
      try
      {
        if (!bi.oW(paramString2))
        {
          str3 = URLEncoder.encode(paramString2, "UTF-8");
          localObject = paramString5;
        }
      }
      catch (Exception localException2)
      {
        String str2 = paramString5;
        str3 = paramString2;
        continue;
      }
      h.mEJ.h(13980, new Object[] { paramString1, str3, paramString3, paramString4, Long.valueOf(paramLong1), localObject, Long.valueOf(paramLong2) });
      return;
      localObject = new JSONObject(URLDecoder.decode(paramString5, "UTF-8"));
      ((JSONObject)localObject).put("netType", ao.fH(ad.getContext()));
      localObject = URLEncoder.encode(((JSONObject)localObject).toString(), "UTF-8");
      paramString5 = (String)localObject;
    }
  }
  
  public static String rd(int paramInt)
  {
    Object localObject = new JSONObject();
    try
    {
      ((JSONObject)localObject).put("subCode", paramInt);
      localObject = URLEncoder.encode(((JSONObject)localObject).toString(), "UTF-8");
      return (String)localObject;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      return null;
    }
    catch (JSONException localJSONException)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/game/wepkg/utils/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */