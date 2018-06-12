package com.tencent.mm.plugin.game.model;

import com.tencent.mm.plugin.game.d.dm;
import com.tencent.mm.plugin.game.d.e;
import com.tencent.mm.plugin.game.d.q;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public class ac
{
  public static d a(e parame)
  {
    if (parame == null)
    {
      x.e("MicroMsg.GamePBData", "Invalid pb object");
      return null;
    }
    if (bi.oW(parame.jPc))
    {
      x.e("MicroMsg.GamePBData", "No AppID field, abort");
      return null;
    }
    x.i("MicroMsg.GamePBData", "Parsing AppID: %s", new Object[] { parame.jPc });
    d locald = new d();
    locald.field_appId = parame.jPc;
    locald.field_appName = parame.jPe;
    locald.field_appIconUrl = parame.jPd;
    locald.field_appType = ",1,";
    locald.field_packageName = parame.jPg;
    locald.field_appVersion = parame.hcD;
    locald.field_appInfoFlag = parame.jPj;
    if (parame.jPi != null)
    {
      locald.di(parame.jPi.jPS);
      locald.dl(parame.jPi.jPT);
      locald.eA(parame.jPi.jPW);
      locald.dm(parame.jPi.jPU);
      locald.jLv = parame.jPi.jPY;
      locald.jLw = parame.jPi.jPX;
      locald.bPG = parame.jPi.jPZ;
    }
    if ((parame.jPi != null) && (parame.jPi.jPV != null))
    {
      locald.dr(parame.jPi.jPV.jPS);
      locald.ds(parame.jPi.jPV.jTz);
      locald.dp(parame.jPi.jPV.jTA);
      locald.dq(parame.jPi.jPV.jTB);
      locald.eB(parame.jPi.jPV.jTD);
    }
    locald.jLc = parame.jOS;
    locald.jLb = parame.jPf;
    locald.status = parame.hcd;
    locald.jLe = parame.jOX;
    locald.versionCode = parame.jPh;
    locald.bHF = parame.jOZ;
    locald.jLg = parame.jPk;
    locald.jLo = parame.jPp;
    if ((parame.jPi != null) && (parame.jPi.jPV != null))
    {
      locald.jLh = parame.jPi.jPV.jTC;
      locald.jLi = parame.jPi.jPV.jTE;
      locald.jLj = parame.jPi.jPV.jTF;
    }
    locald.dPU = parame.jPr;
    locald.jLx = parame.jPs;
    return locald;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/game/model/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */