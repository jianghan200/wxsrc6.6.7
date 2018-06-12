package com.tencent.mm.plugin.hardwareopt;

import com.tencent.mm.kernel.api.bucket.c;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.hardwareopt.a.b;
import com.tencent.mm.plugin.messenger.foundation.a.o;
import com.tencent.mm.sdk.platformtools.x;

public class PluginHardwareOpt
  extends f
  implements c, b
{
  public void configure(com.tencent.mm.kernel.b.g paramg)
  {
    if (!paramg.ES()) {
      return;
    }
    x.v("MicroMsg.PluginHardwareOpt", "hy: on config");
    com.tencent.mm.kernel.g.a(com.tencent.mm.plugin.hardwareopt.a.a.a.class, new com.tencent.mm.plugin.hardwareopt.a.a());
  }
  
  public void dependency()
  {
    dependsOn(o.class);
  }
  
  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
    if (paramg.ES()) {
      x.i("MicroMsg.PluginHardwareOpt", "hy: on execute. ");
    }
  }
  
  public void installed()
  {
    alias(b.class);
  }
  
  public void onAccountInitialized(e.c paramc)
  {
    x.v("MicroMsg.PluginHardwareOpt", "hy: on onAccountInitialized");
    ((com.tencent.mm.plugin.hardwareopt.a.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.hardwareopt.a.a.a.class)).fD(false);
  }
  
  public void onAccountRelease()
  {
    x.v("MicroMsg.PluginHardwareOpt", "hy: on onAccountRelease");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/hardwareopt/PluginHardwareOpt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */