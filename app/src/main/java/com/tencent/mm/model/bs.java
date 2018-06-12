package com.tencent.mm.model;

import com.tencent.mm.compatible.util.k;

@Deprecated
public class bs
{
  static
  {
    k.b("txmapengine", bs.class.getClassLoader());
  }
  
  public static ar iK(String paramString)
  {
    paramString = p.gP(paramString);
    if (paramString == null) {
      return null;
    }
    return paramString.GC();
  }
  
  public final boolean a(String paramString, ar paramar)
  {
    try
    {
      p localp2 = p.gP(paramString);
      p localp1 = localp2;
      if (localp2 == null) {
        localp1 = p.a(paramString, new p(paramar.getClass()));
      }
      localp1.a(paramar);
      return true;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/model/bs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */