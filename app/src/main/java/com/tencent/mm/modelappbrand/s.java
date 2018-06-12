package com.tencent.mm.modelappbrand;

import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;

public final class s
{
  private static Map<String, Long> dFE = new HashMap();
  private static Map<String, Long> dFF = new HashMap();
  private static Map<String, Long> dFG = new HashMap();
  private static Map<String, Long> dFH = new HashMap();
  
  public static void JW()
  {
    x.i("SearchWidgetStartTrace", "hasInitData %s", new Object[] { Boolean.valueOf(true) });
  }
  
  public static void i(String paramString1, String paramString2, Object... paramVarArgs)
  {
    x.i("SearchWidgetStartTrace", "widget trace - " + paramString1 + "-" + paramString2, paramVarArgs);
  }
  
  public static void jo(String paramString)
  {
    x.i("SearchWidgetStartTrace", "recv rsp widget %s", new Object[] { paramString });
    dFE.put(paramString, Long.valueOf(System.currentTimeMillis()));
  }
  
  public static void jp(String paramString)
  {
    x.i("SearchWidgetStartTrace", "jsapiInsertWidget %s", new Object[] { paramString });
  }
  
  public static void jq(String paramString)
  {
    x.i("SearchWidgetStartTrace", "realInsert %s", new Object[] { paramString });
  }
  
  public static void z(String paramString, boolean paramBoolean)
  {
    x.i("SearchWidgetStartTrace", "drawEnd %s,succ %s", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    if (paramBoolean) {
      if (!dFE.containsKey(paramString)) {
        break label65;
      }
    }
    label65:
    for (long l = ((Long)dFE.get(paramString)).longValue(); l > 0L; l = 0L)
    {
      System.currentTimeMillis();
      return;
    }
    x.e("SearchWidgetStartTrace", "can't find widget Recv timestamp for appid %s", new Object[] { paramString });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelappbrand/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */