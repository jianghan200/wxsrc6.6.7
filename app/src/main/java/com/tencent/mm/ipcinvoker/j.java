package com.tencent.mm.ipcinvoker;

import com.tencent.mm.ipcinvoker.c.a;
import com.tencent.mm.ipcinvoker.extension.e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class j
{
  private static final Map<String, e> dmH = new ConcurrentHashMap();
  
  public static <T> T a(Class<?> paramClass1, Class<?> paramClass2)
  {
    try
    {
      if (!paramClass2.isAssignableFrom(paramClass1))
      {
        com.tencent.mm.ipcinvoker.h.b.e("IPC.ObjectStore", "%s isAssignableFrom %s return false", new Object[] { paramClass2, paramClass1 });
        return null;
      }
      if (paramClass1.isAnnotationPresent(a.class))
      {
        String str = paramClass1.getName();
        e locale = (e)dmH.get(str);
        paramClass2 = locale;
        if (locale == null)
        {
          paramClass2 = new e(paramClass1);
          dmH.put(str, paramClass2);
        }
        return (T)paramClass2.get();
      }
      paramClass1 = com.tencent.mm.ipcinvoker.g.b.b(paramClass1, paramClass2);
      return paramClass1;
    }
    catch (Exception paramClass1) {}
    return null;
  }
  
  public static <T> T d(String paramString, Class<?> paramClass)
  {
    try
    {
      Class localClass = Class.forName(paramString);
      if (!paramClass.isAssignableFrom(localClass))
      {
        com.tencent.mm.ipcinvoker.h.b.e("IPC.ObjectStore", "%s isAssignableFrom %s return false", new Object[] { paramClass, localClass });
        return null;
      }
      if (localClass.isAnnotationPresent(a.class))
      {
        e locale = (e)dmH.get(paramString);
        paramClass = locale;
        if (locale == null)
        {
          paramClass = new e(localClass);
          dmH.put(paramString, paramClass);
        }
        return (T)paramClass.get();
      }
      paramString = com.tencent.mm.ipcinvoker.g.b.e(paramString, paramClass);
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
  
  public static <T> T e(String paramString, Class<?> paramClass)
  {
    return (T)com.tencent.mm.ipcinvoker.g.b.e(paramString, paramClass);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ipcinvoker/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */