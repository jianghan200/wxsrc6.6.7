package com.tencent.mm.plugin.account.friend.a;

import com.tencent.mm.aq.l;
import com.tencent.mm.g.a.af;
import com.tencent.mm.g.a.af.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.i;

public final class c
  extends com.tencent.mm.sdk.b.c<af>
{
  public c()
  {
    this.sFo = af.class.getName().hashCode();
  }
  
  private static boolean a(af paramaf)
  {
    if (paramaf.bHo.bHq == 0) {}
    try
    {
      int i = q.GQ() | 0x1000;
      com.tencent.mm.kernel.g.Ei().DT().set(34, Integer.valueOf(i));
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new l("", "", "", "", "", "", "", "", i, "", ""));
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FriendBindQQ.EventListener", "doClearQQFriendHelper succ ");
      return false;
    }
    catch (Exception paramaf)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.FriendBindQQ.EventListener", paramaf, "", new Object[0]);
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/account/friend/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */