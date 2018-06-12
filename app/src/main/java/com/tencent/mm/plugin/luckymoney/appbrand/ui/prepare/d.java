package com.tencent.mm.plugin.luckymoney.appbrand.ui.prepare;

import android.content.Intent;
import com.tencent.mm.plugin.luckymoney.appbrand.a.e;
import com.tencent.mm.protocal.c.bhg;
import com.tencent.mm.protocal.c.bhh;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity.a;

public final class d
  implements a, MMActivity.a
{
  private String appId = null;
  boolean kMA;
  final int kMB = hashCode() & 0xFFFF;
  c kMy;
  bhh kMz;
  
  private void a(bhg parambhg)
  {
    x.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "prepareImpl ");
    if (this.kMA)
    {
      x.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "prepareImpl isRequesting");
      return;
    }
    this.kMA = true;
    new e(parambhg).b(new d.1(this));
  }
  
  final void Q(Intent paramIntent)
  {
    this.kMA = false;
    if (this.kMy == null) {
      return;
    }
    this.kMy.b(0, paramIntent);
  }
  
  public final void b(int paramInt1, int paramInt2, Intent paramIntent)
  {
    x.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "mmOnActivityResult() called with: requestCode = [" + paramInt1 + "], resultCode = [" + paramInt2 + "], data = [" + paramIntent + "]");
    if (paramInt1 == this.kMB)
    {
      if (paramInt2 == -1)
      {
        paramIntent = new Intent();
        this.kMy.a(b.class, paramIntent, new d.2(this));
      }
    }
    else {
      return;
    }
    x.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "mmOnActivityResult() REQUEST_CODE_WALLET called cancel ");
    Q(new Intent().putExtra("result_error_code", 10001).putExtra("result_error_msg", "fail:pay fail"));
  }
  
  public final void b(int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    x.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "prepareRandomLuckyMoney() called with: moneyTotalAmount = [" + paramInt1 + "], packageAmount = [" + paramInt2 + "], wishing = [" + paramString + "], scope = [" + paramInt3 + "]");
    if (this.kMy == null) {
      return;
    }
    bhg localbhg = new bhg();
    localbhg.bPS = this.appId;
    localbhg.kLe = 1;
    localbhg.qYf = paramInt2;
    localbhg.sbh = paramInt1;
    localbhg.kLf = paramString;
    localbhg.sie = paramInt3;
    a(localbhg);
  }
  
  public final void c(int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    x.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "prepareFixLuckyMoney() called with: packageMoneyAmount = [" + paramInt1 + "], packageAmount = [" + paramInt2 + "], wishing = [" + paramString + "], scope = [" + paramInt3 + "]");
    if (this.kMy == null) {
      return;
    }
    bhg localbhg = new bhg();
    localbhg.bPS = this.appId;
    localbhg.kLe = 0;
    localbhg.qYf = paramInt2;
    localbhg.sid = paramInt1;
    localbhg.kLf = paramString;
    localbhg.sie = paramInt3;
    a(localbhg);
  }
  
  public final void onDestroy()
  {
    x.i("MicroMsg.WxaPrepareLuckyMoneyLogic", "onDestroy ");
    this.kMy = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/appbrand/ui/prepare/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */