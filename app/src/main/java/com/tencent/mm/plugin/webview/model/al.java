package com.tencent.mm.plugin.webview.model;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;

public final class al
{
  private static Map<String, String> pSJ = new HashMap();
  
  public static String Dp(String paramString)
  {
    x.i("MicroMsg.WebviewSharedUrlCache", "rawUrl:[%s]", new Object[] { paramString });
    if (bi.oW(paramString))
    {
      x.e("MicroMsg.WebviewSharedUrlCache", "rawUrl is null");
      paramString = null;
      return paramString;
    }
    String str2 = (String)pSJ.get(paramString);
    String str1 = str2;
    int i;
    if (bi.oW(str2))
    {
      i = paramString.indexOf("#");
      if (i >= 0) {
        break label90;
      }
    }
    label90:
    for (str1 = paramString;; str1 = paramString.substring(0, i))
    {
      str1 = (String)pSJ.get(str1);
      if (bi.oW(str1)) {
        break;
      }
      return str1;
    }
  }
  
  public static void clear()
  {
    pSJ.clear();
  }
  
  public static void fn(String paramString1, String paramString2)
  {
    x.i("MicroMsg.WebviewSharedUrlCache", "rawurl:[%s], shareUrl:[%s]", new Object[] { paramString1, paramString2 });
    if ((bi.oW(paramString1)) || (bi.oW(paramString2)))
    {
      x.e("MicroMsg.WebviewSharedUrlCache", "rawurl is null or share url is null");
      return;
    }
    if (pSJ.containsKey(paramString1))
    {
      x.i("MicroMsg.WebviewSharedUrlCache", "has add this rawurl");
      return;
    }
    pSJ.put(paramString1, paramString2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webview/model/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */