package com.google.android.gms.c;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public abstract class af<T extends af>
{
  public static String ak(Object paramObject)
  {
    return n(paramObject, 0);
  }
  
  public static String c(Map paramMap)
  {
    return n(paramMap, 1);
  }
  
  static String n(Object paramObject, int paramInt)
  {
    if (paramInt > 10) {
      return "ERROR: Recursive toString calls";
    }
    if (paramObject == null) {
      return "";
    }
    if ((paramObject instanceof String))
    {
      if (TextUtils.isEmpty((String)paramObject)) {
        return "";
      }
      return paramObject.toString();
    }
    if ((paramObject instanceof Integer))
    {
      if (((Integer)paramObject).intValue() == 0) {
        return "";
      }
      return paramObject.toString();
    }
    if ((paramObject instanceof Long))
    {
      if (((Long)paramObject).longValue() == 0L) {
        return "";
      }
      return paramObject.toString();
    }
    if ((paramObject instanceof Double))
    {
      if (((Double)paramObject).doubleValue() == 0.0D) {
        return "";
      }
      return paramObject.toString();
    }
    if ((paramObject instanceof Boolean))
    {
      if (!((Boolean)paramObject).booleanValue()) {
        return "";
      }
      return paramObject.toString();
    }
    StringBuffer localStringBuffer;
    int i;
    Object localObject;
    if ((paramObject instanceof List))
    {
      localStringBuffer = new StringBuffer();
      if (paramInt > 0) {
        localStringBuffer.append("[");
      }
      paramObject = (List)paramObject;
      i = localStringBuffer.length();
      paramObject = ((List)paramObject).iterator();
      while (((Iterator)paramObject).hasNext())
      {
        localObject = ((Iterator)paramObject).next();
        if (localStringBuffer.length() > i) {
          localStringBuffer.append(", ");
        }
        localStringBuffer.append(n(localObject, paramInt + 1));
      }
      if (paramInt > 0) {
        localStringBuffer.append("]");
      }
      return localStringBuffer.toString();
    }
    if ((paramObject instanceof Map))
    {
      localStringBuffer = new StringBuffer();
      paramObject = new TreeMap((Map)paramObject).entrySet().iterator();
      int k = 0;
      i = 0;
      while (((Iterator)paramObject).hasNext())
      {
        localObject = (Map.Entry)((Iterator)paramObject).next();
        String str = n(((Map.Entry)localObject).getValue(), paramInt + 1);
        if (!TextUtils.isEmpty(str))
        {
          int m = k;
          int j = i;
          if (paramInt > 0)
          {
            m = k;
            j = i;
            if (i == 0)
            {
              localStringBuffer.append("{");
              j = 1;
              m = localStringBuffer.length();
            }
          }
          if (localStringBuffer.length() > m) {
            localStringBuffer.append(", ");
          }
          localStringBuffer.append((String)((Map.Entry)localObject).getKey());
          localStringBuffer.append('=');
          localStringBuffer.append(str);
          k = m;
          i = j;
        }
      }
      if (i != 0) {
        localStringBuffer.append("}");
      }
      return localStringBuffer.toString();
    }
    return paramObject.toString();
  }
  
  public abstract void a(T paramT);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/gms/c/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */