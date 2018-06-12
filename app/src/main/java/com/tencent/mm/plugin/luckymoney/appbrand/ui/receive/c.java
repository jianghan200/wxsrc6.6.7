package com.tencent.mm.plugin.luckymoney.appbrand.ui.receive;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.protocal.c.ayk;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public final class c
  implements a
{
  private String appId = null;
  String kLZ = null;
  b kMM = null;
  byte[] kMN;
  ayk kMO;
  public RealnameGuideHelper kMP;
  int state = -1;
  
  final void Q(Intent paramIntent)
  {
    if (this.kMM == null)
    {
      x.e("MicroMsg.WxaReceiveLuckyMoneyLogic", "WxaGetLuckyMoneyLogic.fail ui == null");
      return;
    }
    this.kMM.baB();
    this.kMM.b(0, paramIntent);
  }
  
  public final void baE()
  {
    if (this.state != 0)
    {
      x.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onOpenBtnClick return state = %d", new Object[] { Integer.valueOf(this.state) });
      return;
    }
    if (this.kMM == null)
    {
      x.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "openLuckyMoney ui == null");
      return;
    }
    new com.tencent.mm.plugin.luckymoney.appbrand.a.b(this.appId, this.kLZ, this.kMN).b(new c.2(this));
  }
  
  public final void baF()
  {
    if (this.kMM == null)
    {
      x.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onDetailBtnClick ui == null");
      return;
    }
    baJ();
  }
  
  final void baJ()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("key_sendid", this.kLZ);
    localIntent.putExtra("key_appid", this.appId);
    Bundle localBundle;
    if (this.kMO != null) {
      localBundle = new Bundle();
    }
    for (;;)
    {
      try
      {
        localBundle.putByteArray("key_data", this.kMO.toByteArray());
        localIntent.putExtras(localBundle);
        localIntent.putExtra("key_from", "value_open");
        this.kMM.a(com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.b.class, localIntent, new c.3(this));
        return;
      }
      catch (IOException localIOException)
      {
        x.printErrStackTrace("MicroMsg.WxaReceiveLuckyMoneyLogic", localIOException, "goLuckyMoneyDetailUI WxaDetailResponse putByteArray error", new Object[0]);
        Q(new Intent().putExtra("result_error_code", -1).putExtra("result_error_msg", "fail:system error {{byte detail response fail}}"));
        return;
      }
      localIOException.putExtra("key_from", "value_query");
    }
  }
  
  public final void onDestroy()
  {
    x.i("MicroMsg.WxaReceiveLuckyMoneyLogic", "onDestroy ");
    this.kMM = null;
    this.kMO = null;
    this.kMP = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/appbrand/ui/receive/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */