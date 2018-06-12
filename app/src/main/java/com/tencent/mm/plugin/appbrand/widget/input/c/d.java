package com.tencent.mm.plugin.appbrand.widget.input.c;

import com.tencent.mm.sdk.platformtools.bi;

public final class d
{
  public static Integer bu(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    if ((paramObject instanceof Integer)) {
      return (Integer)paramObject;
    }
    if ((paramObject instanceof Number)) {
      return Integer.valueOf(((Number)paramObject).intValue());
    }
    if ((paramObject instanceof String)) {
      try
      {
        int i = (int)Double.parseDouble((String)paramObject);
        return Integer.valueOf(i);
      }
      catch (NumberFormatException paramObject) {}
    }
    return null;
  }
  
  static <T extends Enum> T h(String paramString, Class<T> paramClass)
  {
    if (!paramClass.isEnum()) {
      i = 0;
    }
    Object[] arrayOfObject;
    while ((bi.oW(paramString)) || (paramString.length() > i))
    {
      return null;
      arrayOfObject = paramClass.getEnumConstants();
      int k = arrayOfObject.length;
      j = 0;
      i = 0;
      while (j < k)
      {
        i = Math.max(((Enum)arrayOfObject[j]).name().length(), i);
        j += 1;
      }
    }
    paramString = paramString.toUpperCase();
    paramClass = (Enum[])paramClass.getEnumConstants();
    int j = paramClass.length;
    int i = 0;
    while (i < j)
    {
      arrayOfObject = paramClass[i];
      if (paramString.equals(((Enum)arrayOfObject).name())) {
        return (Enum)arrayOfObject;
      }
      i += 1;
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/widget/input/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */