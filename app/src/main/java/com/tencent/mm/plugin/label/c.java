package com.tencent.mm.plugin.label;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;

public final class c
{
  public static String bq(List<String> paramList)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    if ((paramList != null) && (paramList.size() > 0))
    {
      int j = paramList.size();
      int i = 0;
      while (i < j)
      {
        localStringBuilder.append((String)paramList.get(i));
        if (i < j - 1) {
          localStringBuilder.append(",");
        }
        i += 1;
      }
      localStringBuilder.append("\000");
    }
    return localStringBuilder.toString();
  }
  
  public static String dx(String paramString1, String paramString2)
  {
    x.d("MicroMsg.Label.LabelUtils", "original:%s,waitToAddLabel:%s", new Object[] { paramString1, paramString2 });
    if (bi.oW(paramString2)) {
      return paramString1;
    }
    if (bi.oW(paramString1)) {
      return paramString2 + "\000";
    }
    String str = paramString1;
    if (paramString1.endsWith("\000")) {
      str = paramString1.replace("\000", "");
    }
    if (bi.F(str.split(",")).contains(paramString2)) {
      return str + "\000";
    }
    return str + "," + paramString2 + "\000";
  }
  
  public static String dy(String paramString1, String paramString2)
  {
    x.d("MicroMsg.Label.LabelUtils", "original:%s,waitToDelLabel:%s", new Object[] { paramString1, paramString2 });
    if (bi.oW(paramString2)) {}
    ArrayList localArrayList;
    do
    {
      return paramString1;
      if (bi.oW(paramString1)) {
        return "";
      }
      String str = paramString1;
      if (paramString1.endsWith("\000")) {
        str = paramString1.replace("\000", "");
      }
      localArrayList = bi.F(str.split(","));
      paramString1 = str;
    } while (!localArrayList.contains(paramString2));
    localArrayList.remove(paramString2);
    return bq(localArrayList);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/label/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */