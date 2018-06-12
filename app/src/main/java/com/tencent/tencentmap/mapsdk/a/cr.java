package com.tencent.tencentmap.mapsdk.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class cr
  extends cx
{
  private static ArrayList<cs> e;
  private static Map<String, String> f;
  public ArrayList<cs> a = null;
  public int b = 0;
  public String c = "";
  public Map<String, String> d = null;
  
  public final void a(cv paramcv)
  {
    if (e == null)
    {
      e = new ArrayList();
      cs localcs = new cs();
      e.add(localcs);
    }
    this.a = ((ArrayList)paramcv.a(e, 0, true));
    this.b = paramcv.a(this.b, 1, true);
    this.c = paramcv.a(2, true);
    if (f == null)
    {
      f = new HashMap();
      f.put("", "");
    }
    this.d = ((Map)paramcv.a(f, 3, false));
  }
  
  public final void a(cw paramcw)
  {
    paramcw.a(this.a, 0);
    paramcw.a(this.b, 1);
    paramcw.a(this.c, 2);
    if (this.d != null) {
      paramcw.a(this.d, 3);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/cr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */