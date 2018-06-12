package com.tencent.mm.storage;

import android.content.Context;
import com.tencent.mm.ac.a.b;
import com.tencent.mm.ac.a.c;
import com.tencent.mm.ac.a.d;
import com.tencent.mm.ac.a.j;
import com.tencent.mm.ac.a.k;
import com.tencent.mm.ac.z;
import com.tencent.mm.g.c.am;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.plugin.biz.b.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.f.c;
import com.tencent.mm.plugin.messenger.foundation.a.e;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;

public final class p
  implements e, com.tencent.mm.plugin.messenger.foundation.a.f
{
  private az sNS;
  
  public p(az paramaz)
  {
    z.Nm();
    this.sNS = paramaz;
    this.sNS.a(this);
    this.sNS.a(this);
  }
  
  private void a(String paramString, ai paramai, int paramInt1, int paramInt2, f.c paramc)
  {
    bd localbd;
    com.tencent.mm.ac.a.a locala;
    c localc;
    if ((paramai != null) && (paramc != null) && (paramc.hpD != -1L) && (paramai.gh(8388608)))
    {
      localbd = ((com.tencent.mm.ac.o)g.l(com.tencent.mm.ac.o.class)).FU().aq(paramString, paramc.hpD);
      locala = z.Nb().bd(paramc.hpD);
      localc = z.Na().ak(paramc.hpD);
      if (localc.field_bizChatServId == null) {
        x.w("MicroMsg.BizConversationStorage", "willen updateBizChatConversation bizChatInfo == null");
      }
    }
    else
    {
      return;
    }
    if ((localbd == null) || (localbd.field_msgId == 0L))
    {
      x.i("MicroMsg.BizConversationStorage", "update null BizChatConversation with talker " + paramString);
      locala.field_status = 0;
      locala.field_isSend = 0;
      locala.field_content = "";
      locala.field_msgType = "0";
      locala.field_unReadCount = 0;
      locala.field_digest = "";
      locala.field_digestUser = "";
      z.Nb();
      b.a(locala, paramInt2, paramInt1);
      z.Nb().b(locala);
      return;
    }
    boolean bool = localc.isGroup();
    locala.field_brandUserName = paramString;
    label231:
    Object localObject1;
    Object localObject2;
    label366:
    Object localObject3;
    if (localbd.cmh())
    {
      locala.field_content = localbd.cmH();
      localObject1 = new PString();
      this.sNS.vu().a(localbd, (PString)localObject1, new PString(), new PInt(), false);
      localObject1 = ((PString)localObject1).value;
      localObject2 = z.Nc().cz(localbd.field_bizChatUserId);
      if (!bool) {
        break label911;
      }
      if ((localbd.field_isSend != 1) || (localObject2 == null)) {
        break label839;
      }
      locala.field_digest = (ad.getContext().getString(b.b.app_me) + ":" + (String)localObject1);
      ((j)localObject2).field_userName = ad.getContext().getString(b.b.app_me);
      localObject1 = null;
      localObject2 = this.sNS.aZ(localbd.getType(), localbd.field_content);
      localObject3 = bi.oV(locala.field_digest);
      if (!bi.oW((String)localObject2)) {
        break label924;
      }
      localObject2 = "";
      label409:
      locala.field_digest = ((String)localObject3).concat((String)localObject2);
      locala.field_digestUser = "";
      locala.field_chatType = localc.field_chatType;
      locala.field_lastMsgID = localbd.field_msgId;
      if (!localbd.cmk()) {
        break label950;
      }
    }
    label463:
    label659:
    label744:
    label839:
    label911:
    label924:
    label950:
    label967:
    label1080:
    label1083:
    for (;;)
    {
      long l = localbd.field_createTime;
      locala.field_lastMsgTime = l;
      locala.field_status = localbd.field_status;
      locala.field_isSend = localbd.field_isSend;
      locala.field_msgType = Integer.toString(localbd.getType());
      locala.field_flag = b.a(locala, 1, localbd.field_createTime);
      int j = 0;
      int i;
      if ((!paramc.lcx.equals("insert")) || (paramc.lcz <= 0))
      {
        i = j;
        if (paramc.lcx.equals("update"))
        {
          i = j;
          if (locala.field_unReadCount + paramc.lcz < 0) {}
        }
      }
      else
      {
        locala.field_unReadCount += paramc.lcz;
        locala.field_newUnReadCount += paramc.lcz;
        i = j;
        if (paramc.lcz > 0)
        {
          i = j;
          if (localc.hu(1))
          {
            i = paramai.field_unReadCount - paramc.lcz;
            if (i > 0) {
              break label967;
            }
            paramai.eV(0);
            paramai.fb(paramai.field_unReadMuteCount + paramc.lcz);
            i = 1;
          }
        }
      }
      j = i;
      if (paramc.lcx.equals("insert"))
      {
        j = i;
        if (paramc.lcy.size() > 0)
        {
          j = i;
          if (localc.isGroup())
          {
            localObject2 = z.Nc().cA(localbd.field_talker);
            paramc = paramc.lcy.iterator();
            if (paramc.hasNext())
            {
              localObject3 = (bd)paramc.next();
              if ((localObject2 == null) || (((cm)localObject3).field_isSend == 1) || (!((bd)localObject3).isText()) || (!((bd)localObject3).YU((String)localObject2))) {
                break label1080;
              }
              locala.field_atCount += 1;
              paramai.fa(paramai.field_atCount + 1);
              i = 1;
            }
          }
        }
      }
      for (;;)
      {
        break label744;
        locala.field_content = localbd.field_content;
        break label231;
        if ((localObject2 != null) && (!bi.oW(((j)localObject2).field_userName)))
        {
          locala.field_digest = (((j)localObject2).field_userName + ":" + (String)localObject1);
          localObject1 = ((j)localObject2).field_userName;
          break label366;
        }
        locala.field_digest = ((String)localObject1);
        localObject1 = null;
        break label366;
        locala.field_digest = ((String)localObject1);
        localObject1 = null;
        break label366;
        localObject2 = " " + bi.oV((String)localObject2);
        break label409;
        if (localbd.field_status != 1) {
          break label1083;
        }
        l = Long.MAX_VALUE;
        break label463;
        paramai.eV(i);
        break label659;
        j = i;
        z.Nb();
        b.a(locala, paramInt2, paramInt1);
        paramc = (f.c)localObject1;
        if (bi.oW((String)localObject1)) {
          paramc = localc.gT(localbd.field_bizChatUserId);
        }
        x.i("MicroMsg.BizConversationStorage", "updateBizChatConversation brandUserName:%s, bizChatId:%s, userId:%s, displayName:%s", new Object[] { paramString, localc.field_bizChatServId, localbd.field_bizChatUserId, paramc });
        z.Nb().b(locala);
        if (j == 0) {
          break;
        }
        this.sNS.a(paramai, paramString);
        return;
      }
    }
  }
  
  public final void XJ(String paramString)
  {
    if ((paramString == null) || (!com.tencent.mm.model.s.hf(paramString)) || (!com.tencent.mm.ac.f.kM(paramString))) {}
    ai localai;
    Object localObject;
    do
    {
      do
      {
        return;
        localai = this.sNS.Yq(paramString);
      } while (localai == null);
      localObject = ((i)g.l(i.class)).FW().YD(paramString);
      localObject = ((i)g.l(i.class)).bcY().GE((String)localObject);
    } while ((localObject == null) || (((cm)localObject).field_msgId <= 0L));
    localai.aj((bd)localObject);
    localai.setContent(((cm)localObject).field_talker + ":" + ((cm)localObject).field_content);
    localai.ec(Integer.toString(((bd)localObject).getType()));
    az.b localb = this.sNS.vu();
    if (localb != null)
    {
      PString localPString1 = new PString();
      PString localPString2 = new PString();
      PInt localPInt = new PInt();
      ((bd)localObject).ep(paramString);
      ((bd)localObject).setContent(localai.field_content);
      localb.a((bd)localObject, localPString1, localPString2, localPInt, true);
      localai.ed(localPString1.value);
      localai.ee(localPString2.value);
      localai.eY(localPInt.value);
    }
    for (;;)
    {
      this.sNS.a(localai, localai.field_username);
      return;
      localai.clx();
    }
  }
  
  public final void a(bd parambd, ai paramai)
  {
    Object localObject = null;
    c localc;
    String str2;
    j localj;
    String str1;
    if ((paramai != null) && (parambd != null) && (parambd.field_bizChatId != -1L) && (paramai.gh(8388608)))
    {
      localc = z.Na().ak(parambd.field_bizChatId);
      str2 = paramai.field_digest;
      if (bi.oW(parambd.field_bizChatUserId)) {
        break label321;
      }
      localj = z.Nc().cz(parambd.field_bizChatUserId);
      if (localj == null) {
        break label201;
      }
      str1 = localj.field_userName;
      boolean bool = parambd.field_bizChatUserId.equals(z.Nc().cA(parambd.field_talker));
      if ((localj == null) || (!bool)) {
        break label207;
      }
      paramai.ed(ad.getContext().getString(b.b.app_me) + ":" + str2);
      label146:
      if (!localc.isGroup())
      {
        if ((bool) || (str1 == null) || (str1.length() <= 0) || (str1.equals(localc.field_chatName))) {
          break label258;
        }
        localc.field_chatName = str1;
        z.Na().b(localc);
      }
    }
    label201:
    label207:
    label258:
    do
    {
      return;
      str1 = null;
      break;
      if ((localj == null) || (bi.oW(localj.field_userName))) {
        break label146;
      }
      paramai.ed(localj.field_userName + ":" + str2);
      break label146;
      paramai = z.Nc().cz(localc.field_bizChatServId);
      parambd = (bd)localObject;
      if (paramai != null) {
        parambd = paramai.field_userName;
      }
    } while ((parambd == null) || (parambd.length() <= 0) || (parambd.equals(localc.field_chatName)));
    localc.field_chatName = parambd;
    z.Na().b(localc);
    return;
    label321:
    x.w("MicroMsg.BizConversationStorage", "BizChatUserId is null:%s %s", new Object[] { localc.field_bizChatServId, localc.field_chatName });
  }
  
  public final void a(bd parambd, ai paramai, boolean paramBoolean, f.c paramc)
  {
    if (paramc == null) {
      x.e("MicroMsg.BizConversationStorage", "compose notifyInfo is null");
    }
    label323:
    for (;;)
    {
      return;
      String str = paramc.talker;
      if (paramBoolean)
      {
        if ((parambd != null) && (parambd.field_isSend != 1) && ((bf.k(parambd) & 0x1) != 0))
        {
          x.i("MicroMsg.BizConversationStorage", "create a temp session conversation.");
          paramai.gf(4194304);
        }
        if ((parambd != null) && (com.tencent.mm.ac.f.eZ(str)))
        {
          x.i("MicroMsg.BizConversationStorage", "create a bitChat conversation.");
          paramai.gf(8388608);
        }
      }
      for (;;)
      {
        if ((paramc == null) || (paramc.lcy.isEmpty()) || (paramc.lcy.get(0) == null)) {
          break label323;
        }
        paramai.eX(((bd)paramc.lcy.get(0)).field_isSend);
        if (!paramc.lcx.equals("insert")) {
          break;
        }
        paramai.tay = ((bd)paramc.lcy.get(paramc.lcy.size() - 1));
        return;
        ab localab = ((i)g.l(i.class)).FR().Yg(str);
        if ((localab != null) && (localab.ckW()) && (!com.tencent.mm.l.a.gd(localab.field_type)) && (parambd != null) && (parambd.field_isSend != 1) && (!paramai.gh(4194304)) && ((paramai.field_conversationTime < z.Nm()) || ((bf.k(parambd) & 0x1) != 0)))
        {
          paramai.gf(4194304);
          x.i("MicroMsg.BizConversationStorage", "onNotifyChange is old temp session, %s", new Object[] { str });
        }
        if ((parambd != null) && (com.tencent.mm.ac.f.eZ(str)))
        {
          x.i("MicroMsg.BizConversationStorage", "onNotifyChange a bitChat conversation, %s", new Object[] { str });
          paramai.gf(8388608);
        }
      }
    }
  }
  
  public final void b(bd parambd, ai paramai, boolean paramBoolean, f.c paramc)
  {
    az localaz = ((i)g.l(i.class)).FW();
    if (paramc == null)
    {
      parambd = null;
      if ((paramc == null) || (!paramc.lcx.equals("delete")) || (paramc.lcB <= 0)) {
        break label884;
      }
    }
    label233:
    label482:
    label514:
    label602:
    label618:
    label644:
    label652:
    label884:
    for (int i = paramc.lcB;; i = 0)
    {
      if ((paramc != null) && (paramc.lcx.equals("insert")) && (paramc.lcA > 0)) {}
      for (int j = paramc.lcA;; j = 0)
      {
        ai localai;
        Object localObject1;
        String str;
        if (!bi.oW(paramai.field_parentRef))
        {
          localai = localaz.Yq(paramai.field_parentRef);
          if ((localai == null) || (!localai.gh(2097152))) {
            break label652;
          }
          if (j > 0)
          {
            if (((paramc.lcx.equals("insert")) && (paramc.lcz > 0)) || ((paramc.lcx.equals("update")) && (localai.field_unReadCount + paramc.lcz >= 0)))
            {
              localObject1 = ((i)g.l(i.class)).FR().Yg(parambd);
              if ((localObject1 == null) || (!((ab)localObject1).BD())) {
                break label602;
              }
              localai.fb(localai.field_unReadMuteCount + j);
            }
            localaz.a(paramai, i, j);
          }
          localObject1 = ((i)g.l(i.class)).FW().YD(paramai.field_parentRef);
          Object localObject2 = ((i)g.l(i.class)).bcY().GE((String)localObject1);
          if ((localObject2 == null) || (((cm)localObject2).field_msgId <= 0L)) {
            break label644;
          }
          localai.aj((bd)localObject2);
          localai.setContent(((cm)localObject2).field_talker + ":" + ((cm)localObject2).field_content);
          localai.ec(Integer.toString(((bd)localObject2).getType()));
          if (localaz.vu() != null)
          {
            localObject1 = new PString();
            PString localPString = new PString();
            PInt localPInt = new PInt();
            ((bd)localObject2).ep(paramai.field_parentRef);
            ((bd)localObject2).setContent(localai.field_content);
            localaz.vu().a((bd)localObject2, (PString)localObject1, localPString, localPInt, true);
            str = localaz.aZ(((bd)localObject2).getType(), ((cm)localObject2).field_content);
            localObject2 = bi.oV(((PString)localObject1).value);
            if (!bi.oW(str)) {
              break label618;
            }
            localObject1 = "";
            localai.ed(((String)localObject2).concat((String)localObject1));
            localai.ee(localPString.value);
            localai.eY(localPInt.value);
          }
          if (localaz.a(localai, paramai.field_parentRef) > 0)
          {
            x.d("MicroMsg.BizConversationStorage", "hakon update parent conversation's unread %s, %d", new Object[] { paramai.field_parentRef, Integer.valueOf(localai.field_unReadCount + j) });
            localaz.b(3, (m)localaz, paramai.field_parentRef);
          }
        }
        for (;;)
        {
          a(parambd, paramai, j, i, paramc);
          return;
          parambd = paramc.talker;
          break;
          localai.eV(localai.field_unReadCount + j);
          break label233;
          localObject1 = " " + bi.oV(str);
          break label482;
          localai.clx();
          break label514;
          if ((localai != null) && ("officialaccounts".equals(localai.field_username)))
          {
            if ((j > 0) && (!s.auK()) && (((paramc.lcx.equals("insert")) && (paramc.lcz > 0)) || ((paramc.lcx.equals("update")) && (localai.field_unReadCount + paramc.lcz >= 0))))
            {
              localai.eV(localai.field_unReadCount + j);
              localaz.a(localai, paramai.field_parentRef);
            }
          }
          else if ((localai != null) && ("appbrandcustomerservicemsg".equals(localai.field_username)) && (j > 0))
          {
            if (((paramc.lcx.equals("insert")) && (paramc.lcz > 0)) || ((paramc.lcx.equals("update")) && (localai.field_unReadCount + paramc.lcz >= 0))) {
              localai.eV(localai.field_unReadCount + j);
            }
            localaz.a(paramai, i, j);
            localaz.a(localai, paramai.field_parentRef);
          }
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/storage/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */