package com.tencent.mm.plugin.appbrand.report;

import com.tencent.mm.compatible.util.p;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class e
{
  public static Object[] j(Object... paramVarArgs)
  {
    if ((paramVarArgs == null) || (paramVarArgs.length <= 0)) {
      return new Object[0];
    }
    Object[] arrayOfObject = new Object[paramVarArgs.length];
    int k = paramVarArgs.length;
    int j = 0;
    int i = 0;
    if (j < k)
    {
      Object localObject2 = paramVarArgs[j];
      Object localObject1;
      if (localObject2 == null) {
        localObject1 = "";
      }
      for (;;)
      {
        arrayOfObject[i] = String.valueOf(localObject1);
        j += 1;
        i += 1;
        break;
        localObject1 = localObject2;
        if ((localObject2 instanceof String)) {
          if (!((String)localObject2).contains(","))
          {
            localObject1 = localObject2;
            if (!((String)localObject2).contains("/")) {}
          }
          else
          {
            localObject1 = vp((String)localObject2);
          }
        }
      }
    }
    return arrayOfObject;
  }
  
  private static String vp(String paramString)
  {
    if (bi.oW(paramString)) {
      return "";
    }
    try
    {
      String str = bi.oV(p.encode(paramString));
      return str;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.AppBrand.ReportUtil", "safeEncode, given %s, e %s", new Object[] { paramString, localException });
    }
    return "";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/report/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */