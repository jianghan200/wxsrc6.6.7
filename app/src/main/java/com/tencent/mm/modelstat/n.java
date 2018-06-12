package com.tencent.mm.modelstat;

import com.tencent.mm.network.ab;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.x;

public final class n
{
  static {}
  
  public static void A(int paramInt1, int paramInt2, int paramInt3)
  {
    k localk = new k();
    localk.ejV = paramInt1;
    localk.ekh = paramInt2;
    localk.bWA = 4195328;
    c(localk);
    a(localk, paramInt3);
    q.Sj().a(localk);
  }
  
  private static void a(k paramk, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 522: 
      paramk.eka = (paramk.ekh + paramk.eki);
      paramk.bWA |= 0x8000;
      return;
    case 138: 
    case 139: 
      paramk.ejO = (paramk.ejV + paramk.ejW);
      paramk.bWA |= 0x8;
      return;
    case 110: 
      paramk.ekc = (paramk.ekh + paramk.eki);
      paramk.bWA |= 0x20000;
      return;
    case 109: 
    case 123: 
      paramk.ejQ = (paramk.ejV + paramk.ejW);
      paramk.bWA |= 0x20;
      return;
    case 127: 
      paramk.eke = (paramk.ekh + paramk.eki);
      paramk.bWA |= 0x80000;
      return;
    case 128: 
      paramk.ejS = (paramk.ejV + paramk.ejW);
      paramk.bWA |= 0x80;
      return;
    case 149: 
      paramk.ekg = (paramk.ekh + paramk.eki);
      paramk.bWA |= 0x200000;
      return;
    }
    paramk.ejU = (paramk.ejV + paramk.ejW);
    paramk.bWA |= 0x200;
  }
  
  public static void aY(int paramInt1, int paramInt2)
  {
    if (ab.bU(ad.getContext()))
    {
      x.i("MicroMsg.NetStatStorageLogic", "dknetflow wifi recv:%d send:%d type:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0) });
      z(paramInt1, paramInt2, 0);
      return;
    }
    x.i("MicroMsg.NetStatStorageLogic", "dknetflow mobile recv:%d send:%d type:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(0) });
    A(paramInt1, paramInt2, 0);
  }
  
  private static void c(k paramk)
  {
    bh.update();
    paramk.ejX = ((int)bh.ciQ());
    paramk.ekj = ((int)bh.ciP());
    paramk.ejY = ((int)bh.ciO());
    paramk.ekk = ((int)bh.ciN());
    paramk.ekl = ((int)bh.ciU());
    paramk.ekn = ((int)bh.ciT());
    paramk.ekm = ((int)bh.ciS());
    paramk.eko = ((int)bh.ciR());
    paramk.bWA = (paramk.bWA | 0x2000 | 0x2000000 | 0x1000 | 0x1000000 | 0x8000000 | 0x20000000 | 0x4000000 | 0x10000000);
  }
  
  public static void z(int paramInt1, int paramInt2, int paramInt3)
  {
    k localk = new k();
    localk.ejW = paramInt1;
    localk.eki = paramInt2;
    localk.bWA = 8390656;
    c(localk);
    a(localk, paramInt3);
    q.Sj().a(localk);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelstat/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */