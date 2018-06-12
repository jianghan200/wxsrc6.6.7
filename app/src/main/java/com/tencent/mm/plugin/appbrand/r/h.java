package com.tencent.mm.plugin.appbrand.r;

public final class h
{
  public static Boolean bs(Object paramObject)
  {
    if ((paramObject instanceof Boolean)) {
      return (Boolean)paramObject;
    }
    if ((paramObject instanceof String))
    {
      paramObject = (String)paramObject;
      if ("true".equalsIgnoreCase((String)paramObject)) {
        return Boolean.valueOf(true);
      }
      if ("false".equalsIgnoreCase((String)paramObject)) {
        return Boolean.valueOf(false);
      }
    }
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/r/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */