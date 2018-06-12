package com.tencent.tencentmap.mapsdk.a;

import java.util.HashMap;
import java.util.Map;

public final class ge
  extends gc
{
  private static byte[] k = null;
  private static Map l = null;
  public short a = 3;
  public int b = 0;
  public String c = null;
  public String d = null;
  public byte[] e;
  private byte f = 0;
  private int g = 0;
  private int h = 0;
  private Map i;
  private Map j;
  
  public final void a(ga paramga)
  {
    try
    {
      this.a = paramga.a(this.a, 1, true);
      this.f = paramga.a(this.f, 2, true);
      this.g = paramga.a(this.g, 3, true);
      this.b = paramga.a(this.b, 4, true);
      this.c = paramga.a(5, true);
      this.d = paramga.a(6, true);
      if (k == null) {
        k = new byte[] { 0 };
      }
      this.e = ((byte[])paramga.b(7, true));
      this.h = paramga.a(this.h, 8, true);
      HashMap localHashMap;
      if (l == null)
      {
        localHashMap = new HashMap();
        l = localHashMap;
        localHashMap.put("", "");
      }
      this.i = ((Map)paramga.a(l, 9, true));
      if (l == null)
      {
        localHashMap = new HashMap();
        l = localHashMap;
        localHashMap.put("", "");
      }
      this.j = ((Map)paramga.a(l, 10, true));
      return;
    }
    catch (Exception paramga)
    {
      throw new RuntimeException(paramga);
    }
  }
  
  public final void a(gb paramgb)
  {
    paramgb.a(this.a, 1);
    paramgb.a(this.f, 2);
    paramgb.a(this.g, 3);
    paramgb.a(this.b, 4);
    paramgb.a(this.c, 5);
    paramgb.a(this.d, 6);
    paramgb.a(this.e, 7);
    paramgb.a(this.h, 8);
    paramgb.a(this.i, 9);
    paramgb.a(this.j, 10);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/ge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */