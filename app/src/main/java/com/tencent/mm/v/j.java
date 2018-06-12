package com.tencent.mm.v;

import com.eclipsesource.a.b;
import com.eclipsesource.a.h;
import java.util.List;
import junit.framework.Assert;

public final class j
  implements a
{
  private b dpi;
  
  public j()
  {
    this.dpi = new b();
  }
  
  j(b paramb)
  {
    Assert.assertNotNull(paramb);
    this.dpi = paramb;
  }
  
  public j(String paramString)
  {
    this.dpi = com.eclipsesource.a.a.U(paramString).hQ();
    if (this.dpi == null) {
      throw new f(String.format("JSONArray string(%s) parse error.", new Object[] { paramString }));
    }
  }
  
  public final a aB(Object paramObject)
  {
    i.a(this.dpi, paramObject);
    return this;
  }
  
  public final a aO(long paramLong)
  {
    this.dpi.l(paramLong);
    return this;
  }
  
  public final a bq(boolean paramBoolean)
  {
    this.dpi.ad(paramBoolean);
    return this;
  }
  
  public final Object get(int paramInt)
  {
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    h localh = this.dpi.bZ(paramInt);
    if (localh == null) {}
    do
    {
      return null;
      if (localh.isNumber()) {
        return localh.toString();
      }
      if (localh.isBoolean()) {
        return Boolean.valueOf(localh.hR());
      }
      if (localh.isArray()) {
        return new j(localh.hQ());
      }
      if (localh.isObject()) {
        return new k(localh.hV());
      }
    } while (!localh.isString());
    return localh.ie();
  }
  
  public final boolean getBoolean(int paramInt)
  {
    boolean bool = true;
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    h localh = this.dpi.bZ(paramInt);
    if (localh == null) {
      throw new f(String.format("getBoolean(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
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
      str = localh.ie();
    } while ("true".equals(str));
    if ("false".equals(str)) {
      return false;
    }
    throw new f(String.format("getBoolean(%d) error, value : %s.", new Object[] { Integer.valueOf(paramInt), localh }));
  }
  
  public final double getDouble(int paramInt)
  {
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    h localh = this.dpi.bZ(paramInt);
    if (localh == null) {
      throw new f(String.format("getDouble(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
    }
    try
    {
      if (localh.isNumber()) {
        return localh.hU();
      }
      if (localh.isString())
      {
        double d = Double.parseDouble(localh.ie());
        return d;
      }
    }
    catch (Exception localException)
    {
      throw new f(String.format("getDouble(%d) error, value : %s.", new Object[] { Integer.valueOf(paramInt), localh }));
    }
  }
  
  public final int getInt(int paramInt)
  {
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    h localh = this.dpi.bZ(paramInt);
    if (localh == null) {
      throw new f(String.format("getInteger(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
    }
    try
    {
      boolean bool = localh.isNumber();
      if (bool) {
        try
        {
          i = localh.hS();
          return i;
        }
        catch (Exception localException1)
        {
          return (int)localh.hU();
        }
      }
      if (localh.isString())
      {
        double d = Double.parseDouble(localh.ie());
        return (int)d;
      }
    }
    catch (Exception localException2)
    {
      throw new f(String.format("getInt(%d) error, value : %s.", new Object[] { Integer.valueOf(paramInt), localh }));
    }
  }
  
  public final long getLong(int paramInt)
  {
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    h localh = this.dpi.bZ(paramInt);
    if (localh == null) {
      throw new f(String.format("getLong(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
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
        double d = Double.parseDouble(localh.ie());
        return d;
      }
    }
    catch (Exception localException2)
    {
      throw new f(String.format("getLong(%d) error, value : %s.", new Object[] { Integer.valueOf(paramInt), localh }));
    }
  }
  
  public final String getString(int paramInt)
  {
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    h localh = this.dpi.bZ(paramInt);
    if (localh == null) {
      throw new f(String.format("getString(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
    }
    if (localh.isString()) {
      return localh.ie();
    }
    return localh.toString();
  }
  
  public final a gv(int paramInt)
  {
    this.dpi.bY(paramInt);
    return this;
  }
  
  public final a gw(int paramInt)
  {
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    h localh = this.dpi.bZ(paramInt);
    if (localh == null) {
      throw new f(String.format("getJSONArray(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
    }
    return new j(localh.hQ());
  }
  
  public final a gx(int paramInt)
  {
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {}
    h localh;
    do
    {
      return null;
      localh = this.dpi.bZ(paramInt);
    } while (localh == null);
    return new j(localh.hQ());
  }
  
  public final c gy(int paramInt)
  {
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {
      throw new f(String.format("index(%d) out of range(0, %d).", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    h localh = this.dpi.bZ(paramInt);
    if (localh == null) {
      throw new f(String.format("getJSONObject(%d) return null.", new Object[] { Integer.valueOf(paramInt) }));
    }
    return new k(localh.hV());
  }
  
  public final c gz(int paramInt)
  {
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {}
    h localh;
    do
    {
      return null;
      localh = this.dpi.bZ(paramInt);
    } while (localh == null);
    return new k(localh.hV());
  }
  
  public final boolean isNull(int paramInt)
  {
    return (paramInt < 0) || (paramInt >= length()) || (this.dpi.bZ(paramInt) == null);
  }
  
  public final int length()
  {
    return this.dpi.abz.size();
  }
  
  public final a o(double paramDouble)
  {
    this.dpi.m(paramDouble);
    return this;
  }
  
  public final Object opt(int paramInt)
  {
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {}
    h localh;
    do
    {
      do
      {
        return null;
        localh = this.dpi.bZ(paramInt);
      } while (localh == null);
      if (localh.isNumber()) {
        return localh.toString();
      }
      if (localh.isBoolean()) {
        return Boolean.valueOf(localh.hR());
      }
      if (localh.isArray()) {
        return new j(localh.hQ());
      }
      if (localh.isObject()) {
        return new k(localh.hV());
      }
    } while (!localh.isString());
    return localh.ie();
  }
  
  public final boolean optBoolean(int paramInt)
  {
    return optBoolean(paramInt, false);
  }
  
  public final boolean optBoolean(int paramInt, boolean paramBoolean)
  {
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {}
    Object localObject;
    do
    {
      do
      {
        do
        {
          return paramBoolean;
          localObject = this.dpi.bZ(paramInt);
        } while (localObject == null);
        if (((h)localObject).isBoolean()) {
          return ((h)localObject).hR();
        }
      } while (!((h)localObject).isString());
      localObject = ((h)localObject).ie();
      if ("true".equals(localObject)) {
        return true;
      }
    } while (!"false".equals(localObject));
    return false;
  }
  
  public final double optDouble(int paramInt)
  {
    return optDouble(paramInt, 0.0D);
  }
  
  public final double optDouble(int paramInt, double paramDouble)
  {
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {}
    for (;;)
    {
      return paramDouble;
      h localh = this.dpi.bZ(paramInt);
      if (localh != null) {
        try
        {
          if (localh.isNumber()) {
            return localh.hU();
          }
          if (localh.isString())
          {
            double d = Double.parseDouble(localh.ie());
            return d;
          }
        }
        catch (Exception localException) {}
      }
    }
    return paramDouble;
  }
  
  public final int optInt(int paramInt)
  {
    return optInt(paramInt, 0);
  }
  
  public final int optInt(int paramInt1, int paramInt2)
  {
    int i = length();
    if ((paramInt1 < 0) || (paramInt1 >= i)) {}
    for (;;)
    {
      return paramInt2;
      h localh = this.dpi.bZ(paramInt1);
      if (localh != null) {
        try
        {
          boolean bool = localh.isNumber();
          if (bool) {
            try
            {
              paramInt1 = localh.hS();
              return paramInt1;
            }
            catch (Exception localException2)
            {
              return (int)localh.hU();
            }
          }
          if (localh.isString())
          {
            double d = Double.parseDouble(localh.ie());
            return (int)d;
          }
        }
        catch (Exception localException1) {}
      }
    }
    return paramInt2;
  }
  
  public final long optLong(int paramInt)
  {
    return optLong(paramInt, 0L);
  }
  
  public final long optLong(int paramInt, long paramLong)
  {
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {}
    for (;;)
    {
      return paramLong;
      h localh = this.dpi.bZ(paramInt);
      if (localh != null) {
        try
        {
          boolean bool = localh.isNumber();
          if (bool) {
            try
            {
              long l = localh.hT();
              return l;
            }
            catch (Exception localException2)
            {
              return localh.hU();
            }
          }
          if (localh.isString())
          {
            double d = Double.parseDouble(localh.ie());
            return d;
          }
        }
        catch (Exception localException1) {}
      }
    }
    return paramLong;
  }
  
  public final String optString(int paramInt)
  {
    return optString(paramInt, null);
  }
  
  public final String optString(int paramInt, String paramString)
  {
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {}
    h localh;
    do
    {
      return paramString;
      localh = this.dpi.bZ(paramInt);
    } while (localh == null);
    if (localh.isString()) {
      return localh.ie();
    }
    return localh.toString();
  }
  
  public final Object remove(int paramInt)
  {
    int i = length();
    if ((paramInt < 0) || (paramInt >= i)) {}
    b localb;
    do
    {
      do
      {
        return null;
        localb = this.dpi;
        localb.abz.remove(paramInt);
      } while (localb == null);
      if (localb.isNumber()) {
        return localb.toString();
      }
      if (localb.isBoolean()) {
        return Boolean.valueOf(localb.hR());
      }
      if (localb.isArray()) {
        return new j(localb.hQ());
      }
      if (localb.isObject()) {
        return new k(localb.hV());
      }
    } while (!localb.isString());
    return localb.ie();
  }
  
  public final String toString()
  {
    return this.dpi.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/v/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */