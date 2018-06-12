package com.tencent.mm.k;

import android.view.ContextMenu.ContextMenuInfo;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class d
{
  public static final int[] dgR = { 1 };
  HashMap<String, HashMap<String, String>> dgS = new HashMap();
  public Map<String, String> dgT = null;
  private int id;
  int version;
  
  public d(int paramInt)
  {
    this.id = paramInt;
  }
  
  private static LinkedList<a> d(Map<String, String> paramMap, String paramString)
  {
    LinkedList localLinkedList = null;
    int i = 0;
    Object localObject2 = new StringBuilder().append(paramString);
    Object localObject1;
    if (i == 0)
    {
      localObject1 = "";
      label25:
      String str = localObject1;
      if (paramMap.get(str) == null) {
        break label202;
      }
      localObject1 = str + ".id";
      localObject2 = str + ".title";
      str = str + ".url";
      if (!paramMap.containsKey(localObject1)) {
        break label202;
      }
      localObject1 = new a((String)paramMap.get(localObject1), (String)paramMap.get(localObject2), (String)paramMap.get(str));
      if (localLinkedList != null) {
        break label204;
      }
      localLinkedList = new LinkedList();
    }
    label202:
    label204:
    for (;;)
    {
      localLinkedList.add(localObject1);
      i += 1;
      break;
      localObject1 = Integer.valueOf(i);
      break label25;
      return localLinkedList;
    }
  }
  
  static boolean fk(String paramString)
  {
    for (;;)
    {
      int i;
      try
      {
        if (bi.oW(paramString)) {
          return false;
        }
        Object localObject = new ArrayList();
        if (!bi.oW(paramString))
        {
          paramString = paramString.split(",");
          if ((paramString != null) && (paramString.length > 0))
          {
            i = 0;
            if (i < paramString.length)
            {
              if (bi.oW(paramString[i])) {
                break label237;
              }
              ((List)localObject).add(paramString[i]);
              break label237;
            }
          }
        }
        paramString = w.chP();
        if (bi.oW(paramString)) {
          return false;
        }
        x.d("MicroMsg.ConfigListInfo", "locale is " + paramString);
        localObject = ((List)localObject).iterator();
        if (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          if ((str.trim().toLowerCase().equals("other")) && (!paramString.equals("zh_CN")))
          {
            x.d("MicroMsg.ConfigListInfo", "find other");
            return true;
          }
          if (!str.trim().toLowerCase().equals(paramString.trim().toLowerCase())) {
            continue;
          }
          x.d("MicroMsg.ConfigListInfo", "find ");
          return true;
        }
      }
      catch (Exception paramString)
      {
        x.e("MicroMsg.ConfigListInfo", "exception:%s", new Object[] { bi.i(paramString) });
        x.d("MicroMsg.ConfigListInfo", "isContainLocale failed " + paramString.getMessage());
      }
      return false;
      label237:
      i += 1;
    }
  }
  
  public static LinkedList<a> j(Map<String, String> paramMap)
  {
    Object localObject1 = null;
    int i = 0;
    Object localObject3 = new StringBuilder(".ConfigList.Config");
    if (i == 0) {}
    for (Object localObject2 = "";; localObject2 = Integer.valueOf(i))
    {
      localObject3 = localObject2;
      localObject2 = localObject1;
      if (paramMap.get((String)localObject3 + ".$name") != null)
      {
        if (!((String)paramMap.get((String)localObject3 + ".$name")).equalsIgnoreCase("JDWebViewMenu")) {
          break label234;
        }
        localObject2 = d(paramMap, (String)localObject3 + ".menuItems.menuItem");
        localObject3 = d(paramMap, (String)localObject3 + ".menuItems.newMenuItem");
        if (localObject2 != null) {
          break;
        }
        localObject2 = localObject3;
      }
      return (LinkedList<a>)localObject2;
    }
    localObject1 = localObject2;
    if (localObject3 != null)
    {
      localObject1 = localObject2;
      if (((LinkedList)localObject3).size() > 0)
      {
        x.d("MicroMsg.ConfigListInfo", "has menuItem2, %s, %s", new Object[] { Integer.valueOf(((LinkedList)localObject2).size()), Integer.valueOf(((LinkedList)localObject3).size()) });
        ((LinkedList)localObject2).addAll((Collection)localObject3);
        localObject1 = localObject2;
      }
    }
    label234:
    for (;;)
    {
      i += 1;
      break;
    }
  }
  
  public static final class a
  {
    public String id;
    public String title;
    public String url;
    
    public a(String paramString1, String paramString2, String paramString3)
    {
      this.id = paramString1;
      this.title = paramString2;
      this.url = paramString3;
    }
  }
  
  public static final class b
    implements ContextMenu.ContextMenuInfo
  {
    private static int dgU = 10000;
    public final String aAL;
    public final int id;
    public final String title;
    
    public b(String paramString1, String paramString2)
    {
      int i = dgU;
      dgU = i + 1;
      this.id = i;
      this.aAL = paramString1;
      this.title = paramString2;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/k/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */