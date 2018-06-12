package com.tencent.mm.ui.chatting;

import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.nw;
import com.tencent.mm.g.a.nx;
import com.tencent.mm.g.a.ov;
import com.tencent.mm.g.a.ox;
import com.tencent.mm.g.a.sm;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.modelmulti.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pluginsdk.model.app.an.a;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.x;

public final class ak
{
  public static void aH(com.tencent.mm.storage.bd parambd)
  {
    x.i("MicroMsg.ResendMsgLogic", "resendVoiceMsg, msgId:%d", new Object[] { Long.valueOf(parambd.field_msgId) });
    if (s.hB(parambd.field_talker))
    {
      localObject = new nx();
      ((nx)localObject).bYT.bGS = parambd;
      a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
      return;
    }
    Object localObject = new nw();
    ((nw)localObject).bYS.bGS = parambd;
    a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
  }
  
  public static void aI(com.tencent.mm.storage.bd parambd)
  {
    ov localov = new ov();
    long l2 = com.tencent.mm.model.bd.iD(parambd.field_talker);
    x.i("MicroMsg.ResendMsgLogic", "resendMsgImage, msgId:%d, time[%d - > %d]", new Object[] { Long.valueOf(parambd.field_msgId), Long.valueOf(parambd.field_createTime), Long.valueOf(l2) });
    long l1 = l2;
    if (l2 == parambd.field_createTime) {
      l1 = l2 + 1L;
    }
    parambd.ay(l1);
    au.HU();
    com.tencent.mm.model.c.FT().a(parambd.field_msgId, parambd);
    localov.bZP.bGS = parambd;
    a.sFg.m(localov);
  }
  
  public static void aJ(com.tencent.mm.storage.bd parambd)
  {
    x.i("MicroMsg.ResendMsgLogic", "resendEmoji, msgId:%d", new Object[] { Long.valueOf(parambd.field_msgId) });
    sm localsm = new sm();
    localsm.cdp.bGS = parambd;
    a.sFg.m(localsm);
  }
  
  public static void aK(com.tencent.mm.storage.bd parambd)
  {
    x.i("MicroMsg.ResendMsgLogic", "resendAppMsgEmoji, msgId:%d", new Object[] { Long.valueOf(parambd.field_msgId) });
    long l2 = com.tencent.mm.model.bd.iD(parambd.field_talker);
    long l1 = l2;
    if (l2 == parambd.field_createTime) {
      l1 = l2 + 1L;
    }
    parambd.ay(l1);
    au.HU();
    com.tencent.mm.model.c.FT().a(parambd.field_msgId, parambd);
    com.tencent.mm.pluginsdk.model.app.b localb = ao.asF().fH(parambd.field_msgId);
    if ((localb != null) && (localb.field_msgInfoId == parambd.field_msgId))
    {
      x.d("MicroMsg.ResendMsgLogic", "resendAppMsgEmoji, upload app attach first");
      localb.field_status = 101L;
      localb.field_offset = 0L;
      localb.field_lastModifyTime = (System.currentTimeMillis() / 1000L);
      ao.asF().c(localb, new String[0]);
      ao.cca().run();
      return;
    }
    x.d("MicroMsg.ResendMsgLogic", "resendAppMsgEmoji, directly send app mag");
    ao.cca();
    an.a.fM(parambd.field_msgId);
  }
  
  public static void aL(com.tencent.mm.storage.bd parambd)
  {
    x.i("MicroMsg.ResendMsgLogic", "resendTextMsg, msgId:%d", new Object[] { Long.valueOf(parambd.field_msgId) });
    aO(parambd);
  }
  
  public static void aM(com.tencent.mm.storage.bd parambd)
  {
    x.i("MicroMsg.ResendMsgLogic", "resendLocation, msgId:%d", new Object[] { Long.valueOf(parambd.field_msgId) });
    aO(parambd);
  }
  
  public static void aN(com.tencent.mm.storage.bd parambd)
  {
    x.i("MicroMsg.ResendMsgLogic", "resendCardMsg, msgId:%d", new Object[] { Long.valueOf(parambd.field_msgId) });
    aO(parambd);
  }
  
  private static void aO(com.tencent.mm.storage.bd parambd)
  {
    long l = parambd.field_msgId;
    if (l == -1L) {
      x.e("MicroMsg.ResendMsgLogic", "sendMsgInternal failed msgId " + l);
    }
    do
    {
      do
      {
        return;
      } while ((parambd.field_talker.equals("medianote")) && ((q.GJ() & 0x4000) == 0));
      x.d("MicroMsg.ResendMsgLogic", "sendMsgInternal, start send msgId: %d", new Object[] { Long.valueOf(l) });
      localObject = new i(l);
    } while (au.DF().a((l)localObject, 0));
    x.e("MicroMsg.ResendMsgLogic", "sendMsgInternal, doScene return false, directly mark msg to failed");
    parambd.setStatus(5);
    au.HU();
    com.tencent.mm.model.c.FT().a(parambd.field_msgId, parambd);
    Object localObject = new ox();
    ((ox)localObject).bZS.bGS = parambd;
    a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/ui/chatting/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */