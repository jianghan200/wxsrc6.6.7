package com.tencent.wework.api.util;

import java.lang.reflect.Constructor;

public final class ReflecterHelper
{
  public static Object newInstance(String paramString)
  {
    paramString = Class.forName(paramString).getDeclaredConstructor(null);
    paramString.setAccessible(true);
    return paramString.newInstance(null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/wework/api/util/ReflecterHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */