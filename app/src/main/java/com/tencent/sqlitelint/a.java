package com.tencent.sqlitelint;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
{
  static void u(String paramString, Map<String, List<String>> paramMap)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    String[] arrayOfString = new String[paramMap.size()];
    paramMap = new String[paramMap.size()][];
    int i = 0;
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      arrayOfString[i] = ((String)((Map.Entry)localObject).getKey());
      localObject = (List)((Map.Entry)localObject).getValue();
      paramMap[i] = new String[((List)localObject).size()];
      int j = 0;
      while (j < ((List)localObject).size())
      {
        paramMap[i][j] = ((String)((List)localObject).get(j));
        j += 1;
      }
      i += 1;
    }
    SQLiteLintNativeBridge.nativeAddToWhiteList(paramString, arrayOfString, paramMap);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/sqlitelint/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */