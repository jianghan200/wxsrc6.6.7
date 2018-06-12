package com.tencent.mm.plugin.messenger.foundation;

import android.database.Cursor;
import com.tencent.mm.ab.d;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.d.b;
import com.tencent.mm.ab.d.c;
import com.tencent.mm.al.b;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.be;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.platformtools.af;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.t;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.protocal.c.pm;
import com.tencent.mm.protocal.c.rd;
import com.tencent.mm.protocal.c.rj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.List;

public final class c
  implements com.tencent.mm.plugin.messenger.foundation.a.q
{
  public static void a(d.a parama, com.tencent.mm.plugin.messenger.foundation.a.s params)
  {
    by localby = parama.dIN;
    if ((10008 == af.exm) && (af.exn != 0))
    {
      x.i("MicroMsg.MessageSyncExtension", "dkmsgid  set svrmsgid %d -> %d", new Object[] { Long.valueOf(localby.rcq), Integer.valueOf(af.exn) });
      localby.rcq = Long.valueOf(af.exn).longValue();
      af.exn = 0;
    }
    if (((i)g.l(i.class)).bcY().dY(localby.rcq))
    {
      x.i("MicroMsg.MessageSyncExtension", "ignore, because reSync the deleted msg perhaps the IDC has change has swtiched");
      return;
    }
    String str1 = ab.a(localby.rcj);
    Object localObject2 = ab.a(localby.rck);
    if ((str1.equals(com.tencent.mm.model.q.GF())) && (((String)localObject2).equals("newsapp")) && (localby.jQd != 51))
    {
      x.w("MicroMsg.MessageSyncExtension", "msgid:%d type:%d this fucking msg from mac weixin ,someone send msg to newsapp at mac weixin ,givp up.", new Object[] { Long.valueOf(localby.rcq), Integer.valueOf(localby.jQd) });
      return;
    }
    long l1 = localby.rcq;
    int i = localby.rci;
    int j = localby.rcr;
    int k = localby.hcd;
    int m = localby.jQd;
    int n = localby.lOH;
    String str2 = bi.gb(localby.lOH);
    long l2 = bi.VE();
    long l3 = localby.lOH;
    int i1 = localby.rcm;
    int i2 = ab.a(localby.rcn, new byte[0]).length;
    int i3 = bi.oV(localby.rco).length();
    int i4 = bi.oV(localby.rcp).length();
    bhz localbhz = localby.rcl;
    Object localObject1 = "";
    if (localbhz == null)
    {
      label317:
      x.i("MicroMsg.MessageSyncExtension", "dkAddMsg from:%s to:%s id:[%d,%d,%d] status:%d type:%d time:[%d %s] diff:%d imgstatus:%d imgbuf:%d src:%d push:%d content:%s", new Object[] { str1, localObject2, Long.valueOf(l1), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(m), Integer.valueOf(n), str2, Long.valueOf(l2 - l3), Integer.valueOf(i1), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), bi.Xf((String)localObject1) });
      x.i("MicroMsg.MessageSyncExtension", "parseMsgSource  has been Deprecated  by dk. at 20151218 [%s] %s ", new Object[] { localby.rco, "" });
      t.h(localby);
      if (str1.equals("readerapp"))
      {
        localby.rcj = ab.oT("newsapp");
        localby.jQd = 12399999;
      }
      if (((str1.equals("blogapp")) || (str1.equals("newsapp"))) && (localby.jQd != 10002)) {
        localby.jQd = 12399999;
      }
      if (localby.jQd == 52) {
        localby.jQd = 1000052;
      }
      if (localby.jQd == 53) {
        localby.jQd = 1000053;
      }
      if ((parama != null) && (parama.dIN != null)) {
        break label917;
      }
      label589:
      i = 0;
      localObject2 = d.c.ba(Integer.valueOf(localby.jQd));
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = d.c.ba(str1);
      }
      if (localObject1 != null)
      {
        localObject2 = ((d)localObject1).b(parama);
        if (localObject2 != null) {
          break label1134;
        }
        localObject1 = null;
        label643:
        if (localObject1 != null) {
          break label1169;
        }
        x.w("MicroMsg.MessageSyncExtension", "summerbadcr extension declared but skipped msg, type=%d, svrId=%d, MsgSeq=%d, createTime=%d, addMsgInfo=%s", new Object[] { Integer.valueOf(localby.jQd), Long.valueOf(localby.rcq), Integer.valueOf(localby.rcr), Integer.valueOf(localby.lOH), parama });
        if ((parama.dIO) && (parama.dIP))
        {
          parama = ((i)g.l(i.class)).bcY().J(str1, localby.rcr);
          if (parama.field_msgId == 0L) {
            break label1144;
          }
          i = parama.field_flag;
          x.i("MicroMsg.MessageSyncExtension", "summerbadcr extension declared but skipped msg and must revised fault[%d], flag[%d], svrId[%d], msgseq[%d], createtime[%d], type[%d]", new Object[] { Long.valueOf(parama.field_msgId), Integer.valueOf(parama.field_flag), Long.valueOf(parama.field_msgSvrId), Long.valueOf(parama.field_msgSeq), Long.valueOf(parama.field_createTime), Integer.valueOf(parama.getType()) });
          if ((i & 0x1) == 0)
          {
            parama.fg(i | 0x2 | 0x1);
            ((i)g.l(i.class)).bcY().a(parama.field_msgId, parama);
          }
        }
      }
    }
    for (;;)
    {
      i = 1;
      t.b(5, localby);
      if (i != 0) {
        break;
      }
      x.f("MicroMsg.MessageSyncExtension", "unknown add msg request, type=%d. drop now !!!", new Object[] { Integer.valueOf(localby.jQd) });
      return;
      localObject1 = localbhz.siM;
      break label317;
      label917:
      localObject1 = parama.dIN;
      localObject2 = ab.a(((by)localObject1).rcj);
      localObject2 = ((i)g.l(i.class)).bcY().I((String)localObject2, ((by)localObject1).rcq);
      if ((((cm)localObject2).field_msgId == 0L) || ((((cm)localObject2).field_isSend != 0) && (((by)localObject1).rcr == 0))) {
        break label589;
      }
      i = ((cm)localObject2).field_flag;
      if (parama.dIO)
      {
        i |= 0x2;
        label1003:
        if (!parama.dIP) {
          break label1118;
        }
        i |= 0x1;
        label1014:
        if (!parama.dIQ) {
          break label1126;
        }
        i |= 0x4;
      }
      for (;;)
      {
        if (i == ((cm)localObject2).field_flag) {
          break label1132;
        }
        x.i("MicroMsg.MsgInfoStorageLogic", "summerbadcr updateMsgFlagByAddMsgInfo msgType[%d], flag new[%d], old[%d]", new Object[] { Integer.valueOf(((by)localObject1).jQd), Integer.valueOf(i), Integer.valueOf(((cm)localObject2).field_flag) });
        ((com.tencent.mm.storage.bd)localObject2).fg(i);
        ((i)g.l(i.class)).bcY().b(((cm)localObject2).field_msgSvrId, (com.tencent.mm.storage.bd)localObject2);
        break;
        i &= 0xFFFFFFFD;
        break label1003;
        label1118:
        i &= 0xFFFFFFFE;
        break label1014;
        label1126:
        i &= 0xFFFFFFFB;
      }
      label1132:
      break label589;
      label1134:
      localObject1 = ((d.b)localObject2).bGS;
      break label643;
      label1144:
      x.i("MicroMsg.MessageSyncExtension", "summerbadcr extension declared but skipped msg and must revised fault failed[%d]", new Object[] { Long.valueOf(parama.field_msgId) });
    }
    label1169:
    if ((com.tencent.mm.model.s.hj(str1)) && (!b.PD())) {}
    for (i = 1;; i = 0)
    {
      if (i == 0)
      {
        x.d("MicroMsg.MessageSyncExtension", " msg , id =" + ((cm)localObject1).field_msgId + "  " + params);
        if ((((cm)localObject1).field_msgId > 0L) && (params != null) && (((d.b)localObject2).dIR)) {
          params.a((com.tencent.mm.storage.bd)localObject1, localby);
        }
      }
      i = 1;
      break;
    }
  }
  
  public final void a(pm parampm, byte[] paramArrayOfByte, boolean paramBoolean, com.tencent.mm.plugin.messenger.foundation.a.s params)
  {
    switch (parampm.rtM)
    {
    }
    for (;;)
    {
      return;
      parampm = (by)new by().aG(paramArrayOfByte);
      if (parampm != null)
      {
        paramArrayOfByte = new d.a(parampm, false, false, false);
        a(paramArrayOfByte, params);
        if (!paramArrayOfByte.dIO)
        {
          be.a(ab.a(parampm.rcj), parampm.rcq, parampm.lOH * 1000L, parampm.jQd);
          return;
          paramArrayOfByte = (rd)new rd().aG(paramArrayOfByte);
          parampm = ab.a(paramArrayOfByte.rvi);
          int i = paramArrayOfByte.rvm;
          paramArrayOfByte = ((i)g.l(i.class)).bcY().bD(parampm, i);
          if (paramArrayOfByte.moveToFirst()) {
            while (!paramArrayOfByte.isAfterLast())
            {
              params = new com.tencent.mm.storage.bd();
              params.d(paramArrayOfByte);
              com.tencent.mm.model.bd.j(params);
              paramArrayOfByte.moveToNext();
            }
          }
          paramArrayOfByte.close();
          ((i)g.l(i.class)).bcY().bC(parampm, i);
          return;
          parampm = (rj)new rj().aG(paramArrayOfByte);
          paramArrayOfByte = parampm.rvp;
          i = 0;
          while (i < paramArrayOfByte.size())
          {
            com.tencent.mm.model.bd.p(ab.a(parampm.rvi), ((Integer)paramArrayOfByte.get(i)).intValue());
            i += 1;
          }
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/messenger/foundation/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */