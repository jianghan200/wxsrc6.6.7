package com.tencent.mm.plugin.luckymoney.sns.b;

import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.x;

public final class a
{
  public static int bbi()
  {
    g.Ek();
    return ((Integer)g.Ei().DT().get(aa.a.sSG, Integer.valueOf(0))).intValue();
  }
  
  public static String bbj()
  {
    g.Ek();
    return (String)g.Ei().DT().get(aa.a.sSL, "");
  }
  
  public static String bbk()
  {
    g.Ek();
    return (String)g.Ei().DT().get(aa.a.sSM, "");
  }
  
  public static void si(int paramInt)
  {
    g.Ek();
    g.Ei().DT().a(aa.a.sSG, Integer.valueOf(paramInt));
    g.Ek();
    g.Ei().DT().lm(true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/sns/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */