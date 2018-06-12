package com.tencent.mm.model;

public final class ca
{
  public static boolean aW(Object paramObject)
  {
    if ((paramObject instanceof Boolean)) {
      try
      {
        boolean bool = ((Boolean)paramObject).booleanValue();
        return bool;
      }
      catch (Exception paramObject) {}
    }
    return false;
  }
  
  public static String f(Object paramObject, String paramString)
  {
    if ((paramObject instanceof String)) {
      try
      {
        paramObject = (String)paramObject;
        return (String)paramObject;
      }
      catch (Exception paramObject) {}
    }
    return paramString;
  }
  
  public static int getInt(Object paramObject, int paramInt)
  {
    int i = paramInt;
    if ((paramObject instanceof Integer)) {}
    try
    {
      i = ((Integer)paramObject).intValue();
      return i;
    }
    catch (Exception paramObject) {}
    return paramInt;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/model/ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */