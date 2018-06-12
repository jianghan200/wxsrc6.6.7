package com.tencent.mm.plugin.appbrand.compat;

import com.tencent.mm.ab.g.a;
import com.tencent.mm.ab.g.b;
import com.tencent.mm.g.a.fc;
import com.tencent.mm.plugin.appbrand.compat.a.d;
import com.tencent.mm.sdk.b.a;

final class b
  implements d
{
  public final void a(String paramString, g.a parama, g.b paramb)
  {
    fc localfc = new fc();
    localfc.bNi.op = 1;
    localfc.bNi.fileName = paramString;
    localfc.bNi.bNk = true;
    localfc.bNi.bCH = true;
    localfc.bNi.bNl = parama;
    localfc.bNi.bNm = paramb;
    a.sFg.m(localfc);
  }
  
  public final void pause()
  {
    fc localfc = new fc();
    localfc.bNi.op = 4;
    a.sFg.m(localfc);
  }
  
  public final void stop()
  {
    fc localfc = new fc();
    localfc.bNi.op = 2;
    a.sFg.m(localfc);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/compat/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */