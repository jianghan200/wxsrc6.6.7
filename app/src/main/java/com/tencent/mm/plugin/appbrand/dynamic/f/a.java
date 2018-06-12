package com.tencent.mm.plugin.appbrand.dynamic.f;

public class a
{
  private static volatile com.tencent.mm.u.c.g fwP;
  private static volatile com.tencent.mm.u.c.g fwQ;
  
  private static com.tencent.mm.u.c.g afm()
  {
    if (fwP == null) {}
    try
    {
      if (fwP == null)
      {
        com.tencent.mm.u.c.g localg = new com.tencent.mm.u.c.g();
        localg.a(new b(302));
        localg.a(new c(303));
        localg.a(new d(308));
        localg.a(new f());
        localg.a(new g());
        fwP = localg;
      }
      return fwP;
    }
    finally {}
  }
  
  private static com.tencent.mm.u.c.g afn()
  {
    if (fwQ == null) {}
    try
    {
      if (fwQ == null)
      {
        com.tencent.mm.u.c.g localg = new com.tencent.mm.u.c.g();
        localg.a(new b(262));
        localg.a(new c(263));
        localg.a(new d(268));
        localg.a(new f());
        localg.a(new g());
        localg.a(new e((byte)0));
        fwQ = localg;
      }
      return fwQ;
    }
    finally {}
  }
  
  public static com.tencent.mm.u.c.g kd(int paramInt)
  {
    if (paramInt == 1) {
      return afn();
    }
    return afm();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */