package com.tencent.mm.pluginsdk.g.a.c;

import com.tencent.mm.compatible.e.w;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;

final class p
{
  public static void ccG()
  {
    if (g.Eg().Dx())
    {
      g.Eg();
      if (!a.Dr()) {
        break label20;
      }
    }
    label20:
    long l;
    do
    {
      do
      {
        return;
      } while (getNetworkType() == 0);
      l = bi.VE();
    } while (bi.a((Long)g.Ei().DT().get(aa.a.sRI, null), 0L) >= l);
    g.Ei().DT().a(aa.a.sRI, Long.valueOf(7200L + l));
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.PostTaskCheckResume", "doCheckResume");
    q.a.ccH().Em().H(new p.1());
  }
  
  static int getNetworkType()
  {
    switch ()
    {
    default: 
      return 2;
    case 0: 
      return 0;
    }
    return 1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/g/a/c/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */