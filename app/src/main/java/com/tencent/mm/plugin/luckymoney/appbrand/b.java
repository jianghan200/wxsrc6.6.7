package com.tencent.mm.plugin.luckymoney.appbrand;

import android.content.Intent;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare.WxaLuckyMoneyPrepareUI;
import com.tencent.mm.plugin.luckymoney.appbrand.ui.receive.WxaLuckyMoneyReceiveUI;
import com.tencent.mm.ui.MMActivity;

public final class b
  implements a
{
  public final void a(MMActivity paramMMActivity, String paramString1, int paramInt1, String paramString2, int paramInt2)
  {
    paramMMActivity.startActivityForResult(new Intent(paramMMActivity, WxaLuckyMoneyPrepareUI.class).putExtra("appId", paramString1).putExtra("defaultWishingWord", paramString2).putExtra("range", paramInt1), paramInt2);
  }
  
  public final void a(MMActivity paramMMActivity, String paramString1, String paramString2, int paramInt)
  {
    paramMMActivity.startActivityForResult(new Intent(paramMMActivity, WxaLuckyMoneyReceiveUI.class).putExtra("appId", paramString2).putExtra("sendId", paramString1), paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/appbrand/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */