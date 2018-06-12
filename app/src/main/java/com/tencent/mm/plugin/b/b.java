package com.tencent.mm.plugin.b;

import com.tencent.mm.model.c.c;
import com.tencent.mm.model.p;

public final class b
  extends p
{
  private static b eEx;
  
  private b()
  {
    super(c.class);
  }
  
  public static b WC()
  {
    try
    {
      if (eEx == null) {
        eEx = new b();
      }
      b localb = eEx;
      return localb;
    }
    finally {}
  }
  
  public final void gj(String paramString)
  {
    super.gj(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */