package com.tencent.mm.plugin.sns.lucky.a;

import com.tencent.mm.ab.d.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.storage.aa.a;
import java.util.LinkedList;
import java.util.Map;

public final class j
  implements bv.a
{
  public static String TAG = "MicroMsg.NewYearSnsTips2016NotifyLsn";
  
  public final void a(d.a parama)
  {
    com.tencent.mm.sdk.platformtools.x.i(TAG, "receivemsg NewYearSnsTips2016NotifyLsn");
    b.kB(74);
    if ((parama == null) || (parama.dIN == null))
    {
      com.tencent.mm.sdk.platformtools.x.e(TAG, "onPreAddMessage cmdAM is null");
      return;
    }
    i locali = new i();
    String str1 = ab.a(parama.dIN.rcl);
    locali.gVP = new StringBuffer();
    Map localMap = bl.z(str1, "sysmsg");
    locali.nmb.clear();
    if (localMap == null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NewYearSnsTips", "errr for paser %s", new Object[] { str1 });
      b.kB(75);
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NewYearSnsTips", "dump NewYearSnsTips " + locali.gVP.toString());
      g.Ek();
      g.Ei().DT().a(aa.a.sSs, str1);
      g.Ek();
      g.Ei().DT().lm(true);
      return;
      int i = 0;
      label179:
      long l1;
      label248:
      long l2;
      label319:
      String str2;
      if (i == 0)
      {
        parama = "";
        l1 = bi.WV((String)localMap.get(String.format(".sysmsg.NewYearSNSTips2016.Tips%s.%s", new Object[] { parama, "BeginTime" })));
        locali.gVP.append("BeginTime:" + l1 + ";");
        if (i != 0) {
          break label525;
        }
        parama = "";
        l2 = bi.WV((String)localMap.get(String.format(".sysmsg.NewYearSNSTips2016.Tips%s.%s", new Object[] { parama, "EndTime" })));
        locali.gVP.append("EndTime:" + l2 + ";");
        if (i != 0) {
          break label533;
        }
        parama = "";
        str2 = bi.aG((String)localMap.get(String.format(".sysmsg.NewYearSNSTips2016.Tips%s.%s", new Object[] { parama, "ActionID" })), "");
        locali.gVP.append("ActionID:" + str2 + ";");
        if (bi.oW(str2)) {
          break label549;
        }
        if (i != 0) {
          break label541;
        }
      }
      label525:
      label533:
      label541:
      for (parama = "";; parama = String.valueOf(i))
      {
        parama = bi.aG((String)localMap.get(String.format(".sysmsg.NewYearSNSTips2016.Tips%s.%s", new Object[] { parama, "TipsMessage" })), "");
        locali.gVP.append("TipsMessage:" + parama + ";\n");
        h localh = new h();
        localh.nlY = str2;
        localh.nlo = l1;
        localh.hcQ = l2;
        localh.nlZ = parama;
        locali.nmb.add(localh);
        i += 1;
        break;
        parama = String.valueOf(i);
        break label179;
        parama = String.valueOf(i);
        break label248;
        parama = String.valueOf(i);
        break label319;
      }
      label549:
      if (locali.nmb.size() == 0) {
        b.kB(76);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/sns/lucky/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */