package com.tencent.tencentmap.mapsdk.a;

import android.content.Context;
import com.tencent.map.lib.util.StringUtil;
import java.util.Map;

public class pl
{
  public static void a() {}
  
  public static void a(Context paramContext)
  {
    try
    {
      da.a(false, false);
      da.b(jy.c());
      da.a("4.0.8");
      da.a(paramContext);
      if (!StringUtil.isEmpty(kh.a)) {
        da.c(Integer.toString(kh.a.hashCode()));
      }
      return;
    }
    catch (Error paramContext) {}catch (Exception paramContext) {}
  }
  
  public static boolean a(String paramString, boolean paramBoolean1, long paramLong1, long paramLong2, Map<String, String> paramMap, boolean paramBoolean2)
  {
    try
    {
      paramBoolean1 = da.a(paramString, paramBoolean1, paramLong1, paramLong2, paramMap, paramBoolean2);
      return paramBoolean1;
    }
    catch (Exception paramString)
    {
      return false;
    }
    catch (Error paramString)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/pl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */