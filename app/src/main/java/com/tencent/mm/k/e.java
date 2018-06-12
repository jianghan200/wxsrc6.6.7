package com.tencent.mm.k;

import com.tencent.mm.g.a.cm;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class e
{
  private HashMap<String, String> dgV = new HashMap();
  public boolean dgW = false;
  
  private void b(Map<String, String> paramMap, boolean paramBoolean)
  {
    if (paramMap == null) {
      return;
    }
    if (!paramBoolean) {
      this.dgV.clear();
    }
    int i = 0;
    if (i < 10000)
    {
      Object localObject2;
      label48:
      String str1;
      HashMap localHashMap;
      String str2;
      if (paramBoolean)
      {
        localObject2 = new StringBuilder(".sysmsg.dynacfg_split.Item");
        if (i == 0)
        {
          localObject1 = "";
          localObject1 = localObject1;
          str1 = (String)localObject1 + ".$key";
          localObject2 = (String)paramMap.get(localObject1);
          str1 = (String)paramMap.get(str1);
          if ((str1 == null) || (bi.oW(str1.trim()))) {
            break label246;
          }
          localHashMap = this.dgV;
          str2 = str1.trim();
          if (localObject2 == null) {
            break label239;
          }
        }
      }
      label239:
      for (Object localObject1 = localObject2;; localObject1 = "")
      {
        localHashMap.put(str2, localObject1);
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.DynamicConfig", "put %s %s", new Object[] { str1.trim(), localObject2 });
        i += 1;
        break;
        localObject1 = Integer.valueOf(i);
        break label48;
        localObject2 = new StringBuilder(".sysmsg.dynacfg.Item");
        if (i == 0) {}
        for (localObject1 = "";; localObject1 = Integer.valueOf(i))
        {
          localObject1 = localObject1;
          break;
        }
      }
    }
    label246:
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.DynamicConfig", "All dynamicConfig:%s", new Object[] { this.dgV.toString() });
  }
  
  public final void a(String paramString, Map<String, String> paramMap, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        boolean bool = bi.oW(paramString);
        if (bool) {
          return;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.DynamicConfig", "update dynacfg. increment:%b, md5:%s", new Object[] { Boolean.valueOf(paramBoolean), com.tencent.mm.a.g.cu(paramString) });
        if (paramBoolean)
        {
          com.tencent.mm.kernel.g.Ek();
          com.tencent.mm.kernel.g.Ei().DT().set(278530, paramString);
          if (paramMap == null) {
            break label131;
          }
          b(paramMap, paramBoolean);
          paramString = new cm();
          a.sFg.m(paramString);
          continue;
        }
        com.tencent.mm.kernel.g.Ek();
      }
      finally {}
      com.tencent.mm.kernel.g.Ei().DT().set(278529, paramString);
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Ei().DT().set(278530, "");
      continue;
      label131:
      n(paramString, paramBoolean);
    }
  }
  
  public final List<String> fl(String paramString)
  {
    ArrayList localArrayList;
    try
    {
      if (!this.dgW)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.DynamicConfig", "DynamicConfig hadnot load");
        kS();
      }
      localArrayList = new ArrayList();
      if (!bi.oW(paramString))
      {
        Iterator localIterator = this.dgV.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          if (str.matches(paramString)) {
            localArrayList.add(this.dgV.get(str));
          }
        }
      }
    }
    finally {}
    tmp109_106[0] = paramString;
    Object[] tmp113_109 = tmp109_106;
    tmp113_109[1] = Integer.valueOf(localArrayList.size());
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.DynamicConfig", "searchValues, entry:%s, size:%d", tmp113_109);
    return localArrayList;
  }
  
  public final int getInt(String paramString, int paramInt)
  {
    try
    {
      int i = Integer.parseInt(getValue(paramString));
      return i;
    }
    catch (Exception localException)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.DynamicConfig", "parseInt failed, val: " + paramString);
    }
    return paramInt;
  }
  
  public final String getValue(String paramString)
  {
    try
    {
      if (!this.dgW)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.DynamicConfig", "DynamicConfig hadnot load");
        kS();
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.DynamicConfig", "get configs.get(config) %s %s", new Object[] { paramString.trim(), this.dgV.get(paramString) });
      paramString = (String)this.dgV.get(paramString);
      return paramString;
    }
    finally {}
  }
  
  public void kS()
  {
    try
    {
      com.tencent.mm.kernel.g.Ek();
      if (com.tencent.mm.kernel.g.Ei() != null)
      {
        com.tencent.mm.kernel.g.Ek();
        if (com.tencent.mm.kernel.g.Ei().DT() != null)
        {
          this.dgW = true;
          com.tencent.mm.kernel.g.Ek();
          n((String)com.tencent.mm.kernel.g.Ei().DT().get(278529, null), false);
        }
      }
      com.tencent.mm.kernel.g.Ek();
      if (com.tencent.mm.kernel.g.Ei() != null)
      {
        com.tencent.mm.kernel.g.Ek();
        if (com.tencent.mm.kernel.g.Ei().DT() != null)
        {
          this.dgW = true;
          com.tencent.mm.kernel.g.Ek();
          n((String)com.tencent.mm.kernel.g.Ei().DT().get(278530, null), true);
        }
      }
      return;
    }
    finally {}
  }
  
  public final void n(String paramString, boolean paramBoolean)
  {
    b(bl.z(paramString, "sysmsg"), paramBoolean);
  }
  
  @Deprecated
  public final void put(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (paramString2 != null)) {}
    try
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.DynamicConfig", "put configs.put(key,value) %s %s", new Object[] { paramString1.trim(), paramString2 });
      this.dgV.put(paramString1, paramString2);
      return;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/k/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */