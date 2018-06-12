package com.tencent.mm.plugin.hp.b;

import com.tencent.mm.ab.d.a;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Map;

public final class h
  implements bv.a
{
  public final void a(d.a parama)
  {
    parama = parama.dIN;
    if (parama.jQd == 10002)
    {
      parama = ab.a(parama.rcl);
      if (!bi.oW(parama)) {
        break label38;
      }
      x.w("MicroMsg.Tinker.TinkerBootsSysCmdMsgListener", "msg content is null");
    }
    label38:
    do
    {
      do
      {
        return;
        parama = bl.z(parama, "sysmsg");
      } while ((parama == null) || (parama.size() <= 0));
      localObject = (String)parama.get(".sysmsg.$type");
    } while ((bi.oW((String)localObject)) || (!((String)localObject).equalsIgnoreCase("checktinkerupdate")));
    int i = bi.WU((String)parama.get(".sysmsg.tinkerboots.ignorenetwork"));
    parama = bi.aG((String)parama.get(".sysmsg.tinkerboots.xmlkey"), "");
    x.i("MicroMsg.Tinker.TinkerBootsSysCmdMsgListener", "ignore:%s md5 %s start checkout tinker update. try to do update.", new Object[] { Integer.valueOf(i), parama });
    long l = com.tencent.mm.kernel.a.Dz();
    Object localObject = com.tinkerboots.sdk.a.cJC().gy("uin", String.valueOf(l & 0xFFFFFFFF));
    if ((ao.isWifi(ad.getContext())) || (i == 1)) {}
    for (i = 3;; i = 2)
    {
      ((com.tinkerboots.sdk.a)localObject).gy("network", String.valueOf(i));
      if (!bi.oW(parama)) {
        com.tinkerboots.sdk.a.cJC().gy("xmlkey", parama);
      }
      com.tinkerboots.sdk.a.cJC().na(true);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/hp/b/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */