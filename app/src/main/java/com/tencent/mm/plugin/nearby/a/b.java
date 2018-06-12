package com.tencent.mm.plugin.nearby.a;

import com.tencent.mm.ab.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;

public final class b
  extends Enum<b>
{
  public static void IH(String paramString)
  {
    au.HU();
    ay localay = c.FR();
    if (localay.Yi(paramString)) {
      localay.Ym(paramString);
    }
    bd.a(paramString, new b.1());
    au.HU();
    c.DT().set(143873, "");
    au.HU();
    c.DT().set(143874, Long.valueOf(0L));
    biP();
  }
  
  public static void bP(String paramString, int paramInt)
  {
    au.HU();
    paramString = new d(paramString, (int)bi.bG(bi.c((Long)c.DT().get(143874, Long.valueOf(0L)))), paramInt);
    au.DF().a(paramString, 0);
  }
  
  public static boolean biN()
  {
    au.HU();
    return bi.f((Integer)c.DT().get(143875, Integer.valueOf(0))) == 1;
  }
  
  public static void biO()
  {
    au.HU();
    c.DT().set(143875, Integer.valueOf(1));
  }
  
  public static void biP()
  {
    au.HU();
    c.DT().set(143875, Integer.valueOf(0));
  }
  
  public static boolean dV(String paramString1, String paramString2)
  {
    ab localab = new ab();
    localab.dx(paramString2);
    localab.setUsername(paramString1);
    au.HU();
    paramString2 = c.FR();
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.LbsroomLogic", "Save lbsroom contact name:" + localab.field_username);
    if (!paramString2.Yi(localab.field_username)) {
      paramString2.T(localab);
    }
    au.HU();
    c.DT().set(143873, paramString1);
    au.HU();
    c.DT().set(143874, Long.valueOf(bi.VE()));
    return true;
  }
  
  public static void tP(int paramInt)
  {
    au.HU();
    String str = bi.oV((String)c.DT().get(143873, ""));
    if (!str.equals(""))
    {
      au.HU();
      if (bi.bG(bi.c((Long)c.DT().get(143874, Long.valueOf(0L)))) < 7200L) {
        bP(str, paramInt);
      }
    }
    else
    {
      return;
    }
    IH(str);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/nearby/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */