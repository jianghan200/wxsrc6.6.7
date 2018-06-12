package com.tencent.mm.ui.chatting.b;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.ao;
import com.tencent.mm.g.a.er;
import com.tencent.mm.g.a.jx;
import com.tencent.mm.g.a.kc;
import com.tencent.mm.g.a.rs;
import com.tencent.mm.g.c.am;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.af;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.model.au;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.chatroom.d.k;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.w;
import com.tencent.mm.ui.w.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@com.tencent.mm.ui.chatting.b.a.a(cwo=com.tencent.mm.ui.chatting.b.b.e.class)
public class e
  extends a
  implements com.tencent.mm.ab.e, m.b, com.tencent.mm.ui.chatting.b.b.e
{
  private com.tencent.mm.pluginsdk.c.b tOA = new com.tencent.mm.pluginsdk.c.b()
  {
    public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.sdk.b.b paramAnonymousb)
    {
      e.this.bAG.dismissDialog();
      if ((paramAnonymousb instanceof jx)) {
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0)) {
          if (paramAnonymousInt2 == 63512)
          {
            paramAnonymousString = com.tencent.mm.h.a.eV(paramAnonymousString);
            if (paramAnonymousString != null) {
              paramAnonymousString.a(e.this.bAG.tTq.getContext(), null, null);
            }
          }
        }
      }
      do
      {
        do
        {
          do
          {
            return;
            com.tencent.mm.ui.base.h.a(e.this.bAG.tTq.getContext(), e.this.bAG.tTq.getMMResources().getString(R.l.room_delete_member_deleted), null, e.this.bAG.tTq.getMMResources().getString(R.l.room_delete_member_got_it), false, new e.3.1(this));
            return;
            com.tencent.mm.ui.base.h.a(e.this.bAG.tTq.getContext(), e.this.bAG.tTq.getMMResources().getString(R.l.room_delete_tips_network_err), null, e.this.bAG.tTq.getMMResources().getString(R.l.app_ok), false, new e.3.2(this));
            return;
          } while ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0));
          com.tencent.mm.ui.base.h.bA(e.this.bAG.tTq.getContext(), e.this.bAG.tTq.getMMResources().getString(R.l.room_delete_member_remove_it_done));
          return;
        } while (!(paramAnonymousb instanceof kc));
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
        {
          com.tencent.mm.ui.base.h.a(e.this.bAG.tTq.getContext(), e.this.bAG.tTq.getMMResources().getString(R.l.room_delete_tips_network_err), null, e.this.bAG.tTq.getMMResources().getString(R.l.app_ok), false, new e.3.3(this));
          return;
        }
      } while ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0));
      com.tencent.mm.ui.base.h.bA(e.this.bAG.tTq.getContext(), e.this.bAG.tTq.getMMResources().getString(R.l.room_delete_member_cancel_qrcode_done));
    }
  };
  private boolean tOB = false;
  protected boolean tOv = false;
  protected Map<String, String> tOw = new HashMap();
  private com.tencent.mm.sdk.b.c tOx = new com.tencent.mm.sdk.b.c() {};
  private final j.a tOy = new e.4(this);
  private com.tencent.mm.sdk.b.c tOz = new com.tencent.mm.sdk.b.c() {};
  private boolean toR = false;
  
  private void csI()
  {
    Object localObject = (com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class);
    if (s.fq(this.bAG.getTalkerUserName()))
    {
      this.tOv = com.tencent.mm.model.m.gA(this.bAG.getTalkerUserName());
      StringBuilder localStringBuilder;
      if (this.tOv)
      {
        com.tencent.mm.model.m.c(this.bAG.getTalkerUserName(), this.tOw);
        localStringBuilder = new StringBuilder("chatroom display  ");
        if (!this.tOv) {
          break label108;
        }
      }
      label108:
      for (localObject = "show ";; localObject = "not show")
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI.ChatroomComponent", (String)localObject);
        return;
        this.tOw.clear();
        break;
      }
    }
    if (((com.tencent.mm.ui.chatting.b.b.c)localObject).cus())
    {
      this.tOv = true;
      return;
    }
    this.tOv = false;
    this.tOw.clear();
  }
  
  private void cuJ()
  {
    if (this.bAG.oLT == null) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.ChatroomComponent", "getChatroomMemberDetail() talker == null");
    }
    while (!s.fq(this.bAG.getTalkerUserName())) {
      return;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI.ChatroomComponent", "cpan[changeTalker]");
    new ag().postDelayed(new e.2(this), 1000L);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.ChatroomComponent", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " sceneType:" + paraml.getType());
    this.bAG.dismissDialog();
    if (!this.bAG.eaR) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.ChatroomComponent", "onSceneEnd fragment not foreground, return");
    }
    label76:
    label354:
    do
    {
      do
      {
        break label76;
        do
        {
          return;
        } while (!bi.ci(this.bAG.tTq.getContext()));
        Activity localActivity = this.bAG.tTq.getContext();
        int i;
        if (w.a.a(localActivity, paramInt1, paramInt2, paramString, 7)) {
          i = 1;
        }
        while (i == 0)
        {
          if ((paramInt1 != 0) || (paramInt2 != 0)) {
            break label354;
          }
          switch (paraml.getType())
          {
          default: 
            return;
          case 551: 
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.ChatroomComponent", "cpan[refresh top btn]");
            this.toR = com.tencent.mm.model.m.gC(this.bAG.getTalkerUserName());
            ((com.tencent.mm.ui.chatting.b.b.o)this.bAG.O(com.tencent.mm.ui.chatting.b.b.o.class)).cvp();
            return;
            if (w.a(localActivity, paramInt1, paramInt2, new Intent().setClass(localActivity, LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), paramString)) {
              i = 1;
            } else {
              i = 0;
            }
            break;
          }
        }
        paramString = ((k)paraml).bXQ;
      } while (paramString == null);
      paramString.cmB();
      au.HU();
      com.tencent.mm.model.c.FT().b(paramString.field_msgSvrId, paramString);
      Toast.makeText(this.bAG.tTq.getContext(), this.bAG.tTq.getMMResources().getString(R.l.invite_room_mem_ok_toast), 0).show();
      com.tencent.mm.plugin.report.service.h.mEJ.a(219L, 24L, ((k)paraml).hLg, true);
      return;
    } while (paraml.getType() != 610);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI.ChatroomComponent", "scene type:%s errCode:%s, errType:%s, errMsg:%s", new Object[] { Integer.valueOf(610), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), bi.oV(paramString) });
    com.tencent.mm.ui.base.h.b(this.bAG.tTq.getContext(), this.bAG.tTq.getMMResources().getString(R.l.invite_room_mem_err), this.bAG.tTq.getMMResources().getString(R.l.app_tip), true);
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    if (this.bAG == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.ChatroomComponent", "[onNotifyChange] mChattingContext is null!");
      return;
    }
    if (((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).cus())
    {
      this.toR = com.tencent.mm.ac.a.e.c(((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).cup());
      return;
    }
    this.toR = com.tencent.mm.model.m.gC(this.bAG.getTalkerUserName());
  }
  
  public final void a(List<String> paramList, String paramString, bd parambd)
  {
    if (s.fq(this.bAG.getTalkerUserName())) {}
    for (String str = this.bAG.getTalkerUserName();; str = "")
    {
      paramList = new k(str, paramList, paramString, parambd);
      au.DF().a(paramList, 0);
      paramString = this.bAG;
      parambd = this.bAG.tTq.getContext();
      this.bAG.tTq.getMMResources().getString(R.l.app_tip);
      paramString.d(parambd, this.bAG.tTq.getMMResources().getString(R.l.room_invite_member), new e.11(this, paramList));
      return;
    }
  }
  
  public final void aw(LinkedList<String> paramLinkedList)
  {
    au.HU();
    Object localObject1 = com.tencent.mm.model.c.Ga().ih(this.bAG.getTalkerUserName());
    if (localObject1 == null)
    {
      com.tencent.mm.ui.base.h.a(this.bAG.tTq.getContext(), this.bAG.tTq.getMMResources().getString(R.l.room_delete_quit), null, this.bAG.tTq.getMMResources().getString(R.l.room_delete_member_got_it), new e.6(this));
      return;
    }
    this.bAG.getTalkerUserName();
    LinkedList localLinkedList = new LinkedList();
    localObject1 = ((u)localObject1).Nn();
    Object localObject2 = paramLinkedList.iterator();
    Object localObject3;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (String)((Iterator)localObject2).next();
      if ((localObject1 != null) && (((List)localObject1).contains(localObject3))) {
        localLinkedList.add(localObject3);
      }
    }
    if (localLinkedList.size() == 0)
    {
      if (paramLinkedList.size() == 1)
      {
        com.tencent.mm.ui.base.h.a(this.bAG.tTq.getContext(), this.bAG.tTq.getMMResources().getString(R.l.room_delete_member_deleted), null, this.bAG.tTq.getMMResources().getString(R.l.room_delete_member_got_it), new e.7(this));
        return;
      }
      com.tencent.mm.ui.base.h.a(this.bAG.tTq.getContext(), this.bAG.tTq.getMMResources().getString(R.l.room_delete_member_all_left), null, this.bAG.tTq.getMMResources().getString(R.l.room_delete_member_got_it), new e.8(this));
      return;
    }
    if (paramLinkedList.size() == 1)
    {
      localObject2 = this.bAG.tTq.getMMResources();
      int i = R.l.room_delete_member_alert;
      localObject1 = (String)paramLinkedList.get(0);
      if ((!((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).cus()) && (!s.fq(this.bAG.getTalkerUserName()))) {
        paramLinkedList = null;
      }
      do
      {
        do
        {
          paramLinkedList = ((Resources)localObject2).getString(i, new Object[] { paramLinkedList });
          com.tencent.mm.ui.base.h.a(this.bAG.tTq.getContext(), paramLinkedList, null, this.bAG.tTq.getMMResources().getString(R.l.room_delete_member_remove_it), this.bAG.tTq.getMMResources().getString(R.l.app_cancel), true, new e.9(this, localLinkedList), new e.10(this));
          return;
          au.HU();
          localObject3 = com.tencent.mm.model.c.FR().Yg((String)localObject1);
          paramLinkedList = (LinkedList<String>)localObject1;
        } while (localObject3 == null);
        paramLinkedList = (LinkedList<String>)localObject1;
      } while ((int)((com.tencent.mm.l.a)localObject3).dhP == 0);
      if (!bi.oW(((com.tencent.mm.g.c.ai)localObject3).field_conRemark)) {
        paramLinkedList = ((com.tencent.mm.g.c.ai)localObject3).field_conRemark;
      }
      for (;;)
      {
        localObject1 = paramLinkedList;
        if (bi.oW(paramLinkedList)) {
          localObject1 = ((com.tencent.mm.g.c.ai)localObject3).field_conRemark;
        }
        paramLinkedList = (LinkedList<String>)localObject1;
        if (!bi.oW((String)localObject1)) {
          break;
        }
        paramLinkedList = ((ab)localObject3).BK();
        break;
        au.HU();
        paramLinkedList = com.tencent.mm.model.c.Ga().ih(this.bAG.getTalkerUserName());
        if (paramLinkedList == null) {
          paramLinkedList = null;
        } else {
          paramLinkedList = paramLinkedList.gT(((com.tencent.mm.g.c.ai)localObject3).field_username);
        }
      }
    }
    paramLinkedList = new Intent();
    paramLinkedList.putExtra("members", bi.c(localLinkedList, ","));
    paramLinkedList.putExtra("RoomInfo_Id", this.bAG.getTalkerUserName());
    paramLinkedList.putExtra("scene", 1);
    com.tencent.mm.bg.d.b(this.bAG.tTq.getContext(), "chatroom", ".ui.DelChatroomMemberUI", paramLinkedList);
  }
  
  public final void cpF()
  {
    if (s.fq(this.bAG.getTalkerUserName())) {
      this.toR = com.tencent.mm.model.m.gC(this.bAG.getTalkerUserName());
    }
  }
  
  public final void cpG()
  {
    this.tOB = true;
    csI();
  }
  
  public final void cpH()
  {
    Object localObject;
    if ((!s.hO(this.bAG.getTalkerUserName())) && (s.fq(this.bAG.getTalkerUserName())))
    {
      au.HU();
      localObject = com.tencent.mm.model.c.FW().Yq(this.bAG.getTalkerUserName());
      if ((localObject != null) && ((((am)localObject).field_showTips & 0x2) <= 0)) {
        break label315;
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI.ChatroomComponent", "jacks ont need auto display name because : already tips");
    }
    for (;;)
    {
      au.DF().a(610, this);
      au.DF().a(551, this);
      au.HU();
      com.tencent.mm.model.c.FR().a(this);
      au.HU();
      com.tencent.mm.model.c.Ga().c(this.tOy);
      com.tencent.mm.pluginsdk.c.b.a(jx.class.getName(), this.tOA);
      com.tencent.mm.pluginsdk.c.b.a(kc.class.getName(), this.tOA);
      com.tencent.mm.sdk.b.a.sFg.b(this.tOx);
      com.tencent.mm.sdk.b.a.sFg.b(this.tOz);
      if ((s.fq(this.bAG.getTalkerUserName())) && (com.tencent.mm.model.m.gD(this.bAG.getTalkerUserName())))
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI.ChatroomComponent", "chattingui find chatroom contact need update %s", new Object[] { this.bAG.getTalkerUserName() });
        am.a.dBr.R(this.bAG.getTalkerUserName(), "");
      }
      if ((com.tencent.mm.ay.d.eli != null) && (!this.bAG.getTalkerUserName().equals(com.tencent.mm.ay.d.eli.SD())))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.ChatroomComponent", "chatting oncreate end track %s", new Object[] { com.tencent.mm.ay.d.eli.SD() });
        localObject = new er();
        ((er)localObject).bMv.username = this.bAG.getTalkerUserName();
        com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
      }
      cuJ();
      return;
      label315:
      au.HU();
      u localu = com.tencent.mm.model.c.Ga().ih(this.bAG.getTalkerUserName());
      if ((localu == null) || (localu.Nn().size() < 20))
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI.ChatroomComponent", "jacks ont need auto display name because : member nums too few");
      }
      else if ((localu != null) && (!localu.ckP()))
      {
        com.tencent.mm.model.m.a(this.bAG.getTalkerUserName(), localu, true);
        ((am)localObject).field_showTips = 2;
        ((am)localObject).ctz = true;
        au.HU();
        com.tencent.mm.model.c.FW().a((com.tencent.mm.storage.ai)localObject, this.bAG.getTalkerUserName());
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.ChatroomComponent", "Jacks Show auto Display name tips");
        com.tencent.mm.model.l.a(this.bAG.getTalkerUserName(), null, this.bAG.tTq.getMMResources().getString(R.l.chatting_show_display_name_tips), false, "", 0);
      }
    }
  }
  
  public final void cpI()
  {
    if (!this.tOB) {
      csI();
    }
    this.tOB = false;
  }
  
  public final void cpJ() {}
  
  public final void cpK()
  {
    au.DF().b(610, this);
    au.HU();
    com.tencent.mm.model.c.FR().b(this);
    au.DF().b(551, this);
    com.tencent.mm.pluginsdk.c.b.b(jx.class.getName(), this.tOA);
    com.tencent.mm.pluginsdk.c.b.b(kc.class.getName(), this.tOA);
    if (au.HX())
    {
      au.HU();
      com.tencent.mm.model.c.Ga().d(this.tOy);
      com.tencent.mm.sdk.b.a.sFg.c(this.tOx);
      com.tencent.mm.sdk.b.a.sFg.c(this.tOz);
    }
  }
  
  public final boolean cuH()
  {
    return this.tOv;
  }
  
  public final boolean cuI()
  {
    return (this.toR) || (((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).cux());
  }
  
  public final String gT(String paramString)
  {
    com.tencent.mm.ui.chatting.b.b.c localc = (com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class);
    Object localObject = r.gU(paramString);
    if ((!localc.cur()) && (!bi.oW((String)localObject))) {}
    String str;
    do
    {
      return (String)localObject;
      if (!this.tOw.containsKey(paramString)) {
        break;
      }
      str = (String)this.tOw.get(paramString);
      localObject = str;
    } while (!bi.oW(str));
    if (localc.cur()) {
      return localc.cup().gT(paramString);
    }
    return r.gT(paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */