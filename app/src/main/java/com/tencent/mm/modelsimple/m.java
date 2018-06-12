package com.tencent.mm.modelsimple;

import android.content.Context;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.g.a.sd;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.c.ags;
import com.tencent.mm.protocal.c.agt;
import com.tencent.mm.protocal.c.auy;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.bxb;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;

public final class m
  extends l
  implements k
{
  private String account;
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public m(String paramString)
  {
    this.account = paramString;
    b.a locala = new b.a();
    locala.dIG = new ags();
    locala.dIH = new agt();
    locala.uri = "/cgi-bin/micromsg-bin/getprofile";
    locala.dIF = 302;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((ags)this.diG.dID.dIL).hbL = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    if (bi.oW(this.account))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NetSceneGetProfile", "null or empty username");
      return -1;
    }
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetProfile", "get profile ret: errType=" + paramInt2 + " errCode=" + paramInt3 + " errMsg=" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (agt)this.diG.dIE.dIL;
      paramArrayOfByte = new sd();
      paramArrayOfByte.ccW.ccX = paramq.rKa.stD;
      a.sFg.m(paramArrayOfByte);
      if ((com.tencent.mm.model.q.GF().equals(paramq.rJZ.rvi.toString())) && (!bi.oW(paramq.rKa.rra))) {
        g.Ei().DT().a(aa.a.sPv, paramq.rKa.rra);
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetProfile", "summersafecdn resp.UserInfo.PluginSwitch[%d], GrayscaleFlag[%d]", new Object[] { Integer.valueOf(paramq.rJZ.rYa), Integer.valueOf(paramq.rKa.stx) });
      g.Ei().DT().set(64, Integer.valueOf(paramq.rKa.raE));
      g.Ei().DT().set(144385, Integer.valueOf(paramq.rKa.stx));
      g.Ei().DT().set(40, Integer.valueOf(paramq.rJZ.rYa));
      g.Ei().DT().set(339975, Integer.valueOf(paramq.rKa.stF));
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetProfile", "hy: getprofile pay wallet type: %d", new Object[] { Integer.valueOf(paramq.rKa.stF) });
      g.Ei().DT().a(aa.a.sTs, Integer.valueOf(paramq.rKa.rEA));
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneGetProfile", "hy: getprofile pay wallet type: %d %d", new Object[] { Integer.valueOf(paramq.rKa.stF), Integer.valueOf(paramq.rKa.rEA) });
      g.Ei().DT().set(208903, paramq.rKa.rhh);
      g.Ei().DT().set(274433, paramq.rKa.rXl);
      g.Ei().DT().set(274434, paramq.rKa.rXk);
      g.Ei().DT().set(274436, paramq.rKa.sty);
      g.Ei().DT().a(aa.a.sRy, bi.aG(paramq.rKa.csY, ""));
      g.Ei().DT().a(aa.a.sVy, paramq.rKa.stH);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGetProfile", "weidianInfo:%s", new Object[] { paramq.rKa.csY });
      at.dBv.T("last_login_use_voice", paramq.rJZ.rYa);
      if (Build.VERSION.SDK_INT < 23) {
        Settings.System.putString(ad.getContext().getContentResolver(), "89884a87498ef44f", paramq.rKa.stE);
      }
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 302;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/modelsimple/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */