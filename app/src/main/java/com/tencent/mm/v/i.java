package com.tencent.mm.v;

import com.eclipsesource.a.b;
import com.eclipsesource.a.e;
import com.eclipsesource.a.h;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class i
{
  private static b a(a parama)
  {
    localb = new b();
    if (parama == null) {}
    for (;;)
    {
      return localb;
      int i = 0;
      try
      {
        while (i < parama.length())
        {
          a(localb, parama.get(i));
          i += 1;
        }
        return localb;
      }
      catch (f parama) {}
    }
  }
  
  private static e a(c paramc)
  {
    locale = new e();
    if (paramc == null) {
      return locale;
    }
    try
    {
      Iterator localIterator = paramc.keys();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        a(locale, str, paramc.get(str));
      }
      return locale;
    }
    catch (f paramc) {}
  }
  
  protected static void a(b paramb, Object paramObject)
  {
    if ((paramObject instanceof c)) {
      paramb.a(a((c)paramObject));
    }
    do
    {
      return;
      if ((paramObject instanceof a))
      {
        paramb.a(a((a)paramObject));
        return;
      }
      if ((paramObject instanceof Integer))
      {
        paramb.bY(((Integer)paramObject).intValue());
        return;
      }
      if ((paramObject instanceof String))
      {
        paramObject = (String)paramObject;
        paramb.abz.add(com.eclipsesource.a.a.T((String)paramObject));
        return;
      }
      if ((paramObject instanceof Boolean))
      {
        paramb.ad(((Boolean)paramObject).booleanValue());
        return;
      }
      if ((paramObject instanceof Long))
      {
        paramb.l(((Long)paramObject).longValue());
        return;
      }
      if ((paramObject instanceof Float))
      {
        float f = ((Float)paramObject).floatValue();
        paramb.abz.add(com.eclipsesource.a.a.R(f));
        return;
      }
      if ((paramObject instanceof Integer))
      {
        paramb.bY(((Integer)paramObject).intValue());
        return;
      }
      if ((paramObject instanceof Double))
      {
        paramb.m(((Double)paramObject).doubleValue());
        return;
      }
    } while (!(paramObject instanceof h));
    paramb.a((h)paramObject);
  }
  
  protected static void a(e parame, String paramString, Object paramObject)
  {
    if ((paramObject instanceof c)) {
      parame.b(paramString, a((c)paramObject));
    }
    do
    {
      return;
      if ((paramObject instanceof a))
      {
        parame.b(paramString, a((a)paramObject));
        return;
      }
      if ((paramObject instanceof Integer))
      {
        parame.g(paramString, ((Integer)paramObject).intValue());
        return;
      }
      if ((paramObject instanceof String))
      {
        parame.b(paramString, com.eclipsesource.a.a.T((String)paramObject));
        return;
      }
      if ((paramObject instanceof Boolean))
      {
        parame.b(paramString, com.eclipsesource.a.a.ac(((Boolean)paramObject).booleanValue()));
        return;
      }
      if ((paramObject instanceof Long))
      {
        parame.b(paramString, com.eclipsesource.a.a.k(((Long)paramObject).longValue()));
        return;
      }
      if ((paramObject instanceof Float))
      {
        parame.b(paramString, com.eclipsesource.a.a.R(((Float)paramObject).floatValue()));
        return;
      }
      if ((paramObject instanceof Integer))
      {
        parame.g(paramString, ((Integer)paramObject).intValue());
        return;
      }
      if ((paramObject instanceof Double))
      {
        parame.b(paramString, com.eclipsesource.a.a.l(((Double)paramObject).doubleValue()));
        return;
      }
    } while (!(paramObject instanceof h));
    parame.b(paramString, (h)paramObject);
  }
  
  public static e o(Map paramMap)
  {
    e locale = new e();
    if ((paramMap == null) || (paramMap.isEmpty())) {
      return locale;
    }
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = localIterator.next();
      Object localObject2 = paramMap.get(localObject1);
      a(locale, (String)localObject1, localObject2);
    }
    return locale;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/v/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */