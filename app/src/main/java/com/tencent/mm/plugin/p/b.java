package com.tencent.mm.plugin.p;

import com.tencent.mm.ak.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.p;
import com.tencent.mm.storage.bc;

public final class b
  extends p
{
  private static b knx;
  
  private b()
  {
    super(o.class);
  }
  
  public static bc FY()
  {
    g.Eg().Ds();
    return ((com.tencent.mm.plugin.t.a.a)g.l(com.tencent.mm.plugin.t.a.a.class)).FY();
  }
  
  public static b aWB()
  {
    try
    {
      if (knx == null) {
        knx = new b();
      }
      b localb = knx;
      return localb;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/p/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */