package com.tencent.mm.ipcinvoker.g;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public final class b
{
  public static <T> T b(Class<?> paramClass1, Class<?> paramClass2)
  {
    if (paramClass1 == null)
    {
      com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "newInstance failed, class is null or nil.", new Object[0]);
      return null;
    }
    if (paramClass2 == null)
    {
      com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "newInstance failed, parent class is null.", new Object[0]);
      return null;
    }
    try
    {
      if (!paramClass2.isAssignableFrom(paramClass1))
      {
        com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "%s isAssignableFrom %s return false", new Object[] { paramClass2, paramClass1 });
        return null;
      }
    }
    catch (IllegalAccessException paramClass1)
    {
      com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramClass1 });
      return null;
      paramClass1 = paramClass1.getDeclaredConstructor(new Class[0]);
      paramClass1.setAccessible(true);
      paramClass1 = paramClass1.newInstance(new Object[0]);
      return paramClass1;
    }
    catch (InstantiationException paramClass1)
    {
      com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramClass1 });
      return null;
    }
    catch (NoSuchMethodException paramClass1)
    {
      com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramClass1 });
      return null;
    }
    catch (InvocationTargetException paramClass1)
    {
      com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramClass1 });
    }
    return null;
  }
  
  public static <T> T e(String paramString, Class<?> paramClass)
  {
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "newInstance failed, class is null or nil.", new Object[0]);
      return null;
    }
    if (paramClass == null)
    {
      com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "newInstance failed, parent class is null.", new Object[0]);
      return null;
    }
    try
    {
      paramString = Class.forName(paramString);
      if (!paramClass.isAssignableFrom(paramString))
      {
        com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "%s isAssignableFrom %s return false", new Object[] { paramClass, paramString });
        return null;
      }
    }
    catch (ClassNotFoundException paramString)
    {
      com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramString });
      return null;
      paramString = paramString.getDeclaredConstructor(new Class[0]);
      paramString.setAccessible(true);
      paramString = paramString.newInstance(new Object[0]);
      return paramString;
    }
    catch (IllegalAccessException paramString)
    {
      com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramString });
      return null;
    }
    catch (InstantiationException paramString)
    {
      com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramString });
      return null;
    }
    catch (NoSuchMethodException paramString)
    {
      com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramString });
      return null;
    }
    catch (InvocationTargetException paramString)
    {
      com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramString });
    }
    return null;
  }
  
  public static <T> T i(Class<?> paramClass)
  {
    if (paramClass == null)
    {
      com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "newInstance failed, class is null or nil.", new Object[0]);
      return null;
    }
    try
    {
      paramClass = paramClass.getDeclaredConstructor(new Class[0]);
      paramClass.setAccessible(true);
      paramClass = paramClass.newInstance(new Object[0]);
      return paramClass;
    }
    catch (IllegalAccessException paramClass)
    {
      com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramClass });
      return null;
    }
    catch (InstantiationException paramClass)
    {
      com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramClass });
      return null;
    }
    catch (NoSuchMethodException paramClass)
    {
      com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramClass });
      return null;
    }
    catch (InvocationTargetException paramClass)
    {
      com.tencent.mm.ipcinvoker.h.b.e("IPC.ReflectUtil", "reflect error : %s", new Object[] { paramClass });
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ipcinvoker/g/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */