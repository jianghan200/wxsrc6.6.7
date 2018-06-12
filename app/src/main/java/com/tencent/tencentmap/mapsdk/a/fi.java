package com.tencent.tencentmap.mapsdk.a;

import java.util.HashMap;
import java.util.Map;

public final class fi
  extends gc
{
  private static Map h;
  private static fk i;
  private static fg j;
  private static Map k;
  private static Map l;
  public Map a = null;
  public fk b = null;
  public fg c = null;
  private String d = "";
  private int e = 0;
  private Map f = null;
  private Map g = null;
  
  public final void a(ga paramga)
  {
    this.d = paramga.a(0, true);
    this.e = paramga.a(this.e, 1, true);
    Object localObject;
    if (h == null)
    {
      h = new HashMap();
      localObject = new fj();
      h.put("", localObject);
    }
    this.a = ((Map)paramga.a(h, 2, true));
    if (i == null) {
      i = new fk();
    }
    this.b = ((fk)paramga.a(i, 3, false));
    if (j == null) {
      j = new fg();
    }
    this.c = ((fg)paramga.a(j, 4, false));
    if (k == null)
    {
      k = new HashMap();
      k.put("", "");
    }
    this.f = ((Map)paramga.a(k, 5, false));
    if (l == null)
    {
      l = new HashMap();
      localObject = (byte[])new byte[1];
      ((byte[])localObject)[0] = 0;
      l.put("", localObject);
    }
    this.g = ((Map)paramga.a(l, 6, false));
  }
  
  public final void a(gb paramgb)
  {
    paramgb.a(this.d, 0);
    paramgb.a(this.e, 1);
    paramgb.a(this.a, 2);
    if (this.b != null) {
      paramgb.a(this.b, 3);
    }
    if (this.c != null) {
      paramgb.a(this.c, 4);
    }
    if (this.f != null) {
      paramgb.a(this.f, 5);
    }
    if (this.g != null) {
      paramgb.a(this.g, 6);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/fi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */