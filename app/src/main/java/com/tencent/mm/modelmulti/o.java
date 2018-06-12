package com.tencent.mm.modelmulti;

import android.os.HandlerThread;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ax;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class o
  implements ar
{
  public static HashMap<Integer, h.d> cVM;
  private b eaq;
  private ax ear;
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("GetSysCmdMsgInfo".hashCode()), new h.d()
    {
      public final String[] xb()
      {
        return ax.diD;
      }
    });
  }
  
  public static p PM()
  {
    return ((com.tencent.mm.plugin.zero.b.b)g.l(com.tencent.mm.plugin.zero.b.b.class)).PM();
  }
  
  public static b PN()
  {
    g.Eg().Ds();
    if (PO().eaq == null) {
      PO().eaq = new b();
    }
    return PO().eaq;
  }
  
  public static o PO()
  {
    au.HN();
    o localo2 = (o)bs.iK(o.class.getName());
    o localo1 = localo2;
    if (localo2 == null)
    {
      localo1 = new o();
      au.HN().a(o.class.getName(), localo1);
    }
    return localo1;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final ax PL()
  {
    g.Ek();
    g.Eg().Ds();
    return this.ear;
  }
  
  public final void bn(boolean paramBoolean)
  {
    this.ear = new ax(g.Ei().dqq);
    b localb = PN();
    x.i("MicroMsg.SubCoreSync", "getChatRoomMsgService %s", new Object[] { localb });
    if (localb != null)
    {
      PO().PL().a(localb, au.Em().lnJ.getLooper());
      ((i)g.l(i.class)).bcY().a(localb.dYI, au.Em().lnJ.getLooper());
      au.Em().H(new b.2(localb));
    }
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    b localb = PO().eaq;
    if (localb != null)
    {
      x.i("MicroMsg.GetChatRoomMsgService", "clear clearList.size:%d needGetInfosMap.size:%d respList.size:%d, currentListener:%s", new Object[] { Integer.valueOf(localb.dYF.size()), Integer.valueOf(localb.dYE.size()), Integer.valueOf(localb.dSN.size()), localb.dYG });
      localb.dSR.SO();
      localb.dSS.SO();
      localb.dYF.clear();
      localb.dYE.clear();
      localb.dSN.clear();
      localb.dYG = null;
      localb.dGS = false;
      PO().PL().d(localb);
      ((i)g.l(i.class)).bcY().a(localb.dYI);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/modelmulti/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */