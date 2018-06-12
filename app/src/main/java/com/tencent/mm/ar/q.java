package com.tencent.mm.ar;

import com.tencent.mm.g.a.lw;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bi;

public final class q
  extends com.tencent.mm.sdk.b.c<lw>
{
  private static long cXx = 86400000L;
  
  public q()
  {
    this.sFo = lw.class.getName().hashCode();
  }
  
  private static boolean Qn()
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.PostTaskUpdateConfigListListener", "callback expired : " + xG());
    if (xG()) {
      c.Qj().update();
    }
    return false;
  }
  
  private static boolean xG()
  {
    return bi.bG(Long.valueOf(bi.c((Long)g.Ei().DT().get(81938, null))).longValue()) * 1000L > cXx;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ar/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */