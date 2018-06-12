package com.tencent.mm.plugin.collect.reward.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.mf;
import com.tencent.mm.protocal.c.mg;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends a
{
  private final String TAG = "MicroMsg.NetSceneQrRewardPayCheck";
  private b diG;
  private com.tencent.mm.ab.e diJ;
  private mg hVa;
  
  public d(String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, String paramString5)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new mf();
    ((b.a)localObject).dIH = new mg();
    ((b.a)localObject).dIF = 1960;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/rewardqrcodepaycheck";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (mf)this.diG.dID.dIL;
    ((mf)localObject).bQa = paramString1;
    ((mf)localObject).rqr = paramString2;
    ((mf)localObject).rcE = paramString3;
    ((mf)localObject).amount = paramInt;
    ((mf)localObject).rqp = paramString4;
    ((mf)localObject).rqo = paramString5;
    x.i("MicroMsg.NetSceneQrRewardPayCheck", "rewardid: %s, amt: %s", new Object[] { paramString2, Integer.valueOf(paramInt) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneQrRewardPayCheck", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.hVa = ((mg)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneQrRewardPayCheck", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.hVa.hUm), this.hVa.hUn });
    if ((!this.hUU) && (this.hVa.hUm != 0)) {
      this.hUV = true;
    }
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1960;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/collect/reward/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */