package com.tencent.mm.model;

import android.content.Context;
import com.tencent.mm.a.f;
import com.tencent.mm.aa.j;
import com.tencent.mm.aa.k;
import com.tencent.mm.g.a.ao;
import com.tencent.mm.g.a.ap;
import com.tencent.mm.g.a.ap.a;
import com.tencent.mm.g.a.jy;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.chatroom.c.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.protocal.c.atj;
import com.tencent.mm.protocal.c.aub;
import com.tencent.mm.protocal.c.bo;
import com.tencent.mm.protocal.c.mx;
import com.tencent.mm.protocal.c.my;
import com.tencent.mm.protocal.c.qz;
import com.tencent.mm.protocal.c.ri;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public final class m
{
  public static f<String, String> dAF = new f(100);
  
  public static String F(List<String> paramList)
  {
    return c(paramList, -1);
  }
  
  public static boolean F(String paramString, int paramInt)
  {
    paramString = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga().ih(paramString);
    if (paramString == null) {
      return false;
    }
    return paramString.field_chatroomVersion < paramInt;
  }
  
  public static void G(String paramString, int paramInt)
  {
    af localaf = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga();
    u localu = localaf.ih(paramString);
    if (localu == null) {
      return;
    }
    com.tencent.mm.i.a.a.a locala = localu.ckQ();
    locala.type = paramInt;
    localu.a(paramString, locala, false);
    localaf.a(localu);
  }
  
  public static String K(String paramString1, String paramString2)
  {
    paramString1 = paramString2 + "#" + paramString1;
    if (dAF.ce(paramString1)) {
      return (String)dAF.get(paramString1);
    }
    return "";
  }
  
  public static String L(String paramString1, String paramString2)
  {
    paramString2 = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga().ih(paramString2);
    if (paramString2 == null) {
      return null;
    }
    return paramString2.gT(paramString1);
  }
  
  public static com.tencent.mm.storage.ab a(com.tencent.mm.storage.ab paramab, atj paramatj)
  {
    paramab.setUsername(com.tencent.mm.platformtools.ab.a(paramatj.rvo));
    paramab.dx(com.tencent.mm.platformtools.ab.a(paramatj.rvo));
    paramab.dy(com.tencent.mm.platformtools.ab.a(paramatj.rvo));
    paramab.dz(com.tencent.mm.platformtools.ab.a(paramatj.ruU));
    paramab.eJ(paramatj.eJH);
    paramab.dv(com.tencent.mm.platformtools.ab.a(paramatj.rWH));
    paramab.dC(com.tencent.mm.platformtools.ab.a(paramatj.rWI));
    paramab.dB(com.tencent.mm.platformtools.ab.a(paramatj.ruU));
    paramab.eM(paramatj.rup);
    paramab.eO(paramatj.eJL);
    paramab.dS(RegionCodeDecoder.aq(paramatj.eJQ, paramatj.eJI, paramatj.eJJ));
    paramab.dM(paramatj.eJK);
    return paramab;
  }
  
  public static void a(String paramString, u paramu, boolean paramBoolean)
  {
    paramu.ll(paramBoolean);
    ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga().c(paramu, new String[0]);
    paramu = q.GF();
    aub localaub = new aub();
    localaub.rvj = paramString;
    localaub.hbL = paramu;
    localaub.rXb = 1;
    if (paramBoolean) {}
    for (int i = 1;; i = 2)
    {
      localaub.mEc = i;
      ((i)com.tencent.mm.kernel.g.l(i.class)).FQ().b(new h.a(49, localaub));
      return;
    }
  }
  
  public static void a(String paramString1, String paramString2, String paramString3, long paramLong, int paramInt)
  {
    af localaf = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga();
    paramString1 = localaf.ih(paramString1);
    if (paramString1 == null) {
      return;
    }
    paramString1.field_chatroomVersion = paramInt;
    paramString1.field_chatroomnoticePublishTime = paramLong;
    paramString1.field_chatroomnoticeEditor = paramString3;
    paramString1.field_chatroomnotice = paramString2;
    localaf.a(paramString1);
  }
  
  public static boolean a(u paramu)
  {
    if (paramu == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChatroomMembersLogic", "updateChatroomMember error! member is null");
      return false;
    }
    boolean bool = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga().a(paramu);
    String str;
    ay localay;
    com.tencent.mm.storage.ab localab;
    if (bool)
    {
      str = paramu.field_chatroomname;
      paramu = paramu.field_roomowner;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChatroomMembersLogic", "update contact chatroom type to %d", new Object[] { Integer.valueOf(1) });
      localay = ((i)com.tencent.mm.kernel.g.l(i.class)).FR();
      localab = localay.Yg(str);
      if (((int)localab.dhP != 0) && (!bi.oW(paramu)) && (!bi.oW(q.GF())))
      {
        if (!paramu.equals(q.GF())) {
          break label142;
        }
        localab.ge(1);
      }
    }
    for (;;)
    {
      localay.a(str, localab);
      return bool;
      label142:
      localab.ge(0);
    }
  }
  
  public static boolean a(String paramString, bo parambo)
  {
    if ((!paramString.toLowerCase().endsWith("@chatroom")) || (parambo.hLg == 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChatroomMembersLogic", "AddChatroomMember: room:[" + paramString + "] listCnt:" + parambo.hLg);
    }
    ArrayList localArrayList;
    do
    {
      return false;
      localArrayList = new ArrayList();
      ay localay = ((i)com.tencent.mm.kernel.g.l(i.class)).FR();
      int i = 0;
      while (i < parambo.hLg)
      {
        Object localObject = com.tencent.mm.platformtools.ab.a(((atj)parambo.rbQ.get(i)).rvo);
        if (((atj)parambo.rbQ.get(i)).rWG == 0)
        {
          if (bi.oW((String)localObject)) {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChatroomMembersLogic", "this member name is null! chatRoomName : %s", new Object[] { paramString });
          }
        }
        else
        {
          i += 1;
          continue;
        }
        localObject = localay.Yg((String)localObject);
        if ((int)((com.tencent.mm.l.a)localObject).dhP != 0)
        {
          ((com.tencent.mm.storage.ab)localObject).Ba();
          localay.a(((ai)localObject).field_username, (com.tencent.mm.storage.ab)localObject);
        }
        for (;;)
        {
          localArrayList.add(((ai)localObject).field_username);
          break;
          localObject = a((com.tencent.mm.storage.ab)localObject, (atj)parambo.rbQ.get(i));
          localay.T((com.tencent.mm.storage.ab)localObject);
        }
      }
    } while (localArrayList.isEmpty());
    return a(paramString, localArrayList, null);
  }
  
  public static boolean a(String paramString, mx parammx)
  {
    if (parammx == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] memberData is null!");
      return false;
    }
    if (bi.oW(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] username is null!");
      return false;
    }
    if (s.fq(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] username is not personal! :%s", new Object[] { paramString });
      return false;
    }
    String str = com.tencent.mm.platformtools.ab.a(parammx.rqX);
    if (bi.oW(str))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] chatroomId is null!");
      return false;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] chatroomId:%s size:%s", new Object[] { str, Integer.valueOf(parammx.rqV.size()) });
    paramString = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga().ih(str);
    if ((paramString != null) && (parammx.rqV.size() > 0) && (paramString.Nn().contains(((my)parammx.rqV.get(0)).hbL)))
    {
      str = ((my)parammx.rqV.get(0)).hbL;
      com.tencent.mm.i.a.a.b localb = paramString.XK(str);
      if (localb != null)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChatroomMembersLogic", "oldMember contains:%s displayName:%s", new Object[] { str, localb.daA });
        localb.daC = ((my)parammx.rqV.get(0)).rrc;
        a(paramString);
      }
      for (;;)
      {
        return true;
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChatroomMembersLogic", "talker:%s oldMemberData is null!", new Object[] { str });
      }
    }
    if ((paramString != null) && (parammx.rqV.size() > 0))
    {
      paramString = new ap();
      paramString.bHX.username = ((my)parammx.rqV.get(0)).hbL;
      paramString.bHX.bHY = ((my)parammx.rqV.get(0)).rrc;
      dAF.put(str + "#" + paramString.bHX.username, paramString.bHX.bHY);
      com.tencent.mm.sdk.b.a.sFg.m(paramString);
      return false;
    }
    if (parammx.rqV.size() <= 0) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] memberData.ChatRoomMember.size() <= 0");
    }
    if (paramString != null) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChatroomMembersLogic", "[updateChatroomInviteer] oldMember is null!");
    }
    return false;
  }
  
  public static boolean a(String paramString, qz paramqz)
  {
    if ((!paramString.toLowerCase().endsWith("@chatroom")) || (paramqz.hLg == 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChatroomMembersLogic", "DelChatroomMember: room:[" + paramString + "] listCnt:" + paramqz.hLg);
      return false;
    }
    af localaf = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga();
    paramString = localaf.ih(paramString);
    List localList = u.XM(paramString.field_memberlist);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChatroomMembersLogic", "DelChatroomMember before " + localList.size());
    paramqz = paramqz.rbQ.iterator();
    while (paramqz.hasNext()) {
      localList.remove(com.tencent.mm.platformtools.ab.a(((ri)paramqz.next()).rvo));
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChatroomMembersLogic", "DelChatroomMember after " + localList.size());
    paramString.da(localList).field_displayname = F(localList);
    boolean bool = localaf.a(paramString);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChatroomMembersLogic", "delChatroomMember " + bool);
    return bool;
  }
  
  public static boolean a(String paramString1, String paramString2, mx parammx, String paramString3, com.tencent.mm.i.a.a.a parama, com.tencent.mm.sdk.b.b paramb)
  {
    if (((!paramString1.toLowerCase().endsWith("@chatroom")) && (!paramString1.toLowerCase().endsWith("@groupcard")) && (!paramString1.toLowerCase().endsWith("@talkroom"))) || (parammx.hLg == 0))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChatroomMembersLogic", "SyncAddChatroomMember: room:[" + paramString1 + "] listCnt:" + parammx.hLg);
      return false;
    }
    ay localay = ((i)com.tencent.mm.kernel.g.l(i.class)).FR();
    u localu = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga().ih(paramString1);
    if (localu != null) {
      parama.bUd = localu.ckK();
    }
    ArrayList localArrayList = new ArrayList();
    boolean bool1 = false;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChatroomMembersLogic", "SyncAddChatroomMember: room:[" + paramString1 + "] memCnt:" + parammx.hLg);
    long l = System.currentTimeMillis();
    int i = 0;
    Object localObject;
    while (i < parammx.hLg)
    {
      my localmy = (my)parammx.rqV.get(i);
      com.tencent.mm.storage.ab localab = localay.Yg(localmy.hbL);
      if (localab == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChatroomMembersLogic", "SyncAddChatroomMember memberlist username is null");
        i += 1;
      }
      else
      {
        com.tencent.mm.i.a.a.b localb = new com.tencent.mm.i.a.a.b();
        localb.userName = localmy.hbL;
        localb.daC = localmy.rrc;
        if (parammx.rqW == 0)
        {
          localb.daA = localmy.rqY;
          localb.daB = localmy.rrb;
          if (!bi.oW(localmy.rra))
          {
            j localj = com.tencent.mm.aa.q.KH().kc(localmy.hbL);
            localObject = localj;
            if (localj == null)
            {
              localObject = new j();
              ((j)localObject).username = localmy.hbL;
            }
            ((j)localObject).dHR = localmy.rqZ;
            ((j)localObject).dHQ = localmy.rra;
            ((j)localObject).csA = 3;
            if (bi.oW(localmy.rqZ)) {
              break label544;
            }
          }
        }
        label544:
        for (boolean bool2 = true;; bool2 = false)
        {
          ((j)localObject).by(bool2);
          com.tencent.mm.aa.q.KH().a((j)localObject);
          if (localu != null)
          {
            localObject = localu.XK(localmy.hbL);
            if (localObject != null)
            {
              localb.daA = ((com.tencent.mm.i.a.a.b)localObject).daA;
              localb.daB = ((com.tencent.mm.i.a.a.b)localObject).daB;
              localb.daC = ((com.tencent.mm.i.a.a.b)localObject).daC;
            }
          }
          parama.dav.add(localb);
          if ((int)localab.dhP == 0)
          {
            localab.setUsername(localmy.hbL);
            if (localmy.hcS != null) {
              localab.dx(localmy.hcS);
            }
            localab.Ba();
            localay.T(localab);
            bool1 = true;
          }
          localArrayList.add(localab.field_username);
          break;
        }
      }
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChatroomMembersLogic", "summertt SyncAddChatroomMember listUsernames size: " + localArrayList.size() + " event: " + paramb + " publish: " + bool1 + " take[" + (System.currentTimeMillis() - l) + "]ms");
    if (bool1)
    {
      com.tencent.mm.sdk.b.a.sFg.m(paramb);
      localObject = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga().ih(paramString1);
      paramb = (com.tencent.mm.sdk.b.b)localObject;
      if (localObject == null) {
        paramb = new u();
      }
      l = System.currentTimeMillis();
      paramb.field_chatroomname = paramString1;
      paramb.field_roomowner = paramString2;
      paramString2 = paramb.da(localArrayList);
      paramString2.field_displayname = F(localArrayList);
      if (parammx.rqW == 0) {
        break label875;
      }
    }
    label875:
    for (bool1 = true;; bool1 = false)
    {
      paramString2.a(paramString3, parama, bool1);
      bool1 = a(paramb);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChatroomMembersLogic", "syncAddChatroomMember replaceChatroomMember ret : %s , during : %s", new Object[] { Boolean.valueOf(bool1), Long.valueOf(System.currentTimeMillis() - l) });
      if (paramb.ckL())
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChatroomMembersLogic", "syncAddChatroomMember OldVer:%d", new Object[] { Integer.valueOf(paramb.ckK()) });
        paramString2 = new ao();
        paramString2.bHW.username = paramString1;
        com.tencent.mm.sdk.b.a.sFg.m(paramString2);
      }
      return bool1;
      if (localu != null)
      {
        u.ckM();
        break;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChatroomMembersLogic", "ChatroomId:%s is Need Update All InviteerInfo ", new Object[] { paramString1 });
      ((jy)paramb).bUc.bUd = 0;
      com.tencent.mm.sdk.b.a.sFg.m(paramb);
      break;
    }
  }
  
  public static boolean a(String paramString1, ArrayList<String> paramArrayList, String paramString2)
  {
    int i = 0;
    int k = 0;
    af localaf = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga();
    u localu = localaf.ii(paramString1);
    if (paramString1.endsWith("@chatroom")) {}
    LinkedList localLinkedList;
    int j;
    for (paramString1 = gI(paramString1);; paramString1 = new LinkedList())
    {
      localLinkedList = new LinkedList();
      if (paramString1 == null) {
        break label192;
      }
      i = 0;
      for (;;)
      {
        j = k;
        if (i >= paramString1.size()) {
          break;
        }
        localLinkedList.add(paramString1.get(i));
        i += 1;
      }
    }
    while (j < paramArrayList.size())
    {
      if (!paramString1.contains(paramArrayList.get(j))) {
        localLinkedList.add(paramArrayList.get(j));
      }
      j += 1;
    }
    if (!bi.oW(paramString2)) {
      localu.field_roomowner = paramString2;
    }
    localu.da(localLinkedList).field_displayname = F(localLinkedList);
    return localaf.a(localu);
    label192:
    while (i < paramArrayList.size())
    {
      localLinkedList.add(paramArrayList.get(i));
      i += 1;
    }
    if (!bi.oW(paramString2)) {
      localu.field_roomowner = paramString2;
    }
    localu.da(localLinkedList).field_displayname = F(localLinkedList);
    localu.field_roomowner = paramString2;
    boolean bool = localaf.a(localu);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChatroomMembersLogic", "insertMembersByChatRoomName " + bool);
    return bool;
  }
  
  public static String c(List<String> paramList, int paramInt)
  {
    if ((paramList == null) || (paramList.size() == 0)) {
      localObject2 = "";
    }
    Object localObject1;
    int i;
    do
    {
      return (String)localObject2;
      localObject1 = "";
      i = 0;
      localObject2 = localObject1;
    } while (i >= paramList.size());
    Object localObject2 = (String)paramList.get(i);
    if (((String)localObject2).length() > 0)
    {
      localObject2 = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yg((String)localObject2);
      localObject2 = (String)localObject1 + ((com.tencent.mm.storage.ab)localObject2).BL();
      if ((i == paramInt - 1) && (i < paramList.size())) {
        return (String)localObject2 + "...";
      }
      localObject1 = localObject2;
      if (i < paramList.size() - 1) {
        localObject1 = (String)localObject2 + ad.getContext().getString(c.a.chatroom_sys_msg_invite_split);
      }
    }
    for (;;)
    {
      i += 1;
      break;
    }
  }
  
  public static boolean c(String paramString, Map<String, String> paramMap)
  {
    paramString = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga().ih(paramString);
    if (paramString == null) {
      return false;
    }
    Iterator localIterator = paramString.Nn().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramMap.put(str, paramString.gT(str));
    }
    return true;
  }
  
  public static boolean gA(String paramString)
  {
    paramString = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga().ih(paramString);
    if (paramString == null) {
      return false;
    }
    return paramString.ckP();
  }
  
  public static boolean gB(String paramString)
  {
    paramString = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga().ij(paramString);
    String str = q.GF();
    return (!bi.oW(paramString)) && (!bi.oW(str)) && (paramString.equals(str));
  }
  
  public static boolean gC(String paramString)
  {
    String str = (String)com.tencent.mm.kernel.g.Ei().DT().get(2, null);
    paramString = gI(paramString);
    if (paramString == null)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChatroomMembersLogic", "getmembsersbychatroomname is null ");
      return false;
    }
    if ((paramString.size() == 0) || (!paramString.contains(str)))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChatroomMembersLogic", "getmembsersbychatroomname is list is zero or no contains user  " + paramString.size() + " ");
      return false;
    }
    return true;
  }
  
  public static boolean gD(String paramString)
  {
    if ((paramString == null) || (!paramString.toLowerCase().endsWith("@chatroom"))) {
      return false;
    }
    if (!((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga().im(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChatroomMembersLogic", "state is die");
      return true;
    }
    paramString = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga().il(paramString);
    return (paramString == null) || (paramString.size() == 0);
  }
  
  public static boolean gE(String paramString)
  {
    if ((paramString == null) || (!paramString.toLowerCase().endsWith("@chatroom"))) {
      return false;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChatroomMembersLogic", "updateFailState chatRoomName %s", new Object[] { paramString });
    af localaf = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga();
    paramString = localaf.ih(paramString);
    if (paramString == null) {
      return false;
    }
    paramString.field_roomflag = 1;
    return localaf.a(paramString);
  }
  
  public static boolean gF(String paramString)
  {
    if (!paramString.toLowerCase().endsWith("@groupcard"))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChatroomMembersLogic", "deleteWholeGroupcard: room:[" + paramString + "]");
      return false;
    }
    ay localay = ((i)com.tencent.mm.kernel.g.l(i.class)).FR();
    if (localay.Yi(paramString)) {
      localay.Ym(paramString);
    }
    for (;;)
    {
      return gH(paramString);
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChatroomMembersLogic", "deleteWholeGroupcard RoomName not exist:[" + paramString + "]");
    }
  }
  
  public static boolean gG(String paramString)
  {
    if (!paramString.toLowerCase().endsWith("@chatroom"))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChatroomMembersLogic", "deleteWholeChatroom: room:[" + paramString + "]");
      return false;
    }
    ay localay = ((i)com.tencent.mm.kernel.g.l(i.class)).FR();
    if (localay.Yi(paramString)) {
      localay.Ym(paramString);
    }
    for (;;)
    {
      return gH(paramString);
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChatroomMembersLogic", "deleteWholeChatroom RoomName not exist:[" + paramString + "]");
    }
  }
  
  private static boolean gH(String paramString)
  {
    return ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga().in(paramString);
  }
  
  public static List<String> gI(String paramString)
  {
    if (paramString == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChatroomMembersLogic", "chatroomName is null");
      return null;
    }
    if (!paramString.toLowerCase().endsWith("@chatroom"))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChatroomMembersLogic", "getMembersByChatRoomName: this is not room:[" + paramString + "]");
      return null;
    }
    return ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga().il(paramString);
  }
  
  public static List<String> gJ(String paramString)
  {
    if (!paramString.toLowerCase().endsWith("@chatroom"))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChatroomMembersLogic", "getMembersByChatRoomName: room:[" + paramString + "]");
      return null;
    }
    return ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga().il(paramString);
  }
  
  public static int gK(String paramString)
  {
    List localList = gI(paramString);
    if (localList == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChatroomMembersLogic", "getMembersByChatRoomName: get room:[" + paramString + "] members count fail");
      return 0;
    }
    return localList.size();
  }
  
  public static List<String> gL(String paramString)
  {
    int i = 0;
    if (!paramString.toLowerCase().endsWith("@chatroom"))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChatroomMembersLogic", "getOtherMembersByChatRoomName: room:[" + paramString + "]");
      return null;
    }
    paramString = gI(paramString);
    if ((paramString == null) || (paramString.size() <= 0)) {
      return null;
    }
    String str = (String)com.tencent.mm.kernel.g.Ei().DT().get(2, null);
    boolean bool;
    if ((str != null) && (str.length() > 0))
    {
      bool = true;
      Assert.assertTrue(bool);
    }
    for (;;)
    {
      if (i < paramString.size())
      {
        if (((String)paramString.get(i)).equals(str)) {
          paramString.remove(i);
        }
      }
      else
      {
        if (paramString.size() > 0) {
          return paramString;
        }
        return null;
        bool = false;
        break;
      }
      i += 1;
    }
    return paramString;
  }
  
  public static String gM(String paramString)
  {
    paramString = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga().ih(paramString);
    if (paramString == null) {
      return null;
    }
    return paramString.field_chatroomnotice;
  }
  
  public static String gN(String paramString)
  {
    paramString = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga().ih(paramString);
    if (paramString == null) {
      return null;
    }
    return paramString.field_chatroomnoticeEditor;
  }
  
  public static long gO(String paramString)
  {
    paramString = ((com.tencent.mm.plugin.chatroom.b.b)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.chatroom.b.b.class)).Ga().ih(paramString);
    if (paramString == null) {
      return -1L;
    }
    return paramString.field_chatroomnoticePublishTime;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/model/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */