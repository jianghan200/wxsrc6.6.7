package com.tencent.mm.model.a;

import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.d.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.bd;

public final class d
  implements com.tencent.mm.ab.d
{
  public final d.b b(d.a parama)
  {
    parama = parama.dIN;
    if ((parama == null) || (parama.rcl == null)) {
      com.tencent.mm.sdk.platformtools.x.f("MicroMsg.abtest.AbTestMsgExtension", "[Abtest] AbTestMsgExtension failed, invalid cmdAM");
    }
    do
    {
      return null;
      String str = ab.a(parama.rcl);
      com.tencent.mm.kernel.g.Ei().DT().set(328193, str);
      parama = g.IW();
      long l = System.currentTimeMillis();
      try
      {
        parama.iQ(str);
        str = (String)com.tencent.mm.kernel.g.Ei().DT().get(328197, null);
        if ((bi.oW(str)) || ((parama.dDN != null) && (!str.equals(parama.dDN.dDJ))))
        {
          com.tencent.mm.kernel.g.Ei().DT().set(328197, parama.dDN.dDJ);
          com.tencent.mm.kernel.g.Ei().DT().set(328195, Boolean.valueOf(false));
          com.tencent.mm.kernel.g.Ei().DT().set(328194, Boolean.valueOf(false));
          com.tencent.mm.kernel.g.Ei().DT().set(328196, Boolean.valueOf(false));
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.abtest.AbTestManager", "[cpan] new case id or new case id , reset click value.");
        }
      }
      catch (Exception parama)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.abtest.AbTestManager", "[Abtest] updateAbTestCase exception:%s", new Object[] { parama.toString() });
        }
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.abtest.AbTestManager", "[Abtest] update use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    } while (!g.IW().IU());
    f.iS(g.IW().dDN.dDJ);
    return null;
  }
  
  public final void h(bd parambd) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/model/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */