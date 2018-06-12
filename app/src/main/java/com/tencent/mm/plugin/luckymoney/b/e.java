package com.tencent.mm.plugin.luckymoney.b;

import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bi;

public final class e
{
  d kLu;
  
  public e()
  {
    init();
  }
  
  private void init()
  {
    this.kLu = new d();
    g.Ek();
    String str = (String)g.Ei().DT().get(356355, null);
    if (bi.oW(str))
    {
      this.kLu.kKT = 2000.0D;
      this.kLu.kKQ = 100;
      this.kLu.kKU = 200.0D;
      this.kLu.kKS = 0.01D;
      this.kLu.kKR = 200.0D;
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.LuckyMoneyConfigManager", "LuckyMoneyConfig init maxTotalAmount:" + this.kLu.kKT + " maxTotalNum:" + this.kLu.kKQ + " perGroupMaxValue:" + this.kLu.kKU + " perMinValue:" + this.kLu.kKS + " perPersonMaxValue:" + this.kLu.kKR);
      return;
      try
      {
        this.kLu.aG(str.getBytes("ISO-8859-1"));
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.LuckyMoneyConfigManager", "parseConfig exp, " + localException.getLocalizedMessage());
        this.kLu.kKT = 2000.0D;
        this.kLu.kKQ = 100;
        this.kLu.kKU = 200.0D;
        this.kLu.kKS = 0.01D;
        this.kLu.kKR = 200.0D;
      }
    }
  }
  
  public final d baS()
  {
    if (this.kLu == null) {
      init();
    }
    return this.kLu;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */