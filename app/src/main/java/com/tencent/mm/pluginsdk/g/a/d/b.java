package com.tencent.mm.pluginsdk.g.a.d;

import com.tencent.mm.sdk.platformtools.bi;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public enum b
{
  public static String ar(Map<String, List<String>> paramMap)
  {
    if (paramMap == null) {
      return "null";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Object localObject = (Map.Entry)paramMap.next();
      localStringBuilder.append(bi.aG((String)((Map.Entry)localObject).getKey(), "null"));
      localStringBuilder.append(" : ");
      localObject = (List)((Map.Entry)localObject).getValue();
      if ((localObject != null) && (((List)localObject).size() > 0))
      {
        localObject = ((List)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          localStringBuilder.append(bi.oV((String)((Iterator)localObject).next())).append("|");
        }
      }
      localStringBuilder.append("\n");
    }
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/g/a/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */