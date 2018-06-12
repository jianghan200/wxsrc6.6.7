package com.tencent.mm.plugin.appbrand.dynamic.debugger;

import com.tencent.mm.modelappbrand.j.a;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class b
{
  private static final Map<String, List<j.a>> dmH = new ConcurrentHashMap();
  private static final Map<String, DebuggerInfo> fvH = new ConcurrentHashMap();
  
  public static void C(String paramString, int paramInt)
  {
    if (bi.oW(paramString)) {}
    for (;;)
    {
      return;
      paramString = (List)dmH.get(paramString);
      if (paramString != null)
      {
        paramString = new LinkedList(paramString).iterator();
        while (paramString.hasNext()) {
          ((j.a)paramString.next()).hp(paramInt);
        }
      }
    }
  }
  
  public static void a(String paramString, DebuggerInfo paramDebuggerInfo)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return;
    }
    fvH.put(paramString, paramDebuggerInfo);
  }
  
  public static boolean c(String paramString, j.a parama)
  {
    if ((bi.oW(paramString)) || (parama == null)) {
      return false;
    }
    Object localObject = (List)dmH.get(paramString);
    if (localObject == null)
    {
      localObject = new LinkedList();
      dmH.put(paramString, localObject);
      paramString = (String)localObject;
    }
    do
    {
      return paramString.add(parama);
      paramString = (String)localObject;
    } while (!((List)localObject).contains(parama));
    return true;
  }
  
  public static boolean d(String paramString, j.a parama)
  {
    if ((bi.oW(paramString)) || (parama == null)) {
      return false;
    }
    List localList = (List)dmH.get(paramString);
    if (localList == null) {
      return false;
    }
    boolean bool = localList.remove(parama);
    if (localList.isEmpty()) {
      dmH.remove(paramString);
    }
    return bool;
  }
  
  public static DebuggerInfo sD(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return null;
    }
    return (DebuggerInfo)fvH.get(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/debugger/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */