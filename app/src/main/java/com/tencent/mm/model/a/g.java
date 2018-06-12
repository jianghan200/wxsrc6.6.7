package com.tencent.mm.model.a;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.p;
import java.util.HashMap;

public class g
  implements ar
{
  private c dDT = null;
  
  private static g IV()
  {
    return (g)p.v(g.class);
  }
  
  public static c IW()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (IV().dDT == null) {
      IV().dDT = new c();
    }
    return IV().dDT;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    c localc = IW();
    long l = System.currentTimeMillis();
    try
    {
      localc.iQ((String)com.tencent.mm.kernel.g.Ei().DT().get(328193, null));
      if (localc.IU()) {
        f.iS(localc.dDN.dDJ);
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.abtest.AbTestManager", "[Abtest] init use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.abtest.AbTestManager", "[Abtest] updateAbTestCase exception:%s", new Object[] { localException.toString() });
      }
    }
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    c localc = IW();
    localc.dDO = null;
    localc.dDN = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/model/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */