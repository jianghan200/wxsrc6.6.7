package com.tencent.mm.bg;

import com.tencent.mm.kernel.b.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.p;
import com.tencent.mm.model.p.a;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.x;

public final class c
{
  public static m qUZ;
  public static l qVa;
  
  public static void Um(String paramString)
  {
    if (((h)g.Ef().DM()).ES()) {
      d.a(paramString, qUZ, qVa);
    }
  }
  
  public static p.a Un(String paramString)
  {
    c.2 local2 = new c.2(paramString);
    x.i("MicroMsg.PluginCompatHelper", "CompatSubCore creator %s for plugin %s", new Object[] { local2, paramString });
    return local2;
  }
  
  public static void b(String paramString, p paramp)
  {
    new c.1(paramString, paramp).alone();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/bg/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */