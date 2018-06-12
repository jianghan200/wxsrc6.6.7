package com.tencent.tencentmap.mapsdk.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class fj
  extends gc
{
  private static ArrayList e;
  private static Map f;
  public ArrayList a = null;
  public String b = "";
  private int c = 0;
  private Map d = null;
  
  public final void a(ga paramga)
  {
    this.c = paramga.a(this.c, 0, true);
    if (e == null)
    {
      e = new ArrayList();
      e.add("");
    }
    this.a = ((ArrayList)paramga.a(e, 1, true));
    this.b = paramga.a(2, false);
    if (f == null)
    {
      f = new HashMap();
      f.put("", "");
    }
    this.d = ((Map)paramga.a(f, 3, false));
  }
  
  public final void a(gb paramgb)
  {
    paramgb.a(this.c, 0);
    paramgb.a(this.a, 1);
    if (this.b != null) {
      paramgb.a(this.b, 2);
    }
    if (this.d != null) {
      paramgb.a(this.d, 3);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/fj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */