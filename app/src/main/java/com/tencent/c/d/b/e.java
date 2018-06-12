package com.tencent.c.d.b;

import android.text.TextUtils;
import com.tencent.c.f.h;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class e
{
  public static Object a(Class<?> paramClass, String paramString, Object paramObject)
  {
    try
    {
      paramClass = c(paramClass, paramString);
      if (paramClass == null) {
        return null;
      }
      paramClass = paramClass.get(paramObject);
      return paramClass;
    }
    catch (Throwable paramClass)
    {
      h.k(paramClass);
    }
    return null;
  }
  
  public static Method a(String paramString1, String paramString2, Class<?>... paramVarArgs)
  {
    try
    {
      paramString1 = b(acs(paramString1), paramString2, paramVarArgs);
      return paramString1;
    }
    catch (Throwable paramString1)
    {
      h.k(paramString1);
    }
    return null;
  }
  
  private static Class<?> acs(String paramString)
  {
    try
    {
      paramString = Class.forName(paramString);
      if (paramString == null) {
        return null;
      }
    }
    catch (Throwable paramString)
    {
      try
      {
        h.k(paramString);
        paramString = null;
      }
      catch (Throwable paramString)
      {
        h.k(paramString);
      }
      return paramString;
    }
    return null;
  }
  
  private static Method b(Class<?> paramClass, String paramString, Class<?>... paramVarArgs)
  {
    if (paramClass != null) {
      try
      {
        if (TextUtils.isEmpty(paramString)) {
          return null;
        }
        paramClass = paramClass.getDeclaredMethod(paramString, paramVarArgs);
        if (paramClass != null)
        {
          paramClass.setAccessible(true);
          return paramClass;
        }
      }
      catch (Throwable paramClass)
      {
        h.k(paramClass);
      }
    }
    return null;
  }
  
  private static Field c(Class<?> paramClass, String paramString)
  {
    if (paramClass == null) {}
    for (;;)
    {
      return null;
      try
      {
        paramClass = paramClass.getDeclaredField(paramString);
        if (paramClass != null)
        {
          paramClass.setAccessible(true);
          return paramClass;
        }
      }
      catch (Throwable paramClass)
      {
        h.k(paramClass);
      }
    }
    return null;
  }
  
  public static Object gs(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = a(acs(paramString1), paramString2, null);
      return paramString1;
    }
    catch (Throwable paramString1)
    {
      h.k(paramString1);
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/c/d/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */