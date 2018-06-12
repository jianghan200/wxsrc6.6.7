package com.tencent.mm.plugin.sns.lucky.a;

import com.tencent.mm.ab.d.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.storage.aa.a;
import java.util.Map;

public final class d
  implements bv.a
{
  public final void a(d.a parama)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NewYearSNSAmountLevelCtrl2016NotifyLsn", "receivemsg NewYearSNSAmountLevelCtrl2016NotifyLsn");
    b.kB(67);
    if ((parama == null) || (parama.dIN == null))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewYearSNSAmountLevelCtrl2016NotifyLsn", "onPreAddMessage cmdAM is null");
      return;
    }
    e locale = new e();
    parama = ab.a(parama.dIN.rcl);
    locale.gVP = new StringBuffer();
    Map localMap = bl.z(parama, "sysmsg");
    locale.level = 0;
    if (localMap == null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NewYearSnsAmountLevel", "errr for paser %s", new Object[] { parama });
      b.kB(68);
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NewYearSnsAmountLevel", "dump NewYearSnsAmountLevel " + locale.gVP.toString());
      g.Ek();
      g.Ei().DT().a(aa.a.sSD, parama);
      g.Ek();
      g.Ei().DT().lm(true);
      return;
      locale.level = bi.WU((String)localMap.get(".sysmsg.NewYearSNSAmountLevelCtrl2016.Level"));
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NewYearSnsAmountLevel", "get level %d", new Object[] { Integer.valueOf(locale.level) });
      if (locale.level == 0) {
        b.kB(69);
      } else if (locale.level == 1) {
        b.kB(70);
      } else if (locale.level == 2) {
        b.kB(71);
      } else if (locale.level == 3) {
        b.kB(72);
      } else if (locale.level == 4) {
        b.kB(73);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/sns/lucky/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */