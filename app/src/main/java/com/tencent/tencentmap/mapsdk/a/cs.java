package com.tencent.tencentmap.mapsdk.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class cs
  extends cx
{
  private static Map<String, String> g;
  private static ArrayList<String> h;
  private static ArrayList<String> i;
  public byte a = 0;
  public byte b = 0;
  public String c = "";
  public Map<String, String> d = null;
  public ArrayList<String> e = null;
  public ArrayList<String> f = null;
  
  public final void a(cv paramcv)
  {
    this.a = paramcv.a(this.a, 0, true);
    this.b = paramcv.a(this.b, 1, true);
    this.c = paramcv.a(2, true);
    if (g == null)
    {
      g = new HashMap();
      g.put("", "");
    }
    this.d = ((Map)paramcv.a(g, 3, true));
    if (h == null)
    {
      h = new ArrayList();
      h.add("");
    }
    this.e = ((ArrayList)paramcv.a(h, 4, false));
    if (i == null)
    {
      i = new ArrayList();
      i.add("");
    }
    this.f = ((ArrayList)paramcv.a(i, 6, false));
  }
  
  public final void a(cw paramcw)
  {
    paramcw.a(this.a, 0);
    paramcw.a(this.b, 1);
    paramcw.a(this.c, 2);
    paramcw.a(this.d, 3);
    if (this.e != null) {
      paramcw.a(this.e, 4);
    }
    if (this.f != null) {
      paramcw.a(this.f, 6);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/cs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */