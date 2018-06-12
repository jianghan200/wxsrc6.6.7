package com.tencent.mm.plugin.brandservice;

import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.n;

public final class a
  implements n
{
  public static m ezn;
  public static l ezo;
  
  public static void g(int paramInt, Object paramObject)
  {
    if (paramObject == null) {}
    for (String str = "null";; str = paramObject.toString())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BrandService.BrandServiceApplication", "set config, key[%d], value[%s]", new Object[] { Integer.valueOf(paramInt), str });
      g.Ek();
      g.Ei().DT().set(paramInt, paramObject);
      return;
    }
  }
  
  public final void a(l paraml)
  {
    ezo = paraml;
  }
  
  public final void a(m paramm)
  {
    ezn = paramm;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/brandservice/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */