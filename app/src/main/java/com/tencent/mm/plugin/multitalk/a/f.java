package com.tencent.mm.plugin.multitalk.a;

import android.content.Context;
import android.util.Base64;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.m;
import com.tencent.mm.model.q;
import com.tencent.mm.platformtools.ab;
import com.tencent.mm.plugin.multitalk.b.a;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.w;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.common.b.a.a.bb;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.pb.talkroom.sdk.d;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class f
{
  private Map<String, Long> ltQ = new ConcurrentHashMap();
  
  final void a(String paramString, d.a parama)
  {
    String str = ab.a(parama.dIN.rcl);
    paramString = Base64.decode(paramString.getBytes(), 0);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "receive banner msg:" + str + " buffer len " + paramString.length);
    Object localObject1;
    Object localObject2;
    try
    {
      localObject1 = (a.bb)com.google.a.a.e.a(new a.bb(), paramString, paramString.length);
      if (localObject1 == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "parse  bannerinfo  is null! xml:" + str);
        return;
      }
      if ((this.ltQ.get(((a.bb)localObject1).groupId) == null) || (((Long)this.ltQ.get(((a.bb)localObject1).groupId)).longValue() < ((a.bb)localObject1).vgb))
      {
        this.ltQ.put(((a.bb)localObject1).groupId, Long.valueOf(((a.bb)localObject1).vgb));
        parama = parama.dIN;
        paramString = ab.a(parama.rcj);
        parama = ab.a(parama.rck);
        au.HU();
        localObject2 = (String)com.tencent.mm.model.c.DT().get(2, null);
        if (localObject2 != null) {
          break label285;
        }
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "userName is null");
        return;
      }
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "parse  bannerinfo  failure! xml:" + str, new Object[] { paramString.getMessage() });
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "msg for this groupId : " + ((a.bb)localObject1).groupId + " is early than last msg, so we do not process,now return.");
    return;
    label285:
    int i;
    int j;
    label346:
    int k;
    if (((String)localObject2).equals(paramString))
    {
      paramString = parama;
      Object localObject3 = ((a.bb)localObject1).vfZ;
      Object localObject4;
      a.av[] arrayOfav;
      int m;
      int n;
      if (((a.bb)localObject1).vfY == 1)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "get WxVoiceBannerBegin,show bar!");
        localObject4 = ((a.bb)localObject1).vga;
        arrayOfav = ((a.bb)localObject1).vea;
        i = 0;
        parama = "";
        m = arrayOfav.length;
        j = 0;
        if (j < m)
        {
          a.av localav = arrayOfav[j];
          parama = parama + localav.vez + ",";
          k = i;
          if (localav.vez != null)
          {
            k = i;
            if (localav.vez.equals(localObject2))
            {
              com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "in voiceGroupMem!");
              k = 1;
            }
          }
        }
        else
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "memberUserNames :" + parama);
          m = 0;
          n = localObject4.length;
          j = 0;
          label460:
          k = m;
          if (j < n)
          {
            parama = localObject4[j];
            if ((parama == null) || (!parama.equals(localObject2))) {
              break label1485;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "isInvitedNotFriend true! In invitelist and with talk creator is not friend!");
            k = 1;
          }
          if (i == 0)
          {
            o.bgP().HL(paramString);
            o.bgP().bgy().remove(paramString);
            if (!((String)localObject2).equals(localObject3)) {
              break label612;
            }
            o.bgN().b(paramString, (String)localObject3, false, false);
          }
          for (;;)
          {
            o.bgP().a(paramString, (a.bb)localObject1);
            o.bgM().lta.bg(bi.f((Integer)au.HS().get(1)), q.GF());
            return;
            if ((o.bgP().bgy().contains(paramString)) || (k == 0)) {
              break;
            }
            o.bgP().bgy().add(paramString);
            break;
            label612:
            if ((i != 0) && (k == 0)) {
              o.bgN().b(paramString, (String)localObject3, false, false);
            } else if ((i != 0) && (k != 0)) {
              o.bgN().b(paramString, (String)localObject3, true, true);
            } else {
              o.bgN().b(paramString, (String)localObject3, true, false);
            }
          }
        }
      }
      else
      {
        if (((a.bb)localObject1).vfY == 2)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "WxVoiceBannerMemChange!2,member size : " + ((a.bb)localObject1).vea.length);
          localObject3 = ((a.bb)localObject1).vga;
          localObject4 = ((a.bb)localObject1).vea;
          i = 0;
          parama = "";
          m = localObject4.length;
          j = 0;
          label735:
          if (j < m)
          {
            arrayOfav = localObject4[j];
            parama = parama + arrayOfav.vez + ",";
            k = i;
            if (arrayOfav.vez == null) {
              break label1494;
            }
            k = i;
            if (!arrayOfav.vez.equals(localObject2)) {
              break label1494;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "in voiceGroupMem!");
            k = 1;
            break label1494;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "memberUserNames :" + parama);
          m = 0;
          n = localObject3.length;
          j = 0;
          label849:
          k = m;
          if (j < n)
          {
            parama = localObject3[j];
            if ((parama == null) || (!parama.equals(localObject2))) {
              break label1506;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "isInvitedNotFriend true! In invitelist and with talk creator is not friend!");
            k = 1;
          }
          if (i == 0)
          {
            if ((!o.bgP().HM(paramString)) && (o.bgP().bgy().contains(paramString)) && (o.bgP().dL(paramString, (String)localObject2)))
            {
              o.bgN();
              e.Hz(paramString);
            }
            o.bgP().HL(paramString);
            o.bgP().bgy().remove(paramString);
          }
          for (;;)
          {
            o.bgM().lta.bg(bi.f((Integer)au.HS().get(1)), q.GF());
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "WxVoiceBannerMemChange setWxUinAndUsrName:");
            parama = o.bgP();
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiTalkRoomListMsg", "updateBanner  wxGroupId = %s", new Object[] { paramString });
            localObject2 = o.bgJ().HO(paramString);
            if (localObject2 == null) {
              break label1136;
            }
            if (((com.tencent.mm.ax.f)localObject2).field_roomId == ((a.bb)localObject1).oLB) {
              break;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiTalkRoomListMsg", "roomid has changed! now return!multiTalkInfo.field_roomId:" + ((com.tencent.mm.ax.f)localObject2).field_roomId + "bannerinfo.roomid:" + ((a.bb)localObject1).oLB);
            return;
            if ((!o.bgP().bgy().contains(paramString)) && (k != 0)) {
              o.bgP().bgy().add(paramString);
            }
          }
          if (!g.c(paramString, (a.bb)localObject1))
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MultiTalkRoomListMsg", "update multiTalkMember failure!");
            return;
          }
          parama.HN(paramString);
          return;
          label1136:
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiTalkRoomListMsg", "change,still show banner.");
          parama.a(paramString, (a.bb)localObject1);
          return;
        }
        if (((a.bb)localObject1).vfY == 0)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "get WxVoiceBannerEnd,dismiss bar!");
          if ((!o.bgP().HM(paramString)) && (o.bgP().bgy().contains(paramString)) && (o.bgP().dL(paramString, (String)localObject2)))
          {
            o.bgN();
            e.Hz(paramString);
          }
          parama = o.bgN();
          localObject1 = new bd();
          ((bd)localObject1).setType(64);
          ((bd)localObject1).ay(System.currentTimeMillis());
          ((bd)localObject1).setStatus(6);
          ((bd)localObject1).setContent(ad.getContext().getString(R.l.multitalk_system_master_multi_finish_msg));
          if (m.gC(paramString))
          {
            ((bd)localObject1).ep(paramString);
            ((bd)localObject1).setContent(((cm)localObject1).field_content);
            au.HU();
            com.tencent.mm.model.c.FT().T((bd)localObject1);
          }
          if ((parama.ltF != null) && (paramString.equals(parama.ltF.vgo)) && (!parama.ltH.ciq()))
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MT.MultiTalkManager", "multiTalkGroupTmp wxGroupId equals this wxGroupId.");
            parama.ltF = null;
            parama.ltG = 0L;
            parama.ltH.SO();
          }
          o.bgP().HK(paramString);
          o.bgP().HL(paramString);
          o.bgP().bgy().remove(paramString);
          return;
        }
        if (((a.bb)localObject1).vfY == 3)
        {
          paramString = ((a.bb)localObject1).vea;
          j = paramString.length;
          i = 0;
        }
      }
    }
    for (;;)
    {
      if (i < j)
      {
        parama = paramString[i];
        if ((parama.vez != null) && (parama.vez.equals(localObject2)))
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "wxVoiceBannerWaitTimeOut in voiceGroupMem!");
          break label1515;
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SubCoreMultiTalk.MultiTalkMsgRecevie", "get bannerinfo voicestatus is invalidate!: voicestatus:" + ((a.bb)localObject1).vfY);
        }
      }
      else
      {
        return;
        j += 1;
        i = k;
        break label346;
        break;
        label1485:
        j += 1;
        break label460;
        label1494:
        j += 1;
        i = k;
        break label735;
        label1506:
        j += 1;
        break label849;
      }
      label1515:
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/multitalk/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */