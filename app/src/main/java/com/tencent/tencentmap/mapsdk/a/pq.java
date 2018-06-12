package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import com.tencent.map.lib.util.StringUtil;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class pq
  implements pm
{
  private static final String[] a = { jy.a(), "sdksso.map.qq.com", "tafrtt.map.qq.com", "diditaf.map.qq.com" };
  private static List<String> b;
  
  private static List<String> a()
  {
    if (b == null) {
      b = Arrays.asList(a);
    }
    return b;
  }
  
  private static int b()
  {
    return 524288;
  }
  
  private static String b(String paramString)
  {
    String str2 = "GBK";
    String str1 = str2;
    int j;
    int i;
    if (paramString != null)
    {
      paramString = paramString.split(";");
      j = paramString.length;
      i = 0;
    }
    for (;;)
    {
      str1 = str2;
      if (i < j)
      {
        str1 = paramString[i];
        if (!str1.contains("charset")) {
          break label69;
        }
        paramString = str1.split("=");
        str1 = str2;
        if (paramString.length > 1) {
          str1 = paramString[1].trim();
        }
      }
      return str1;
      label69:
      i += 1;
    }
  }
  
  public po a(String paramString)
  {
    return a(paramString, "QQ Map Mobile");
  }
  
  public po a(String paramString1, String paramString2)
  {
    return a(paramString1, paramString2, 3);
  }
  
  public po a(String paramString1, String paramString2, int paramInt)
  {
    return a(paramString1, paramString2, paramInt, null);
  }
  
  public po a(String paramString1, String paramString2, int paramInt, ls paramls)
  {
    return a(paramString1, paramString2, paramInt, null, paramls);
  }
  
  public po a(String paramString1, String paramString2, int paramInt, HashMap<String, String> paramHashMap, ls paramls)
  {
    paramString1 = dv.a().a(paramString1);
    paramString1.a(b());
    if (!StringUtil.isEmpty(paramString2)) {
      paramString1.a("User-Agent", paramString2);
    }
    if ((paramHashMap != null) && (!paramHashMap.isEmpty())) {
      paramString1.a(paramHashMap);
    }
    if (paramInt >= 0) {
      paramString1.d(paramInt);
    }
    if (paramls != null) {
      paramls.a(paramString1);
    }
    paramString1 = dv.a().a(paramString1);
    if (paramString1 != null)
    {
      paramInt = paramString1.a();
      switch (paramInt)
      {
      case -7: 
      case -6: 
      case -5: 
      case -3: 
      case -1: 
      default: 
        if (paramString1.b() != null) {
          throw new pr(paramString1.b().getMessage(), paramString1.b(), paramInt);
        }
        break;
      case 0: 
        paramString2 = new po();
        paramString2.a = paramString1.c();
        paramString2.b = b(paramString1.a("Content-Type"));
        return paramString2;
      case -4: 
        throw new pu("HttpGetRequest net unavailable, respCode is: " + paramInt);
      case -2: 
        throw new ps("Respond data is empty, respCode is: " + paramInt);
      case -8: 
        throw new pt("Net local exception(outOfMemory), respCode is: " + paramInt);
      }
      throw new Exception("HttpGetRequest error:" + paramInt);
    }
    throw new Exception("HttpGetRequest return null");
  }
  
  public po a(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    return a(paramString1, paramString2, paramArrayOfByte, 3);
  }
  
  public po a(String paramString1, String paramString2, byte[] paramArrayOfByte, int paramInt)
  {
    return a(paramString1, paramString2, paramArrayOfByte, paramInt, null);
  }
  
  public po a(String paramString1, String paramString2, byte[] paramArrayOfByte, int paramInt, ls paramls)
  {
    return a(paramString1, paramString2, paramArrayOfByte, paramInt, null, paramls);
  }
  
  public po a(String paramString1, String paramString2, byte[] paramArrayOfByte, int paramInt, HashMap<String, String> paramHashMap, ls paramls)
  {
    return a(paramString1, paramString2, paramArrayOfByte, paramInt, paramHashMap, paramls, 0);
  }
  
  public po a(String paramString1, String paramString2, byte[] paramArrayOfByte, int paramInt1, HashMap<String, String> paramHashMap, ls paramls, int paramInt2)
  {
    paramString1 = dv.a().a(paramString1, paramArrayOfByte);
    paramString1.a(b());
    if (!StringUtil.isEmpty(paramString2)) {
      paramString1.a("User-Agent", paramString2);
    }
    if ((paramHashMap != null) && (!paramHashMap.isEmpty())) {
      paramString1.a(paramHashMap);
    }
    if (paramInt1 >= 0) {
      paramString1.d(paramInt1);
    }
    if (paramls != null) {
      paramls.a(paramString1);
    }
    if (paramInt2 > 0)
    {
      paramString1.b(paramInt2);
      paramString1.c(paramInt2);
    }
    paramString1 = dv.a().a(paramString1);
    if (paramString1 != null)
    {
      switch (paramString1.a())
      {
      case -3: 
      case -1: 
      default: 
        if (paramString1.b() != null) {
          throw new pr(paramString1.b().getMessage(), paramString1.b(), paramString1.a());
        }
        break;
      case 0: 
        paramString2 = new po();
        paramString2.a = paramString1.c();
        paramString2.b = b(paramString1.a("Content-Type"));
        return paramString2;
      case -4: 
        throw new pu("HttpGetRequest net unavailable, respCode is: " + paramString1.a());
      case -2: 
        throw new ps("Respond data is empty, respCode is: " + paramString1.a());
      }
      throw new Exception("HttpGetRequest error:" + paramString1.a());
    }
    throw new Exception("HttpGetRequest return null");
  }
  
  public void a(Context paramContext)
  {
    try
    {
      dv.a(paramContext, jy.c(), kh.a, kh.a(), a());
      dv.a(new pq.1(this));
      dv.a(false);
      return;
    }
    catch (Exception paramContext) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/pq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */