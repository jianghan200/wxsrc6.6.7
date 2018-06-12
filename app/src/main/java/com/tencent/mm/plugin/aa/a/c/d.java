package com.tencent.mm.plugin.aa.a.c;

import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.aa.a.l;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.vending.app.a;

public final class d
  extends a
{
  l eBp = new l();
  com.tencent.mm.plugin.aa.a.e eBq = new com.tencent.mm.plugin.aa.a.e();
  
  protected final void onCreate()
  {
    super.onCreate();
    x.i("MicroMsg.LaunchAAInteractor", "LaunchAAInteractor, onCreate");
    Object localObject = this.eBp.Wc();
    g.Ek();
    g.Eh().dpP.a(1624, (com.tencent.mm.ab.e)localObject);
    g.Ek();
    g.Eh().dpP.a(1655, (com.tencent.mm.ab.e)localObject);
    localObject = this.eBq.VX();
    x.i("MicroMsg.AAOperationData", "init");
    g.Ek();
    g.Eh().dpP.a(1698, (com.tencent.mm.ab.e)localObject);
  }
  
  protected final void onDestroy()
  {
    super.onDestroy();
    x.i("MicroMsg.LaunchAAInteractor", "LaunchAAInteractor, onDestroy");
    Object localObject = this.eBp.Wc();
    g.Ek();
    g.Eh().dpP.b(1624, (com.tencent.mm.ab.e)localObject);
    g.Ek();
    g.Eh().dpP.b(1655, (com.tencent.mm.ab.e)localObject);
    localObject = this.eBq.VX();
    x.i("MicroMsg.AAOperationData", "uninit");
    g.Ek();
    g.Eh().dpP.b(1698, (com.tencent.mm.ab.e)localObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/aa/a/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */