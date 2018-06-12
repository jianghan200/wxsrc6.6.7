package com.tencent.mm.r;

import com.tencent.mm.kernel.api.c;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.model.p;

public final class h
  extends p
  implements c
{
  private static h diN;
  
  private h()
  {
    super(i.class);
  }
  
  public static h Ce()
  {
    try
    {
      if (diN == null) {
        diN = new h();
      }
      h localh = diN;
      return localh;
    }
    finally {}
  }
  
  public final void onAccountInitialized(e.c paramc)
  {
    super.onAccountInitialized(paramc);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/r/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */