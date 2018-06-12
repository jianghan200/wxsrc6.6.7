package com.tencent.tencentmap.mapsdk.a;

import java.util.HashMap;
import java.util.Map;

public final class fm
  extends gc
{
  private static Map c;
  public Map a = null;
  public int b = 0;
  
  public final void a(ga paramga)
  {
    if (c == null)
    {
      c = new HashMap();
      c.put(Integer.valueOf(0), Byte.valueOf((byte)0));
    }
    this.a = ((Map)paramga.a(c, 0, true));
    this.b = paramga.a(this.b, 1, true);
  }
  
  public final void a(gb paramgb)
  {
    paramgb.a(this.a, 0);
    paramgb.a(this.b, 1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/fm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */