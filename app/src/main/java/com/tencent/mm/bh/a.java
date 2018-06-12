package com.tencent.mm.bh;

import com.tencent.mm.model.au;
import com.tencent.mm.model.br;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class a
{
  private static final Map<Integer, Integer> qVk = new HashMap();
  
  public static void Cy(int paramInt)
  {
    int i = bi.f((Integer)qVk.get(Integer.valueOf(paramInt)));
    qVk.put(Integer.valueOf(paramInt), Integer.valueOf(i + 1));
  }
  
  public static void Ut(String paramString)
  {
    paramString = paramString + cfI();
    Iterator localIterator = qVk.entrySet().iterator();
    StringBuilder localStringBuilder = new StringBuilder();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if ((localEntry != null) && (localEntry.getKey() != null) && (localEntry.getValue() != null) && (((Integer)localEntry.getValue()).intValue() != 0))
      {
        localStringBuilder.append(localEntry.getKey());
        localStringBuilder.append('=');
        localStringBuilder.append(localEntry.getValue());
        localStringBuilder.append(',');
      }
    }
    qVk.clear();
    if (localStringBuilder.length() > 0)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.PostTaskFMessageCardStat", "append fmesage card click");
      br.r(10, localStringBuilder.toString());
    }
    paramString = paramString + cfI();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.PostTaskFMessageCardStat", "dkfm :" + paramString);
    try
    {
      au.HU();
      c.DT().set(66819, Long.valueOf(bi.VE()));
      return;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.PostTaskFMessageCardStat", "e:" + paramString.getMessage());
    }
  }
  
  public static String cfI()
  {
    StringBuilder localStringBuilder = new StringBuilder("[a=");
    if (au.HU() == null) {}
    for (String str = "0";; str = "1")
    {
      str = str + " ";
      if (au.HU() != null) {
        break;
      }
      return str;
    }
    localStringBuilder = new StringBuilder().append(str).append("c=");
    au.HU();
    if (c.DT() == null)
    {
      str = "0";
      str = str + " ";
      localStringBuilder = new StringBuilder().append(str).append("u=");
      if (!au.HX()) {
        break label137;
      }
    }
    label137:
    for (str = "1";; str = "0")
    {
      return str + "]";
      str = "1";
      break;
    }
  }
  
  public static void run()
  {
    au.HU();
    if (bi.bG(bi.a((Long)c.DT().get(66819, null), 0L)) * 1000L > 1800000L) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        Ut("");
      }
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/bh/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */