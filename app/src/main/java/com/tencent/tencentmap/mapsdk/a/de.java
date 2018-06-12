package com.tencent.tencentmap.mapsdk.a;

import java.util.HashMap;
import java.util.Map;

public final class de
{
  public String a;
  public boolean b;
  public long c;
  public long d;
  public Map<String, String> e;
  boolean f;
  
  public de(String paramString, boolean paramBoolean1, long paramLong1, long paramLong2, Map<String, String> paramMap, boolean paramBoolean2)
  {
    this.a = paramString;
    this.b = paramBoolean1;
    this.c = paramLong1;
    this.d = paramLong2;
    if (paramMap != null)
    {
      this.e = new HashMap();
      this.e.putAll(paramMap);
    }
    this.f = paramBoolean2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/de.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */