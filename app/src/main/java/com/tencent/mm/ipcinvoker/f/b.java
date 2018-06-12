package com.tencent.mm.ipcinvoker.f;

import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b
{
  private static final Map<String, Set<c>> dmH = new HashMap();
  private static final Set<Object> dnf = new HashSet();
  
  public static boolean a(String paramString, c paramc)
  {
    if ((paramString == null) || (paramString.length() == 0) || (paramc == null)) {
      return false;
    }
    for (;;)
    {
      synchronized (dmH)
      {
        Object localObject = (Set)dmH.get(paramString);
        if (localObject == null)
        {
          localObject = new HashSet();
          dmH.put(paramString, localObject);
          x.i("IPC.ObjectRecycler", "addIntoSet(%s)", new Object[] { paramString });
          try
          {
            boolean bool = ((Set)localObject).add(paramc);
            return bool;
          }
          finally {}
        }
      }
    }
  }
  
  public static void ay(Object paramObject)
  {
    dnf.add(paramObject);
  }
  
  public static void az(Object paramObject)
  {
    dnf.remove(paramObject);
  }
  
  public static boolean b(String paramString, c paramc)
  {
    if ((paramString == null) || (paramString.length() == 0) || (paramc == null)) {
      return false;
    }
    Set localSet;
    synchronized (dmH)
    {
      localSet = (Set)dmH.get(paramString);
      if (localSet == null) {
        return false;
      }
    }
    x.i("IPC.ObjectRecycler", "removeFromSet(%s)", new Object[] { paramString });
    try
    {
      boolean bool = localSet.remove(paramc);
      return bool;
    }
    finally {}
  }
  
  public static void fI(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {}
    Set localSet;
    for (;;)
    {
      return;
      synchronized (dmH)
      {
        localSet = (Set)dmH.remove(paramString);
        if (localSet != null)
        {
          x.i("IPC.ObjectRecycler", "recycleAll(%s)", new Object[] { paramString });
          try
          {
            paramString = localSet.iterator();
            while (paramString.hasNext())
            {
              ??? = (c)paramString.next();
              x.i("IPC.ObjectRecycler", "recycle(%s)", new Object[] { Integer.valueOf(???.hashCode()) });
              ((c)???).recycle();
              continue;
              paramString = finally;
            }
          }
          finally {}
        }
      }
    }
    localSet.clear();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ipcinvoker/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */