package com.tencent.mm.model;

import com.tencent.mm.ab.d;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.d.b;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.az;

public class e
  implements d
{
  private static final a dAq = new a((byte)0);
  
  public static void a(com.tencent.mm.plugin.messenger.foundation.a.a parama)
  {
    dAq.aI(parama);
  }
  
  public com.tencent.mm.storage.bd a(by paramby, String paramString1, String paramString2, String paramString3)
  {
    if (paramString3.equals(paramString1)) {}
    for (paramString3 = paramString2;; paramString3 = paramString1)
    {
      com.tencent.mm.storage.bd localbd = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().I(paramString3, paramby.rcq);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BaseMsgExtension", "summerbadcr dkmsgid prepareMsgInfo svrid:%d localid:%d  from:%s to:%s talker:%s", new Object[] { Long.valueOf(paramby.rcq), Long.valueOf(localbd.field_msgId), paramString1, paramString2, paramString3 });
      if ((localbd.field_msgId != 0L) && (localbd.field_createTime + 604800000L < bd.o(paramString3, paramby.lOH)))
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BaseMsgExtension", "dkmsgid prepareMsgInfo msg Too Old Remove it. svrid:%d localid:%d", new Object[] { Long.valueOf(paramby.rcq), Long.valueOf(localbd.field_msgId) });
        bd.aU(localbd.field_msgId);
        localbd.setMsgId(0L);
      }
      paramString1 = localbd;
      if (localbd.field_msgId == 0L)
      {
        paramString1 = new com.tencent.mm.storage.bd();
        paramString1.ax(paramby.rcq);
        paramString1.ay(bd.o(paramString3, paramby.lOH));
        paramString1.setType(paramby.jQd);
        paramString1.setContent(bi.Xk(bi.oV(ab.a(paramby.rcl))));
      }
      return paramString1;
    }
  }
  
  public d.b b(d.a parama)
  {
    Object localObject1 = parama.dIN;
    Object localObject2 = (String)g.Ei().DT().get(2, "");
    if (((String)localObject2).length() <= 0) {
      return null;
    }
    String str1 = ab.a(((by)localObject1).rcj);
    String str2 = ab.a(((by)localObject1).rck);
    if ((bi.oV(str1).length() <= 0) || (bi.oV(str2).length() <= 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.BaseMsgExtension", "neither from-user nor to-user can be empty");
      return null;
    }
    com.tencent.mm.storage.bd localbd = a((by)localObject1, str1, str2, (String)localObject2);
    if (localbd == null) {
      return null;
    }
    boolean bool;
    int i;
    if ((((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FZ().has(str1)) || (((String)localObject2).equals(str1)))
    {
      bool = true;
      if (!bool) {
        break label344;
      }
      localbd.eX(1);
      localbd.ep(str2);
      i = ((by)localObject1).hcd;
      label163:
      localbd.setStatus(i);
      if (((by)localObject1).jQd == 10000) {
        localbd.setStatus(4);
      }
      localbd.dt(((by)localObject1).rco);
      if (localbd.YU(q.GF()))
      {
        localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().Yq(localbd.field_talker);
        if (localObject2 != null)
        {
          ((ai)localObject2).gg(16777216);
          ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FW().a((ai)localObject2, localbd.field_talker);
        }
      }
      dAq.a(parama, localbd, str1, str2, bool);
      if (localbd.field_msgId != 0L) {
        break label380;
      }
      bd.a(localbd, parama);
      localbd.setMsgId(bd.i(localbd));
    }
    for (localObject1 = new d.b(localbd, true);; localObject1 = new d.b(localbd, false))
    {
      dAq.b(parama, localbd, str1, str2, bool);
      return (d.b)localObject1;
      bool = false;
      break;
      label344:
      localbd.eX(0);
      localbd.ep(str1);
      if (((by)localObject1).hcd > 3)
      {
        i = ((by)localObject1).hcd;
        break label163;
      }
      i = 3;
      break label163;
      label380:
      ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).bcY().b(((by)localObject1).rcq, localbd);
    }
  }
  
  public void h(com.tencent.mm.storage.bd parambd) {}
  
  private static final class a
    extends com.tencent.mm.by.a<com.tencent.mm.plugin.messenger.foundation.a.a>
    implements com.tencent.mm.plugin.messenger.foundation.a.a
  {
    public final void a(d.a parama, com.tencent.mm.storage.bd parambd, String paramString1, String paramString2, boolean paramBoolean)
    {
      a(new e.a.1(this, parama, parambd, paramString1, paramString2, paramBoolean));
    }
    
    public final void b(d.a parama, com.tencent.mm.storage.bd parambd, String paramString1, String paramString2, boolean paramBoolean)
    {
      a(new e.a.2(this, parama, parambd, paramString1, paramString2, paramBoolean));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */