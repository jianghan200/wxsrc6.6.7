package com.tencent.mm.plugin.wallet_index.c;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.network.q;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.plugin.wallet_core.model.i;
import com.tencent.mm.protocal.c.aza;
import com.tencent.mm.protocal.c.azb;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.d;
import com.tencent.mm.wallet_core.c.m;

public final class e
  extends m
  implements d
{
  public b diG;
  private com.tencent.mm.ab.e diJ;
  
  public e(PayReq paramPayReq, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new aza();
    ((b.a)localObject).dIH = new azb();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/payauthapp";
    ((b.a)localObject).dIF = 397;
    ((b.a)localObject).dII = 188;
    ((b.a)localObject).dIJ = 1000000188;
    this.diG = ((b.a)localObject).KT();
    localObject = (aza)this.diG.dID.dIL;
    ((aza)localObject).jQb = paramPayReq.appId;
    ((aza)localObject).sbN = paramPayReq.partnerId;
    ((aza)localObject).rEf = paramPayReq.prepayId;
    ((aza)localObject).rsw = paramPayReq.nonceStr;
    ((aza)localObject).sbO = paramPayReq.timeStamp;
    ((aza)localObject).rsx = paramPayReq.packageValue;
    ((aza)localObject).rsy = paramPayReq.sign;
    ((aza)localObject).rsz = paramPayReq.signType;
    ((aza)localObject).sbP = paramString1;
    ((aza)localObject).jPg = paramString2;
    ((aza)localObject).jSv = paramString3;
    ((aza)localObject).rmQ = i.bOL();
    ((aza)localObject).sbR = paramString4;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.d("MicroMsg.NetScenePayAuthApp", "errType:" + paramInt1 + ",errCode:" + paramInt2 + ",errMsg" + paramString);
    this.diJ.a(paramInt1, paramInt2, paramString, this);
  }
  
  public final int getType()
  {
    return 397;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet_index/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */