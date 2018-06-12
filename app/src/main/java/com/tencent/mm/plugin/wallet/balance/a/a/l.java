package com.tencent.mm.plugin.wallet.balance.a.a;

import com.tencent.mm.protocal.c.awx;
import com.tencent.mm.sdk.platformtools.x;

public final class l
{
  private static l oYZ;
  public awx oZa;
  
  public static l bMQ()
  {
    if (oYZ == null) {
      oYZ = new l();
    }
    return oYZ;
  }
  
  public final void a(awx paramawx)
  {
    x.i("MicroMsg.LqtOnClickRedeemCache", "setCache OnClickRedeemRes balance %s, bank_balance %s, lq_balance %s, real_time_balbance %s", new Object[] { Integer.valueOf(paramawx.balance), Integer.valueOf(paramawx.rZW), Integer.valueOf(paramawx.rZV), Integer.valueOf(paramawx.rZX) });
    this.oZa = paramawx;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wallet/balance/a/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */