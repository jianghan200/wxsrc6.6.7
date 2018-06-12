package com.tencent.mm.plugin.collect.reward.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ml;
import com.tencent.mm.protocal.c.mm;
import com.tencent.mm.sdk.platformtools.x;

public final class h
  extends a
{
  private final String TAG = "MicroMsg.NetSceneQrRewardSetPhotoWord";
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public mm hVe;
  public String hqp;
  
  public h(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new ml();
    locala.dIH = new mm();
    locala.dIF = 1649;
    locala.uri = "/cgi-bin/mmpay-bin/setrewardqrcodephotoword";
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((ml)this.diG.dID.dIL).hqp = paramString;
    this.hqp = paramString;
    if ((paramString.length() > 0) && (paramString.length() <= 3)) {
      com.tencent.mm.plugin.report.service.h.mEJ.a(724L, 0L, 1L, false);
    }
    while (paramString.length() <= 3) {
      return;
    }
    com.tencent.mm.plugin.report.service.h.mEJ.a(724L, 1L, 1L, false);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneQrRewardSetPhotoWord", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.hVe = ((mm)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneQrRewardSetPhotoWord", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.hVe.hUm), this.hVe.hUn });
    if ((!this.hUU) && (this.hVe.hUm != 0)) {
      this.hUV = true;
    }
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1649;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/collect/reward/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */