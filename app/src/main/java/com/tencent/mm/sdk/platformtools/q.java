package com.tencent.mm.sdk.platformtools;

import java.util.HashMap;
import java.util.Map;

public final class q
{
  public static Map<String, String> Wi(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0))
    {
      paramString = null;
      return paramString;
    }
    HashMap localHashMap = new HashMap();
    String[] arrayOfString = paramString.split("\n");
    int j = arrayOfString.length;
    int i = 0;
    for (;;)
    {
      paramString = localHashMap;
      if (i >= j) {
        break;
      }
      paramString = arrayOfString[i];
      if ((paramString != null) && (paramString.length() > 0))
      {
        Object localObject = paramString.trim().split("=", 2);
        if ((localObject != null) && (localObject.length >= 2))
        {
          paramString = localObject[0];
          localObject = localObject[1];
          if ((paramString != null) && (paramString.length() > 0) && (paramString.matches("^[a-zA-Z0-9_.]*"))) {
            localHashMap.put(paramString, localObject);
          }
        }
      }
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */