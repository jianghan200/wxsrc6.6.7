package com.tencent.mm.plugin.wallet_index.c.a;

import android.content.Context;
import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.azn;
import com.tencent.mm.protocal.c.azo;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.m;

public final class a
  extends m
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public String jumpUrl;
  public String pCO;
  public String pCZ;
  public String prepayId;
  
  public a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new azn();
    ((b.a)localObject).dIH = new azo();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payibggenprepay";
    ((b.a)localObject).dIF = 1563;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (azn)this.diG.dID.dIL;
    ((azn)localObject).jQb = paramString1;
    ((azn)localObject).rsx = paramString4;
    ((azn)localObject).rsw = paramString2;
    ((azn)localObject).rsy = paramString5;
    ((azn)localObject).rsz = paramString6;
    ((azn)localObject).rhq = paramString3;
    ((azn)localObject).rrC = paramString7;
    ((azn)localObject).rEe = paramString8;
    ((azn)localObject).qZe = paramInt;
    x.d("MicroMsg.NetSceneIbgPayGenPrepay", String.format("appid:%s,packageExt:%s,nonceStr:%s,paySignature:%s,signtype:%s,timeStamp:%s,url:%s,bizUsername:%s,", new Object[] { paramString1, paramString4, paramString2, paramString5, paramString6, paramString3, paramString7, paramString8 }));
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.i("MicroMsg.NetSceneIbgPayGenPrepay", "hy: gen ibg prepay raw net errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    paramq = (azo)((b)paramq).dIE.dIL;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      x.i("MicroMsg.NetSceneIbgPayGenPrepay", "hy: gen ibg prepay jump url. biz_errcode: %d, biz_errmsg: %s", new Object[] { Integer.valueOf(paramq.iwS), paramq.iwT });
      paramString = paramq.iwT;
      paramInt2 = paramq.iwS;
      this.jumpUrl = paramq.jOU;
      this.prepayId = paramq.rEf;
      this.pCO = paramq.rEg;
      this.pCZ = paramq.scf;
    }
    for (;;)
    {
      paramq = paramString;
      if (bi.oW(paramString)) {
        paramq = ad.getContext().getString(a.i.wallet_data_err);
      }
      this.diJ.a(paramInt1, paramInt2, paramq, this);
      return;
      x.e("MicroMsg.NetSceneIbgPayGenPrepay", "hy: gen ibg prepay jump url failed");
      this.jumpUrl = null;
    }
  }
  
  public final int getType()
  {
    return 1563;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/wallet_index/c/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */