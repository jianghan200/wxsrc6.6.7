package com.tencent.mm.plugin.luckymoney.appbrand.ui.detail;

import com.tencent.mm.plugin.luckymoney.appbrand.a.c;
import com.tencent.mm.protocal.c.alo;
import com.tencent.mm.protocal.c.ayk;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public final class d
  implements a
{
  boolean acT = false;
  private String appId;
  b kLY;
  private String kLZ;
  int kMa = 0;
  final List<alo> kMb = new LinkedList();
  
  private static ayk aA(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      x.e("MicroMsg.WxaLuckyMoneyLogicDetail", "parseFrom failed. No data found.");
      return null;
    }
    ayk localayk = new ayk();
    try
    {
      localayk.aG(paramArrayOfByte);
      x.i("MicroMsg.WxaLuckyMoneyLogicDetail", "parseFrom succeed.");
      return localayk;
    }
    catch (IOException paramArrayOfByte)
    {
      x.e("MicroMsg.WxaLuckyMoneyLogicDetail", "parseFrom failed. IOException: %s", new Object[] { paramArrayOfByte });
    }
    return null;
  }
  
  private void rY(int paramInt)
  {
    new c(this.appId, this.kLZ, paramInt).b(new d.1(this, paramInt));
  }
  
  public final void onDestroy()
  {
    x.i("MicroMsg.WxaLuckyMoneyLogicDetail", "onDestroy() called");
    this.kLY = null;
  }
  
  public final void rW(int paramInt)
  {
    if (this.kLY == null)
    {
      x.i("MicroMsg.WxaLuckyMoneyLogicDetail", "loadNextPage ui == null");
      return;
    }
    if (paramInt < this.kMb.size())
    {
      x.i("MicroMsg.WxaLuckyMoneyLogicDetail", "loadNextPage. offset = [%d], list.size() = [%d], skip load", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.kMb.size()) });
      return;
    }
    if (this.acT)
    {
      x.i("MicroMsg.WxaLuckyMoneyLogicDetail", "loadNextPage failed. is loading now...");
      return;
    }
    if (this.kMa == 0)
    {
      x.i("MicroMsg.WxaLuckyMoneyLogicDetail", "loadNextPage failed. do not has more...");
      return;
    }
    x.i("MicroMsg.WxaLuckyMoneyLogicDetail", "loadNextPage load");
    this.acT = true;
    rY(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/appbrand/ui/detail/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */