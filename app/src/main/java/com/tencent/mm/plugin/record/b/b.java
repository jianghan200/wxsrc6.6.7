package com.tencent.mm.plugin.record.b;

import com.tencent.mm.g.a.fz;
import com.tencent.mm.g.a.fz.b;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.x;
import com.tencent.mm.sdk.b.a;

public final class b
{
  public static String a(com.tencent.mm.plugin.record.ui.a.b paramb)
  {
    fz localfz = new fz();
    localfz.bOL.type = 2;
    localfz.bOL.bON = paramb.bOz;
    a.sFg.m(localfz);
    return localfz.bOM.path;
  }
  
  public static String b(com.tencent.mm.plugin.record.ui.a.b paramb)
  {
    fz localfz = new fz();
    localfz.bOL.type = 2;
    localfz.bOL.bON = paramb.bOz;
    a.sFg.m(localfz);
    return localfz.bOM.bOX;
  }
  
  public static boolean c(com.tencent.mm.plugin.record.ui.a.b paramb)
  {
    fz localfz = new fz();
    localfz.bOL.type = 14;
    localfz.bOL.bON = paramb.bOz;
    a.sFg.m(localfz);
    return localfz.bOM.ret == 1;
  }
  
  public static com.tencent.mm.plugin.fav.a.g eo(long paramLong)
  {
    return ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(paramLong);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/record/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */