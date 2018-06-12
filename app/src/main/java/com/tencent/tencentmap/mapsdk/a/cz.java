package com.tencent.tencentmap.mapsdk.a;

import java.util.HashMap;
import java.util.Map;

public final class cz
  extends cx
{
  private static byte[] k = null;
  private static Map<String, String> l = null;
  public short a = 3;
  public int b = 0;
  public String c = null;
  public String d = null;
  public byte[] e;
  private byte f = 0;
  private int g = 0;
  private int h = 0;
  private Map<String, String> i;
  private Map<String, String> j;
  
  public final void a(cv paramcv)
  {
    try
    {
      this.a = paramcv.a(this.a, 1, true);
      this.f = paramcv.a(this.f, 2, true);
      this.g = paramcv.a(this.g, 3, true);
      this.b = paramcv.a(this.b, 4, true);
      this.c = paramcv.a(5, true);
      this.d = paramcv.a(6, true);
      if (k == null) {
        k = new byte[] { 0 };
      }
      this.e = ((byte[])paramcv.b(7, true));
      this.h = paramcv.a(this.h, 8, true);
      HashMap localHashMap;
      if (l == null)
      {
        localHashMap = new HashMap();
        l = localHashMap;
        localHashMap.put("", "");
      }
      this.i = ((Map)paramcv.a(l, 9, true));
      if (l == null)
      {
        localHashMap = new HashMap();
        l = localHashMap;
        localHashMap.put("", "");
      }
      this.j = ((Map)paramcv.a(l, 10, true));
      return;
    }
    catch (Exception paramcv)
    {
      throw new RuntimeException(paramcv);
    }
  }
  
  public final void a(cw paramcw)
  {
    paramcw.a(this.a, 1);
    paramcw.a(this.f, 2);
    paramcw.a(this.g, 3);
    paramcw.a(this.b, 4);
    paramcw.a(this.c, 5);
    paramcw.a(this.d, 6);
    paramcw.a(this.e, 7);
    paramcw.a(this.h, 8);
    paramcw.a(this.i, 9);
    paramcw.a(this.j, 10);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/cz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */