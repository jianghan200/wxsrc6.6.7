package com.tencent.mm.plugin.luckymoney.appbrand.a;

import com.tencent.mm.protocal.c.bhg;
import com.tencent.mm.protocal.c.bhh;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  extends a<bhg, bhh>
{
  public e(bhg parambhg)
  {
    this.kKM = parambhg;
  }
  
  public final int If()
  {
    return 2857;
  }
  
  protected final void bay()
  {
    x.i("MicroMsg.CgiRequestWxaHB", "CgiRequestWxaHB.onCgiStart ");
  }
  
  protected final void baz()
  {
    x.i("MicroMsg.CgiRequestWxaHB", "CgiRequestWxaHB.onCgiEnd ");
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmbiz-bin/wxahb/requestwxaapphb";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/appbrand/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */