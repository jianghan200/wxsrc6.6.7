package com.tencent.mm.plugin.exdevice.service;

import com.tencent.mm.plugin.exdevice.model.c;

public final class u
{
  private static u iyO = null;
  private c iyP;
  private f iyQ;
  
  public static void a(m paramm)
  {
    aHG().isY = paramm;
  }
  
  private static u aHE()
  {
    if (iyO == null) {
      iyO = new u();
    }
    return iyO;
  }
  
  public static f aHF()
  {
    if (aHE().iyQ == null) {
      aHE().iyQ = new f();
    }
    return aHE().iyQ;
  }
  
  public static c aHG()
  {
    if (aHE().iyP == null)
    {
      u localu = aHE();
      if (c.isX == null) {
        c.isX = new c();
      }
      localu.iyP = c.isX;
    }
    return aHE().iyP;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/exdevice/service/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */