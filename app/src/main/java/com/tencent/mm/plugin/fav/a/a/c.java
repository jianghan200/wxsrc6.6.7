package com.tencent.mm.plugin.fav.a.a;

import com.tencent.mm.protocal.c.wy;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;
import java.util.Map;

public final class c
{
  public static String a(wy paramwy)
  {
    int j = 0;
    if ((paramwy == null) || ((paramwy.rBX.isEmpty()) && (paramwy.rBW.isEmpty())))
    {
      x.v("MicroMsg.FavTagParser", "tag list toXml data list empty");
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer();
    int k = paramwy.rBX.size();
    localStringBuffer.append("<taglist count='").append(k).append("'>");
    int i = 0;
    while (i < k)
    {
      localStringBuffer.append("<tag>").append(bi.WS((String)paramwy.rBX.get(i))).append("</tag>");
      i += 1;
    }
    localStringBuffer.append("</taglist>");
    k = paramwy.rBW.size();
    localStringBuffer.append("<recommendtaglist count='").append(k).append("'>");
    i = j;
    while (i < k)
    {
      localStringBuffer.append("<tag>").append(bi.WS((String)paramwy.rBW.get(i))).append("</tag>");
      i += 1;
    }
    localStringBuffer.append("</recommendtaglist>");
    return localStringBuffer.toString();
  }
  
  public static void a(Map<String, String> paramMap, wy paramwy)
  {
    if ((paramMap == null) || (paramwy == null)) {
      x.w("MicroMsg.FavTagParser", "maps is null or item is null");
    }
    label97:
    label206:
    do
    {
      return;
      paramwy.rBX.clear();
      int i = 0;
      StringBuilder localStringBuilder;
      Object localObject;
      if (i < 1024)
      {
        localStringBuilder = new StringBuilder(".favitem.taglist.tag");
        if (i > 0) {}
        for (localObject = Integer.valueOf(i);; localObject = "")
        {
          localObject = (String)paramMap.get(localObject);
          if (localObject == null) {
            break label97;
          }
          paramwy.rBX.add(localObject);
          i += 1;
          break;
        }
      }
      if (!paramwy.rBX.isEmpty()) {
        x.d("MicroMsg.FavTagParser", "user def tag not empty, res=%s", new Object[] { paramwy.rBX });
      }
      paramwy.rBW.clear();
      i = 0;
      if (i < 1024)
      {
        localStringBuilder = new StringBuilder(".favitem.recommendtaglist.tag");
        if (i > 0) {}
        for (localObject = Integer.valueOf(i);; localObject = "")
        {
          localObject = (String)paramMap.get(localObject);
          if (localObject == null) {
            break label206;
          }
          paramwy.rBW.add(localObject);
          i += 1;
          break;
        }
      }
    } while (paramwy.rBW.isEmpty());
    x.d("MicroMsg.FavTagParser", "recommended tag not empty, res=%s", new Object[] { paramwy.rBW });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/fav/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */