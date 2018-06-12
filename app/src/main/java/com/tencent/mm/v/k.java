package com.tencent.mm.v;

import com.eclipsesource.a.e;
import com.eclipsesource.a.e.a;
import com.eclipsesource.a.h;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class k
  implements c
{
  private e dpj;
  
  public k()
  {
    this.dpj = new e();
  }
  
  k(e parame)
  {
    e locale = parame;
    if (parame == null) {
      locale = new e();
    }
    this.dpj = locale;
  }
  
  public k(String paramString)
  {
    this.dpj = com.eclipsesource.a.a.U(paramString).hV();
  }
  
  public k(Map paramMap)
  {
    this.dpj = i.o(paramMap);
  }
  
  public final c D(String paramString, int paramInt)
  {
    this.dpj.a(paramString, com.eclipsesource.a.a.bX(paramInt));
    return this;
  }
  
  public final c b(String paramString, double paramDouble)
  {
    this.dpj.a(paramString, com.eclipsesource.a.a.l(paramDouble));
    return this;
  }
  
  public final String fP(String paramString)
  {
    if (paramString == null) {
      throw new f("Names must be non-null");
    }
    return paramString;
  }
  
  public final a fQ(String paramString)
  {
    h localh = this.dpj.W(paramString);
    if (localh == null) {
      throw new f(String.format("key %s do not exist.", new Object[] { paramString }));
    }
    return new j(localh.hQ());
  }
  
  public final a fR(String paramString)
  {
    paramString = this.dpj.W(paramString);
    if (paramString == null) {
      return null;
    }
    return new j(paramString.hQ());
  }
  
  public final c fS(String paramString)
  {
    h localh = this.dpj.W(paramString);
    if (localh == null) {
      throw new f(String.format("key %s do not exist.", new Object[] { paramString }));
    }
    return new k(localh.hV());
  }
  
  public final c fT(String paramString)
  {
    paramString = this.dpj.W(paramString);
    if (paramString == null) {
      return null;
    }
    return new k(paramString.hV());
  }
  
  public final Object get(String paramString)
  {
    return opt(paramString);
  }
  
  public final boolean getBoolean(String paramString)
  {
    boolean bool = true;
    h localh = this.dpj.W(paramString);
    if (localh == null) {
      throw new f(String.format("key %s do not exist.", new Object[] { paramString }));
    }
    if (localh.isBoolean()) {
      bool = localh.hR();
    }
    String str;
    do
    {
      return bool;
      if (!localh.isString()) {
        break;
      }
      str = localh.toString();
    } while ("true".equals(str));
    if ("false".equals(str)) {
      return false;
    }
    throw new f(String.format("getBoolean by key : %s error, value : %s", new Object[] { paramString, localh }));
  }
  
  public final double getDouble(String paramString)
  {
    h localh = this.dpj.W(paramString);
    if (localh == null) {
      throw new f(String.format("key %s do not exist.", new Object[] { paramString }));
    }
    try
    {
      if (localh.isNumber()) {
        return localh.hU();
      }
      if (localh.isString())
      {
        double d = Double.parseDouble(localh.toString());
        return d;
      }
    }
    catch (Exception localException)
    {
      throw new f(String.format("getDouble by key : %s error, value : %s", new Object[] { paramString, localh }));
    }
  }
  
  public final int getInt(String paramString)
  {
    h localh = this.dpj.W(paramString);
    if (localh == null) {
      throw new f(String.format("key %s do not exist.", new Object[] { paramString }));
    }
    try
    {
      boolean bool = localh.isNumber();
      if (bool) {
        try
        {
          int i = localh.hS();
          return i;
        }
        catch (Exception localException1)
        {
          return (int)localh.hU();
        }
      }
      if (localh.isString())
      {
        double d = Double.parseDouble(localh.toString());
        return (int)d;
      }
    }
    catch (Exception localException2)
    {
      throw new f(String.format("getInt by key : %s error, value : %s", new Object[] { paramString, localh }));
    }
  }
  
  public final long getLong(String paramString)
  {
    h localh = this.dpj.W(paramString);
    if (localh == null) {
      throw new f(String.format("key %s do not exist.", new Object[] { paramString }));
    }
    try
    {
      boolean bool = localh.isNumber();
      if (bool) {
        try
        {
          long l = localh.hT();
          return l;
        }
        catch (Exception localException1)
        {
          return localh.hU();
        }
      }
      if (localh.isString())
      {
        double d = Double.parseDouble(localh.toString());
        return d;
      }
    }
    catch (Exception localException2)
    {
      throw new f(String.format("getLong by key : %s error, value : %s", new Object[] { paramString, localh }));
    }
  }
  
  public final String getString(String paramString)
  {
    h localh = this.dpj.W(paramString);
    if (localh == null) {
      throw new f(String.format("key %s do not exist.", new Object[] { paramString }));
    }
    if (localh.isString()) {
      return localh.ie();
    }
    return localh.toString();
  }
  
  public final boolean has(String paramString)
  {
    return this.dpj.W(paramString) != null;
  }
  
  public final boolean isNull(String paramString)
  {
    return this.dpj.W(paramString) == null;
  }
  
  public final c j(String paramString, long paramLong)
  {
    this.dpj.a(paramString, com.eclipsesource.a.a.k(paramLong));
    return this;
  }
  
  public final Iterator<String> keys()
  {
    return Collections.unmodifiableList(this.dpj.abF).iterator();
  }
  
  public final c l(String paramString, Object paramObject)
  {
    i.a(this.dpj, paramString, paramObject);
    return this;
  }
  
  public final int length()
  {
    return this.dpj.abF.size();
  }
  
  public final c m(String paramString, Object paramObject)
  {
    i.a(this.dpj, paramString, paramObject);
    return this;
  }
  
  public final Object opt(String paramString)
  {
    paramString = this.dpj.W(paramString);
    if (paramString == null) {}
    do
    {
      return null;
      if (paramString.isNumber()) {
        return paramString.toString();
      }
      if (paramString.isBoolean()) {
        return Boolean.valueOf(paramString.hR());
      }
      if (paramString.isArray()) {
        return new j(paramString.hQ());
      }
      if (paramString.isObject()) {
        return new k(paramString.hV());
      }
    } while (!paramString.isString());
    return paramString.ie();
  }
  
  public final boolean optBoolean(String paramString, boolean paramBoolean)
  {
    paramString = this.dpj.W(paramString);
    if (paramString == null) {}
    do
    {
      do
      {
        return paramBoolean;
        if (paramString.isBoolean()) {
          return paramString.hR();
        }
      } while (!paramString.isString());
      paramString = paramString.toString();
      if ("true".equals(paramString)) {
        return true;
      }
    } while (!"false".equals(paramString));
    return false;
  }
  
  public final double optDouble(String paramString, double paramDouble)
  {
    paramString = this.dpj.W(paramString);
    if (paramString == null) {}
    for (;;)
    {
      return paramDouble;
      try
      {
        if (paramString.isNumber()) {
          return paramString.hU();
        }
        if (paramString.isString())
        {
          double d = Double.parseDouble(paramString.toString());
          return d;
        }
      }
      catch (Exception paramString) {}
    }
    return paramDouble;
  }
  
  public final int optInt(String paramString, int paramInt)
  {
    paramString = this.dpj.W(paramString);
    if (paramString == null) {}
    for (;;)
    {
      return paramInt;
      try
      {
        boolean bool = paramString.isNumber();
        if (bool) {
          try
          {
            int i = paramString.hS();
            return i;
          }
          catch (Exception localException)
          {
            return (int)paramString.hU();
          }
        }
        if (paramString.isString())
        {
          double d = Double.parseDouble(paramString.toString());
          return (int)d;
        }
      }
      catch (Exception paramString) {}
    }
    return paramInt;
  }
  
  public final long optLong(String paramString, long paramLong)
  {
    paramString = this.dpj.W(paramString);
    if (paramString == null) {}
    for (;;)
    {
      return paramLong;
      try
      {
        boolean bool = paramString.isNumber();
        if (bool) {
          try
          {
            long l = paramString.hT();
            return l;
          }
          catch (Exception localException)
          {
            return paramString.hU();
          }
        }
        if (paramString.isString())
        {
          double d = Double.parseDouble(paramString.toString());
          return d;
        }
      }
      catch (Exception paramString) {}
    }
    return paramLong;
  }
  
  public final String optString(String paramString)
  {
    return optString(paramString, null);
  }
  
  public final String optString(String paramString1, String paramString2)
  {
    paramString1 = this.dpj.W(paramString1);
    if (paramString1 == null) {
      return null;
    }
    if (paramString1.isString()) {
      return paramString1.ie();
    }
    return paramString1.toString();
  }
  
  public final c p(String paramString, boolean paramBoolean)
  {
    this.dpj.a(paramString, com.eclipsesource.a.a.ac(paramBoolean));
    return this;
  }
  
  public final Object remove(String paramString)
  {
    e locale = this.dpj;
    if (paramString == null) {
      throw new NullPointerException("name is null");
    }
    int i = locale.indexOf(paramString);
    if (i != -1)
    {
      locale.abG.remove(i);
      locale.abF.remove(i);
      locale.abz.remove(i);
    }
    if (locale == null) {}
    do
    {
      return null;
      if (locale.isNumber()) {
        return locale.toString();
      }
      if (locale.isBoolean()) {
        return Boolean.valueOf(locale.hR());
      }
      if (locale.isArray()) {
        return new j(locale.hQ());
      }
      if (locale.isObject()) {
        return new k(locale.hV());
      }
    } while (!locale.isString());
    return locale.ie();
  }
  
  public final String toString()
  {
    return this.dpj.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/v/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */