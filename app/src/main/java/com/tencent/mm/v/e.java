package com.tencent.mm.v;

import junit.framework.Assert;
import org.json.JSONArray;

public final class e
  extends JSONArray
  implements a
{
  private final a dpe;
  
  public e()
  {
    this.dpe = g.Dd();
  }
  
  e(a parama)
  {
    Assert.assertNotNull(parama);
    this.dpe = parama;
  }
  
  private e aC(Object paramObject)
  {
    this.dpe.aB(paramObject);
    return this;
  }
  
  private e aP(long paramLong)
  {
    this.dpe.aO(paramLong);
    return this;
  }
  
  private e br(boolean paramBoolean)
  {
    this.dpe.bq(paramBoolean);
    return this;
  }
  
  private e gA(int paramInt)
  {
    this.dpe.gv(paramInt);
    return this;
  }
  
  private e gB(int paramInt)
  {
    return new e(this.dpe.gw(paramInt));
  }
  
  private e gC(int paramInt)
  {
    return new e(this.dpe.gx(paramInt));
  }
  
  private h gD(int paramInt)
  {
    return new h(this.dpe.gy(paramInt));
  }
  
  private h gE(int paramInt)
  {
    return new h(this.dpe.gz(paramInt));
  }
  
  private e p(double paramDouble)
  {
    this.dpe.o(paramDouble);
    return this;
  }
  
  public final Object get(int paramInt)
  {
    return this.dpe.get(paramInt);
  }
  
  public final boolean getBoolean(int paramInt)
  {
    return this.dpe.getBoolean(paramInt);
  }
  
  public final double getDouble(int paramInt)
  {
    return this.dpe.getDouble(paramInt);
  }
  
  public final int getInt(int paramInt)
  {
    return this.dpe.getInt(paramInt);
  }
  
  public final long getLong(int paramInt)
  {
    return this.dpe.getLong(paramInt);
  }
  
  public final String getString(int paramInt)
  {
    return this.dpe.getString(paramInt);
  }
  
  public final boolean isNull(int paramInt)
  {
    return this.dpe.isNull(paramInt);
  }
  
  public final int length()
  {
    return this.dpe.length();
  }
  
  public final Object opt(int paramInt)
  {
    return this.dpe.opt(paramInt);
  }
  
  public final boolean optBoolean(int paramInt)
  {
    return this.dpe.optBoolean(paramInt);
  }
  
  public final boolean optBoolean(int paramInt, boolean paramBoolean)
  {
    return this.dpe.optBoolean(paramInt, paramBoolean);
  }
  
  public final double optDouble(int paramInt)
  {
    return this.dpe.optDouble(paramInt);
  }
  
  public final double optDouble(int paramInt, double paramDouble)
  {
    return this.dpe.optDouble(paramInt, paramDouble);
  }
  
  public final int optInt(int paramInt)
  {
    return this.dpe.optInt(paramInt);
  }
  
  public final int optInt(int paramInt1, int paramInt2)
  {
    return this.dpe.optInt(paramInt1, paramInt2);
  }
  
  public final long optLong(int paramInt)
  {
    return this.dpe.optLong(paramInt);
  }
  
  public final long optLong(int paramInt, long paramLong)
  {
    return this.dpe.optLong(paramInt, paramLong);
  }
  
  public final String optString(int paramInt)
  {
    return this.dpe.optString(paramInt);
  }
  
  public final String optString(int paramInt, String paramString)
  {
    return this.dpe.optString(paramInt, paramString);
  }
  
  public final Object remove(int paramInt)
  {
    return this.dpe.remove(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/v/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */