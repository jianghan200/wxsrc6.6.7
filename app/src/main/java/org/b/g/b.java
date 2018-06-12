package org.b.g;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class b
{
  public static <K, V> String y(Map<K, V> paramMap)
  {
    if (paramMap == null) {
      return "";
    }
    if (paramMap.isEmpty()) {
      return "{}";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    paramMap = paramMap.entrySet().iterator();
    for (;;)
    {
      if (!paramMap.hasNext()) {
        return "{" + localStringBuilder.substring(1) + "}";
      }
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      localStringBuilder.append(String.format(", %s -> %s ", new Object[] { localEntry.getKey().toString(), localEntry.getValue().toString() }));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/org/b/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */