package com.tencent.mm.plugin.collect.reward.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.mj;
import com.tencent.mm.protocal.c.mk;
import com.tencent.mm.sdk.platformtools.x;

public final class f
  extends a
{
  private final String TAG = "MicroMsg.NetSceneQrRewardScanCode";
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public mk hVc;
  
  public f(String paramString1, int paramInt, String paramString2)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new mj();
    ((b.a)localObject).dIH = new mk();
    ((b.a)localObject).dIF = 1516;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/scanrewardqrcode";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (mj)this.diG.dID.dIL;
    ((mj)localObject).hUo = paramString1;
    ((mj)localObject).bVU = paramInt;
    ((mj)localObject).rqw = paramString2;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  protected final boolean aBP()
  {
    return false;
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneQrRewardScanCode", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.hVc = ((mk)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneQrRewardScanCode", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.hVc.hUm), this.hVc.hUn });
    if ((!this.hUU) && (this.hVc.hUm != 0)) {
      this.hUV = true;
    }
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1516;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/collect/reward/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */