package com.tencent.mm.plugin.backup.bakoldlogic.d;

import com.tencent.mm.bt.h;
import com.tencent.mm.model.af;
import com.tencent.mm.model.b;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bn;
import com.tencent.mm.storage.emotion.d;

public final class c
{
  String dqp;
  public h dqq = null;
  com.tencent.mm.storage.x gYC;
  ay gYD;
  com.tencent.mm.plugin.messenger.foundation.a.a.f gYE;
  az gYF;
  com.tencent.mm.ak.g gYG;
  d gYH;
  public com.tencent.mm.plugin.messenger.foundation.a.a.i gYI;
  s gYJ;
  af gYK;
  public k gYL;
  public com.tencent.mm.pluginsdk.model.app.i gYM;
  com.tencent.mm.pluginsdk.model.app.c gYN;
  bn hbn;
  com.tencent.mm.bt.g hbo = null;
  Boolean hbp = null;
  public int uin = 0;
  
  public final com.tencent.mm.storage.x DT()
  {
    if (this.uin == 0) {
      throw new b();
    }
    return this.gYC;
  }
  
  public final ay FR()
  {
    if (this.uin == 0) {
      throw new b();
    }
    return this.gYD;
  }
  
  public final com.tencent.mm.plugin.messenger.foundation.a.a.f FT()
  {
    if (this.uin == 0) {
      throw new b();
    }
    return this.gYE;
  }
  
  public final az FW()
  {
    if (this.uin == 0) {
      throw new b();
    }
    return this.gYF;
  }
  
  public final String Gg()
  {
    if (this.uin == 0) {
      throw new b();
    }
    return this.dqp + "emoji/";
  }
  
  public final s Ta()
  {
    if (this.uin == 0) {
      throw new b();
    }
    return this.gYJ;
  }
  
  public final com.tencent.mm.ak.g asD()
  {
    if (this.uin == 0) {
      throw new b();
    }
    return this.gYG;
  }
  
  public final d asE()
  {
    if (this.uin == 0) {
      throw new b();
    }
    return this.gYH;
  }
  
  public final com.tencent.mm.pluginsdk.model.app.c asF()
  {
    if (this.uin == 0) {
      throw new b();
    }
    return this.gYN;
  }
  
  public final void ats()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BakOldTempStorage", "closeDB isTempDb:%s datadb:%s memdb:%s %s", new Object[] { this.hbp, this.dqq, this.hbo, bi.cjd() });
    if ((this.hbp != null) && (!this.hbp.booleanValue()))
    {
      this.hbp = null;
      return;
    }
    if (this.dqq != null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BakOldTempStorage", "closeDB true DB[%s]!!! ", new Object[] { this.dqq });
      this.dqq.closeDB();
      this.dqq = null;
    }
    if (this.hbo != null)
    {
      com.tencent.mm.bt.g localg = this.hbo;
      com.tencent.mm.bt.g.tdI = bi.cjd().toString();
      if (localg.tdk != null)
      {
        localg.tdk.close();
        localg.tdk = null;
      }
      this.hbo = null;
    }
    this.hbp = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/backup/bakoldlogic/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */