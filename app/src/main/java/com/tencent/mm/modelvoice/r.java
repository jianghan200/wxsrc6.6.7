package com.tencent.mm.modelvoice;

import com.tencent.mm.ab.d;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.ab.d.b;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.s;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.bl;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.az;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class r
  implements d
{
  private static Set<c> epP = new HashSet();
  
  public static void b(c paramc)
  {
    epP.remove(paramc);
  }
  
  public static void c(c paramc)
  {
    if (!epP.contains(paramc)) {
      epP.add(paramc);
    }
  }
  
  public final d.b b(d.a parama)
  {
    by localby = parama.dIN;
    if (localby == null)
    {
      x.e("MicroMsg.VoiceMsgExtension", "onPreAddMessage cmdAM is null , give up.");
      return null;
    }
    x.i("MicroMsg.VoiceMsgExtension", "summerbadcr parseVoiceMsg srvId:" + localby.rcq);
    Object localObject2 = ab.a(localby.rcj);
    if (((String)localObject2).equals(com.tencent.mm.model.q.GF())) {}
    for (Object localObject1 = ab.a(localby.rck);; localObject1 = localObject2)
    {
      Object localObject3 = ((i)g.l(i.class)).bcY().I((String)localObject1, localby.rcq);
      if ((((cm)localObject3).field_msgId != 0L) && (((cm)localObject3).field_createTime + 604800000L < com.tencent.mm.model.bd.o((String)localObject1, localby.lOH)))
      {
        x.w("MicroMsg.VoiceMsgExtension", "dkmsgid prepareMsgInfo msg Too Old Remove it. svrid:%d", new Object[] { Long.valueOf(localby.rcq) });
        com.tencent.mm.model.bd.p((String)localObject1, localby.rcq);
        localObject3 = m.TI().bE(localby.rcq);
        if ((localObject3 != null) && (!bi.oW(((p)localObject3).fileName))) {
          q.oq(((p)localObject3).fileName);
        }
      }
      p localp = new p();
      localp.bWJ = ((String)localObject1);
      localp.createTime = localby.lOH;
      localp.bYu = localby.rcq;
      localp.cqb = localby.rco;
      x.d("MicroMsg.VoiceMsgExtension", "voiceMsgExtension, onPreAddMessage.(MsgSource : %s)", new Object[] { localby.rco });
      localObject3 = ab.a(localby.rcl);
      if (s.fq((String)localObject2))
      {
        localObject2 = com.tencent.mm.model.bd.iC((String)localObject3);
        x.i("MicroMsg.VoiceMsgExtension", "chatroom voicemsg, new content=" + (String)localObject2);
      }
      for (;;)
      {
        localObject3 = bl.z((String)localObject2, "msg");
        if (localObject3 == null)
        {
          h.mEJ.a(111L, 227L, 1L, false);
          return null;
        }
        try
        {
          localp.emu = Integer.valueOf((String)((Map)localObject3).get(".msg.voicemsg.$length")).intValue();
          localp.clientId = ((String)((Map)localObject3).get(".msg.voicemsg.$clientmsgid"));
          i = Integer.valueOf((String)((Map)localObject3).get(".msg.voicemsg.$endflag")).intValue();
          int j = Integer.valueOf((String)((Map)localObject3).get(".msg.voicemsg.$cancelflag")).intValue();
          localp.epI = Integer.valueOf((String)((Map)localObject3).get(".msg.voicemsg.$voicelength")).intValue();
          localp.enF = ((String)((Map)localObject3).get(".msg.voicemsg.$fromusername"));
          localObject2 = (String)((Map)localObject3).get(".msg.commenturl");
          localp.eoI = Integer.valueOf(bi.aG((String)((Map)localObject3).get(".msg.voicemsg.$forwardflag"), "0")).intValue();
          localp.eoB = ((String)((Map)localObject3).get(".msg.voicemsg.$voiceformat"));
          localp.epJ = bi.getLong((String)((Map)localObject3).get(".msg.voicemsg.$bufid"), 0L);
          if (j == 1)
          {
            x.v("MicroMsg.VoiceMsgExtension", "cancelFlag = 1 srvId:" + localby.rcq);
            parama = m.TI().bE(localp.bYu);
            if (parama != null) {
              q.oo(parama.fileName);
            }
            return null;
          }
        }
        catch (Exception parama)
        {
          h.mEJ.a(111L, 227L, 1L, false);
          x.e("MicroMsg.VoiceMsgExtension", "parsing voice msg xml failed");
          x.e("MicroMsg.VoiceMsgExtension", "exception:%s", new Object[] { bi.i(parama) });
          return null;
        }
        if (i == 1)
        {
          x.v("MicroMsg.VoiceMsgExtension", "endFlag = 1 srvId:" + localby.rcq);
          localp.dHI = localp.emu;
        }
        localp.bWA = 284334;
        localObject3 = ab.a(localby.rcn);
        if (localObject3 != null) {
          x.d("MicroMsg.VoiceMsgExtension", "Voice Buf Len:" + localObject3.length + " srvId:" + localby.rcq);
        }
        int i = q.a(localp, (byte[])localObject3, localby.hcd, (String)localObject2, localby.rco, parama);
        if (i > 0)
        {
          x.i("MicroMsg.VoiceMsgExtension", "summerbadcr parseVoiceMsg setRecvSync[%d], svrId[%d], msgseq[%d]", new Object[] { Integer.valueOf(i), Long.valueOf(localby.rcq), Integer.valueOf(localby.rcr) });
          h.mEJ.a(111L, 228L, 1L, false);
          localObject2 = ((i)g.l(i.class)).bcY().I(localp.bWJ, localp.bYu);
          ((com.tencent.mm.storage.bd)localObject2).Dn(0);
          localObject3 = epP.iterator();
          for (;;)
          {
            parama = (d.a)localObject2;
            if (!((Iterator)localObject3).hasNext()) {
              break;
            }
            ah.A(new r.1(this, (c)((Iterator)localObject3).next(), localp));
          }
        }
        x.i("MicroMsg.VoiceMsgExtension", "summerbadcr parseVoiceMsg setRecvSync[%d], svrId[%d], msgseq[%d], stack[%s]", new Object[] { Integer.valueOf(i), Long.valueOf(localby.rcq), Integer.valueOf(localby.rcr), bi.cjd() });
        parama = null;
        if (parama != null)
        {
          localObject2 = ((i)g.l(i.class)).FW().Yq((String)localObject1);
          if (localObject2 != null)
          {
            ((ai)localObject2).gg(16777216);
            ((i)g.l(i.class)).FW().a((ai)localObject2, (String)localObject1);
          }
        }
        if ((parama != null) && (parama.field_msgId > 0L)) {}
        for (boolean bool = true;; bool = false) {
          return new d.b(parama, bool);
        }
        localObject2 = localObject3;
      }
    }
  }
  
  public final void h(com.tencent.mm.storage.bd parambd)
  {
    x.d("MicroMsg.VoiceMsgExtension", "onPreDelMessage " + parambd.field_imgPath + " " + parambd.field_talker);
    if (!s.hB(parambd.field_talker)) {
      q.oq(parambd.field_imgPath);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/modelvoice/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */