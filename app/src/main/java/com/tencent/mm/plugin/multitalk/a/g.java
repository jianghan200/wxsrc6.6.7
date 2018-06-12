package com.tencent.mm.plugin.multitalk.a;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.tencent.mm.g.a.mz;
import com.tencent.mm.model.au;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.voip.model.i;
import com.tencent.mm.plugin.voip.ui.h;
import com.tencent.mm.pluginsdk.o.b;
import com.tencent.mm.pluginsdk.o.c;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.pb.common.b.a.a.av;
import com.tencent.pb.common.b.a.a.bb;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g
  implements o.c
{
  private List<o.b> avD = new ArrayList();
  private ag handler = new ag(Looper.getMainLooper());
  private LinkedList<String> ltR = null;
  private LinkedList<String> ltS = new LinkedList();
  private LinkedList<String> ltT = new LinkedList();
  
  private static boolean b(String paramString, a.bb parambb)
  {
    int i = 0;
    if (parambb == null) {
      return false;
    }
    com.tencent.mm.ax.f localf = new com.tencent.mm.ax.f();
    localf.field_wxGroupId = paramString;
    localf.field_groupId = parambb.groupId;
    localf.field_roomId = parambb.oLB;
    localf.field_roomKey = parambb.oLC;
    localf.field_routeId = parambb.vcN;
    localf.field_inviteUserName = parambb.vfZ;
    parambb = parambb.vea;
    if (parambb.length > 0) {
      i = parambb.length;
    }
    localf.field_memberCount = i;
    localf.field_createTime = System.currentTimeMillis();
    if (o.bgJ().HO(paramString) == null) {
      return o.bgJ().a(localf);
    }
    return o.bgJ().b(localf);
  }
  
  static boolean c(String paramString, a.bb parambb)
  {
    boolean bool2;
    if (parambb == null)
    {
      bool2 = false;
      return bool2;
    }
    a.av[] arrayOfav = parambb.vea;
    LinkedList localLinkedList1 = new LinkedList();
    int j = arrayOfav.length;
    int i = 0;
    while (i < j)
    {
      localLinkedList1.add(arrayOfav[i].vez);
      i += 1;
    }
    au.HU();
    String str = (String)com.tencent.mm.model.c.DT().get(2, null);
    if (str == null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiTalkRoomListMsg", "myUserName is null , go save delete all logic.");
      b(paramString, parambb);
      return true;
    }
    Object localObject1 = o.bgK().HP(paramString);
    LinkedList localLinkedList2 = new LinkedList();
    parambb = null;
    Object localObject2 = ((List)localObject1).iterator();
    label124:
    if (((Iterator)localObject2).hasNext())
    {
      localObject1 = (com.tencent.mm.plugin.multitalk.b.b)((Iterator)localObject2).next();
      localLinkedList2.add(((com.tencent.mm.plugin.multitalk.b.b)localObject1).field_userName);
      if (!((com.tencent.mm.plugin.multitalk.b.b)localObject1).field_userName.equals(str)) {
        break label769;
      }
      parambb = (a.bb)localObject1;
    }
    label769:
    for (;;)
    {
      break label124;
      if ((parambb != null) && (localLinkedList1.contains(str)))
      {
        j = arrayOfav.length;
        i = 0;
        for (bool1 = true;; bool1 = bool2)
        {
          bool2 = bool1;
          if (i >= j) {
            break;
          }
          localObject1 = arrayOfav[i];
          bool2 = bool1;
          if (((a.av)localObject1).vez != null)
          {
            bool2 = bool1;
            if (((a.av)localObject1).vez.equals(str))
            {
              bool2 = bool1;
              if (((a.av)localObject1).status != parambb.field_status)
              {
                localObject2 = new com.tencent.mm.plugin.multitalk.b.b();
                ((com.tencent.mm.plugin.multitalk.b.b)localObject2).field_wxGroupId = paramString;
                ((com.tencent.mm.plugin.multitalk.b.b)localObject2).field_inviteUserName = ((a.av)localObject1).vfE;
                ((com.tencent.mm.plugin.multitalk.b.b)localObject2).field_memberUuid = ((a.av)localObject1).qXJ;
                ((com.tencent.mm.plugin.multitalk.b.b)localObject2).field_userName = ((a.av)localObject1).vez;
                ((com.tencent.mm.plugin.multitalk.b.b)localObject2).field_status = ((a.av)localObject1).status;
                if (!o.bgK().a((com.tencent.mm.plugin.multitalk.b.b)localObject2))
                {
                  com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers update myself failure! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", new Object[] { paramString, ((a.av)localObject1).vez, Long.valueOf(((com.tencent.mm.plugin.multitalk.b.b)localObject2).field_memberUuid), ((com.tencent.mm.plugin.multitalk.b.b)localObject2).field_inviteUserName });
                  bool1 = false;
                }
                com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers update myself success! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", new Object[] { paramString, ((a.av)localObject1).vez, Long.valueOf(((com.tencent.mm.plugin.multitalk.b.b)localObject2).field_memberUuid), ((com.tencent.mm.plugin.multitalk.b.b)localObject2).field_inviteUserName });
                bool2 = bool1;
              }
            }
          }
          i += 1;
        }
      }
      bool2 = true;
      j = arrayOfav.length;
      i = 0;
      for (boolean bool1 = bool2; i < j; bool1 = bool2)
      {
        parambb = arrayOfav[i];
        bool2 = bool1;
        if (!localLinkedList2.contains(parambb.vez))
        {
          localObject1 = new com.tencent.mm.plugin.multitalk.b.b();
          ((com.tencent.mm.plugin.multitalk.b.b)localObject1).field_wxGroupId = paramString;
          ((com.tencent.mm.plugin.multitalk.b.b)localObject1).field_inviteUserName = parambb.vfE;
          ((com.tencent.mm.plugin.multitalk.b.b)localObject1).field_memberUuid = parambb.qXJ;
          ((com.tencent.mm.plugin.multitalk.b.b)localObject1).field_userName = parambb.vez;
          ((com.tencent.mm.plugin.multitalk.b.b)localObject1).field_status = parambb.status;
          if (!o.bgK().a((com.tencent.mm.plugin.multitalk.b.b)localObject1))
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers save multiTalkMember failure! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", new Object[] { paramString, parambb.vez, Long.valueOf(((com.tencent.mm.plugin.multitalk.b.b)localObject1).field_memberUuid), ((com.tencent.mm.plugin.multitalk.b.b)localObject1).field_inviteUserName });
            bool1 = false;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers save multiTalkMember success! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", new Object[] { paramString, parambb.vez, Long.valueOf(((com.tencent.mm.plugin.multitalk.b.b)localObject1).field_memberUuid), ((com.tencent.mm.plugin.multitalk.b.b)localObject1).field_inviteUserName });
          bool2 = bool1;
        }
        i += 1;
      }
      parambb = localLinkedList2.iterator();
      for (;;)
      {
        bool2 = bool1;
        if (!parambb.hasNext()) {
          break;
        }
        localObject1 = (String)parambb.next();
        bool2 = bool1;
        if (!localLinkedList1.contains(localObject1))
        {
          if (o.bgK().ca(paramString, (String)localObject1))
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers delete success for wxGroupId = " + paramString + ", username = " + (String)localObject1);
          }
          else
          {
            bool2 = false;
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MultiTalkRoomListMsg", "updateMultiTalkMembers delete fail for wxGroupId = " + paramString + ", username = " + (String)localObject1);
          }
        }
        else {
          bool1 = bool2;
        }
      }
    }
  }
  
  public final void HB(String paramString)
  {
    if ((s.fq(paramString)) && (HD(paramString)))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiTalkRoomListMsg", "isKicked! now clean banner and check if i am in multitalk.");
      au.HU();
      com.tencent.mm.model.c.DT().get(2, null);
      if ((o.bgN().ltt != null) && (o.bgN().ltt.vgo.equals(paramString)))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiTalkRoomListMsg", "yes i am now in multitalk so i exit now!");
        o.bgN().g(false, false, false);
      }
      this.handler.postDelayed(new g.1(this, paramString), 2000L);
    }
  }
  
  public final boolean HC(String paramString)
  {
    com.tencent.mm.ax.f localf = o.bgJ().HO(paramString);
    if ((localf != null) && (localf.field_wxGroupId != null) && (localf.field_wxGroupId.equals(paramString)))
    {
      if (System.currentTimeMillis() - localf.field_createTime > 21600000L)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiTalkRoomListMsg", "wxGroupId:" + paramString + ",is out of time 6 hours..");
        HK(paramString);
      }
    }
    else {
      return false;
    }
    return true;
  }
  
  public final boolean HD(String paramString)
  {
    if (this.ltR == null) {
      bgB();
    }
    return (this.ltR != null) && (this.ltR.contains(paramString));
  }
  
  public final List<String> HE(String paramString)
  {
    Object localObject = o.bgK().HP(paramString);
    paramString = new LinkedList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramString.add(((com.tencent.mm.plugin.multitalk.b.b)((Iterator)localObject).next()).field_userName);
    }
    return paramString;
  }
  
  public final boolean HF(String paramString)
  {
    Object localObject1 = i.bJJ();
    if (localObject1 != null)
    {
      Object localObject2 = ((com.tencent.mm.plugin.voip.ui.g)localObject1).intent;
      if (localObject2 != null)
      {
        localObject2 = ((Intent)localObject2).getStringExtra("enterMainUiWxGroupId");
        localObject1 = ((com.tencent.mm.plugin.voip.ui.g)localObject1).oSM;
        if ((!com.tencent.pb.common.c.g.isEmpty((String)localObject2)) && (paramString.equals(localObject2)) && (localObject1 != null) && (((h)localObject1).getVisibility() == 0) && (((h)localObject1).isShown())) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final boolean HG(String paramString)
  {
    paramString = o.bgJ().HO(paramString);
    if (paramString != null) {
      return com.tencent.wecall.talkroom.model.a.cHu().a(paramString.field_groupId, paramString.field_roomId, paramString.field_roomKey, 1);
    }
    return false;
  }
  
  public final void HH(String paramString)
  {
    if (this.ltS == null)
    {
      this.ltS = new LinkedList();
      if (!this.ltS.contains(paramString)) {
        this.ltS.add(paramString);
      }
    }
    while (this.ltS.contains(paramString)) {
      return;
    }
    this.ltS.add(paramString);
  }
  
  public final boolean HI(String paramString)
  {
    paramString = o.bgJ().HO(paramString);
    if (paramString != null) {
      return o.bgM().lta.HI(paramString.field_groupId);
    }
    return false;
  }
  
  public final boolean HJ(String paramString)
  {
    com.tencent.mm.ax.f localf = o.bgJ().HO(paramString);
    if (localf != null)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MultiTalkRoomListMsg", "enterMultiTalk, roomid:" + localf.field_roomId + " wxgroupid:" + paramString);
      return o.bgM().lta.a(localf.field_groupId, localf.field_roomId, localf.field_roomKey, localf.field_routeId, paramString);
    }
    return false;
  }
  
  public final void HK(String paramString)
  {
    if (com.tencent.pb.common.c.g.isNullOrEmpty(paramString))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MultiTalkRoomListMsg", "cleanBanner failure ! wxGroupId is null or empty!");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiTalkRoomListMsg", "cleanBanner  wxGroupId = %s", new Object[] { paramString });
    jy(paramString);
    o.bgK().jy(paramString);
    HN(paramString);
  }
  
  public final void HL(String paramString)
  {
    if (this.ltS == null)
    {
      this.ltS = new LinkedList();
      return;
    }
    this.ltS.remove(paramString);
  }
  
  public final boolean HM(String paramString)
  {
    if (this.ltS == null) {
      return false;
    }
    return this.ltS.contains(paramString);
  }
  
  final void HN(String paramString)
  {
    Iterator localIterator = this.avD.iterator();
    while (localIterator.hasNext())
    {
      o.b localb = (o.b)localIterator.next();
      this.handler.post(new g.2(this, localb, paramString));
    }
  }
  
  public final com.tencent.mm.ax.f HO(String paramString)
  {
    return o.bgJ().HO(paramString);
  }
  
  public final void a(o.b paramb)
  {
    try
    {
      this.avD.add(paramb);
      return;
    }
    finally
    {
      paramb = finally;
      throw paramb;
    }
  }
  
  public final void a(String paramString, a.bb parambb)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiTalkRoomListMsg", "showBanner  wxGroupId = %s", new Object[] { paramString });
    if (parambb != null)
    {
      a.av[] arrayOfav = parambb.vea;
      if ((arrayOfav != null) && (arrayOfav.length > 0))
      {
        o.bgK().jy(paramString);
        int j = arrayOfav.length;
        int i = 0;
        while (i < j)
        {
          a.av localav = arrayOfav[i];
          com.tencent.mm.plugin.multitalk.b.b localb = new com.tencent.mm.plugin.multitalk.b.b();
          localb.field_wxGroupId = paramString;
          localb.field_inviteUserName = localav.vfE;
          localb.field_memberUuid = localav.qXJ;
          localb.field_userName = localav.vez;
          localb.field_status = localav.status;
          if (!o.bgK().a(localb)) {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MultiTalkRoomListMsg", "save multiTalkMember failure! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", new Object[] { paramString, localav.vez, Long.valueOf(localb.field_memberUuid), localb.field_inviteUserName });
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiTalkRoomListMsg", "save multiTalkMember success! wxGroupId = %s,userName = %s,field_memberUuid = %d,multiTalkMember.field_inviteUserName = %s", new Object[] { paramString, localav.vez, Long.valueOf(localb.field_memberUuid), localb.field_inviteUserName });
          i += 1;
        }
      }
    }
    if (b(paramString, parambb))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiTalkRoomListMsg", "addwxGroupIdInMap:" + paramString);
      if (this.ltR == null) {
        break label287;
      }
      if (!this.ltR.contains(paramString)) {
        this.ltR.add(paramString);
      }
    }
    for (;;)
    {
      HN(paramString);
      return;
      label287:
      bgB();
      if (this.ltR != null) {
        this.ltR.add(paramString);
      }
    }
  }
  
  public final void b(o.b paramb)
  {
    try
    {
      this.avD.remove(paramb);
      return;
    }
    finally
    {
      paramb = finally;
      throw paramb;
    }
  }
  
  public final boolean bgA()
  {
    return (com.tencent.mm.plugin.voip.b.d.bLT()) || (o.bgN().bgn()) || (o.bgN().bgl()) || (o.bgN().bgm());
  }
  
  public final void bgB()
  {
    Object localObject = o.bgJ().bgR();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiTalkRoomListMsg", "setMultitalkingwxGroupIdMap reset!");
    this.ltR = new LinkedList();
    localObject = ((LinkedList)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      com.tencent.mm.ax.f localf = (com.tencent.mm.ax.f)((Iterator)localObject).next();
      this.ltR.add(localf.field_wxGroupId);
    }
    localObject = new mz();
    ((mz)localObject).bYb.type = 1;
    com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
  }
  
  public final boolean bgl()
  {
    return o.bgN().bgl();
  }
  
  public final boolean bgn()
  {
    return o.bgN().bgn();
  }
  
  public final LinkedList<String> bgy()
  {
    if (this.ltT == null) {
      this.ltT = new LinkedList();
    }
    return this.ltT;
  }
  
  public final boolean bgz()
  {
    return (o.bgN().bgl()) && ((o.bgN().lts == com.tencent.mm.plugin.multitalk.ui.widget.e.lvL) || (o.bgN().lts == com.tencent.mm.plugin.multitalk.ui.widget.e.lvK));
  }
  
  public final boolean by(Context paramContext)
  {
    return com.tencent.mm.p.a.by(paramContext);
  }
  
  public final boolean dL(String paramString1, String paramString2)
  {
    return o.bgK().dO(paramString1, paramString2) != null;
  }
  
  public final String dM(String paramString1, String paramString2)
  {
    paramString1 = o.bgK().dO(paramString1, paramString2);
    if (paramString1 != null) {
      return paramString1.field_inviteUserName;
    }
    return null;
  }
  
  public final int dN(String paramString1, String paramString2)
  {
    paramString1 = o.bgK().dO(paramString1, paramString2);
    if (paramString1 != null) {
      return paramString1.field_status;
    }
    return 30;
  }
  
  public final String gT(String paramString)
  {
    return r.gT(paramString);
  }
  
  public final boolean jy(String paramString)
  {
    if (this.ltR != null)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MultiTalkRoomListMsg", "removewxGroupIdInMap:" + paramString);
      this.ltR.remove(paramString);
    }
    for (;;)
    {
      return o.bgJ().jy(paramString);
      bgB();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/multitalk/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */