package com.tencent.mm.plugin.scanner.a;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class k
{
  public static boolean a(a.a parama)
  {
    return !bi.oW(parama.aAL);
  }
  
  public static boolean b(List<a> paramList, Map<String, a.a> paramMap)
  {
    boolean bool2;
    if ((paramMap == null) || (paramMap.size() <= 0) || (paramList == null))
    {
      bool2 = false;
      return bool2;
    }
    int i = 0;
    for (boolean bool1 = false;; bool1 = bool2)
    {
      bool2 = bool1;
      if (i >= paramList.size()) {
        break;
      }
      bool2 = bool1;
      if (paramList.get(i) != null)
      {
        LinkedList localLinkedList = ((a)paramList.get(i)).egs;
        int j = 0;
        bool2 = false;
        if (j < localLinkedList.size())
        {
          a.a locala1 = (a.a)localLinkedList.get(j);
          if (a(locala1))
          {
            a.a locala2 = (a.a)paramMap.get(locala1.aAL);
            if (locala2 != null)
            {
              x.i("MicroMsg.ProductUpdateLogic", "Updating action , info: key=" + locala1.aAL);
              localLinkedList.remove(j);
              localLinkedList.add(j, locala2);
              bool2 = true;
              bool1 = true;
            }
          }
          for (;;)
          {
            j += 1;
            break;
            bool2 = true;
          }
        }
        ((a)paramList.get(i)).mFs = bool2;
        bool2 = bool1;
      }
      i += 1;
    }
  }
  
  public static LinkedList<String> bY(List<a> paramList)
  {
    LinkedList localLinkedList1 = new LinkedList();
    int i = 0;
    while (i < paramList.size())
    {
      LinkedList localLinkedList2 = ((a)paramList.get(i)).egs;
      int j = 0;
      while (j < localLinkedList2.size())
      {
        a.a locala = (a.a)localLinkedList2.get(j);
        if (a(locala)) {
          localLinkedList1.add(locala.aAL);
        }
        j += 1;
      }
      i += 1;
    }
    return localLinkedList1;
  }
  
  public static Map<String, a.a> bZ(List<String> paramList)
  {
    HashMap localHashMap = new HashMap();
    int i = 0;
    while (i < paramList.size())
    {
      Object localObject = (String)paramList.get(i);
      x.d("MicroMsg.ProductUpdateLogic", "toUpdateXmlList info: i=" + i + ";" + bi.oV((String)localObject));
      localObject = a.n(bl.z((String)localObject, "action"), ".action");
      if ((localObject != null) && (((a.a)localObject).showType != 2)) {
        localHashMap.put(((a.a)localObject).aAL, localObject);
      }
      i += 1;
    }
    return localHashMap;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/scanner/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */