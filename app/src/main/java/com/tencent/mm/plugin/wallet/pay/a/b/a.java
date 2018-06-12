package com.tencent.mm.plugin.wallet.pay.a.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.fl;
import com.tencent.mm.protocal.c.km;
import com.tencent.mm.protocal.c.kn;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.m;

public class a
  extends m
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public a(String paramString, int paramInt1, int paramInt2)
  {
    b.a locala = new b.a();
    km localkm = new km();
    localkm.reo = paramString;
    localkm.rmJ = paramInt1;
    localkm.rmK = paramInt2;
    locala.dIG = localkm;
    locala.dIH = new kn();
    locala.uri = getUri();
    locala.dIF = If();
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    x.i("MicroMsg.NetSceneCancelPay", "request uri: %s, reqKey: %s, payScene: %d, payChannel:%d", new Object[] { getUri(), paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
  
  public int If()
  {
    return 2823;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void e(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    x.d("MicroMsg.NetSceneCancelPay", "response uri: %s, errType: %d, errCode: %d, errMsg: %s", new Object[] { getUri(), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 0) && (paramInt2 == 0)) {}
    try
    {
      paramq = (kn)((b)paramq).dIE.dIL;
      x.i("MicroMsg.NetSceneCancelPay", "NetSceneCancelPay BaseResponse.Ret is %d, BaseResponse.ErrMsg is %s", new Object[] { Integer.valueOf(paramq.six.rfn), paramq.six.rgv });
      if (this.diJ != null) {
        this.diJ.a(paramInt1, paramInt2, paramString, this);
      }
      return;
    }
    catch (Exception paramq)
    {
      for (;;)
      {
        x.i("MicroMsg.NetSceneCancelPay", paramq.getMessage());
      }
    }
  }
  
  public final int getType()
  {
    return If();
  }
  
  public String getUri()
  {
    return "/cgi-bin/mmpay-bin/tenpay/ts_cancelpay";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet/pay/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */