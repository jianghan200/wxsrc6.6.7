package com.tencent.tencentmap.mapsdk.a;

import java.util.ArrayList;

public final class cq
  extends cx
  implements Cloneable
{
  private static ArrayList<cp> b;
  public ArrayList<cp> a = null;
  
  public final void a(cv paramcv)
  {
    if (b == null)
    {
      b = new ArrayList();
      cp localcp = new cp();
      b.add(localcp);
    }
    this.a = ((ArrayList)paramcv.a(b, 0, true));
  }
  
  public final void a(cw paramcw)
  {
    paramcw.a(this.a, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/cq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */