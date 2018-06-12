package com.tencent.mm.plugin.sns.lucky.a;

import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.sns.g.i;
import com.tencent.mm.storage.aa.a;
import java.nio.charset.Charset;

public final class k
{
  public static i h(aa.a parama)
  {
    localObject = new i();
    g.Ek();
    parama = (String)g.Ei().DT().get(parama, null);
    if (parama == null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RedDotUtil", "load: redDotList data empty");
      return (i)localObject;
    }
    for (;;)
    {
      try
      {
        i locali = (i)new i().aG(parama.getBytes(Charset.forName("ISO-8859-1")));
        parama = locali;
        if (locali != null) {}
      }
      catch (Exception localException)
      {
        try
        {
          parama = new i();
          localObject = parama;
          if (parama != null) {
            break;
          }
          return new i();
        }
        catch (Exception parama)
        {
          for (;;)
          {
            localObject = localException;
            aa.a locala = parama;
            parama = (aa.a)localObject;
          }
        }
        localException = localException;
        parama = (aa.a)localObject;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.RedDotUtil", "getRedDotList " + localException.getMessage());
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/lucky/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */