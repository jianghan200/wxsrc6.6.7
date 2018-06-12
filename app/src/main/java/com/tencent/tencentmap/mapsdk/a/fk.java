package com.tencent.tencentmap.mapsdk.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class fk
  extends gc
{
  private static Map c;
  public Map a = null;
  public long b = 0L;
  
  public final void a(ga paramga)
  {
    if (c == null)
    {
      c = new HashMap();
      ArrayList localArrayList = new ArrayList();
      localArrayList.add("");
      c.put(Integer.valueOf(0), localArrayList);
    }
    this.a = ((Map)paramga.a(c, 0, false));
    this.b = paramga.a(this.b, 1, false);
  }
  
  public final void a(gb paramgb)
  {
    if (this.a != null) {
      paramgb.a(this.a, 0);
    }
    paramgb.a(this.b, 1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/fk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */