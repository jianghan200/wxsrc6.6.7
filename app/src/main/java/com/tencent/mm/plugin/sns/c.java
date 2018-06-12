package com.tencent.mm.plugin.sns;

import com.tencent.mm.g.a.fg;
import com.tencent.mm.g.a.fg.a;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends com.tencent.mm.sdk.b.c<fg>
{
  public c()
  {
    this.sFo = fg.class.getName().hashCode();
  }
  
  private boolean a(fg paramfg)
  {
    if (!(paramfg instanceof fg))
    {
      x.f("MicroMsg.ExtStartSnsServerAndCallbackOnFpSetSizeEventListener", "mismatched event");
      return false;
    }
    am.a locala = af.bye();
    locala.a(paramfg.bNs.type, paramfg.bNs.username, new c.1(this, paramfg));
    locala.a(1, paramfg.bNs.username, paramfg.bNs.bNu, paramfg.bNs.bNv);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */