package com.tencent.mm.v;

import java.util.Iterator;
import java.util.Map;
import junit.framework.Assert;
import org.json.JSONObject;

public final class h
  extends JSONObject
  implements c
{
  private final c dph;
  
  public h()
  {
    this.dph = g.Dc();
  }
  
  public h(c paramc)
  {
    Assert.assertNotNull(paramc);
    this.dph = paramc;
  }
  
  public h(String paramString)
  {
    this.dph = g.fV(paramString);
  }
  
  public h(Map paramMap)
  {
    this.dph = g.n(paramMap);
  }
  
  private h E(String paramString, int paramInt)
  {
    this.dph.D(fP(paramString), paramInt);
    return this;
  }
  
  private h c(String paramString, double paramDouble)
  {
    this.dph.b(fP(paramString), paramDouble);
    return this;
  }
  
  private e fX(String paramString)
  {
    paramString = this.dph.fQ(paramString);
    if (paramString == null) {
      return null;
    }
    return new e(paramString);
  }
  
  private e fY(String paramString)
  {
    paramString = this.dph.fR(paramString);
    if (paramString == null) {
      return null;
    }
    return new e(paramString);
  }
  
  private h fZ(String paramString)
  {
    paramString = this.dph.fS(paramString);
    if (paramString == null) {
      return null;
    }
    return new h(paramString);
  }
  
  private h ga(String paramString)
  {
    paramString = this.dph.fT(paramString);
    if (paramString == null) {
      return null;
    }
    return new h(paramString);
  }
  
  private h k(String paramString, long paramLong)
  {
    this.dph.j(fP(paramString), paramLong);
    return this;
  }
  
  private h n(String paramString, Object paramObject)
  {
    this.dph.l(paramString, paramObject);
    return this;
  }
  
  private h o(String paramString, Object paramObject)
  {
    this.dph.m(paramString, paramObject);
    return this;
  }
  
  private h q(String paramString, boolean paramBoolean)
  {
    this.dph.p(paramString, paramBoolean);
    return this;
  }
  
  public final String fP(String paramString)
  {
    return this.dph.fP(paramString);
  }
  
  public final Object get(String paramString)
  {
    return this.dph.get(paramString);
  }
  
  public final boolean getBoolean(String paramString)
  {
    return this.dph.getBoolean(paramString);
  }
  
  public final double getDouble(String paramString)
  {
    return this.dph.getDouble(paramString);
  }
  
  public final int getInt(String paramString)
  {
    return this.dph.getInt(paramString);
  }
  
  public final long getLong(String paramString)
  {
    return this.dph.getLong(paramString);
  }
  
  public final String getString(String paramString)
  {
    return this.dph.getString(paramString);
  }
  
  public final boolean has(String paramString)
  {
    return this.dph.has(paramString);
  }
  
  public final boolean isNull(String paramString)
  {
    return this.dph.isNull(paramString);
  }
  
  public final Iterator<String> keys()
  {
    return this.dph.keys();
  }
  
  public final int length()
  {
    return this.dph.length();
  }
  
  public final Object opt(String paramString)
  {
    return this.dph.opt(paramString);
  }
  
  public final boolean optBoolean(String paramString)
  {
    return this.dph.optBoolean(paramString, false);
  }
  
  public final boolean optBoolean(String paramString, boolean paramBoolean)
  {
    return this.dph.optBoolean(paramString, paramBoolean);
  }
  
  public final double optDouble(String paramString)
  {
    return this.dph.optDouble(paramString, NaN.0D);
  }
  
  public final double optDouble(String paramString, double paramDouble)
  {
    return this.dph.optDouble(paramString, paramDouble);
  }
  
  public final int optInt(String paramString)
  {
    return this.dph.optInt(paramString, 0);
  }
  
  public final int optInt(String paramString, int paramInt)
  {
    return this.dph.optInt(paramString, paramInt);
  }
  
  public final long optLong(String paramString)
  {
    return this.dph.optLong(paramString, 0L);
  }
  
  public final long optLong(String paramString, long paramLong)
  {
    return this.dph.optLong(paramString, paramLong);
  }
  
  public final String optString(String paramString)
  {
    return this.dph.optString(paramString, "");
  }
  
  public final String optString(String paramString1, String paramString2)
  {
    return this.dph.optString(paramString1);
  }
  
  public final Object remove(String paramString)
  {
    return this.dph.remove(paramString);
  }
  
  public final String toString()
  {
    return this.dph.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/v/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */