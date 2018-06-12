package com.tencent.mm.plugin.luckymoney.appbrand.a;

import com.tencent.mm.protocal.c.ayj;
import com.tencent.mm.protocal.c.ayk;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends a<ayj, ayk>
{
  public b(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    ayj localayj = new ayj();
    localayj.bPS = paramString1;
    localayj.sbb = paramString2;
    localayj.sbc = com.tencent.mm.bk.b.bi(paramArrayOfByte);
    this.kKM = localayj;
  }
  
  public final int If()
  {
    return 2701;
  }
  
  protected final void bay()
  {
    x.i("MicroMsg.CgiOpenWxaHB", "CgiOpenWxaHB.onCgiStart ");
  }
  
  protected final void baz()
  {
    x.i("MicroMsg.CgiOpenWxaHB", "CgiOpenWxaHB.onCgiEnd ");
  }
  
  public final String getUri()
  {
    return "/cgi-bin/mmbiz-bin/wxahb/openwxaapphb";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/luckymoney/appbrand/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */