package com.tencent.mm.plugin.collect.reward.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.mh;
import com.tencent.mm.protocal.c.mi;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends a
{
  private final String TAG = "MicroMsg.NetSceneQrRewardPlaceOrder";
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public mi hVb;
  
  public e(int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, int paramInt3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt4)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new mh();
    ((b.a)localObject).dIH = new mi();
    ((b.a)localObject).dIF = 1336;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/rewardqrcodeplaceorder";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (mh)this.diG.dID.dIL;
    ((mh)localObject).amount = paramInt1;
    ((mh)localObject).rqu = paramInt2;
    ((mh)localObject).rqs = paramString1;
    ((mh)localObject).rqt = paramString2;
    ((mh)localObject).myf = paramString3;
    ((mh)localObject).bVU = paramInt3;
    ((mh)localObject).rqv = paramString4;
    ((mh)localObject).rqp = paramString5;
    ((mh)localObject).rqw = paramString6;
    ((mh)localObject).rqx = paramString7;
    ((mh)localObject).rqy = paramString8;
    ((mh)localObject).rqz = paramInt4;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneQrRewardPlaceOrder", "errType: %s, errCode: %s, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    this.hVb = ((mi)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneQrRewardPlaceOrder", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.hVb.hUm), this.hVb.hUn });
    if ((!this.hUU) && (this.hVb.hUm != 0)) {
      this.hUV = true;
    }
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1336;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/collect/reward/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */