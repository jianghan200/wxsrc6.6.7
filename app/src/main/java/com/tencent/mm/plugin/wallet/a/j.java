package com.tencent.mm.plugin.wallet.a;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.sv;
import com.tencent.mm.g.a.sv.a;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.c.a.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.x;

public final class j
  extends c<sv>
{
  public j()
  {
    this.sFo = sv.class.getName().hashCode();
  }
  
  private static void a(sv paramsv, e parame)
  {
    x.i("MicroMsg.HandleWCPayWalletBufferListener", "do check pay jsapi");
    g.Ek();
    g.Eh().dpP.a(1767, parame);
    paramsv = paramsv.cdI;
    x.i("MicroMsg.HandleWCPayWalletBufferListener", "appId: %s, \nnonce: %s, \ntimestamp: %s, \npackage: %s, \nsign: %s, \nsignType: %s, \nurl: %s", new Object[] { paramsv.appId, paramsv.nonceStr, paramsv.bJT, paramsv.cdK, paramsv.cdL, paramsv.signType, paramsv.url });
    paramsv = new a(paramsv.appId, paramsv.nonceStr, paramsv.bJT, paramsv.cdK, paramsv.cdL, paramsv.signType, paramsv.url);
    g.Ek();
    g.Eh().dpP.a(paramsv, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */