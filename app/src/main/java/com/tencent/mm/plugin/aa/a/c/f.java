package com.tencent.mm.plugin.aa.a.c;

import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.aa.a.c;
import com.tencent.mm.plugin.aa.a.i;
import com.tencent.mm.plugin.aa.a.j;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.vending.app.a;

public class f
  extends a
{
  c eBw = new c();
  com.tencent.mm.plugin.aa.a.g eBx = new com.tencent.mm.plugin.aa.a.g();
  j eBy = new j();
  
  protected final void onCreate()
  {
    super.onCreate();
    Object localObject = this.eBw.VS();
    x.i("MicroMsg.AAGetPaylistDetailLogic", "init");
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(1695, (e)localObject);
    localObject = this.eBx.VY();
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.a(1629, (e)localObject);
    this.eBy.Wb().init();
  }
  
  protected final void onDestroy()
  {
    super.onDestroy();
    Object localObject = this.eBw.VS();
    x.i("MicroMsg.AAGetPaylistDetailLogic", "unInit");
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(1695, (e)localObject);
    localObject = this.eBx.VY();
    com.tencent.mm.kernel.g.Ek();
    com.tencent.mm.kernel.g.Eh().dpP.b(1629, (e)localObject);
    this.eBy.Wb().Wa();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/aa/a/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */