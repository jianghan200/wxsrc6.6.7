package com.tencent.mm.plugin.account.a;

import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  implements n
{
  public static volatile m ezn;
  public static volatile l ezo;
  
  public final void a(l paraml)
  {
    x.i("MicroMsg.AccountSyncApplication", "regitMMModelCallback %s", new Object[] { paraml });
    ezo = paraml;
  }
  
  public final void a(m paramm)
  {
    ezn = paramm;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */