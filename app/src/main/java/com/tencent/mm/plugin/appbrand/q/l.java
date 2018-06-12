package com.tencent.mm.plugin.appbrand.q;

import android.net.Uri;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.HashMap;
import java.util.Map;

public final class l
{
  public static String vP(String paramString)
  {
    String str = Uri.parse("file:///" + paramString).getPath();
    if ((str != null) && (str.startsWith("/"))) {
      paramString = str.substring(1);
    }
    do
    {
      return paramString;
      paramString = str;
    } while (str != null);
    return "";
  }
  
  public static Map<String, String> vQ(String paramString)
  {
    HashMap localHashMap = new HashMap();
    String str1 = Uri.parse("file:///" + paramString).getEncodedQuery();
    if (bi.oW(str1)) {
      return localHashMap;
    }
    int j = 0;
    int m = str1.length();
    int n = str1.indexOf('&', j);
    int i;
    label72:
    int k;
    String str2;
    if (n != -1)
    {
      i = n;
      int i1 = str1.indexOf('=', j);
      if (i1 <= i)
      {
        k = i1;
        if (i1 != -1) {}
      }
      else
      {
        k = i;
      }
      str2 = Uri.decode(str1.substring(j, k));
      if (k != i) {
        break label150;
      }
    }
    label150:
    for (paramString = "";; paramString = str1.substring(k + 1, i))
    {
      localHashMap.put(str2, paramString);
      if (n == -1) {
        break label163;
      }
      j = n + 1;
      break;
      i = m;
      break label72;
    }
    label163:
    return localHashMap;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/q/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */