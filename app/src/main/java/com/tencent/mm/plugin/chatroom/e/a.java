package com.tencent.mm.plugin.chatroom.e;

import com.tencent.mm.ab.d.a;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bv.a;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  implements bv.a
{
  public final void a(d.a parama)
  {
    int i = 1;
    by localby = parama.dIN;
    String str1;
    String str2;
    com.tencent.mm.storage.bd localbd;
    if (localby.jQd == 10002)
    {
      str1 = ab.a(localby.rcl);
      if (bi.oW(str1))
      {
        x.w("MicroMsg.ChatroomAccessVerifySysCmdMsgListener", "msg content is null");
        return;
      }
      str2 = ab.a(localby.rcj);
      au.HU();
      localbd = c.FT().I(str2, localby.rcq);
      if (localbd.field_msgId <= 0L) {
        break label214;
      }
    }
    for (;;)
    {
      localbd.ax(localby.rcq);
      localbd.ay(com.tencent.mm.model.bd.o(str2, localby.lOH));
      localbd.setType(10002);
      localbd.setContent(str1);
      localbd.eX(0);
      localbd.ep(str2);
      localbd.dt(localby.rco);
      localbd.eC(localbd.cqa & 0xFF7F);
      com.tencent.mm.model.bd.a(localbd, parama);
      if (i == 0)
      {
        com.tencent.mm.model.bd.i(localbd);
        return;
      }
      au.HU();
      c.FT().b(localby.rcq, localbd);
      return;
      x.i("MicroMsg.ChatroomAccessVerifySysCmdMsgListener", "not new xml type:%d ", new Object[] { Integer.valueOf(localby.jQd) });
      return;
      label214:
      i = 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/chatroom/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */