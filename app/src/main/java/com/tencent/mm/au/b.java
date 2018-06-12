package com.tencent.mm.au;

import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;

public final class b
{
  private static final b edK = new b();
  public long edJ;
  
  public b()
  {
    if (g.Eg().Dx())
    {
      this.edJ = q.GK();
      return;
    }
    com.tencent.mm.sdk.b.a.sFg.a(new b.1(this));
  }
  
  public static b Qu()
  {
    return edK;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/au/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */