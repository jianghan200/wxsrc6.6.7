package com.tencent.mm.plugin.recharge.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wallet_core.model.mall.c;
import com.tencent.mm.pluginsdk.wallet.PayInfo;
import com.tencent.mm.protocal.c.brq;
import com.tencent.mm.protocal.c.brr;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.d;
import com.tencent.mm.wallet_core.c.m;

public final class g
  extends m
  implements d
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public String mAppId;
  public PayInfo mpb;
  
  public g(MallRechargeProduct paramMallRechargeProduct, String paramString)
  {
    this(paramMallRechargeProduct.appId, paramMallRechargeProduct.moy, paramMallRechargeProduct.bKk, paramString);
  }
  
  public g(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new brq();
    ((b.a)localObject).dIH = new brr();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/submitpayproductbuyinfo";
    ((b.a)localObject).dIF = 498;
    ((b.a)localObject).dII = 230;
    ((b.a)localObject).dIJ = 1000000230;
    this.diG = ((b.a)localObject).KT();
    localObject = (brq)this.diG.dID.dIL;
    x.d("MicroMsg.NetSceneSubmitPayProductBuyInfo", "remark: %s", new Object[] { paramString4 });
    this.mAppId = paramString1;
    ((brq)localObject).rDh = paramString1;
    ((brq)localObject).rDg = paramString2;
    ((brq)localObject).rIL = paramString3;
    ((brq)localObject).rDi = paramString4;
    ((brq)localObject).rwj = c.bPK().Pe(paramString2);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    this.mpb = new PayInfo();
    Object localObject = (brr)((b)paramq).dIE.dIL;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      x.d("MicroMsg.NetSceneSubmitPayProductBuyInfo", "resp.ReqKey " + ((brr)localObject).reo);
      this.mpb.appId = this.mAppId;
      this.mpb.pCO = ((brr)localObject).rEg;
      this.mpb.bOd = ((brr)localObject).reo;
    }
    int i = paramInt2;
    if (paramInt2 == 0) {
      i = ((brr)localObject).rDj;
    }
    paramq = paramString;
    if (bi.oW(paramString)) {
      paramq = ((brr)localObject).rDk;
    }
    this.mpb.qUK = String.valueOf(i);
    localObject = this.mpb;
    if (paramq != null) {}
    for (paramString = paramq;; paramString = "")
    {
      ((PayInfo)localObject).Yy = paramString;
      x.d("MicroMsg.NetSceneSubmitPayProductBuyInfo", "errCode " + i + ", errMsg " + paramq);
      this.diJ.a(paramInt1, i, paramq, this);
      return;
    }
  }
  
  public final int getType()
  {
    return 498;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/recharge/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */